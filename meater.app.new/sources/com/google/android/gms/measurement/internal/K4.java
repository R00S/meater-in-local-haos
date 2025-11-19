package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class K4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ J f35021B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35022C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35023D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35024E;

    K4(C2837s4 c2837s4, J j10, String str, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35021B = j10;
        this.f35022C = str;
        this.f35023D = u02;
        this.f35024E = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC4906h interfaceC4906h = this.f35024E.f35632d;
            if (interfaceC4906h == null) {
                this.f35024E.k().H().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrW0 = interfaceC4906h.w0(this.f35021B, this.f35022C);
            this.f35024E.r0();
            this.f35024E.j().W(this.f35023D, bArrW0);
        } catch (RemoteException e10) {
            this.f35024E.k().H().b("Failed to send event to the service to bundle", e10);
        } finally {
            this.f35024E.j().W(this.f35023D, null);
        }
    }
}
