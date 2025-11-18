package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbnj implements zzdti<C7371yc> {

    /* renamed from: a */
    private final zzdtu<Context> f23294a;

    /* renamed from: b */
    private final zzdtu<zzcxn> f23295b;

    /* renamed from: c */
    private final zzdtu<View> f23296c;

    /* renamed from: d */
    private final zzdtu<zzbgz> f23297d;

    /* renamed from: e */
    private final zzdtu<zzbpb> f23298e;

    /* renamed from: f */
    private final zzdtu<zzbzc> f23299f;

    /* renamed from: g */
    private final zzdtu<zzbvd> f23300g;

    /* renamed from: h */
    private final zzdtu<zzcpm> f23301h;

    /* renamed from: i */
    private final zzdtu<Executor> f23302i;

    /* renamed from: j */
    private final zzdtu<zzcxu> f23303j;

    /* renamed from: k */
    private final zzdtu<zzcxm> f23304k;

    /* renamed from: l */
    private final zzdtu<zzbry> f23305l;

    /* renamed from: m */
    private final zzdtu<zzbso> f23306m;

    /* renamed from: n */
    private final zzdtu<String> f23307n;

    public zzbnj(zzdtu<Context> zzdtuVar, zzdtu<zzcxn> zzdtuVar2, zzdtu<View> zzdtuVar3, zzdtu<zzbgz> zzdtuVar4, zzdtu<zzbpb> zzdtuVar5, zzdtu<zzbzc> zzdtuVar6, zzdtu<zzbvd> zzdtuVar7, zzdtu<zzcpm> zzdtuVar8, zzdtu<Executor> zzdtuVar9, zzdtu<zzcxu> zzdtuVar10, zzdtu<zzcxm> zzdtuVar11, zzdtu<zzbry> zzdtuVar12, zzdtu<zzbso> zzdtuVar13, zzdtu<String> zzdtuVar14) {
        this.f23294a = zzdtuVar;
        this.f23295b = zzdtuVar2;
        this.f23296c = zzdtuVar3;
        this.f23297d = zzdtuVar4;
        this.f23298e = zzdtuVar5;
        this.f23299f = zzdtuVar6;
        this.f23300g = zzdtuVar7;
        this.f23301h = zzdtuVar8;
        this.f23302i = zzdtuVar9;
        this.f23303j = zzdtuVar10;
        this.f23304k = zzdtuVar11;
        this.f23305l = zzdtuVar12;
        this.f23306m = zzdtuVar13;
        this.f23307n = zzdtuVar14;
    }

    /* renamed from: a */
    public static C7371yc m17917a(Context context, zzcxn zzcxnVar, View view, zzbgz zzbgzVar, zzbpb zzbpbVar, zzbzc zzbzcVar, zzbvd zzbvdVar, zzdte<zzcpm> zzdteVar, Executor executor) {
        return new C7371yc(context, zzcxnVar, view, zzbgzVar, zzbpbVar, zzbzcVar, zzbvdVar, zzdteVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        C7371yc c7371yc = new C7371yc(this.f23294a.get(), this.f23295b.get(), this.f23296c.get(), this.f23297d.get(), this.f23298e.get(), this.f23299f.get(), this.f23300g.get(), zzdth.m19868b(this.f23301h), this.f23302i.get());
        zzbql.m18269d(c7371yc, this.f23303j.get());
        zzbql.m18268c(c7371yc, this.f23304k.get());
        zzbql.m18266a(c7371yc, this.f23305l.get());
        zzbql.m18267b(c7371yc, this.f23306m.get());
        zzbql.m18270e(c7371yc, this.f23307n.get());
        return c7371yc;
    }
}
