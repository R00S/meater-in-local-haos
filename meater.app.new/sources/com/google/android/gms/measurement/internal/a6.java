package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2554p2;
import com.google.android.gms.internal.measurement.C2562q2;
import com.google.android.gms.internal.measurement.C2625y2;
import com.google.android.gms.internal.measurement.C2633z2;
import com.google.android.gms.internal.measurement.F6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class a6 {

    /* renamed from: a, reason: collision with root package name */
    private String f35264a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35265b;

    /* renamed from: c, reason: collision with root package name */
    private C2625y2 f35266c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f35267d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f35268e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, Long> f35269f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Integer, List<Long>> f35270g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Y5 f35271h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.F4$a, com.google.android.gms.internal.measurement.p2$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.y2$a] */
    final C2554p2 a(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? N10 = C2554p2.N();
        N10.v(i10);
        N10.B(this.f35265b);
        C2625y2 c2625y2 = this.f35266c;
        if (c2625y2 != null) {
            N10.A(c2625y2);
        }
        ?? F10 = C2625y2.V().B(N5.P(this.f35267d)).F(N5.P(this.f35268e));
        if (this.f35269f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f35269f.size());
            for (Integer num : this.f35269f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = this.f35269f.get(num);
                if (l10 != null) {
                    arrayList.add((C2562q2) ((com.google.android.gms.internal.measurement.F4) C2562q2.N().v(iIntValue).w(l10.longValue()).x()));
                }
            }
        }
        if (arrayList != null) {
            F10.w(arrayList);
        }
        if (this.f35270g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f35270g.size());
            for (Integer num2 : this.f35270g.keySet()) {
                C2633z2.a aVarV = C2633z2.O().v(num2.intValue());
                List<Long> list = this.f35270g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    aVarV.w(list);
                }
                arrayList2.add((C2633z2) ((com.google.android.gms.internal.measurement.F4) aVarV.x()));
            }
        }
        F10.D(arrayList2);
        N10.w(F10);
        return (C2554p2) ((com.google.android.gms.internal.measurement.F4) N10.x());
    }

    final void c(AbstractC2714b abstractC2714b) {
        int iA = abstractC2714b.a();
        Boolean bool = abstractC2714b.f35274c;
        if (bool != null) {
            this.f35268e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = abstractC2714b.f35275d;
        if (bool2 != null) {
            this.f35267d.set(iA, bool2.booleanValue());
        }
        if (abstractC2714b.f35276e != null) {
            Long l10 = this.f35269f.get(Integer.valueOf(iA));
            long jLongValue = abstractC2714b.f35276e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f35269f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (abstractC2714b.f35277f != null) {
            List<Long> arrayList = this.f35270g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f35270g.put(Integer.valueOf(iA), arrayList);
            }
            if (abstractC2714b.j()) {
                arrayList.clear();
            }
            if (F6.a() && this.f35271h.c().K(this.f35264a, K.f34908A0) && abstractC2714b.i()) {
                arrayList.clear();
            }
            if (!F6.a() || !this.f35271h.c().K(this.f35264a, K.f34908A0)) {
                arrayList.add(Long.valueOf(abstractC2714b.f35277f.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC2714b.f35277f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    private a6(Y5 y52, String str) {
        this.f35271h = y52;
        this.f35264a = str;
        this.f35265b = true;
        this.f35267d = new BitSet();
        this.f35268e = new BitSet();
        this.f35269f = new C4391a();
        this.f35270g = new C4391a();
    }

    private a6(Y5 y52, String str, C2625y2 c2625y2, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f35271h = y52;
        this.f35264a = str;
        this.f35267d = bitSet;
        this.f35268e = bitSet2;
        this.f35269f = map;
        this.f35270g = new C4391a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f35270g.put(num, arrayList);
            }
        }
        this.f35265b = false;
        this.f35266c = c2625y2;
    }
}
