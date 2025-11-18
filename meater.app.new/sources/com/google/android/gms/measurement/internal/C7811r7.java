package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes2.dex */
final class C7811r7 {

    /* renamed from: a */
    private String f28885a;

    /* renamed from: b */
    private zzbr.zza f28886b;

    /* renamed from: c */
    private BitSet f28887c;

    /* renamed from: d */
    private BitSet f28888d;

    /* renamed from: e */
    private Map<Integer, Long> f28889e;

    /* renamed from: f */
    private Map<Integer, List<Long>> f28890f;

    /* renamed from: g */
    private final /* synthetic */ C7802q7 f28891g;

    private C7811r7(C7802q7 c7802q7, String str) {
        this.f28891g = c7802q7;
        this.f28885a = str;
        this.f28886b = (zzbr.zza) ((zzfd) zzbr.zza.m21638Q().m21649C(true).mo22283y());
        this.f28887c = new BitSet();
        this.f28888d = new BitSet();
        this.f28889e = new C0867a();
        this.f28890f = new C0867a();
    }

    /* renamed from: c */
    private final List<zzbr.zzb> m22845c() {
        if (this.f28889e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f28889e.size());
        Iterator<Integer> it = this.f28889e.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            arrayList.add((zzbr.zzb) ((zzfd) zzbr.zzb.m21657J().m21664w(iIntValue).m21663A(this.f28889e.get(Integer.valueOf(iIntValue)).longValue()).mo22283y()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static List<zzbr.zzj> m22846d(List<zzbr.zzj> list, List<zzbr.zzj> list2, List<Integer> list3) {
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list2);
        C0867a c0867a = new C0867a();
        for (zzbr.zzj zzjVar : list) {
            if (zzjVar.m22041I() && zzjVar.m22044M() > 0) {
                c0867a.put(Integer.valueOf(zzjVar.m22042J()), Long.valueOf(zzjVar.m22040B(zzjVar.m22044M() - 1)));
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzbr.zzj zzjVar2 = (zzbr.zzj) arrayList.get(i2);
            Long l = (Long) c0867a.remove(zzjVar2.m22041I() ? Integer.valueOf(zzjVar2.m22042J()) : null);
            if (l != null && (list3 == null || !list3.contains(Integer.valueOf(zzjVar2.m22042J())))) {
                ArrayList arrayList2 = new ArrayList();
                if (l.longValue() < zzjVar2.m22040B(0)) {
                    arrayList2.add(l);
                }
                arrayList2.addAll(zzjVar2.m22043L());
                arrayList.set(i2, (zzbr.zzj) ((zzfd) zzjVar2.m22274v().m22048w().m22047C(arrayList2).mo22283y()));
            }
        }
        for (Integer num : c0867a.keySet()) {
            arrayList.add((zzbr.zzj) ((zzfd) zzbr.zzj.m22036N().m22045A(num.intValue()).m22046B(((Long) c0867a.get(num)).longValue()).mo22283y()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.internal.measurement.zzbr.zza m22847a(int r8, boolean r9, java.util.List<java.lang.Integer> r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.measurement.zzbr$zza r0 = r7.f28886b
            if (r0 != 0) goto L9
            com.google.android.gms.internal.measurement.zzbr$zza$zza r0 = com.google.android.gms.internal.measurement.zzbr.zza.m21638Q()
            goto Lf
        L9:
            com.google.android.gms.internal.measurement.zzfd$zzb r0 = r0.m22274v()
            com.google.android.gms.internal.measurement.zzbr$zza$zza r0 = (com.google.android.gms.internal.measurement.zzbr.zza.C11494zza) r0
        Lf:
            r0.m21652w(r8)
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r8 = com.google.android.gms.internal.measurement.zzbr.zzi.m22004a0()
            java.util.BitSet r1 = r7.f28887c
            java.util.List r1 = com.google.android.gms.measurement.internal.zzkg.m23469F(r1)
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r8 = r8.m22025E(r1)
            java.util.BitSet r1 = r7.f28888d
            java.util.List r1 = com.google.android.gms.measurement.internal.zzkg.m23469F(r1)
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r8 = r8.m22022B(r1)
            java.util.List r1 = r7.m22845c()
            r8.m22026F(r1)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r1 = r7.f28890f
            if (r1 != 0) goto L3a
            java.util.List r1 = java.util.Collections.emptyList()
            goto L98
        L3a:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r2 = r7.f28890f
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r2 = r7.f28890f
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L4f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L98
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            com.google.android.gms.internal.measurement.zzbr$zzj$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzj.m22036N()
            int r5 = r3.intValue()
            com.google.android.gms.internal.measurement.zzbr$zzj$zza r4 = r4.m22045A(r5)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r5 = r7.f28890f
            java.lang.Object r3 = r5.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L8c
            java.util.Collections.sort(r3)
            java.util.Iterator r3 = r3.iterator()
        L78:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r3.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r4.m22046B(r5)
            goto L78
        L8c:
            com.google.android.gms.internal.measurement.zzgo r3 = r4.mo22283y()
            com.google.android.gms.internal.measurement.zzfd r3 = (com.google.android.gms.internal.measurement.zzfd) r3
            com.google.android.gms.internal.measurement.zzbr$zzj r3 = (com.google.android.gms.internal.measurement.zzbr.zzj) r3
            r1.add(r3)
            goto L4f
        L98:
            boolean r2 = r0.m21650D()
            if (r2 == 0) goto Lc2
            boolean r2 = com.google.android.gms.internal.measurement.zzmd.m22519b()
            if (r2 == 0) goto Lb6
            com.google.android.gms.measurement.internal.q7 r2 = r7.f28891g
            com.google.android.gms.measurement.internal.zzx r2 = r2.mo22841n()
            java.lang.String r3 = r7.f28885a
            com.google.android.gms.measurement.internal.zzem<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzap.f29088D0
            boolean r2 = r2.m23593y(r3, r4)
            if (r2 == 0) goto Lb6
            if (r9 != 0) goto Lc2
        Lb6:
            com.google.android.gms.internal.measurement.zzbr$zzi r9 = r0.m21651E()
            java.util.List r9 = r9.m22019X()
            java.util.List r1 = m22846d(r9, r1, r10)
        Lc2:
            r8.m22027G(r1)
            r0.m21647A(r8)
            com.google.android.gms.internal.measurement.zzgo r8 = r0.mo22283y()
            com.google.android.gms.internal.measurement.zzfd r8 = (com.google.android.gms.internal.measurement.zzfd) r8
            com.google.android.gms.internal.measurement.zzbr$zza r8 = (com.google.android.gms.internal.measurement.zzbr.zza) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7811r7.m22847a(int, boolean, java.util.List):com.google.android.gms.internal.measurement.zzbr$zza");
    }

    /* renamed from: e */
    final void m22848e(zzbr.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map) {
        this.f28887c = bitSet;
        this.f28888d = bitSet2;
        this.f28889e = map;
        zzbr.zzi.zza zzaVarM22022B = zzbr.zzi.m22004a0().m22025E(zzkg.m23469F(bitSet)).m22022B(zzkg.m23469F(bitSet2));
        zzaVarM22022B.m22026F(m22845c());
        this.f28886b = (zzbr.zza) ((zzfd) zzbr.zza.m21638Q().m21649C(false).m21648B(zziVar).m21647A(zzaVarM22022B).mo22283y());
    }

    /* renamed from: f */
    final void m22849f(AbstractC7856w7 abstractC7856w7) {
        int iMo22852a = abstractC7856w7.mo22852a();
        Boolean bool = abstractC7856w7.f28981c;
        if (bool != null) {
            this.f28888d.set(iMo22852a, bool.booleanValue());
        }
        Boolean bool2 = abstractC7856w7.f28982d;
        if (bool2 != null) {
            this.f28887c.set(iMo22852a, bool2.booleanValue());
        }
        if (abstractC7856w7.f28983e != null) {
            Long l = this.f28889e.get(Integer.valueOf(iMo22852a));
            long jLongValue = abstractC7856w7.f28983e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f28889e.put(Integer.valueOf(iMo22852a), Long.valueOf(jLongValue));
            }
        }
        if (abstractC7856w7.f28984f != null) {
            List<Long> arrayList = this.f28890f.get(Integer.valueOf(iMo22852a));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f28890f.put(Integer.valueOf(iMo22852a), arrayList);
            }
            arrayList.add(Long.valueOf(abstractC7856w7.f28984f.longValue() / 1000));
        }
    }

    /* synthetic */ C7811r7(C7802q7 c7802q7, String str, C7820s7 c7820s7) {
        this(c7802q7, str);
    }
}
