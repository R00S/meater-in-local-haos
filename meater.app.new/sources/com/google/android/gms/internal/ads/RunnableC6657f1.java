package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f1 */
/* loaded from: classes2.dex */
final class RunnableC6657f1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18845f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f18846g;

    RunnableC6657f1(zzajy zzajyVar, String str) {
        this.f18846g = zzajyVar;
        this.f18845f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18846g.f22074f.loadData(this.f18845f, "text/html", "UTF-8");
    }
}
