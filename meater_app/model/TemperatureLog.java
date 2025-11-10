package com.apptionlabs.meater_app.model;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistory;
import com.apptionlabs.meater_app.v3protobuf.TemperatureRecording;
import f8.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/* loaded from: /tmp/meat/meat/classes.dex */
public class TemperatureLog {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MAX_TEMPERATURE_HISTORY_SAMPLES = 120;

    @gg.a
    private int count;
    private Date estimatedStartTime;

    @gg.a
    private int interval;
    private Probe probe;

    @gg.a
    public TemperatureLogRecording[] recordings = new TemperatureLogRecording[120];

    private void compact() {
        for (int i10 = 0; i10 < 60; i10++) {
            TemperatureLogRecording[] temperatureLogRecordingArr = this.recordings;
            temperatureLogRecordingArr[i10] = temperatureLogRecordingArr[i10 * 2];
        }
        this.count = 60;
        this.interval *= 2;
    }

    public static Date dateWithSecondsSinceNow(double d10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(14, (int) (d10 * 1000.0d));
        return calendar.getTime();
    }

    public static TemperatureLog emptyTemperatureLog() {
        TemperatureLogRecording[] temperatureLogRecordingArr = new TemperatureLogRecording[120];
        temperatureLogRecordingArr[0] = new TemperatureLogRecording(0, 0);
        temperatureLogRecordingArr[1] = new TemperatureLogRecording(0, 0);
        return logWithIntervalAndRecordings(0, 0, temperatureLogRecordingArr, false);
    }

    public static TemperatureLog logForProbe(Probe probe, int i10) {
        TemperatureLog temperatureLog = new TemperatureLog();
        temperatureLog.probe = probe;
        temperatureLog.interval = i10;
        temperatureLog.estimatedStartTime = new Date();
        return temperatureLog;
    }

    public static TemperatureLog logWithIntervalAndRecordings(int i10, int i11, TemperatureLogRecording[] temperatureLogRecordingArr, boolean z10) {
        TemperatureLog temperatureLog = new TemperatureLog();
        int i12 = 0;
        if (i11 > 120) {
            k6.b.w("[ERROR] Trying to create a temperature log with too many entries!!", new Object[0]);
        }
        int min = Math.min(i11, 120);
        temperatureLog.count = min;
        temperatureLog.interval = i10;
        temperatureLog.recordings = (TemperatureLogRecording[]) Arrays.copyOfRange(temperatureLogRecordingArr, 0, min);
        temperatureLog.estimatedStartTime = dateWithSecondsSinceNow((-temperatureLog.count) * temperatureLog.interval);
        if (z10) {
            while (true) {
                TemperatureLogRecording[] temperatureLogRecordingArr2 = temperatureLog.recordings;
                if (i12 >= temperatureLogRecordingArr2.length) {
                    break;
                }
                TemperatureLogRecording temperatureLogRecording = temperatureLogRecordingArr2[i12];
                temperatureLogRecording.internal = Temperature.convertSixteenthResolutionToThirtyTwo(temperatureLogRecording.internal);
                temperatureLogRecording.ambient = Temperature.convertSixteenthResolutionToThirtyTwo(temperatureLogRecording.ambient);
                temperatureLog.recordings[i12] = temperatureLogRecording;
                i12++;
            }
        }
        return temperatureLog;
    }

    public float ambientTemperatureForTime(long j10) {
        int i10;
        if (j10 >= 0) {
            int i11 = this.interval;
            if (j10 < this.count * i11) {
                int floor = (int) Math.floor(j10 / i11);
                if (Math.ceil(j10 / this.interval) * this.interval < this.count * r3) {
                    i10 = (int) Math.ceil(j10 / r3);
                } else {
                    i10 = floor;
                }
                int i12 = this.interval;
                float f10 = (float) ((j10 % i12) / i12);
                return this.recordings[floor].ambient + ((r8[i10].ambient - r0) * f10);
            }
            return -1.0f;
        }
        return -1.0f;
    }

