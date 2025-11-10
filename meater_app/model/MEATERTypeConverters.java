package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERTypeConverters {
    static final Gson gson = new com.google.gson.e().c().b();

    public static int DeviceCookStateToInt(DeviceCookState deviceCookState) {
        return deviceCookState.getValue();
    }

    public static AlarmState alarmStateFromString(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -351315923:
                if (str.equals("ALARM_STATE_DISMISSED")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1177439858:
                if (str.equals("ALARM_STATE_FIRED")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1188386599:
                if (str.equals("ALARM_STATE_READY")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2031641755:
                if (str.equals("ALARM_STATE_NOT_READY")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AlarmState.ALARM_STATE_DISMISSED;
            case 1:
                return AlarmState.ALARM_STATE_FIRED;
            case 2:
                return AlarmState.ALARM_STATE_READY;
            case 3:
                return AlarmState.ALARM_STATE_NOT_READY;
            default:
                return null;
        }
    }

    public static AlarmType alarmTypeFromString(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1532445442:
                if (str.equals("ALARM_TYPE_TIME_BEFORE_READY")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1067039692:
                if (str.equals("ALARM_TYPE_MIN_AMBIENT")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1030783569:
                if (str.equals("ALARM_TYPE_MAX_INTERNAL")) {
                    c10 = 2;
                    break;
                }
                break;
            case -556357503:
                if (str.equals("ALARM_TYPE_MIN_INTERNAL")) {
                    c10 = 3;
                    break;
                }
                break;
            case -389607098:
                if (str.equals("ALARM_TYPE_MAX_AMBIENT")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1125580380:
                if (str.equals("ALARM_TYPE_TIME_FROM_NOW")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AlarmType.ALARM_TYPE_TIME_BEFORE_READY;
            case 1:
                return AlarmType.ALARM_TYPE_MIN_AMBIENT;
            case 2:
                return AlarmType.ALARM_TYPE_MAX_INTERNAL;
            case 3:
                return AlarmType.ALARM_TYPE_MIN_INTERNAL;
            case 4:
                return AlarmType.ALARM_TYPE_MAX_AMBIENT;
            case 5:
                return AlarmType.ALARM_TYPE_TIME_FROM_NOW;
            default:
                return null;
        }
    }

    public static ArrayList<Alert> alertListFromLegacyGSON(String str) {
        ArrayList<Alert> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Alert alert = new Alert();
                alert.setLimit(jSONObject.getInt("limit"));
                if (jSONObject.has("name")) {
                    alert.setName(jSONObject.getString("name"));
                }
                alert.setType(alarmTypeFromString(jSONObject.getString("type")));
                alert.setState(alarmStateFromString(jSONObject.getString("state")));
                if (alert.getType() != null && alert.getState() != null && alert.getLimit() != 0) {
                    arrayList.add(alert);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Log.error("MEATERTypeConverters", "Failed to parse old format GSON for alarm: " + e10.getLocalizedMessage());
            return new ArrayList<>();
        }
    }

    public static String alertListToString(List<Alert> list) {
        return gson.t(list);
    }

    public static int connectionMethodToInt(DeviceConnectionMethod deviceConnectionMethod) {
        return deviceConnectionMethod.getValue();
    }

    public static String deviceFirmwareVersionToString(DeviceFirmwareVersion deviceFirmwareVersion) {
        return gson.t(deviceFirmwareVersion);
    }

    public static DeviceConnectionMethod intToConnectionMethod(int i10) {
        return DeviceConnectionMethod.fromValue(i10);
    }

    public static DeviceCookState intToDeviceCookState(int i10) {
        return DeviceCookState.fromValue(i10);
    }

    public static String localMEATEREventToString(LocalMEATEREvent localMEATEREvent) {
        return gson.t(localMEATEREvent);
    }

    public static String meaterLinkAddressToString(MEATERLinkAddress mEATERLinkAddress) {
        return gson.t(mEATERLinkAddress);
    }

    public static List<Alert> stringToAlertList(String str) {
        if (str == null) {
            return Collections.emptyList();
        }
        return (List) gson.j(str, new com.google.common.reflect.f<List<Alert>>() { // from class: com.apptionlabs.meater_app.model.MEATERTypeConverters.2
        }.getType());
    }

    public static DeviceFirmwareVersion stringToDeviceFirmwareVersion(String str) {
        return (DeviceFirmwareVersion) gson.j(str, new com.google.common.reflect.f<DeviceFirmwareVersion>() { // from class: com.apptionlabs.meater_app.model.MEATERTypeConverters.4
        }.getType());
    }

    public static LocalMEATEREvent stringToLocalMEATEREvent(String str) {
        try {
            return (LocalMEATEREvent) gson.j(str, new com.google.common.reflect.f<LocalMEATEREvent>() { // from class: com.apptionlabs.meater_app.model.MEATERTypeConverters.5
            }.getType());
        } catch (Exception unused) {
            k6.b.w("[WARNING] Stored LocalMEATEREvent  was invalid!", new Object[0]);
            return new LocalMEATEREvent();
        }
    }

    public static MEATERLinkAddress stringToMeaterLinkAddress(String str) {
        return (MEATERLinkAddress) gson.j(str, new com.google.common.reflect.f<MEATERLinkAddress>() { // from class: com.apptionlabs.meater_app.model.MEATERTypeConverters.3
        }.getType());
    }

    public static HighResTemperatureLog stringToTemperatureHighResLog(String str) {
        try {
            return HighResTemperatureLog.logWithTemperatureLog(stringToTemperatureLog(str));
        } catch (Exception unused) {
            return new HighResTemperatureLog();
        }
    }

    public static TemperatureLog stringToTemperatureLog(String str) {
        try {
            return (TemperatureLog) gson.j(str, new com.google.common.reflect.f<TemperatureLog>() { // from class: com.apptionlabs.meater_app.model.MEATERTypeConverters.1
            }.getType());
        } catch (Exception unused) {
            k6.b.w("[WARNING] Stored temperature log was invalid!", new Object[0]);
            return TemperatureLog.emptyTemperatureLog();
        }
    }

    public static TemperatureLog temperatureLogFromLegacyGSON(String str) {
        TemperatureLog temperatureLog = new TemperatureLog();
        try {
            JSONObject jSONObject = new JSONObject(str);
            temperatureLog.setInterval(jSONObject.getInt("interval"));
            temperatureLog.setCount(jSONObject.getInt("count"));
            JSONArray jSONArray = jSONObject.getJSONArray("recordings");
            for (int i10 = 0; i10 < temperatureLog.getCount(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                temperatureLog.recordings[i10] = new TemperatureLogRecording(jSONObject2.getInt("internal"), jSONObject2.getInt("ambient"));
            }
            return temperatureLog;
        } catch (Exception e10) {
            Log.error("MEATERTypeConverters", "Failed to parse old format GSON for temp log: " + e10.getLocalizedMessage());
            return null;
        }
    }

    public static String temperatureLogToString(HighResTemperatureLog highResTemperatureLog) {
        return gson.t(highResTemperatureLog.createTemperatureLog());
    }

    public static String temperatureLogToString(TemperatureLog temperatureLog) {
        return gson.t(temperatureLog);
    }
}
