package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.C0274c;
import androidx.work.InterfaceC0815v;

/* compiled from: DefaultRunnableScheduler.java */
/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public class C0714a implements InterfaceC0815v {

    /* renamed from: a */
    private final Handler f4535a = C0274c.m1838a(Looper.getMainLooper());

    @Override // androidx.work.InterfaceC0815v
    /* renamed from: a */
    public void mo4867a(long j2, Runnable runnable) {
        this.f4535a.postDelayed(runnable, j2);
    }

    @Override // androidx.work.InterfaceC0815v
    /* renamed from: b */
    public void mo4868b(Runnable runnable) {
        this.f4535a.removeCallbacks(runnable);
    }
}
