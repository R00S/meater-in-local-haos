package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import g7.C3445p;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class P4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35121B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35122C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ String f35123D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ String f35124E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ E5 f35125F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ boolean f35126G;

    /* renamed from: H, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35127H;

    P4(C2837s4 c2837s4, AtomicReference atomicReference, String str, String str2, String str3, E5 e52, boolean z10) {
        this.f35121B = atomicReference;
        this.f35122C = str;
        this.f35123D = str2;
        this.f35124E = str3;
        this.f35125F = e52;
        this.f35126G = z10;
        this.f35127H = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4906h interfaceC4906h;
        synchronized (this.f35121B) {
            try {
                try {
                    interfaceC4906h = this.f35127H.f35632d;
                } catch (RemoteException e10) {
                    this.f35127H.k().H().d("(legacy) Failed to get user properties; remote exception", C2759h2.w(this.f35122C), this.f35123D, e10);
                    this.f35121B.set(Collections.emptyList());
                }
                if (interfaceC4906h == null) {
                    this.f35127H.k().H().d("(legacy) Failed to get user properties; not connected to service", C2759h2.w(this.f35122C), this.f35123D, this.f35124E);
                    this.f35121B.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f35122C)) {
                    C3445p.k(this.f35125F);
                    this.f35121B.set(interfaceC4906h.Y0(this.f35123D, this.f35124E, this.f35126G, this.f35125F));
                } else {
                    this.f35121B.set(interfaceC4906h.C(this.f35122C, this.f35123D, this.f35124E, this.f35126G));
                }
                this.f35127H.r0();
                this.f35121B.notify();
            } finally {
                this.f35121B.notify();
            }
        }
    }
}
