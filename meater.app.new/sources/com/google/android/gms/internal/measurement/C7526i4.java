package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i4 */
/* loaded from: classes2.dex */
final class C7526i4 extends AbstractC7520h4<zzhy, zzhy> {
    C7526i4() {
    }

    /* renamed from: t */
    private static void m21148t(Object obj, zzhy zzhyVar) {
        ((zzfd) obj).zzb = zzhyVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: a */
    final /* synthetic */ zzhy mo21125a() {
        return zzhy.m22333g();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: b */
    final /* synthetic */ zzhy mo21126b(zzhy zzhyVar) {
        zzhy zzhyVar2 = zzhyVar;
        zzhyVar2.m22338i();
        return zzhyVar2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: c */
    final /* synthetic */ void mo21127c(zzhy zzhyVar, int i2, int i3) {
        zzhyVar.m22334c((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: d */
    final /* synthetic */ void mo21128d(zzhy zzhyVar, int i2, long j2) {
        zzhyVar.m22334c(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: e */
    final /* synthetic */ void mo21129e(zzhy zzhyVar, int i2, zzdu zzduVar) {
        zzhyVar.m22334c((i2 << 3) | 2, zzduVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: f */
    final /* synthetic */ void mo21130f(zzhy zzhyVar, int i2, zzhy zzhyVar2) {
        zzhyVar.m22334c((i2 << 3) | 3, zzhyVar2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: g */
    final /* synthetic */ void mo21131g(zzhy zzhyVar, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        zzhyVar.m22337h(interfaceC7622y4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: h */
    final /* bridge */ /* synthetic */ void mo21132h(Object obj, zzhy zzhyVar) {
        m21148t(obj, zzhyVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: i */
    final boolean mo21133i(InterfaceC7573q3 interfaceC7573q3) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: k */
    final /* synthetic */ zzhy mo21135k(Object obj) {
        return ((zzfd) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: l */
    final /* synthetic */ void mo21136l(zzhy zzhyVar, int i2, long j2) {
        zzhyVar.m22334c((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: m */
    final /* synthetic */ void mo21137m(zzhy zzhyVar, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        zzhyVar.m22335e(interfaceC7622y4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: n */
    final /* synthetic */ void mo21138n(Object obj, zzhy zzhyVar) {
        m21148t(obj, zzhyVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: o */
    final /* synthetic */ zzhy mo21139o(Object obj) {
        zzhy zzhyVar = ((zzfd) obj).zzb;
        if (zzhyVar != zzhy.m22330a()) {
            return zzhyVar;
        }
        zzhy zzhyVarM22333g = zzhy.m22333g();
        m21148t(obj, zzhyVarM22333g);
        return zzhyVarM22333g;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: p */
    final /* synthetic */ zzhy mo21140p(zzhy zzhyVar, zzhy zzhyVar2) {
        zzhy zzhyVar3 = zzhyVar;
        zzhy zzhyVar4 = zzhyVar2;
        return zzhyVar4.equals(zzhy.m22330a()) ? zzhyVar3 : zzhy.m22331b(zzhyVar3, zzhyVar4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: q */
    final void mo21141q(Object obj) {
        ((zzfd) obj).zzb.m22338i();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: r */
    final /* synthetic */ int mo21142r(zzhy zzhyVar) {
        return zzhyVar.m22339j();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7520h4
    /* renamed from: s */
    final /* synthetic */ int mo21143s(zzhy zzhyVar) {
        return zzhyVar.m22340k();
    }
}
