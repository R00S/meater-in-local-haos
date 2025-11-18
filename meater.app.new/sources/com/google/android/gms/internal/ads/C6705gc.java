package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gc */
/* loaded from: classes2.dex */
final class C6705gc implements zzbwt {

    /* renamed from: a */
    private zzbtv f18965a;

    /* renamed from: b */
    private zzcyg f18966b;

    /* renamed from: c */
    private zzcyo f18967c;

    /* renamed from: d */
    private zzbqy f18968d;

    /* renamed from: e */
    private zzcfp f18969e;

    /* renamed from: f */
    private zzbpx f18970f;

    /* renamed from: g */
    private zzbqt f18971g;

    /* renamed from: h */
    private zzcow f18972h;

    /* renamed from: i */
    private final /* synthetic */ zzbkc f18973i;

    private C6705gc(zzbkc zzbkcVar) {
        this.f18973i = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    /* renamed from: a */
    public final zzbws mo15162a() {
        zzdto.m19875c(this.f18965a, zzbtv.class);
        if (this.f18966b == null) {
            this.f18966b = new zzcyg();
        }
        if (this.f18967c == null) {
            this.f18967c = new zzcyo();
        }
        zzdto.m19875c(this.f18968d, zzbqy.class);
        if (this.f18969e == null) {
            this.f18969e = new zzcfp();
        }
        if (this.f18970f == null) {
            this.f18970f = new zzbpx();
        }
        if (this.f18971g == null) {
            this.f18971g = new zzbqt();
        }
        zzdto.m19875c(this.f18972h, zzcow.class);
        return new C6742hc(this.f18973i, this.f18965a, this.f18966b, this.f18967c, this.f18968d, this.f18969e, this.f18970f, this.f18971g, this.f18972h);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    /* renamed from: b */
    public final /* synthetic */ zzbwt mo15163b(zzcow zzcowVar) {
        this.f18972h = (zzcow) zzdto.m19873a(zzcowVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    /* renamed from: c */
    public final /* synthetic */ zzbwt mo15164c(zzbqy zzbqyVar) {
        this.f18968d = (zzbqy) zzdto.m19873a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    /* renamed from: d */
    public final /* synthetic */ zzbwt mo15165d(zzbtv zzbtvVar) {
        this.f18965a = (zzbtv) zzdto.m19873a(zzbtvVar);
        return this;
    }
}
