package com.apptionlabs.meater_app.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import f8.c0;
import f8.l0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/meat/meat/classes.dex */
public class SavedCook implements Parcelable, Comparable<SavedCook> {
    public static final Parcelable.Creator<SavedCook> CREATOR = new Parcelable.Creator<SavedCook>() { // from class: com.apptionlabs.meater_app.model.SavedCook.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedCook createFromParcel(Parcel parcel) {
            SavedCook savedCook = new SavedCook();
            savedCook.cookID = parcel.readLong();
            savedCook.setSecondsDelayBeforeResting(parcel.readInt());
            savedCook.setTemperatureChangeBeforeReady(parcel.readInt());
            savedCook.setSecondsDelayBeforeReady(parcel.readInt());
            savedCook.cookName = parcel.readString();
            savedCook.cutId = parcel.readInt();
            savedCook.targetTemperature = parcel.readInt();
            savedCook.peakTemperature = parcel.readInt();
            savedCook.isFavourite = parcel.readByte() != 0;
            savedCook.cookStartTime = parcel.readLong();
            savedCook.feedback = parcel.readInt();
            savedCook.cookTime = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt > 4) {
                readInt = 4;
            }
            for (int i10 = 0; i10 < readInt; i10++) {
                Alert alert = new Alert();
                alert.setType(AlarmType.fromValue(parcel.readInt()));
                alert.setState(AlarmState.fromValue(parcel.readInt()));
                alert.setLimit(parcel.readInt());
                alert.setName(parcel.readString());
                savedCook.alerts.add(alert);
            }
            HighResTemperatureLog highResTemperatureLog = (HighResTemperatureLog) l0.a(parcel, HighResTemperatureLog.class.getClassLoader(), HighResTemperatureLog.class);
            if (highResTemperatureLog == null) {
                highResTemperatureLog = new HighResTemperatureLog();
            }
            savedCook.temperatureLog = highResTemperatureLog;
            return savedCook;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedCook[] newArray(int i10) {
            return new SavedCook[i10];
        }
    };
    protected int clipNumber;
    private long cookDeviceId;
    private long cookID;
    private String cookName;
    private int cookPresetId;
    private long cookStartTime;
    private int cookState;
    private long cookTime;
    private int cutId;
    private int feedback;
    protected String firmwareRevision;
    private boolean isCookHaveNote;
    private boolean isFavourite;
    private boolean isFinished;
    private boolean isModified;
    private boolean needsDeleting;
    private boolean needsUploading;
    private long onGoingRecipeID;
    private long parentDeviceID;
    protected String parentFirmwareRevision;
    private int parentProbeNumber;
    private int peakTemperature;
    private int probeNumber;
    private long recipeID;
    private int secondsDelayBeforeReady;
    private int secondsDelayBeforeResting;
    private int stepID;
    private int targetMaximumAmbientTemperature;
    private int targetMinimumAmbientTemperature;
    private int targetTemperature;
    private int temperatureChangeBeforeReady;
    private long updatedAt;
    private List<Alert> alerts = new ArrayList();
    private HighResTemperatureLog temperatureLog = new HighResTemperatureLog();
    private int setupSeqNum = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum ShouldPersistStatus {
        NO,
        YES,
        IF_NOT_RECENTLY_WRITTEN
    }

    public static void checkWrongTargetTemperature(int i10, int i11) {
        if (i10 < 0 || i10 > maximumInternalTemperature()) {
            Log.d("INVALID_TARGET", "new target" + i10 + " old target " + i11);
        }
    }

    private void enableTempLogCroppingIfNeeded() {
        if (getCookState() > DeviceCookState.COOK_STATE_RESTING.getValue()) {
            this.temperatureLog.turnOnCroppingEndOfCookFromGraphData();
        }
        setCookTime((long) this.temperatureLog.graphDuration());
    }

    public static int maximumInternalTemperature() {
        return Temperature.fromCelsius(99);
    }

    public static SavedCook savedCookFromProbe(Probe probe) {
        SavedCook savedCook = new SavedCook();
        savedCook.setCookID(probe.getCookID());
        savedCook.setTemperatureLog(probe.getTemperatureLog());
        savedCook.setAlerts(new ArrayList());
        savedCook.updateFromProbe(probe);
        savedCook.setNeedsUploading(true);
        savedCook.setSetupSeqNum(probe.getSetupSeqNum());
        return savedCook;
    }

    public void checkInvalidTargetTemperature(int i10) {
        if (i10 < 0 || i10 > Temperature.maxInternalTemperatureUserCanSelect()) {
            Log.d("INVALID_TARGET", "" + i10);
        }
    }

    public double cookDuration() {
        return this.temperatureLog.getTotalTime();
    }

    public String cookIDString() {
        return Long.toHexString(this.cookID).toUpperCase();
    }

    public String cookNameForCookList() {
        int celsius;
        String str = this.cookName;
        if (str != null && str.length() > 0) {
            return this.cookName;
        }
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                celsius = Temperature.toFahrenheit(this.targetTemperature);
            } else {
                celsius = Temperature.toCelsius(this.targetTemperature);
            }
            MeatCookingTemperature rangeIfFoundWithOutMeaterRecommend = meatCutsHelper.getRangeIfFoundWithOutMeaterRecommend(celsius, meatCut.temperatureRanges);
            if (rangeIfFoundWithOutMeaterRecommend != null) {
                return rangeIfFoundWithOutMeaterRecommend.getName();
            }
            return "";
        }
        return "";
    }

    public String cookNameForDisplay() {
        int celsius;
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                celsius = Temperature.toFahrenheit(this.targetTemperature);
            } else {
                celsius = Temperature.toCelsius(this.targetTemperature);
            }
            MeatCookingTemperature rangeIfFoundWithOutMeaterRecommend = meatCutsHelper.getRangeIfFoundWithOutMeaterRecommend(celsius, meatCut.temperatureRanges);
            if (rangeIfFoundWithOutMeaterRecommend != null) {
                return rangeIfFoundWithOutMeaterRecommend.getName();
            }
            return "";
        }
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlertCountText() {
        if (totalAlarms() == 1) {
            return com.apptionlabs.meater_app.app.a.i().getString(2132018342);
        }
        if (totalAlarms() > 1) {
            return com.apptionlabs.meater_app.app.a.i().getString(2132018314, Integer.valueOf(totalAlarms()));
        }
        return "";
    }

    public List<Alert> getAlerts() {
        return this.alerts;
    }

    public int getClipNumber() {
        return this.clipNumber;
    }

    public long getCookDeviceId() {
        return this.cookDeviceId;
    }

    public long getCookID() {
        return this.cookID;
    }

    public String getCookName() {
        return this.cookName;
    }

    public int getCookPresetId() {
        return this.cookPresetId;
    }

    public long getCookStartTime() {
        return this.cookStartTime;
    }

    public int getCookState() {
        return this.cookState;
    }

    public int getCookTextColor() {
        int celsius;
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                celsius = Temperature.toFahrenheit(this.targetTemperature);
            } else {
                celsius = Temperature.toCelsius(this.targetTemperature);
            }
            MeatCookingTemperature rangeIfFoundWithOutMeaterRecommend = meatCutsHelper.getRangeIfFoundWithOutMeaterRecommend(celsius, meatCut.temperatureRanges);
            if (rangeIfFoundWithOutMeaterRecommend != null) {
                if (Temperature.toCelsius(this.peakTemperature) < rangeIfFoundWithOutMeaterRecommend.minTempC.intValue()) {
                    return 2131099716;
                }
                if (Temperature.toCelsius(this.peakTemperature) > rangeIfFoundWithOutMeaterRecommend.maxTempC.intValue()) {
                    return 2131100472;
                }
            }
        } else if (Temperature.convertToUserScale(getPeakTemperature()) > Temperature.convertToUserScale(getTargetTemperature())) {
            return 2131100472;
        }
        return -1;
    }

    public long getCookTime() {
        return this.cookTime;
    }

    public int getCutId() {
        return this.cutId;
    }

    public String getDateInStringFormat() {
        return DateFormat.getDateTimeInstance(2, 3).format(new Date(this.cookStartTime * 1000));
    }

    public int getFavouriteBtnImage() {
        if (isFavourite()) {
            return 2131230962;
        }
        return 2131231063;
    }

    public int getFeedback() {
        return this.feedback;
    }

    public String getFirmwareRevision() {
        return this.firmwareRevision;
    }

    public String getFormattedPeakTemp() {
        return Temperature.displayTemperature(getPeakTemperature());
    }

    public String getFormattedTargetTemp() {
        return Temperature.displayTemperature(getTargetTemperature());
    }

    public String getFormattedTimeText() {
        return c0.f(Math.max(this.cookTime, 60L));
    }

    public int getMeatImage() {
        int intMeatIcon = MeatCutsHelper.getInstance().getIntMeatIcon(this.cutId);
        if (intMeatIcon > 0) {
            return intMeatIcon;
        }
        return 2131231434;
    }

    public long getOnGoingRecipeID() {
        return this.onGoingRecipeID;
    }

    public long getParentDeviceID() {
        return this.parentDeviceID;
    }

    public String getParentFirmwareRevision() {
        return this.parentFirmwareRevision;
    }

    public int getParentProbeNumber() {
        return this.parentProbeNumber;
    }

    public int getPeakTemperature() {
        return this.peakTemperature;
    }

    public int getProbeNumber() {
        return this.probeNumber;
    }

    public long getRecipeID() {
        return this.recipeID;
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

    public int getStepID() {
        return this.stepID;
    }

    public int getTargetMaximumAmbientTemperature() {
        return this.targetMaximumAmbientTemperature;
    }

    public int getTargetMinimumAmbientTemperature() {
        return this.targetMinimumAmbientTemperature;
    }

    public int getTargetTemperature() {
        checkInvalidTargetTemperature(this.targetTemperature);
        return this.targetTemperature;
    }

    public int getTemperatureChangeBeforeReady() {
        return this.temperatureChangeBeforeReady;
    }

    public HighResTemperatureLog getTemperatureLog() {
        return this.temperatureLog;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public boolean isCookHaveNote() {
        return this.isCookHaveNote;
    }

    public boolean isFavourite() {
        return this.isFavourite;
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public boolean isModified() {
        return this.isModified;
    }

    public boolean isNeedsDeleting() {
        return this.needsDeleting;
    }

    public boolean isNeedsUploading() {
        return this.needsUploading;
    }

    public int meatColor() {
        return MeatCutsHelper.getInstance().getIntMeatColor(this.cutId);
    }

    public String meatNameForCookList() {
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut == null) {
            return com.apptionlabs.meater_app.app.a.i().getString(2132017581);
        }
        return meatCut.getNameLong();
    }

    public String meatNameForDisplay() {
        String str = this.cookName;
        if (str != null && str.length() > 0) {
            return this.cookName;
        }
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut == null) {
            return com.apptionlabs.meater_app.app.a.i().getString(2132017581);
        }
        return meatCut.getNameLong();
    }

    public int overcookThresholdTemperature() {
        return new x5.c().a(this.cutId, this.targetTemperature);
    }

    public boolean readyForSync() {
        if (this.cookTime >= 300 && this.peakTemperature >= Temperature.fromCelsius(40) && this.temperatureLog.getGraphData().count() >= 60) {
            return true;
        }
        return false;
    }

    public void setAlerts(List<Alert> list) {
        this.alerts = list;
    }

    public void setClipNumber(int i10) {
        this.clipNumber = i10;
    }

    public void setCookDeviceId(long j10) {
        this.cookDeviceId = j10;
    }

    public void setCookHaveNote(boolean z10) {
        this.isCookHaveNote = z10;
    }

    public void setCookID(long j10) {
        this.cookID = j10;
    }

    public void setCookName(String str) {
        this.cookName = str;
    }

    public void setCookPresetId(int i10) {
        this.cookPresetId = i10;
    }

    public void setCookStartTime(long j10) {
        this.cookStartTime = j10;
    }

    public void setCookState(int i10) {
        this.cookState = i10;
        enableTempLogCroppingIfNeeded();
    }

    public void setCookStateForCookSync(int i10) {
        this.cookState = i10;
    }

    public void setCookTime(long j10) {
        this.cookTime = j10;
    }

    public void setCutId(int i10) {
        this.cutId = i10;
    }

    public void setFavourite(boolean z10) {
        this.isFavourite = z10;
    }

    public void setFeedback(int i10) {
        this.feedback = i10;
    }

    public void setFinished(boolean z10) {
        this.isFinished = z10;
    }

    public void setFirmwareRevision(String str) {
        if (!Objects.equals(this.firmwareRevision, str)) {
            this.firmwareRevision = str;
            setModified(true);
        }
    }

    public void setModified(boolean z10) {
        this.isModified = z10;
    }

    public void setNeedsDeleting(boolean z10) {
        this.needsDeleting = z10;
    }

    public void setNeedsUploading(boolean z10) {
        this.needsUploading = z10;
    }

    public void setOnGoingRecipeID(long j10) {
        this.onGoingRecipeID = j10;
    }

    public void setParentDeviceID(long j10) {
        this.parentDeviceID = j10;
    }

    public void setParentFirmwareRevision(String str) {
        if (!Objects.equals(this.parentFirmwareRevision, str)) {
            this.parentFirmwareRevision = str;
            setModified(true);
        }
    }

    public void setParentProbeNumber(int i10) {
        this.parentProbeNumber = i10;
    }

    public void setPeakTemperature(int i10) {
        this.peakTemperature = i10;
    }

    public void setProbeNumber(int i10) {
        this.probeNumber = i10;
    }

    public void setRecipeID(long j10) {
        this.recipeID = j10;
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

    public void setStepID(int i10) {
        this.stepID = i10;
    }

    public void setTargetMaximumAmbientTemperature(int i10) {
        this.targetMaximumAmbientTemperature = i10;
    }

    public void setTargetMinimumAmbientTemperature(int i10) {
        this.targetMinimumAmbientTemperature = i10;
    }

    public void setTargetTemperature(int i10) {
        checkWrongTargetTemperature(i10, this.targetTemperature);
        this.targetTemperature = i10;
    }

    public void setTemperatureChangeBeforeReady(int i10) {
        this.temperatureChangeBeforeReady = i10;
    }

    public void setTemperatureLog(HighResTemperatureLog highResTemperatureLog) {
        this.temperatureLog = highResTemperatureLog;
        enableTempLogCroppingIfNeeded();
    }

    public void setTemperatureLogForCookSync(HighResTemperatureLog highResTemperatureLog) {
        this.temperatureLog = highResTemperatureLog;
    }

    public void setUpdatedAt(long j10) {
        this.updatedAt = j10;
    }

    public String temperatureForTargetRangeOfCook() {
        int celsius;
        MeatCut meatCut = MeatCutsHelper.getInstance().getMeatCut(this.cutId);
        if (meatCut != null) {
            MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
            if (com.apptionlabs.meater_app.app.a.u().T1()) {
                celsius = Temperature.toFahrenheit(this.targetTemperature);
            } else {
                celsius = Temperature.toCelsius(this.targetTemperature);
            }
            MeatCookingTemperature rangeIfFoundWithOutMeaterRecommend = meatCutsHelper.getRangeIfFoundWithOutMeaterRecommend(celsius, meatCut.temperatureRanges);
            if (rangeIfFoundWithOutMeaterRecommend != null) {
                return MeatCutsHelper.getInstance().getTemperatureString(rangeIfFoundWithOutMeaterRecommend);
            }
            return "";
        }
        return "";
    }

    public SpannableStringBuilder textDetailCookDescription() {
        String meatNameForDisplay = meatNameForDisplay();
        String cookNameForDisplay = cookNameForDisplay();
        String temperatureForTargetRangeOfCook = temperatureForTargetRangeOfCook();
        if (temperatureForTargetRangeOfCook.length() > 0) {
            temperatureForTargetRangeOfCook = temperatureForTargetRangeOfCook + Temperature.getUserUnitString();
        }
        if (cookNameForDisplay.length() == 0) {
            return new SpannableStringBuilder(meatNameForDisplay);
        }
        return l0.q(meatNameForDisplay, cookNameForDisplay, temperatureForTargetRangeOfCook);
    }

    public int totalAlarms() {
        return this.alerts.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShouldPersistStatus updateFromProbe(Probe probe) {
        ShouldPersistStatus shouldPersistStatus;
        long j10;
        if (this.isModified) {
            shouldPersistStatus = ShouldPersistStatus.IF_NOT_RECENTLY_WRITTEN;
        } else {
            shouldPersistStatus = ShouldPersistStatus.NO;
        }
        long j11 = this.cookStartTime;
        if (probe.getCookStartTime() != null) {
            j10 = probe.getCookStartTime().getTime() / 1000;
        } else {
            j10 = 0;
        }
        if (Math.abs(j11 - j10) > Config.MC_BROADCAST_INTERVAL_WIFI) {
            setCookStartTime(j10);
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.probeNumber != probe.getProbeNumber()) {
            setProbeNumber(probe.getProbeNumber());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.cookDeviceId != probe.getDeviceID()) {
            setCookDeviceId(probe.getDeviceID());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.setupSeqNum != probe.getSetupSeqNum()) {
            setSetupSeqNum(probe.getSetupSeqNum());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        setFirmwareRevision(probe.getFirmwareRevision());
        MEATERDevice parentDevice = probe.getParentDevice();
        if (parentDevice != null) {
            if (parentDevice.getDeviceID() != this.parentDeviceID) {
                setParentDeviceID(parentDevice.getDeviceID());
                shouldPersistStatus = ShouldPersistStatus.YES;
            }
            if (parentDevice.getProbeNumber() != this.parentProbeNumber) {
                setParentProbeNumber(parentDevice.getProbeNumber());
                shouldPersistStatus = ShouldPersistStatus.YES;
            }
            setParentFirmwareRevision(parentDevice.getFirmwareRevision());
        }
        if (probe.cookTimeElapsed() != 0 && Math.abs(this.cookTime - probe.cookTimeElapsed()) > 5) {
            setCookTime(probe.cookTimeElapsed());
            if (shouldPersistStatus != ShouldPersistStatus.YES) {
                shouldPersistStatus = ShouldPersistStatus.IF_NOT_RECENTLY_WRITTEN;
            }
        }
        if (!Objects.equals(this.cookName, probe.getCookName())) {
            setCookName(probe.getCookName());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (getSecondsDelayBeforeResting() != probe.getSecondsDelayBeforeResting()) {
            setSecondsDelayBeforeResting(probe.getSecondsDelayBeforeResting());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (getSecondsDelayBeforeReady() != probe.getSecondsDelayBeforeReady()) {
            setSecondsDelayBeforeReady(probe.getSecondsDelayBeforeReady());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (getTemperatureChangeBeforeReady() != probe.getTemperatureChangeBeforeReady()) {
            setTemperatureChangeBeforeReady(probe.getTemperatureChangeBeforeReady());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (probe.getmCut() != null && this.cutId != probe.getmCut().id.intValue()) {
            setCutId(probe.getmCut().id.intValue());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (probe.getCookPreset() != null && this.cookPresetId != probe.getCookPreset().id.intValue()) {
            setCookPresetId(probe.getCookPreset().id.intValue());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.targetMinimumAmbientTemperature != probe.getTargetMinimumAmbientTemperature()) {
            setTargetMinimumAmbientTemperature(probe.getTargetMinimumAmbientTemperature());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.targetMaximumAmbientTemperature != probe.getTargetMaximumAmbientTemperature()) {
            setTargetMaximumAmbientTemperature(probe.getTargetMaximumAmbientTemperature());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.targetTemperature != probe.getTargetInternalTemperature()) {
            setTargetTemperature(probe.getTargetInternalTemperature());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (this.peakTemperature != probe.getPeakTemperature()) {
            setPeakTemperature(probe.getPeakTemperature());
            if (shouldPersistStatus != ShouldPersistStatus.YES) {
                shouldPersistStatus = ShouldPersistStatus.IF_NOT_RECENTLY_WRITTEN;
            }
        }
        if (probe.getOngoingRecipeID() != -1) {
            setOnGoingRecipeID(probe.getOngoingRecipeID());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        w7.a u10 = com.apptionlabs.meater_app.app.a.u();
        long intValue = u10.u().intValue();
        if (this.recipeID != intValue) {
            setRecipeID(intValue);
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        int intValue2 = u10.D().intValue();
        if (this.stepID != intValue2) {
            setStepID(intValue2);
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (probe.getCookState() != null && DeviceCookState.fromValue(this.cookState) != probe.getCookState()) {
            setCookState(probe.getCookState().getValue());
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        int size = probe.getAlerts().size();
        int size2 = this.alerts.size();
        for (int i10 = 0; i10 < size; i10++) {
            Alert alert = probe.getAlerts().get(i10);
            if (i10 >= size2) {
                this.alerts.add(alert.m3clone());
                shouldPersistStatus = ShouldPersistStatus.YES;
            } else {
                Alert alert2 = this.alerts.get(i10);
                if (!Objects.equals(alert.getName(), alert2.getName())) {
                    alert2.setName(alert.getName());
                    shouldPersistStatus = ShouldPersistStatus.YES;
                }
                if (alert.getType() != alert2.getType()) {
                    alert2.setType(alert.getType());
                    shouldPersistStatus = ShouldPersistStatus.YES;
                }
                if (alert.getLimit() != alert2.getLimit()) {
                    alert2.setLimit(alert.getLimit());
                    shouldPersistStatus = ShouldPersistStatus.YES;
                }
                if (alert.getState() != alert2.getState()) {
                    alert2.setState(alert.getState());
                    shouldPersistStatus = ShouldPersistStatus.YES;
                }
            }
        }
        if (size2 > size) {
            int min = Math.min(size, probe.getAlerts().size());
            this.alerts.subList(min, Math.min(Math.max(size2 - size, min), probe.getAlerts().size())).clear();
            shouldPersistStatus = ShouldPersistStatus.YES;
        }
        if (shouldPersistStatus != ShouldPersistStatus.YES) {
            Date startTime = this.temperatureLog.getStartTime();
            startTime.setTime(startTime.getTime() + ((int) (this.temperatureLog.getTotalTime() * 1000.0d)));
            if (new Date().getTime() - startTime.getTime() > 30) {
                shouldPersistStatus = ShouldPersistStatus.IF_NOT_RECENTLY_WRITTEN;
            }
        }
        if (!this.isModified && shouldPersistStatus != ShouldPersistStatus.NO) {
            this.isModified = true;
        }
        return shouldPersistStatus;
    }

    public void writeCurrentEventToDB(LocalMEATEREvent localMEATEREvent) {
        SavedEventLog.addEvent(this.cookID, localMEATEREvent);
    }

    public void writeToDB() {
        this.isModified = false;
        LocalStorage.sharedStorage().savedCookDAO().h(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.cookID);
        parcel.writeInt(getSecondsDelayBeforeResting());
        parcel.writeInt(getTemperatureChangeBeforeReady());
        parcel.writeInt(getSecondsDelayBeforeReady());
        parcel.writeString(this.cookName);
        parcel.writeInt(this.cutId);
        parcel.writeInt(this.targetTemperature);
        parcel.writeInt(this.peakTemperature);
        parcel.writeByte(this.isFavourite ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.cookStartTime);
        parcel.writeInt(this.feedback);
        parcel.writeLong(this.cookTime);
        parcel.writeInt(this.alerts.size());
        Iterator<Alert> it = this.alerts.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
        parcel.writeParcelable(this.temperatureLog, i10);
    }

    @Override // java.lang.Comparable
    public int compareTo(SavedCook savedCook) {
        return Long.compare(savedCook.cookStartTime, this.cookStartTime);
    }
}
