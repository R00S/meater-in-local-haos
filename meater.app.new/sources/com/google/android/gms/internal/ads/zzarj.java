package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarj implements Parcelable.Creator<zzari> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzari createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        long jM14429G3 = 0;
        long jM14429G4 = 0;
        String strM14452p = null;
        String strM14452p2 = null;
        ArrayList<String> arrayListM14454r = null;
        ArrayList<String> arrayListM14454r2 = null;
        ArrayList<String> arrayListM14454r3 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        String strM14452p5 = null;
        String strM14452p6 = null;
        zzaru zzaruVar = null;
        String strM14452p7 = null;
        String strM14452p8 = null;
        zzato zzatoVar = null;
        ArrayList<String> arrayListM14454r4 = null;
        ArrayList<String> arrayListM14454r5 = null;
        zzark zzarkVar = null;
        String strM14452p9 = null;
        ArrayList<String> arrayListM14454r6 = null;
        String strM14452p10 = null;
        zzauy zzauyVar = null;
        String strM14452p11 = null;
        Bundle bundleM14442f = null;
        ArrayList<String> arrayListM14454r7 = null;
        String strM14452p12 = null;
        String strM14452p13 = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        int iM14427E3 = 0;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        boolean zM14459w4 = false;
        boolean zM14459w5 = false;
        boolean zM14459w6 = false;
        boolean zM14459w7 = false;
        boolean zM14459w8 = false;
        boolean zM14459w9 = false;
        boolean zM14459w10 = false;
        boolean zM14459w11 = false;
        boolean zM14459w12 = false;
        boolean zM14459w13 = false;
        boolean zM14459w14 = false;
        boolean zM14459w15 = false;
        int iM14427E4 = 0;
        boolean zM14459w16 = false;
        boolean zM14459w17 = false;
        boolean zM14459w18 = false;
        boolean zM14459w19 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 4:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 5:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 6:
                    arrayListM14454r2 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 7:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 10:
                    arrayListM14454r3 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 11:
                    jM14429G3 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 12:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 13:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 14:
                    jM14429G4 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 15:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 18:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 19:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 21:
                    strM14452p6 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 22:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 23:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 24:
                    zM14459w5 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 25:
                    zM14459w6 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 26:
                    zM14459w7 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 28:
                    zzaruVar = (zzaru) SafeParcelReader.m14451o(parcel, iM14425C, zzaru.CREATOR);
                    break;
                case 29:
                    strM14452p7 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 30:
                    strM14452p8 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 31:
                    zM14459w8 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 32:
                    zM14459w9 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 33:
                    zzatoVar = (zzato) SafeParcelReader.m14451o(parcel, iM14425C, zzato.CREATOR);
                    break;
                case 34:
                    arrayListM14454r4 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 35:
                    arrayListM14454r5 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 36:
                    zM14459w10 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 37:
                    zzarkVar = (zzark) SafeParcelReader.m14451o(parcel, iM14425C, zzark.CREATOR);
                    break;
                case 38:
                    zM14459w11 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 39:
                    strM14452p9 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 40:
                    arrayListM14454r6 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 42:
                    zM14459w12 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 43:
                    strM14452p10 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 44:
                    zzauyVar = (zzauy) SafeParcelReader.m14451o(parcel, iM14425C, zzauy.CREATOR);
                    break;
                case 45:
                    strM14452p11 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 46:
                    zM14459w13 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 47:
                    zM14459w14 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 48:
                    bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 49:
                    zM14459w15 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 50:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 51:
                    zM14459w16 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 52:
                    arrayListM14454r7 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 53:
                    zM14459w17 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 54:
                    strM14452p12 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 55:
                    strM14452p13 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 56:
                    zM14459w18 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 57:
                    zM14459w19 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzari(iM14427E, strM14452p, strM14452p2, arrayListM14454r, iM14427E2, arrayListM14454r2, jM14429G, zM14459w, jM14429G2, arrayListM14454r3, jM14429G3, iM14427E3, strM14452p3, jM14429G4, strM14452p4, zM14459w2, strM14452p5, strM14452p6, zM14459w3, zM14459w4, zM14459w5, zM14459w6, zM14459w7, zzaruVar, strM14452p7, strM14452p8, zM14459w8, zM14459w9, zzatoVar, arrayListM14454r4, arrayListM14454r5, zM14459w10, zzarkVar, zM14459w11, strM14452p9, arrayListM14454r6, zM14459w12, strM14452p10, zzauyVar, strM14452p11, zM14459w13, zM14459w14, bundleM14442f, zM14459w15, iM14427E4, zM14459w16, arrayListM14454r7, zM14459w17, strM14452p12, strM14452p13, zM14459w18, zM14459w19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzari[] newArray(int i2) {
        return new zzari[i2];
    }
}
