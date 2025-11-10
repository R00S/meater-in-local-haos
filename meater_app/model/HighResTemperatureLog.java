package com.apptionlabs.meater_app.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.Temperature;
import f8.l0;
import java.util.Date;

/* loaded from: /tmp/meat/meat/classes.dex */
public class HighResTemperatureLog implements Parcelable {
    public static final Parcelable.Creator<HighResTemperatureLog> CREATOR = new Parcelable.Creator<HighResTemperatureLog>() { // from class: com.apptionlabs.meater_app.model.HighResTemperatureLog.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTemperatureLog createFromParcel(Parcel parcel) {
            HighResTemperatureLog highResTemperatureLog = new HighResTemperatureLog();
            highResTemperatureLog.sourceData = (HighResTemperatureLogDataSet) l0.a(parcel, HighResTemperatureLogDataSet.class.getClassLoader(), HighResTemperatureLogDataSet.class);
            highResTemperatureLog.graphData = (HighResTemperatureLogDataSet) l0.a(parcel, HighResTemperatureLogDataSet.class.getClassLoader(), HighResTemperatureLogDataSet.class);
            Date date = new Date();
            date.setTime(parcel.readLong());
            highResTemperatureLog.startTime = date;
            return highResTemperatureLog;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTemperatureLog[] newArray(int i10) {
            return new HighResTemperatureLog[i10];
        }
    };
    private Probe probe;
    private boolean shouldCropEndOfCookForGraphs;
    private Date startTime;
    boolean shouldClampAmbientToInternalTemperature = false;
    private HighResTemperatureLogDataSet sourceData = new HighResTemperatureLogDataSet(4096);
    private HighResTemperatureLogDataSet graphData = new HighResTemperatureLogDataSet(240);

    private void compact() {
        this.sourceData.compact();
        this.graphData.compact();
        rebuildGraphDataIfNeeded();
    }

    private int idealSampleInterval() {
        return Math.max(1, (int) Math.floor(uncroppedPeriodDuration() / 120.0d));
    }

    private static int log2(int i10) {
        return (int) (Math.log(i10) / Math.log(2.0d));
    }

    public static HighResTemperatureLog logWithTemperatureLog(TemperatureLog temperatureLog) {
        HighResTemperatureLog highResTemperatureLog = new HighResTemperatureLog();
        highResTemperatureLog.updateWithTemperatureLog(temperatureLog);
        return highResTemperatureLog;
    }

    private boolean probeIsReadyToUpdateLog() {
        if (!this.probe.haveFetchedTemperatureLogFromBLE() && !this.probe.haveReceivedTemperatureLogFromRemote()) {
            return false;
        }
        DeviceConnectionState connectionState = this.probe.getConnectionState();
        DeviceConnectionState deviceConnectionState = DeviceConnectionState.CONNECTED;
        if (connectionState != deviceConnectionState) {
            return false;
        }
        MEATERDevice parentDevice = this.probe.getParentDevice();
        if (parentDevice != null && parentDevice.getConnectionState() != deviceConnectionState) {
            return false;
        }
        return true;
    }

    private void rebuildGraphDataIfNeeded() {
        int idealSampleInterval = idealSampleInterval();
        int i10 = 120 - (60 / idealSampleInterval);
        if (this.graphData.count() > 0 && i10 > this.graphData.count()) {
            return;
        }
        this.graphData.clear();
        this.graphData.expandToCapacity((int) (i10 * 1.3d));
        double uncroppedPeriodDuration = uncroppedPeriodDuration();
        if (this.sourceData.count() == 0) {
            return;
        }
        this.graphData.addRecording(this.sourceData.getData().get(0));
        int i11 = idealSampleInterval;
        while (true) {
            double d10 = i11;
            if (d10 >= uncroppedPeriodDuration) {
                break;
            }
            HighResTempLogRecording highResTempLogRecording = this.sourceData.getData().get(this.sourceData.indexBeforeTime(d10));
            if (highResTempLogRecording.time > this.graphData.getData().get(this.graphData.count() - 1).time) {
                this.graphData.addRecording(highResTempLogRecording);
            }
            i11 += idealSampleInterval;
        }
        int count = this.sourceData.count() - 1;
        if (this.shouldCropEndOfCookForGraphs) {
            count = Math.min(count, this.sourceData.indexBeforeTime(uncroppedPeriodDuration) + 1);
        }
        this.graphData.addRecording(this.sourceData.getData().get(count));
    }

