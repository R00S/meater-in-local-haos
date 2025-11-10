package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2ConnectionState implements WireEnum {
    V2CONNECTION_STATE_OFFLINE(0),
    V2CONNECTION_STATE_CONNECTED(1);

    public static final ProtoAdapter<V2ConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(V2ConnectionState.class);
    private final int value;

    V2ConnectionState(int i10) {
        this.value = i10;
    }

    public static V2ConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return V2CONNECTION_STATE_CONNECTED;
        }
        return V2CONNECTION_STATE_OFFLINE;
    }

    public int getValue() {
        return this.value;
    }
}
