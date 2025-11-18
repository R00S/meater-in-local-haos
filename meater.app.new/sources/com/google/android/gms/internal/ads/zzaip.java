package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaip implements Parcelable.Creator<zzaio> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaio createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        boolean zM14459w = false;
        String strM14452p = null;
        String strM14452p2 = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 2) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 3) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 4) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzaio(strM14452p, zM14459w, iM14427E, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaio[] newArray(int i2) {
        return new zzaio[i2];
    }
}