    private boolean shouldAddRecordingToGraph(HighResTempLogRecording highResTempLogRecording) {
        int peakInternalTemperature;
        if (!this.shouldCropEndOfCookForGraphs) {
            return true;
        }
        double peakInternalTemperatureTime = this.sourceData.getPeakInternalTemperatureTime();
        if (highResTempLogRecording.time < peakInternalTemperatureTime || highResTempLogRecording.internal >= (peakInternalTemperature = this.sourceData.getPeakInternalTemperature() - (f6.a.M + Temperature.fromCelsius(3))) || this.graphData.count() == 0) {
            return true;
        }
        HighResTempLogRecording highResTempLogRecording2 = this.graphData.getData().get(this.graphData.count() - 1);
        if (highResTempLogRecording2.time <= peakInternalTemperatureTime || highResTempLogRecording2.internal >= peakInternalTemperature) {
            return true;
        }
        return false;
    }

    private static int tempLogIntervalForCookDuration(double d10) {
        if (d10 < 600.0d) {
            return 5;
        }
        return (int) (Math.pow(2.0d, Math.floor(log2((int) Math.floor(d10 / 600.0d)))) * 10.0d);
    }

    public static HighResTemperatureLog temperatureLogForProbe(Probe probe) {
        HighResTemperatureLog highResTemperatureLog = new HighResTemperatureLog();
        highResTemperatureLog.startTime = new Date();
        highResTemperatureLog.probe = probe;
        highResTemperatureLog.shouldClampAmbientToInternalTemperature = !MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(probe.getMEATERDeviceType());
        highResTemperatureLog.addRecording(probe.getInternalTemperature(), probe.getAmbientTemperature());
        return highResTemperatureLog;
    }

    private double uncroppedPeriodDuration() {
        if (this.shouldCropEndOfCookForGraphs) {
            return this.sourceData.getCroppedDuration();
        }
        return this.sourceData.getTotalTime();
    }

    public void addRecording(int i10, int i11) {
        if (probeIsReadyToUpdateLog()) {
            Date date = new Date();
            if (this.sourceData.count() == 0) {
                this.startTime = date;
            }
            addRecording(new HighResTempLogRecording(i10, i11, (date.getTime() - this.startTime.getTime()) / 1000.0d), true);
        }
    }

