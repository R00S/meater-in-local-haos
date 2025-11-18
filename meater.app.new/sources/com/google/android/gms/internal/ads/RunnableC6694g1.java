package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g1 */
/* loaded from: classes2.dex */
final class RunnableC6694g1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18926f;

    /* renamed from: g */
    private final /* synthetic */ zzajy f18927g;

    RunnableC6694g1(zzajy zzajyVar, String str) {
        this.f18927g = zzajyVar;
        this.f18926f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18927g.f22074f.loadUrl(this.f18926f);
    }
}
