package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzi implements Parcelable.Creator<zzh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        float fM14423A = 0.0f;
        int iM14427E = 0;
        boolean zM14459w4 = false;
        boolean zM14459w5 = false;
        boolean zM14459w6 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 2:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 3:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 4:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 7:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    zM14459w5 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 10:
                    zM14459w6 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzh(zM14459w, zM14459w2, strM14452p, zM14459w3, fM14423A, iM14427E, zM14459w4, zM14459w5, zM14459w6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzh[] newArray(int i2) {
        return new zzh[i2];
    }
}
