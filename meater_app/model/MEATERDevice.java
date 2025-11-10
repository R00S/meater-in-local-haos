package com.apptionlabs.meater_app.model;

import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.ReviewReasonType;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.CloudConnectionState;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import j6.o;
import j6.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l6.k;
import t5.j;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERDevice implements o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ANDROID_BLE_ADVERTISING_TIME_MILLIS = 15000;
    private static final int DEFAULT_LOW_BATTERY = 0;
    static final Handler mainThreadNotifier = new Handler(Looper.getMainLooper());
    protected j bleConnection;
    protected int bogusConnectionCount;
    protected int clipNumber;
    protected long connectionStartTime;
    protected Long datePaired;
    protected long deviceID;
    protected int disconnectedWith133StatusCodeCount;
    protected String firmwareRevision;
    protected long firstSeenAdvertising;
    protected boolean hasAmbientTemperature;
    protected boolean haveNotifiedUserOfEmptyBattery;
    protected boolean haveNotifiedUserOfLowBattery;
    protected boolean haveReadFirmwareRevision;
    private boolean isModified;
    protected long lastConnectionAttemptDate;
    private long lastGotProbeInfoFromDevice;
    protected long lastGotTemperatureFromProbe;
    protected long lastSeenAdvertising;
    protected long lastSeenDate;
    protected long lastShowedConnectionWarning;
    private String macAddress;
    protected MEATERLinkAddress meaterLinkAddress;
    protected MEATERDevice parentDevice;
    protected long parentDeviceID;
    protected int probeNumber;
    protected int signalLevel;
    protected int totalNumberOfDisconnections;
    protected ArrayList<MEATERDevice> childDevices = new ArrayList<>();
    protected int batteryLevel = 0;
    protected DeviceConnectionMethod connectionMethod = DeviceConnectionMethod.NONE;
    protected CloudConnectionState cloudConnectionState = CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED;
    protected DeviceConnectionState connectionState = DeviceConnectionState.OFFLINE;
    protected DeviceConnectionWarningLevel connectionWarningLevel = DeviceConnectionWarningLevel.NONE;
    protected final Runnable networkTimeoutRunnable = new Runnable() { // from class: com.apptionlabs.meater_app.model.MEATERDevice.1
        @Override // java.lang.Runnable
        public void run() {
            Handler handler = MEATERDevice.mainThreadNotifier;
            handler.removeCallbacks(MEATERDevice.this.networkTimeoutRunnable);
            if (MEATERDevice.this.connectionMethod.isBluetoothConnectionMethod()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long deviceConnectionMethodTimeout = MEATERDeviceType.getDeviceConnectionMethodTimeout(MEATERDevice.this.connectionMethod);
            MEATERDevice mEATERDevice = MEATERDevice.this;
            if (currentTimeMillis - mEATERDevice.lastSeenDate > deviceConnectionMethodTimeout) {
                mEATERDevice.attemptToReconnectIfNeeded();
            } else {
                handler.postDelayed(mEATERDevice.networkTimeoutRunnable, 1000L);
            }
        }
    };
    protected final Runnable connectionLostWarningRunnable = new Runnable() { // from class: com.apptionlabs.meater_app.model.MEATERDevice.2
        @Override // java.lang.Runnable
        public void run() {
            MEATERDevice.mainThreadNotifier.removeCallbacks(MEATERDevice.this.connectionLostWarningRunnable);
            MEATERDevice.this.showAsDisconnected();
        }
    };
    protected int ambientTemperature = Temperature.INVALID_READING;
    protected e6.c loadingState = e6.c.DeviceLoadingStateNotLoading;
    private long ongoingRecipeID = -1;

    /* renamed from: com.apptionlabs.meater_app.model.MEATERDevice$3, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$model$DeviceConnectionMethod;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType = iArr;
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.PLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.PLUS_SE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.AMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.PROBE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.BLOCK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr2 = new int[DeviceConnectionMethod.values().length];
            $SwitchMap$com$apptionlabs$meater_app$model$DeviceConnectionMethod = iArr2;
            try {
                iArr2[DeviceConnectionMethod.MEATER_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$DeviceConnectionMethod[DeviceConnectionMethod.PROBE_SIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$DeviceConnectionMethod[DeviceConnectionMethod.MEATER_CLOUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    public MEATERDevice() {
        setSignalLevel(-127);
        setChildDevices(new ArrayList<>());
        setAmbientTemperature(Temperature.INVALID_READING);
    }

    public static MEATERDevice newDevice(int i10, long j10) {
        if (i10 != -1 && j10 != 0) {
            try {
                MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(i10);
                if (typeFromProbeNumber != null) {
                    return typeFromProbeNumber.getAClass().newInstance();
                }
            } catch (IllegalAccessException | InstantiationException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private void setupTimeoutTimerIfNeeded() {
        if (this.parentDevice != null || !isRemotelyConnected()) {
            return;
        }
        Handler handler = mainThreadNotifier;
        handler.removeCallbacks(this.networkTimeoutRunnable);
        handler.postDelayed(this.networkTimeoutRunnable, 1000L);
    }

    public void addChild(MEATERDevice mEATERDevice) {
        Iterator<MEATERDevice> it = this.childDevices.iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceID() == mEATERDevice.getDeviceID()) {
                return;
            }
        }
        MEATERDevice mEATERDevice2 = mEATERDevice.parentDevice;
        if (mEATERDevice2 != null) {
            mEATERDevice2.removeChild(mEATERDevice);
        }
        this.childDevices.add(mEATERDevice);
        mEATERDevice.setParentDevice(this);
        if (isPaired()) {
            mEATERDevice.setPaired(true);
        }
    }

    public boolean appearsToBeAdvertisingBLE() {
        if (this.lastSeenAdvertising == 0 || System.currentTimeMillis() - this.lastSeenAdvertising >= 15000) {
            return false;
        }
        return true;
    }

    public boolean appearsToHaveCookInProgress() {
        Iterator<MEATERDevice> it = this.childDevices.iterator();
        while (it.hasNext()) {
            if (it.next().appearsToHaveCookInProgress()) {
                return true;
            }
        }
        return false;
    }

    public void attemptToReconnect() {
        DeviceConnectionState deviceConnectionState = this.connectionState;
        DeviceConnectionState deviceConnectionState2 = DeviceConnectionState.ATTEMPTING_RECONNECT;
        if (deviceConnectionState != deviceConnectionState2) {
            setConnectionState(deviceConnectionState2);
            Handler handler = mainThreadNotifier;
            handler.removeCallbacks(this.connectionLostWarningRunnable);
            handler.postDelayed(this.connectionLostWarningRunnable, reconnectGracePeriod() * 1000);
        }
    }

    public void attemptToReconnectIfNeeded() {
        boolean z10;
        if (!isPaired()) {
            disconnectImmediately();
            return;
        }
        boolean e02 = com.apptionlabs.meater_app.app.a.u().e0();
        if (e02 && com.apptionlabs.meater_app.app.a.u().d0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        DeviceConnectionMethod deviceConnectionMethod = this.connectionMethod;
        if ((deviceConnectionMethod == DeviceConnectionMethod.MEATER_LINK || deviceConnectionMethod == DeviceConnectionMethod.PROBE_SIM) && !e02) {
            disconnectImmediately();
        } else if (deviceConnectionMethod == DeviceConnectionMethod.MEATER_CLOUD && !z10) {
            disconnectImmediately();
        } else {
            attemptToReconnect();
        }
    }

    public boolean batteryLevelTooLowForFirmwareUpdate() {
        return hasLowBattery();
    }

    public void bleDisconnect() {
        j jVar = this.bleConnection;
        if (jVar != null) {
            jVar.n();
        }
    }

    public boolean canBeToldToUnpairChildProbes() {
        return false;
    }

    public String cannotUpdateFirmwareReason() {
        MEATERDeviceType.Companion companion = MEATERDeviceType.INSTANCE;
        if (!companion.canMEATERDeviceTypeUpdateFirmware(getMEATERDeviceType())) {
            return String.format(Locale.US, "Cannot update firmware of device: %s", getMEATERDeviceType().getShortName());
        }
        if (!companion.canMEATERDeviceTypeUpdateFirmwareUsingConnectionMethod(getMEATERDeviceType(), this.connectionMethod)) {
            return String.format(Locale.US, "Cannot update firmware of device with connection method: %s", this.connectionMethod.toString());
        }
        if (this.connectionState != DeviceConnectionState.CONNECTED) {
            return "Device is not connected";
        }
        if (appearsToHaveCookInProgress()) {
            return "Device appears to have cook in progress";
        }
        if (!FirmwareVersion.sharedInstance().haveDevFirmware(getMEATERDeviceType())) {
            return "Haven't downloaded firmware";
        }
        if (this.batteryLevel == 0) {
            return "Haven't read the battery level";
        }
        return null;
    }

    public void cleanupAfterBLEDisconnection() {
        int i10;
        j jVar = this.bleConnection;
        if (jVar != null && jVar.I()) {
            setLastGotTemperatureFromProbe(0L);
        }
        setBleConnection(null);
        if (isMEATERBlock()) {
            MEATERBlock mEATERBlock = (MEATERBlock) this;
            if (mEATERBlock.isSupportsBLEKeepAlive()) {
                mEATERBlock.setSecondaryConnectionState(DeviceConnectionState.OFFLINE);
                mEATERBlock.setSecondaryConnectionMethod(DeviceConnectionMethod.NONE);
                updateState();
            }
        }
        if (isPaired() && getShouldShowAsConnected()) {
            if (!isMEATERProbe() && (i10 = this.signalLevel) != -127 && i10 > -80) {
                k6.b.a("Nearby disconnection hidden", new Object[0]);
            }
            attemptToReconnect();
        }
        updateState();
    }

    public String description() {
        return String.format(Locale.US, "<%s %s [%d] %s>", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(this.probeNumber), getDeviceIDString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean deviceIsConnectedOverBLE() {
        if (this.parentDevice != null) {
            return false;
        }
        if (this.connectionMethod == DeviceConnectionMethod.BLUETOOTH) {
            return true;
        }
        if (!isMEATERBlock() || !((x) this).supportKeepAliveFeature()) {
            return false;
        }
        return true;
    }

    public boolean disconnectAllChildren() {
        return true;
    }

    public boolean disconnectChild() {
        return true;
    }

    public void disconnectImmediately() {
        mainThreadNotifier.removeCallbacks(this.connectionLostWarningRunnable);
        setConnectionState(DeviceConnectionState.OFFLINE);
        setMeaterLinkAddress(null);
        bleDisconnect();
    }

    public String displayName() {
        MEATERDevice mEATERDevice;
        if (isMEATERProbe() && (mEATERDevice = this.parentDevice) != null && mEATERDevice.isMEATERPlus()) {
            return this.parentDevice.displayName();
        }
        return getMEATERDeviceType().displayName(displayProbeNumber());
    }

    public int displayProbeNumber() {
        int i10 = this.probeNumber;
        if (i10 > 16 && i10 <= 20) {
            return i10 ^ 16;
        }
        return i10;
    }

    public int getAmbientTemperature() {
        return this.ambientTemperature;
    }

    @Override // j6.o
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public j getBleConnection() {
        return this.bleConnection;
    }

    public int getBogusConnectionCount() {
        return this.bogusConnectionCount;
    }

    public ArrayList<MEATERDevice> getChildDevices() {
        return this.childDevices;
    }

    public int getClipNumber() {
        return this.clipNumber;
    }

    public CloudConnectionState getCloudConnectionState() {
        return this.cloudConnectionState;
    }

    @Override // j6.o
    public DeviceConnectionMethod getConnectionMethod() {
        return this.connectionMethod;
    }

    public long getConnectionStartTime() {
        return this.connectionStartTime;
    }

    public DeviceConnectionState getConnectionState() {
        return this.connectionState;
    }

    public int getConnectionText() {
        if (isInWiFiSetupMode()) {
            return 2132018624;
        }
        if (isPaired() && isMEATERBlock() && needsFirmwareUpdate() && com.apptionlabs.meater_app.app.a.u().i0()) {
            return 2132018887;
        }
        if (isPaired() && isMEATERPlus() && needsFirmwareUpdate() && com.apptionlabs.meater_app.app.a.u().i0()) {
            return 2132018887;
        }
        if (isPaired()) {
            return 2132018375;
        }
        return 2132017488;
    }

    public String getConnectionTextAsString() {
        int i10;
        if (isInWiFiSetupMode()) {
            i10 = 2132018624;
        } else if ((isPaired() && isMEATERBlock() && needsFirmwareUpdate() && com.apptionlabs.meater_app.app.a.u().i0()) || (isPaired() && isMEATERPlus() && needsFirmwareUpdate() && com.apptionlabs.meater_app.app.a.u().i0())) {
            i10 = 2132018887;
        } else if (isPaired()) {
            i10 = 2132018375;
        } else {
            i10 = 2132017488;
        }
        return com.apptionlabs.meater_app.app.a.i().getString(i10);
    }

    public DeviceConnectionWarningLevel getConnectionWarningLevel() {
        return this.connectionWarningLevel;
    }

    public Long getDatePaired() {
        return this.datePaired;
    }

    @Override // j6.o
    public String getDebugLogDescription() {
        return getMEATERDeviceType().logDescription(getDeviceIDString(), this.probeNumber);
    }

    public DeviceConnectionMethod getDefaultConnectionMethod() {
        switch (AnonymousClass3.$SwitchMap$com$apptionlabs$meater_app$model$MEATERDeviceType[getMEATERDeviceType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (getParentDevice() != null && getParentDevice().getMEATERDeviceType().isMEATERDeviceBLEFiveCompatible()) {
                    return DeviceConnectionMethod.BLUETOOTH_FIVE;
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (isRemotelyConnected()) {
                    return DeviceConnectionMethod.BLUETOOTH_FIVE;
                }
                break;
        }
        return getConnectionMethod();
    }

    @Override // j6.o
    public long getDeviceID() {
        return this.deviceID;
    }

    @Override // j6.o
    public String getDeviceIDString() {
        return Long.toHexString(this.deviceID).toUpperCase();
    }

    @Override // j6.o
    public String getDeviceName() {
        if (Config.getInstance().DEBUG_UI_ENABLED) {
            return getMEATERDeviceType().debugName(shortDeviceIDString());
        }
        return com.apptionlabs.meater_app.app.a.i().getString(getMEATERDeviceType().getDeviceName());
    }

    public List<MEATERDevice> getDeviceProgeny() {
        return new ArrayList();
    }

    @Override // j6.o
    public DeviceType getDeviceType() {
        return DeviceType.MEATER_DEVICE;
    }

    public int getDisconnectedWith133StatusCodeCount() {
        return this.disconnectedWith133StatusCodeCount;
    }

    public String getFirmwareRevision() {
        return this.firmwareRevision;
    }

    public long getFirstSeenAdvertising() {
        return this.firstSeenAdvertising;
    }

    public int getImageResource() {
        if (isInWiFiSetupMode()) {
            return 2131230958;
        }
        int i10 = AnonymousClass3.$SwitchMap$com$apptionlabs$meater_app$model$DeviceConnectionMethod[this.connectionMethod.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return 2131230958;
                }
                return 2131230936;
            }
            return 2131230960;
        }
        return 2131230959;
    }

    public long getLastConnectionAttemptDate() {
        return this.lastConnectionAttemptDate;
    }

    public long getLastGotProbeInfoFromDevice() {
        return this.lastGotProbeInfoFromDevice;
    }

    public long getLastGotTemperatureFromProbe() {
        return this.lastGotTemperatureFromProbe;
    }

    public long getLastSeenAdvertising() {
        return this.lastSeenAdvertising;
    }

    public long getLastSeenDate() {
        return this.lastSeenDate;
    }

    public long getLastShowedConnectionWarning() {
        return this.lastShowedConnectionWarning;
    }

    public e6.c getLoadingState() {
        return this.loadingState;
    }

    public MEATERDeviceType getMEATERDeviceType() {
        MEATERDeviceType typeFromProbeNumber = MEATERDeviceType.getTypeFromProbeNumber(this.probeNumber);
        if (typeFromProbeNumber == null) {
            return MEATERDeviceType.PROBE;
        }
        return typeFromProbeNumber;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public MasterDevice getMasterDevice() {
        return k.e0().r(this);
    }

    public MEATERLinkAddress getMeaterLinkAddress() {
        return this.meaterLinkAddress;
    }

    @Override // j6.o
    public int getMediumImage() {
        return getMEATERDeviceType().getMediumImage();
    }

    @Override // j6.o
    public int getMiniImageConnected() {
        return getMEATERDeviceType().miniConnectionImage(true);
    }

    @Override // j6.o
    public int getMiniImageDisconnected() {
        return getMEATERDeviceType().miniConnectionImage(false);
    }

    @Override // j6.o
    public float getNormalizedBatteryLevel() {
        return this.batteryLevel / getMEATERDeviceType().getMaxBatteryLevel();
    }

    public long getOngoingRecipeID() {
        return this.ongoingRecipeID;
    }

    public MEATERDevice getParentDevice() {
        return this.parentDevice;
    }

    public long getParentDeviceID() {
        return this.parentDeviceID;
    }

    public o getParentOrMasterDevice() {
        if (getParentDevice() != null) {
            return getParentDevice();
        }
        return getMasterDevice();
    }

    public o getParentOrMasterOrThisDevice() {
        o parentOrMasterDevice = getParentOrMasterDevice();
        if (parentOrMasterDevice == null) {
            return ThisDevice.INSTANCE;
        }
        return parentOrMasterDevice;
    }

    public int getProbeNumber() {
        return this.probeNumber;
    }

    public long getSecondsSinceLastProbeInfo() {
        return (System.currentTimeMillis() - this.lastGotProbeInfoFromDevice) / 1000;
    }

    @Override // j6.o
    public boolean getShouldShowAsConnected() {
        DeviceConnectionState deviceConnectionState = this.connectionState;
        if (deviceConnectionState != DeviceConnectionState.CONNECTED && deviceConnectionState != DeviceConnectionState.ATTEMPTING_RECONNECT) {
            return false;
        }
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            return mEATERDevice.getShouldShowAsConnected();
        }
        return true;
    }

    public int getSignalLevel() {
        return this.signalLevel;
    }

    @Override // j6.o
    public int getSmallImage() {
        return getMEATERDeviceType().getSmallImage();
    }

    public MEATERDevice getTopParent() {
        MEATERDevice mEATERDevice = this;
        for (MEATERDevice parentDevice = getParentDevice(); parentDevice != null; parentDevice = parentDevice.getParentDevice()) {
            mEATERDevice = parentDevice;
        }
        return mEATERDevice;
    }

    public int getTotalNumberOfDisconnections() {
        return this.totalNumberOfDisconnections;
    }

    public List<Long> getTreeIds() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.deviceID));
        Iterator<MEATERDevice> it = getChildDevices().iterator();
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            arrayList.add(Long.valueOf(next.deviceID));
            Iterator<MEATERDevice> it2 = next.getChildDevices().iterator();
            while (it2.hasNext()) {
                MEATERDevice next2 = it2.next();
                arrayList.add(Long.valueOf(next2.deviceID));
                Iterator<MEATERDevice> it3 = next2.getChildDevices().iterator();
                while (it3.hasNext()) {
                    arrayList.add(Long.valueOf(it3.next().deviceID));
                }
            }
        }
        for (MEATERDevice parentDevice = getParentDevice(); parentDevice != null; parentDevice = parentDevice.getParentDevice()) {
            long j10 = parentDevice.deviceID;
            if (j10 == 0) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public boolean hasLowBattery() {
        float normalizedBatteryLevel = getNormalizedBatteryLevel();
        if (normalizedBatteryLevel > 0.0f && normalizedBatteryLevel <= getMEATERDeviceType().getNormalisedLowBatteryLevel()) {
            return true;
        }
        return false;
    }

    public boolean hasLowSignal() {
        int i10 = this.signalLevel;
        if (i10 > -127 && i10 < -100) {
            return true;
        }
        return false;
    }

    public boolean haveMASTERConnection() {
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            return mEATERDevice.haveMASTERConnection();
        }
        if (!this.connectionMethod.isBluetoothConnectionMethod() && this.connectionMethod != DeviceConnectionMethod.PROBE_SIM) {
            return false;
        }
        return true;
    }

    public boolean haveNotifiedUserOfEmptyBattery() {
        return this.haveNotifiedUserOfEmptyBattery;
    }

    public boolean haveNotifiedUserOfLowBattery() {
        return this.haveNotifiedUserOfLowBattery;
    }

    public boolean haveReadFirmwareRevision() {
        return this.haveReadFirmwareRevision;
    }

    public boolean isAmber() {
        if (getMEATERDeviceType() == MEATERDeviceType.AMBER) {
            return true;
        }
        return false;
    }

    public boolean isBlockProbe() {
        return getMEATERDeviceType().isBlockProbe();
    }

    public boolean isConnectedViaWiFi() {
        DeviceConnectionMethod deviceConnectionMethod = this.connectionMethod;
        if (deviceConnectionMethod != DeviceConnectionMethod.MEATER_LINK && deviceConnectionMethod != DeviceConnectionMethod.PROBE_SIM) {
            return false;
        }
        return true;
    }

    public boolean isHasAmbientTemperature() {
        return this.hasAmbientTemperature;
    }

    public boolean isInWiFiSetupMode() {
        return false;
    }

    public boolean isMEATERBlock() {
        return getMEATERDeviceType().isBlock();
    }

    public boolean isMEATERPlus() {
        return getMEATERDeviceType().isPlus();
    }

    public boolean isMEATERProbe() {
        return getMEATERDeviceType().isProbe();
    }

    public boolean isMaster() {
        return isMEATERBlock();
    }

    public boolean isModified() {
        return this.isModified;
    }

    public boolean isNumberOfDisconnectionsThresholdExceeded() {
        return false;
    }

    public boolean isNumberedProbe() {
        return getMEATERDeviceType().isNumberedProbe();
    }

    public boolean isOnline() {
        if (!getShouldShowAsConnected() && secondsSinceLastSeen() >= 20) {
            return false;
        }
        return true;
    }

    public boolean isPaired() {
        if (this.datePaired != null) {
            return true;
        }
        return false;
    }

    public boolean isRemoteClientConnection() {
        DeviceConnectionMethod deviceConnectionMethod = this.connectionMethod;
        if (deviceConnectionMethod != DeviceConnectionMethod.MEATER_LINK && deviceConnectionMethod != DeviceConnectionMethod.MEATER_CLOUD) {
            return false;
        }
        return true;
    }

    public boolean isRemotelyConnected() {
        if (this.connectionMethod != DeviceConnectionMethod.PROBE_SIM && !isRemoteClientConnection()) {
            return false;
        }
        return true;
    }

    public String listName() {
        String deviceName = getDeviceName();
        if (!isOnline()) {
            return deviceName + " " + com.apptionlabs.meater_app.app.a.i().getString(2132018339);
        }
        return deviceName;
    }

    public int maximumAmbientTemperature() {
        return 0;
    }

    public boolean mustFetchCookSetup() {
        if (this.lastGotTemperatureFromProbe == 0 || (System.currentTimeMillis() - this.lastGotTemperatureFromProbe) / 1000 > 30) {
            return true;
        }
        return false;
    }

    public boolean mustFetchProbeInfo() {
        if (this.childDevices.size() == 0 && getSecondsSinceLastProbeInfo() > 10) {
            return true;
        }
        return false;
    }

    public boolean mustFirmwareUpdate() {
        return false;
    }

    public boolean needsAppUpdate() {
        return false;
    }

    public boolean needsFirmwareUpdate() {
        return false;
    }

    public void notifyNumberOfDisconnectionsThresholdExceeded() {
        s6.d.H(this);
    }

    public void notifyStateUpdated() {
        LocalStorage.sharedStorage().deviceDAO().h(this);
    }

    public void notifyStateUpdatedForSelfAndChildren() {
        notifyStateUpdated();
        Iterator<MEATERDevice> it = this.childDevices.iterator();
        while (it.hasNext()) {
            it.next().notifyStateUpdated();
        }
    }

    public String numberStringForDisplay() {
        if (this.clipNumber > 0) {
            return String.valueOf(displayProbeNumber());
        }
        int i10 = this.probeNumber;
        if (i10 != 0 && i10 != 16) {
            if (i10 != 8 && i10 != 164 && i10 != 162) {
                if (i10 != 128 && i10 != 129 && i10 != 112) {
                    return String.valueOf(displayProbeNumber());
                }
                return "＋";
            }
            return "B";
        }
        return null;
    }

    protected long reconnectGracePeriod() {
        return 10L;
    }

    public Probe relatedProbe() {
        return null;
    }

    public void removeChild(MEATERDevice mEATERDevice) {
        Iterator it = new ArrayList(this.childDevices).iterator();
        while (it.hasNext()) {
            if (((MEATERDevice) it.next()).getDeviceID() == mEATERDevice.getDeviceID()) {
                this.childDevices.remove(mEATERDevice);
                mEATERDevice.setParentDevice(null);
            }
        }
    }

    public long secondsSinceLastSeen() {
        return (System.currentTimeMillis() - this.lastSeenDate) / 1000;
    }

    public void setAmbientTemperature(int i10) {
        this.ambientTemperature = i10;
        if (i10 != -1024) {
            this.hasAmbientTemperature = true;
        }
    }

    public void setBatteryLevel(int i10) {
        this.batteryLevel = i10;
    }

    public void setBleConnection(j jVar) {
        this.bleConnection = jVar;
    }

    public void setBogusConnectionCount(int i10) {
        this.bogusConnectionCount = i10;
    }

    protected void setChildDevices(ArrayList<MEATERDevice> arrayList) {
        this.childDevices = arrayList;
    }

    public void setClipNumber(int i10) {
        this.clipNumber = i10;
    }

    public void setCloudConnectionState(CloudConnectionState cloudConnectionState) {
        this.cloudConnectionState = cloudConnectionState;
    }

    public void setConnectionMethod(DeviceConnectionMethod deviceConnectionMethod) {
        if (this.connectionMethod != deviceConnectionMethod) {
            DeviceConnectionState deviceConnectionState = this.connectionState;
            DeviceConnectionState deviceConnectionState2 = DeviceConnectionState.CONNECTED;
            if (deviceConnectionState == deviceConnectionState2 && deviceConnectionMethod.isBluetoothConnectionMethod() && this.bleConnection == null) {
                setConnectionState(DeviceConnectionState.OFFLINE);
            }
            k6.b.r("%s CONN-METHOD %s -> %s", getDebugLogDescription(), this.connectionMethod.toString(), deviceConnectionMethod.toString());
            this.connectionMethod = deviceConnectionMethod;
            s6.d.c(this);
            notifyStateUpdatedForSelfAndChildren();
            mainThreadNotifier.removeCallbacks(this.networkTimeoutRunnable);
            if (!deviceConnectionMethod.isBluetoothConnectionMethod() && this.connectionState == deviceConnectionState2) {
                setupTimeoutTimerIfNeeded();
            }
        }
    }

    public void setConnectionStartTime(long j10) {
        this.connectionStartTime = j10;
    }

    public void setConnectionState(DeviceConnectionState deviceConnectionState) {
        if (this.connectionState != deviceConnectionState) {
            if (isRemotelyConnected()) {
                mainThreadNotifier.removeCallbacks(this.networkTimeoutRunnable);
            }
            k6.b.r("%s CONN-STATE %s -> %s", getDebugLogDescription(), this.connectionState.toString(), deviceConnectionState.toString());
            this.connectionState = deviceConnectionState;
            if (deviceConnectionState == DeviceConnectionState.CONNECTED) {
                if (this.parentDevice == null) {
                    s6.d.a(this, ReviewReasonType.DEVICE_CONNECTED);
                }
                mainThreadNotifier.removeCallbacks(this.connectionLostWarningRunnable);
                setupTimeoutTimerIfNeeded();
            } else if (deviceConnectionState == DeviceConnectionState.OFFLINE) {
                this.totalNumberOfDisconnections++;
                if (isNumberOfDisconnectionsThresholdExceeded()) {
                    notifyNumberOfDisconnectionsThresholdExceeded();
                }
                if (haveMASTERConnection() && y5.g.E().X()) {
                    y5.g.E().z(this);
                }
                this.lastSeenDate = 0L;
                this.lastSeenAdvertising = 0L;
                this.firstSeenAdvertising = 0L;
            }
            s6.d.c(this);
            notifyStateUpdated();
            Iterator<MEATERDevice> it = this.childDevices.iterator();
            while (it.hasNext()) {
                MEATERDevice next = it.next();
                DeviceConnectionState deviceConnectionState2 = DeviceConnectionState.OFFLINE;
                if (deviceConnectionState == deviceConnectionState2) {
                    next.setConnectionState(deviceConnectionState2);
                }
                next.notifyStateUpdated();
            }
        }
    }

    public void setConnectionWarningLevel(DeviceConnectionWarningLevel deviceConnectionWarningLevel) {
        this.connectionWarningLevel = deviceConnectionWarningLevel;
    }

    public void setDatePaired(Long l10) {
        this.datePaired = l10;
    }

    public void setDeviceID(long j10) {
        this.deviceID = j10;
    }

    public void setDisconnectedWith133StatusCodeCount(int i10) {
        this.disconnectedWith133StatusCodeCount = i10;
    }

    public void setFirmwareRevision(String str) {
        if (!Objects.equals(this.firmwareRevision, str)) {
            this.firmwareRevision = str;
            setModified(true);
        }
    }

    public void setFirstSeenAdvertising(long j10) {
        this.firstSeenAdvertising = j10;
    }

    public void setHasAmbientTemperature(boolean z10) {
        this.hasAmbientTemperature = z10;
    }

    public void setHaveNotifiedUserOfEmptyBattery(boolean z10) {
        this.haveNotifiedUserOfEmptyBattery = z10;
    }

    public void setHaveNotifiedUserOfLowBattery(boolean z10) {
        this.haveNotifiedUserOfLowBattery = z10;
    }

    public void setHaveReadFirmwareRevision(boolean z10) {
        this.haveReadFirmwareRevision = z10;
    }

    public void setLastConnectionAttemptDate(long j10) {
        this.lastConnectionAttemptDate = j10;
    }

    public void setLastGotProbeInfoFromDevice(long j10) {
        this.lastGotProbeInfoFromDevice = j10;
    }

    public void setLastGotTemperatureFromProbe(long j10) {
        this.lastGotTemperatureFromProbe = j10;
    }

    public void setLastSeenAdvertising(long j10) {
        this.lastSeenAdvertising = j10;
    }

    public void setLastSeenDate(long j10) {
        this.lastSeenDate = j10;
    }

    public void setLastShowedConnectionWarning(long j10) {
        this.lastShowedConnectionWarning = j10;
    }

    public void setLoadingState(e6.c cVar) {
        this.loadingState = cVar;
        this.isModified = true;
    }

    public void setMacAddress(String str) {
        if (!Objects.equals(this.macAddress, str)) {
            this.macAddress = str;
            setModified(true);
        }
    }

    public void setMeaterLinkAddress(MEATERLinkAddress mEATERLinkAddress) {
        this.meaterLinkAddress = mEATERLinkAddress;
    }

    public void setModified(boolean z10) {
        this.isModified = z10;
    }

    public void setOngoingRecipeID(long j10) {
        if (this.ongoingRecipeID == j10) {
            return;
        }
        k6.b.r("%s ongoingRecipeID-ID %s -> %s", getDebugLogDescription(), Long.toHexString(this.ongoingRecipeID).toUpperCase(), Long.toHexString(j10).toUpperCase());
        this.ongoingRecipeID = j10;
    }

    public void setPaired(boolean z10) {
        Long l10;
        if (isPaired() != z10) {
            if (z10) {
                l10 = Long.valueOf(System.currentTimeMillis());
            } else {
                l10 = null;
            }
            this.datePaired = l10;
            if (!z10) {
                bleDisconnect();
                setConnectionState(DeviceConnectionState.OFFLINE);
                setConnectionMethod(DeviceConnectionMethod.NONE);
                setLastGotTemperatureFromProbe(0L);
            }
            setModified(true);
        }
    }

    public void setParentDevice(MEATERDevice mEATERDevice) {
        if (this.parentDevice != mEATERDevice && mEATERDevice != this) {
            this.parentDevice = mEATERDevice;
            boolean z10 = false;
            if (mEATERDevice != null) {
                if (this.parentDeviceID != mEATERDevice.getDeviceID()) {
                    z10 = true;
                }
                setModified(z10);
                this.parentDeviceID = mEATERDevice.getDeviceID();
                return;
            }
            if (this.parentDeviceID != 0) {
                z10 = true;
            }
            setModified(z10);
            this.parentDeviceID = 0L;
        }
    }

    public void setParentDeviceID(long j10) {
        if (j10 != getDeviceID()) {
            this.parentDeviceID = j10;
        }
    }

    public void setProbeNumber(int i10) {
        this.probeNumber = i10;
    }

    public void setSignalLevel(int i10) {
        this.signalLevel = i10;
    }

    public void setTotalNumberOfDisconnections(int i10) {
        this.totalNumberOfDisconnections = i10;
    }

    public String shortDeviceIDString() {
        return String.format(Locale.US, "%04X", Long.valueOf(this.deviceID & 65535)).toUpperCase();
    }

    public void showAsDisconnected() {
        disconnectImmediately();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showOverheatWarningIfNecessary() {
        if (this.ambientTemperature >= maximumAmbientTemperature()) {
            s6.d.y(this);
        }
    }

    public void updateState() {
        setLastSeenDate(System.currentTimeMillis());
        if ((this.lastSeenDate - this.lastShowedConnectionWarning) / 1000 > 180) {
            setConnectionWarningLevel(DeviceConnectionWarningLevel.NONE);
        }
        notifyStateUpdated();
        showOverheatWarningIfNecessary();
    }
}
