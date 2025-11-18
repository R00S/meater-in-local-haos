package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class W0 extends Y implements U0 {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void h(Bundle bundle) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, bundle);
        k(1, parcelC);
    }
}
