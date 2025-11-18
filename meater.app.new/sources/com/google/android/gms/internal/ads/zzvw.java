package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzvw implements Parcelable.Creator<zzvv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        String strM14452p = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        Bundle bundleM14442f = null;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 4:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 6:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 7:
                    bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzvv(strM14452p, jM14429G, strM14452p2, strM14452p3, strM14452p4, bundleM14442f, zM14459w, jM14429G2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzvv[] newArray(int i2) {
        return new zzvv[i2];
    }
}
