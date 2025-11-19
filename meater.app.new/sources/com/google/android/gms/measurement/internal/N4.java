package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import g7.C3445p;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class N4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35065B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35066C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35067D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ String f35068E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ E5 f35069F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35070G;

    N4(C2837s4 c2837s4, AtomicReference atomicReference, String str, String str2, String str3, E5 e52) {
        this.f35065B = atomicReference;
        this.f35066C = str;
        this.f35067D = str2;
        this.f35068E = str3;
        this.f35069F = e52;
        this.f35070G = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h;
        synchronized (this.f35065B) {
            try {
                try {
                    interfaceC4906h = this.f35070G.f35632d;
                } catch (RemoteException e10) {
                    this.f35070G.k().H().d("(legacy) Failed to get conditional properties; remote exception", C2759h2.w(this.f35066C), this.f35067D, e10);
                    this.f35065B.set(Collections.emptyList());
                }
                if (interfaceC4906h == null) {
                    this.f35070G.k().H().d("(legacy) Failed to get conditional properties; not connected to service", C2759h2.w(this.f35066C), this.f35067D, this.f35068E);
                    this.f35065B.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f35066C)) {
                    C3445p.k(this.f35069F);
                    this.f35065B.set(interfaceC4906h.y(this.f35067D, this.f35068E, this.f35069F));
                } else {
                    this.f35065B.set(interfaceC4906h.k0(this.f35066C, this.f35067D, this.f35068E));
                }
                this.f35070G.r0();
                this.f35065B.notify();
            } finally {
                this.f35065B.notify();
            }
        }
    }
}
