package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzdaz implements Parcelable.Creator<zzday> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        byte[] bArrM14443g = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzday(iM14427E, bArrM14443g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzday[] newArray(int i2) {
        return new zzday[i2];
    }
}