    public void computeNewEstimatedStartTimeFromElapsedTime(int i10) {
        k6.b.w("-----", new Object[0]);
        k6.b.w("Computing new estimated log length…", new Object[0]);
        int i11 = this.count;
        if (i11 < 2) {
            k6.b.w("Temp log nearly empty, cannot proceed.", new Object[0]);
            this.estimatedStartTime = dateWithSecondsSinceNow(-i10);
            return;
        }
        Probe probe = this.probe;
        if (probe == null) {
            this.estimatedStartTime = dateWithSecondsSinceNow(-i10);
            return;
        }
        TemperatureLogRecording[] temperatureLogRecordingArr = this.recordings;
        if (temperatureLogRecordingArr == null) {
            return;
        }
        int i12 = temperatureLogRecordingArr[i11 - 1].internal;
        int i13 = temperatureLogRecordingArr[i11 - 2].internal;
        double d10 = i12 - i13;
        int internalTemperature = probe.getInternalTemperature();
        double d11 = internalTemperature - i12;
        k6.b.w("Last two internal readings: %d, %d", Integer.valueOf(i12), Integer.valueOf(i13));
        k6.b.w("Current internal is: %d", Integer.valueOf(internalTemperature));
        k6.b.w("Log diff: %d Current temp diff from last reading: %d", Integer.valueOf((int) d10), Integer.valueOf((int) d11));
        if (d10 != 0.0d && d11 != 0.0d) {
            k6.b.w("Diff from last log is " + d11 + ", expected diff for interval (" + this.interval + ") is " + d10, new Object[0]);
            double d12 = d11 / d10;
            k6.b.w("I calculate log is %d secs out of date (%d％ of interval)", Integer.valueOf((int) (((double) this.interval) * d12)), Integer.valueOf((int) (100.0d * d12)));
            int i14 = this.interval + 40;
            StringBuilder sb = new StringBuilder();
            sb.append("Threshold time is ");
            sb.append(i14);
            k6.b.w(sb.toString(), new Object[0]);
            if (d12 < 0.0d) {
                k6.b.w("Current internal temp doesn't fit the last direction for the temperature graph.", new Object[0]);
                k6.b.w("Will wait " + this.interval + " to add next reading to log", new Object[0]);
            } else if (this.interval * d12 > i14) {
                k6.b.w("Temp log appears to be more than " + i14 + " seconds out of date.", new Object[0]);
                k6.b.w("This might happen if a) it takes ages to red the temp log", new Object[0]);
                k6.b.w("-or- b) the temperature has suddenly started rising or falling quickly", new Object[0]);
                k6.b.w("We can't reliably estimate the length, so we'll fallback to assuming it is correct.", new Object[0]);
                double d13 = (double) i10;
                int i15 = this.interval;
                k6.b.w("Estimated time to next recording: " + c0.b(i15 - ((int) (i15 * d12))), new Object[0]);
                i10 = (int) (d13 + (i15 * d12));
            }
            this.estimatedStartTime = dateWithSecondsSinceNow(-i10);
            return;
        }
        k6.b.w("At least one of these hasn't changed, have to use log length", new Object[0]);
        this.estimatedStartTime = dateWithSecondsSinceNow(-i10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TemperatureLog)) {
            return false;
        }
        TemperatureLog temperatureLog = (TemperatureLog) obj;
        if (temperatureLog.interval != this.interval || temperatureLog.count != this.count) {
            return false;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            TemperatureLogRecording temperatureLogRecording = temperatureLog.recordings[i10];
            int i11 = temperatureLogRecording.ambient;
            TemperatureLogRecording temperatureLogRecording2 = this.recordings[i10];
            if (i11 != temperatureLogRecording2.ambient || temperatureLogRecording.internal != temperatureLogRecording2.internal) {
                return false;
            }
        }
        return true;
    }

    long estimatedElapsedTime() {
        return Math.abs((System.currentTimeMillis() / 1000) - (this.estimatedStartTime.getTime() / 1000));
    }

    public float estimatedFloatElapsedTime() {
        return (float) Math.abs((System.currentTimeMillis() / 1000.0d) - (this.estimatedStartTime.getTime() / 1000.0d));
    }

    public f6.b[] estimatorRecordings() {
        f6.b[] bVarArr = new f6.b[this.count];
        for (int i10 = 0; i10 < this.count; i10++) {
            f6.b bVar = new f6.b();
            int[] iArr = new int[5];
            bVar.f12395a = iArr;
            iArr[0] = this.recordings[i10].internal;
            for (int i11 = 1; i11 < 5; i11++) {
                bVar.f12395a[i11] = -1024;
            }
            bVar.f12396b = this.recordings[i10].ambient;
            bVarArr[i10] = bVar;
        }
        return bVarArr;
    }

    public int getCount() {
        return this.count;
    }

    public Date getEstimatedStartTime() {
        if (this.estimatedStartTime == null) {
            return null;
        }
        Date date = new Date();
        date.setTime(this.estimatedStartTime.getTime());
        return date;
    }

    public int getInterval() {
        return this.interval;
    }

    public Probe getProbe() {
        return this.probe;
    }

    public float internalTemperatureForTime(long j10) {
        int i10;
        if (j10 >= 0) {
            int i11 = this.interval;
            if (j10 < this.count * i11) {
                int floor = (int) Math.floor(j10 / i11);
                if (Math.ceil(j10 / this.interval) * this.interval < this.count * r3) {
                    i10 = (int) Math.ceil(j10 / r3);
                } else {
                    i10 = floor;
                }
                int i12 = this.interval;
                float f10 = (float) ((j10 % i12) / i12);
                return this.recordings[floor].internal + ((r8[i10].internal - r0) * f10);
            }
            return -1.0f;
        }
        return -1.0f;
    }

    public int maxTemperature() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            i10 = Math.max(Math.max(i10, this.recordings[i11].ambient), this.recordings[i11].internal);
        }
        return i10;
    }

    public int minTemperature() {
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.recordings[i11].ambient;
            if (i12 != -1024) {
                i10 = Math.min(i10, i12);
            }
            int i13 = this.recordings[i11].internal;
            if (i13 != -1024) {
                i10 = Math.min(i10, i13);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    public int peakInternalTemperature() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.recordings[i11].internal;
            if (i12 != -1024) {
                i10 = Math.max(i10, i12);
            }
        }
        return i10;
    }

    public void setCount(int i10) {
        this.count = i10;
    }

    public void setInterval(int i10) {
        this.interval = i10;
    }

    public TemperatureHistory toTemperatureHistory(long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.count; i10++) {
            arrayList.add(new TemperatureRecording.Builder().internal(Integer.valueOf(this.recordings[i10].internal)).ambient(Integer.valueOf(this.recordings[i10].ambient)).m384build());
        }
        ArrayList arrayList2 = new ArrayList();
        Probe probe = this.probe;
        if (probe != null && probe.getTemperatures().internalSensorCount > 0) {
            int i11 = this.probe.getTemperatures().internalSensorCount;
            for (int i12 : this.probe.getPeakTemperatures()) {
                arrayList2.add(Integer.valueOf(i12));
            }
        }
        return new TemperatureHistory.Builder().interval(Integer.valueOf(this.interval)).startTime(Integer.valueOf((int) (j10 / 1000))).values(arrayList).peaks(arrayList2).m372build();
    }

    public int totalTime() {
        return this.count * this.interval;
    }

    public void updateFromBLEData(u5.a aVar, boolean z10) {
        int i10;
        this.interval = aVar.f18658a;
        short s10 = aVar.f18659b;
        this.count = s10;
        this.recordings = aVar.f18660c;
        if (s10 == 120) {
            compact();
        }
        if (z10) {
            i10 = aVar.f18662e;
        } else {
            i10 = this.interval * this.count;
        }
        computeNewEstimatedStartTimeFromElapsedTime(i10);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TemperatureLog m5clone() {
        TemperatureLog temperatureLog = new TemperatureLog();
        temperatureLog.count = this.count;
        temperatureLog.interval = this.interval;
        for (int i10 = 0; i10 < this.count; i10++) {
            TemperatureLogRecording[] temperatureLogRecordingArr = temperatureLog.recordings;
            TemperatureLogRecording temperatureLogRecording = this.recordings[i10];
            temperatureLogRecordingArr[i10] = new TemperatureLogRecording(temperatureLogRecording.internal, temperatureLogRecording.ambient);
        }
        return temperatureLog;
    }
}
