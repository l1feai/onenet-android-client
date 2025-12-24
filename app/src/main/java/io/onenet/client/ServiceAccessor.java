package io.onenet.client;

import io.onenet.client.tool.RouteChangeListener;
import io.onenet.gomobile.android.NetworkArray;
import io.onenet.gomobile.android.PeerInfoArray;

public interface ServiceAccessor {
    // Add methods to interact with your service
    void switchConnection(boolean isConnected);
    PeerInfoArray getPeersList();

    NetworkArray getNetworks();
    void stopEngine();

    void selectRoute(String route) throws Exception;
    void deselectRoute(String route) throws Exception;

    void addRouteChangeListener(RouteChangeListener listener);
    void removeRouteChangeListener(RouteChangeListener listener);
}