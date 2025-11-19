package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import g7.AbstractC3433d;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2752g2 extends AbstractC3433d<InterfaceC4906h> {
    public C2752g2(Context context, Looper looper, AbstractC3433d.a aVar, AbstractC3433d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // g7.AbstractC3433d
    protected final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // g7.AbstractC3433d
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // g7.AbstractC3433d, com.google.android.gms.common.api.a.f
    public final int j() {
        return 12451000;
    }

    @Override // g7.AbstractC3433d
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4906h ? (InterfaceC4906h) iInterfaceQueryLocalInterface : new C2710a2(iBinder);
    }
}
