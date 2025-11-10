package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MasterSubType implements WireEnum {
    MASTER_SUBTYPE_NONE(0),
    MASTER_SUBTYPE_PHONE(1),
    MASTER_SUBTYPE_TABLET(2);

    public static final ProtoAdapter<MasterSubType> ADAPTER = ProtoAdapter.newEnumAdapter(MasterSubType.class);
    private final int value;

    MasterSubType(int i10) {
        this.value = i10;
    }

    public static MasterSubType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return MASTER_SUBTYPE_TABLET;
            }
            return MASTER_SUBTYPE_PHONE;
        }
        return MASTER_SUBTYPE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
