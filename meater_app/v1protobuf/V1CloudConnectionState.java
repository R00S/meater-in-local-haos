package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1CloudConnectionState implements WireEnum {
    CLOUD_CONNECTION_STATE_DISABLED(0),
    CLOUD_CONNECTION_STATE_OFFLINE(1),
    CLOUD_CONNECTION_STATE_CONNECTING(2),
    CLOUD_CONNECTION_STATE_CONNECTED(3);

    public static final ProtoAdapter<V1CloudConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(V1CloudConnectionState.class);
    private final int value;

    V1CloudConnectionState(int i10) {
        this.value = i10;
    }

    public static V1CloudConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return CLOUD_CONNECTION_STATE_CONNECTED;
                }
                return CLOUD_CONNECTION_STATE_CONNECTING;
            }
            return CLOUD_CONNECTION_STATE_OFFLINE;
        }
        return CLOUD_CONNECTION_STATE_DISABLED;
    }

    public int getValue() {
        return this.value;
    }
}
