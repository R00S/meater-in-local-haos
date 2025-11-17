package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1CookType implements WireEnum {
    RARE(0),
    MEDIUM_RARE(1),
    MEDIUM(2),
    MEDIUM_WELL(3),
    WELL_DONE(4),
    SMOKE(5),
    USDA(6),
    NUM_OF_COOK_TYPES(7),
    EOF_COOK(-1);

    public static final ProtoAdapter<V1CookType> ADAPTER = ProtoAdapter.newEnumAdapter(V1CookType.class);
    private final int value;

    V1CookType(int i10) {
        this.value = i10;
    }

    public static V1CookType fromValue(int i10) {
        switch (i10) {
            case -1:
                return EOF_COOK;
            case 0:
                return RARE;
            case 1:
                return MEDIUM_RARE;
            case 2:
                return MEDIUM;
            case 3:
                return MEDIUM_WELL;
            case 4:
                return WELL_DONE;
            case 5:
                return SMOKE;
            case 6:
                return USDA;
            case 7:
                return NUM_OF_COOK_TYPES;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
