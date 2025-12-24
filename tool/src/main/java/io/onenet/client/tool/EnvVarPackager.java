package io.onenet.client.tool;

import io.onenet.gomobile.android.Android;
import io.onenet.gomobile.android.EnvList;

public class EnvVarPackager {
    public static EnvList getEnvironmentVariables(Preferences preferences) {
        var envList = new EnvList();

        envList.put(Android.getEnvKeyONETForceRelay(), String.valueOf(preferences.isConnectionForceRelayed()));

        return envList;
    }
}
