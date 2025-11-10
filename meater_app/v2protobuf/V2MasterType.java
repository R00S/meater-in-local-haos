package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2MasterType implements WireEnum {
    V2MASTER_TYPE_BLOCK(0),
    V2MASTER_TYPE_IOS(1),
    V2MASTER_TYPE_ANDROID(2),
    V2MASTER_TYPE_PROBE_SIM(3);

    public static final ProtoAdapter<V2MasterType> ADAPTER = ProtoAdapter.newEnumAdapter(V2MasterType.class);
    private final int value;

    V2MasterType(int i10) {
        this.value = i10;
    }

    public static V2MasterType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return V2MASTER_TYPE_PROBE_SIM;
                }
                return V2MASTER_TYPE_ANDROID;
            }
            return V2MASTER_TYPE_IOS;
        }
        return V2MASTER_TYPE_BLOCK;
    }

    public int getValue() {
        return this.value;
    }
}
