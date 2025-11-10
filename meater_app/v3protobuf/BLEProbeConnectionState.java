package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum BLEProbeConnectionState implements WireEnum {
    BLE_PROBE_DISCONNECTED(0),
    BLE_PROBE_CONNECTED(1);

    public static final ProtoAdapter<BLEProbeConnectionState> ADAPTER = ProtoAdapter.newEnumAdapter(BLEProbeConnectionState.class);
    private final int value;

    BLEProbeConnectionState(int i10) {
        this.value = i10;
    }

    public static BLEProbeConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return BLE_PROBE_CONNECTED;
        }
        return BLE_PROBE_DISCONNECTED;
    }

    public int getValue() {
        return this.value;
    }
}
