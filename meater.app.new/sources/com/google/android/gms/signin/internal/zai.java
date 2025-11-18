package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zai implements Parcelable.Creator<zah> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zah createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) SafeParcelReader.m14451o(parcel, iM14425C, ResolveAccountRequest.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zah(iM14427E, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zah[] newArray(int i2) {
        return new zah[i2];
    }
}
