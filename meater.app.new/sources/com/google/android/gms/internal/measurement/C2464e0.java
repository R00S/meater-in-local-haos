package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2464e0 extends Y implements InterfaceC2455d0 {
    C2464e0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2455d0
    public final Bundle h(Bundle bundle) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, bundle);
        Parcel parcelG = g(1, parcelC);
        Bundle bundle2 = (Bundle) C2428a0.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
