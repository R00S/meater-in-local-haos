package com.apptionlabs.meater_app.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.Temperature;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/meat/meat/classes.dex */
public class HighResTemperatureLogDataSet implements Parcelable {
    public static final Parcelable.Creator<HighResTemperatureLogDataSet> CREATOR = new Parcelable.Creator<HighResTemperatureLogDataSet>() { // from class: com.apptionlabs.meater_app.model.HighResTemperatureLogDataSet.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTemperatureLogDataSet createFromParcel(Parcel parcel) {
            HighResTemperatureLogDataSet highResTemperatureLogDataSet = new HighResTemperatureLogDataSet(2);
            parcel.readTypedList(highResTemperatureLogDataSet.data, HighResTempLogRecording.CREATOR);
            Iterator it = highResTemperatureLogDataSet.data.iterator();
            while (it.hasNext()) {
                HighResTempLogRecording highResTempLogRecording = (HighResTempLogRecording) it.next();
                highResTemperatureLogDataSet.minTemperature = Math.min(highResTemperatureLogDataSet.minTemperature, highResTempLogRecording.internal);
                highResTemperatureLogDataSet.minTemperature = Math.min(highResTemperatureLogDataSet.minTemperature, highResTempLogRecording.ambient);
                highResTemperatureLogDataSet.maxTemperature = Math.max(highResTemperatureLogDataSet.maxTemperature, highResTempLogRecording.internal);
                highResTemperatureLogDataSet.maxTemperature = Math.max(highResTemperatureLogDataSet.maxTemperature, highResTempLogRecording.ambient);
                highResTemperatureLogDataSet.peakInternalTemperature = Math.max(highResTemperatureLogDataSet.peakInternalTemperature, highResTempLogRecording.internal);
            }
            return highResTemperatureLogDataSet;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTemperatureLogDataSet[] newArray(int i10) {
            return new HighResTemperatureLogDataSet[i10];
        }
    };
    private ArrayList<HighResTempLogRecording> data;
    int ensuredCapacity;
    private int minTemperature = Integer.MAX_VALUE;
    private int maxTemperature = Integer.MIN_VALUE;
    private int peakInternalTemperature = Integer.MIN_VALUE;
    private double peakInternalTemperatureTime = 0.0d;
    private double croppedDuration = 0.0d;

    public HighResTemperatureLogDataSet(int i10) {
        this.ensuredCapacity = i10;
        this.data = new ArrayList<>(this.ensuredCapacity);
    }

    private void expandIfNeeded() {
        int size = this.data.size() + 1;
        int i10 = this.ensuredCapacity;
        if (size >= i10) {
            int i11 = (int) (i10 * 1.3d);
            this.ensuredCapacity = i11;
            this.data.ensureCapacity(i11);
        }
    }

    public void addRecording(HighResTempLogRecording highResTempLogRecording) {
        if (highResTempLogRecording.internal == -1024 || highResTempLogRecording.ambient == -1024) {
            k6.b.w("WARNING: Should not be storing invalid readings!", new Object[0]);
        }
        expandIfNeeded();
        this.data.add(highResTempLogRecording);
        this.minTemperature = Math.min(Math.min(highResTempLogRecording.ambient, highResTempLogRecording.internal), this.minTemperature);
        this.maxTemperature = Math.max(Math.max(highResTempLogRecording.ambient, highResTempLogRecording.internal), this.maxTemperature);
        int i10 = highResTempLogRecording.internal;
        if (i10 > this.peakInternalTemperature) {
            this.peakInternalTemperature = i10;
            this.peakInternalTemperatureTime = highResTempLogRecording.time;
        }
        if (highResTempLogRecording.internal >= this.peakInternalTemperature - (f6.a.M + Temperature.fromCelsius(3))) {
            this.croppedDuration = highResTempLogRecording.time;
        }
    }

    public void clear() {
        this.data.clear();
    }

