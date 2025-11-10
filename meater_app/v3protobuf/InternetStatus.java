package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum InternetStatus implements WireEnum {
    INTERNET_STATUS_NONE(0),
    INTERNET_STATUS_CONNECTED(1),
    INTERNET_STATUS_DNS_LOOKUP_FAIL(2),
    INTERNET_STATUS_HTTP_CONNECTION_FAIL(3),
    INTERNET_STATUS_HTTP_CONTENT_FAIL(4),
    INTERNET_STATUS_HTTP_RESPONSE_TIMEOUT_FAIL(5),
    INTERNET_STATUS_UNKNOWN_FAIL(6);

    public static final ProtoAdapter<InternetStatus> ADAPTER = ProtoAdapter.newEnumAdapter(InternetStatus.class);
    private final int value;

    InternetStatus(int i10) {
        this.value = i10;
    }

    public static InternetStatus fromValue(int i10) {
        switch (i10) {
            case 0:
                return INTERNET_STATUS_NONE;
            case 1:
                return INTERNET_STATUS_CONNECTED;
            case 2:
                return INTERNET_STATUS_DNS_LOOKUP_FAIL;
            case 3:
                return INTERNET_STATUS_HTTP_CONNECTION_FAIL;
            case 4:
                return INTERNET_STATUS_HTTP_CONTENT_FAIL;
            case 5:
                return INTERNET_STATUS_HTTP_RESPONSE_TIMEOUT_FAIL;
            case 6:
                return INTERNET_STATUS_UNKNOWN_FAIL;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
