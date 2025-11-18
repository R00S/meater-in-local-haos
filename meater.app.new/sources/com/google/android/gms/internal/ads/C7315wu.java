package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wu */
/* loaded from: classes2.dex */
final class C7315wu extends AbstractC7278vu<Object> {
    C7315wu() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: a */
    final int mo15957a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: b */
    final Object mo15958b(zzdno zzdnoVar, zzdpk zzdpkVar, int i2) {
        return zzdnoVar.m19704a(zzdpkVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: c */
    final <UT, UB> UB mo15959c(InterfaceC6873kw interfaceC6873kw, Object obj, zzdno zzdnoVar, C7389yu<Object> c7389yu, UB ub, AbstractC6578cx<UT, UB> abstractC6578cx) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: d */
    final void mo15960d(zzdmr zzdmrVar, Object obj, zzdno zzdnoVar, C7389yu<Object> c7389yu) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: e */
    final void mo15961e(InterfaceC6873kw interfaceC6873kw, Object obj, zzdno zzdnoVar, C7389yu<Object> c7389yu) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: f */
    final void mo15962f(InterfaceC7244ux interfaceC7244ux, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: g */
    final void mo15963g(Object obj) {
        mo15965i(obj).m16126l();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: h */
    final boolean mo15964h(zzdpk zzdpkVar) {
        return zzdpkVar instanceof zzdob.zzc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: i */
    final C7389yu<Object> mo15965i(Object obj) {
        return ((zzdob.zzc) obj).zzhhj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7278vu
    /* renamed from: j */
    final C7389yu<Object> mo15966j(Object obj) {
        zzdob.zzc zzcVar = (zzdob.zzc) obj;
        if (zzcVar.zzhhj.m16122c()) {
            zzcVar.zzhhj = (C7389yu) zzcVar.zzhhj.clone();
        }
        return zzcVar.zzhhj;
    }
}
