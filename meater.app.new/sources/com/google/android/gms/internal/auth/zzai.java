package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator<zzah> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        PendingIntent pendingIntent = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, iM14425C, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzah(iM14427E, strM14452p, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah[] newArray(int i2) {
        return new zzah[i2];
    }
}
