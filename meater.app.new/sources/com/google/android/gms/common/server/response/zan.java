package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zan implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayListM14456t = null;
        String strM14452p = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, zal.CREATOR);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zak(iM14427E, arrayListM14456t, strM14452p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i2) {
        return new zak[i2];
    }
}
