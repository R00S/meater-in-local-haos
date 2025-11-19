package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import h7.C3493b;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes2.dex */
public class Q implements Parcelable.Creator<P> {
    static void c(P p10, Parcel parcel, int i10) {
        int iA = C3493b.a(parcel);
        C3493b.e(parcel, 2, p10.f38267B, false);
        C3493b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public P createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                bundleA = SafeParcelReader.a(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new P(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public P[] newArray(int i10) {
        return new P[i10];
    }
}
