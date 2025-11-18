package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.dx */
/* loaded from: classes2.dex */
final class C6615dx extends AbstractC6578cx<zzdqu, zzdqu> {
    C6615dx() {
    }

    /* renamed from: t */
    private static void m15082t(Object obj, zzdqu zzdquVar) {
        ((zzdob) obj).zzhhd = zzdquVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: a */
    final /* synthetic */ void mo14996a(zzdqu zzdquVar, int i2, long j2) {
        zzdquVar.m19791k(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: b */
    final /* synthetic */ void mo14997b(zzdqu zzdquVar, int i2, zzdmr zzdmrVar) {
        zzdquVar.m19791k((i2 << 3) | 2, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: c */
    final /* synthetic */ void mo14998c(zzdqu zzdquVar, int i2, zzdqu zzdquVar2) {
        zzdquVar.m19791k((i2 << 3) | 3, zzdquVar2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: d */
    final /* synthetic */ void mo14999d(zzdqu zzdquVar, InterfaceC7244ux interfaceC7244ux) throws IOException {
        zzdquVar.m19789h(interfaceC7244ux);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: e */
    final boolean mo15000e(InterfaceC6873kw interfaceC6873kw) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: g */
    final void mo15002g(Object obj) {
        ((zzdob) obj).zzhhd.m19787d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: h */
    final /* synthetic */ zzdqu mo15003h(zzdqu zzdquVar) {
        zzdqu zzdquVar2 = zzdquVar;
        zzdquVar2.m19787d();
        return zzdquVar2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: i */
    final /* synthetic */ int mo15004i(zzdqu zzdquVar) {
        return zzdquVar.m19788e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: j */
    final /* synthetic */ zzdqu mo15005j(Object obj) {
        return ((zzdob) obj).zzhhd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: k */
    final /* synthetic */ zzdqu mo15006k(Object obj) {
        zzdqu zzdquVar = ((zzdob) obj).zzhhd;
        if (zzdquVar != zzdqu.m19782f()) {
            return zzdquVar;
        }
        zzdqu zzdquVarM19784i = zzdqu.m19784i();
        m15082t(obj, zzdquVarM19784i);
        return zzdquVarM19784i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: l */
    final /* synthetic */ int mo15007l(zzdqu zzdquVar) {
        return zzdquVar.m19790j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: m */
    final /* synthetic */ zzdqu mo15008m() {
        return zzdqu.m19784i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: n */
    final /* synthetic */ void mo15009n(zzdqu zzdquVar, int i2, long j2) {
        zzdquVar.m19791k((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: o */
    final /* synthetic */ void mo15010o(zzdqu zzdquVar, int i2, int i3) {
        zzdquVar.m19791k((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: p */
    final /* synthetic */ void mo15011p(zzdqu zzdquVar, InterfaceC7244ux interfaceC7244ux) throws IOException {
        zzdquVar.m19785b(interfaceC7244ux);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: q */
    final /* synthetic */ void mo15012q(Object obj, zzdqu zzdquVar) {
        m15082t(obj, zzdquVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: r */
    final /* synthetic */ void mo15013r(Object obj, zzdqu zzdquVar) {
        m15082t(obj, zzdquVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6578cx
    /* renamed from: s */
    final /* synthetic */ zzdqu mo15014s(zzdqu zzdquVar, zzdqu zzdquVar2) {
        zzdqu zzdquVar3 = zzdquVar;
        zzdqu zzdquVar4 = zzdquVar2;
        return zzdquVar4.equals(zzdqu.m19782f()) ? zzdquVar3 : zzdqu.m19781a(zzdquVar3, zzdquVar4);
    }
}
