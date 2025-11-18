package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaix implements Parcelable.Creator<zzaiw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiw createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        Bundle bundleM14442f = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzaiw(strM14452p, bundleM14442f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiw[] newArray(int i2) {
        return new zzaiw[i2];
    }
}
