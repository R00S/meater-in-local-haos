package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2436b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap<Integer, C2582t> f34047a = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap<Integer, C2582t> f34048b = new TreeMap<>();

    private static int a(Z2 z22, C2582t c2582t, InterfaceC2574s interfaceC2574s) {
        InterfaceC2574s interfaceC2574sA = c2582t.a(z22, Collections.singletonList(interfaceC2574s));
        if (interfaceC2574sA instanceof C2511k) {
            return Y1.i(interfaceC2574sA.h().doubleValue());
        }
        return -1;
    }

    public final void b(Z2 z22, C2454d c2454d) {
        W5 w52 = new W5(c2454d);
        for (Integer num : this.f34047a.keySet()) {
            C2463e c2463e = (C2463e) c2454d.d().clone();
            int iA = a(z22, this.f34047a.get(num), w52);
            if (iA == 2 || iA == -1) {
                c2454d.e(c2463e);
            }
        }
        Iterator<Integer> it = this.f34048b.keySet().iterator();
        while (it.hasNext()) {
            a(z22, this.f34048b.get(it.next()), w52);
        }
    }

    public final void c(String str, int i10, C2582t c2582t, String str2) {
        TreeMap<Integer, C2582t> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f34048b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f34047a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c2582t);
    }
}
