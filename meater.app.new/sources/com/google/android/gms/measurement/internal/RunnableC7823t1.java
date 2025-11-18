package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.t1 */
/* loaded from: classes2.dex */
final class RunnableC7823t1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28906f;

    /* renamed from: g */
    private final /* synthetic */ long f28907g;

    /* renamed from: h */
    private final /* synthetic */ zzb f28908h;

    RunnableC7823t1(zzb zzbVar, String str, long j2) {
        this.f28908h = zzbVar;
        this.f28906f = str;
        this.f28907g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28908h.m23072F(this.f28906f, this.f28907g);
    }
}
