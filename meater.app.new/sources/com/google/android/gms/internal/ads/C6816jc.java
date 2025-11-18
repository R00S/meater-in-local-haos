package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jc */
/* loaded from: classes2.dex */
final class C6816jc implements zzcdg {

    /* renamed from: a */
    private zzbtv f19469a;

    /* renamed from: b */
    private zzcyg f19470b;

    /* renamed from: c */
    private zzcyo f19471c;

    /* renamed from: d */
    private zzbqy f19472d;

    /* renamed from: e */
    private zzcfp f19473e;

    /* renamed from: f */
    private zzbpx f19474f;

    /* renamed from: g */
    private zzbqt f19475g;

    /* renamed from: h */
    private final /* synthetic */ zzbkc f19476h;

    private C6816jc(zzbkc zzbkcVar) {
        this.f19476h = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    /* renamed from: a */
    public final /* synthetic */ zzcdg mo15369a(zzbqy zzbqyVar) {
        this.f19472d = (zzbqy) zzdto.m19873a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    /* renamed from: b */
    public final zzcdf mo15370b() {
        zzdto.m19875c(this.f19469a, zzbtv.class);
        if (this.f19470b == null) {
            this.f19470b = new zzcyg();
        }
        if (this.f19471c == null) {
            this.f19471c = new zzcyo();
        }
        zzdto.m19875c(this.f19472d, zzbqy.class);
        if (this.f19473e == null) {
            this.f19473e = new zzcfp();
        }
        if (this.f19474f == null) {
            this.f19474f = new zzbpx();
        }
        if (this.f19475g == null) {
            this.f19475g = new zzbqt();
        }
        return new C6853kc(this.f19476h, this.f19469a, this.f19470b, this.f19471c, this.f19472d, this.f19473e, this.f19474f, this.f19475g);
    }

    @Override // com.google.android.gms.internal.ads.zzcdg
    /* renamed from: c */
    public final /* synthetic */ zzcdg mo15371c(zzbtv zzbtvVar) {
        this.f19469a = (zzbtv) zzdto.m19873a(zzbtvVar);
        return this;
    }
}
