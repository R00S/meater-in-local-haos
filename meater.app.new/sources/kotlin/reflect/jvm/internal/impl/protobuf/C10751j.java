package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
/* loaded from: classes3.dex */
public class C10751j extends C10752k {

    /* renamed from: e */
    private final InterfaceC10756o f41316e;

    /* compiled from: LazyField.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: f */
        private Map.Entry<K, C10751j> f41317f;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f41317f.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C10751j value = this.f41317f.getValue();
            if (value == null) {
                return null;
            }
            return value.m38417e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC10756o) {
                return this.f41317f.getValue().m38422d((InterfaceC10756o) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, C10751j> entry) {
            this.f41317f = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f */
        private Iterator<Map.Entry<K, Object>> f41318f;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f41318f = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f41318f.next();
            return next.getValue() instanceof C10751j ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41318f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f41318f.remove();
        }
    }

    /* renamed from: e */
    public InterfaceC10756o m38417e() {
        return m38421c(this.f41316e);
    }

    public boolean equals(Object obj) {
        return m38417e().equals(obj);
    }

    public int hashCode() {
        return m38417e().hashCode();
    }

    public String toString() {
        return m38417e().toString();
    }
}
