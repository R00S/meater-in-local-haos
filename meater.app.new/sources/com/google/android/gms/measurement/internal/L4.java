package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class L4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ boolean f35035B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35036C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ boolean f35037D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ J f35038E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ String f35039F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35040G;

    L4(C2837s4 c2837s4, boolean z10, E5 e52, boolean z11, J j10, String str) {
        this.f35035B = z10;
        this.f35036C = e52;
        this.f35037D = z11;
        this.f35038E = j10;
        this.f35039F = str;
        this.f35040G = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long jC;
        long j10;
        long jA;
        InterfaceC4906h interfaceC4906h = this.f35040G.f35632d;
        if (interfaceC4906h == null) {
            this.f35040G.k().H().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f35035B) {
            C3445p.k(this.f35036C);
            this.f35040G.a0(interfaceC4906h, this.f35037D ? null : this.f35038E, this.f35036C);
        } else {
            boolean zU = this.f35040G.c().u(K.f34938P0);
            try {
                if (TextUtils.isEmpty(this.f35039F)) {
                    C3445p.k(this.f35036C);
                    if (zU) {
                        jA = this.f35040G.f35457a.b().a();
                        try {
                            jC = this.f35040G.f35457a.b().c();
                        } catch (RemoteException e10) {
                            e = e10;
                            jC = 0;
                            j10 = jA;
                            this.f35040G.k().H().b("Failed to send event to the service", e);
                            if (zU) {
                                C2745f2.a(this.f35040G.f35457a).b(36301, 13, j10, this.f35040G.f35457a.b().a(), (int) (this.f35040G.f35457a.b().c() - jC));
                            }
                            this.f35040G.r0();
                        }
                    } else {
                        jA = 0;
                        jC = 0;
                    }
                    try {
                        interfaceC4906h.x0(this.f35038E, this.f35036C);
                        if (zU) {
                            this.f35040G.k().L().a("Logging telemetry for logEvent");
                            C2745f2.a(this.f35040G.f35457a).b(36301, 0, jA, this.f35040G.f35457a.b().a(), (int) (this.f35040G.f35457a.b().c() - jC));
                        }
                    } catch (RemoteException e11) {
                        e = e11;
                        j10 = jA;
                        this.f35040G.k().H().b("Failed to send event to the service", e);
                        if (zU && j10 != 0) {
                            C2745f2.a(this.f35040G.f35457a).b(36301, 13, j10, this.f35040G.f35457a.b().a(), (int) (this.f35040G.f35457a.b().c() - jC));
                        }
                        this.f35040G.r0();
                    }
                } else {
                    interfaceC4906h.p0(this.f35038E, this.f35039F, this.f35040G.k().P());
                }
            } catch (RemoteException e12) {
                e = e12;
                jC = 0;
                j10 = 0;
            }
        }
        this.f35040G.r0();
    }
}
