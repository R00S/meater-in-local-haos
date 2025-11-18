package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<ProxyRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        byte[] bArrM14443g = null;
        Bundle bundleM14442f = null;
        long jM14429G = 0;
        int iM14427E = 0;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 2) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 3) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 4) {
                bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
            } else if (iM14458v == 5) {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            } else if (iM14458v != 1000) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ProxyRequest(iM14427E, strM14452p, iM14427E2, jM14429G, bArrM14443g, bundleM14442f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyRequest[] newArray(int i2) {
        return new ProxyRequest[i2];
    }
}
