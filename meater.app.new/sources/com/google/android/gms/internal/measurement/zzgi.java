package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzgi<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final zzgi f28164f;

    /* renamed from: g */
    private boolean f28165g;

    static {
        zzgi zzgiVar = new zzgi();
        f28164f = zzgiVar;
        zzgiVar.f28165g = false;
    }

    private zzgi() {
        this.f28165g = true;
    }

    /* renamed from: b */
    private static int m22318b(Object obj) {
        if (obj instanceof byte[]) {
            return zzff.m22295j((byte[]) obj);
        }
        if (obj instanceof zzfi) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: d */
    public static <K, V> zzgi<K, V> m22319d() {
        return f28164f;
    }

    /* renamed from: j */
    private final void m22320j() {
        if (!this.f28165g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m22320j();
        super.clear();
    }

    /* renamed from: e */
    public final void m22321e(zzgi<K, V> zzgiVar) {
        m22320j();
        if (zzgiVar.isEmpty()) {
            return;
        }
        putAll(zzgiVar);
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
            r7 = 0
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
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgi.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final zzgi<K, V> m22322f() {
        return isEmpty() ? new zzgi<>() : new zzgi<>(this);
    }

    /* renamed from: h */
    public final void m22323h() {
        this.f28165g = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM22318b = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM22318b += m22318b(entry.getValue()) ^ m22318b(entry.getKey());
        }
        return iM22318b;
    }

    /* renamed from: i */
    public final boolean m22324i() {
        return this.f28165g;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        m22320j();
        zzff.m22289d(k2);
        zzff.m22289d(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m22320j();
        for (K k2 : map.keySet()) {
            zzff.m22289d(k2);
            zzff.m22289d(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m22320j();
        return (V) super.remove(obj);
    }

    private zzgi(Map<K, V> map) {
        super(map);
        this.f28165g = true;
    }
}
