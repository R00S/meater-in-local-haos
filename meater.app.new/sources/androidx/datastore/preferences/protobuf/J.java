package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* loaded from: classes.dex */
public final class J<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: C, reason: collision with root package name */
    private static final J f24865C;

    /* renamed from: B, reason: collision with root package name */
    private boolean f24866B;

    static {
        J j10 = new J();
        f24865C = j10;
        j10.m();
    }

    private J() {
        this.f24866B = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int iC = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return C2079z.d((byte[]) obj);
        }
        if (obj instanceof C2079z.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C2079z.a(obj);
            C2079z.a(map.get(obj));
        }
    }

    public static <K, V> J<K, V> g() {
        return f24865C;
    }

    private void h() {
        if (!l()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean i(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean k(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !i(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean l() {
        return this.f24866B;
    }

    public void m() {
        this.f24866B = false;
    }

    public void n(J<K, V> j10) {
        h();
        if (j10.isEmpty()) {
            return;
        }
        putAll(j10);
    }

    public J<K, V> o() {
        return isEmpty() ? new J<>() : new J<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        h();
        C2079z.a(k10);
        C2079z.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        h();
        d(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        return (V) super.remove(obj);
    }

    private J(Map<K, V> map) {
        super(map);
        this.f24866B = true;
    }
}