    public void compact() {
        if (this.data.size() < 3) {
            return;
        }
        ArrayList<HighResTempLogRecording> arrayList = new ArrayList<>(this.ensuredCapacity);
        arrayList.add(this.data.get(0));
        int i10 = 1;
        for (int i11 = 1; i10 < this.data.size() - i11; i11 = 1) {
            HighResTempLogRecording highResTempLogRecording = arrayList.get(arrayList.size() - i11);
            HighResTempLogRecording highResTempLogRecording2 = this.data.get(i10);
            int i12 = i10 + 1;
            HighResTempLogRecording highResTempLogRecording3 = this.data.get(i12);
            int i13 = highResTempLogRecording3.internal;
            int i14 = highResTempLogRecording.internal;
            int i15 = highResTempLogRecording3.ambient;
            int i16 = highResTempLogRecording.ambient;
            double d10 = highResTempLogRecording3.time;
            double d11 = highResTempLogRecording.time;
            float f10 = (float) ((highResTempLogRecording2.time - d11) / (d10 - d11));
            float f11 = i14 + ((i13 - i14) * f10);
            float f12 = i16 + ((i15 - i16) * f10);
            if (Math.abs(highResTempLogRecording2.internal - f11) >= 1.0f || Math.abs(highResTempLogRecording2.ambient - f12) >= 1.0f) {
                arrayList.add(highResTempLogRecording2);
            }
            i10 = i12;
        }
        ArrayList<HighResTempLogRecording> arrayList2 = this.data;
        arrayList.add(arrayList2.get(arrayList2.size() - 1));
        this.data = arrayList;
    }

    public int count() {
        return this.data.size();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void expandToCapacity(int i10) {
        this.ensuredCapacity = i10;
        this.data.ensureCapacity(i10);
    }

    public double getCroppedDuration() {
        return this.croppedDuration;
    }

    public ArrayList<HighResTempLogRecording> getData() {
        return this.data;
    }

    public int getMaxTemperature() {
        int i10 = this.maxTemperature;
        if (i10 == Integer.MIN_VALUE) {
            return 0;
        }
        return i10;
    }

    public int getMinTemperature() {
        int i10 = this.minTemperature;
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    public int getPeakInternalTemperature() {
        int i10 = this.peakInternalTemperature;
        if (i10 == Integer.MIN_VALUE) {
            return 0;
        }
        return i10;
    }

    public double getPeakInternalTemperatureTime() {
        return this.peakInternalTemperatureTime;
    }

    public double getTotalTime() {
        if (this.data.size() == 0) {
            return 0.0d;
        }
        return this.data.get(r0.size() - 1).time;
    }

    public int indexBeforeTime(double d10) {
        int i10 = 0;
        if (this.data.size() < 2) {
            return 0;
        }
        int size = this.data.size();
        while (size > i10 + 1) {
            int i11 = ((size - i10) / 2) + i10;
            if (this.data.get(i11).time > d10) {
                size = i11;
            } else {
                i10 = i11;
            }
        }
        return i10;
    }

    public TemperatureRecordingFloat temperatureRecordingForTime(double d10) {
        if (this.data.size() == 0) {
            return new TemperatureRecordingFloat(-1024.0f, -1024.0f);
        }
        int indexBeforeTime = indexBeforeTime(d10);
        HighResTempLogRecording highResTempLogRecording = this.data.get(indexBeforeTime);
        if (indexBeforeTime == this.data.size() - 1) {
            return new TemperatureRecordingFloat(highResTempLogRecording.internal, highResTempLogRecording.ambient);
        }
        HighResTempLogRecording highResTempLogRecording2 = this.data.get(indexBeforeTime + 1);
        double d11 = highResTempLogRecording2.time;
        double d12 = highResTempLogRecording.time;
        float f10 = (float) ((d10 - d12) / (d11 - d12));
        int i10 = highResTempLogRecording2.internal;
        int i11 = highResTempLogRecording.internal;
        float f11 = i10 - i11;
        int i12 = highResTempLogRecording2.ambient;
        return new TemperatureRecordingFloat(i11 + (f11 * f10), highResTempLogRecording.ambient + ((i12 - r1) * f10));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.data);
    }
}
