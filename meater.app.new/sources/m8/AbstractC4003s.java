package m8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
/* renamed from: m8.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4003s<K, V> extends AbstractC4004t implements Map<K, V> {
    protected AbstractC4003s() {
    }

    @Override // java.util.Map
    public void clear() {
        h().clear();
    }

    public boolean containsKey(Object obj) {
        return h().containsKey(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return h().entrySet();
    }

    public V get(Object obj) {
        return h().get(obj);
    }

    protected abstract Map<K, V> h();

    protected boolean i(Object obj) {
        return L.b(this, obj);
    }

    public boolean isEmpty() {
        return h().isEmpty();
    }

    protected boolean j(Object obj) {
        return L.c(this, obj);
    }

    public Set<K> keySet() {
        return h().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return h().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        h().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return h().remove(obj);
    }

    public int size() {
        return h().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return h().values();
    }

    protected int w() {
        return d0.d(entrySet());
    }
}
