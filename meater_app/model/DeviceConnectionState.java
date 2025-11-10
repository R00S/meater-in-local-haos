package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DeviceConnectionState {
    OFFLINE(0),
    CONNECTED(1),
    ATTEMPTING_RECONNECT(2);

    private final int value;

    DeviceConnectionState(int i10) {
        this.value = i10;
    }

    public static DeviceConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return ATTEMPTING_RECONNECT;
            }
            return CONNECTED;
        }
        return OFFLINE;
    }

    public int getValue() {
        return this.value;
    }
}
