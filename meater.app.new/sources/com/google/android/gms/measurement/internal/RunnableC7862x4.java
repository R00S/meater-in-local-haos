package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* loaded from: classes2.dex */
final class RunnableC7862x4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f28992f;

    /* renamed from: g */
    private final /* synthetic */ String f28993g;

    /* renamed from: h */
    private final /* synthetic */ Object f28994h;

    /* renamed from: i */
    private final /* synthetic */ long f28995i;

    /* renamed from: j */
    private final /* synthetic */ zzhc f28996j;

    RunnableC7862x4(zzhc zzhcVar, String str, String str2, Object obj, long j2) {
        this.f28996j = zzhcVar;
        this.f28992f = str;
        this.f28993g = str2;
        this.f28994h = obj;
        this.f28995i = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f28996j.m23284V(this.f28992f, this.f28993g, this.f28994h, this.f28995i);
    }
}
