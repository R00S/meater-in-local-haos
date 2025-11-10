package com.apptionlabs.meater_app.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.Temperature;

/* loaded from: /tmp/meat/meat/classes.dex */
public class HighResTempLogRecording implements Parcelable {
    public static final Parcelable.Creator<HighResTempLogRecording> CREATOR = new Parcelable.Creator<HighResTempLogRecording>() { // from class: com.apptionlabs.meater_app.model.HighResTempLogRecording.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTempLogRecording createFromParcel(Parcel parcel) {
            return new HighResTempLogRecording(parcel.readInt(), parcel.readInt(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HighResTempLogRecording[] newArray(int i10) {
            return new HighResTempLogRecording[i10];
        }
    };
    public int ambient;
    public int internal;
    public double time;

    public HighResTempLogRecording(int i10, int i11, double d10) {
        this.internal = i10;
        this.ambient = i11;
        this.time = d10;
    }

    public void convertTo32() {
        this.ambient = Temperature.convertSixteenthResolutionToThirtyTwo(this.ambient);
        this.internal = Temperature.convertSixteenthResolutionToThirtyTwo(this.internal);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.internal);
        parcel.writeInt(this.ambient);
        parcel.writeDouble(this.time);
    }
}
