package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q7 */
/* loaded from: classes2.dex */
final class RunnableC7070q7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f20378f;

    /* renamed from: g */
    private final /* synthetic */ String f20379g;

    /* renamed from: h */
    private final /* synthetic */ zzbcd f20380h;

    RunnableC7070q7(zzbcd zzbcdVar, String str, String str2) {
        this.f20380h = zzbcdVar;
        this.f20378f = str;
        this.f20379g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20380h.f22785w != null) {
            this.f20380h.f22785w.mo17417b(this.f20378f, this.f20379g);
        }
    }
}