    public TemperatureLog createTemperatureLog() {
        TemperatureLog logForProbe = TemperatureLog.logForProbe(this.probe, 5);
        if (this.sourceData.count() == 0) {
            return logForProbe;
        }
        double totalTime = getTotalTime();
        logForProbe.setInterval(tempLogIntervalForCookDuration(totalTime));
        if (totalTime / logForProbe.getInterval() > 120.0d) {
            k6.b.w("WARNING Computed an invalid interval!!", new Object[0]);
        }
        logForProbe.recordings[0] = new TemperatureLogRecording(this.sourceData.getData().get(0).internal, this.sourceData.getData().get(0).ambient);
        int i10 = 1;
        logForProbe.setCount(1);
        int interval = logForProbe.getInterval();
        int i11 = interval;
        while (true) {
            double d10 = i11;
            if (d10 <= totalTime) {
                TemperatureRecordingFloat temperatureRecordingForTime = this.sourceData.temperatureRecordingForTime(d10);
                logForProbe.recordings[i10] = new TemperatureLogRecording((int) temperatureRecordingForTime.internal, (int) temperatureRecordingForTime.ambient);
                i11 += interval;
                i10++;
            } else {
                logForProbe.setCount(i10);
                return logForProbe;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HighResTemperatureLogDataSet getGraphData() {
        return this.graphData;
    }

    public int getMaxTemperature() {
        return this.sourceData.getMaxTemperature();
    }

    public int getMinTemperature() {
        return this.sourceData.getMinTemperature();
    }

    public int getPeakInternalTemperature() {
        return this.sourceData.getPeakInternalTemperature();
    }

    public Probe getProbe() {
        return this.probe;
    }

    public HighResTemperatureLogDataSet getSourceData() {
        return this.sourceData;
    }

    public Date getStartTime() {
        if (this.startTime == null) {
            return null;
        }
        Date date = new Date();
        date.setTime(this.startTime.getTime());
        return date;
    }

    public double getTotalTime() {
        return this.sourceData.getTotalTime();
    }

    public double graphDuration() {
        if (this.shouldCropEndOfCookForGraphs) {
            if (this.graphData.count() > 0) {
                return this.graphData.getData().get(this.graphData.count() - 1).time;
            }
            return 0.0d;
        }
        return this.sourceData.getTotalTime();
    }

    public boolean shouldDisplayFetchingLogMessage() {
        return !probeIsReadyToUpdateLog();
    }

    public TemperatureRecordingFloat temperatureRecordingForTime(double d10) {
        return this.sourceData.temperatureRecordingForTime(d10);
    }

    public void turnOnCroppingEndOfCookFromGraphData() {
        if (!this.shouldCropEndOfCookForGraphs) {
            this.shouldCropEndOfCookForGraphs = true;
            this.graphData.clear();
            rebuildGraphDataIfNeeded();
        }
    }

    public void updateWithTemperatureLog(TemperatureLog temperatureLog) {
        this.sourceData = new HighResTemperatureLogDataSet(4096);
        this.graphData = new HighResTemperatureLogDataSet(240);
        this.startTime = temperatureLog.getEstimatedStartTime();
        int count = temperatureLog.getCount();
        int interval = temperatureLog.getInterval();
        if (temperatureLog.recordings == null) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            TemperatureLogRecording temperatureLogRecording = temperatureLog.recordings[i10];
            addRecording(new HighResTempLogRecording(temperatureLogRecording.internal, temperatureLogRecording.ambient, interval * i10), false);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        long j10;
        parcel.writeParcelable(this.sourceData, i10);
        parcel.writeParcelable(this.graphData, i10);
        Date date = this.startTime;
        if (date != null) {
            j10 = date.getTime();
        } else {
            j10 = 0;
        }
        parcel.writeLong(j10);
    }

    private void addRecording(HighResTempLogRecording highResTempLogRecording, boolean z10) {
        if (highResTempLogRecording.internal == -1024 || highResTempLogRecording.ambient == -1024) {
            return;
        }
        int count = this.sourceData.count();
        int i10 = 0;
        float f10 = 0.0f;
        for (int max = Math.max(0, count - 5); max < count; max++) {
            HighResTempLogRecording highResTempLogRecording2 = this.sourceData.getData().get(max);
            if (highResTempLogRecording.time - highResTempLogRecording2.time < 5.0d) {
                i10 += highResTempLogRecording2.ambient;
                f10 += 1.0f;
            }
        }
        if (f10 > 0.0f) {
            int i11 = (int) (i10 / f10);
            float f11 = (i11 - highResTempLogRecording.ambient) * 0.5f;
            if (this.shouldClampAmbientToInternalTemperature) {
                highResTempLogRecording.ambient = Math.max(highResTempLogRecording.internal, (int) (i11 - f11));
            }
        }
        this.sourceData.addRecording(highResTempLogRecording);
        if (z10) {
            if (Math.floor(highResTempLogRecording.time / 60.0d) > (this.sourceData.count() > 1 ? Math.floor(this.sourceData.getData().get(this.sourceData.count() - 2).time / 60.0d) : 0.0d)) {
                compact();
            }
        }
        if (shouldAddRecordingToGraph(highResTempLogRecording)) {
            int count2 = this.graphData.count();
            if (count2 == 0) {
                this.graphData.addRecording(highResTempLogRecording);
            } else if (Math.ceil(highResTempLogRecording.time - this.graphData.getData().get(count2 - 1).time) >= Math.min(30, idealSampleInterval())) {
                this.graphData.addRecording(highResTempLogRecording);
            }
        }
    }
}
