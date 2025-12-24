package io.onenet.client.tool;

import io.onenet.gomobile.android.DNSList;

interface DNSChangeListener {
    void onChanged(DNSList dnsServers) throws Exception;
}
