package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MasterType implements WireEnum {
    MASTER_TYPE_BLOCK(0),
    MASTER_TYPE_IOS(1),
    MASTER_TYPE_ANDROID(2),
    MASTER_TYPE_PROBE_SIM(3),
    MASTER_TYPE_BLOCK_V2_2P(4),
    MASTER_TYPE_BLOCK_V2_4P(5);

    public static final ProtoAdapter<MasterType> ADAPTER = ProtoAdapter.newEnumAdapter(MasterType.class);
    private final int value;

    MasterType(int i10) {
        this.value = i10;
    }

    public static MasterType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return null;
                            }
                            return MASTER_TYPE_BLOCK_V2_4P;
                        }
                        return MASTER_TYPE_BLOCK_V2_2P;
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
