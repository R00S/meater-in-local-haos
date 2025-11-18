package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* renamed from: androidx.datastore.preferences.protobuf.c0 */
/* loaded from: classes.dex */
public class C0363c0 extends C0366d0 {

    /* renamed from: f */
    private final InterfaceC0405q0 f2700f;

    /* compiled from: LazyField.java */
    /* renamed from: androidx.datastore.preferences.protobuf.c0$b */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: f */
        private Map.Entry<K, C0363c0> f2701f;

        /* renamed from: a */
        public C0363c0 m2585a() {
            return this.f2701f.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2701f.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C0363c0 value = this.f2701f.getValue();
            if (value == null) {
                return null;
            }
            return value.m2584f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC0405q0) {
                return this.f2701f.getValue().m2598d((InterfaceC0405q0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, C0363c0> entry) {
            this.f2701f = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: androidx.datastore.preferences.protobuf.c0$c */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f */
        private Iterator<Map.Entry<K, Object>> f2702f;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2702f = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2702f.next();
            return next.getValue() instanceof C0363c0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2702f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2702f.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C0366d0
    public boolean equals(Object obj) {
        return m2584f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC0405q0 m2584f() {
        return m2597c(this.f2700f);
    }

    @Override // androidx.datastore.preferences.protobuf.C0366d0
    public int hashCode() {
        return m2584f().hashCode();
    }

    public String toString() {
        return m2584f().toString();
    }
}
