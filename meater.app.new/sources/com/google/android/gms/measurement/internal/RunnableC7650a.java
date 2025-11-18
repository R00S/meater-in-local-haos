package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes2.dex */
final class RunnableC7650a implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28537f;

    /* renamed from: g */
    private final /* synthetic */ long f28538g;

    /* renamed from: h */
    private final /* synthetic */ zzb f28539h;

    RunnableC7650a(zzb zzbVar, String str, long j2) {
        this.f28539h = zzbVar;
        this.f28537f = str;
        this.f28538g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28539h.m23071E(this.f28537f, this.f28538g);
    }
}
