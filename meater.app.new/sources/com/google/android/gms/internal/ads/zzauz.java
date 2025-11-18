package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzauz implements Parcelable.Creator<zzauy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        ArrayList<String> arrayListM14454r = null;
        ArrayList<String> arrayListM14454r2 = null;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        boolean zM14459w4 = false;
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
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 7:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 8:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 9:
                    arrayListM14454r2 = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzauy(strM14452p, strM14452p2, zM14459w, zM14459w2, arrayListM14454r, zM14459w3, zM14459w4, arrayListM14454r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzauy[] newArray(int i2) {
        return new zzauy[i2];
    }
}
