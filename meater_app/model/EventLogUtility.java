package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.ProbeEventLog;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.AlertFiredEvent;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionEvent;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState;
import com.apptionlabs.meater_app.v3protobuf.BLERadioState;
import com.apptionlabs.meater_app.v3protobuf.CookEstimatorLogRecording;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudState;
import com.apptionlabs.meater_app.v3protobuf.MEATEREvent;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionEvent;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkState;
import com.apptionlabs.meater_app.v3protobuf.NetworkState;
import com.apptionlabs.meater_app.v3protobuf.ProbeCookSetupState;
import com.apptionlabs.meater_app.v3protobuf.ProbeReadTempLogEvent;
import f8.c0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class EventLogUtility {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.model.EventLogUtility$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLEProbeConnectionState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$NetworkState;
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState = iArr;
            try {
                iArr[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[DeviceCookState.COOK_STATE_OVERCOOK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ProbeCookSetupState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState = iArr2;
            try {
                iArr2[ProbeCookSetupState.PROBE_COOK_SETUP_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState[ProbeCookSetupState.PROBE_COOK_SETUP_STATE_SAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState[ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_OLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState[ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_NEWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState[ProbeCookSetupState.PROBE_COOK_SETUP_STATE_PROBE_SETUP_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[BLERadioState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState = iArr3;
            try {
                iArr3[BLERadioState.BLE_STATE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState[BLERadioState.BLE_STATE_NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState[BLERadioState.BLE_STATE_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState[BLERadioState.BLE_STATE_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr4 = new int[BLEProbeConnectionState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLEProbeConnectionState = iArr4;
            try {
                iArr4[BLEProbeConnectionState.BLE_PROBE_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLEProbeConnectionState[BLEProbeConnectionState.BLE_PROBE_DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[MEATERLinkState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState = iArr5;
            try {
                iArr5[MEATERLinkState.MEATER_LINK_STATE_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState[MEATERLinkState.MEATER_LINK_STATE_NO_CONNECTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState[MEATERLinkState.MEATER_LINK_STATE_SOCKET_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState[MEATERLinkState.MEATER_LINK_STATE_SOCKET_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr6 = new int[MEATERCloudState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState = iArr6;
            try {
                iArr6[MEATERCloudState.MEATER_CLOUD_STATE_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState[MEATERCloudState.MEATER_CLOUD_STATE_NO_CONNECTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState[MEATERCloudState.MEATER_CLOUD_STATE_SOCKET_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState[MEATERCloudState.MEATER_CLOUD_STATE_SOCKET_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr7 = new int[NetworkState.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$NetworkState = iArr7;
            try {
                iArr7[NetworkState.NETWORK_STATE_NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$NetworkState[NetworkState.NETWORK_STATE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$NetworkState[NetworkState.NETWORK_STATE_WIFI.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr8 = new int[AlarmType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType = iArr8;
            try {
                iArr8[AlarmType.ALARM_TYPE_MAX_AMBIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MIN_AMBIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MAX_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MIN_INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_BEFORE_READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused37) {
            }
            int[] iArr9 = new int[ProbeEventLog.EventType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType = iArr9;
            try {
                iArr9[ProbeEventLog.EventType.BLERadioStateChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.NetworkConnectivityStateChange.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.MEATERLinkStateChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.MEATERCloudStateChange.ordinal()] = 4;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.ProbeBatteryLevelChange.ordinal()] = 5;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.CookEstimatorLogRecording.ordinal()] = 6;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.MEATERLinkClientSubscriptionEvent.ordinal()] = 7;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.BLEProbeConnectionEvent.ordinal()] = 8;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.ProbeReadCookSetupEvent.ordinal()] = 9;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.ProbeReadTempLogEvent.ordinal()] = 10;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.AlertFiredEvent.ordinal()] = 11;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.ProbeRSSIChange.ordinal()] = 12;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[ProbeEventLog.EventType.ErrorEvent.ordinal()] = 13;
            } catch (NoSuchFieldError unused50) {
            }
        }
    }

    protected String BLEProbeConnectionStateStateTxt(BLEProbeConnectionState bLEProbeConnectionState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLEProbeConnectionState[bLEProbeConnectionState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return "";
            }
            return "Disconnected";
        }
        return "Connected";
    }

    protected String bleRadioStateTxt(BLERadioState bLERadioState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$BLERadioState[bLERadioState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "";
                    }
                    return "Disabled";
                }
                return "Enabled";
            }
            return "not supported";
        }
        return "N/A";
    }

    protected String cookStateTxt(DeviceCookState deviceCookState) {
        switch (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$DeviceCookState[deviceCookState.ordinal()]) {
            case 1:
                return "Not started";
            case 2:
                return "Configured";
            case 3:
                return "Started";
            case 4:
                return "Ready for resting";
            case 5:
                return "Resting";
            case 6:
                return "Slightly underdone";
            case 7:
                return "Ready";
            case 8:
                return "Slightly overdone";
            case 9:
                return "OverCooked";
            default:
                return "";
        }
    }

    protected String formatTimeHoursAndMinutes(int i10, int i11) {
        String str;
        int i12 = i10 / 3600;
        int i13 = i10 % 3600;
        int i14 = i13 / 60;
        int i15 = i13 % 60;
        if (i12 > 0) {
            str = i12 + "h ";
        } else {
            str = "";
        }
        if (i14 > 0) {
            str = str + i14 + "m ";
        }
        String str2 = str + i15 + "s";
        if (i11 > 0) {
            return " (" + str2 + " longer then local)";
        }
        return " (" + str2 + " shorter then local)";
    }

    protected String getAlarmDescription(AlarmType alarmType, int i10, String str) {
        String str2;
        switch (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[alarmType.ordinal()]) {
            case 1:
                str2 = "Ambient temperature rose above " + Temperature.toCelsius(i10) + "!";
                break;
            case 2:
                str2 = "Ambient temperature fell below " + Temperature.toCelsius(i10) + "!";
                break;
            case 3:
                str2 = "Internal temperature rose above " + Temperature.toCelsius(i10) + "!";
                break;
            case 4:
                str2 = "Internal temperature fell below " + Temperature.toCelsius(i10) + "!";
                break;
            case 5:
                str2 = c0.d(i10);
                break;
            case 6:
                str2 = c0.a(i10);
                break;
            default:
                str2 = "";
                break;
        }
        if (str != null && str.length() > 0) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getEventText(LocalMEATEREvent localMEATEREvent) {
        String b10;
        String str;
        String str2;
        MEATEREvent event = localMEATEREvent.getEvent();
        if (!localMEATEREvent.haveConfirmedCookTime()) {
            b10 = "??:??:??";
        } else {
            b10 = c0.b(event.time.intValue());
        }
        String str3 = "";
        switch (AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$model$ProbeEventLog$EventType[localMEATEREvent.getEventType().ordinal()]) {
            case 1:
                str = "BLE Radio State:  " + bleRadioStateTxt(event.radioStateChange.state);
                break;
            case 2:
                str = "Network state:  " + netWorkConnectivityStateTxt(event.networkConnectivityStateChange.state);
                break;
            case 3:
                str = "MEATER Link:  " + meaterLinkStateTxt(event.meaterLinkStateChange.state);
                break;
            case 4:
                str = "MEATER Cloud:  " + meaterCloudStateTxt(event.meaterCloudStateChange.state);
                break;
            case 5:
                str = "Battery:  " + event.probeBatteryLevelChange.batteryLevelPercent + "%";
                break;
            case 6:
                CookEstimatorLogRecording cookEstimatorLogRecording = event.cookEstimatorLogRecording;
                int intValue = cookEstimatorLogRecording.timeRemainingEstimate.intValue();
                if (intValue != -1) {
                    str2 = "" + intValue;
                } else {
                    str2 = "N/A";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Cook:   E:");
                sb.append(str2);
                sb.append("   I:");
                sb.append(Temperature.toCelsiusFloat(cookEstimatorLogRecording.internal.intValue()));
                sb.append("   A:");
                sb.append(Temperature.toCelsiusFloat(cookEstimatorLogRecording.ambient.intValue()));
                sb.append("   T:");
                sb.append(Temperature.toCelsiusFloat(cookEstimatorLogRecording.target.intValue()));
                sb.append(" (");
                sb.append(cookStateTxt(cookEstimatorLogRecording.cookState));
                sb.append(")");
                if (cookEstimatorLogRecording.cookLogUnavailable.booleanValue()) {
                    str3 = " *TEMP HISTORY MISSING*";
                }
                sb.append(str3);
                str = sb.toString();
                break;
            case 7:
                MEATERLinkClientSubscriptionEvent mEATERLinkClientSubscriptionEvent = event.meaterLinkClientSubscriptionEvent;
                if (mEATERLinkClientSubscriptionEvent.state == MEATERLinkClientSubscriptionState.MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE) {
                    str = "New ML Sub: " + mEATERLinkClientSubscriptionEvent.osVersion + "/" + mEATERLinkClientSubscriptionEvent.deviceInfo + "/" + mEATERLinkClientSubscriptionEvent.appVersion + " ( " + mEATERLinkClientSubscriptionEvent.currentSubscriberCount + " subs total)";
                    break;
                } else {
                    str = "ML Sub Timeout: " + mEATERLinkClientSubscriptionEvent.osVersion + "/" + mEATERLinkClientSubscriptionEvent.deviceInfo + "/" + mEATERLinkClientSubscriptionEvent.appVersion + " ( " + mEATERLinkClientSubscriptionEvent.currentSubscriberCount + " subs total)";
                    break;
                }
            case 8:
                str = "Probe: " + BLEProbeConnectionStateStateTxt(event.bleProbeConnectionEvent.state);
                BLEProbeConnectionEvent bLEProbeConnectionEvent = event.bleProbeConnectionEvent;
                String str4 = bLEProbeConnectionEvent.errorMessage;
                if (bLEProbeConnectionEvent.state == BLEProbeConnectionState.BLE_PROBE_CONNECTED) {
                    str = str + " (Time to connect " + c0.b(event.bleProbeConnectionEvent.timeToConnect.intValue()) + " )";
                }
                if (str4 != null && !str4.isEmpty()) {
                    str = str + "( " + str4 + " )";
                    break;
                }
                break;
            case 9:
                str = "Cook setup:  " + readCookSetupDescription(event.probeReadCookSetupEvent.state);
                break;
            case 10:
                ProbeReadTempLogEvent probeReadTempLogEvent = event.probeReadTempLogEvent;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Log: ");
                sb2.append(probeReadTempLogEvent.count);
                sb2.append(" x ");
                sb2.append(probeReadTempLogEvent.interval);
                sb2.append(" total: ");
                sb2.append(c0.b(probeReadTempLogEvent.count.intValue() * probeReadTempLogEvent.interval.intValue()));
                sb2.append(formatTimeHoursAndMinutes(probeReadTempLogEvent.count.intValue() * probeReadTempLogEvent.interval.intValue(), probeReadTempLogEvent.diffFromMaster.intValue()));
                if (probeReadTempLogEvent.needToReadAgain.booleanValue()) {
                    str3 = " *NEED-TO-READ-AGAIN*";
                }
                sb2.append(str3);
                str = sb2.toString();
                break;
            case 11:
                AlertFiredEvent alertFiredEvent = event.alertFiredEvent;
                str = "Alert Fired:  " + getAlarmDescription(alertFiredEvent.type, alertFiredEvent.limit.intValue(), alertFiredEvent.name);
                break;
            case 12:
                str = "RSSI:  " + event.probeRSSIChange.rssi;
                break;
            case 13:
                str = "Error: " + event.error.errorMessage;
                break;
            default:
                str = null;
                break;
        }
        return b10 + " " + str;
    }

    protected String meaterCloudStateTxt(MEATERCloudState mEATERCloudState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERCloudState[mEATERCloudState.ordinal()];
        if (i10 == 1) {
            return "Disabled";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return "Disabled";
                }
                return "";
            }
            return "Enabled";
        }
        return "No Connectivity";
    }

    protected String meaterLinkStateTxt(MEATERLinkState mEATERLinkState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$MEATERLinkState[mEATERLinkState.ordinal()];
        if (i10 == 1) {
            return "Disabled";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return "Disabled";
                }
                return "";
            }
            return "Enabled";
        }
        return "No Connectivity";
    }

    protected String netWorkConnectivityStateTxt(NetworkState networkState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$NetworkState[networkState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                return "Wifi";
            }
            return "Cellular";
        }
        return "No Connection";
    }

    protected String readCookSetupDescription(ProbeCookSetupState probeCookSetupState) {
        int i10 = AnonymousClass1.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$ProbeCookSetupState[probeCookSetupState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "";
                        }
                        return "Invalid setup";
                    }
                    return "Set up on probe is newer";
                }
                return "Set up on probe is older";
            }
            return "Same as master";
        }
        return "None on probe";
    }
}
