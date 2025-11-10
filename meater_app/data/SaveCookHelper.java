package com.apptionlabs.meater_app.data;

import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.SearchableMeatCut;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.google.gson.e;
import com.google.gson.l;
import f8.l0;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import jh.o;
import kotlin.Metadata;
import wh.m;

/* compiled from: SaveCookHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper;", "", "", "updatedAt", "", "stringToLongDate", "Lcom/google/gson/l;", "dictionary", "Lcom/apptionlabs/meater_app/model/SavedCook;", "getSavedCookFromJson", "dateMilli", "dateMilli2", "", "isOlderCook", "<init>", "()V", "AlertObj", "CloudSyncCookSetup", "CookData", "CookHistory", "CookRawData", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class SaveCookHelper {
    public static final SaveCookHelper INSTANCE = new SaveCookHelper();

    /* compiled from: SaveCookHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper$AlertObj;", "", "()V", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "state", "getState", "setState", "type", "getType", "setType", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class AlertObj {
        private int limit;
        private String name;
        private int state;
        private int type;

        public final int getLimit() {
            return this.limit;
        }

        public final String getName() {
            return this.name;
        }

        public final int getState() {
            return this.state;
        }

        public final int getType() {
            return this.type;
        }

        public final void setLimit(int i10) {
            this.limit = i10;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setState(int i10) {
            this.state = i10;
        }

        public final void setType(int i10) {
            this.type = i10;
        }
    }

    /* compiled from: SaveCookHelper.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\rJ\u0006\u0010\b\u001a\u00020\u001fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\""}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper$CloudSyncCookSetup;", "", "()V", "alarms", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/data/SaveCookHelper$AlertObj;", "cookID", "", "getCookID", "()Ljava/lang/String;", "setCookID", "(Ljava/lang/String;)V", "cutID", "", "getCutID", "()I", "setCutID", "(I)V", "name", "getName", "setName", "presetID", "getPresetID", "setPresetID", "state", "getState", "setState", "targetInternalTemperature", "getTargetInternalTemperature", "setTargetInternalTemperature", "getCookCutID", "", "getProbeAlerts", "Lcom/apptionlabs/meater_app/model/Alert;", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class CloudSyncCookSetup {
        private ArrayList<AlertObj> alarms = new ArrayList<>();
        private String cookID;
        private int cutID;
        private String name;
        private int presetID;
        private int state;
        private int targetInternalTemperature;

        public final int getCookCutID() {
            if (this.presetID != 0) {
                SearchableMeatCut cutFromPresetId = MeatCutsHelper.getInstance().getCutFromPresetId(this.presetID);
                if (cutFromPresetId == null) {
                    return -1;
                }
                Integer num = cutFromPresetId.id;
                m.e(num, "id");
                return num.intValue();
            }
            return this.cutID;
        }

        public final String getCookID() {
            return this.cookID;
        }

        public final int getCutID() {
            return this.cutID;
        }

        public final String getName() {
            return this.name;
        }

        public final int getPresetID() {
            return this.presetID;
        }

        public final ArrayList<Alert> getProbeAlerts() {
            ArrayList<Alert> arrayList = new ArrayList<>();
            Iterator<AlertObj> it = this.alarms.iterator();
            while (it.hasNext()) {
                AlertObj next = it.next();
                Alert alert = new Alert();
                alert.setLimit(next.getLimit());
                alert.setType(AlarmType.fromValue(next.getType()));
                alert.setState(AlarmState.fromValue(next.getState()));
                alert.setName(next.getName());
                arrayList.add(alert);
            }
            return arrayList;
        }

        public final int getState() {
            return this.state;
        }

        public final int getTargetInternalTemperature() {
            return this.targetInternalTemperature;
        }

        public final void setCookID(String str) {
            this.cookID = str;
        }

        public final void setCutID(int i10) {
            this.cutID = i10;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setPresetID(int i10) {
            this.presetID = i10;
        }

        public final void setState(int i10) {
            this.state = i10;
        }

        public final void setTargetInternalTemperature(int i10) {
            this.targetInternalTemperature = i10;
        }

        public final long getCookID() {
            return l0.s(this.cookID);
        }
    }

    /* compiled from: SaveCookHelper.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookData;", "", "()V", "feedback", "", "getFeedback", "()I", "setFeedback", "(I)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "isDeleted", "", "()Z", "setDeleted", "(Z)V", "isFavourite", "setFavourite", "raw", "Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookRawData;", "getRaw", "()Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookRawData;", "setRaw", "(Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookRawData;)V", "totalTime", "", "getTotalTime", "()J", "setTotalTime", "(J)V", "updatedAt", "getUpdatedAt", "setUpdatedAt", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class CookData {
        private int feedback;
        private String id;
        private boolean isDeleted;
        private boolean isFavourite;
        private CookRawData raw = new CookRawData();
        private long totalTime;
        private String updatedAt;

        public final int getFeedback() {
            return this.feedback;
        }

        public final String getId() {
            return this.id;
        }

        public final CookRawData getRaw() {
            return this.raw;
        }

        public final long getTotalTime() {
            return this.totalTime;
        }

        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: isDeleted, reason: from getter */
        public final boolean getIsDeleted() {
            return this.isDeleted;
        }

        /* renamed from: isFavourite, reason: from getter */
        public final boolean getIsFavourite() {
            return this.isFavourite;
        }

        public final void setDeleted(boolean z10) {
            this.isDeleted = z10;
        }

        public final void setFavourite(boolean z10) {
            this.isFavourite = z10;
        }

        public final void setFeedback(int i10) {
            this.feedback = i10;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setRaw(CookRawData cookRawData) {
            m.f(cookRawData, "<set-?>");
            this.raw = cookRawData;
        }

        public final void setTotalTime(long j10) {
            this.totalTime = j10;
        }

        public final void setUpdatedAt(String str) {
            this.updatedAt = str;
        }
    }

    /* compiled from: SaveCookHelper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookHistory;", "", "()V", "cookTime", "", "getCookTime", "()J", "interval", "", "getInterval", "()I", "setInterval", "(I)V", "startTime", "getStartTime", "setStartTime", "(J)V", "temperatureLog", "Lcom/apptionlabs/meater_app/model/TemperatureLog;", "getTemperatureLog", "()Lcom/apptionlabs/meater_app/model/TemperatureLog;", "values", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/model/TemperatureLogRecording;", "getValues", "()Ljava/util/ArrayList;", "setValues", "(Ljava/util/ArrayList;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class CookHistory {
        private int interval;
        private long startTime;
        private ArrayList<TemperatureLogRecording> values = new ArrayList<>();

        public final long getCookTime() {
            return this.interval * this.values.size();
        }

        public final int getInterval() {
            return this.interval;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final TemperatureLog getTemperatureLog() {
            TemperatureLog temperatureLog = new TemperatureLog();
            temperatureLog.setInterval(this.interval);
            temperatureLog.setCount(this.values.size());
            ArrayList<TemperatureLogRecording> arrayList = this.values;
            ArrayList arrayList2 = new ArrayList(o.u(arrayList, 10));
            for (TemperatureLogRecording temperatureLogRecording : arrayList) {
                arrayList2.add(new TemperatureLogRecording(temperatureLogRecording.internal, temperatureLogRecording.ambient));
            }
            temperatureLog.recordings = (TemperatureLogRecording[]) arrayList2.toArray(new TemperatureLogRecording[0]);
            temperatureLog.computeNewEstimatedStartTimeFromElapsedTime(temperatureLog.getCount() * temperatureLog.getInterval());
            return temperatureLog;
        }

        public final ArrayList<TemperatureLogRecording> getValues() {
            return this.values;
        }

        public final void setInterval(int i10) {
            this.interval = i10;
        }

        public final void setStartTime(long j10) {
            this.startTime = j10;
        }

        public final void setValues(ArrayList<TemperatureLogRecording> arrayList) {
            m.f(arrayList, "<set-?>");
            this.values = arrayList;
        }
    }

    /* compiled from: SaveCookHelper.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookRawData;", "", "()V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "countryCode", "getCountryCode", "setCountryCode", "deviceInfo", "getDeviceInfo", "setDeviceInfo", "emailAddress", "getEmailAddress", "setEmailAddress", "history", "Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookHistory;", "getHistory", "()Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookHistory;", "setHistory", "(Lcom/apptionlabs/meater_app/data/SaveCookHelper$CookHistory;)V", "masterType", "", "getMasterType", "()I", "setMasterType", "(I)V", "osVersion", "getOsVersion", "setOsVersion", "parentDeviceFirmwareRevision", "getParentDeviceFirmwareRevision", "setParentDeviceFirmwareRevision", "parentDeviceID", "getParentDeviceID", "setParentDeviceID", "parentDeviceProbeNum", "getParentDeviceProbeNum", "setParentDeviceProbeNum", "peak", "getPeak", "setPeak", "probeFirmwareRevision", "getProbeFirmwareRevision", "setProbeFirmwareRevision", "probeID", "getProbeID", "setProbeID", "probeNum", "getProbeNum", "setProbeNum", "setup", "Lcom/apptionlabs/meater_app/data/SaveCookHelper$CloudSyncCookSetup;", "getSetup", "()Lcom/apptionlabs/meater_app/data/SaveCookHelper$CloudSyncCookSetup;", "setSetup", "(Lcom/apptionlabs/meater_app/data/SaveCookHelper$CloudSyncCookSetup;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class CookRawData {
        private String appVersion;
        private String countryCode;
        private String deviceInfo;
        private String emailAddress;
        private int masterType;
        private String osVersion;
        private String parentDeviceFirmwareRevision;
        private String parentDeviceID;
        private int parentDeviceProbeNum;
        private int peak;
        private String probeFirmwareRevision;
        private String probeID;
        private int probeNum;
        private CloudSyncCookSetup setup = new CloudSyncCookSetup();
        private CookHistory history = new CookHistory();

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getDeviceInfo() {
            return this.deviceInfo;
        }

        public final String getEmailAddress() {
            return this.emailAddress;
        }

        public final CookHistory getHistory() {
            return this.history;
        }

        public final int getMasterType() {
            return this.masterType;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public final String getParentDeviceFirmwareRevision() {
            return this.parentDeviceFirmwareRevision;
        }

        public final String getParentDeviceID() {
            return this.parentDeviceID;
        }

        public final int getParentDeviceProbeNum() {
            return this.parentDeviceProbeNum;
        }

        public final int getPeak() {
            return this.peak;
        }

        public final String getProbeFirmwareRevision() {
            return this.probeFirmwareRevision;
        }

        public final String getProbeID() {
            return this.probeID;
        }

        public final int getProbeNum() {
            return this.probeNum;
        }

        public final CloudSyncCookSetup getSetup() {
            return this.setup;
        }

        public final void setAppVersion(String str) {
            this.appVersion = str;
        }

        public final void setCountryCode(String str) {
            this.countryCode = str;
        }

        public final void setDeviceInfo(String str) {
            this.deviceInfo = str;
        }

        public final void setEmailAddress(String str) {
            this.emailAddress = str;
        }

        public final void setHistory(CookHistory cookHistory) {
            m.f(cookHistory, "<set-?>");
            this.history = cookHistory;
        }

        public final void setMasterType(int i10) {
            this.masterType = i10;
        }

        public final void setOsVersion(String str) {
            this.osVersion = str;
        }

        public final void setParentDeviceFirmwareRevision(String str) {
            this.parentDeviceFirmwareRevision = str;
        }

        public final void setParentDeviceID(String str) {
            this.parentDeviceID = str;
        }

        public final void setParentDeviceProbeNum(int i10) {
            this.parentDeviceProbeNum = i10;
        }

        public final void setPeak(int i10) {
            this.peak = i10;
        }

        public final void setProbeFirmwareRevision(String str) {
            this.probeFirmwareRevision = str;
        }

        public final void setProbeID(String str) {
            this.probeID = str;
        }

        public final void setProbeNum(int i10) {
            this.probeNum = i10;
        }

        public final void setSetup(CloudSyncCookSetup cloudSyncCookSetup) {
            m.f(cloudSyncCookSetup, "<set-?>");
            this.setup = cloudSyncCookSetup;
        }
    }

    private SaveCookHelper() {
    }

    private final long stringToLongDate(String updatedAt) {
        if (updatedAt == null) {
            return 0L;
        }
        try {
            Date mEATERServerDateFormat = DateExtensionKt.toMEATERServerDateFormat(updatedAt);
            if (mEATERServerDateFormat == null) {
                return 0L;
            }
            return mEATERServerDateFormat.getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public final SavedCook getSavedCookFromJson(l dictionary) {
        m.f(dictionary, "dictionary");
        CookData cookData = (CookData) new e().d(Integer.TYPE, new IntTypeAdapter()).d(Long.TYPE, new LongTypeAdapter()).b().i(dictionary.toString(), CookData.class);
        SavedCook savedCook = new SavedCook();
        savedCook.setCookID(cookData.getRaw().getSetup().getCookID());
        savedCook.setTargetTemperature(cookData.getRaw().getSetup().getTargetInternalTemperature());
        savedCook.setPeakTemperature(cookData.getRaw().getPeak());
        savedCook.setCookName(cookData.getRaw().getSetup().getName());
        savedCook.setCookStartTime(cookData.getRaw().getHistory().getStartTime());
        savedCook.setFavourite(cookData.getIsFavourite());
        savedCook.setNeedsDeleting(cookData.getIsDeleted());
        savedCook.setFeedback(cookData.getFeedback());
        savedCook.setUpdatedAt(stringToLongDate(cookData.getUpdatedAt()));
        savedCook.setCookStateForCookSync(cookData.getRaw().getSetup().getState());
        savedCook.setCutId(cookData.getRaw().getSetup().getCookCutID());
        savedCook.setCookTime(cookData.getRaw().getHistory().getCookTime());
        savedCook.setTemperatureLogForCookSync(HighResTemperatureLog.logWithTemperatureLog(cookData.getRaw().getHistory().getTemperatureLog()));
        savedCook.setAlerts(cookData.getRaw().getSetup().getProbeAlerts());
        return savedCook;
    }

    public final boolean isOlderCook(long dateMilli, long dateMilli2) {
        if (dateMilli > dateMilli2) {
            return true;
        }
        return false;
    }
}
