package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum CloudMQTTConnectionState {
    DISCONNECTED(0),
    CONNECTING(1),
    CONNECTED(2),
    BAD_CREDENTIALS(3);

    private final int value;

    CloudMQTTConnectionState(int i10) {
        this.value = i10;
    }

    public static CloudMQTTConnectionState fromValue(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return BAD_CREDENTIALS;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return DISCONNECTED;
    }

    public int getValue() {
        return this.value;
    }
}
