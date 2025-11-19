package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes3.dex */
public class j extends k {

    /* renamed from: e, reason: collision with root package name */
    private final o f44078e;

    /* compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: B, reason: collision with root package name */
        private Map.Entry<K, j> f44079B;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f44079B.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            j value = this.f44079B.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o) {
                return this.f44079B.getValue().d((o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, j> entry) {
            this.f44079B = entry;
        }
    }

    /* compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: B, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f44080B;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f44080B = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f44080B.next();
            return next.getValue() instanceof j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44080B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f44080B.remove();
        }
    }

    public o e() {
        return c(this.f44078e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
