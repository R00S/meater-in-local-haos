package com.apptionlabs.meater_app.model;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c6.h;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.ReviewReasonType;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.data.TemperatureSelection;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.EstimatorConfig;
import com.apptionlabs.meater_app.v3protobuf.EstimatorType;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import f8.c0;
import f8.l0;
import f8.y;
import j6.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import l6.k;
import lm.b;
import s6.i;
import t5.a1;
import t5.j;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Probe extends MEATERDevice implements z, Parcelable {
    private boolean canFireTargetAmbientTemperatureAlert;
    private long cookFinishedDate;
    private long cookID;
    private String cookName;
    private MeatCookingTemperature cookPreset;
    private Date cookStartTime;
    private ProbeEventLog eventLog;
    private AlarmState flareUpAlertState;
    private boolean haveFetchedCookSetupFromBLE;
    private boolean haveFetchedTemperatureLogFromBLE;
    private boolean haveReceivedTemperatureLogFromRemote;
    private int lastResetSource;
    private Date lastSavedToDisk;
    private long lastTemperatureLogRequestTime;
    public i localNotification;
    private MeatCut mCut;
    private int peakTemperature;
    private int[] peakTemperatures;
    private int resetCounter;
    private SavedCook savedCook;
    private int secondsDelayBeforeReady;
    private int secondsDelayBeforeResting;
    private int setupSeqNum;
    private int targetInternalTemperature;
    private int targetMaximumAmbientTemperature;
    private int targetMinimumAmbientTemperature;
    private int tempChangeBeforeReady;
    private Temperature.Temperatures_t temperatures;
    private int timeRemaining;
    private int totalTimeRemaining;
    public static final int maximumTemperatureForEstimate = Temperature.fromCelsius(90);
    private static long lastShowedNearAmbientTemperatureLimitNotification = -1;
    public static final Parcelable.Creator<Probe> CREATOR = new Parcelable.Creator<Probe>() { // from class: com.apptionlabs.meater_app.model.Probe.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Probe createFromParcel(Parcel parcel) {
            Probe probe = new Probe();
            probe.deviceID = parcel.readLong();
            probe.parentDeviceID = parcel.readLong();
            probe.setSecondsDelayBeforeResting(parcel.readInt());
            probe.setTemperatureChangeBeforeReady(parcel.readInt());
            probe.setSecondsDelayBeforeReady(parcel.readInt());
            probe.internalTemperature = parcel.readInt();
            probe.ambientTemperature = parcel.readInt();
            probe.targetInternalTemperature = parcel.readInt();
            probe.peakTemperature = parcel.readInt();
            DeviceCookState fromValue = DeviceCookState.fromValue(parcel.readInt());
            if (fromValue == null) {
                fromValue = DeviceCookState.COOK_STATE_FINISHED;
            }
            probe.setCookState(fromValue);
            probe.cookName = parcel.readString();
            probe.probeNumber = parcel.readInt();
            probe.clipNumber = parcel.readInt();
            int readInt = parcel.readInt();
            for (int i10 = 0; i10 < readInt; i10++) {
                Alert alert = new Alert();
                alert.setType(AlarmType.fromValue(parcel.readInt()));
                alert.setState(AlarmState.fromValue(parcel.readInt()));
                alert.setLimit(parcel.readInt());
                alert.setName(parcel.readString());
                probe.alerts.add(alert);
            }
            probe.setConnectionMethod(DeviceConnectionMethod.BLUETOOTH);
            probe.setConnectionState(DeviceConnectionState.CONNECTED);
            return probe;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Probe[] newArray(int i10) {
            return new Probe[i10];
        }
    };
    private DeviceCookState cookState = DeviceCookState.COOK_STATE_NOT_STARTED;
    private ArrayList<Alert> alerts = new ArrayList<>();
    private HighResTemperatureLog temperatureLog = HighResTemperatureLog.temperatureLogForProbe(this);
    private int internalTemperature = Temperature.INVALID_READING;
    private final f6.a cookEstimate = new f6.a();
    private final Runnable autoEndCookRunnable = new Runnable() { // from class: com.apptionlabs.meater_app.model.a
        @Override // java.lang.Runnable
        public final void run() {
            Probe.this.automaticallyEndCook();
        }
    };
    private Temperature.DeviceTemperatureResolution deviceTemperatureResolution = Temperature.DeviceTemperatureResolution.UNKNOWN;
    boolean stopUpdateLiveNotification = false;
    private String ongoingRecipeStepTitle = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.model.Probe$2, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState;

        static {
            int[] iArr = new int[AlarmType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType = iArr;
            try {
                iArr[AlarmType.ALARM_TYPE_MIN_AMBIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MAX_AMBIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MIN_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MAX_INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_ESTIMATE_READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_REPEAT_DURATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_BEFORE_READY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[DeviceCookState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState = iArr2;
            try {
                iArr2[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum ProbeType {
        NONE,
        MEATER_PROBE,
        BLOCK_PROBE,
        MEATER_PLUS,
        MEATER_BLOCK
    }

    public Probe() {
        resetCook();
        setDeviceTemperatureResolution(Temperature.DeviceTemperatureResolution.SIXTEEN);
    }

    private void UpdateTemperateru(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void automaticallyEndCook() {
        k6.b.r("Automatically ending cook for %s", description());
        cancelCook(true);
    }

    private void cancelRecipeIfAssociateProbeHasCancelledCook() {
        if (com.apptionlabs.meater_app.app.a.u().w().longValue() == this.deviceID) {
            k6.b.t("(Probe) Cook is cancel hence Recipe is marked as Finish", new Object[0]);
            com.apptionlabs.meater_app.app.a.u().e();
            k6.b.t("(Probe) Cook is cancel hence Associated Probe is marked as -1", new Object[0]);
            com.apptionlabs.meater_app.app.a.u().O1(-1L);
        }
    }

    private boolean haveValidTemperatureHistory() {
        DeviceConnectionMethod connectionMethod = getConnectionMethod();
        if (connectionMethod == DeviceConnectionMethod.PROBE_SIM) {
            return true;
        }
        if (connectionMethod.isBluetoothConnectionMethod()) {
            return this.haveFetchedTemperatureLogFromBLE;
        }
        if (connectionMethod != DeviceConnectionMethod.MEATER_LINK && connectionMethod != DeviceConnectionMethod.MEATER_CLOUD) {
            return false;
        }
        return this.haveReceivedTemperatureLogFromRemote;
    }

    private void postCookStats() {
        y5.g.E().i0(this);
    }

    private void setSavedCook(SavedCook savedCook) {
        this.savedCook = savedCook;
    }

    private boolean shouldUpdateEstimator() {
        return haveValidTemperatureHistory();
    }

    private boolean shouldUpdateLocalTemperatureLog() {
        if (this.cookState == DeviceCookState.COOK_STATE_NOT_STARTED) {
            return false;
        }
        DeviceConnectionState deviceConnectionState = this.connectionState;
        DeviceConnectionState deviceConnectionState2 = DeviceConnectionState.CONNECTED;
        if (deviceConnectionState != deviceConnectionState2) {
            return false;
        }
        if (getConnectionMethod().isBluetoothConnectionMethod() && !haveFetchedTemperatureLogFromBLE()) {
            return false;
        }
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null && mEATERDevice.isMEATERPlus() && this.parentDevice.getConnectionMethod().isBluetoothConnectionMethod() && this.parentDevice.getConnectionState() != deviceConnectionState2) {
            return false;
        }
        if ((getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK || getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) && !haveReceivedTemperatureLogFromRemote()) {
            return false;
        }
        return true;
    }

    private void showOrHideTargetAmbientOutRangeAlertIfNeeded() {
        if (appearsToHaveCookInProgress()) {
            int i10 = this.targetMinimumAmbientTemperature;
            if (i10 > 0 || this.targetMaximumAmbientTemperature > 0) {
                if (this.canFireTargetAmbientTemperatureAlert) {
                    int i11 = this.ambientTemperature;
                    if (i11 > this.targetMaximumAmbientTemperature) {
                        s6.d.q(this, false);
                        setCanFireTargetAmbientTemperatureAlert(false);
                        return;
                    } else if (i11 < i10) {
                        s6.d.q(this, true);
                        setCanFireTargetAmbientTemperatureAlert(false);
                        return;
                    } else {
                        s6.c.h(this, MCNotificationType.NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE);
                        return;
                    }
                }
                int i12 = this.ambientTemperature;
                if (i12 > i10 && i12 < this.targetMaximumAmbientTemperature) {
                    setCanFireTargetAmbientTemperatureAlert(true);
                    s6.c.h(this, MCNotificationType.NOTIFICATION_TYPE_AMBIENT_OUTSIDE_RANGE);
                }
            }
        }
    }

    private void tellUserToPutProbeBackInChargerIfNecessary() {
        if (this.cookFinishedDate > 0 && (System.currentTimeMillis() - this.cookFinishedDate) / 1000 > 1800) {
            s6.d.C(this);
        }
    }

    private void trackCookStateEventForFireBase(DeviceCookState deviceCookState) {
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[deviceCookState.ordinal()]) {
            case 2:
                lm.b.g(b.EnumC0292b.f17334n0.title, "", "");
                return;
            case 3:
                lm.b.g(b.EnumC0292b.f17336o0.title, "", "");
                return;
            case 4:
                lm.b.g(b.EnumC0292b.f17338p0.title, "", "");
                return;
            case 5:
                lm.b.g(b.EnumC0292b.f17340q0.title, "", "");
                return;
            case 6:
                lm.b.g(b.EnumC0292b.f17349t0.title, "", "");
                return;
            case 7:
                lm.b.g(b.EnumC0292b.f17346s0.title, "", "");
                return;
            case 8:
            case 9:
                lm.b.g(b.EnumC0292b.f17352u0.title, "", "");
                return;
            default:
                return;
        }
    }

    private boolean triggerAlertsIfNecessary() {
        ArrayList<Alert> arrayList = this.alerts;
        boolean z10 = false;
        if (arrayList != null) {
            Iterator<Alert> it = arrayList.iterator();
            while (it.hasNext()) {
                Alert next = it.next();
                if (next.needsToFireForProbe(this)) {
                    if (next.getState() == AlarmState.ALARM_STATE_READY) {
                        next.fireForProbe(this);
                        z10 = true;
                    }
                } else {
                    AlarmState state = next.getState();
                    AlarmState alarmState = AlarmState.ALARM_STATE_READY;
                    if (state != alarmState && next.shouldResetToReadyForProbe(this)) {
                        next.setState(alarmState);
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    private boolean updateCookStateFromEstimator() {
        DeviceCookState o10 = this.cookEstimate.o();
        if (o10 != this.cookState) {
            setCookStateAndShowNotificationsIfNeeded(o10);
            return true;
        }
        return false;
    }

    private void updateTimeRemaining() {
        if (this.cookState.getValue() >= DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
            setTimeRemaining(this.cookEstimate.q());
            setTotalTimeRemaining(this.timeRemaining);
        } else {
            setTimeRemaining(this.cookEstimate.p());
            setTotalTimeRemaining(this.cookEstimate.r());
        }
    }

    private void writeCurrentStateToDisk() {
        SavedCook savedCook = this.savedCook;
        if (savedCook != null && savedCook.isModified()) {
            k6.b.v("Mark cook as needs uploading: " + this.savedCook.cookIDString() + " isReadyForSync: " + this.savedCook.readyForSync(), new Object[0]);
            this.savedCook.setNeedsUploading(true);
            this.savedCook.writeToDB();
            this.lastSavedToDisk = new Date();
        }
    }

    public void addDefaultAlerts() {
        if (com.apptionlabs.meater_app.app.a.u().a() && this.alerts.size() < 4) {
            Iterator<Alert> it = this.alerts.iterator();
            while (it.hasNext()) {
                Alert next = it.next();
                if (next.getType() == AlarmType.ALARM_TYPE_TIME_BEFORE_READY && next.getLimit() == 300) {
                    return;
                }
            }
            Alert alert = new Alert();
            alert.setType(AlarmType.ALARM_TYPE_TIME_BEFORE_READY);
            alert.setLimit(300);
            alert.setState(AlarmState.ALARM_STATE_NOT_READY);
            alert.setIsNewAlert(false);
            alert.setCreatedDate(System.currentTimeMillis());
            alert.updateAnalyticsForCurrentAlert();
            this.alerts.add(alert);
            if (!probeAlreadyHaveEstimateAlert()) {
                createDefaultEstimateAlert();
            }
        }
    }

    public Alert alertWithID(UUID uuid) {
        Iterator<Alert> it = this.alerts.iterator();
        while (it.hasNext()) {
            Alert next = it.next();
            if (next.getId().equals(uuid)) {
                return next;
            }
        }
        return null;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean appearsToHaveCookInProgress() {
        if (this.cookState.getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
            return true;
        }
        return false;
    }

    public boolean canDisplayAmbientTemperature() {
        int i10;
        if (MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(getMEATERDeviceType())) {
            return true;
        }
        if (this.ambientTemperature >= this.internalTemperature + Temperature.fromCelsius(5) && (i10 = this.ambientTemperature) != -1024 && i10 >= 1) {
            return true;
        }
        return false;
    }

    public void cancelCook(boolean z10) {
        SavedCook savedCook;
        postCookStats();
        if (isPaired()) {
            lm.b.g(b.EnumC0292b.f17343r0.title, "", "");
            if (getCookState().getValue() >= DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue() && (savedCook = this.savedCook) != null && savedCook.readyForSync() && this.savedCook.getRecipeID() == -1) {
                s6.d.s(this);
            }
            i iVar = this.localNotification;
            if (iVar != null) {
                iVar.m();
            }
        }
        SavedCook savedCook2 = this.savedCook;
        if (savedCook2 != null) {
            if (savedCook2.readyForSync()) {
                this.savedCook.setFinished(true);
                if (this.savedCook.getCookState() < DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue()) {
                    this.savedCook.setCookState(DeviceCookState.COOK_STATE_FINISHED.getValue());
                }
            }
            this.savedCook.setNeedsUploading(true);
            this.savedCook.writeToDB();
            setSavedCook(null);
        }
        s6.d.j(this);
        resetCook();
        this.alerts.clear();
        setCookStartTime(null);
        setTimeRemaining(-1);
        setCookState(DeviceCookState.COOK_STATE_NOT_STARTED);
        setOngoingRecipeID(-1L);
        setOnGoingRecipeStepTitle(null);
        cancelRecipeIfAssociateProbeHasCancelledCook();
        if (z10) {
            markCookSetupModified();
        }
        notifyStateUpdated();
    }

    public void checkInvalidTargetTemperature(int i10) {
        if (i10 < 0 || i10 > maximumInternalTemperature()) {
            Log.d("INVALID_TARGET", "" + i10);
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void cleanupAfterBLEDisconnection() {
        super.cleanupAfterBLEDisconnection();
        if (this.connectionState == DeviceConnectionState.OFFLINE) {
            if (appearsToHaveCookInProgress() && isPaired()) {
                showConnectionLostWarning();
            }
            setHaveFetchedCookSetupFromBLE(false);
        }
        if (isBlockProbe() && h.connectDirectlyToBlockProbes == e6.a.f11806q && this.connectionState == DeviceConnectionState.ATTEMPTING_RECONNECT) {
            attemptToReconnect();
        }
    }

    public void confirmCookSetup() {
        Probe probe = (Probe) h.f8879a.o(getDeviceID());
        if (probe == null) {
            k6.b.g("PROBE NULL NULL id =  %s  shortId = %s ", Long.valueOf(getDeviceID()), shortDeviceIDString());
            l0.G("Probe not found id =  " + getDeviceID());
            return;
        }
        probe.setSecondsDelayBeforeResting(getSecondsDelayBeforeResting());
        probe.setTemperatureChangeBeforeReady(getTemperatureChangeBeforeReady());
        probe.setSecondsDelayBeforeReady(getSecondsDelayBeforeReady());
        probe.setTargetInternalTemperature(getTargetInternalTemperature());
        probe.setAlerts(getAlerts());
        probe.setmCut(getmCut());
        probe.setCookName(getCookName());
        probe.setClipNumber(getClipNumber());
        probe.setCookPreset(getCookPreset());
        probe.setTargetMinimumAmbientTemperature(getTargetMinimumAmbientTemperature());
        probe.setTargetMaximumAmbientTemperature(getTargetMaximumAmbientTemperature());
        probe.setOngoingRecipeID(getOngoingRecipeID());
        if (probe.getCookState().equals(DeviceCookState.COOK_STATE_NOT_STARTED)) {
            Iterator<Alert> it = getAlerts().iterator();
            while (it.hasNext()) {
                Alert next = it.next();
                if (next.getType() == AlarmType.ALARM_TYPE_REPEAT_DURATION) {
                    next.setCreatedDate(System.currentTimeMillis());
                }
            }
            probe.addDefaultAlerts();
            probe.setCookID(generateCookID());
            OldCookID.recordCookIDWithSeqNum(probe.getCookID(), probe.getSetupSeqNum());
            probe.startCook(true);
            if (com.apptionlabs.meater_app.app.a.u().e0()) {
                k.e0().N(probe);
            }
        } else {
            probe.markCookSetupModified();
        }
        if (getOngoingRecipeID() != -1) {
            k6.b.t("(Probe) Cook Confirmed > Cook ID generated : " + probe.cookID, new Object[0]);
            com.apptionlabs.meater_app.app.a.u().N1(probe.cookID);
        }
        if (this.targetInternalTemperature >= maximumTemperatureForEstimate && !com.apptionlabs.meater_app.app.a.u().Z()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.apptionlabs.meater_app.model.b
                @Override // java.lang.Runnable
                public final void run() {
                    s6.d.B();
                }
            }, 700L);
        }
    }

    public String cookIDString() {
        return Long.toHexString(this.cookID).toUpperCase();
    }

    public String cookNameForDisplay() {
        String str = this.cookName;
        if (str != null && !str.isEmpty()) {
            return this.cookName;
        }
        MeatCut meatCut = this.mCut;
        if (meatCut != null) {
            return meatCut.getNameLong();
        }
        return com.apptionlabs.meater_app.app.a.i().getString(2132017581);
    }

    public int cookTimeElapsed() {
        if (haveValidTemperatureHistory() && this.cookStartTime != null) {
            return ((int) (System.currentTimeMillis() - this.cookStartTime.getTime())) / 1000;
        }
        return 0;
    }

    public void createDefaultEstimateAlert() {
        if ((getParentDevice() == null || !getParentDevice().isMEATERBlock() || !((MEATERBlock) getParentDevice()).isLegacy()) && this.alerts.size() < 4) {
            Alert alert = new Alert();
            alert.setType(AlarmType.ALARM_TYPE_ESTIMATE_READY);
            alert.setState(AlarmState.ALARM_STATE_NOT_READY);
            alert.setIsNewAlert(false);
            alert.setCreatedDate(System.currentTimeMillis());
            alert.updateAnalyticsForCurrentAlert();
            this.alerts.add(alert);
        }
    }

    public String currentStateDescriptionForAlertType(AlarmType alarmType, Alert alert) {
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[alarmType.ordinal()]) {
            case 1:
            case 2:
                if (!canDisplayAmbientTemperature()) {
                    return "n/a";
                }
                return Temperature.displayTemperature(this.ambientTemperature);
            case 3:
            case 4:
                return Temperature.displayTemperature(this.internalTemperature);
            case 5:
                return c0.b(cookTimeElapsed());
            case 6:
                if (getTimeRemaining() < 0) {
                    return "n/a";
                }
                return c0.f(getTimeRemaining());
            case 7:
                long j10 = alert.lastFireDate;
                if (j10 <= 0) {
                    j10 = alert.createdDate;
                }
                long time = (new Date(j10 + (alert.getLimit() * 1000)).getTime() - System.currentTimeMillis()) / 1000;
                if (time <= 10) {
                    time = 11;
                }
                return c0.f(time);
            default:
                if (getTimeRemaining() < 0) {
                    return "n/a";
                }
                return c0.f(getTimeRemaining());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Temperature.DeviceTemperatureResolution deviceTemperatureResolution() {
        return this.deviceTemperatureResolution;
    }

    public void dismissAllFiringAlerts() {
        Iterator<Alert> it = this.alerts.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Alert next = it.next();
            if (next.getState() == AlarmState.ALARM_STATE_FIRED) {
                next.setState(AlarmState.ALARM_STATE_DISMISSED);
                z10 = true;
            }
        }
        if (z10) {
            markCookSetupModified();
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public int displayProbeNumber() {
        if (this.clipNumber != 0 && !isBlockProbe()) {
            return this.clipNumber;
        }
        return this.probeNumber & 15;
    }

    public EstimatorConfig estimatorConfigFromDevice() {
        return new EstimatorConfig.Builder().temperatureChangeBeforeReady(Integer.valueOf(this.tempChangeBeforeReady)).secondsDelayBeforeReady(Integer.valueOf(this.secondsDelayBeforeReady)).secondsDelayBeforeResting(Integer.valueOf(this.secondsDelayBeforeResting)).estimatorType(EstimatorType.DEFAULT).m186build();
    }

    public long generateCookID() {
        byte[] f10 = kd.g.f(UUID.randomUUID().getLeastSignificantBits());
        f10[0] = 96;
        return kd.g.b(f10);
    }

    public ArrayList<Alert> getAlerts() {
        return this.alerts;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public j getBleConnection() {
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            return mEATERDevice.getBleConnection();
        }
        return this.bleConnection;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice, j6.o
    public DeviceConnectionMethod getConnectionMethod() {
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            return mEATERDevice.getConnectionMethod();
        }
        return this.connectionMethod;
    }

    public f6.a getCookEstimate() {
        return this.cookEstimate;
    }

    public long getCookFinishedDate() {
        return this.cookFinishedDate;
    }

    public long getCookID() {
        return this.cookID;
    }

    public String getCookName() {
        return this.cookName;
    }

    public MeatCookingTemperature getCookPreset() {
        return this.cookPreset;
    }

    public Date getCookStartTime() {
        return this.cookStartTime;
    }

    public DeviceCookState getCookState() {
        return this.cookState;
    }

    public ProbeEventLog getEventLog() {
        return this.eventLog;
    }

    public AlarmState getFlareUpAlertState() {
        return this.flareUpAlertState;
    }

    public int getInternalTemperature() {
        return this.internalTemperature;
    }

    public int getLastResetSource() {
        return this.lastResetSource;
    }

    public long getLastTemperatureLogRequestTime() {
        return this.lastTemperatureLogRequestTime;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public MEATERLinkAddress getMeaterLinkAddress() {
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            return mEATERDevice.getMeaterLinkAddress();
        }
        return this.meaterLinkAddress;
    }

    public String getOnGoingRecipeStepTitle() {
        return this.ongoingRecipeStepTitle;
    }

    public int getPeakTemperature() {
        return this.peakTemperature;
    }

    public int[] getPeakTemperatures() {
        if (this.peakTemperatures == null) {
            this.peakTemperatures = new int[getMEATERDeviceType().numberOfInternalTemperatureSensorsForDevice()];
        }
        return this.peakTemperatures;
    }

    public ProbeType getProbeType() {
        int i10 = this.probeNumber;
        if (i10 == 0) {
            return ProbeType.MEATER_PROBE;
        }
        if (i10 > 0 && i10 < 5) {
            return ProbeType.BLOCK_PROBE;
        }
        if (i10 == 128) {
            return ProbeType.MEATER_PLUS;
        }
        if (i10 == 8) {
            return ProbeType.MEATER_BLOCK;
        }
        return ProbeType.NONE;
    }

    public int getResetCounter() {
        return this.resetCounter;
    }

    public SavedCook getSavedCook() {
        return this.savedCook;
    }

    public int getSecondsDelayBeforeReady() {
        return this.secondsDelayBeforeReady;
    }

    public int getSecondsDelayBeforeResting() {
        return this.secondsDelayBeforeResting;
    }

    public int getSetupSeqNum() {
        return this.setupSeqNum;
    }

    public int getTargetInternalTemperature() {
        checkInvalidTargetTemperature(this.targetInternalTemperature);
        return this.targetInternalTemperature;
    }

    public int getTargetMaximumAmbientTemperature() {
        return this.targetMaximumAmbientTemperature;
    }

    public int getTargetMinimumAmbientTemperature() {
        return this.targetMinimumAmbientTemperature;
    }

    public int getTemperatureChangeBeforeReady() {
        return this.tempChangeBeforeReady;
    }

    public HighResTemperatureLog getTemperatureLog() {
        return this.temperatureLog;
    }

    public Temperature.Temperatures_t getTemperatures() {
        return this.temperatures;
    }

    public int getTimeRemaining() {
        return this.timeRemaining;
    }

    public int getTotalTimeRemaining() {
        return this.totalTimeRemaining;
    }

    public MeatCut getmCut() {
        return this.mCut;
    }

    public boolean haveFetchedTemperatureLogFromBLE() {
        return this.haveFetchedTemperatureLogFromBLE;
    }

    public boolean haveReceivedTemperatureLogFromRemote() {
        return this.haveReceivedTemperatureLogFromRemote;
    }

    public boolean isCanFireTargetAmbientTemperatureAlert() {
        return this.canFireTargetAmbientTemperatureAlert;
    }

    public boolean isHaveFetchedCookSetupFromBLE() {
        return this.haveFetchedCookSetupFromBLE;
    }

    public boolean isLegacyBlockProbe() {
        if (getParentDevice() != null && getParentDevice().isMEATERBlock() && ((MEATERBlock) getParentDevice()).isLegacy()) {
            return true;
        }
        return false;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public boolean isNumberOfDisconnectionsThresholdExceeded() {
        int i10 = this.totalNumberOfDisconnections;
        MEATERDevice mEATERDevice = this.parentDevice;
        if (mEATERDevice != null) {
            i10 += mEATERDevice.totalNumberOfDisconnections;
        }
        Config.getInstance();
        if (i10 == 30) {
            return true;
        }
        return false;
    }

    public boolean isReadyToShowGraph() {
        if (this.cookState.getValue() >= DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isUsingGuidedCook() {
        if (this.mCut != null) {
            return true;
        }
        return false;
    }

    public boolean isV1Probe() {
        String str = this.firmwareRevision;
        if (str == null) {
            return false;
        }
        return DeviceFirmwareVersion.probeVersionDisplayStringFromFirmwareRevision(str).equals("v1");
    }

    public void markCookSetupModified() {
        this.setupSeqNum++;
        if (com.apptionlabs.meater_app.app.a.u().e0()) {
            k.e0().N(this);
        }
        if (getBleConnection() instanceof a1) {
            ((a1) getBleConnection()).i0();
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public int maximumAmbientTemperature() {
        return getMEATERDeviceType().maximumAmbientTemperatureForDevice(this.firmwareRevision);
    }

    public int maximumInternalTemperature() {
        return getMEATERDeviceType().maximumInternalTemperatureForDevice();
    }

    public int overcookThresholdTemperature() {
        int i10;
        MeatCut meatCut = this.mCut;
        if (meatCut != null) {
            i10 = meatCut.id.intValue();
        } else {
            i10 = 0;
        }
        return new x5.c().a(i10, this.targetInternalTemperature);
    }

    public boolean probeAlreadyHaveEstimateAlert() {
        Iterator<Alert> it = this.alerts.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == AlarmType.ALARM_TYPE_ESTIMATE_READY) {
                return true;
            }
        }
        return false;
    }

    public void resetCook() {
        setSecondsDelayBeforeResting(30);
        setSecondsDelayBeforeReady(0);
        setTemperatureChangeBeforeReady(j6.k.a());
        setTargetInternalTemperature(0);
        setClipNumber(0);
        setPeakTemperature(Temperature.INVALID_READING);
        setmCut(null);
        setCookName(null);
        setTargetMaximumAmbientTemperature(0);
        setTargetMaximumAmbientTemperature(0);
    }

    public void setAlerts(ArrayList<Alert> arrayList) {
        this.alerts = arrayList;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void setBatteryLevel(int i10) {
        super.setBatteryLevel(i10);
        if (hasLowBattery() && !this.haveNotifiedUserOfLowBattery && isPaired()) {
            setHaveNotifiedUserOfLowBattery(true);
            s6.d.J(this);
        }
    }

    public void setCanFireTargetAmbientTemperatureAlert(boolean z10) {
        this.canFireTargetAmbientTemperatureAlert = z10;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void setConnectionState(DeviceConnectionState deviceConnectionState) {
        DeviceConnectionState deviceConnectionState2 = this.connectionState;
        super.setConnectionState(deviceConnectionState);
        DeviceConnectionState deviceConnectionState3 = DeviceConnectionState.CONNECTED;
        if (deviceConnectionState == deviceConnectionState3) {
            setLoadingState(e6.c.DeviceLoadingStateLoaded);
        } else if (deviceConnectionState == DeviceConnectionState.OFFLINE) {
            setLoadingState(e6.c.DeviceLoadingStateNotLoading);
        }
        if (deviceConnectionState2 != deviceConnectionState) {
            Handler handler = MEATERDevice.mainThreadNotifier;
            handler.removeCallbacks(this.autoEndCookRunnable);
            if (deviceConnectionState == deviceConnectionState3) {
                s6.d.i(this);
                if ((getConnectionMethod().isBluetoothConnectionMethod() || getConnectionMethod() == DeviceConnectionMethod.PROBE_SIM) && y5.g.E().X()) {
                    y5.g.E().j0(this);
                }
            } else if (deviceConnectionState == DeviceConnectionState.ATTEMPTING_RECONNECT) {
                setHaveFetchedTemperatureLogFromBLE(false);
                setHaveReceivedTemperatureLogFromRemote(false);
                setLastTemperatureLogRequestTime(0L);
            } else {
                setTimeRemaining(-1);
                setCookFinishedDate(0L);
                setHaveFetchedTemperatureLogFromBLE(false);
                setHaveReceivedTemperatureLogFromRemote(false);
                setLastTemperatureLogRequestTime(0L);
                if (this.cookState.getValue() >= DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue()) {
                    handler.removeCallbacks(this.autoEndCookRunnable);
                    long longValue = com.apptionlabs.meater_app.app.a.u().w().longValue();
                    long longValue2 = com.apptionlabs.meater_app.app.a.u().y().longValue();
                    if (longValue != this.deviceID && longValue2 != getCookID()) {
                        handler.postDelayed(this.autoEndCookRunnable, 180000L);
                    }
                }
                showConnectionLostWarning();
            }
            if (this.localNotification != null && MeaterLinkService.e() != null && !this.stopUpdateLiveNotification) {
                this.localNotification.q(this);
            }
        }
    }

    public void setCookFinishedDate(long j10) {
        this.cookFinishedDate = j10;
    }

    public void setCookID(long j10) {
        if (this.cookID == j10) {
            return;
        }
        k6.b.r("%s COOK-ID %s -> %s", getDebugLogDescription(), Long.toHexString(this.cookID).toUpperCase(), Long.toHexString(j10).toUpperCase());
        setHaveFetchedTemperatureLogFromBLE(false);
        setSetupSeqNum(0);
        this.cookID = j10;
        SavedCook savedCook = this.savedCook;
        if (savedCook != null) {
            savedCook.setCookID(j10);
        }
    }

    public void setCookName(String str) {
        this.cookName = str;
    }

    public void setCookPreset(MeatCookingTemperature meatCookingTemperature) {
        this.cookPreset = meatCookingTemperature;
    }

    public void setCookStartTime(Date date) {
        this.cookStartTime = date;
    }

    public void setCookState(DeviceCookState deviceCookState) {
        if (this.cookState != deviceCookState) {
            if (getConnectionMethod().isBluetoothConnectionMethod() && deviceCookState.getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
                lm.b.f(this);
            }
            k6.b.r("%s COOK-STATE %s -> %s", getDebugLogDescription(), lm.b.a(this.cookState), lm.b.a(deviceCookState));
            int value = this.cookState.getValue();
            DeviceCookState deviceCookState2 = DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE;
            if (value < deviceCookState2.getValue() && this.cookState.getValue() > DeviceCookState.COOK_STATE_RESTING.getValue()) {
                setCookFinishedDate(System.currentTimeMillis());
            } else if (this.cookState.getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue() && this.cookState.getValue() < deviceCookState2.getValue()) {
                setCookFinishedDate(0L);
            }
            if (this.cookState.getValue() < deviceCookState2.getValue() && deviceCookState == DeviceCookState.COOK_STATE_FINISHED && !isNumberOfDisconnectionsThresholdExceeded()) {
                s6.d.a(this, ReviewReasonType.COOK_FINISHED);
            }
            this.cookState = deviceCookState;
            y.g();
            this.cookEstimate.w(deviceCookState);
            if (getCookID() != 0) {
                postCookStats();
            }
            if (deviceCookState.getValue() > DeviceCookState.COOK_STATE_RESTING.getValue() && getTemperatureLog() != null) {
                getTemperatureLog().turnOnCroppingEndOfCookFromGraphData();
            }
            s6.d.d(this);
            trackCookStateEventForFireBase(deviceCookState);
        }
    }

    public void setCookStateAndShowNotificationsIfNeeded(DeviceCookState deviceCookState) {
        DeviceCookState deviceCookState2 = this.cookState;
        if (deviceCookState2 != deviceCookState) {
            setCookState(deviceCookState);
            if ((deviceCookState != DeviceCookState.COOK_STATE_NOT_STARTED || deviceCookState2 != DeviceCookState.COOK_STATE_COOK_CONFIGURED) && (deviceCookState != DeviceCookState.COOK_STATE_COOK_CONFIGURED || deviceCookState2 != DeviceCookState.COOK_STATE_STARTED)) {
                s6.d.j(this);
            }
            if (isUsingGuidedCook()) {
                if (deviceCookState == DeviceCookState.COOK_STATE_READY_FOR_RESTING) {
                    s6.d.z(this);
                    return;
                } else {
                    if (deviceCookState == DeviceCookState.COOK_STATE_FINISHED || deviceCookState == DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE || deviceCookState == DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE || deviceCookState == DeviceCookState.COOK_STATE_OVERCOOK) {
                        s6.d.v(this);
                        return;
                    }
                    return;
                }
            }
            if (deviceCookState == DeviceCookState.COOK_STATE_FINISHED || deviceCookState == DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE || deviceCookState == DeviceCookState.COOK_STATE_OVERCOOK) {
                s6.d.w(this);
            }
        }
    }

    public void setDeviceTemperatureResolution(Temperature.DeviceTemperatureResolution deviceTemperatureResolution) {
        this.deviceTemperatureResolution = deviceTemperatureResolution;
    }

    public void setEventLog(ProbeEventLog probeEventLog) {
        this.eventLog = probeEventLog;
    }

    public void setFlareUpAlertState(AlarmState alarmState) {
        this.flareUpAlertState = alarmState;
    }

    public void setHaveFetchedCookSetupFromBLE(boolean z10) {
        this.haveFetchedCookSetupFromBLE = z10;
    }

    public void setHaveFetchedTemperatureLogFromBLE(boolean z10) {
        if (this.haveFetchedTemperatureLogFromBLE != z10) {
            this.haveFetchedTemperatureLogFromBLE = z10;
        }
    }

    public void setHaveReceivedTemperatureLogFromRemote(boolean z10) {
        this.haveReceivedTemperatureLogFromRemote = z10;
    }

    public void setInternalTemperature(int i10) {
        this.internalTemperature = i10;
        if (this.peakTemperature < i10) {
            setPeakTemperature(i10);
        }
        if (i10 < Temperature.fromCelsius(1) && i10 != -1024) {
            s6.d.u(this);
        }
    }

    public void setLastResetSource(int i10) {
        this.lastResetSource = i10;
    }

    public void setLastTemperatureLogRequestTime(long j10) {
        this.lastTemperatureLogRequestTime = j10;
    }

    public void setOnGoingRecipeStepTitle(String str) {
        this.ongoingRecipeStepTitle = str;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void setPaired(boolean z10) {
        if (isPaired() != z10) {
            super.setPaired(z10);
            if (!z10 && appearsToHaveCookInProgress()) {
                cancelCook(false);
            }
        }
    }

    public void setPeakTemperature(int i10) {
        this.peakTemperature = i10;
    }

    public void setPeakTemperatures(int[] iArr) {
        this.peakTemperatures = iArr;
    }

    public void setResetCounter(int i10) {
        this.resetCounter = i10;
    }

    public void setSecondsDelayBeforeReady(int i10) {
        this.secondsDelayBeforeReady = i10;
    }

    public void setSecondsDelayBeforeResting(int i10) {
        this.secondsDelayBeforeResting = i10;
    }

    public void setSetupSeqNum(int i10) {
        this.setupSeqNum = i10;
    }

    public void setStopUpdateLiveNotification(boolean z10) {
        this.stopUpdateLiveNotification = z10;
    }

    public void setTargetInternalTemperature(int i10) {
        if (this.targetInternalTemperature != i10) {
            this.targetInternalTemperature = i10;
            checkInvalidTargetTemperature(i10);
            this.cookEstimate.n(i10, slightlyOvercookedThresholdTemperature(), overcookThresholdTemperature());
        }
    }

    public void setTargetMaximumAmbientTemperature(int i10) {
        this.targetMaximumAmbientTemperature = i10;
    }

    public void setTargetMinimumAmbientTemperature(int i10) {
        this.targetMinimumAmbientTemperature = i10;
    }

    public void setTemperatureChangeBeforeReady(int i10) {
        this.tempChangeBeforeReady = i10;
    }

    public void setTemperatureLog(HighResTemperatureLog highResTemperatureLog) {
        this.temperatureLog = highResTemperatureLog;
    }

    public void setTemperatures(Temperature.Temperatures_t temperatures_t) {
        int i10;
        this.temperatures = temperatures_t;
        if (temperatures_t == null) {
            this.peakTemperatures = temperatures_t.internalTemperatures;
        }
        if ((this.haveFetchedTemperatureLogFromBLE || this.haveReceivedTemperatureLogFromRemote) && appearsToHaveCookInProgress() && getCookState().getValue() >= DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue()) {
            if (this.peakTemperatures == null) {
                com.apptionlabs.meater_app.data.Log.error("Error", "peakTemperatures is null ");
                return;
            }
            for (int i11 = 0; i11 < temperatures_t.internalSensorCount; i11++) {
                int[] iArr = this.peakTemperatures;
                int i12 = temperatures_t.internalTemperatures[i11];
                if (iArr != null) {
                    i10 = iArr[i11];
                } else {
                    i10 = Temperature.INVALID_READING;
                }
                iArr[i11] = Math.max(i12, i10);
            }
        }
    }

    public void setTimeRemaining(int i10) {
        if (i10 == -1) {
            this.totalTimeRemaining = i10;
        }
        this.timeRemaining = i10;
    }

    public void setTotalTimeRemaining(int i10) {
        this.totalTimeRemaining = i10;
    }

    public void setmCut(MeatCut meatCut) {
        this.mCut = meatCut;
    }

    public boolean shouldEnableAlertsButton() {
        if (!getShouldShowAsConnected()) {
            return false;
        }
        if (this.cookState == DeviceCookState.COOK_STATE_NOT_STARTED) {
            return true;
        }
        if ((this.mCut != null || !appearsToHaveCookInProgress()) && getCookState().getValue() >= DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
            return false;
        }
        return true;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void showAsDisconnected() {
        super.showAsDisconnected();
        if (appearsToHaveCookInProgress() && isPaired()) {
            showConnectionLostWarning();
        }
    }

    public void showConnectionLostWarning() {
        if (!appearsToHaveCookInProgress()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ((currentTimeMillis - this.lastShowedConnectionWarning) / 1000 < 60) {
            DeviceConnectionWarningLevel deviceConnectionWarningLevel = this.connectionWarningLevel;
            DeviceConnectionWarningLevel deviceConnectionWarningLevel2 = DeviceConnectionWarningLevel.MORE_THAN_ONCE;
            if (deviceConnectionWarningLevel == deviceConnectionWarningLevel2) {
                return;
            }
            s6.d.e(this);
            DeviceConnectionWarningLevel deviceConnectionWarningLevel3 = this.connectionWarningLevel;
            if (deviceConnectionWarningLevel3 == DeviceConnectionWarningLevel.NONE) {
                setConnectionWarningLevel(DeviceConnectionWarningLevel.ONCE);
            } else if (deviceConnectionWarningLevel3 == DeviceConnectionWarningLevel.ONCE) {
                setConnectionWarningLevel(deviceConnectionWarningLevel2);
            }
        } else {
            s6.d.e(this);
            setConnectionWarningLevel(DeviceConnectionWarningLevel.ONCE);
        }
        this.lastShowedConnectionWarning = currentTimeMillis;
        setLastShowedConnectionWarning(System.currentTimeMillis());
    }

    public void showOrHideCookNotification(boolean z10) {
        if (z10 && !this.stopUpdateLiveNotification) {
            i iVar = new i(getDeviceID(), MCNotificationType.NOTIFICATION_TYPE_INFO);
            this.localNotification = iVar;
            iVar.p(this);
        } else {
            i iVar2 = this.localNotification;
            if (iVar2 != null) {
                iVar2.o();
                this.localNotification = null;
            }
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    protected void showOverheatWarningIfNecessary() {
        int i10;
        if ((lastShowedNearAmbientTemperatureLimitNotification == -1 || (System.currentTimeMillis() - lastShowedNearAmbientTemperatureLimitNotification) / 1000 > 60) && this.ambientTemperature < maximumAmbientTemperature() && this.ambientTemperature > maximumAmbientTemperature() - Temperature.fromCelsius(10)) {
            lastShowedNearAmbientTemperatureLimitNotification = System.currentTimeMillis();
            s6.d.x(this);
        }
        Temperature.Temperatures_t temperatures_t = this.temperatures;
        if (temperatures_t == null) {
            return;
        }
        if (temperatures_t != null && temperatures_t.internalTemperatures.length > 1) {
            i10 = TemperatureSelection.HighestTemperatureFromSet(temperatures_t);
        } else {
            i10 = this.internalTemperature;
        }
        if (Temperature.toCelsius(i10) < Temperature.toCelsius(maximumInternalTemperature()) && Temperature.toCelsius(this.ambientTemperature) < Temperature.toCelsius(maximumAmbientTemperature())) {
            if (Temperature.toCelsius(i10) < Temperature.toCelsius(maximumInternalTemperature())) {
                Temperature.toCelsius(this.ambientTemperature);
                Temperature.toCelsius(maximumAmbientTemperature());
            }
            if (this.flareUpAlertState == null) {
                return;
            }
            int minimumFlareUpTemperatureForDevice = getMEATERDeviceType().minimumFlareUpTemperatureForDevice();
            if (haveMASTERConnection() && minimumFlareUpTemperatureForDevice != -1024) {
                AlarmState alarmState = this.flareUpAlertState;
                AlarmState alarmState2 = AlarmState.ALARM_STATE_READY;
                if (alarmState == alarmState2 && this.ambientTemperature >= minimumFlareUpTemperatureForDevice) {
                    setFlareUpAlertState(AlarmState.ALARM_STATE_FIRED);
                    markCookSetupModified();
                } else if (alarmState == AlarmState.ALARM_STATE_FIRED && this.ambientTemperature < minimumFlareUpTemperatureForDevice) {
                    setFlareUpAlertState(alarmState2);
                    markCookSetupModified();
                }
            }
            if (this.flareUpAlertState == AlarmState.ALARM_STATE_FIRED) {
                s6.d.y(this);
                return;
            } else {
                s6.d.k(this);
                return;
            }
        }
        s6.d.y(this);
    }

    public int slightlyOvercookedThresholdTemperature() {
        int celsius;
        MeatCookingTemperature slightlyOverDonePresetForPreset;
        int celsius2 = Temperature.toCelsius(this.targetInternalTemperature);
        int i10 = celsius2 + 5;
        if (this.mCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                celsius = Temperature.toFahrenheit(this.targetInternalTemperature);
            } else {
                celsius = Temperature.toCelsius(this.targetInternalTemperature);
            }
            MeatCookingTemperature rangeFromTemperature = meatCutsHelper.getRangeFromTemperature(celsius, this.mCut.temperatureRanges);
            if (rangeFromTemperature != null && (slightlyOverDonePresetForPreset = MeatCutsHelper.getInstance().slightlyOverDonePresetForPreset(rangeFromTemperature, this.mCut.temperatureRanges)) != null && Temperature.toCelsius(slightlyOverDonePresetForPreset.targetTempC.intValue()) - celsius2 < 6) {
                i10 = Temperature.toCelsius(slightlyOverDonePresetForPreset.targetTempC.intValue());
            }
        }
        return Temperature.fromCelsius(i10);
    }

    public void startCook(boolean z10) {
        AlarmState alarmState;
        boolean z11 = true;
        if (z10) {
            if (getConnectionMethod().isBluetoothConnectionMethod() && getBleConnection() != null) {
                ((a1) getBleConnection()).g0();
            }
            setHaveFetchedTemperatureLogFromBLE(true);
            if (getMEATERDeviceType().minimumFlareUpTemperatureForDevice() == -1024) {
                alarmState = AlarmState.ALARM_STATE_NOT_READY;
            } else {
                alarmState = AlarmState.ALARM_STATE_READY;
            }
            setFlareUpAlertState(alarmState);
        }
        setTemperatureLog(HighResTemperatureLog.temperatureLogForProbe(this));
        setPeakTemperature(this.internalTemperature);
        setCookStartTime(new Date());
        setCookState(DeviceCookState.COOK_STATE_COOK_CONFIGURED);
        setSavedCook(SavedCook.savedCookFromProbe(this));
        this.savedCook.writeToDB();
        f6.b EstimatorRecordingFromTemperatures = Temperature.EstimatorRecordingFromTemperatures(this.temperatures);
        this.cookEstimate.t(true, getMEATERDeviceType().numberOfInternalTemperatureSensorsForDevice());
        this.cookEstimate.x(EstimatorRecordingFromTemperatures, this.targetInternalTemperature, slightlyOvercookedThresholdTemperature(), overcookThresholdTemperature(), isUsingGuidedCook(), getMEATERDeviceType().numberOfInternalTemperatureSensorsForDevice());
        setTimeRemaining(-1);
        int i10 = this.ambientTemperature;
        if (i10 <= this.targetMinimumAmbientTemperature || i10 >= this.targetMaximumAmbientTemperature) {
            z11 = false;
        }
        this.canFireTargetAmbientTemperatureAlert = z11;
        setEventLog(ProbeEventLog.forProbe(this));
        this.eventLog.addEventsForInitialParticipants();
        this.eventLog.addEventsAtCookStart();
    }

    public void updateSavedStateIfNeeded() {
        boolean z10;
        boolean z11;
        SavedCook savedCook = this.savedCook;
        if (savedCook == null) {
            return;
        }
        SavedCook.ShouldPersistStatus updateFromProbe = savedCook.updateFromProbe(this);
        boolean z12 = false;
        if (updateFromProbe == SavedCook.ShouldPersistStatus.YES) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (updateFromProbe == SavedCook.ShouldPersistStatus.IF_NOT_RECENTLY_WRITTEN) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.lastSavedToDisk != null && System.currentTimeMillis() - this.lastSavedToDisk.getTime() < Config.MC_STATS_INTERVAL_MAX) {
            z12 = true;
        }
        if (z10 || (!z12 && z11)) {
            writeCurrentStateToDisk();
        }
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public void updateState() {
        boolean z10;
        super.updateState();
        showOverheatWarningIfNecessary();
        tellUserToPutProbeBackInChargerIfNecessary();
        int value = this.cookState.getValue();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_NOT_STARTED;
        if (value > deviceCookState.getValue()) {
            int p10 = this.cookEstimate.p();
            if (this.cookState.getValue() >= DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
                p10 = this.cookEstimate.q();
            }
            int i10 = p10;
            f6.b EstimatorRecordingFromTemperatures = Temperature.EstimatorRecordingFromTemperatures(this.temperatures);
            if (this.cookState.getValue() > deviceCookState.getValue() && this.connectionState == DeviceConnectionState.CONNECTED) {
                if (shouldUpdateEstimator()) {
                    f6.b EstimatorRecordingFromTemperatures2 = Temperature.EstimatorRecordingFromTemperatures(this.temperatures);
                    EstimatorRecordingFromTemperatures2.f12396b = Math.max(this.internalTemperature, EstimatorRecordingFromTemperatures2.f12396b);
                    this.cookEstimate.v(EstimatorRecordingFromTemperatures2, (int) this.temperatureLog.getTotalTime(), getSecondsDelayBeforeResting(), getTemperatureChangeBeforeReady(), getSecondsDelayBeforeReady());
                    ProbeEventLog probeEventLog = this.eventLog;
                    if (probeEventLog != null) {
                        probeEventLog.addEstimatorLogRecording(i10, TemperatureSelection.PreferredTemperatureFromSetWithState(this.temperatures, this.cookState), EstimatorRecordingFromTemperatures.f12396b, this.targetInternalTemperature, this.cookState, false);
                        k6.b.r("%s EST %s I:%s A:%s E: %s", getDebugLogDescription(), c0.b(this.temperatureLog.getTotalTime()), Temperature.displayTemperature(TemperatureSelection.PreferredTemperatureFromSetWithState(this.temperatures, this.cookState)), Temperature.displayTemperature(EstimatorRecordingFromTemperatures.f12396b), c0.b(this.cookEstimate.p()));
                    }
                } else {
                    DeviceCookState o10 = this.cookEstimate.o();
                    this.cookEstimate.c(EstimatorRecordingFromTemperatures, (int) this.temperatureLog.getTotalTime(), getSecondsDelayBeforeResting(), getTemperatureChangeBeforeReady(), getSecondsDelayBeforeReady());
                    if (this.cookEstimate.o() != o10) {
                        this.eventLog.addEstimatorLogRecording(i10, TemperatureSelection.PreferredTemperatureFromSetWithState(this.temperatures, this.cookState), EstimatorRecordingFromTemperatures.f12396b, this.targetInternalTemperature, this.cookEstimate.o(), true);
                    }
                }
            }
            showOrHideTargetAmbientOutRangeAlertIfNeeded();
            if (haveMASTERConnection() && this.cookState.getValue() >= DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.getValue() && this.internalTemperature < Temperature.fromCelsius(30)) {
                long longValue = com.apptionlabs.meater_app.app.a.u().w().longValue();
                long longValue2 = com.apptionlabs.meater_app.app.a.u().y().longValue();
                if (longValue != this.deviceID && longValue2 != getCookID()) {
                    automaticallyEndCook();
                }
            }
        }
        boolean z11 = false;
        if (haveMASTERConnection()) {
            if (shouldUpdateEstimator()) {
                z11 = updateCookStateFromEstimator();
                updateTimeRemaining();
            }
            z10 = triggerAlertsIfNecessary();
        } else {
            z10 = false;
        }
        if (z11 || z10) {
            markCookSetupModified();
        }
        updateSavedStateIfNeeded();
        i iVar = this.localNotification;
        if (iVar != null && !this.stopUpdateLiveNotification) {
            iVar.q(this);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.deviceID);
        parcel.writeLong(this.parentDeviceID);
        parcel.writeInt(getSecondsDelayBeforeResting());
        parcel.writeInt(getTemperatureChangeBeforeReady());
        parcel.writeInt(getSecondsDelayBeforeReady());
        parcel.writeInt(this.internalTemperature);
        parcel.writeInt(this.ambientTemperature);
        parcel.writeInt(this.targetInternalTemperature);
        parcel.writeInt(this.peakTemperature);
        parcel.writeInt(this.cookState.getValue());
        parcel.writeString(this.cookName);
        parcel.writeInt(this.probeNumber);
        parcel.writeInt(this.clipNumber);
        parcel.writeInt(this.alerts.size());
        Iterator<Alert> it = this.alerts.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Probe m4clone() {
        Probe probe = new Probe();
        probe.setDeviceID(this.deviceID);
        Iterator<Alert> it = this.alerts.iterator();
        while (it.hasNext()) {
            probe.alerts.add(it.next().m3clone());
        }
        probe.setTargetInternalTemperature(this.targetInternalTemperature);
        probe.setmCut(this.mCut);
        probe.setCookName(this.cookName);
        probe.setCookState(this.cookState);
        probe.setProbeNumber(this.probeNumber);
        probe.setSecondsDelayBeforeResting(getSecondsDelayBeforeResting());
        probe.setTemperatureChangeBeforeReady(getTemperatureChangeBeforeReady());
        probe.setSecondsDelayBeforeReady(getSecondsDelayBeforeReady());
        probe.setConnectionMethod(this.connectionMethod);
        probe.setTargetMinimumAmbientTemperature(this.targetMinimumAmbientTemperature);
        probe.setTargetMaximumAmbientTemperature(this.targetMaximumAmbientTemperature);
        probe.setCanFireTargetAmbientTemperatureAlert(this.canFireTargetAmbientTemperatureAlert);
        probe.setParentDeviceID(this.parentDeviceID);
        probe.setClipNumber(getClipNumber());
        return probe;
    }

    @Override // com.apptionlabs.meater_app.model.MEATERDevice
    public Probe relatedProbe() {
        return this;
    }
}
