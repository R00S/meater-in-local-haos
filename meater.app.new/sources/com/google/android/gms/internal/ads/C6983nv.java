package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nv */
/* loaded from: classes2.dex */
final class C6983nv extends AbstractC6872kv {
    private C6983nv() {
        super();
    }

    /* renamed from: f */
    private static <E> zzdoj<E> m15600f(Object obj, long j2) {
        return (zzdoj) C6726gx.m15190L(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: a */
    final <L> List<L> mo15441a(Object obj, long j2) {
        zzdoj zzdojVarM15600f = m15600f(obj, j2);
        if (zzdojVarM15600f.mo16107m0()) {
            return zzdojVarM15600f;
        }
        int size = zzdojVarM15600f.size();
        zzdoj zzdojVarMo14989N = zzdojVarM15600f.mo14989N(size == 0 ? 10 : size << 1);
        C6726gx.m15205g(obj, j2, zzdojVarMo14989N);
        return zzdojVarMo14989N;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: b */
    final <E> void mo15442b(Object obj, Object obj2, long j2) {
        zzdoj zzdojVarM15600f = m15600f(obj, j2);
        zzdoj zzdojVarM15600f2 = m15600f(obj2, j2);
        int size = zzdojVarM15600f.size();
        int size2 = zzdojVarM15600f2.size();
        if (size > 0 && size2 > 0) {
            if (!zzdojVarM15600f.mo16107m0()) {
                zzdojVarM15600f = zzdojVarM15600f.mo14989N(size2 + size);
            }
            zzdojVarM15600f.addAll(zzdojVarM15600f2);
        }
        if (size > 0) {
            zzdojVarM15600f2 = zzdojVarM15600f;
        }
        C6726gx.m15205g(obj, j2, zzdojVarM15600f2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: e */
    final void mo15443e(Object obj, long j2) {
        m15600f(obj, j2).mo16108x0();
    }
}
