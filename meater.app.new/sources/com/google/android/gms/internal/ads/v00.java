package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class v00 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f20664f;

    /* renamed from: g */
    private final /* synthetic */ long f20665g;

    /* renamed from: h */
    private final /* synthetic */ long f20666h;

    /* renamed from: i */
    private final /* synthetic */ zzma f20667i;

    v00(zzma zzmaVar, String str, long j2, long j3) {
        this.f20667i = zzmaVar;
        this.f20664f = str;
        this.f20665g = j2;
        this.f20666h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20667i.f26524b.m20229d(this.f20664f, this.f20665g, this.f20666h);
    }
}
