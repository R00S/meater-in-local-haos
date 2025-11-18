package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzace implements Parcelable.Creator<zzacd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacd createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 3) {
                zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v != 4) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzacd(zM14459w, zM14459w2, zM14459w3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzacd[] newArray(int i2) {
        return new zzacd[i2];
    }
}
