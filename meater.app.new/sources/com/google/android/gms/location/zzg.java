package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayListM14456t = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 1) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ActivityTransitionResult(arrayListM14456t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult[] newArray(int i2) {
        return new ActivityTransitionResult[i2];
    }
}
