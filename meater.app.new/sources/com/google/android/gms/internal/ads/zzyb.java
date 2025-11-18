package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzyb implements Parcelable.Creator<zzxz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxz createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundleM14442f = null;
        ArrayList<String> arrayListM14454r = null;
        String strM14452p = null;
        zzaca zzacaVar = null;
        Location location = null;
        String strM14452p2 = null;
        Bundle bundleM14442f2 = null;
        Bundle bundleM14442f3 = null;
        ArrayList<String> arrayListM14454r2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        zzxt zzxtVar = null;
        String strM14452p5 = null;
        long jM14429G = 0;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        int iM14427E3 = 0;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        int iM14427E4 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 3:
                    bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 4:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 5:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 6:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 7:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 10:
                    zzacaVar = (zzaca) SafeParcelReader.m14451o(parcel, iM14425C, zzaca.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m14451o(parcel, iM14425C, Location.CREATOR);
                    break;
                case 12:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 13:
                    bundleM14442f2 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 14:
                    bundleM14442f3 = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 15:
                    arrayListM14454r2 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 16:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 17:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 18:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 19:
                    zzxtVar = (zzxt) SafeParcelReader.m14451o(parcel, iM14425C, zzxt.CREATOR);
                    break;
                case 20:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 21:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzxz(iM14427E, jM14429G, bundleM14442f, iM14427E2, arrayListM14454r, zM14459w, iM14427E3, zM14459w2, strM14452p, zzacaVar, location, strM14452p2, bundleM14442f2, bundleM14442f3, arrayListM14454r2, strM14452p3, strM14452p4, zM14459w3, zzxtVar, iM14427E4, strM14452p5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzxz[] newArray(int i2) {
        return new zzxz[i2];
    }
}
