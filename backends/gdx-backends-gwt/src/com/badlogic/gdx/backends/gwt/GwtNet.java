package com.badlogic.gdx.backends.gwt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpStatus;
import com.badlogic.gdx.net.ServerSocket;
import com.badlogic.gdx.net.ServerSocketHints;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectMap;
import com.google.gwt.http.client.Header;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class GwtNet implements Net {

    ObjectMap<HttpRequest, Request> requests;
    ObjectMap<HttpRequest, HttpResponseListener> listeners;
    GwtApplicationConfiguration config;

    public GwtNet(GwtApplicationConfiguration config) {
        this.config = config;
        requests = new ObjectMap<HttpRequest, Request>();
        listeners = new ObjectMap<HttpRequest, HttpResponseListener>();
    }

    @Override
    public void sendHttpRequest(final HttpRequest httpRequest, final HttpResponseListener httpResultListener) {
        if (httpRequest.getUrl() == null) {
            httpResultListener.failed(new GdxRuntimeException("can't process a HTTP request without URL set"));
            return;
        }

        final String method = httpRequest.getMethod();
        final String value = httpRequest.getContent();
        final boolean valueInBody = method.equalsIgnoreCase(HttpMethods.POST) || method.equals(HttpMethods.PUT);

        RequestBuilder builder;

        String url = httpRequest.getUrl();
        if (method.equalsIgnoreCase(HttpMethods.HEAD)) {
            if (value != null) {
                url += "?" + value;
            }
            builder = new RequestBuilder(RequestBuilder.HEAD, url);
        } else if (method.equalsIgnoreCase(HttpMethods.GET)) {
            if (value != null) {
                url += "?" + value;
            }
            builder = new RequestBuilder(RequestBuilder.GET, url);
        } else if (method.equalsIgnoreCase(HttpMethods.POST)) {
            builder = new RequestBuilder(RequestBuilder.POST, url);
        } else if (method.equalsIgnoreCase(HttpMethods.DELETE)) {
            if (value != null) {
                url += "?" + value;
            }
            builder = new RequestBuilder(RequestBuilder.DELETE, url);
        } else if (method.equalsIgnoreCase(HttpMethods.PUT)) {
            builder = new RequestBuilder(RequestBuilder.PUT, url);
        } else {
            throw new GdxRuntimeException("Unsupported HTTP Method");
        }

        Map<String, String> content = httpRequest.getHeaders();
        Set<String> keySet = content.keySet();
        for (String name : keySet) {
            builder.setHeader(name, content.get(name));
        }

        builder.setTimeoutMillis(httpRequest.getTimeOut());

        builder.setIncludeCredentials(httpRequest.getIncludeCredentials());

        try {
            Request request = builder.sendRequest(valueInBody ? value : null, new RequestCallback() {

                @Override
                public void onResponseReceived(Request request, Response response) {
                    if (response.getStatusCode() > 0) {
                        httpResultListener.handleHttpResponse(new HttpClientResponse(response));
                        requests.remove(httpRequest);
                        listeners.remove(httpRequest);
                    } else {
                        onError(request, new IOException("HTTP request failed"));
                    }
                }

                @Override
                public void onError(Request request, Throwable exception) {
                    httpResultListener.failed(exception);
                    requests.remove(httpRequest);
                    listeners.remove(httpRequest);
                }
            });
            requests.put(httpRequest, request);
            listeners.put(httpRequest, httpResultListener);

        } catch (Throwable e) {
            httpResultListener.failed(e);
        }

    }

    @Override
    public void cancelHttpRequest(HttpRequest httpRequest) {
        HttpResponseListener httpResponseListener = listeners.get(httpRequest);
        Request request = requests.get(httpRequest);

        if (httpResponseListener != null && request != null) {
            request.cancel();
            httpResponseListener.cancelled();
            requests.remove(httpRequest);
            listeners.remove(httpRequest);
        }
    }

    @Override
    public boolean isHttpRequestPending(HttpRequest httpRequest) {
        return listeners.get(httpRequest) != null && requests.get(httpRequest) != null;
    }

    @Override
    public ServerSocket newServerSocket(Protocol protocol, String hostname, int port, ServerSocketHints hints) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ServerSocket newServerSocket(Protocol protocol, int port, ServerSocketHints hints) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Socket newClientSocket(Protocol protocol, String host, int port, SocketHints hints) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean openURI(String URI) {
        if (config.openURLInNewWindow) {
            Window.open(URI, "_blank", null);
        } else {
            Window.Location.assign(URI);
        }
        return true;
    }

    private final class HttpClientResponse implements HttpResponse {

        private Response response;
        private HttpStatus status;

        public HttpClientResponse(Response response) {
            this.response = response;
            this.status = new HttpStatus(response.getStatusCode());
        }

        @Override
        public byte[] getResult() {
            throw new GdxRuntimeException("HttpResponse.getResult() is not available on GWT. "
                    + "Use getResultAsString() if possible, or make use of AssetDownloader class.");
        }

        @Override
        public String getResultAsString() {
            return response.getText();
        }

        @Override
        public InputStream getResultAsStream() {
            throw new GdxRuntimeException("HttpResponse.getResultAsStream() is not available on GWT. "
                    + "Use getResultAsString() if possible, or make use of AssetDownloader class.");
        }

        @Override
        public HttpStatus getStatus() {
            return status;
        }

        @Override
        public Map<String, List<String>> getHeaders() {
            Map<String, List<String>> headers = new HashMap<String, List<String>>();
            Header[] responseHeaders = response.getHeaders();
            for (int i = 0; i < responseHeaders.length; i++) {
                Header header = responseHeaders[i];
                if (header != null) {
                    String headerName = responseHeaders[i].getName();
                    List<String> headerValues = headers.get(headerName);
                    if (headerValues == null) {
                        headerValues = new ArrayList<String>();
                        headers.put(headerName, headerValues);
                    }
                    headerValues.add(responseHeaders[i].getValue());
                }
            }
            return headers;
        }

        @Override
        public String getHeader(String name) {
            return response.getHeader(name);
        }
    }

}
