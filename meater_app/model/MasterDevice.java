package com.apptionlabs.meater_app.model;

import c6.h;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v1protobuf.V1CloudConnectionState;
import com.apptionlabs.meater_app.v1protobuf.V1ConnectionState;
import com.apptionlabs.meater_app.v1protobuf.V1MLProbe;
import com.apptionlabs.meater_app.v1protobuf.V1MasterMessage;
import com.apptionlabs.meater_app.v1protobuf.V1MasterType;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import com.apptionlabs.meater_app.v3protobuf.MLDevice;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterStatus;
import com.apptionlabs.meater_app.v3protobuf.MasterSubType;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import f8.l0;
import j6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MasterDevice implements o, j6.g, j6.c {
    private String appVersion;
    private String cloudEmailAddress;
    private long deviceID;
    private boolean isModified;
    private long lastSeen;
    private MasterType masterType;
    private MEATERLinkAddress meaterLinkAddress;
    private int rawBatteryLevel;
    private boolean hasReceivedMasterStatus = false;
    private final List<MEATERDevice> progeny = new ArrayList();
    private final List<Long> connectedDevices = new ArrayList();
    protected DeviceConnectionState connectionState = DeviceConnectionState.OFFLINE;
    private MasterSubType masterSubType = MasterSubType.MASTER_SUBTYPE_NONE;
    private CloudDisconnectedState mCloudDisconnectedState = CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT;
    private DeviceConnectionMethod deviceConnectionMethod = DeviceConnectionMethod.MEATER_LINK;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.model.MasterDevice$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1ConnectionState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType;

        static {
            int[] iArr = new int[MasterType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType = iArr;
            try {
                iArr[MasterType.MASTER_TYPE_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[MasterType.MASTER_TYPE_IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[MasterType.MASTER_TYPE_ANDROID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[MasterType.MASTER_TYPE_PROBE_SIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[V1CloudConnectionState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState = iArr2;
            try {
                iArr2[V1CloudConnectionState.CLOUD_CONNECTION_STATE_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState[V1CloudConnectionState.CLOUD_CONNECTION_STATE_CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState[V1CloudConnectionState.CLOUD_CONNECTION_STATE_OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState[V1CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[V1MasterType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType = iArr3;
            try {
                iArr3[V1MasterType.MASTER_TYPE_IOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType[V1MasterType.MASTER_TYPE_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType[V1MasterType.MASTER_TYPE_ANDROID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType[V1MasterType.MASTER_TYPE_PROBE_SIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[V1ConnectionState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1ConnectionState = iArr4;
            try {
                iArr4[V1ConnectionState.CONNECTION_STATE_OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1ConnectionState[V1ConnectionState.CONNECTION_STATE_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public MasterDevice(MasterMessage masterMessage, long j10, MEATERLinkAddress mEATERLinkAddress) {
        this.deviceID = j10;
        this.meaterLinkAddress = mEATERLinkAddress;
        update(masterMessage, j10);
    }

    private static CloudDisconnectedState disconnectedStateForLegacyCloudConnectionState(V1CloudConnectionState v1CloudConnectionState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1CloudConnectionState[v1CloudConnectionState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return null;
                }
                return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_DISABLED;
            }
            return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_INTERNET;
        }
        return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE;
    }

    private CloudDisconnectedState getDisconnectedStateFromStatusMessage(MasterStatus masterStatus) {
        CloudDisconnectedState cloudDisconnectedState;
        if (masterStatus != null && (cloudDisconnectedState = masterStatus.cloudDisconnectionState) != null) {
            return CloudDisconnectedState.fromValue(cloudDisconnectedState.getValue());
        }
        return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE;
    }

    private static MasterType masterTypeFromLegacy(V1MasterType v1MasterType) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1MasterType[v1MasterType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return MasterType.MASTER_TYPE_PROBE_SIM;
                }
                return MasterType.MASTER_TYPE_ANDROID;
            }
            return MasterType.MASTER_TYPE_BLOCK;
        }
        return MasterType.MASTER_TYPE_IOS;
    }

    public void addConnectedDevice(long j10) {
        if (!this.connectedDevices.contains(Long.valueOf(j10))) {
            this.connectedDevices.add(Long.valueOf(j10));
        }
    }

    @Override // j6.c
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // j6.o
    public int getBatteryLevel() {
        return this.rawBatteryLevel;
    }

    @Override // j6.g
    public CloudDisconnectedState getCloudDisconnectedState() {
        return this.mCloudDisconnectedState;
    }

    @Override // j6.g
    public String getCloudEmail() {
        return this.cloudEmailAddress;
    }

    public List<Long> getConnectedDevices() {
        ArrayList arrayList = new ArrayList();
        Iterator<MEATERDevice> it = h.f8879a.G().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getDeviceID()));
        }
        ArrayList arrayList2 = new ArrayList(this.connectedDevices);
        arrayList2.removeAll(arrayList);
        arrayList2.remove(Long.valueOf(this.deviceID));
        return arrayList2;
    }

    @Override // j6.o
    public DeviceConnectionMethod getConnectionMethod() {
        return this.deviceConnectionMethod;
    }

    @Override // j6.o
    public String getDebugLogDescription() {
        return String.format("<Master %s>", getDeviceIDString());
    }

    public DeviceConnectionMethod getDefaultConnectionMethod() {
        return getConnectionMethod();
    }

    @Override // j6.o
    public long getDeviceID() {
        return this.deviceID;
    }

    @Override // j6.o
    public String getDeviceIDString() {
        return l0.A(this.deviceID);
    }

    @Override // j6.o
    public String getDeviceName() {
        return com.apptionlabs.meater_app.app.a.i().getString(g6.c.a(this.masterType, this.masterSubType));
    }

    public List<MEATERDevice> getDeviceProgeny() {
        return this.progeny;
    }

    @Override // j6.o
    public DeviceType getDeviceType() {
        return DeviceType.MASTER_DEVICE;
    }

    public boolean getHasAppInstalled() {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[this.masterType.ordinal()];
        if (i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    @Override // j6.g
    public boolean getHasReceivedMasterStatus() {
        return this.hasReceivedMasterStatus;
    }

    public String getIpAddress() {
        MEATERLinkAddress mEATERLinkAddress = this.meaterLinkAddress;
        if (mEATERLinkAddress != null) {
            return mEATERLinkAddress.b();
        }
        return null;
    }

    public MEATERLinkAddress getMEATERLinkAddress() {
        return this.meaterLinkAddress;
    }

    @Override // j6.o
    public int getMediumImage() {
        if (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[this.masterType.ordinal()] != 1) {
            return 2131231246;
        }
        return MEATERDeviceType.BLOCK.getMediumImage();
    }

    @Override // j6.o
    public int getMiniImageConnected() {
        if (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[this.masterType.ordinal()] != 1) {
            return 2131231265;
        }
        return MEATERDeviceType.BLOCK.getMediumImage();
    }

    @Override // j6.o
    public int getMiniImageDisconnected() {
        if (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[this.masterType.ordinal()] != 1) {
            return 2131231266;
        }
        return MEATERDeviceType.BLOCK.getMediumImage();
    }

    @Override // j6.o
    public float getNormalizedBatteryLevel() {
        return getBatteryLevel() / 100.0f;
    }

    @Override // j6.o
    public boolean getShouldShowAsConnected() {
        boolean z10;
        if (MEATERDeviceType.getDeviceConnectionMethodTimeout(this.deviceConnectionMethod) > System.currentTimeMillis() - this.lastSeen) {
            z10 = true;
        } else {
            z10 = false;
        }
        k6.b.n("Master device show as connected " + z10, new Object[0]);
        return z10;
    }

    @Override // j6.o
    public int getSmallImage() {
        if (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MasterType[this.masterType.ordinal()] != 1) {
            return 2131231316;
        }
        return MEATERDeviceType.BLOCK.getSmallImage();
    }

    public boolean isModified() {
        return this.isModified;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setConnectedDevices(List<Long> list) {
        this.connectedDevices.clear();
        this.connectedDevices.addAll(list);
    }

    public void setConnectionMethod(DeviceConnectionMethod deviceConnectionMethod) {
        this.deviceConnectionMethod = deviceConnectionMethod;
    }

    public void setDeviceID(long j10) {
        this.deviceID = j10;
    }

    public void setLastSeen(long j10) {
        this.lastSeen = j10;
    }

    public void setMeaterLinkAddress(MEATERLinkAddress mEATERLinkAddress) {
        DeviceConnectionMethod deviceConnectionMethod;
        this.meaterLinkAddress = mEATERLinkAddress;
        if (mEATERLinkAddress == null) {
            deviceConnectionMethod = DeviceConnectionMethod.MEATER_CLOUD;
        } else {
            deviceConnectionMethod = DeviceConnectionMethod.MEATER_LINK;
        }
        setConnectionMethod(deviceConnectionMethod);
    }

    public void setModified(boolean z10) {
        this.isModified = z10;
    }

    public void update(MasterMessage masterMessage, long j10) {
        this.deviceID = j10;
        this.masterType = masterMessage.masterType;
        this.lastSeen = System.currentTimeMillis();
        for (MLDevice mLDevice : masterMessage.devices) {
            if (mLDevice.amber != null) {
                addConnectedDevice(mLDevice.identifier.longValue());
            } else if (mLDevice.block != null) {
                addConnectedDevice(mLDevice.identifier.longValue());
            } else if (mLDevice.plus != null) {
                addConnectedDevice(mLDevice.identifier.longValue());
            } else if (mLDevice.probe != null) {
                addConnectedDevice(mLDevice.identifier.longValue());
            }
        }
        if (this.meaterLinkAddress == null) {
            setConnectionMethod(DeviceConnectionMethod.MEATER_CLOUD);
        } else {
            setConnectionMethod(DeviceConnectionMethod.MEATER_LINK);
        }
    }

    public void update(V1MasterMessage v1MasterMessage) {
        k6.b.n("Master device update legacy", new Object[0]);
        this.deviceID = l0.K(v1MasterMessage.header.deviceID);
        this.masterType = masterTypeFromLegacy(v1MasterMessage.masterType);
        this.lastSeen = System.currentTimeMillis();
        this.rawBatteryLevel = v1MasterMessage.masterBatteryLevel.intValue();
        this.connectedDevices.clear();
        Iterator<V1MLProbe> it = v1MasterMessage.probes.iterator();
        while (it.hasNext()) {
            this.connectedDevices.add(it.next().probeSerialNum);
        }
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v1protobuf$V1ConnectionState[v1MasterMessage.connectionState.ordinal()];
        if (i10 == 1) {
            this.mCloudDisconnectedState = CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION;
        } else if (i10 == 2) {
            this.mCloudDisconnectedState = CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE;
        }
        this.mCloudDisconnectedState = disconnectedStateForLegacyCloudConnectionState(v1MasterMessage.cloudConnectionState);
    }

    public void update(MasterStatus masterStatus) {
        this.masterType = masterStatus.type;
        this.masterSubType = masterStatus.subType;
        this.rawBatteryLevel = masterStatus.batteryLevelPercent.intValue();
        this.lastSeen = System.currentTimeMillis();
        this.cloudEmailAddress = masterStatus.cloudEmailAddress;
        this.appVersion = masterStatus.version;
        this.mCloudDisconnectedState = getDisconnectedStateFromStatusMessage(masterStatus);
        this.hasReceivedMasterStatus = true;
    }
}
