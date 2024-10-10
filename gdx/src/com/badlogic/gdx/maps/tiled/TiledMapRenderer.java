package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapRenderer;

public interface TiledMapRenderer extends MapRenderer {
    public void renderObjects(MapLayer layer);

    public void renderObject(MapObject object);

    public void renderTileLayer(TiledMapTileLayer layer);

    public void renderImageLayer(TiledMapImageLayer layer);
}
