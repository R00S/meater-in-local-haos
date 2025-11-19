package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import g7.C3445p;
import java.util.concurrent.atomic.AtomicReference;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2865w4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35699B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ E5 f35700C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ Bundle f35701D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35702E;

    RunnableC2865w4(C2837s4 c2837s4, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        this.f35699B = atomicReference;
        this.f35700C = e52;
        this.f35701D = bundle;
        this.f35702E = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h;
        synchronized (this.f35699B) {
            try {
                try {
                    interfaceC4906h = this.f35702E.f35632d;
                } catch (RemoteException e10) {
                    this.f35702E.k().H().b("Failed to get trigger URIs; remote exception", e10);
                }
                if (interfaceC4906h == null) {
                    this.f35702E.k().H().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                C3445p.k(this.f35700C);
                this.f35699B.set(interfaceC4906h.i0(this.f35700C, this.f35701D));
                this.f35702E.r0();
                this.f35699B.notify();
            } finally {
                this.f35699B.notify();
            }
        }
    }
}
