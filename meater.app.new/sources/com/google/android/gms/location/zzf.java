package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzf implements Parcelable.Creator<ActivityTransitionRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayListM14456t = null;
        String strM14452p = null;
        ArrayList arrayListM14456t2 = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, ActivityTransition.CREATOR);
            } else if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                arrayListM14456t2 = SafeParcelReader.m14456t(parcel, iM14425C, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ActivityTransitionRequest(arrayListM14456t, strM14452p, arrayListM14456t2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionRequest[] newArray(int i2) {
        return new ActivityTransitionRequest[i2];
    }
}
