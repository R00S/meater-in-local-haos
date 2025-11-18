package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityRecognitionResult createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        ArrayList arrayListM14456t = null;
        Bundle bundleM14442f = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, DetectedActivity.CREATOR);
            } else if (iM14458v == 2) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 3) {
                jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 4) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ActivityRecognitionResult(arrayListM14456t, jM14429G, jM14429G2, iM14427E, bundleM14442f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityRecognitionResult[] newArray(int i2) {
        return new ActivityRecognitionResult[i2];
    }
}
