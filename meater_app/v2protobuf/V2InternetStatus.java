package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2InternetStatus implements WireEnum {
    V2INTERNET_STATUS_NONE(0),
    V2INTERNET_STATUS_CONNECTED(1),
    V2INTERNET_STATUS_DNS_LOOKUP_FAIL(2),
    V2INTERNET_STATUS_HTTP_CONNECTION_FAIL(3),
    V2INTERNET_STATUS_HTTP_CONTENT_FAIL(4),
    V2INTERNET_STATUS_HTTP_RESPONSE_TIMEOUT_FAIL(5),
    V2INTERNET_STATUS_UNKNOWN_FAIL(6);

    public static final ProtoAdapter<V2InternetStatus> ADAPTER = ProtoAdapter.newEnumAdapter(V2InternetStatus.class);
    private final int value;

    V2InternetStatus(int i10) {
        this.value = i10;
    }

    public static V2InternetStatus fromValue(int i10) {
        switch (i10) {
            case 0:
                return V2INTERNET_STATUS_NONE;
            case 1:
                return V2INTERNET_STATUS_CONNECTED;
            case 2:
                return V2INTERNET_STATUS_DNS_LOOKUP_FAIL;
            case 3:
                return V2INTERNET_STATUS_HTTP_CONNECTION_FAIL;
            case 4:
                return V2INTERNET_STATUS_HTTP_CONTENT_FAIL;
            case 5:
                return V2INTERNET_STATUS_HTTP_RESPONSE_TIMEOUT_FAIL;
            case 6:
                return V2INTERNET_STATUS_UNKNOWN_FAIL;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
