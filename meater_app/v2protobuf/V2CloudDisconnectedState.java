package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2CloudDisconnectedState implements WireEnum {
    V2CLOUD_DISCONNECTED_STATE_NONE(0),
    V2CLOUD_DISCONNECTED_STATE_NO_ACCOUNT(1),
    V2CLOUD_DISCONNECTED_STATE_DISABLED(2),
    V2CLOUD_DISCONNECTED_STATE_NO_DEVICES(3),
    V2CLOUD_DISCONNECTED_STATE_NO_INTERNET(4),
    V2CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION(5);

    public static final ProtoAdapter<V2CloudDisconnectedState> ADAPTER = ProtoAdapter.newEnumAdapter(V2CloudDisconnectedState.class);
    private final int value;

    V2CloudDisconnectedState(int i10) {
        this.value = i10;
    }

    public static V2CloudDisconnectedState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return V2CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION;
                        }
                        return V2CLOUD_DISCONNECTED_STATE_NO_INTERNET;
                    }
                    return V2CLOUD_DISCONNECTED_STATE_NO_DEVICES;
                }
                return V2CLOUD_DISCONNECTED_STATE_DISABLED;
            }
            return V2CLOUD_DISCONNECTED_STATE_NO_ACCOUNT;
        }
        return V2CLOUD_DISCONNECTED_STATE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
