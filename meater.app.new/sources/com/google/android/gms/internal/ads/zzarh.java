package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzarh implements Parcelable.Creator<zzarg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarg createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        long jM14429G2 = 0;
        Bundle bundleM14442f = null;
        zzxz zzxzVar = null;
        zzyd zzydVar = null;
        String strM14452p = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        zzbai zzbaiVar = null;
        Bundle bundleM14442f2 = null;
        ArrayList<String> arrayListM14454r = null;
        Bundle bundleM14442f3 = null;
        String strM14452p5 = null;
        String strM14452p6 = null;
        ArrayList<String> arrayListM14454r2 = null;
        String strM14452p7 = null;
        zzady zzadyVar = null;
        ArrayList<String> arrayListM14454r3 = null;
        String strM14452p8 = null;
        String strM14452p9 = null;
        String strM14452p10 = null;
        Bundle bundleM14442f4 = null;
        String strM14452p11 = null;
        zzaax zzaaxVar = null;
        Bundle bundleM14442f5 = null;
        String strM14452p12 = null;
        String strM14452p13 = null;
        String strM14452p14 = null;
        ArrayList<Integer> arrayListM14447k = null;
        String strM14452p15 = null;
        ArrayList<String> arrayListM14454r4 = null;
        ArrayList<String> arrayListM14454r5 = null;
        String strM14452p16 = null;
        zzaiy zzaiyVar = null;
        String strM14452p17 = null;
        Bundle bundleM14442f6 = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        int iM14427E3 = 0;
        int iM14427E4 = 0;
        float fM14423A = 0.0f;
        float fM14423A2 = 0.0f;
        boolean zM14459w2 = false;
        int iM14427E5 = 0;
        int iM14427E6 = 0;
        boolean zM14459w3 = false;
        boolean zM14459w4 = false;
        boolean zM14459w5 = false;
        int iM14427E7 = 0;
        boolean zM14459w6 = false;
        boolean zM14459w7 = false;
        int iM14427E8 = 0;
        boolean zM14459w8 = false;
        boolean zM14459w9 = false;
        boolean zM14459w10 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 3:
                    zzxzVar = (zzxz) SafeParcelReader.m14451o(parcel, iM14425C, zzxz.CREATOR);
                    break;
                case 4:
                    zzydVar = (zzyd) SafeParcelReader.m14451o(parcel, iM14425C, zzyd.CREATOR);
                    break;
                case 5:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14451o(parcel, iM14425C, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m14451o(parcel, iM14425C, PackageInfo.CREATOR);
                    break;
                case 8:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 10:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 11:
                    zzbaiVar = (zzbai) SafeParcelReader.m14451o(parcel, iM14425C, zzbai.CREATOR);
                    break;
                case 12:
                    bundleM14442f2 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 13:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 14:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 15:
                    bundleM14442f3 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 16:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 62:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 18:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 19:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 20:
                    fM14423A = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 21:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 25:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 26:
                    strM14452p6 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 27:
                    arrayListM14454r2 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 28:
                    strM14452p7 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 29:
                    zzadyVar = (zzady) SafeParcelReader.m14451o(parcel, iM14425C, zzady.CREATOR);
                    break;
                case 30:
                    arrayListM14454r3 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 31:
                    jM14429G2 = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 33:
                    strM14452p8 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 34:
                    fM14423A2 = SafeParcelReader.m14423A(parcel, iM14425C);
                    break;
                case 35:
                    iM14427E5 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 36:
                    iM14427E6 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 37:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 38:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 39:
                    strM14452p9 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 40:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 41:
                    strM14452p10 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 42:
                    zM14459w5 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 43:
                    iM14427E7 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 44:
                    bundleM14442f4 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 45:
                    strM14452p11 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 46:
                    zzaaxVar = (zzaax) SafeParcelReader.m14451o(parcel, iM14425C, zzaax.CREATOR);
                    break;
                case 47:
                    zM14459w6 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 48:
                    bundleM14442f5 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 49:
                    strM14452p12 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 50:
                    strM14452p13 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 51:
                    strM14452p14 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 52:
                    zM14459w7 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 53:
                    arrayListM14447k = SafeParcelReader.m14447k(parcel, iM14425C);
                    break;
                case 54:
                    strM14452p15 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 55:
                    arrayListM14454r4 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 56:
                    iM14427E8 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 57:
                    zM14459w8 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 58:
                    zM14459w9 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 59:
                    zM14459w10 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 60:
                    arrayListM14454r5 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 61:
                    strM14452p16 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 63:
                    zzaiyVar = (zzaiy) SafeParcelReader.m14451o(parcel, iM14425C, zzaiy.CREATOR);
                    break;
                case 64:
                    strM14452p17 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 65:
                    bundleM14442f6 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzarg(iM14427E, bundleM14442f, zzxzVar, zzydVar, strM14452p, applicationInfo, packageInfo, strM14452p2, strM14452p3, strM14452p4, zzbaiVar, bundleM14442f2, iM14427E2, arrayListM14454r, bundleM14442f3, zM14459w, iM14427E3, iM14427E4, fM14423A, strM14452p5, jM14429G, strM14452p6, arrayListM14454r2, strM14452p7, zzadyVar, arrayListM14454r3, jM14429G2, strM14452p8, fM14423A2, zM14459w2, iM14427E5, iM14427E6, zM14459w3, zM14459w4, strM14452p9, strM14452p10, zM14459w5, iM14427E7, bundleM14442f4, strM14452p11, zzaaxVar, zM14459w6, bundleM14442f5, strM14452p12, strM14452p13, strM14452p14, zM14459w7, arrayListM14447k, strM14452p15, arrayListM14454r4, iM14427E8, zM14459w8, zM14459w9, zM14459w10, arrayListM14454r5, strM14452p16, zzaiyVar, strM14452p17, bundleM14442f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarg[] newArray(int i2) {
        return new zzarg[i2];
    }
}
