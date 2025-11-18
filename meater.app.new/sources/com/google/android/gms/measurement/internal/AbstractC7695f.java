package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzj;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes2.dex */
abstract class AbstractC7695f {

    /* renamed from: a */
    private static volatile Handler f28621a;

    /* renamed from: b */
    private final InterfaceC7817s4 f28622b;

    /* renamed from: c */
    private final Runnable f28623c;

    /* renamed from: d */
    private volatile long f28624d;

    AbstractC7695f(InterfaceC7817s4 interfaceC7817s4) {
        Preconditions.m14372k(interfaceC7817s4);
        this.f28622b = interfaceC7817s4;
        this.f28623c = new RunnableC7704g(this, interfaceC7817s4);
    }

    /* renamed from: a */
    static /* synthetic */ long m22772a(AbstractC7695f abstractC7695f, long j2) {
        abstractC7695f.f28624d = 0L;
        return 0L;
    }

    /* renamed from: f */
    private final Handler m22773f() {
        Handler handler;
        if (f28621a != null) {
            return f28621a;
        }
        synchronized (AbstractC7695f.class) {
            if (f28621a == null) {
                f28621a = new zzj(this.f28622b.mo22834f().getMainLooper());
            }
            handler = f28621a;
        }
        return handler;
    }

    /* renamed from: b */
    public abstract void mo22703b();

    /* renamed from: c */
    public final void m22774c(long j2) {
        m22776e();
        if (j2 >= 0) {
            this.f28624d = this.f28622b.mo22837j().mo14608a();
            if (m22773f().postDelayed(this.f28623c, j2)) {
                return;
            }
            this.f28622b.mo22836h().m23137H().m23148b("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    /* renamed from: d */
    public final boolean m22775d() {
        return this.f28624d != 0;
    }

    /* renamed from: e */
    final void m22776e() {
        this.f28624d = 0L;
        m22773f().removeCallbacks(this.f28623c);
    }
}
