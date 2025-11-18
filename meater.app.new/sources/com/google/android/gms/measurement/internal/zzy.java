package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        long jM14429G3 = 0;
        String strM14452p = null;
        String strM14452p2 = null;
        zzkj zzkjVar = null;
        String strM14452p3 = null;
        zzan zzanVar = null;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 4:
                    zzkjVar = (zzkj) SafeParcelReader.m14451o(parcel, iM14425C, zzkj.CREATOR);
                    break;
                case 5:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 6:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 7:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    zzanVar = (zzan) SafeParcelReader.m14451o(parcel, iM14425C, zzan.CREATOR);
                    break;
                case 9:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 10:
                    zzanVar2 = (zzan) SafeParcelReader.m14451o(parcel, iM14425C, zzan.CREATOR);
                    break;
                case 11:
                    jM14429G3 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 12:
                    zzanVar3 = (zzan) SafeParcelReader.m14451o(parcel, iM14425C, zzan.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzv(strM14452p, strM14452p2, zzkjVar, jM14429G, zM14459w, strM14452p3, zzanVar, jM14429G2, zzanVar2, jM14429G3, zzanVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i2) {
        return new zzv[i2];
    }
}
