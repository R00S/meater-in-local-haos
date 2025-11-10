package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1MeatType implements WireEnum {
    LAMB(0),
    POULTRY(1),
    PORK(2),
    FISH(3),
    BEEF(4),
    NUM_OF_MEAT_TYPES(5),
    EOF_MEAT(-1);

    public static final ProtoAdapter<V1MeatType> ADAPTER = ProtoAdapter.newEnumAdapter(V1MeatType.class);
    private final int value;

    V1MeatType(int i10) {
        this.value = i10;
    }

    public static V1MeatType fromValue(int i10) {
        switch (i10) {
            case -1:
                return EOF_MEAT;
            case 0:
                return LAMB;
            case 1:
                return POULTRY;
            case 2:
                return PORK;
            case 3:
                return FISH;
            case 4:
                return BEEF;
            case 5:
                return NUM_OF_MEAT_TYPES;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
