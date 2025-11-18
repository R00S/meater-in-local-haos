package m8;

import java.util.Map;
import l8.C3918k;

/* compiled from: AbstractMapEntry.java */
/* renamed from: m8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3990e<K, V> implements Map.Entry<K, V> {
    AbstractC3990e() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C3918k.a(getKey(), entry.getKey()) && C3918k.a(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
