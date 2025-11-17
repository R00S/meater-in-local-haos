package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Log;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DeviceFirmwareVersion {

    /* renamed from: v1, reason: collision with root package name */
    @gg.a
    private final int f9610v1;

    /* renamed from: v2, reason: collision with root package name */
    @gg.a
    private final int f9611v2;

    /* renamed from: v3, reason: collision with root package name */
    @gg.a
    private final int f9612v3;

    /* renamed from: v4, reason: collision with root package name */
    @gg.a
    private final int f9613v4;

    public DeviceFirmwareVersion(int i10, int i11, int i12, int i13) {
        this.f9610v1 = i10;
        this.f9611v2 = i11;
        this.f9612v3 = i12;
        this.f9613v4 = i13;
    }

    public static DeviceFirmwareVersion fromString(String str) {
        int i10;
        if (!str.startsWith(".")) {
            String[] split = str.split("\\|");
            if (split.length >= 1) {
                String[] split2 = split[split.length - 1].split("\\.");
                if (split2.length >= 2) {
                    int i11 = 0;
                    try {
                        int parseInt = Integer.parseInt(split2[0]);
                        int parseInt2 = Integer.parseInt(split2[1]);
                        if (split2.length >= 3) {
                            i10 = Integer.parseInt(split2[2]);
                        } else {
                            i10 = 0;
                        }
                        if (split2.length >= 4) {
                            i11 = Integer.parseInt(split2[3]);
                        }
                        return new DeviceFirmwareVersion(parseInt, parseInt2, i10, i11);
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String probeVersionDisplayStringFromFirmwareRevision(String str) {
        String[] split = str.split("_");
        if (split.length > 0) {
            String[] split2 = split[0].split("\\.");
            if (split2.length > 2) {
                try {
                    return "v" + (Integer.parseInt(split2[2]) - 1);
                } catch (Exception e10) {
                    Log.error("DeviceFirmwareVersion", "crash....probeVersionDisplayStringFromFirmwareRevision parsing firwarmware version " + e10.getLocalizedMessage());
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public boolean isInvalid() {
        if (this.f9610v1 == 0 && this.f9611v2 == 0 && this.f9612v3 == 0 && this.f9613v4 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOlderThan(DeviceFirmwareVersion deviceFirmwareVersion) {
        int i10 = this.f9610v1;
        int i11 = deviceFirmwareVersion.f9610v1;
        if (i10 != i11) {
            if (i10 <= i11) {
                return true;
            }
            return false;
        }
        int i12 = this.f9611v2;
        int i13 = deviceFirmwareVersion.f9611v2;
        if (i12 != i13) {
            if (i12 <= i13) {
                return true;
            }
            return false;
        }
        int i14 = this.f9612v3;
        int i15 = deviceFirmwareVersion.f9612v3;
        if (i14 != i15) {
            if (i14 <= i15) {
                return true;
            }
            return false;
        }
        int i16 = this.f9613v4;
        int i17 = deviceFirmwareVersion.f9613v4;
        if (i16 != i17 && i16 <= i17) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + this.f9610v1 + "." + this.f9611v2 + "." + this.f9612v3 + "." + this.f9613v4;
    }
}
