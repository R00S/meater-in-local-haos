package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Config;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/meat/meat/classes.dex */
public final class OptionDeviceInfo {
    private static final /* synthetic */ OptionDeviceInfo[] $VALUES;
    public static final OptionDeviceInfo FIRMWARE;
    public static final OptionDeviceInfo FIRMWARE_UPDATE;
    public static final OptionDeviceInfo PROBE_NUMBER;
    public static final OptionDeviceInfo REASON;
    public static final OptionDeviceInfo WIFI_CONNECTION;
    public static final OptionDeviceInfo WIFI_SETTINGS;
    final boolean clickableDefault;
    boolean clickableState;
    final List<MEATERDeviceType> forDevices;
    final int title;
    public static final OptionDeviceInfo APP_VERSION = new OptionDeviceInfo("APP_VERSION", 0, 2132017256, false, new MEATERDeviceType[0]);
    public static final OptionDeviceInfo APP_UPDATE = new OptionDeviceInfo("APP_UPDATE", 1, 2132018889, true, new MEATERDeviceType[0]);

    private static /* synthetic */ OptionDeviceInfo[] $values() {
        return new OptionDeviceInfo[]{APP_VERSION, APP_UPDATE, PROBE_NUMBER, FIRMWARE, FIRMWARE_UPDATE, REASON, WIFI_SETTINGS, WIFI_CONNECTION};
    }

    static {
        int i10;
        MEATERDeviceType mEATERDeviceType = MEATERDeviceType.BLOCK_PROBE_ONE;
        MEATERDeviceType mEATERDeviceType2 = MEATERDeviceType.BLOCK_PROBE_TWO;
        MEATERDeviceType mEATERDeviceType3 = MEATERDeviceType.BLOCK_PROBE_THREE;
        MEATERDeviceType mEATERDeviceType4 = MEATERDeviceType.BLOCK_PROBE_FOUR;
        MEATERDeviceType mEATERDeviceType5 = MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE;
        MEATERDeviceType mEATERDeviceType6 = MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO;
        MEATERDeviceType mEATERDeviceType7 = MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE;
        MEATERDeviceType mEATERDeviceType8 = MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR;
        PROBE_NUMBER = new OptionDeviceInfo("PROBE_NUMBER", 2, 2132018471, false, mEATERDeviceType, mEATERDeviceType2, mEATERDeviceType3, mEATERDeviceType4, mEATERDeviceType5, mEATERDeviceType6, mEATERDeviceType7, mEATERDeviceType8);
        MEATERDeviceType mEATERDeviceType9 = MEATERDeviceType.PLUS;
        MEATERDeviceType mEATERDeviceType10 = MEATERDeviceType.BLOCK;
        MEATERDeviceType mEATERDeviceType11 = MEATERDeviceType.PROBE;
        MEATERDeviceType mEATERDeviceType12 = MEATERDeviceType.SECOND_GENERATION_PROBE;
        MEATERDeviceType mEATERDeviceType13 = MEATERDeviceType.SECOND_GENERATION_PLUS;
        MEATERDeviceType mEATERDeviceType14 = MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK;
        MEATERDeviceType mEATERDeviceType15 = MEATERDeviceType.PLUS_SE;
        FIRMWARE = new OptionDeviceInfo("FIRMWARE", 3, 2132017508, false, mEATERDeviceType9, mEATERDeviceType10, mEATERDeviceType11, mEATERDeviceType12, mEATERDeviceType, mEATERDeviceType2, mEATERDeviceType3, mEATERDeviceType4, mEATERDeviceType5, mEATERDeviceType6, mEATERDeviceType7, mEATERDeviceType8, mEATERDeviceType13, mEATERDeviceType14, mEATERDeviceType15);
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            i10 = 2132017409;
        } else {
            i10 = 2132018889;
        }
        FIRMWARE_UPDATE = new OptionDeviceInfo("FIRMWARE_UPDATE", 4, i10, true, mEATERDeviceType9, mEATERDeviceType10, mEATERDeviceType14, mEATERDeviceType13, mEATERDeviceType15);
        REASON = new OptionDeviceInfo("REASON", 5, 2132018495, false, new MEATERDeviceType[0]);
        WIFI_SETTINGS = new OptionDeviceInfo("WIFI_SETTINGS", 6, 2132017513, true, mEATERDeviceType10, mEATERDeviceType14);
        WIFI_CONNECTION = new OptionDeviceInfo("WIFI_CONNECTION", 7, 2132017512, true, new MEATERDeviceType[0]);
        $VALUES = $values();
    }

    private OptionDeviceInfo(String str, int i10, int i11, boolean z10, MEATERDeviceType... mEATERDeviceTypeArr) {
        ArrayList arrayList = new ArrayList();
        this.forDevices = arrayList;
        this.title = i11;
        this.clickableDefault = z10;
        this.clickableState = z10;
        if (mEATERDeviceTypeArr != null) {
            arrayList.addAll(Arrays.asList(mEATERDeviceTypeArr));
        }
    }

    public static List<OptionDeviceInfo> getOptionsForDevice(MEATERDeviceType mEATERDeviceType, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14) {
        ArrayList arrayList = new ArrayList();
        for (OptionDeviceInfo optionDeviceInfo : values()) {
            OptionDeviceInfo optionDeviceInfo2 = FIRMWARE_UPDATE;
            if ((optionDeviceInfo != optionDeviceInfo2 || str == null) && (optionDeviceInfo != APP_UPDATE || z11)) {
                if (optionDeviceInfo == REASON && str != null) {
                    arrayList.add(optionDeviceInfo);
                } else if (optionDeviceInfo == APP_VERSION && mEATERDeviceType == null) {
                    arrayList.add(optionDeviceInfo);
                } else if ((z14 && optionDeviceInfo == WIFI_CONNECTION) || (optionDeviceInfo.forDevices.contains(mEATERDeviceType) && ((optionDeviceInfo != optionDeviceInfo2 || z10) && ((optionDeviceInfo != WIFI_SETTINGS || z12) && (optionDeviceInfo != optionDeviceInfo2 || z13))))) {
                    arrayList.add(optionDeviceInfo);
                }
            }
        }
        return arrayList;
    }

    public static OptionDeviceInfo valueOf(String str) {
        return (OptionDeviceInfo) Enum.valueOf(OptionDeviceInfo.class, str);
    }

    public static OptionDeviceInfo[] values() {
        return (OptionDeviceInfo[]) $VALUES.clone();
    }

    public int getId() {
        return ordinal();
    }

    public int getTitle() {
        return this.title;
    }

    public boolean isClickable() {
        return this.clickableState;
    }

    public void setClickable(boolean z10) {
        this.clickableState = z10;
    }
}
