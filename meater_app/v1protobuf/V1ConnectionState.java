package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1ConnectionState implements WireEnum {
    CONNECTION_STATE_OFFLINE(0),
    CONNECTION_STATE_CONNECTED(1);

    public static final ProtoAdapter<V1ConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(V1ConnectionState.class);
    private final int value;

    V1ConnectionState(int i10) {
        this.value = i10;
    }

    public static V1ConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return CONNECTION_STATE_CONNECTED;
        }
        return CONNECTION_STATE_OFFLINE;
    }

    public int getValue() {
        return this.value;
    }
}
