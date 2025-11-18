package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdpe<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final zzdpe f25799f;

    /* renamed from: g */
    private boolean f25800g;

    static {
        zzdpe zzdpeVar = new zzdpe();
        f25799f = zzdpeVar;
        zzdpeVar.f25800g = false;
    }

    private zzdpe() {
        this.f25800g = true;
    }

    /* renamed from: e */
    private static int m19772e(Object obj) {
        if (obj instanceof byte[]) {
            return zzdod.m19741b((byte[]) obj);
        }
        if (obj instanceof zzdoe) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static <K, V> zzdpe<K, V> m19773h() {
        return f25799f;
    }

    /* renamed from: j */
    private final void m19774j() {
        if (!this.f25800g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final boolean m19775b() {
        return this.f25800g;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m19774j();
        super.clear();
    }

    /* renamed from: d */
    public final void m19776d(zzdpe<K, V> zzdpeVar) {
        m19774j();
        if (zzdpeVar.isEmpty()) {
            return;
        }
        putAll(zzdpeVar);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpe.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m19777f() {
        this.f25800g = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM19772e = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM19772e += m19772e(entry.getValue()) ^ m19772e(entry.getKey());
        }
        return iM19772e;
    }

    /* renamed from: i */
    public final zzdpe<K, V> m19778i() {
        return isEmpty() ? new zzdpe<>() : new zzdpe<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        m19774j();
        zzdod.m19740a(k2);
        zzdod.m19740a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m19774j();
        for (K k2 : map.keySet()) {
            zzdod.m19740a(k2);
            zzdod.m19740a(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m19774j();
        return (V) super.remove(obj);
    }

    private zzdpe(Map<K, V> map) {
        super(map);
        this.f25800g = true;
    }
}
