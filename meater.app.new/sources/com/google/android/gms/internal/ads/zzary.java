package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzary implements Parcelable.Creator<zzarx> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Bundle bundleM14442f = null;
        zzbai zzbaiVar = null;
        ApplicationInfo applicationInfo = null;
        String strM14452p = null;
        ArrayList<String> arrayListM14454r = null;
        PackageInfo packageInfo = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
                    break;
                case 2:
                    zzbaiVar = (zzbai) SafeParcelReader.m14451o(parcel, iM14425C, zzbai.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m14451o(parcel, iM14425C, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m14451o(parcel, iM14425C, PackageInfo.CREATOR);
                    break;
                case 7:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzarx(bundleM14442f, zzbaiVar, applicationInfo, strM14452p, arrayListM14454r, packageInfo, strM14452p2, zM14459w, strM14452p3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzarx[] newArray(int i2) {
        return new zzarx[i2];
    }
}
