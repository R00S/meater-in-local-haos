package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum NoteType {
    GENERAL(0),
    INTERNAL(1),
    AMBIENT(2),
    TIME(3);

    private final int value;

    NoteType(int i10) {
        this.value = i10;
    }

    public static NoteType fromValue(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return GENERAL;
                }
                return TIME;
            }
            return AMBIENT;
        }
        return INTERNAL;
    }

    public int getValue() {
        return this.value;
    }
}
