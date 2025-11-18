package p024c.p041e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* renamed from: c.e.a */
/* loaded from: classes.dex */
public class C0867a<K, V> extends C0873g<K, V> implements Map<K, V> {

    /* renamed from: m */
    AbstractC0872f<K, V> f5708m;

    /* compiled from: ArrayMap.java */
    /* renamed from: c.e.a$a */
    class a extends AbstractC0872f<K, V> {
        a() {
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: a */
        protected void mo5411a() {
            C0867a.this.clear();
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: b */
        protected Object mo5412b(int i2, int i3) {
            return C0867a.this.f5757k[(i2 << 1) + i3];
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: c */
        protected Map<K, V> mo5413c() {
            return C0867a.this;
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: d */
        protected int mo5414d() {
            return C0867a.this.f5758l;
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: e */
        protected int mo5415e(Object obj) {
            return C0867a.this.m5470f(obj);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: f */
        protected int mo5416f(Object obj) {
            return C0867a.this.m5472i(obj);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: g */
        protected void mo5417g(K k2, V v) {
            C0867a.this.put(k2, v);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: h */
        protected void mo5418h(int i2) {
            C0867a.this.mo5475l(i2);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: i */
        protected V mo5419i(int i2, V v) {
            return C0867a.this.mo5476m(i2, v);
        }
    }

    public C0867a() {
    }

    /* renamed from: o */
    private AbstractC0872f<K, V> m5409o() {
        if (this.f5708m == null) {
            this.f5708m = new a();
        }
        return this.f5708m;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m5409o().m5458l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m5409o().m5459m();
    }

    /* renamed from: p */
    public boolean m5410p(Collection<?> collection) {
        return AbstractC0872f.m5457p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m5468c(this.f5758l + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m5409o().m5460n();
    }

    public C0867a(int i2) {
        super(i2);
    }

    public C0867a(C0873g c0873g) {
        super(c0873g);
    }
}
