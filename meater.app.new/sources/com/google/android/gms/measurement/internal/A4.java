package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import g7.C3445p;
import java.util.concurrent.atomic.AtomicReference;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class A4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f34739B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f34740C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f34741D;

    A4(C2837s4 c2837s4, AtomicReference atomicReference, E5 e52) {
        this.f34739B = atomicReference;
        this.f34740C = e52;
        this.f34741D = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f34739B) {
            try {
                try {
                } catch (RemoteException e10) {
                    this.f34741D.k().H().b("Failed to get app instance id", e10);
                }
                if (!this.f34741D.h().N().x()) {
                    this.f34741D.k().N().a("Analytics storage consent denied; will not get app instance id");
                    this.f34741D.s().Y0(null);
                    this.f34741D.h().f35603i.b(null);
                    this.f34739B.set(null);
                    return;
                }
                InterfaceC4906h interfaceC4906h = this.f34741D.f35632d;
                if (interfaceC4906h == null) {
                    this.f34741D.k().H().a("Failed to get app instance id");
                    return;
                }
                C3445p.k(this.f34740C);
                this.f34739B.set(interfaceC4906h.j0(this.f34740C));
                String str = (String) this.f34739B.get();
                if (str != null) {
                    this.f34741D.s().Y0(str);
                    this.f34741D.h().f35603i.b(str);
                }
                this.f34741D.r0();
                this.f34739B.notify();
            } finally {
                this.f34739B.notify();
            }
        }
    }
}
