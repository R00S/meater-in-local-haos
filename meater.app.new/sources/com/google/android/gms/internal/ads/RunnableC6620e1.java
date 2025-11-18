package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e1 */
/* loaded from: classes2.dex */
final class RunnableC6620e1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18710f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f18711g;

    RunnableC6620e1(zzajy zzajyVar, String str) {
        this.f18711g = zzajyVar;
        this.f18710f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18711g.f22074f.loadData(this.f18710f, "text/html", "UTF-8");
    }
}
