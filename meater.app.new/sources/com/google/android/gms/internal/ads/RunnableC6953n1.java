package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n1 */
/* loaded from: classes2.dex */
final /* synthetic */ class RunnableC6953n1 implements Runnable {

    /* renamed from: f */
    private final zzajw f19972f;

    private RunnableC6953n1(zzajw zzajwVar) {
        this.f19972f = zzajwVar;
    }

    /* renamed from: a */
    static Runnable m15591a(zzajw zzajwVar) {
        return new RunnableC6953n1(zzajwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19972f.destroy();
    }
}
