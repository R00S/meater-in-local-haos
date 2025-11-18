package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        long jM14429G3 = 0;
        long jM14429G4 = 0;
        long jM14429G5 = 0;
        String strM14452p = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        String strM14452p5 = null;
        String strM14452p6 = null;
        String strM14452p7 = null;
        Boolean boolM14460x = null;
        ArrayList<String> arrayListM14454r = null;
        String strM14452p8 = null;
        long jM14429G6 = -2147483648L;
        boolean zM14459w = true;
        boolean zM14459w2 = false;
        int iM14427E = 0;
        boolean zM14459w3 = true;
        boolean zM14459w4 = true;
        boolean zM14459w5 = false;
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
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 6:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 7:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 8:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 9:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 10:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 11:
                    jM14429G6 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 12:
                    strM14452p6 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 13:
                    jM14429G3 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 14:
                    jM14429G4 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 15:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 16:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 17:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 18:
                    zM14459w5 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 19:
                    strM14452p7 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 20:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 21:
                    boolM14460x = SafeParcelReader.m14460x(parcel, iM14425C);
                    break;
                case 22:
                    jM14429G5 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 23:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 24:
                    strM14452p8 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzm(strM14452p, strM14452p2, strM14452p3, strM14452p4, jM14429G, jM14429G2, strM14452p5, zM14459w, zM14459w2, jM14429G6, strM14452p6, jM14429G3, jM14429G4, iM14427E, zM14459w3, zM14459w4, zM14459w5, strM14452p7, boolM14460x, jM14429G5, arrayListM14454r, strM14452p8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i2) {
        return new zzm[i2];
    }
}
