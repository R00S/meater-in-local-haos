package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbi implements Parcelable.Creator<zzbh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        double dM14461y = 0.0d;
        double dM14461y2 = 0.0d;
        String strM14452p = null;
        long jM14429G = 0;
        int iM14427E = 0;
        short sM14431I = 0;
        float fM14423A = 0.0f;
        int iM14427E2 = 0;
        int iM14427E3 = -1;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 2:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 3:
                    sM14431I = SafeParcelReader.m14431I(parcel, iM14425C);
                    break;
                case 4:
                    dM14461y = SafeParcelReader.m14461y(parcel, iM14425C);
                    break;
                case 5:
                    dM14461y2 = SafeParcelReader.m14461y(parcel, iM14425C);
                    break;
                case 6:
                    fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 7:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 8:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 9:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzbh(strM14452p, iM14427E, sM14431I, dM14461y, dM14461y2, fM14423A, jM14429G, iM14427E2, iM14427E3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i2) {
        return new zzbh[i2];
    }
}
