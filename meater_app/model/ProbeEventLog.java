package com.apptionlabs.meater_app.model;

import android.content.Context;
import android.content.Intent;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.AlertFiredEvent;
import com.apptionlabs.meater_app.v3protobuf.AppActionMessage;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionEvent;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState;
import com.apptionlabs.meater_app.v3protobuf.BLERadioState;
import com.apptionlabs.meater_app.v3protobuf.BLERadioStateChange;
import com.apptionlabs.meater_app.v3protobuf.CookEstimatorLogRecording;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.MEATERBlockBLERSSIChange;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudState;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudStateChange;
import com.apptionlabs.meater_app.v3protobuf.MEATERDeviceReset;
import com.apptionlabs.meater_app.v3protobuf.MEATERDeviceTemperatureRecording;
import com.apptionlabs.meater_app.v3protobuf.MEATERErrorEvent;
import com.apptionlabs.meater_app.v3protobuf.MEATEREvent;
import com.apptionlabs.meater_app.v3protobuf.MEATEREventList;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionEvent;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkState;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkStateChange;
import com.apptionlabs.meater_app.v3protobuf.MEATERPlusBatteryLevelChange;
import com.apptionlabs.meater_app.v3protobuf.MEATERPlusProbeConnectionEvent;
import com.apptionlabs.meater_app.v3protobuf.MEATERPlusRSSIChange;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMinorVersion;
import com.apptionlabs.meater_app.v3protobuf.NetworkConnectivityStateChange;
import com.apptionlabs.meater_app.v3protobuf.NetworkState;
import com.apptionlabs.meater_app.v3protobuf.ProbeBatteryLevelChange;
import com.apptionlabs.meater_app.v3protobuf.ProbeCookSetupState;
import com.apptionlabs.meater_app.v3protobuf.ProbeRSSIChange;
import com.apptionlabs.meater_app.v3protobuf.ProbeReadCookSetupEvent;
import com.apptionlabs.meater_app.v3protobuf.ProbeReadTempLogEvent;
import com.apptionlabs.meater_app.v3protobuf.ProbeWriteCookSetupEvent;
import java.util.ArrayList;
import java.util.Iterator;
import l6.k;
import l6.p;
import l6.q;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ProbeEventLog {
    private static final int MAX_APP_VERSION_LENGTH = 11;
    private static final int MAX_DEVICE_INFO_LENGTH = 31;
    private static final int MAX_EMAIL_ADDRESS_LENGTH = 254;
    private static final int MAX_SIXTY_THREE_LENGTH = 63;
    private static boolean uiBroadCastProbeEvent;
    ArrayList<String> eventLogMessages;
    EventLogUtility eventUtility;
    Probe probe;
    private final int eventsToBufferForPosting = 50;
    public ArrayList<LocalMEATEREvent> localMEATEREvents = new ArrayList<>();
    private int fromIndexOfListToPost = 0;
    private int toIndexOfListToPost = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum EventType {
        BLERadioStateChange,
        NetworkConnectivityStateChange,
        MEATERLinkStateChange,
        MEATERCloudStateChange,
        ProbeRSSIChange,
        ProbeBatteryLevelChange,
        CookEstimatorLogRecording,
        MEATERLinkClientSubscriptionEvent,
        BLEProbeConnectionEvent,
        ProbeReadCookSetupEvent,
        ProbeReadTempLogEvent,
        AlertFiredEvent,
        ErrorEvent,
        MEATERPlusRSSIChange,
        MEATERPlusBatteryLevelChange,
        MEATERPlusProbeConnectionEvent,
        DeviceTemperatureRecording,
        MEATERBlockBLERSSIChange,
        MEATERDeviceReset,
        ProbeWriteCookSetupEvent
    }

    private void addEvent(MEATEREvent mEATEREvent, EventType eventType) {
        Probe probe = this.probe;
        if (probe != null && probe.getSavedCook() != null) {
            boolean isHaveConfirmedTime = isHaveConfirmedTime();
            if (isHaveConfirmedTime) {
                confirmCookTimeForEvents();
            }
            LocalMEATEREvent localMEATEREvent = new LocalMEATEREvent();
            localMEATEREvent.setEvent(mEATEREvent);
            localMEATEREvent.setTime(System.currentTimeMillis());
            localMEATEREvent.setHaveSentToServer(false);
            localMEATEREvent.setEventType(eventType);
            localMEATEREvent.setHaveConfirmedCookTime(isHaveConfirmedTime);
            this.localMEATEREvents.add(localMEATEREvent);
            publishEventForUI(com.apptionlabs.meater_app.app.a.i(), localMEATEREvent);
            if (isHaveConfirmedTime) {
                this.probe.getSavedCook().writeCurrentEventToDB(localMEATEREvent);
            }
        }
    }

    private boolean canAddEvent() {
        if ((this.probe.getConnectionMethod().isBluetoothConnectionMethod() || this.probe.getConnectionMethod() == DeviceConnectionMethod.PROBE_SIM) && this.probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            return true;
        }
        return false;
    }

    private void confirmCookTimeForEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        long cookTimeElapsed = this.probe.cookTimeElapsed();
        for (int i10 = 0; i10 < this.localMEATEREvents.size(); i10++) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(i10);
            if (!localMEATEREvent.haveConfirmedCookTime()) {
                long time = (currentTimeMillis - localMEATEREvent.getTime()) / 1000;
                MEATEREvent.Builder m221newBuilder = localMEATEREvent.getEvent().m221newBuilder();
                m221newBuilder.time(Integer.valueOf((int) (cookTimeElapsed - time)));
                localMEATEREvent.setEvent(m221newBuilder.m222build());
                this.localMEATEREvents.set(i10, localMEATEREvent);
                localMEATEREvent.setHaveConfirmedCookTime(true);
                Probe probe = this.probe;
                if (probe != null && probe.getSavedCook() != null) {
                    this.probe.getSavedCook().writeCurrentEventToDB(localMEATEREvent);
                }
            }
        }
    }

    private int firstUnPostedIndex() {
        for (int i10 = 0; i10 < this.localMEATEREvents.size(); i10++) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(i10);
            if (!localMEATEREvent.haveSentToServer() && localMEATEREvent.haveConfirmedCookTime()) {
                return i10;
            }
        }
        return -1;
    }

    public static ProbeEventLog forProbe(Probe probe) {
        ProbeEventLog probeEventLog = new ProbeEventLog();
        probeEventLog.probe = probe;
        return probeEventLog;
    }

    private boolean isHaveConfirmedTime() {
        if (this.probe.getConnectionState() == DeviceConnectionState.CONNECTED && (this.probe.haveFetchedTemperatureLogFromBLE() || this.probe.haveReceivedTemperatureLogFromRemote())) {
            return true;
        }
        return false;
    }

    private boolean isValidPosition(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return true;
        }
        return false;
    }

    private static boolean isValidString(String str, int i10) {
        if (str != null && str.length() <= i10) {
            return true;
        }
        return false;
    }

    private boolean lessThanFiveSecondsSinceLastEvent(LocalMEATEREvent localMEATEREvent) {
        if (localMEATEREvent != null && (System.currentTimeMillis() - localMEATEREvent.getTime()) / 1000 < 5) {
            return true;
        }
        return false;
    }

    private LocalMEATEREvent mostRecentBLERadioStateEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.BLERadioStateChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentBatteryLevelEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.ProbeBatteryLevelChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentCookSetupEventWithSequenceNumber() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.ProbeWriteCookSetupEvent) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentEstimatorLogEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.CookEstimatorLogRecording) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMEATERCloudStateEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.MEATERCloudStateChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMEATERLinkStateEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.MEATERLinkStateChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMEATERPlusAmbientTemperatureChange() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.DeviceTemperatureRecording) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMEATERPlusBatteryLevelEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.MEATERPlusBatteryLevelChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMeaterBlockRSSIEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.MEATERBlockBLERSSIChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentMeaterPlusRSSIEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.MEATERPlusRSSIChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentNetworkConnectivityStateEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.NetworkConnectivityStateChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private LocalMEATEREvent mostRecentRSSIEvent() {
        for (int size = this.localMEATEREvents.size() - 1; size >= 0; size--) {
            LocalMEATEREvent localMEATEREvent = this.localMEATEREvents.get(size);
            if (localMEATEREvent.getEventType() == EventType.ProbeRSSIChange) {
                return localMEATEREvent;
            }
        }
        return null;
    }

    private void publishEventForUI(Context context, LocalMEATEREvent localMEATEREvent) {
        EventLogUtility eventLogUtility;
        if (uiBroadCastProbeEvent && (eventLogUtility = this.eventUtility) != null) {
            String eventText = eventLogUtility.getEventText(localMEATEREvent);
            Intent intent = new Intent(ProtocolParameters.PROBE_EVENT_LOG_NOTIF);
            intent.setPackage(context.getPackageName());
            intent.putExtra("event_log", eventText);
            intent.putExtra("sn", this.probe.getDeviceIDString());
            context.getApplicationContext().sendBroadcast(intent);
        }
    }

    public void addAlertFiredEventForAlert(AlarmType alarmType, int i10, String str) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().alertFiredEvent(new AlertFiredEvent.Builder().type(alarmType).limit(Integer.valueOf(i10)).name(str).m141build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.AlertFiredEvent);
    }

    public void addBLEProbeConnectionEventWithState(BLEProbeConnectionState bLEProbeConnectionState, int i10, int i11) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().bleProbeConnectionEvent(new BLEProbeConnectionEvent.Builder().timeToConnect(Integer.valueOf(i10)).state(bLEProbeConnectionState).m150build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.BLEProbeConnectionEvent);
        if (i11 != -1) {
            addErrorEvent("Disconnect with error code = " + i11);
        }
    }

    public void addErrorEvent(String str) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().error(new MEATERErrorEvent.Builder().errorMessage(str).m219build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ErrorEvent);
    }

    public void addEstimatorLogRecording(int i10, int i11, int i12, int i13, DeviceCookState deviceCookState, boolean z10) {
        CookEstimatorLogRecording cookEstimatorLogRecording;
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentEstimatorLogEvent = mostRecentEstimatorLogEvent();
        if (mostRecentEstimatorLogEvent != null) {
            cookEstimatorLogRecording = mostRecentEstimatorLogEvent.getEvent().cookEstimatorLogRecording;
        } else {
            cookEstimatorLogRecording = null;
        }
        if (mostRecentEstimatorLogEvent != null && cookEstimatorLogRecording.timeRemainingEstimate.intValue() == i10 && cookEstimatorLogRecording.internal.intValue() == i11 && cookEstimatorLogRecording.ambient.intValue() == i12 && cookEstimatorLogRecording.target.intValue() == i13 && cookEstimatorLogRecording.cookState == deviceCookState) {
            return;
        }
        addEvent(new MEATEREvent.Builder().cookEstimatorLogRecording(new CookEstimatorLogRecording.Builder().timeRemainingEstimate(Integer.valueOf(i10)).internal(Integer.valueOf(i11)).ambient(Integer.valueOf(i12)).target(Integer.valueOf(i13)).cookState(deviceCookState).cookLogUnavailable(Boolean.valueOf(z10)).m165build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.CookEstimatorLogRecording);
    }

    public void addEventsAtCookStart() {
        Probe probe;
        if (canAddEvent() && (probe = this.probe) != null) {
            MEATERDevice parentDevice = probe.getParentDevice();
            batteryLevelChanged(this.probe.batteryLevel);
            if (parentDevice != null) {
                meaterPlusBatteryLevelChanged(parentDevice.batteryLevel);
                int i10 = parentDevice.ambientTemperature;
                if (i10 > 0) {
                    meaterDeviceAmbientTemperatureChanged(i10);
                }
            }
        }
    }

    public void addEventsForInitialParticipants() {
        Iterator<q> it = k.e0().t().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            addMLSubscriptionEventForSubscriber(it.next(), MEATERLinkClientSubscriptionState.MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE, i10);
        }
    }

    public void addLocalEvent(LocalMEATEREvent localMEATEREvent) {
        this.localMEATEREvents.add(localMEATEREvent);
    }

    public void addMEATERPlusConnectionEventWithState(BLEProbeConnectionState bLEProbeConnectionState) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().meaterPlusProbeConnectionEvent(new MEATERPlusProbeConnectionEvent.Builder().state(bLEProbeConnectionState).m237build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERPlusProbeConnectionEvent);
    }

    public void addMLSubscriptionEventForSubscriber(q qVar, MEATERLinkClientSubscriptionState mEATERLinkClientSubscriptionState, int i10) {
        if (!canAddEvent()) {
            return;
        }
        MEATERLinkClientSubscriptionEvent.Builder builder = new MEATERLinkClientSubscriptionEvent.Builder();
        builder.state(mEATERLinkClientSubscriptionState);
        MasterType b10 = qVar.b();
        if (b10 != null) {
            builder.clientType(b10);
        }
        String e10 = qVar.e();
        if (isValidString(e10, MAX_EMAIL_ADDRESS_LENGTH)) {
            builder.emailAddress(e10);
        }
        String d10 = qVar.d();
        if (isValidString(d10, 31)) {
            builder.deviceInfo(d10);
        }
        String a10 = qVar.a();
        if (isValidString(a10, 11)) {
            builder.appVersion(a10);
        }
        String h10 = qVar.h();
        if (isValidString(h10, 11)) {
            builder.osVersion(h10);
        }
        builder.currentSubscriberCount(Integer.valueOf(i10));
        addEvent(new MEATEREvent.Builder().meaterLinkClientSubscriptionEvent(builder.m228build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERLinkClientSubscriptionEvent);
    }

    public void addManuallyMovedToRestingEvent() {
        addEvent(new MEATEREvent.Builder().appActionMessage(new AppActionMessage.Builder().manuallyMoveToResting(Boolean.TRUE).m144build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERCloudStateChange);
    }

    public void addProbeResetEvent(int i10, int i11) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().probeReset(new MEATERDeviceReset.Builder().counter(Integer.valueOf(i10)).source(Integer.valueOf(i11)).m213build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERDeviceReset);
    }

    public void addReadCookSetupEventWithState(ProbeCookSetupState probeCookSetupState) {
        if (probeCookSetupState != null) {
            addEvent(new MEATEREvent.Builder().probeReadCookSetupEvent(new ProbeReadCookSetupEvent.Builder().state(probeCookSetupState).m339build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ProbeReadCookSetupEvent);
        }
    }

    public void addReadTempLogEventWithCount(int i10, int i11, int i12, boolean z10) {
        if (!canAddEvent()) {
            return;
        }
        addEvent(new MEATEREvent.Builder().probeReadTempLogEvent(new ProbeReadTempLogEvent.Builder().count(Integer.valueOf(i10)).interval(Integer.valueOf(i11)).diffFromMaster(Integer.valueOf(i12)).needToReadAgain(Boolean.valueOf(z10)).m342build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ProbeReadTempLogEvent);
    }

    public void batteryLevelChanged(int i10) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentBatteryLevelEvent = mostRecentBatteryLevelEvent();
        if (mostRecentBatteryLevelEvent != null && mostRecentBatteryLevelEvent.getEvent().probeBatteryLevelChange.batteryLevelPercent.intValue() == i10) {
            return;
        }
        addEvent(new MEATEREvent.Builder().probeBatteryLevelChange(new ProbeBatteryLevelChange.Builder().batteryLevelPercent(Integer.valueOf(i10)).m318build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ProbeBatteryLevelChange);
    }

    public void bleRadioStateChanged(BLERadioState bLERadioState) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentBLERadioStateEvent = mostRecentBLERadioStateEvent();
        if (mostRecentBLERadioStateEvent != null && mostRecentBLERadioStateEvent.getEvent().radioStateChange.state == bLERadioState) {
            return;
        }
        addEvent(new MEATEREvent.Builder().radioStateChange(new BLERadioStateChange.Builder().state(bLERadioState).m153build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.BLERadioStateChange);
    }

    public void cookSetupEventWithSequenceNumber(int i10) {
        k6.b.g("adding cookSetupEventWithSequenceNumber sequenceNumber = %s", Integer.valueOf(i10));
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentCookSetupEventWithSequenceNumber = mostRecentCookSetupEventWithSequenceNumber();
        if (mostRecentCookSetupEventWithSequenceNumber != null && mostRecentCookSetupEventWithSequenceNumber.getEvent().probeWriteCookSetupEvent.sequenceNumber.intValue() == i10) {
            return;
        }
        addEvent(new MEATEREvent.Builder().probeWriteCookSetupEvent(new ProbeWriteCookSetupEvent.Builder().sequenceNumber(Integer.valueOf(i10)).m351build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ProbeReadCookSetupEvent);
    }

    public ArrayList<String> getCurrentProbeEventLogMessages() {
        this.eventUtility = new EventLogUtility();
        this.eventLogMessages = new ArrayList<>();
        Iterator<LocalMEATEREvent> it = this.localMEATEREvents.iterator();
        while (it.hasNext()) {
            this.eventLogMessages.add(this.eventUtility.getEventText(it.next()));
        }
        return this.eventLogMessages;
    }

    public void markPostAfterDone() {
        for (int i10 = this.fromIndexOfListToPost; i10 < this.toIndexOfListToPost; i10++) {
            if (i10 < this.localMEATEREvents.size()) {
                this.localMEATEREvents.get(i10).setHaveSentToServer(true);
            }
        }
    }

    public void meaterBlockBLERSSIChanged(int i10) {
        Probe probe = this.probe;
        if (probe != null && probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            LocalMEATEREvent mostRecentMeaterBlockRSSIEvent = mostRecentMeaterBlockRSSIEvent();
            if ((mostRecentMeaterBlockRSSIEvent != null && mostRecentMeaterBlockRSSIEvent.getEvent().meaterBlockBLERSSIChange.rssi.intValue() == i10) || lessThanFiveSecondsSinceLastEvent(mostRecentMeaterBlockRSSIEvent)) {
                return;
            }
            if (mostRecentMeaterBlockRSSIEvent != null && Math.abs(mostRecentMeaterBlockRSSIEvent.getEvent().meaterBlockBLERSSIChange.rssi.intValue() - i10) < 10) {
                return;
            }
            addEvent(new MEATEREvent.Builder().meaterBlockBLERSSIChange(new MEATERBlockBLERSSIChange.Builder().rssi(Integer.valueOf(i10)).m207build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERBlockBLERSSIChange);
        }
    }

    public void meaterCloudStateChanged(MEATERCloudState mEATERCloudState) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentMEATERCloudStateEvent = mostRecentMEATERCloudStateEvent();
        if (mostRecentMEATERCloudStateEvent != null && mostRecentMEATERCloudStateEvent.getEvent().meaterCloudStateChange.state == mEATERCloudState) {
            return;
        }
        addEvent(new MEATEREvent.Builder().meaterCloudStateChange(new MEATERCloudStateChange.Builder().state(mEATERCloudState).m210build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERCloudStateChange);
    }

    public void meaterDeviceAmbientTemperatureChanged(int i10) {
        k6.b.g("AmbientTemperatureChanged adding  ambient temperature = %s", Integer.valueOf(i10));
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentMEATERPlusAmbientTemperatureChange = mostRecentMEATERPlusAmbientTemperatureChange();
        if ((mostRecentMEATERPlusAmbientTemperatureChange != null && mostRecentMEATERPlusAmbientTemperatureChange.getEvent().deviceTemperatureRecording.ambient.intValue() == i10) || lessThanFiveSecondsSinceLastEvent(mostRecentMEATERPlusAmbientTemperatureChange)) {
            return;
        }
        addEvent(new MEATEREvent.Builder().deviceTemperatureRecording(new MEATERDeviceTemperatureRecording.Builder().ambient(Integer.valueOf(i10)).m216build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.DeviceTemperatureRecording);
    }

    public void meaterLinkStateChanged(MEATERLinkState mEATERLinkState) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentMEATERLinkStateEvent = mostRecentMEATERLinkStateEvent();
        if (mostRecentMEATERLinkStateEvent != null && mostRecentMEATERLinkStateEvent.getEvent().meaterLinkStateChange.state == mEATERLinkState) {
            return;
        }
        addEvent(new MEATEREvent.Builder().meaterLinkStateChange(new MEATERLinkStateChange.Builder().state(mEATERLinkState).m231build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERLinkStateChange);
    }

    public void meaterPlusBatteryLevelChanged(int i10) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentMEATERPlusBatteryLevelEvent = mostRecentMEATERPlusBatteryLevelEvent();
        if (mostRecentMEATERPlusBatteryLevelEvent != null && mostRecentMEATERPlusBatteryLevelEvent.getEvent().meaterPlusBatteryLevelChange.batteryLevelPercent.intValue() == i10) {
            return;
        }
        addEvent(new MEATEREvent.Builder().meaterPlusBatteryLevelChange(new MEATERPlusBatteryLevelChange.Builder().batteryLevelPercent(Integer.valueOf(i10)).m234build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERPlusBatteryLevelChange);
    }

    public void meaterPlusRSSIChanged(int i10) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentMeaterPlusRSSIEvent = mostRecentMeaterPlusRSSIEvent();
        if ((mostRecentMeaterPlusRSSIEvent != null && mostRecentMeaterPlusRSSIEvent.getEvent().meaterPlusRSSIChange.rssi.intValue() == i10) || lessThanFiveSecondsSinceLastEvent(mostRecentMeaterPlusRSSIEvent)) {
            return;
        }
        if (mostRecentMeaterPlusRSSIEvent != null && Math.abs(mostRecentMeaterPlusRSSIEvent.getEvent().meaterPlusRSSIChange.rssi.intValue() - i10) < 10) {
            return;
        }
        addEvent(new MEATEREvent.Builder().meaterPlusRSSIChange(new MEATERPlusRSSIChange.Builder().rssi(Integer.valueOf(i10)).m240build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.MEATERPlusRSSIChange);
    }

    public byte[] msgForCloudWithProbe(long j10, long j11) {
        if (com.apptionlabs.meater_app.app.a.u().k() == null) {
            return null;
        }
        MEATEREventList.Builder builder = new MEATEREventList.Builder();
        String str = com.apptionlabs.meater_app.app.a.u().k().email;
        if (isValidString(str, MAX_EMAIL_ADDRESS_LENGTH)) {
            builder.emailAddress(str);
        }
        String o10 = com.apptionlabs.meater_app.app.a.o();
        if (isValidString(o10, MAX_EMAIL_ADDRESS_LENGTH)) {
            builder.deviceInfo(o10);
        }
        String j12 = com.apptionlabs.meater_app.app.a.j();
        if (isValidString(j12, 63)) {
            builder.appVersion(j12);
        }
        String h10 = com.apptionlabs.meater_app.app.a.h();
        if (isValidString(h10, 63)) {
            builder.osVersion(h10);
        }
        int firstUnPostedIndex = firstUnPostedIndex();
        this.fromIndexOfListToPost = firstUnPostedIndex;
        int min = Math.min(firstUnPostedIndex + 50, this.localMEATEREvents.size());
        int i10 = this.fromIndexOfListToPost;
        this.toIndexOfListToPost = i10;
        while (i10 < min && isValidPosition(i10, min) && this.localMEATEREvents.get(i10).haveConfirmedCookTime()) {
            builder.events.add(this.localMEATEREvents.get(i10).getEventByte());
            this.toIndexOfListToPost++;
            i10++;
        }
        if (this.toIndexOfListToPost == this.fromIndexOfListToPost) {
            return null;
        }
        builder.probeSerialNum(Long.valueOf(j10));
        builder.cookID(Long.valueOf(j11));
        builder.meaterLinkIdentifier(MEATEREventList.DEFAULT_MEATERLINKIDENTIFIER);
        builder.versionMajor(Integer.valueOf(MeaterLinkMajorVersion.MEATER_LINK_MAJOR_LATEST.getValue()));
        builder.versionMinor(Integer.valueOf(MeaterLinkMinorVersion.MEATER_LINK_MINOR_LATEST.getValue()));
        builder.masterType(MasterType.MASTER_TYPE_ANDROID);
        builder.sendingDeviceCloudID(p.j(com.apptionlabs.meater_app.app.a.r(), 50));
        builder.m225build();
        return builder.m225build().encode();
    }

    public void networkConnectivityChanged(NetworkState networkState) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentNetworkConnectivityStateEvent = mostRecentNetworkConnectivityStateEvent();
        if (mostRecentNetworkConnectivityStateEvent != null && mostRecentNetworkConnectivityStateEvent.getEvent().networkConnectivityStateChange.state == networkState) {
            return;
        }
        addEvent(new MEATEREvent.Builder().networkConnectivityStateChange(new NetworkConnectivityStateChange.Builder().state(networkState).m288build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.NetworkConnectivityStateChange);
    }

    public void rssiChanged(int i10) {
        if (!canAddEvent()) {
            return;
        }
        LocalMEATEREvent mostRecentRSSIEvent = mostRecentRSSIEvent();
        if ((mostRecentRSSIEvent != null && mostRecentRSSIEvent.getEvent().probeRSSIChange.rssi.intValue() == i10) || lessThanFiveSecondsSinceLastEvent(mostRecentRSSIEvent)) {
            return;
        }
        if (mostRecentRSSIEvent != null && Math.abs(mostRecentRSSIEvent.getEvent().probeRSSIChange.rssi.intValue() - i10) < 10) {
            return;
        }
        addEvent(new MEATEREvent.Builder().probeRSSIChange(new ProbeRSSIChange.Builder().rssi(Integer.valueOf(i10)).m336build()).time(Integer.valueOf(this.probe.cookTimeElapsed())).m222build(), EventType.ProbeRSSIChange);
    }

    public void startUIBroadCastProbeEvents() {
        uiBroadCastProbeEvent = true;
    }

    public void stopBroadCastProbeEvents() {
        uiBroadCastProbeEvent = false;
    }
}
