package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 50;
        long jM14429G2 = Long.MAX_VALUE;
        boolean zM14459w = true;
        float fM14423A = 0.0f;
        int iM14427E = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 2) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 3) {
                fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
            } else if (iM14458v == 4) {
                jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzj(zM14459w, jM14429G, fM14423A, jM14429G2, iM14427E);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i2) {
        return new zzj[i2];
    }
}
