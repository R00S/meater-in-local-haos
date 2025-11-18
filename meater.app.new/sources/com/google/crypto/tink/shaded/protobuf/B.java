package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public class B extends C {

    /* renamed from: f, reason: collision with root package name */
    private final P f37714f;

    /* compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: B, reason: collision with root package name */
        private Map.Entry<K, B> f37715B;

        public B a() {
            return this.f37715B.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f37715B.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            B value = this.f37715B.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof P) {
                return this.f37715B.getValue().d((P) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, B> entry) {
            this.f37715B = entry;
        }
    }

    /* compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: B, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f37716B;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f37716B = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f37716B.next();
            return next.getValue() instanceof B ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37716B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f37716B.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public P f() {
        return c(this.f37714f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
