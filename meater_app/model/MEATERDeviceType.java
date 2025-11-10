package com.apptionlabs.meater_app.model;

import android.content.Context;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import f8.l0;
import f8.z;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import wh.h0;
import wh.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MEATERDeviceType.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001[B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020\u000bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eJ\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0000J\u0006\u0010+\u001a\u00020\u000bJ\u0006\u0010,\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0000J\u0006\u0010/\u001a\u00020\u000bJ\u0006\u00100\u001a\u00020\u000bJ\u0006\u00101\u001a\u00020\u000bJ\u0006\u00102\u001a\u00020\u000bJ\u0006\u00103\u001a\u00020\u000bJ\u0016\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u00106\u001a\u00020\u000bJ\u0010\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u001eJ\u0006\u00109\u001a\u00020\u0003J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u000bJ\u0006\u0010?\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020\u0003J\u0006\u0010A\u001a\u00020\u000bJ\u0006\u0010B\u001a\u00020CR\u0019\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010j\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZ¨\u0006\\"}, d2 = {"Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "", "probeNumber", "", "(Ljava/lang/String;II)V", "aClass", "Ljava/lang/Class;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "getAClass", "()Ljava/lang/Class;", "canUpdateFirmware", "", "getCanUpdateFirmware", "()Z", "deviceName", "getDeviceName", "()I", "maxBatteryLevel", "getMaxBatteryLevel", "mediumImage", "getMediumImage", "miniImageConnected", "getMiniImageConnected", "miniImageDisconnected", "getMiniImageDisconnected", "normalisedLowBatteryLevel", "", "getNormalisedLowBatteryLevel", "()F", "shortName", "", "getShortName", "()Ljava/lang/String;", "smallImage", "getSmallImage", "canCook", "connectionMethod", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "debugName", "shortDeviceID", "displayName", "hasModeSelection", "device", "isBlock", "isBlockProbe", "isFunctionallyEquivalent", "product", "isG2Probe", "isMEATERDeviceBLEFiveCompatible", "isNumberedProbe", "isPlus", "isProbe", "logDescription", "deviceID", "mMEATERDeviceSupportsPingPongMessage", "maximumAmbientTemperatureForDevice", "firmwareRevision", "maximumInternalTemperatureForDevice", "meaterDeviceFromMasterType", "masterType", "Lcom/apptionlabs/meater_app/v3protobuf/MasterType;", "miniConnectionImage", "connected", "minimumFlareUpTemperatureForDevice", "numberOfInternalTemperatureSensorsForDevice", "supportsBLECommands", "temperatureResolutionForDevice", "Lcom/apptionlabs/meater_app/data/Temperature$DeviceTemperatureResolution;", "PROBE", "BLOCK_PROBE_ONE", "BLOCK_PROBE_TWO", "BLOCK_PROBE_THREE", "BLOCK_PROBE_FOUR", "THERMOMIX_PROBE", "TRAEGER_PROBE", "PLUS", "PLUS_SE", "BLOCK", "SECOND_GENERATION_PROBE", "SECOND_GENERATION_BLOCK_PROBE_ONE", "SECOND_GENERATION_BLOCK_PROBE_TWO", "SECOND_GENERATION_BLOCK_PROBE_THREE", "SECOND_GENERATION_BLOCK_PROBE_FOUR", "SECOND_GENERATION_THERMOMIX_PROBE", "SECOND_GENERATION_TRAEGER_PROBE", "SECOND_GENERATION_PLUS", "SECOND_GENERATION_THERMOMIX_PLUS", "SECOND_GENERATION_TRAEGER_PLUS", "SECOND_GENERATION_TWO_PROBE_BLOCK", "SECOND_GENERATION_FOUR_PROBE_BLOCK", "AMBER", "Companion", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATERDeviceType {
    private static final /* synthetic */ ph.a $ENTRIES;
    private static final /* synthetic */ MEATERDeviceType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public final int probeNumber;
    public static final MEATERDeviceType PROBE = new MEATERDeviceType("PROBE", 0, 0);
    public static final MEATERDeviceType BLOCK_PROBE_ONE = new MEATERDeviceType("BLOCK_PROBE_ONE", 1, 1);
    public static final MEATERDeviceType BLOCK_PROBE_TWO = new MEATERDeviceType("BLOCK_PROBE_TWO", 2, 2);
    public static final MEATERDeviceType BLOCK_PROBE_THREE = new MEATERDeviceType("BLOCK_PROBE_THREE", 3, 3);
    public static final MEATERDeviceType BLOCK_PROBE_FOUR = new MEATERDeviceType("BLOCK_PROBE_FOUR", 4, 4);
    public static final MEATERDeviceType THERMOMIX_PROBE = new MEATERDeviceType("THERMOMIX_PROBE", 5, 5);
    public static final MEATERDeviceType TRAEGER_PROBE = new MEATERDeviceType("TRAEGER_PROBE", 6, 6);
    public static final MEATERDeviceType PLUS = new MEATERDeviceType("PLUS", 7, 128);
    public static final MEATERDeviceType PLUS_SE = new MEATERDeviceType("PLUS_SE", 8, 129);
    public static final MEATERDeviceType BLOCK = new MEATERDeviceType("BLOCK", 9, 8);
    public static final MEATERDeviceType SECOND_GENERATION_PROBE = new MEATERDeviceType("SECOND_GENERATION_PROBE", 10, 16);
    public static final MEATERDeviceType SECOND_GENERATION_BLOCK_PROBE_ONE = new MEATERDeviceType("SECOND_GENERATION_BLOCK_PROBE_ONE", 11, 17);
    public static final MEATERDeviceType SECOND_GENERATION_BLOCK_PROBE_TWO = new MEATERDeviceType("SECOND_GENERATION_BLOCK_PROBE_TWO", 12, 18);
    public static final MEATERDeviceType SECOND_GENERATION_BLOCK_PROBE_THREE = new MEATERDeviceType("SECOND_GENERATION_BLOCK_PROBE_THREE", 13, 19);
    public static final MEATERDeviceType SECOND_GENERATION_BLOCK_PROBE_FOUR = new MEATERDeviceType("SECOND_GENERATION_BLOCK_PROBE_FOUR", 14, 20);
    public static final MEATERDeviceType SECOND_GENERATION_THERMOMIX_PROBE = new MEATERDeviceType("SECOND_GENERATION_THERMOMIX_PROBE", 15, 21);
    public static final MEATERDeviceType SECOND_GENERATION_TRAEGER_PROBE = new MEATERDeviceType("SECOND_GENERATION_TRAEGER_PROBE", 16, 22);
    public static final MEATERDeviceType SECOND_GENERATION_PLUS = new MEATERDeviceType("SECOND_GENERATION_PLUS", 17, 112);
    public static final MEATERDeviceType SECOND_GENERATION_THERMOMIX_PLUS = new MEATERDeviceType("SECOND_GENERATION_THERMOMIX_PLUS", 18, 80);
    public static final MEATERDeviceType SECOND_GENERATION_TRAEGER_PLUS = new MEATERDeviceType("SECOND_GENERATION_TRAEGER_PLUS", 19, 144);
    public static final MEATERDeviceType SECOND_GENERATION_TWO_PROBE_BLOCK = new MEATERDeviceType("SECOND_GENERATION_TWO_PROBE_BLOCK", 20, 162);
    public static final MEATERDeviceType SECOND_GENERATION_FOUR_PROBE_BLOCK = new MEATERDeviceType("SECOND_GENERATION_FOUR_PROBE_BLOCK", 21, 164);
    public static final MEATERDeviceType AMBER = new MEATERDeviceType("AMBER", 22, 64);

    /* compiled from: MEATERDeviceType.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0016"}, d2 = {"Lcom/apptionlabs/meater_app/model/MEATERDeviceType$Companion;", "", "()V", "MEATERDeviceAvailableCookDurationForBatteryLevel", "", "normalisedBatteryLevel", "", "type", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "MEATERDeviceIsSecondGeneration", "", "MEATERDeviceShouldNotConnectDireclty", "MEATERDeviceTypeHasIndependentAmbient", "canMEATERDeviceTypeUpdateFirmware", "canMEATERDeviceTypeUpdateFirmwareUsingConnectionMethod", "connectionMethod", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "getDeviceConnectionMethodTimeout", "", "method", "getTypeFromProbeNumber", "probeNumber", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {

        /* compiled from: MEATERDeviceType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: /tmp/meat/meat/classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[DeviceConnectionMethod.values().length];
                try {
                    iArr[DeviceConnectionMethod.MEATER_CLOUD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceConnectionMethod.MEATER_LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeviceConnectionMethod.BLUETOOTH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeviceConnectionMethod.BLUETOOTH_FIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeviceConnectionMethod.BlUE_TOOTH_FIVE_LONG_RANGE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DeviceConnectionMethod.PROBE_SIM.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DeviceConnectionMethod.NONE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[MEATERDeviceType.values().length];
                try {
                    iArr2[MEATERDeviceType.AMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[MEATERDeviceType.BLOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[MEATERDeviceType.PLUS.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[MEATERDeviceType.PLUS_SE.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 5;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 6;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 7;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 8;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 9;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr2[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 10;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 11;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 12;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 13;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 14;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[MEATERDeviceType.PROBE.ordinal()] = 15;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 16;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 17;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 18;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 19;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 20;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr2[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 21;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr2[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 22;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr2[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 23;
                } catch (NoSuchFieldError unused30) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        public final int MEATERDeviceAvailableCookDurationForBatteryLevel(float normalisedBatteryLevel, MEATERDeviceType type) {
            m.f(type, "type");
            switch (WhenMappings.$EnumSwitchMapping$1[type.ordinal()]) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 16:
                    if (normalisedBatteryLevel < type.getNormalisedLowBatteryLevel()) {
                        return -1;
                    }
                    double d10 = normalisedBatteryLevel;
                    if (d10 < 0.5d) {
                        return 6;
                    }
                    if (d10 < 0.6d) {
                        return 8;
                    }
                    if (d10 < 0.7d) {
                        return 10;
                    }
                    if (d10 < 0.8d) {
                        return 12;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    return -1;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final boolean MEATERDeviceIsSecondGeneration(MEATERDeviceType type) {
            int i10;
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            }
            if (i10 == 1 || i10 == 5 || i10 == 6) {
                return true;
            }
            switch (i10) {
                case 11:
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    switch (i10) {
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            return true;
                        default:
                            return false;
                    }
            }
        }

        public final boolean MEATERDeviceShouldNotConnectDireclty(MEATERDeviceType type) {
            int i10;
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            }
            switch (i10) {
                case 11:
                case 12:
                case 13:
                case 14:
                    return true;
                default:
                    return false;
            }
        }

        public final boolean MEATERDeviceTypeHasIndependentAmbient(MEATERDeviceType type) {
            int i10;
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            }
            switch (i10) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 16:
                    return true;
                case 15:
                default:
                    return false;
            }
        }

        public final boolean canMEATERDeviceTypeUpdateFirmware(MEATERDeviceType type) {
            int i10;
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
        public final boolean canMEATERDeviceTypeUpdateFirmwareUsingConnectionMethod(MEATERDeviceType type, DeviceConnectionMethod connectionMethod) {
            int i10;
            m.f(connectionMethod, "connectionMethod");
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            }
            switch (i10) {
                case 1:
                case 3:
                case 4:
                case 5:
                    if (connectionMethod == DeviceConnectionMethod.BLUETOOTH) {
                        return true;
                    }
                    return false;
                case 2:
                case 6:
                    if (connectionMethod == DeviceConnectionMethod.MEATER_LINK) {
                        return true;
                    }
                    return false;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                default:
                    return false;
            }
        }

        public final long getDeviceConnectionMethodTimeout(DeviceConnectionMethod method) {
            int i10;
            if (method == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
            }
            switch (i10) {
                case 1:
                    return z.j().h();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return 10000L;
                default:
                    return 0L;
            }
        }

        public final MEATERDeviceType getTypeFromProbeNumber(int probeNumber) {
            for (MEATERDeviceType mEATERDeviceType : MEATERDeviceType.values()) {
                if (mEATERDeviceType.probeNumber == probeNumber) {
                    return mEATERDeviceType;
                }
            }
            return null;
        }
    }

    /* compiled from: MEATERDeviceType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MEATERDeviceType.AMBER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MasterType.values().length];
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_ANDROID.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_PROBE_SIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK_V2_2P.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[MasterType.MASTER_TYPE_BLOCK_V2_4P.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ MEATERDeviceType[] $values() {
        return new MEATERDeviceType[]{PROBE, BLOCK_PROBE_ONE, BLOCK_PROBE_TWO, BLOCK_PROBE_THREE, BLOCK_PROBE_FOUR, THERMOMIX_PROBE, TRAEGER_PROBE, PLUS, PLUS_SE, BLOCK, SECOND_GENERATION_PROBE, SECOND_GENERATION_BLOCK_PROBE_ONE, SECOND_GENERATION_BLOCK_PROBE_TWO, SECOND_GENERATION_BLOCK_PROBE_THREE, SECOND_GENERATION_BLOCK_PROBE_FOUR, SECOND_GENERATION_THERMOMIX_PROBE, SECOND_GENERATION_TRAEGER_PROBE, SECOND_GENERATION_PLUS, SECOND_GENERATION_THERMOMIX_PLUS, SECOND_GENERATION_TRAEGER_PLUS, SECOND_GENERATION_TWO_PROBE_BLOCK, SECOND_GENERATION_FOUR_PROBE_BLOCK, AMBER};
    }

    static {
        MEATERDeviceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ph.b.a($values);
        INSTANCE = new Companion(null);
    }

    private MEATERDeviceType(String str, int i10, int i11) {
        this.probeNumber = i11;
    }

    public static final long getDeviceConnectionMethodTimeout(DeviceConnectionMethod deviceConnectionMethod) {
        return INSTANCE.getDeviceConnectionMethodTimeout(deviceConnectionMethod);
    }

    public static ph.a<MEATERDeviceType> getEntries() {
        return $ENTRIES;
    }

    private final int getMiniImageConnected() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 2131231267;
            case 15:
            case 16:
            case 18:
            case 19:
                return 2131231256;
            case 17:
                return 2131231263;
            case 20:
                return 2131231254;
            case 21:
            case 22:
                return 2131231261;
            case 23:
                return 2131231386;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final int getMiniImageDisconnected() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 2131231267;
            case 15:
            case 16:
            case 18:
            case 19:
                return 2131231257;
            case 17:
                return 2131231264;
            case 20:
                return 2131231255;
            case 21:
            case 22:
                return 2131231262;
            case 23:
                return 2131231386;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final MEATERDeviceType getTypeFromProbeNumber(int i10) {
        return INSTANCE.getTypeFromProbeNumber(i10);
    }

    public static MEATERDeviceType valueOf(String str) {
        return (MEATERDeviceType) Enum.valueOf(MEATERDeviceType.class, str);
    }

    public static MEATERDeviceType[] values() {
        return (MEATERDeviceType[]) $VALUES.clone();
    }

    public final boolean canCook() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 23:
                return true;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean canUpdateFirmware(DeviceConnectionMethod connectionMethod) {
        m.f(connectionMethod, "connectionMethod");
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                return false;
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
                return connectionMethod.isBluetoothConnectionMethod();
            case 20:
            case 21:
            case 22:
                if (connectionMethod != DeviceConnectionMethod.MEATER_LINK) {
                    return false;
                }
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String debugName(String shortDeviceID) {
        m.f(shortDeviceID, "shortDeviceID");
        return getShortName() + " " + shortDeviceID;
    }

    public final String displayName(int probeNumber) {
        String string;
        String string2;
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                if (probeNumber > 0) {
                    string = i10.getString(2132018145, Integer.valueOf(probeNumber));
                } else {
                    string = i10.getString(2132018143);
                }
                m.c(string);
                return string;
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
                if (probeNumber > 0) {
                    string2 = i10.getString(2132018082, Integer.valueOf(probeNumber));
                } else {
                    string2 = i10.getString(2132018081);
                }
                m.c(string2);
                return string2;
            case 6:
            case 7:
            case 13:
            case 14:
            case 18:
                String string3 = i10.getString(2132018882);
                m.e(string3, "getString(...)");
                return string3;
            case 8:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                String string4 = i10.getString(getDeviceName());
                m.e(string4, "getString(...)");
                return string4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Class<? extends MEATERDevice> getAClass() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return Probe.class;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return MEATERPlus.class;
            case 20:
            case 21:
            case 22:
                return MEATERBlock.class;
            case 23:
                return MEATERDevice.class;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean getCanUpdateFirmware() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                return false;
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getDeviceName() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2132018143;
            case 6:
            case 7:
            case 13:
            case 14:
            case 18:
            case 19:
                return 2132018882;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return 2132018460;
            case 15:
                return 2132018112;
            case 16:
                return 2132018134;
            case 17:
                return 2132018403;
            case 20:
                return 2132018079;
            case 21:
                return 2132018141;
            case 22:
                return 2132018142;
            case 23:
                return 2132017242;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getMaxBatteryLevel() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return 100;
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getMediumImage() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 2131231248;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 2131231245;
            case 15:
            case 16:
            case 18:
            case 19:
                return 2131231247;
            case 17:
                return 2131231244;
            case 20:
                return 2131231240;
            case 21:
            case 22:
                return 2131231243;
            case 23:
                return 2131231386;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final float getNormalisedLowBatteryLevel() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 0.6f;
            case 6:
            case 7:
            case 13:
            case 14:
            case 18:
                return 0.0f;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return 0.39f;
            case 15:
            case 16:
            case 17:
            case 19:
            case 23:
                return 0.3f;
            case 20:
            case 21:
            case 22:
                return 0.25f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getShortName() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "Probe";
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
                return "Block Probe";
            case 6:
            case 7:
            case 13:
            case 14:
            case 18:
                return "Unknown";
            case 8:
                return "Probe 2";
            case 15:
                return "M+";
            case 16:
                return "M+SE";
            case 17:
                return "M+2";
            case 19:
                return "M+T";
            case 20:
                return "MB";
            case 21:
                return "Pro";
            case 22:
                return "Pro XL";
            case 23:
                return "AMBER";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getSmallImage() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 2131231317;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 2131231315;
            case 15:
            case 16:
            case 18:
            case 19:
                return 2131231311;
            case 17:
                return 2131231314;
            case 20:
                return 2131231310;
            case 21:
            case 22:
                return 2131231313;
            case 23:
                return 2131231387;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean hasModeSelection(MEATERDeviceType device) {
        m.f(device, "device");
        if (isBlock() && (device == BLOCK || device == SECOND_GENERATION_BLOCK_PROBE_FOUR)) {
            return true;
        }
        return false;
    }

    public final boolean isBlock() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 23:
                return false;
            case 20:
            case 21:
            case 22:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isBlockProbe() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isFunctionallyEquivalent(MEATERDeviceType product) {
        m.f(product, "product");
        if (((!isProbe() && !isPlus()) || (!product.isProbe() && !isPlus())) && this != product) {
            return false;
        }
        return true;
    }

    public final boolean isG2Probe() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return false;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isMEATERDeviceBLEFiveCompatible() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 23:
                return false;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 18:
            case 19:
            case 21:
            case 22:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isNumberedProbe() {
        if (isProbe() && isBlockProbe()) {
            return true;
        }
        return false;
    }

    public final boolean isPlus() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return false;
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isProbe() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String logDescription(String deviceID, int probeNumber) {
        m.f(deviceID, "deviceID");
        h0 h0Var = h0.a;
        String format = String.format(Locale.US, "%s %s %s [%d]", Arrays.copyOf(new Object[]{getShortName(), Integer.valueOf(System.identityHashCode(this)), deviceID, Integer.valueOf(probeNumber)}, 4));
        m.e(format, "format(locale, format, *args)");
        return format;
    }

    public final boolean mMEATERDeviceSupportsPingPongMessage() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
                return false;
            case 21:
            case 22:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int maximumAmbientTemperatureForDevice(String firmwareRevision) {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return Temperature.fromCelsius(Temperature.MAX_AMBIENT_PROBE);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return Temperature.fromCelsius(550);
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return Temperature.fromCelsius(60);
            case 20:
                if (firmwareRevision == null && l0.d("v.3.0.2.19", firmwareRevision) == 0) {
                    return Temperature.fromCelsius(60);
                }
                return Temperature.fromCelsius(70);
            case 21:
            case 22:
                return Temperature.fromCelsius(70);
            case 23:
                return Temperature.fromCelsius(600);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int maximumInternalTemperatureForDevice() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return Temperature.fromCelsius(99);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return Temperature.fromCelsius(105);
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return Temperature.fromCelsius(0);
            case 23:
                return Temperature.fromCelsius(600);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final MEATERDeviceType meaterDeviceFromMasterType(MasterType masterType) {
        m.f(masterType, "masterType");
        switch (WhenMappings.$EnumSwitchMapping$1[masterType.ordinal()]) {
            case 1:
                return BLOCK;
            case 2:
            case 3:
            case 4:
                return PROBE;
            case 5:
                return SECOND_GENERATION_TWO_PROBE_BLOCK;
            case 6:
                return SECOND_GENERATION_FOUR_PROBE_BLOCK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int miniConnectionImage(boolean connected) {
        if (connected) {
            return getMiniImageConnected();
        }
        return getMiniImageDisconnected();
    }

    public final int minimumFlareUpTemperatureForDevice() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return Temperature.INVALID_READING;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return Temperature.fromCelsius(300);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int numberOfInternalTemperatureSensorsForDevice() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean supportsBLECommands() {
        if (isBlock() && this != BLOCK) {
            return true;
        }
        return false;
    }

    public final Temperature.DeviceTemperatureResolution temperatureResolutionForDevice() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 15:
            case 16:
            case 23:
                return Temperature.DeviceTemperatureResolution.SIXTEEN;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return Temperature.DeviceTemperatureResolution.THIRTYTWO;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
