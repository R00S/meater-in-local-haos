package com.google.android.gms.measurement.internal;

import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class T4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4906h f35180B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ S4 f35181C;

    T4(S4 s42, InterfaceC4906h interfaceC4906h) {
        this.f35180B = interfaceC4906h;
        this.f35181C = s42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35181C) {
            try {
                this.f35181C.f35169B = false;
                if (!this.f35181C.f35171D.l0()) {
                    this.f35181C.f35171D.k().G().a("Connected to remote service");
                    this.f35181C.f35171D.Z(this.f35180B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
