package com.google.android.gms.stats;

/* renamed from: com.google.android.gms.stats.b */
/* loaded from: classes2.dex */
final class RunnableC7893b implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ WakeLock f29511f;

    RunnableC7893b(WakeLock wakeLock) {
        this.f29511f = wakeLock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29511f.m23629f(0);
    }
}
