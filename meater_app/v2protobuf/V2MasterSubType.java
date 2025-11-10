package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V2MasterSubType implements WireEnum {
    V2MASTER_SUBTYPE_NONE(0),
    V2MASTER_SUBTYPE_PHONE(1),
    V2MASTER_SUBTYPE_TABLET(2);

    public static final ProtoAdapter<V2MasterSubType> ADAPTER = ProtoAdapter.newEnumAdapter(V2MasterSubType.class);
    private final int value;

    V2MasterSubType(int i10) {
        this.value = i10;
    }

    public static V2MasterSubType fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return V2MASTER_SUBTYPE_TABLET;
            }
            return V2MASTER_SUBTYPE_PHONE;
        }
        return V2MASTER_SUBTYPE_NONE;
    }

    public int getValue() {
        return this.value;
    }
}
