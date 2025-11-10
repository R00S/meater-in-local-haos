package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DeviceConnectionWarningLevel {
    NONE(0),
    ONCE(1),
    MORE_THAN_ONCE(2);

    private final int value;

    DeviceConnectionWarningLevel(int i10) {
        this.value = i10;
    }

    public static DeviceConnectionWarningLevel fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return MORE_THAN_ONCE;
            }
            return ONCE;
        }
        return NONE;
    }

    public int getValue() {
        return this.value;
    }
}
