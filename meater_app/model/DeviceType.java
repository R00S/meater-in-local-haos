package com.apptionlabs.meater_app.model;

/* loaded from: /tmp/meat/meat/classes.dex */
public enum DeviceType {
    THIS_DEVICE,
    MASTER_DEVICE,
    MEATER_DEVICE;

    public static DeviceType getDeviceType(String str) {
        for (DeviceType deviceType : values()) {
            if (deviceType.name().equalsIgnoreCase(str)) {
                return deviceType;
            }
        }
        return null;
    }
}
