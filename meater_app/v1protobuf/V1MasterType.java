package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1MasterType implements WireEnum {
    MASTER_TYPE_BLOCK(0),
    MASTER_TYPE_IOS(1),
    MASTER_TYPE_ANDROID(2),
    MASTER_TYPE_PROBE_SIM(3);

    public static final ProtoAdapter<V1MasterType> ADAPTER = ProtoAdapter.newEnumAdapter(V1MasterType.class);
    private final int value;

    V1MasterType(int i10) {
        this.value = i10;
    }

    public static V1MasterType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return MASTER_TYPE_PROBE_SIM;
                }
                return MASTER_TYPE_ANDROID;
            }
            return MASTER_TYPE_IOS;
        }
        return MASTER_TYPE_BLOCK;
    }

    public int getValue() {
        return this.value;
    }
}
