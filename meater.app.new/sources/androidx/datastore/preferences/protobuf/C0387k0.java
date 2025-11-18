package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.k0 */
/* loaded from: classes.dex */
public final class C0387k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f */
    private static final C0387k0 f2817f;

    /* renamed from: g */
    private boolean f2818g;

    static {
        C0387k0 c0387k0 = new C0387k0();
        f2817f = c0387k0;
        c0387k0.m2935l();
    }

    private C0387k0() {
        this.f2818g = true;
    }

    /* renamed from: b */
    static <K, V> int m2927b(Map<K, V> map) {
        int iM2928d = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iM2928d += m2928d(entry.getValue()) ^ m2928d(entry.getKey());
        }
        return iM2928d;
    }

    /* renamed from: d */
    private static int m2928d(Object obj) {
        if (obj instanceof byte[]) {
            return C0357a0.m2559d((byte[]) obj);
        }
        if (obj instanceof C0357a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    private static void m2929e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C0357a0.m2556a(obj);
            C0357a0.m2556a(map.get(obj));
        }
    }

    /* renamed from: f */
    public static <K, V> C0387k0<K, V> m2930f() {
        return f2817f;
    }

    /* renamed from: h */
    private void m2931h() {
        if (!m2934k()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private static boolean m2932i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: j */
    static <K, V> boolean m2933j(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m2932i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m2931h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m2933j(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m2927b(this);
    }

    /* renamed from: k */
    public boolean m2934k() {
        return this.f2818g;
    }

    /* renamed from: l */
    public void m2935l() {
        this.f2818g = false;
    }

    /* renamed from: m */
    public void m2936m(C0387k0<K, V> c0387k0) {
        m2931h();
        if (c0387k0.isEmpty()) {
            return;
        }
        putAll(c0387k0);
    }

    /* renamed from: n */
    public C0387k0<K, V> m2937n() {
        return isEmpty() ? new C0387k0<>() : new C0387k0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        m2931h();
        C0357a0.m2556a(k2);
        C0357a0.m2556a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m2931h();
        m2929e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m2931h();
        return (V) super.remove(obj);
    }

    private C0387k0(Map<K, V> map) {
        super(map);
        this.f2818g = true;
    }
}
