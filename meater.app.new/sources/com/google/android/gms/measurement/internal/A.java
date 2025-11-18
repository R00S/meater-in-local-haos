package com.google.android.gms.measurement.internal;

import android.os.Handler;
import g7.C3445p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f34733d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2809o3 f34734a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f34735b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f34736c;

    A(InterfaceC2809o3 interfaceC2809o3) {
        C3445p.k(interfaceC2809o3);
        this.f34734a = interfaceC2809o3;
        this.f34735b = new RunnableC2881z(this, interfaceC2809o3);
    }

    private final Handler f() {
        Handler handler;
        if (f34733d != null) {
            return f34733d;
        }
        synchronized (A.class) {
            try {
                if (f34733d == null) {
                    f34733d = new com.google.android.gms.internal.measurement.N0(this.f34734a.a().getMainLooper());
                }
                handler = f34733d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.f34736c = 0L;
        f().removeCallbacks(this.f34735b);
    }

    public final void b(long j10) {
        a();
        if (j10 >= 0) {
            this.f34736c = this.f34734a.b().a();
            if (f().postDelayed(this.f34735b, j10)) {
                return;
            }
            this.f34734a.k().H().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f34736c != 0;
    }
}
