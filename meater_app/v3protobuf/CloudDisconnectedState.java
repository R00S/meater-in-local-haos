package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum CloudDisconnectedState implements WireEnum {
    CLOUD_DISCONNECTED_STATE_NONE(0),
    CLOUD_DISCONNECTED_STATE_NO_ACCOUNT(1),
    CLOUD_DISCONNECTED_STATE_DISABLED(2),
    CLOUD_DISCONNECTED_STATE_NO_DEVICES(3),
    CLOUD_DISCONNECTED_STATE_NO_INTERNET(4),
    CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION(5);

    public static final ProtoAdapter<CloudDisconnectedState> ADAPTER = ProtoAdapter.newEnumAdapter(CloudDisconnectedState.class);
    private final int value;

    CloudDisconnectedState(int i10) {
        this.value = i10;
    }

    public static CloudDisconnectedState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION;
                        }
                        return CLOUD_DISCONNECTED_STATE_NO_INTERNET;
                    }
                    return CLOUD_DISCONNECTED_STATE_NO_DEVICES;
                }
                return CLOUD_DISCONNECTED_STATE_DISABLED;
            }
            return CLOUD_DISCONNECTED_STATE_NO_ACCOUNT;
        }
        return CLOUD_DISCONNECTED_STATE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
