package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2447c1 extends Y implements InterfaceC2429a1 {
    C2447c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2429a1
    public final void E0(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        C2428a0.d(parcelC, bundle);
        parcelC.writeLong(j10);
        k(1, parcelC);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2429a1
    public final int a() {
        Parcel parcelG = g(2, c());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }
}
