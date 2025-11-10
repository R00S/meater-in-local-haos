package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum NetworkState implements WireEnum {
    NETWORK_STATE_NO_CONNECTION(0),
    NETWORK_STATE_CELLULAR(1),
    NETWORK_STATE_WIFI(2);

    public static final ProtoAdapter<NetworkState> ADAPTER = ProtoAdapter.newEnumAdapter(NetworkState.class);
    private final int value;

    NetworkState(int i10) {
        this.value = i10;
    }

    public static NetworkState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return NETWORK_STATE_WIFI;
            }
            return NETWORK_STATE_CELLULAR;
        }
        return NETWORK_STATE_NO_CONNECTION;
    }

    public int getValue() {
        return this.value;
    }
}
