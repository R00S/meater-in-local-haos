package com.apptionlabs.meater_app.versions;

import android.content.Context;
import com.apptionlabs.meater_app.data.DevicesType;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import f8.j;
import f8.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class FirmwareVersion {
    private static FirmwareVersion sharedInstance;
    private ByteBuffer mFirmwareBlock;
    private ByteBuffer mFirmwareBlockV2;
    private ByteBuffer mFirmwarePlus;
    private ByteBuffer mFirmwarePlusSE;
    private ByteBuffer mFirmwarePlusV2;
    private Versions mVersions = new Versions();
    private boolean mFirmwaresExternallySet = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.versions.FirmwareVersion$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$data$DevicesType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice;

        static {
            int[] iArr = new int[w6.b.values().length];
            $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice = iArr;
            try {
                iArr[w6.b.f19364x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[w6.b.f19362v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[w6.b.f19363w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[w6.b.f19365y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[w6.b.f19361u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[MEATERDeviceType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType = iArr2;
            try {
                iArr2[MEATERDeviceType.PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.PLUS_SE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.AMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.PROBE.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 19;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 20;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 21;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 22;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 23;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr3 = new int[DevicesType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$data$DevicesType = iArr3;
            try {
                iArr3[DevicesType.MEATER_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$data$DevicesType[DevicesType.MEATER_PLUS_SE.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$data$DevicesType[DevicesType.MEATER_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$data$DevicesType[DevicesType.MEATER_PLUSV2.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$data$DevicesType[DevicesType.MEATER_BLOCKV2.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    public static String humanReadableProbeFirmareVersionFromString(String str) {
        String[] split = str.split("_");
        if (split.length > 0) {
            String[] split2 = split[0].split("\\.");
            if (split2.length > 2) {
                try {
                    return "v" + (Integer.parseInt(split2[2]) - 1);
                } catch (Exception e10) {
                    Log.error("FirmwareVersion", "crash....humanReadableProbeFirmareVersionFromString parsing firwarmware version " + e10.getLocalizedMessage());
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public static FirmwareVersion sharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new FirmwareVersion();
        }
        return sharedInstance;
    }

    public VersionNode firmwareForMEATERDevice(MEATERDeviceType mEATERDeviceType) {
        switch (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()]) {
            case 1:
                return this.mVersions.plus;
            case 2:
                return this.mVersions.se;
            case 3:
                return this.mVersions.block;
            case 4:
                return this.mVersions.plusV2;
            case 5:
            case 7:
                return this.mVersions.blockV2;
            case 6:
                return this.mVersions.amber;
            default:
                return null;
        }
    }

    public VersionNode firmwareForQSGMEATERDevice(w6.b bVar) {
        switch (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$qsg$data$MeaterDevice[bVar.ordinal()]) {
            case 1:
                return this.mVersions.block;
            case 2:
                return this.mVersions.plus;
            case 3:
                return this.mVersions.se;
            case 4:
            case 5:
                return this.mVersions.blockV2;
            case 6:
                return this.mVersions.plusV2;
            default:
                return null;
        }
    }

    public List<FirmwareInfo> getAllDevFirmwareVersionsAvailable(DevicesType devicesType) {
        Versions versions = this.mVersions;
        if (versions != null && versions.devFw != null) {
            int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
            if (i10 == 1) {
                return this.mVersions.devFw.plus;
            }
            if (i10 == 2) {
                return this.mVersions.devFw.se;
            }
            if (i10 == 3) {
                return this.mVersions.devFw.block;
            }
            if (i10 == 4) {
                return this.mVersions.devFw.plusV2;
            }
            if (i10 == 5) {
                return this.mVersions.devFw.blockV2;
            }
        }
        return new ArrayList();
    }

    public ByteBuffer getFirmware(DevicesType devicesType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        if (i10 == 1) {
            return this.mFirmwarePlus;
        }
        if (i10 == 2) {
            return this.mFirmwarePlusSE;
        }
        if (i10 == 3) {
            return this.mFirmwareBlock;
        }
        if (i10 == 4) {
            return this.mFirmwarePlusV2;
        }
        if (i10 != 5) {
            return null;
        }
        return this.mFirmwareBlockV2;
    }

    public String getUpdateCrc(DevicesType devicesType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    return null;
                }
                return this.mVersions.plusV2.crc;
            }
            return this.mVersions.se.crc;
        }
        return this.mVersions.plus.crc;
    }

    public String getUpdateUrl(DevicesType devicesType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return this.mVersions.blockV2.url;
                    }
                    return this.mVersions.plusV2.url;
                }
                return this.mVersions.block.url;
            }
            return this.mVersions.se.url;
        }
        return this.mVersions.plus.url;
    }

    public String getVersion(DevicesType devicesType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return this.mVersions.blockV2.version;
                    }
                    return this.mVersions.plusV2.version;
                }
                return this.mVersions.block.version;
            }
            return this.mVersions.se.version;
        }
        return this.mVersions.plus.version;
    }

    public Versions getmVersions() {
        return this.mVersions;
    }

    public String getminVersionOfMEATERDeviceToSupport(MEATERDeviceType mEATERDeviceType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
        if (i10 != 4) {
            if (i10 != 5) {
                return null;
            }
            return this.mVersions.blockV2.minVersion;
        }
        return this.mVersions.plusV2.minAppVersion;
    }

    public boolean haveDevFirmware(MEATERDeviceType mEATERDeviceType) {
        DevFirmwareVersions devFirmwareVersions;
        DevFirmwareVersions devFirmwareVersions2;
        DevFirmwareVersions devFirmwareVersions3;
        DevFirmwareVersions devFirmwareVersions4;
        DevFirmwareVersions devFirmwareVersions5;
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return true;
                        }
                        Versions versions = this.mVersions;
                        if (versions == null || (devFirmwareVersions5 = versions.devFw) == null || devFirmwareVersions5.blockV2.size() <= 0) {
                            return false;
                        }
                        return true;
                    }
                    Versions versions2 = this.mVersions;
                    if (versions2 == null || (devFirmwareVersions4 = versions2.devFw) == null || devFirmwareVersions4.plusV2.size() <= 0) {
                        return false;
                    }
                    return true;
                }
                Versions versions3 = this.mVersions;
                if (versions3 == null || (devFirmwareVersions3 = versions3.devFw) == null || devFirmwareVersions3.block.size() <= 0) {
                    return false;
                }
                return true;
            }
            Versions versions4 = this.mVersions;
            if (versions4 == null || (devFirmwareVersions2 = versions4.devFw) == null || devFirmwareVersions2.se.size() <= 0) {
                return false;
            }
            return true;
        }
        Versions versions5 = this.mVersions;
        if (versions5 == null || (devFirmwareVersions = versions5.devFw) == null || devFirmwareVersions.plus.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean initFromCache(Context context) {
        Versions c10 = j.c(context);
        if (c10 != null) {
            this.mFirmwaresExternallySet = false;
            ByteBuffer a10 = j.a(context, j.b(c10.plus.url));
            ByteBuffer a11 = j.a(context, j.b(c10.se.url));
            ByteBuffer a12 = j.a(context, j.b(c10.plusV2.url));
            ByteBuffer a13 = j.a(context, j.b(c10.block.url));
            ByteBuffer a14 = j.a(context, j.b(c10.blockV2.url));
            if (a10 != null && a13 != null) {
                this.mVersions = c10;
                this.mFirmwarePlus = a10;
                this.mFirmwarePlusSE = a11;
                this.mFirmwarePlusV2 = a12;
                this.mFirmwareBlock = a13;
                this.mFirmwareBlockV2 = a14;
                return true;
            }
        }
        return false;
    }

    public boolean isFirmwaresExternallySet() {
        return this.mFirmwaresExternallySet;
    }

    public boolean meetsMinimumVersionRequirement(String str, String str2) {
        if (str2 == null || l0.d(str2, str) > 0) {
            return false;
        }
        return true;
    }

    public boolean mustUpdateAppBeforeConnectingToDevice(MEATERDevice mEATERDevice) {
        String str;
        VersionNode firmwareForMEATERDevice = firmwareForMEATERDevice(mEATERDevice.getMEATERDeviceType());
        if (firmwareForMEATERDevice != null) {
            str = firmwareForMEATERDevice.minAppVersion;
        } else {
            str = null;
        }
        return mustUpdateAppBeforeUpdatingToFirmware(str);
    }

    public boolean mustUpdateAppBeforeConnectingToQSGDeviceType(w6.b bVar) {
        String str;
        if (bVar == w6.b.f19359s) {
            return false;
        }
        VersionNode firmwareForQSGMEATERDevice = firmwareForQSGMEATERDevice(bVar);
        if (firmwareForQSGMEATERDevice != null && (str = firmwareForQSGMEATERDevice.minVersion) != null) {
            return mustUpdateAppBeforeUpdatingToDeviceFirmware(str, bVar);
        }
        return true;
    }

    public boolean mustUpdateAppBeforeUpdatingToDeviceFirmware(String str, w6.b bVar) {
        VersionNode firmwareForQSGMEATERDevice;
        if (str == null || j.c(com.apptionlabs.meater_app.app.a.i()) == null || (firmwareForQSGMEATERDevice = firmwareForQSGMEATERDevice(bVar)) == null) {
            return false;
        }
        return !meetsMinimumVersionRequirement(firmwareForQSGMEATERDevice.minVersion, str);
    }

    public boolean mustUpdateAppBeforeUpdatingToFirmware(String str) {
        if (str == null) {
            return false;
        }
        return !meetsMinimumVersionRequirement("4.3.1", str);
    }

    public boolean needForceUpdate(DevicesType devicesType, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 == 5 && l0.d(str, this.mVersions.blockV2.minVersion) < 0 : l0.d(str, this.mVersions.plusV2.minVersion) < 0 : l0.d(str, this.mVersions.block.minVersion) < 0 : l0.d(str, this.mVersions.se.minVersion) < 0 : l0.d(str, this.mVersions.plus.minVersion) < 0;
    }

    public boolean needsUpdate(DevicesType devicesType, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$data$DevicesType[devicesType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 == 5 && l0.d(str, this.mVersions.blockV2.version) < 0 : l0.d(str, this.mVersions.plusV2.version) < 0 : l0.d(str, this.mVersions.block.version) < 0 : l0.d(str, this.mVersions.se.version) < 0 : l0.d(str, this.mVersions.plus.version) < 0;
    }

    public void setVersions(Versions versions) {
        if (versions != null) {
            this.mVersions = versions;
        }
    }

    public ByteBuffer getFirmware(MEATERDeviceType mEATERDeviceType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
        if (i10 == 1) {
            return this.mFirmwarePlus;
        }
        if (i10 == 2) {
            return this.mFirmwarePlusSE;
        }
        if (i10 == 3) {
            return this.mFirmwareBlock;
        }
        if (i10 == 4) {
            return this.mFirmwarePlusV2;
        }
        if (i10 != 5) {
            return null;
        }
        return this.mFirmwareBlockV2;
    }

    public void setVersions(Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5) {
        if (versions != null) {
            this.mVersions = versions;
            this.mFirmwaresExternallySet = true;
        }
        if (byteBuffer != null) {
            this.mFirmwarePlus = byteBuffer;
        }
        if (byteBuffer2 != null) {
            this.mFirmwarePlusSE = byteBuffer2;
        }
        if (byteBuffer3 != null) {
            this.mFirmwarePlusV2 = byteBuffer3;
        }
        if (byteBuffer4 != null) {
            this.mFirmwareBlock = byteBuffer4;
        }
        if (byteBuffer5 != null) {
            this.mFirmwareBlockV2 = byteBuffer5;
        }
    }

    public boolean needForceUpdate(MEATERDeviceType mEATERDeviceType, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 == 5 && l0.d(str, this.mVersions.blockV2.minVersion) < 0 : l0.d(str, this.mVersions.plusV2.minVersion) < 0 : l0.d(str, this.mVersions.block.minVersion) < 0 : l0.d(str, this.mVersions.se.minVersion) < 0 : l0.d(str, this.mVersions.plus.minVersion) < 0;
    }

    public boolean needsUpdate(MEATERDeviceType mEATERDeviceType, String str) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 == 5 && l0.d(str, this.mVersions.blockV2.version) < 0 : l0.d(str, this.mVersions.plusV2.version) < 0 : l0.d(str, this.mVersions.block.version) < 0 : l0.d(str, this.mVersions.se.version) < 0 : l0.d(str, this.mVersions.plus.version) < 0;
    }

    public List<FirmwareInfo> getAllDevFirmwareVersionsAvailable(MEATERDeviceType mEATERDeviceType) {
        Versions versions = this.mVersions;
        if (versions != null && versions.devFw != null) {
            int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[mEATERDeviceType.ordinal()];
            if (i10 == 1) {
                return this.mVersions.devFw.plus;
            }
            if (i10 == 2) {
                return this.mVersions.devFw.se;
            }
            if (i10 == 3) {
                return this.mVersions.devFw.block;
            }
            if (i10 == 4) {
                return this.mVersions.devFw.plusV2;
            }
            if (i10 == 5) {
                return this.mVersions.devFw.blockV2;
            }
        }
        return new ArrayList();
    }
}
