package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xb */
/* loaded from: classes2.dex */
final class C7333xb implements zzbxp {

    /* renamed from: a */
    private zzcyo f20960a;

    /* renamed from: b */
    private zzbqy f20961b;

    /* renamed from: c */
    private zzcfp f20962c;

    /* renamed from: d */
    private zzbpx f20963d;

    /* renamed from: e */
    private zzbqt f20964e;

    /* renamed from: f */
    private zzbtv f20965f;

    /* renamed from: g */
    private zzbxk f20966g;

    /* renamed from: h */
    private zzcyg f20967h;

    /* renamed from: i */
    private final /* synthetic */ zzbkc f20968i;

    private C7333xb(zzbkc zzbkcVar) {
        this.f20968i = zzbkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    /* renamed from: a */
    public final /* synthetic */ zzbxp mo16040a(zzbtv zzbtvVar) {
        this.f20965f = (zzbtv) zzdto.m19873a(zzbtvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    /* renamed from: b */
    public final zzbxo mo16041b() {
        if (this.f20960a == null) {
            this.f20960a = new zzcyo();
        }
        zzdto.m19875c(this.f20961b, zzbqy.class);
        if (this.f20962c == null) {
            this.f20962c = new zzcfp();
        }
        if (this.f20963d == null) {
            this.f20963d = new zzbpx();
        }
        if (this.f20964e == null) {
            this.f20964e = new zzbqt();
        }
        zzdto.m19875c(this.f20965f, zzbtv.class);
        zzdto.m19875c(this.f20966g, zzbxk.class);
        if (this.f20967h == null) {
            this.f20967h = new zzcyg();
        }
        return new C7370yb(this.f20968i, this.f20960a, this.f20961b, this.f20962c, this.f20963d, this.f20964e, this.f20965f, this.f20966g, this.f20967h);
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    /* renamed from: c */
    public final /* synthetic */ zzbxp mo16042c(zzbqy zzbqyVar) {
        this.f20961b = (zzbqy) zzdto.m19873a(zzbqyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    /* renamed from: d */
    public final /* synthetic */ zzbxp mo16043d(zzbxk zzbxkVar) {
        this.f20966g = (zzbxk) zzdto.m19873a(zzbxkVar);
        return this;
    }
}
