package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MEATERCloudState implements WireEnum {
    MEATER_CLOUD_STATE_DISABLED(0),
    MEATER_CLOUD_STATE_NO_CONNECTIVITY(1),
    MEATER_CLOUD_STATE_SOCKET_OPEN(2),
    MEATER_CLOUD_STATE_SOCKET_CLOSED(3);

    public static final ProtoAdapter<MEATERCloudState> ADAPTER = ProtoAdapter.newEnumAdapter(MEATERCloudState.class);
    private final int value;

    MEATERCloudState(int i10) {
        this.value = i10;
    }

    public static MEATERCloudState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return MEATER_CLOUD_STATE_SOCKET_CLOSED;
                }
                return MEATER_CLOUD_STATE_SOCKET_OPEN;
            }
            return MEATER_CLOUD_STATE_NO_CONNECTIVITY;
        }
        return MEATER_CLOUD_STATE_DISABLED;
    }

    public int getValue() {
        return this.value;
    }
}
