package V4;

import P4.a;
import P5.I;
import c5.C2315c;
import com.apptionlabs.meater_app.cloud.MEATERFirebaseMessagingService;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.MasterDevice;
import com.apptionlabs.meater_app.model.OldCookID;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.v1protobuf.V1BlockFirmwareUpdateMessage;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkHeader;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkMinorVersion;
import com.apptionlabs.meater_app.v2protobuf.V2AlarmState;
import com.apptionlabs.meater_app.v2protobuf.V2AlarmType;
import com.apptionlabs.meater_app.v2protobuf.V2BlockFirmwareUpdateMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MLBlock;
import com.apptionlabs.meater_app.v2protobuf.V2MLDevice;
import com.apptionlabs.meater_app.v2protobuf.V2MLPlus;
import com.apptionlabs.meater_app.v2protobuf.V2MLProbe;
import com.apptionlabs.meater_app.v2protobuf.V2MasterMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkHeader;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkMinorVersion;
import com.apptionlabs.meater_app.v2protobuf.V2NetworkSettingsRequestMessage;
import com.apptionlabs.meater_app.v2protobuf.V2ProbeAlarm;
import com.apptionlabs.meater_app.v2protobuf.V2ProbeCookState;
import com.apptionlabs.meater_app.v2protobuf.V2ProbeSetup;
import com.apptionlabs.meater_app.v2protobuf.V2ProbeStatus;
import com.apptionlabs.meater_app.v2protobuf.V2SetupMessage;
import com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistoryRequestMessage;
import com.apptionlabs.meater_app.v3protobuf.Alarm;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.BlockFirmwareUpdateMessage;
import com.apptionlabs.meater_app.v3protobuf.ChargeState;
import com.apptionlabs.meater_app.v3protobuf.ChargingStatus;
import com.apptionlabs.meater_app.v3protobuf.CloudConnectionState;
import com.apptionlabs.meater_app.v3protobuf.ConnectionState;
import com.apptionlabs.meater_app.v3protobuf.CookSetup;
import com.apptionlabs.meater_app.v3protobuf.CookStatus;
import com.apptionlabs.meater_app.v3protobuf.CookingApplianceValue;
import com.apptionlabs.meater_app.v3protobuf.DeviceConnectionType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.EstimatorConfig;
import com.apptionlabs.meater_app.v3protobuf.EstimatorType;
import com.apptionlabs.meater_app.v3protobuf.MCCookStatsMessage;
import com.apptionlabs.meater_app.v3protobuf.MCDeviceInfo;
import com.apptionlabs.meater_app.v3protobuf.MCEstimatorConfigurationProposal;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import com.apptionlabs.meater_app.v3protobuf.MCPushNotificationMessage;
import com.apptionlabs.meater_app.v3protobuf.MCSubscriptionMessage;
import com.apptionlabs.meater_app.v3protobuf.MCTemperatureScale;
import com.apptionlabs.meater_app.v3protobuf.MLBlock;
import com.apptionlabs.meater_app.v3protobuf.MLChildDevice;
import com.apptionlabs.meater_app.v3protobuf.MLDevice;
import com.apptionlabs.meater_app.v3protobuf.MLPlus;
import com.apptionlabs.meater_app.v3protobuf.MLProbe;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterStatusMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterStatusRequestMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkHeader;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMinorVersion;
import com.apptionlabs.meater_app.v3protobuf.NetworkSettingsRequestMessage;
import com.apptionlabs.meater_app.v3protobuf.SetupMessage;
import com.apptionlabs.meater_app.v3protobuf.SubscriptionMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistory;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryRequestMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureRange;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l8.C3918k;
import o4.Recipe;
import x4.b;
import z4.c0;

/* compiled from: MLMessage.java */
/* loaded from: classes2.dex */
public class p {

    /* compiled from: MLMessage.java */
    private static class a implements Comparator<T4.p> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(T4.p pVar, T4.p pVar2) {
            if (pVar.getDeviceID() - pVar2.getDeviceID() > 0) {
                return 1;
            }
            return pVar.getDeviceID() - pVar2.getDeviceID() < 0 ? -1 : 0;
        }

