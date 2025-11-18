package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mc */
/* loaded from: classes2.dex */
final class C6927mc implements zzcqp {

    /* renamed from: a */
    private zzcyo f19907a;

    /* renamed from: b */
    private zzbqy f19908b;

    /* renamed from: c */
    private zzcqt f19909c;

    /* renamed from: d */
    private zzcfp f19910d;

    /* renamed from: e */
    private final /* synthetic */ zzbkc f19911e;

    private C6927mc(zzbkc zzbkcVar) {
        this.f19911e = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    /* renamed from: a */
    public final zzcqo mo15551a() {
        if (this.f19907a == null) {
            this.f19907a = new zzcyo();
        }
        zzdto.m19875c(this.f19908b, zzbqy.class);
        zzdto.m19875c(this.f19909c, zzcqt.class);
        if (this.f19910d == null) {
            this.f19910d = new zzcfp();
        }
        return new C6964nc(this.f19911e, this.f19907a, this.f19908b, this.f19909c, this.f19910d);
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    /* renamed from: b */
    public final /* synthetic */ zzcqp mo15552b(zzbqy zzbqyVar) {
        this.f19908b = (zzbqy) zzdto.m19873a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    /* renamed from: c */
    public final /* synthetic */ zzcqp mo15553c(zzcqt zzcqtVar) {
        this.f19909c = (zzcqt) zzdto.m19873a(zzcqtVar);
        return this;
    }
}
