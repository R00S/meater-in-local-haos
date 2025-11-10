package com.apptionlabs.meater_app.v1protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum V1CutType implements WireEnum {
    LOIN(0),
    LEG(1),
    SHOULDER(2),
    SHANK(3),
    SIRLOIN(4),
    GROUND(5),
    BREAST(6),
    THIGH(7),
    WHOLE_CHICKEN(8),
    WHOLE_TURKEY(9),
    WHOLE_DUCK(10),
    CHOP(11),
    HAM(12),
    TENDERLOIN(13),
    BRISKET(14),
    STEAK(15),
    HALIBUT(16),
    TUNA(17),
    SALMON(18),
    RIB_EYE(19),
    PRIME_RIB(20),
    CHUCK(21),
    T_BONE(22),
    ROUND(23),
    NUM_OF_CUT_TYPES(24),
    EOF_CUT(-1);

    public static final ProtoAdapter<V1CutType> ADAPTER = ProtoAdapter.newEnumAdapter(V1CutType.class);
    private final int value;

    V1CutType(int i10) {
        this.value = i10;
    }

    public static V1CutType fromValue(int i10) {
        switch (i10) {
            case -1:
                return EOF_CUT;
            case 0:
                return LOIN;
            case 1:
                return LEG;
            case 2:
                return SHOULDER;
            case 3:
                return SHANK;
            case 4:
                return SIRLOIN;
            case 5:
                return GROUND;
            case 6:
                return BREAST;
            case 7:
                return THIGH;
            case 8:
                return WHOLE_CHICKEN;
            case 9:
                return WHOLE_TURKEY;
            case 10:
                return WHOLE_DUCK;
            case 11:
                return CHOP;
            case 12:
                return HAM;
            case 13:
                return TENDERLOIN;
            case 14:
                return BRISKET;
            case 15:
                return STEAK;
            case 16:
                return HALIBUT;
            case 17:
                return TUNA;
            case 18:
                return SALMON;
            case 19:
                return RIB_EYE;
            case 20:
                return PRIME_RIB;
            case 21:
                return CHUCK;
            case 22:
                return T_BONE;
            case 23:
                return ROUND;
            case 24:
                return NUM_OF_CUT_TYPES;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
