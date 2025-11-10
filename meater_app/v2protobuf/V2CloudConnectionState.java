package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2CloudConnectionState implements WireEnum {
    V2CLOUD_CONNECTION_STATE_DISABLED(0),
    V2CLOUD_CONNECTION_STATE_OFFLINE(1),
    V2CLOUD_CONNECTION_STATE_CONNECTING(2),
    V2CLOUD_CONNECTION_STATE_CONNECTED(3);

    public static final ProtoAdapter<V2CloudConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(V2CloudConnectionState.class);
    private final int value;

    V2CloudConnectionState(int i10) {
        this.value = i10;
    }

    public static V2CloudConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return V2CLOUD_CONNECTION_STATE_CONNECTED;
                }
                return V2CLOUD_CONNECTION_STATE_CONNECTING;
            }
            return V2CLOUD_CONNECTION_STATE_OFFLINE;
        }
        return V2CLOUD_CONNECTION_STATE_DISABLED;
    }

    public int getValue() {
        return this.value;
    }
}
