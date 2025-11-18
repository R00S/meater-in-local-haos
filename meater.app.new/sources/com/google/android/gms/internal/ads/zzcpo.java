package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzcpo extends zzzg {

    /* renamed from: f */
    private final Context f24873f;

    /* renamed from: g */
    private final zzbjm f24874g;

    /* renamed from: h */
    @VisibleForTesting
    private final zzcxx f24875h;

    /* renamed from: i */
    @VisibleForTesting
    private final zzbze f24876i;

    /* renamed from: j */
    private zzyz f24877j;

    public zzcpo(zzbjm zzbjmVar, Context context, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.f24875h = zzcxxVar;
        this.f24876i = new zzbze();
        this.f24874g = zzbjmVar;
        zzcxxVar.m19054t(str);
        this.f24873f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: D5 */
    public final void mo16328D5(String str, zzafr zzafrVar, zzafo zzafoVar) {
        this.f24876i.m18577g(str, zzafrVar, zzafoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: G3 */
    public final void mo16329G3(zzafi zzafiVar) {
        this.f24876i.m18573c(zzafiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: J1 */
    public final zzzc mo16330J1() {
        zzbzc zzbzcVarM18572b = this.f24876i.m18572b();
        this.f24875h.m19047h(zzbzcVarM18572b.m18567f());
        this.f24875h.m19050l(zzbzcVarM18572b.m18568g());
        zzcxx zzcxxVar = this.f24875h;
        if (zzcxxVar.m19040G() == null) {
            zzcxxVar.m19051n(zzyd.m20822Y(this.f24873f));
        }
        return new zzcpp(this.f24873f, this.f24874g, this.f24875h, zzbzcVarM18572b, this.f24877j);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: M2 */
    public final void mo16331M2(zzaje zzajeVar) {
        this.f24876i.m18576f(zzajeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: Q3 */
    public final void mo16332Q3(zzaiy zzaiyVar) {
        this.f24875h.m19046g(zzaiyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: X1 */
    public final void mo16333X1(PublisherAdViewOptions publisherAdViewOptions) {
        this.f24875h.m19044e(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: Z3 */
    public final void mo16334Z3(zzafx zzafxVar) {
        this.f24876i.m18575e(zzafxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: e2 */
    public final void mo16335e2(zzyz zzyzVar) {
        this.f24877j = zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: i1 */
    public final void mo16336i1(zzafu zzafuVar, zzyd zzydVar) {
        this.f24876i.m18571a(zzafuVar);
        this.f24875h.m19051n(zzydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: k6 */
    public final void mo16337k6(zzady zzadyVar) {
        this.f24875h.m19045f(zzadyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: q5 */
    public final void mo16338q5(zzzy zzzyVar) {
        this.f24875h.m19052o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* renamed from: y1 */
    public final void mo16339y1(zzafl zzaflVar) {
        this.f24876i.m18574d(zzaflVar);
    }
}
