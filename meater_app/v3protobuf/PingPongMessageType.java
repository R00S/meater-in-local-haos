package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum PingPongMessageType implements WireEnum {
    PING(0),
    PONG(1);

    public static final ProtoAdapter<PingPongMessageType> ADAPTER = ProtoAdapter.newEnumAdapter(PingPongMessageType.class);
    private final int value;

    PingPongMessageType(int i10) {
        this.value = i10;
    }

    public static PingPongMessageType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return PONG;
        }
        return PING;
    }

    public int getValue() {
        return this.value;
    }
}
