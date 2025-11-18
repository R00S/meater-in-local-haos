package m8;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: AbstractListMultimap.java */
/* renamed from: m8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3988c<K, V> extends AbstractC3989d<K, V> implements InterfaceC3984G<K, V> {
    protected AbstractC3988c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // m8.AbstractC3989d, m8.M
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    @Override // m8.AbstractC3991f, m8.M
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // m8.AbstractC3991f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // m8.AbstractC3989d, m8.M
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // m8.AbstractC3989d
    <E> Collection<E> y(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // m8.AbstractC3989d
    Collection<V> z(K k10, Collection<V> collection) {
        return A(k10, (List) collection, null);
    }
}
