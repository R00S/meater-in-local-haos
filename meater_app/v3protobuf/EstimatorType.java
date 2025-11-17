package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum EstimatorType implements WireEnum {
    DEFAULT(0);

    public static final ProtoAdapter<EstimatorType> ADAPTER = ProtoAdapter.newEnumAdapter(EstimatorType.class);
    private final int value;

    EstimatorType(int i10) {
        this.value = i10;
    }

    public static EstimatorType fromValue(int i10) {
        if (i10 != 0) {
            return null;
        }
        return DEFAULT;
    }

    public int getValue() {
        return this.value;
    }
}
