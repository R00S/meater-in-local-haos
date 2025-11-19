package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class O4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ boolean f35074B = true;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35075C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ boolean f35076D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2749g f35077E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2749g f35078F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35079G;

    O4(C2837s4 c2837s4, boolean z10, E5 e52, boolean z11, C2749g c2749g, C2749g c2749g2) {
        this.f35075C = e52;
        this.f35076D = z11;
        this.f35077E = c2749g;
        this.f35078F = c2749g2;
        this.f35079G = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC4906h interfaceC4906h = this.f35079G.f35632d;
        if (interfaceC4906h == null) {
            this.f35079G.k().H().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f35074B) {
            C3445p.k(this.f35075C);
            this.f35079G.a0(interfaceC4906h, this.f35076D ? null : this.f35077E, this.f35075C);
        } else {
            try {
                if (TextUtils.isEmpty(this.f35078F.f35351B)) {
                    C3445p.k(this.f35075C);
                    interfaceC4906h.g1(this.f35077E, this.f35075C);
                } else {
                    interfaceC4906h.T(this.f35077E);
                }
            } catch (RemoteException e10) {
                this.f35079G.k().H().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f35079G.r0();
    }
}
