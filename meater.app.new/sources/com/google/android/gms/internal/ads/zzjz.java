package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzjz {

    /* renamed from: a */
    private final ExecutorService f26411a;

    /* renamed from: b */
    private l00 f26412b;

    /* renamed from: c */
    private boolean f26413c;

    public zzjz(String str) {
        this.f26411a = zzkq.m20159e(str);
    }

    /* renamed from: c */
    static /* synthetic */ l00 m20114c(zzjz zzjzVar, l00 l00Var) {
        zzjzVar.f26412b = null;
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m20115e(zzjz zzjzVar, boolean z) {
        zzjzVar.f26413c = false;
        return false;
    }

    /* renamed from: a */
    public final boolean m20116a() {
        return this.f26413c;
    }

    /* renamed from: b */
    public final void m20117b() {
        if (this.f26413c) {
            m20119f();
        }
        this.f26411a.shutdown();
    }

    /* renamed from: d */
    public final void m20118d(zzkc zzkcVar, zzka zzkaVar) {
        Looper looperMyLooper = Looper.myLooper();
        zzkh.m20129d(looperMyLooper != null);
        zzkh.m20129d(!this.f26413c);
        this.f26413c = true;
        l00 l00Var = new l00(this, looperMyLooper, zzkcVar, zzkaVar, 0);
        this.f26412b = l00Var;
        this.f26411a.submit(l00Var);
    }

    /* renamed from: f */
    public final void m20119f() {
        zzkh.m20129d(this.f26413c);
        this.f26412b.m15502a();
    }
}
