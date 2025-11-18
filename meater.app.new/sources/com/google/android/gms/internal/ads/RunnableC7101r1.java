package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r1 */
/* loaded from: classes2.dex */
final /* synthetic */ class RunnableC7101r1 implements Runnable {

    /* renamed from: f */
    private final zzajw f20423f;

    private RunnableC7101r1(zzajw zzajwVar) {
        this.f20423f = zzajwVar;
    }

    /* renamed from: a */
    static Runnable m15815a(zzajw zzajwVar) {
        return new RunnableC7101r1(zzajwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20423f.destroy();
    }
}
