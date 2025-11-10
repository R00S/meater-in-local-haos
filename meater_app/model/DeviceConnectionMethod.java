package com.apptionlabs.meater_app.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceConnectionMethod.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "isBluetoothConnectionMethod", "", "toString", "", "NONE", "BLUETOOTH", "PROBE_SIM", "MEATER_LINK", "MEATER_CLOUD", "BLUETOOTH_FIVE", "BlUE_TOOTH_FIVE_LONG_RANGE", "Companion", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class DeviceConnectionMethod {
    private static final /* synthetic */ ph.a $ENTRIES;
    private static final /* synthetic */ DeviceConnectionMethod[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final DeviceConnectionMethod NONE = new DeviceConnectionMethod("NONE", 0, 0);
    public static final DeviceConnectionMethod BLUETOOTH = new DeviceConnectionMethod("BLUETOOTH", 1, 2);
    public static final DeviceConnectionMethod PROBE_SIM = new DeviceConnectionMethod("PROBE_SIM", 2, 4);
    public static final DeviceConnectionMethod MEATER_LINK = new DeviceConnectionMethod("MEATER_LINK", 3, 8);
    public static final DeviceConnectionMethod MEATER_CLOUD = new DeviceConnectionMethod("MEATER_CLOUD", 4, 16);
    public static final DeviceConnectionMethod BLUETOOTH_FIVE = new DeviceConnectionMethod("BLUETOOTH_FIVE", 5, 32);
    public static final DeviceConnectionMethod BlUE_TOOTH_FIVE_LONG_RANGE = new DeviceConnectionMethod("BlUE_TOOTH_FIVE_LONG_RANGE", 6, 64);

    /* compiled from: DeviceConnectionMethod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod$Companion;", "", "()V", "fromValue", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "value", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final DeviceConnectionMethod fromValue(int value) {
            switch (value) {
                case 0:
                    return DeviceConnectionMethod.NONE;
                case 1:
                    return DeviceConnectionMethod.BLUETOOTH;
                case 2:
                    return DeviceConnectionMethod.PROBE_SIM;
                case 3:
                    return DeviceConnectionMethod.MEATER_LINK;
                case 4:
                    return DeviceConnectionMethod.MEATER_CLOUD;
                case 5:
                    return DeviceConnectionMethod.BLUETOOTH_FIVE;
                case 6:
                    return DeviceConnectionMethod.BlUE_TOOTH_FIVE_LONG_RANGE;
                default:
                    return null;
            }
        }
    }

    /* compiled from: DeviceConnectionMethod.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceConnectionMethod.values().length];
            try {
                iArr[DeviceConnectionMethod.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceConnectionMethod.PROBE_SIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceConnectionMethod.MEATER_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceConnectionMethod.MEATER_CLOUD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceConnectionMethod.BLUETOOTH_FIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceConnectionMethod.BlUE_TOOTH_FIVE_LONG_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceConnectionMethod.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DeviceConnectionMethod[] $values() {
        return new DeviceConnectionMethod[]{NONE, BLUETOOTH, PROBE_SIM, MEATER_LINK, MEATER_CLOUD, BLUETOOTH_FIVE, BlUE_TOOTH_FIVE_LONG_RANGE};
    }

    static {
        DeviceConnectionMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ph.b.a($values);
        INSTANCE = new Companion(null);
    }

    private DeviceConnectionMethod(String str, int i10, int i11) {
        this.value = i11;
    }

    public static final DeviceConnectionMethod fromValue(int i10) {
        return INSTANCE.fromValue(i10);
    }

    public static ph.a<DeviceConnectionMethod> getEntries() {
        return $ENTRIES;
    }

    public static DeviceConnectionMethod valueOf(String str) {
        return (DeviceConnectionMethod) Enum.valueOf(DeviceConnectionMethod.class, str);
    }

    public static DeviceConnectionMethod[] values() {
        return (DeviceConnectionMethod[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isBluetoothConnectionMethod() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 5:
            case 6:
                return true;
            case 2:
            case 3:
            case 4:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "Bluetooth";
            case 2:
                return "Probe Sim";
            case 3:
                return "MEATER Link";
            case 4:
                return "MEATER Cloud";
            case 5:
                return "Bluetooth Five";
            case 6:
                return "Bluetooth Five Long";
            default:
                return "null";
        }
    }
}
