package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzye implements Parcelable.Creator<zzyd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyd createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        zzyd[] zzydVarArr = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        int iM14427E3 = 0;
        int iM14427E4 = 0;
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
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 4:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 7:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 8:
                    zzydVarArr = (zzyd[]) SafeParcelReader.m14455s(parcel, iM14425C, zzyd.CREATOR);
                    break;
                case 9:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 10:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 11:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzyd(strM14452p, iM14427E, iM14427E2, zM14459w, iM14427E3, iM14427E4, zzydVarArr, zM14459w2, zM14459w3, zM14459w4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzyd[] newArray(int i2) {
        return new zzyd[i2];
    }
}
