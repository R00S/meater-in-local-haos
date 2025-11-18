package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2469e5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: C, reason: collision with root package name */
    private static final C2469e5<?, ?> f34106C;

    /* renamed from: B, reason: collision with root package name */
    private boolean f34107B;

    static {
        C2469e5<?, ?> c2469e5 = new C2469e5<>();
        f34106C = c2469e5;
        ((C2469e5) c2469e5).f34107B = false;
    }

    private C2469e5() {
        this.f34107B = true;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return I4.d((byte[]) obj);
        }
        if (obj instanceof H4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> C2469e5<K, V> c() {
        return (C2469e5<K, V>) f34106C;
    }

    private final void k() {
        if (!this.f34107B) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    public final void d(C2469e5<K, V> c2469e5) {
        k();
        if (c2469e5.isEmpty()) {
            return;
        }
        putAll(c2469e5);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2469e5.equals(java.lang.Object):boolean");
    }

    public final C2469e5<K, V> g() {
        return isEmpty() ? new C2469e5<>() : new C2469e5<>(this);
    }

    public final void h() {
        this.f34107B = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public final boolean i() {
        return this.f34107B;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        k();
        I4.e(k10);
        I4.e(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        k();
        for (K k10 : map.keySet()) {
            I4.e(k10);
            I4.e(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        k();
        return (V) super.remove(obj);
    }

    private C2469e5(Map<K, V> map) {
        super(map);
        this.f34107B = true;
    }
}
