package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzse {

    /* renamed from: a */
    private final ExecutorService f26986a;

    /* renamed from: b */
    private m30<? extends zzsh> f26987b;

    /* renamed from: c */
    private IOException f26988c;

    public zzse(String str) {
        this.f26986a = zzsy.m20544h(str);
    }

    /* renamed from: a */
    public final boolean m20472a() {
        return this.f26987b != null;
    }

    /* renamed from: b */
    public final <T extends zzsh> long m20473b(T t, zzsf<T> zzsfVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        zzsk.m20481e(looperMyLooper != null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new m30(this, looperMyLooper, t, zzsfVar, i2, jElapsedRealtime).m15528d(0L);
        return jElapsedRealtime;
    }

    /* renamed from: f */
    public final void m20474f(Runnable runnable) {
        m30<? extends zzsh> m30Var = this.f26987b;
        if (m30Var != null) {
            m30Var.m15529e(true);
        }
        this.f26986a.execute(runnable);
        this.f26986a.shutdown();
    }

    /* renamed from: h */
    public final void m20475h(int i2) throws IOException {
        IOException iOException = this.f26988c;
        if (iOException != null) {
            throw iOException;
        }
        m30<? extends zzsh> m30Var = this.f26987b;
        if (m30Var != null) {
            m30Var.m15527c(m30Var.f19864h);
        }
    }

    /* renamed from: i */
    public final void m20476i() {
        this.f26987b.m15529e(false);
    }
}
