package com.apptionlabs.meater_app.data;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DevicesType {
    NONE("0", 0),
    MEATER_PROBE("MEATER Probe", 2131231239),
    MEATER_PLUS("MEATER Plus", 2131231237),
    MEATER_PLUS_SE("MEATER Plus SE", 2131231236),
    MEATER_BLOCK("MEATER Block", 2131231230),
    MEATER_PLUSV2("MEATER V2 Plus", 2131231237),
    MEATER_BLOCKV2("MEATER V2 Block", 2131231230);

    public static final String KEY = "DevicesType";
    public final int image;
    public final String title;

    DevicesType(String str, int i10) {
        this.title = str;
        this.image = i10;
    }

    public static DevicesType fromName(String str) {
        for (DevicesType devicesType : values()) {
            if (devicesType.name().equalsIgnoreCase(str)) {
                return devicesType;
            }
        }
        return NONE;
    }
}