        private a() {
        }
    }

    public static SubscriptionMessage A(List<T4.p> list, int i10) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<T4.p> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().getDeviceID()));
                if (arrayList.size() == 12) {
                    break;
                }
            }
        }
        return new SubscriptionMessage.Builder().desiredDevices(arrayList).clientType(MasterType.MASTER_TYPE_ANDROID).emailAddress(c()).deviceInfo(j(x4.g.n(), 32)).appVersion(j(x4.g.i(), 12)).osVersion(j(x4.g.g(), 12)).build();
    }

    public static MCSubscriptionMessage B(List<T4.p> list, List<T4.p> list2, MEATERCloudAccount mEATERCloudAccount) {
        try {
            Collections.sort(list, new a());
            Collections.sort(list2, new a());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < Math.min(list.size(), 8); i10++) {
                arrayList.add(Long.valueOf(list.get(i10).getDeviceID()));
            }
            for (int i11 = 0; i11 < Math.min(list2.size(), 12); i11++) {
                arrayList2.add(Long.valueOf(list2.get(i11).getDeviceID()));
            }
            MCTemperatureScale mCTemperatureScale = MCTemperatureScale.TEMPERATURE_SCALE_CELSIUS;
            if (x4.g.t().n1()) {
                mCTemperatureScale = MCTemperatureScale.TEMPERATURE_SCALE_FAHRENHEIT;
            }
            if (mEATERCloudAccount == null) {
                return null;
            }
            MCSubscriptionMessage.Builder builderLanguage = new MCSubscriptionMessage.Builder().emailAddress(mEATERCloudAccount.email).masterDevices(arrayList).clientDevices(arrayList2).temperatureScale(mCTemperatureScale).criticalAlerts(Boolean.valueOf(C2315c.a())).criticalAlertsVolume(Integer.valueOf(L5.c.f10824j)).language(Locale.getDefault().getLanguage());
            String strA = MEATERFirebaseMessagingService.INSTANCE.a();
            if (strA != null) {
                builderLanguage.apnsToken(Cc.h.s(strA));
            }
            return builderLanguage.build();
        } catch (Exception unused) {
            x4.b.f(b.EnumC0768b.f52659N1.title, "", "");
            return null;
        }
    }

    static TemperatureHistoryMessage C(Probe probe, int i10) {
        return new TemperatureHistoryMessage.Builder().cookID(Long.valueOf(probe.getCookID())).deviceID(Long.valueOf(probe.getDeviceID())).history(probe.getTemperatureLog().createTemperatureLog().toTemperatureHistory(probe.getCookStartTime().getTime())).build();
    }

    static TemperatureHistoryRequestMessage D(Probe probe, int i10) {
        return new TemperatureHistoryRequestMessage.Builder().deviceID(Long.valueOf(probe.getDeviceID())).build();
    }

    private static void E(CookSetup cookSetup, Probe probe) {
        ArrayList arrayList = new ArrayList(probe.getAlerts());
        ArrayList<Alert> arrayList2 = new ArrayList<>();
        boolean z10 = cookSetup.alarms.size() != arrayList.size();
        for (int i10 = 0; i10 < cookSetup.alarms.size(); i10++) {
            Alarm alarm = cookSetup.alarms.get(i10);
            Alert alertV = v(arrayList, alarm);
            if (alertV != null) {
                arrayList.remove(alertV);
                if (!C3918k.a(alertV.getName(), alarm.name)) {
                    alertV.setName(alarm.name);
                    z10 = true;
                }
                AlarmType type = alertV.getType();
                AlarmType alarmType = alarm.type;
                if (type != alarmType) {
                    alertV.setType(alarmType);
                    z10 = true;
                }
                if (alertV.getLimit() != alarm.limit.intValue()) {
                    alertV.setLimit(alarm.limit.intValue());
                    z10 = true;
                }
                AlarmState state = alertV.getState();
                AlarmState alarmState = alarm.state;
                if (state != alarmState) {
                    alertV.setState(alarmState);
                    if (alertV.getState() == AlarmState.ALARM_STATE_FIRED) {
                        alertV.fireForProbe(probe);
                    } else {
                        alertV.hideIfVisible();
                    }
                    z10 = true;
                }
                Integer num = alarm.lastFireTime;
                if (num != null && num.intValue() > 0 && probe.getCookStartTime() != null) {
                    alertV.setLastFireDate(probe.getCookStartTime().getTime() + (alarm.lastFireTime.intValue() * 1000));
                }
            } else {
                alertV = new Alert();
                alertV.setName(alarm.name);
                alertV.setType(alarm.type);
                alertV.setLimit(alarm.limit.intValue());
                alertV.setState(alarm.state);
                alertV.setCreatedDate(System.currentTimeMillis());
                if (alertV.getState() == AlarmState.ALARM_STATE_FIRED) {
                    if (alertV.needsToFireForProbe(probe)) {
                        alertV.fireForProbe(probe);
                    } else {
                        alertV.setState(AlarmState.ALARM_STATE_DISMISSED);
                    }
                }
                z10 = true;
            }
            arrayList2.add(alertV);
        }
        if (z10) {
            probe.setAlerts(arrayList2);
        }
    }

    public static h F(Probe probe, CookSetup cookSetup, s sVar) {
        String str;
        String str2;
        MeatCookingTemperature rangeFromTemperature;
        boolean z10;
        int iIntValue;
        int iIntValue2;
        c0 c0Var;
        Long l10 = cookSetup.cookID;
        if (l10 == null || l10.longValue() == 0) {
            return h.REJECTED;
        }
        if (sVar == s.REMOTE_DEVICE && probe.getConnectionMethod().isBluetoothConnectionMethod() && ((c0Var = (c0) probe.getBleConnection()) == null || !c0Var.U())) {
            U4.b.g("Cook setup from %s rejected for %s because we have not finished reading cook setup from BLE.", sVar.toString(), probe.getDebugLogDescription());
            U4.b.t("CHINTAN ***** CookSetup Rejected", new Object[0]);
            return h.REJECTED;
        }
        String upperCase = Long.toHexString(cookSetup.cookID.longValue()).toUpperCase();
        boolean z11 = probe.getConnectionMethod().isBluetoothConnectionMethod() || probe.getConnectionMethod() == DeviceConnectionMethod.PROBE_SIM;
        boolean z12 = cookSetup.cookID.longValue() != probe.getCookID();
        if (z11) {
            if (z12 && probe.getCookID() != 0) {
                if (OldCookID.isOldCookID(cookSetup.cookID.longValue())) {
                    U4.b.g("Cook setup %s from %s rejected for %s because this is an old CookID.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                    U4.b.t("CHINTAN ***** CookSetup Rejected", new Object[0]);
                    return h.REJECTED;
                }
                if (cookSetup.state == DeviceCookState.COOK_STATE_NOT_STARTED) {
                    U4.b.g("Cook setup %s from %s rejected for %s because it's a different CookID from the current one, but the new cook is not started or finished.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                    U4.b.t("CHINTAN ***** CookSetup Rejected", new Object[0]);
                    return h.REJECTED;
                }
            }
        } else if (z12 && probe.getCookID() != 0 && OldCookID.isOldCookIDAndSeqNum(cookSetup.cookID.longValue(), cookSetup.sequenceNumber.intValue())) {
            U4.b.g("Cook setup %s from %s rejected for %s because this is an old CookID.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
            U4.b.t("CHINTAN ***** CookSetup Rejected", new Object[0]);
            return h.REJECTED;
        }
        if (z12 || cookSetup.sequenceNumber.intValue() != probe.getSetupSeqNum()) {
            MeatCut meatCut = probe.getmCut();
            String str3 = meatCut != null ? meatCut.cutType.meat.name : "-";
            String str4 = meatCut != null ? meatCut.name : "-";
            String str5 = (meatCut == null || (rangeFromTemperature = MeatCutsHelper.getInstance().getRangeFromTemperature(probe.getTargetInternalTemperature(), meatCut.temperatureRanges)) == null) ? "-" : rangeFromTemperature.name;
            U4.b.g("---", new Object[0]);
            U4.b.g("Setups are different (source: %s):", sVar.toString());
            U4.b.g("---", new Object[0]);
            U4.b.g("Old setup:", new Object[0]);
            U4.b.g("CookID: %s seq: %d", probe.cookIDString(), Integer.valueOf(probe.getSetupSeqNum()));
            U4.b.g("%s %s %s", str3, str4, str5);
            U4.b.g("Target: %s", Temperature.displayTemperature(probe.getTargetInternalTemperature()));
            U4.b.g("Cook State: %s", probe.getCookState().toString());
            U4.b.g("---", new Object[0]);
            if (meatCut != null) {
                str2 = meatCut.cutType.meat.category.name + "-";
                str = meatCut.cutType.name + "-";
            } else {
                str = "-";
                str2 = str;
            }
            U4.b.r("New setup:", new Object[0]);
            U4.b.r("CookID: %s seq: %d", upperCase, cookSetup.sequenceNumber);
            U4.b.r("%s %s %s", str2, str, "-");
            U4.b.r("Target: %s", Temperature.displayTemperature(cookSetup.targetInternalTemperature.intValue()));
            U4.b.r("Cook State: %s", cookSetup.state.toString());
            U4.b.r("---", new Object[0]);
        }
        if (z12 || cookSetup.state == DeviceCookState.COOK_STATE_NOT_STARTED) {
            if (probe.getCookState().getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
                U4.b.g("Cook setup %s from %s for %s will end cook %s", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription(), probe.cookIDString());
                probe.cancelCook(false);
            }
            probe.setCookID(cookSetup.cookID.longValue());
            probe.setSetupSeqNum(0);
        }
        OldCookID.recordCookIDWithSeqNum(cookSetup.cookID.longValue(), cookSetup.sequenceNumber.intValue());
        if (z12) {
            z10 = true;
        } else {
            if (z11) {
                z10 = true;
                if (cookSetup.sequenceNumber.intValue() < probe.getSetupSeqNum() + 1) {
                    if (cookSetup.sequenceNumber.intValue() != 0 || probe.getSetupSeqNum() != 0) {
                        if (sVar != s.PROBE) {
                            U4.b.g("Cook setup %s from %s rejected for %s because it has an older seq num.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                            return h.REJECTED;
                        }
                        if (cookSetup.sequenceNumber.intValue() == probe.getSetupSeqNum()) {
                            U4.b.g("Cook setup %s from %s for %s is the same as our current setup", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                            return h.ACCEPTED;
                        }
                        U4.b.g("Cook setup %s from %s rejected for %s because it has an older seq num.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                        return h.REJECTED_OUT_OF_DATE;
                    }
                }
            } else {
                z10 = true;
            }
            if (!z11 && cookSetup.sequenceNumber.intValue() < probe.getSetupSeqNum()) {
                U4.b.g("Cook setup %s from %s rejected for %s because it has an older seq num.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
                return h.REJECTED_OUT_OF_DATE;
            }
        }
        int setupSeqNum = probe.getSetupSeqNum();
        probe.setSetupSeqNum(cookSetup.sequenceNumber.intValue());
        DeviceCookState deviceCookState = cookSetup.state;
        DeviceCookState deviceCookState2 = DeviceCookState.COOK_STATE_NOT_STARTED;
        if (deviceCookState == deviceCookState2) {
            probe.resetCook();
        } else {
            probe.setTargetInternalTemperature(cookSetup.targetInternalTemperature.intValue());
            TemperatureRange temperatureRange = cookSetup.targetAmbientTemperature;
            if (temperatureRange == null || temperatureRange.low.intValue() <= 0) {
                probe.setTargetMinimumAmbientTemperature(0);
                probe.setTargetMaximumAmbientTemperature(0);
            } else {
                probe.setTargetMinimumAmbientTemperature(temperatureRange.low.intValue());
                probe.setTargetMaximumAmbientTemperature(temperatureRange.low.intValue() + temperatureRange.offset.intValue());
            }
            if (cookSetup.state.getValue() > deviceCookState2.getValue()) {
                MeatCut meatCut2 = cookSetup.cutID == null ? null : MeatCutsHelper.getInstance().getMeatCut(cookSetup.cutID.intValue());
                boolean z13 = meatCut2 != null ? z10 : false;
                if (cookSetup.presetID == null) {
                    z10 = false;
                }
                MeatCookingTemperature presetFromId = (z10 && z13) ? MeatCutsHelper.getInstance().getPresetFromId(meatCut2.temperatureRanges, cookSetup.presetID.intValue()) : null;
                probe.setmCut(meatCut2);
                probe.setCookPreset(presetFromId);
            }
            probe.setCookName(cookSetup.name);
        }
        EstimatorConfig estimatorConfig = cookSetup.estimatorConfig;
        if (estimatorConfig != null) {
            probe.setTemperatureChangeBeforeReady(estimatorConfig.temperatureChangeBeforeReady.intValue());
            probe.setSecondsDelayBeforeReady(cookSetup.estimatorConfig.secondsDelayBeforeReady.intValue());
            probe.setSecondsDelayBeforeResting(cookSetup.estimatorConfig.secondsDelayBeforeResting.intValue());
            Integer num = cookSetup.estimatorConfig.temperatureOffsetBeforeRemoveFromHeat;
            if (num == null || num.intValue() == 0) {
                probe.setTemperatureOffsetBeforeRemoveFromHeat(0);
            } else {
                probe.setTemperatureOffsetBeforeRemoveFromHeat(cookSetup.estimatorConfig.temperatureOffsetBeforeRemoveFromHeat.intValue());
            }
        }
        E(cookSetup, probe);
        if (cookSetup.state != probe.getCookState()) {
            if (cookSetup.state.getValue() > deviceCookState2.getValue() && cookSetup.state != DeviceCookState.COOK_STATE_FINISHED && probe.getCookState() == deviceCookState2) {
                probe.startCook(false);
            }
            probe.getCookEstimate().w(cookSetup.state);
        }
        if (cookSetup.clipNumber != null && probe.getClipNumber() != cookSetup.clipNumber.intValue()) {
            probe.setClipNumber(cookSetup.clipNumber.intValue());
        }
        Long l11 = cookSetup.ongoingRecipeID;
        if (l11 != null) {
            long jLongValue = l11.longValue();
            if (cookSetup.ongoingRecipeID.longValue() != probe.getOngoingRecipeID()) {
                probe.setOngoingRecipeID(cookSetup.ongoingRecipeID.longValue());
                jLongValue = cookSetup.ongoingRecipeID.longValue();
            }
            Integer num2 = cookSetup.recipeID;
            if (num2 != null) {
                if (num2.intValue() != probe.getRecipeId()) {
                    probe.setRecipeId(cookSetup.recipeID.intValue());
                }
                iIntValue = cookSetup.recipeID.intValue();
            } else {
                iIntValue = -1;
            }
            Integer num3 = cookSetup.recipeStepID;
            if (num3 != null) {
                if (num3.intValue() != probe.getRecipeStepID()) {
                    probe.setRecipeStepID(cookSetup.recipeStepID.intValue());
                }
                iIntValue2 = cookSetup.recipeStepID.intValue();
            } else {
                iIntValue2 = -1;
            }
            if (jLongValue != -1 && iIntValue != 0 && iIntValue2 != -1) {
                K4.a aVar = K4.a.f8678a;
                K4.b bVarE = aVar.e(jLongValue);
                Recipe recipeG = x5.g.f52863a.g(iIntValue);
                if (recipeG != null) {
                    if (bVarE == null) {
                        aVar.j(jLongValue, iIntValue, iIntValue2, probe, recipeG);
                    } else if (bVarE.getRecipeId() == iIntValue && bVarE.getProbeId() == probe.getDeviceID() && (bVarE.getStepNumber() != iIntValue2 || setupSeqNum != cookSetup.sequenceNumber.intValue())) {
                        aVar.n(bVarE.getOngoingRecipeId(), iIntValue, iIntValue2, probe.getDeviceID(), recipeG);
                        aVar.o(jLongValue, recipeG);
                    }
                }
            }
        } else {
            probe.setOngoingRecipeID(-1L);
            probe.setRecipeId(-1);
            probe.setRecipeStepID(-1);
        }
        AlarmState alarmState = cookSetup.flareUpAlert;
        if (alarmState != null) {
            probe.setFlareUpAlertState(alarmState);
        } else {
            probe.setFlareUpAlertState(AlarmState.ALARM_STATE_NOT_READY);
        }
        Integer num4 = cookSetup.cookingAppliance;
        if (num4 != null) {
            probe.setCookingAppliance(CookingApplianceValue.fromValue(num4.intValue()));
        } else {
            probe.setCookingAppliance(CookingApplianceValue.UNKNOWN_APPLIANCE);
        }
        probe.setCookStateAndShowNotificationsIfNeeded(cookSetup.state);
        if (z12 || cookSetup.sequenceNumber.intValue() != probe.getSetupSeqNum()) {
            U4.b.g("Cook setup %s from %s accepted for %s.", Long.toHexString(cookSetup.cookID.longValue()).toUpperCase(), sVar.toString(), probe.getDebugLogDescription());
        }
        return h.ACCEPTED;
    }

    static void G(Probe probe, CookStatus cookStatus) {
        Temperature.Temperatures_t temperatures_t = new Temperature.Temperatures_t();
        temperatures_t.internalSensorCount = cookStatus.internalTemperatures.size();
        temperatures_t.ambientTemperature = cookStatus.ambientTemperature.intValue();
        temperatures_t.internalTemperatures = new int[cookStatus.internalTemperatures.size()];
        for (int i10 = 0; i10 < cookStatus.internalTemperatures.size(); i10++) {
            temperatures_t.internalTemperatures[i10] = cookStatus.internalTemperatures.get(i10).intValue();
        }
        probe.setAmbientTemperature(cookStatus.ambientTemperature.intValue());
        probe.setInternalTemperature(cookStatus.internalTemperature.intValue());
        probe.setTemperatures(temperatures_t);
        probe.setPeakTemperature(cookStatus.peakTemperature.intValue());
        probe.setTimeRemaining(cookStatus.remainingCookTime.intValue());
        if (cookStatus.elapsedTime.intValue() == 0) {
            probe.setCookStartTime(null);
        } else {
            probe.setCookStartTime(k(-cookStatus.elapsedTime.intValue()));
        }
        if (probe.appearsToHaveCookInProgress()) {
            probe.getTemperatureLog().addRecording(cookStatus.internalTemperature.intValue(), cookStatus.ambientTemperature.intValue());
        }
    }

    static boolean H(Probe probe, TemperatureHistory temperatureHistory) {
        if (temperatureHistory.values.size() > 120) {
            U4.b.w("Got invalid number of temperature readings - will ignore", new Object[0]);
            return false;
        }
        if (temperatureHistory.interval.intValue() == 0) {
            U4.b.w("Got invalid interval for temperature readings - will ignore", new Object[0]);
            return false;
        }
        double size = temperatureHistory.values.size() * temperatureHistory.interval.intValue();
        double totalTime = probe.getTemperatureLog().getTotalTime();
        if (size < 0.75d * totalTime && Math.abs(size - totalTime) > 10.0d) {
            U4.b.w("******Temperature log duration from remote (%s) is substantially shorter than local (%s)******", I.b(size), I.b(totalTime));
        }
        TemperatureLog temperatureLogLogForProbe = TemperatureLog.logForProbe(probe, 5);
        temperatureLogLogForProbe.setCount(temperatureHistory.values.size());
        temperatureLogLogForProbe.setInterval(temperatureHistory.interval.intValue());
        for (int i10 = 0; i10 < temperatureHistory.values.size(); i10++) {
            temperatureLogLogForProbe.recordings[i10] = new TemperatureLogRecording(temperatureHistory.values.get(i10).internal.intValue(), temperatureHistory.values.get(i10).ambient.intValue());
        }
        temperatureLogLogForProbe.computeNewEstimatedStartTimeFromElapsedTime(temperatureLogLogForProbe.getCount() * temperatureLogLogForProbe.getInterval());
        probe.getTemperatureLog().updateWithTemperatureLog(temperatureLogLogForProbe);
        probe.getCookEstimate().u(temperatureLogLogForProbe.estimatorRecordings(), temperatureLogLogForProbe.getCount(), temperatureLogLogForProbe.getInterval(), probe.getCookState(), probe.getTargetInternalTemperature(), probe.getPeakTemperatures(), probe.slightlyOvercookedThresholdTemperature(), probe.overcookThresholdTemperature(), probe.isUsingGuidedCook() ? a.b.SMART : a.b.CUSTOM, probe.getCookEstimate().f13932A, probe.getSecondsDelayBeforeResting(), probe.getTemperatureChangeBeforeReady(), probe.getSecondsDelayBeforeReady(), probe.getMEATERDeviceType().numberOfInternalTemperatureSensorsForDevice(), probe.getTemperatureOffsetBeforeRemoveFromHeat());
        return true;
    }

    public static MeaterLinkHeader I(V2MeaterLinkHeader v2MeaterLinkHeader) {
        return new MeaterLinkHeader.Builder().meaterLinkIdentifier(v2MeaterLinkHeader.meaterLinkIdentifier).versionMajor(v2MeaterLinkHeader.versionMajor).versionMinor(v2MeaterLinkHeader.versionMinor).messageNumber(v2MeaterLinkHeader.messageNum).deviceID(0L).build();
    }

    public static MasterMessage J(V2MasterMessage v2MasterMessage) {
        MasterMessage.Builder builder = new MasterMessage.Builder();
        builder.masterType = MasterType.fromValue(v2MasterMessage.masterType.getValue());
        builder.cloudConnectionState = CloudConnectionState.fromValue(v2MasterMessage.cloudConnectionState.getValue());
        for (int i10 = 0; i10 < v2MasterMessage.devices.size(); i10++) {
            V2MLDevice v2MLDevice = v2MasterMessage.devices.get(i10);
            MLDevice.Builder builder2 = new MLDevice.Builder();
            V2MLProbe v2MLProbe = v2MLDevice.probe;
            if (v2MLProbe != null) {
                MLProbe.Builder builder3 = new MLProbe.Builder();
                builder2.identifier = v2MLProbe.identifier;
                builder2.probeNumber = v2MLProbe.probeNum;
                String str = v2MLProbe.firmwareRevision;
                if (str != null) {
                    builder2.firmwareRevision = str;
                }
                builder2.connectionState = ConnectionState.fromValue(v2MLProbe.connectionState.getValue());
                builder2.bleSignalLevel = v2MLProbe.bleSignalLevel;
                builder2.chargeState = m(v2MLProbe.batteryLevel.intValue() * 10);
                builder3.parentIdentifier = v2MLProbe.parentIdentifier;
                builder3.setup = d(v2MLProbe.setup);
                builder3.status = i(v2MLProbe.status);
                builder2.probe = builder3.build();
                builder2.connectionType = DeviceConnectionType.BLE;
            } else {
                V2MLPlus v2MLPlus = v2MLDevice.plus;
                if (v2MLPlus != null) {
                    MLPlus.Builder builder4 = new MLPlus.Builder();
                    builder2.identifier = v2MLPlus.identifier;
                    builder2.probeNumber = Integer.valueOf(MEATERDeviceType.PLUS.probeNumber);
                    String str2 = v2MLPlus.firmwareRevision;
                    if (str2 != null) {
                        builder2.firmwareRevision = str2;
                    }
                    builder2.connectionState = ConnectionState.fromValue(v2MLPlus.connectionState.getValue());
                    builder2.bleSignalLevel = v2MLPlus.bleSignalLevel;
                    builder2.chargeState = m(v2MLPlus.batteryLevel.intValue());
                    builder2.plus = builder4.build();
                } else {
                    V2MLBlock v2MLBlock = v2MLDevice.block;
                    if (v2MLBlock != null) {
                        MLBlock.Builder builder5 = new MLBlock.Builder();
                        builder2.identifier = v2MLBlock.identifier;
                        builder2.probeNumber = Integer.valueOf(MEATERDeviceType.BLOCK.probeNumber);
                        String str3 = v2MLBlock.firmwareRevision;
                        if (str3 != null) {
                            builder2.firmwareRevision = str3;
                        }
                        builder2.connectionState = ConnectionState.fromValue(v2MLBlock.connectionState.getValue());
                        builder2.wifiSignalLevel = v2MLBlock.wifiSignalLevel;
                        builder2.chargeState = m(v2MLBlock.batteryLevel.intValue());
                        builder2.connectionType = DeviceConnectionType.BLE;
                        for (int i11 = 0; i11 < v2MasterMessage.devices.size(); i11++) {
                            V2MLDevice v2MLDevice2 = v2MasterMessage.devices.get(i11);
                            if (v2MLDevice2.probe != null) {
                                MLChildDevice.Builder builder6 = new MLChildDevice.Builder();
                                builder6.identifier(v2MLDevice2.probe.identifier);
                                builder6.probeNumber(v2MLDevice2.probe.probeNum);
                                builder5.childProbes.add(builder6.build());
                            }
                        }
                        builder2.block = builder5.build();
                    }
                }
            }
            builder.devices.add(builder2.build());
        }
        return builder.build();
    }

    public static V1BlockFirmwareUpdateMessage K(String str) {
        return new V1BlockFirmwareUpdateMessage.Builder().header(L(0)).downloadURL(str).build();
    }

    public static V1MeaterLinkHeader L(int i10) {
        return new V1MeaterLinkHeader.Builder().meaterLinkIdentifier(Integer.valueOf(V1MeaterLinkMajorVersion.MEATER_LINK_ID.getValue())).versionMinor(Integer.valueOf(V1MeaterLinkMinorVersion.MEATER_LINK_MINOR_LATEST.getValue())).versionMajor(Integer.valueOf(V1MeaterLinkMajorVersion.MEATER_LINK_MAJOR_LATEST.getValue())).messageNum(Integer.valueOf(i10)).build();
    }

    public static V2BlockFirmwareUpdateMessage M(String str) {
        return new V2BlockFirmwareUpdateMessage.Builder().downloadURL(str).build();
    }

    public static V2MeaterLinkHeader N(int i10) {
        return new V2MeaterLinkHeader.Builder().meaterLinkIdentifier(Integer.valueOf(V2MeaterLinkMajorVersion.V2MEATER_LINK_ID.getValue())).versionMajor(Integer.valueOf(V2MeaterLinkMajorVersion.V2MEATER_LINK_MAJOR_LATEST.getValue())).versionMinor(Integer.valueOf(V2MeaterLinkMinorVersion.V2MEATER_LINK_MINOR_LATEST.getValue())).messageNum(Integer.valueOf(i10)).deviceID(Long.valueOf(ThisDevice.INSTANCE.getDeviceID())).build();
    }

    public static V2NetworkSettingsRequestMessage O() {
        return new V2NetworkSettingsRequestMessage.Builder().build();
    }

    public static V2ProbeSetup P(Probe probe) {
        Integer num = probe.getmCut() != null ? probe.getmCut().f31705id : null;
        ArrayList arrayList = new ArrayList();
        Iterator<Alert> it = probe.getAlerts().iterator();
        while (it.hasNext()) {
            Alert next = it.next();
            if (!next.isNotAValidAlert()) {
                arrayList.add(new V2ProbeAlarm.Builder().type(V2AlarmType.fromValue(next.getType().getValue())).state(V2AlarmState.fromValue(next.getState().getValue())).name(j(next.getName(), 32)).limit(Integer.valueOf((next.getType() == AlarmType.ALARM_TYPE_MIN_AMBIENT || next.getType() == AlarmType.ALARM_TYPE_MAX_AMBIENT || next.getType() == AlarmType.ALARM_TYPE_MIN_INTERNAL || next.getType() == AlarmType.ALARM_TYPE_MAX_INTERNAL) ? Temperature.ConvertThirtyTwoResolutionToSixteenth(next.getLimit()) : next.getLimit())).build());
            }
        }
        V2ProbeSetup.Builder builder = new V2ProbeSetup.Builder();
        builder.setupSeqNum = Integer.valueOf(probe.getSetupSeqNum());
        builder.cookState = V2ProbeCookState.fromValue(probe.getCookState().getValue());
        builder.targetTemperature = Integer.valueOf(Temperature.ConvertThirtyTwoResolutionToSixteenth(probe.getTargetInternalTemperature()));
        builder.cutID = num;
        if (probe.getCookID() > 0) {
            builder.cookID = Long.valueOf(probe.getCookID());
        }
        if (probe.getCookName() != null && !probe.getCookName().isEmpty() && probe.getCookName().length() > 0) {
            builder.cookName = j(probe.getCookName(), 32);
        }
        builder.probeAlarms = arrayList;
        return builder.build();
    }

    public static V2SetupMessage Q(Probe probe) {
        V2SetupMessage.Builder builder = new V2SetupMessage.Builder();
        builder.deviceID = Long.valueOf(probe.getDeviceID());
        builder.setup = P(probe);
        return builder.build();
    }

    public static V2TemperatureHistoryRequestMessage R(Probe probe) {
        V2TemperatureHistoryRequestMessage.Builder builder = new V2TemperatureHistoryRequestMessage.Builder();
        builder.deviceID = Long.valueOf(probe.getDeviceID());
        return builder.build();
    }

    private static Alarm a(V2ProbeAlarm v2ProbeAlarm) {
        Alarm.Builder builder = new Alarm.Builder();
        builder.type = AlarmType.fromValue(v2ProbeAlarm.type.getValue());
        builder.state = AlarmState.fromValue(v2ProbeAlarm.state.getValue());
        Integer num = v2ProbeAlarm.limit;
        builder.limit = num;
        String str = v2ProbeAlarm.name;
        if (str != null) {
            builder.name = str;
        }
        V2AlarmType v2AlarmType = v2ProbeAlarm.type;
        if (v2AlarmType == V2AlarmType.V2ALARM_TYPE_MIN_AMBIENT || v2AlarmType == V2AlarmType.V2ALARM_TYPE_MAX_AMBIENT || v2AlarmType == V2AlarmType.V2ALARM_TYPE_MIN_INTERNAL || v2AlarmType == V2AlarmType.V2ALARM_TYPE_MAX_INTERNAL) {
            builder.limit = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(num.intValue()));
        }
        return builder.build();
    }

    public static BlockFirmwareUpdateMessage b(String str) {
        return new BlockFirmwareUpdateMessage.Builder().downloadURL(str).build();
    }

    private static String c() {
        MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
        if (mEATERCloudAccountL != null) {
            return j(mEATERCloudAccountL.email, 255);
        }
        return null;
    }

    public static CookSetup d(V2ProbeSetup v2ProbeSetup) {
        ArrayList arrayList = new ArrayList();
        List<V2ProbeAlarm> list = v2ProbeSetup.probeAlarms;
        if (list.size() > 0) {
            for (int i10 = 0; i10 < v2ProbeSetup.probeAlarms.size(); i10++) {
                arrayList.add(a(list.get(i10)));
            }
        }
        CookSetup.Builder builderCutID = new CookSetup.Builder().sequenceNumber(v2ProbeSetup.setupSeqNum).state(DeviceCookState.fromValue(v2ProbeSetup.cookState.getValue())).targetInternalTemperature(Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2ProbeSetup.targetTemperature.intValue()))).cutID(v2ProbeSetup.cutID);
        String str = v2ProbeSetup.cookName;
        return builderCutID.name((str == null || str.isEmpty()) ? null : j(v2ProbeSetup.cookName, 32)).cookID(v2ProbeSetup.cookID).alarms(arrayList).estimatorConfig(l()).lastItem(CookSetup.DEFAULT_LASTITEM).build();
    }

    public static CookSetup e(Probe probe) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer numValueOf;
        Long l10 = null;
        if (probe.getmCut() != null) {
            num = probe.getmCut().f31705id;
            num2 = probe.getCookPreset() != null ? probe.getCookPreset().f31705id : null;
        } else {
            num = null;
            num2 = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Alert> it = probe.getAlerts().iterator();
        while (it.hasNext()) {
            Alert next = it.next();
            if (!next.isNotAValidAlert()) {
                arrayList.add(new Alarm.Builder().type(next.getType()).state(next.getState()).limit(Integer.valueOf(next.getLimit())).name(j(next.getName(), 32)).lastFireTime((next.getLastFireDate() <= 0 || probe.getCookStartTime() == null) ? null : Integer.valueOf(((int) (next.getLastFireDate() - probe.getCookStartTime().getTime())) / 1000)).build());
            }
        }
        AlarmState flareUpAlertState = probe.getFlareUpAlertState() != null ? probe.getFlareUpAlertState() : null;
        Integer numValueOf2 = probe.getClipNumber() > 0 ? Integer.valueOf(probe.getClipNumber()) : null;
        String cookName = (probe.getCookName() == null || probe.getCookName().isEmpty()) ? null : probe.getCookName();
        if (probe.getOngoingRecipeID() != -1) {
            Long lValueOf = Long.valueOf(probe.getOngoingRecipeID());
            numValueOf = probe.getRecipeStepID() > -1 ? Integer.valueOf(probe.getRecipeStepID()) : null;
            Integer numValueOf3 = probe.getRecipeId() > 0 ? Integer.valueOf(probe.getRecipeId()) : null;
            U4.b.t("CHINTAN ***** MLMessage Send : RecipeStepID : " + numValueOf + " Probe SN : " + probe.getSetupSeqNum(), new Object[0]);
            num3 = numValueOf3;
            l10 = lValueOf;
        } else {
            num3 = null;
            numValueOf = null;
        }
        return new CookSetup.Builder().sequenceNumber(Integer.valueOf(probe.getSetupSeqNum())).state(probe.getCookState()).targetAmbientTemperature(new TemperatureRange(Integer.valueOf(probe.getTargetMinimumAmbientTemperature()), Integer.valueOf(probe.getTargetMaximumAmbientTemperature() - probe.getTargetMinimumAmbientTemperature()))).targetInternalTemperature(Integer.valueOf(probe.getTargetInternalTemperature())).cutID(num).clipNumber(numValueOf2).flareUpAlert(flareUpAlertState).name(j(cookName, 32)).cookID(Long.valueOf(probe.getCookID())).ongoingRecipeID(l10).recipeID(num3).recipeStepID(numValueOf).alarms(arrayList).estimatorConfig(probe.estimatorConfigFromDevice()).presetID(num2).cookingAppliance(Integer.valueOf(probe.getCookingAppliance().getValue())).lastItem(CookSetup.DEFAULT_LASTITEM).build();
    }

    public static CookSetup f(SavedCook savedCook) {
        Integer numValueOf = Integer.valueOf(savedCook.getCutId());
        ArrayList arrayList = new ArrayList();
        for (Alert alert : savedCook.getAlerts()) {
            if (!alert.isNotAValidAlert()) {
                arrayList.add(new Alarm.Builder().type(alert.getType()).state(alert.getState()).limit(Integer.valueOf(alert.getLimit())).name(j(alert.getName(), 32)).build());
            }
        }
        Integer numValueOf2 = savedCook.getClipNumber() > 0 ? Integer.valueOf(savedCook.getClipNumber()) : null;
        String cookName = (savedCook.getCookName() == null || savedCook.getCookName().isEmpty()) ? null : savedCook.getCookName();
        CookSetup.Builder builder = new CookSetup.Builder();
        builder.sequenceNumber(Integer.valueOf(savedCook.getSetupSeqNum())).state(DeviceCookState.fromValue(savedCook.getCookState())).targetInternalTemperature(Integer.valueOf(savedCook.getTargetTemperature())).cutID(numValueOf).name(j(cookName, 32)).cookID(Long.valueOf(savedCook.getCookID())).clipNumber(numValueOf2).cookingAppliance(savedCook.getCookingAppliance() > 0 ? Integer.valueOf(savedCook.getCookingAppliance()) : null).lastItem(CookSetup.DEFAULT_LASTITEM).alarms(arrayList);
        if (savedCook.getCookPresetId() > 0) {
            builder.presetID(Integer.valueOf(savedCook.getCookPresetId()));
        }
        return builder.build();
    }

    public static MCCookStatsMessage g(Probe probe) {
        MCCookStatsMessage.Builder builderOsVersion = new MCCookStatsMessage.Builder().masterType(MasterType.MASTER_TYPE_ANDROID).emailAddress(c()).setup(e(probe)).probeID(Long.valueOf(probe.getDeviceID())).probeNumber(Integer.valueOf(probe.getProbeNumber())).probeFirmwareRevision(probe.getFirmwareRevision()).peak(Integer.valueOf(probe.getPeakTemperature())).sendingDeviceCloudID(j(x4.g.r(), 50)).history(probe.getTemperatureLog().createTemperatureLog().toTemperatureHistory(probe.getCookStartTime().getTime())).deviceInfo(j(x4.g.n(), 32)).appVersion(j(x4.g.i(), 12)).osVersion(j(x4.g.g(), 12));
        if (probe.getParentDevice() != null) {
            builderOsVersion.parentDeviceID(Long.valueOf(probe.getParentDevice().getDeviceID()));
            builderOsVersion.parentDeviceProbeNumber(Integer.valueOf(probe.getParentDevice().getProbeNumber()));
            builderOsVersion.parentDeviceFirmwareRevision(probe.getParentDevice().getFirmwareRevision());
        }
        return builderOsVersion.build();
    }

    public static MCCookStatsMessage h(SavedCook savedCook) {
        if (!savedCook.readyForSync() || savedCook.getFirmwareRevision() == null) {
            return null;
        }
        MCCookStatsMessage.Builder builderOsVersion = new MCCookStatsMessage.Builder().masterType(MasterType.MASTER_TYPE_ANDROID).emailAddress(c()).setup(f(savedCook)).probeID(Long.valueOf(savedCook.getCookDeviceId())).probeNumber(Integer.valueOf(savedCook.getProbeNumber())).peak(Integer.valueOf(savedCook.getPeakTemperature())).sendingDeviceCloudID(j(x4.g.r(), 50)).history(savedCook.getTemperatureLog().createTemperatureLog().toTemperatureHistory(savedCook.getCookStartTime() * 1000)).probeFirmwareRevision(savedCook.getFirmwareRevision()).deviceInfo(j(x4.g.n(), 32)).appVersion(j(x4.g.i(), 12)).osVersion(j(x4.g.g(), 12));
        if (savedCook.getParentDeviceID() != 0) {
            builderOsVersion.parentDeviceID(Long.valueOf(savedCook.getParentDeviceID()));
            builderOsVersion.parentDeviceProbeNumber(Integer.valueOf(savedCook.getParentProbeNumber()));
            builderOsVersion.parentDeviceFirmwareRevision(savedCook.getParentFirmwareRevision());
        }
        return builderOsVersion.build();
    }

    public static CookStatus i(V2ProbeStatus v2ProbeStatus) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(v2ProbeStatus.internalTemperature);
        CookStatus.Builder builder = new CookStatus.Builder();
        builder.internalTemperature = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2ProbeStatus.internalTemperature.intValue()));
        builder.ambientTemperature = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2ProbeStatus.ambientTemperature.intValue()));
        builder.peakTemperature = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2ProbeStatus.peakTemperature.intValue()));
        Integer num = v2ProbeStatus.remainingTime;
        builder.remainingCookTime = num;
        builder.elapsedTime = v2ProbeStatus.elapsedTime;
        builder.totalRemainingTime = num;
        builder.internalTemperatures = arrayList;
        return builder.build();
    }

    public static String j(String str, int i10) {
        if (str == null) {
            return null;
        }
        return str.length() > i10 ? str.substring(0, i10) : str;
    }

    private static Date k(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(13, i10);
        return calendar.getTime();
    }

    private static EstimatorConfig l() {
        return new EstimatorConfig.Builder().temperatureChangeBeforeReady(0).secondsDelayBeforeReady(0).secondsDelayBeforeResting(0).temperatureOffsetBeforeRemoveFromHeat(0).temperatureOffsetBeforeRemoveFromHeat(0).estimatorType(EstimatorType.DEFAULT).build();
    }

    private static ChargeState m(int i10) {
        return new ChargeState(ChargingStatus.NOT_SUPPORTED, Integer.valueOf(i10), 0);
    }

    private static ChargeState n(MEATERDevice mEATERDevice) {
        return new ChargeState(ChargingStatus.NOT_SUPPORTED, Integer.valueOf(mEATERDevice.getBatteryLevel()), 0);
    }

    public static MasterMessage o(ArrayList<T4.p> arrayList, int i10) {
        CloudConnectionState cloudConnectionState = CloudConnectionState.CLOUD_CONNECTION_STATE_OFFLINE;
        if (!E4.i.C()) {
            cloudConnectionState = CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED;
        } else if (E4.i.D().X()) {
            cloudConnectionState = CloudConnectionState.CLOUD_CONNECTION_STATE_CONNECTED;
        } else if (E4.i.D().Y()) {
            cloudConnectionState = CloudConnectionState.CLOUD_CONNECTION_STATE_CONNECTING;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (arrayList.size() > 0) {
            arrayList2.add(u((MEATERDevice) arrayList.get(0)));
            arrayList.remove(0);
            i11++;
            if (i11 == 5) {
                break;
            }
        }
        return new MasterMessage.Builder().masterType(MasterType.MASTER_TYPE_ANDROID).cloudConnectionState(cloudConnectionState).devices(arrayList2).build();
    }

    public static MasterStatusMessage p(ThisDevice thisDevice, int i10) {
        return new MasterStatusMessage.Builder().masterStatus(thisDevice.getMasterStatus()).build();
    }

    public static MasterStatusRequestMessage q(MasterDevice masterDevice, int i10) {
        return new MasterStatusRequestMessage.Builder().deviceID(Long.valueOf(masterDevice.getDeviceID())).build();
    }

    public static MCEstimatorConfigurationProposal r(Probe probe) {
        MCEstimatorConfigurationProposal.Builder builder = new MCEstimatorConfigurationProposal.Builder();
        builder.deviceType = Integer.valueOf(probe.getMEATERDeviceType().probeNumber);
        builder.deviceFirmwareVersion = probe.getFirmwareRevision();
        builder.parentDeviceType = probe.getParentDevice() != null ? Integer.valueOf(probe.getParentDevice().getDeviceType().ordinal()) : null;
        builder.parentDeviceFirmwareVersion = probe.getParentDevice() != null ? probe.getParentDevice().getFirmwareRevision() : null;
        builder.setup = e(probe);
        builder.emailAddress = x4.g.t().J();
        builder.appVersion = x4.g.i();
        return builder.build();
    }

    public static MeaterLinkHeader s(int i10) {
        return new MeaterLinkHeader.Builder().meaterLinkIdentifier(Integer.valueOf(MeaterLinkMajorVersion.MEATER_LINK_ID.getValue())).versionMajor(Integer.valueOf(MeaterLinkMajorVersion.MEATER_LINK_MAJOR_LATEST.getValue())).versionMinor(Integer.valueOf(MeaterLinkMinorVersion.MEATER_LINK_MINOR_LATEST.getValue())).messageNumber(Integer.valueOf(i10)).deviceID(Long.valueOf(ThisDevice.INSTANCE.getDeviceID())).build();
    }

    public static MeaterLinkHeader t(int i10) {
        return new MeaterLinkHeader.Builder().meaterLinkIdentifier(Integer.valueOf(MeaterLinkMajorVersion.MEATER_LINK_ID.getValue())).versionMajor(Integer.valueOf(MeaterLinkMajorVersion.MEATER_LINK_MAJOR_LATEST.getValue())).versionMinor(Integer.valueOf(MeaterLinkMinorVersion.MEATER_LINK_MINOR_LATEST.getValue())).messageNumber(Integer.valueOf(i10)).deviceID(Long.valueOf(ThisDevice.INSTANCE.getDeviceID())).build();
    }

    private static MLDevice u(MEATERDevice mEATERDevice) {
        ConnectionState connectionState = ConnectionState.CONNECTION_STATE_OFFLINE;
        if (mEATERDevice.getShouldShowAsConnected()) {
            connectionState = ConnectionState.CONNECTION_STATE_CONNECTED;
        } else if (mEATERDevice.isMEATERProbe() && mEATERDevice.getLoadingState() == O4.d.DeviceLoadingStateLoading) {
            connectionState = ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP;
        }
        DeviceConnectionType deviceConnectionType = DeviceConnectionType.BLE;
        MLDevice.Builder builder = new MLDevice.Builder();
        builder.identifier(Long.valueOf(mEATERDevice.getDeviceID())).chargeState(n(mEATERDevice)).connectionState(connectionState).connectionType(deviceConnectionType).firmwareRevision(j(mEATERDevice.getFirmwareRevision(), 15));
        if (mEATERDevice.isMEATERProbe()) {
            Probe probe = (Probe) mEATERDevice;
            builder.probe(new MLProbe.Builder().parentIdentifier(Long.valueOf(probe.getParentDeviceID())).setup(e(probe)).status(x(probe)).build()).probeNumber(Integer.valueOf(probe.getProbeNumber())).bleSignalLevel(Integer.valueOf(probe.getSignalLevel()));
        } else if (mEATERDevice.isMEATERPlus()) {
            MEATERPlus mEATERPlus = (MEATERPlus) mEATERDevice;
            MLPlus.Builder builder2 = new MLPlus.Builder();
            if (mEATERDevice.relatedProbe() != null) {
                builder2.childProbe(new MLChildDevice(Long.valueOf(mEATERDevice.relatedProbe().getDeviceID()), Integer.valueOf(mEATERDevice.relatedProbe().getProbeNumber())));
                if (mEATERDevice.getAmbientTemperature() != -1024) {
                    builder2.ambientTemperature(Integer.valueOf(mEATERDevice.getAmbientTemperature()));
                }
            }
            builder.plus(builder2.build()).probeNumber(Integer.valueOf(mEATERDevice.getProbeNumber())).bleSignalLevel(Integer.valueOf(mEATERPlus.getSignalLevel()));
        } else if (mEATERDevice.isMEATERBlock()) {
            MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
            MLBlock.Builder builder3 = new MLBlock.Builder();
            if (mEATERDevice.getAmbientTemperature() != -1024) {
                builder3.ambientTemperature(Integer.valueOf(mEATERDevice.getAmbientTemperature()));
            }
            builder.block(builder3.build()).probeNumber(Integer.valueOf(mEATERDevice.getProbeNumber())).wifiSignalLevel(Integer.valueOf(mEATERBlock.getSignalLevel()));
        }
        return builder.build();
    }

    private static Alert v(ArrayList<Alert> arrayList, Alarm alarm) {
        Iterator<Alert> it = arrayList.iterator();
        Alert alert = null;
        int i10 = 0;
        while (it.hasNext()) {
            Alert next = it.next();
            int i11 = next.getType() == alarm.type ? 1 : 0;
            if (C3918k.a(next.getName(), alarm.name)) {
                i11++;
            }
            if (next.getLimit() == alarm.limit.intValue()) {
                i11++;
            }
            if (i11 > i10) {
                alert = next;
                i10 = i11;
            }
        }
        return alert;
    }

    public static NetworkSettingsRequestMessage w() {
        return new NetworkSettingsRequestMessage.Builder().build();
    }

    private static CookStatus x(Probe probe) {
        ArrayList arrayList = new ArrayList();
        Temperature.Temperatures_t temperatures = probe.getTemperatures();
        if (temperatures != null) {
            for (int i10 = 0; i10 < temperatures.internalSensorCount; i10++) {
                arrayList.add(Integer.valueOf(temperatures.internalTemperatures[i10]));
            }
        }
        return new CookStatus.Builder().internalTemperatures(arrayList).internalTemperature(Integer.valueOf(probe.getInternalTemperature())).ambientTemperature(Integer.valueOf(probe.getAmbientTemperature())).peakTemperature(Integer.valueOf(probe.getPeakTemperature())).remainingCookTime(Integer.valueOf(probe.getTimeRemaining())).elapsedTime(Integer.valueOf(probe.cookTimeElapsed())).totalRemainingTime(Integer.valueOf(probe.getTimeRemaining())).build();
    }

    public static MCPushNotificationMessage y(MCNotificationType mCNotificationType, int i10, Probe probe) {
        long deviceID = probe.getDeviceID();
        MCPushNotificationMessage.Builder builder = new MCPushNotificationMessage.Builder();
        builder.deviceID = Long.valueOf(deviceID);
        builder.notificationType = mCNotificationType;
        builder.cook = e(probe);
        builder.status = x(probe);
        builder.masterType = MasterType.MASTER_TYPE_ANDROID;
        builder.meta = Integer.valueOf(i10);
        MEATERDevice parentDevice = probe.getParentDevice();
        if (parentDevice != null) {
            MCDeviceInfo.Builder builder2 = new MCDeviceInfo.Builder();
            builder2.deviceID = Long.valueOf(parentDevice.getDeviceID());
            builder2.productNumber = Integer.valueOf(parentDevice.getProbeNumber());
            builder2.firmwareVersion = parentDevice.getFirmwareRevision();
            builder.parentDevice = builder2.build();
        }
        if (parentDevice == null) {
            builder.probeNumber = Integer.valueOf(probe.getProbeNumber());
        } else {
            builder.probeNumber = Integer.valueOf(parentDevice.isMEATERPlus() ? parentDevice.getProbeNumber() : probe.getProbeNumber());
        }
        return builder.build();
    }

    public static SetupMessage z(Probe probe, int i10) {
        return new SetupMessage.Builder().deviceID(Long.valueOf(probe.getDeviceID())).setup(e(probe)).build();
    }
}
