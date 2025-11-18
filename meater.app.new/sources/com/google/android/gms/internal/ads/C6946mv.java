package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mv */
/* loaded from: classes2.dex */
final class C6946mv extends AbstractC6872kv {

    /* renamed from: c */
    private static final Class<?> f19942c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C6946mv() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static <L> List<L> m15572f(Object obj, long j2, int i2) {
        zzdos zzdosVar;
        List<L> listM15573g = m15573g(obj, j2);
        if (listM15573g.isEmpty()) {
            List<L> zzdosVar2 = listM15573g instanceof zzdot ? new zzdos(i2) : ((listM15573g instanceof InterfaceC6688fw) && (listM15573g instanceof zzdoj)) ? ((zzdoj) listM15573g).mo14989N(i2) : new ArrayList<>(i2);
            C6726gx.m15205g(obj, j2, zzdosVar2);
            return zzdosVar2;
        }
        if (f19942c.isAssignableFrom(listM15573g.getClass())) {
            ArrayList arrayList = new ArrayList(listM15573g.size() + i2);
            arrayList.addAll(listM15573g);
            C6726gx.m15205g(obj, j2, arrayList);
            zzdosVar = arrayList;
        } else {
            if (!(listM15573g instanceof zzdqw)) {
                if (!(listM15573g instanceof InterfaceC6688fw) || !(listM15573g instanceof zzdoj)) {
                    return listM15573g;
                }
                zzdoj zzdojVar = (zzdoj) listM15573g;
                if (zzdojVar.mo16107m0()) {
                    return listM15573g;
                }
                zzdoj zzdojVarMo14989N = zzdojVar.mo14989N(listM15573g.size() + i2);
                C6726gx.m15205g(obj, j2, zzdojVarMo14989N);
                return zzdojVarMo14989N;
            }
            zzdos zzdosVar3 = new zzdos(listM15573g.size() + i2);
            zzdosVar3.addAll((zzdqw) listM15573g);
            C6726gx.m15205g(obj, j2, zzdosVar3);
            zzdosVar = zzdosVar3;
        }
        return zzdosVar;
    }

    /* renamed from: g */
    private static <E> List<E> m15573g(Object obj, long j2) {
        return (List) C6726gx.m15190L(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: a */
    final <L> List<L> mo15441a(Object obj, long j2) {
        return m15572f(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: b */
    final <E> void mo15442b(Object obj, Object obj2, long j2) {
        List listM15573g = m15573g(obj2, j2);
        List listM15572f = m15572f(obj, j2, listM15573g.size());
        int size = listM15572f.size();
        int size2 = listM15573g.size();
        if (size > 0 && size2 > 0) {
            listM15572f.addAll(listM15573g);
        }
        if (size > 0) {
            listM15573g = listM15572f;
        }
        C6726gx.m15205g(obj, j2, listM15573g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6872kv
    /* renamed from: e */
    final void mo15443e(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) C6726gx.m15190L(obj, j2);
        if (list instanceof zzdot) {
            objUnmodifiableList = ((zzdot) list).mo19766H();
        } else {
            if (f19942c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6688fw) && (list instanceof zzdoj)) {
                zzdoj zzdojVar = (zzdoj) list;
                if (zzdojVar.mo16107m0()) {
                    zzdojVar.mo16108x0();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C6726gx.m15205g(obj, j2, objUnmodifiableList);
    }
}
