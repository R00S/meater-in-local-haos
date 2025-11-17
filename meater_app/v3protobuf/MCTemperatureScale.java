package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum MCTemperatureScale implements WireEnum {
    TEMPERATURE_SCALE_CELSIUS(0),
    TEMPERATURE_SCALE_FAHRENHEIT(1);

    public static final ProtoAdapter<MCTemperatureScale> ADAPTER = ProtoAdapter.newEnumAdapter(MCTemperatureScale.class);
    private final int value;

    MCTemperatureScale(int i10) {
        this.value = i10;
    }

    public static MCTemperatureScale fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return TEMPERATURE_SCALE_FAHRENHEIT;
        }
        return TEMPERATURE_SCALE_CELSIUS;
    }

    public int getValue() {
        return this.value;
    }
}
