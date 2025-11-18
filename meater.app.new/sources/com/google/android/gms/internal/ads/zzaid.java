package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaid implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        byte[] bArrM14443g = null;
        String[] strArrM14453q = null;
        String[] strArrM14453q2 = null;
        long jM14429G = 0;
        boolean zM14459w = false;
        int iM14427E = 0;
        boolean zM14459w2 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 4:
                    bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
                    break;
                case 5:
                    strArrM14453q = SafeParcelReader.m14453q(parcel, iM14425C);
                    break;
                case 6:
                    strArrM14453q2 = SafeParcelReader.m14453q(parcel, iM14425C);
                    break;
                case 7:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 8:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzaic(zM14459w, strM14452p, iM14427E, bArrM14443g, strArrM14453q, strArrM14453q2, zM14459w2, jM14429G);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i2) {
        return new zzaic[i2];
    }
}
