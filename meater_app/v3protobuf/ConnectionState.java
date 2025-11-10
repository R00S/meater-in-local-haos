package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum ConnectionState implements WireEnum {
    CONNECTION_STATE_OFFLINE(0),
    CONNECTION_STATE_CONNECTED(1);

    public static final ProtoAdapter<ConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(ConnectionState.class);
    private final int value;

    ConnectionState(int i10) {
        this.value = i10;
    }

    public static ConnectionState fromValue(int i10) {
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
