package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzb implements Parcelable.Creator<ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleM14442f = null;
        byte[] bArrM14443g = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        int iM14427E3 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m14451o(parcel, iM14425C, PendingIntent.CREATOR);
            } else if (iM14458v == 3) {
                iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 4) {
                bundleM14442f = SafeParcelReader.m14442f(parcel, iM14425C);
            } else if (iM14458v == 5) {
                bArrM14443g = SafeParcelReader.m14443g(parcel, iM14425C);
            } else if (iM14458v != 1000) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ProxyResponse(iM14427E, iM14427E2, pendingIntent, iM14427E3, bundleM14442f, bArrM14443g);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse[] newArray(int i2) {
        return new ProxyResponse[i2];
    }
}
