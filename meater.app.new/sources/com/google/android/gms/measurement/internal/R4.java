package com.google.android.gms.measurement.internal;

import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class R4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4906h f35157B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S4 f35158C;

    R4(S4 s42, InterfaceC4906h interfaceC4906h) {
        this.f35157B = interfaceC4906h;
        this.f35158C = s42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35158C) {
            try {
                this.f35158C.f35169B = false;
                if (!this.f35158C.f35171D.l0()) {
                    this.f35158C.f35171D.k().L().a("Connected to service");
                    this.f35158C.f35171D.Z(this.f35157B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
