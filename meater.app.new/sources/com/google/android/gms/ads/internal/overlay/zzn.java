package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzbai;

/* loaded from: classes2.dex */
public final class zzn implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        zzc zzcVar = null;
        IBinder iBinderM14426D = null;
        IBinder iBinderM14426D2 = null;
        IBinder iBinderM14426D3 = null;
        IBinder iBinderM14426D4 = null;
        String strM14452p = null;
        String strM14452p2 = null;
        IBinder iBinderM14426D5 = null;
        String strM14452p3 = null;
        zzbai zzbaiVar = null;
        String strM14452p4 = null;
        com.google.android.gms.ads.internal.zzh zzhVar = null;
        IBinder iBinderM14426D6 = null;
        boolean zM14459w = false;
        int iM14427E = 0;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.m14451o(parcel, iM14425C, zzc.CREATOR);
                    break;
                case 3:
                    iBinderM14426D = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 4:
                    iBinderM14426D2 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 5:
                    iBinderM14426D3 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 6:
                    iBinderM14426D4 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 7:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 10:
                    iBinderM14426D5 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
                case 11:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 12:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 13:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 14:
                    zzbaiVar = (zzbai) SafeParcelReader.m14451o(parcel, iM14425C, zzbai.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 16:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 17:
                    zzhVar = (com.google.android.gms.ads.internal.zzh) SafeParcelReader.m14451o(parcel, iM14425C, com.google.android.gms.ads.internal.zzh.CREATOR);
                    break;
                case 18:
                    iBinderM14426D6 = SafeParcelReader.m14426D(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new AdOverlayInfoParcel(zzcVar, iBinderM14426D, iBinderM14426D2, iBinderM14426D3, iBinderM14426D4, strM14452p, zM14459w, strM14452p2, iBinderM14426D5, iM14427E, iM14427E2, strM14452p3, zzbaiVar, strM14452p4, zzhVar, iBinderM14426D6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdOverlayInfoParcel[] newArray(int i2) {
        return new AdOverlayInfoParcel[i2];
    }
}
