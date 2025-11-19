package m8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Multimaps.java */
/* loaded from: classes2.dex */
public final class O {

    /* compiled from: Multimaps.java */
    private static class a<K, V> extends AbstractC3988c<K, V> {

        /* renamed from: H, reason: collision with root package name */
        transient l8.s<? extends List<V>> f45244H;

        a(Map<K, Collection<V>> map, l8.s<? extends List<V>> sVar) {
            super(map);
            this.f45244H = (l8.s) l8.m.l(sVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m8.AbstractC3989d
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public List<V> s() {
            return this.f45244H.get();
        }

        @Override // m8.AbstractC3991f
        Map<K, Collection<V>> e() {
            return u();
        }

        @Override // m8.AbstractC3991f
        Set<K> g() {
            return v();
        }
    }

    /* compiled from: Multimaps.java */
    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        abstract M<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    static boolean a(M<?, ?> m10, Object obj) {
        if (obj == m10) {
            return true;
        }
        if (obj instanceof M) {
            return m10.b().equals(((M) obj).b());
        }
        return false;
    }

    public static <K, V> InterfaceC3984G<K, V> b(Map<K, Collection<V>> map, l8.s<? extends List<V>> sVar) {
        return new a(map, sVar);
    }
}
