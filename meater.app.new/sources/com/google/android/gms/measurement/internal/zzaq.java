package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzaq implements Parcelable.Creator<zzan> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        zzam zzamVar = null;
        String strM14452p2 = null;
        long jM14429G = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 3) {
                zzamVar = (zzam) SafeParcelReader.m14451o(parcel, iM14425C, zzam.CREATOR);
            } else if (iM14458v == 4) {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzan(strM14452p, zzamVar, strM14452p2, jM14429G);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i2) {
        return new zzan[i2];
    }
}
