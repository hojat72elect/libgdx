package com.badlogic.gdx.backends.gwt;

public class GwtPermissions {
    /**
     * Returns the user permission status for a given API via the <a href="https://w3c.github.io/permissions/">Permissions API</a>
     *
     * @param permission the permission, see <a href="https://w3c.github.io/permissions/#permission-registry">w3c</a> for all
     *                   permissions
     * @param result     handler of permission result
     */
    native static public void queryPermission(String permission, GwtPermissionResult result) /*-{
		if ("permissions" in $wnd.navigator) {
			$wnd.navigator.permissions.query({
				name: permission
			}).then(function (permissionStatus) {
				if (permissionStatus.state === 'granted') {
					result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::granted()();
				} else if (permissionStatus.state === 'denied') {
					result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::denied()();
				} else if (permissionStatus.state === 'prompt') {
					result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::prompt()();
				}
				permissionStatus.onchange = function() {
					if (this.state === 'granted') {
						result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::granted()();
					} else if (this.state === 'denied') {
						result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::denied()();
					} else if (this.state === 'prompt') {
						result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::prompt()();
					}
				};
			});
		} else {
			result.@com.badlogic.gdx.backends.gwt.GwtPermissions.GwtPermissionResult::granted()();
		}
	}-*/;

    /**
     * See <a href="https://w3c.github.io/permissions/#status-of-a-permission">status-of-a-permission</a> for more information
     */
    public interface GwtPermissionResult {
        /**
         * the permission to access the feature is granted without asking the user
         */
        void granted();

        /**
         * accessing the feature is not allowed
         */
        void denied();

        /**
         * the user will be asked on permission if the feature is tried to access
         */
        void prompt();
    }
}
