package p024c.p033b.p034a.p036b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* renamed from: c.b.a.b.b */
/* loaded from: classes.dex */
public class C0854b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    c<K, V> f5638f;

    /* renamed from: g */
    private c<K, V> f5639g;

    /* renamed from: h */
    private WeakHashMap<f<K, V>, Boolean> f5640h = new WeakHashMap<>();

    /* renamed from: i */
    private int f5641i = 0;

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.e
        /* renamed from: c */
        c<K, V> mo5386c(c<K, V> cVar) {
            return cVar.f5645i;
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.e
        /* renamed from: d */
        c<K, V> mo5387d(c<K, V> cVar) {
            return cVar.f5644h;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$b */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.e
        /* renamed from: c */
        c<K, V> mo5386c(c<K, V> cVar) {
            return cVar.f5644h;
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.e
        /* renamed from: d */
        c<K, V> mo5387d(c<K, V> cVar) {
            return cVar.f5645i;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f5642f;

        /* renamed from: g */
        final V f5643g;

        /* renamed from: h */
        c<K, V> f5644h;

        /* renamed from: i */
        c<K, V> f5645i;

        c(K k2, V v) {
            this.f5642f = k2;
            this.f5643g = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5642f.equals(cVar.f5642f) && this.f5643g.equals(cVar.f5643g);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f5642f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f5643g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f5642f.hashCode() ^ this.f5643g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f5642f + "=" + this.f5643g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$d */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f */
        private c<K, V> f5646f;

        /* renamed from: g */
        private boolean f5647g = true;

        d() {
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.f
        /* renamed from: b */
        public void mo5388b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f5646f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f5645i;
                this.f5646f = cVar3;
                this.f5647g = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f5647g) {
                this.f5647g = false;
                this.f5646f = C0854b.this.f5638f;
            } else {
                c<K, V> cVar = this.f5646f;
                this.f5646f = cVar != null ? cVar.f5644h : null;
            }
            return this.f5646f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5647g) {
                return C0854b.this.f5638f != null;
            }
            c<K, V> cVar = this.f5646f;
            return (cVar == null || cVar.f5644h == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$e */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f */
        c<K, V> f5649f;

        /* renamed from: g */
        c<K, V> f5650g;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f5649f = cVar2;
            this.f5650g = cVar;
        }

        /* renamed from: g */
        private c<K, V> m5390g() {
            c<K, V> cVar = this.f5650g;
            c<K, V> cVar2 = this.f5649f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo5387d(cVar);
        }

        @Override // p024c.p033b.p034a.p036b.C0854b.f
        /* renamed from: b */
        public void mo5388b(c<K, V> cVar) {
            if (this.f5649f == cVar && cVar == this.f5650g) {
                this.f5650g = null;
                this.f5649f = null;
            }
            c<K, V> cVar2 = this.f5649f;
            if (cVar2 == cVar) {
                this.f5649f = mo5386c(cVar2);
            }
            if (this.f5650g == cVar) {
                this.f5650g = m5390g();
            }
        }

        /* renamed from: c */
        abstract c<K, V> mo5386c(c<K, V> cVar);

        /* renamed from: d */
        abstract c<K, V> mo5387d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f5650g;
            this.f5650g = m5390g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5650g != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$f */
    interface f<K, V> {
        /* renamed from: b */
        void mo5388b(c<K, V> cVar);
    }

    /* renamed from: c */
    public Iterator<Map.Entry<K, V>> m5381c() {
        b bVar = new b(this.f5639g, this.f5638f);
        this.f5640h.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0854b)) {
            return false;
        }
        C0854b c0854b = (C0854b) obj;
        if (size() != c0854b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0854b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public Map.Entry<K, V> m5382f() {
        return this.f5638f;
    }

    /* renamed from: g */
    protected c<K, V> mo5377g(K k2) {
        c<K, V> cVar = this.f5638f;
        while (cVar != null && !cVar.f5642f.equals(k2)) {
            cVar = cVar.f5644h;
        }
        return cVar;
    }

    /* renamed from: h */
    public C0854b<K, V>.d m5383h() {
        C0854b<K, V>.d dVar = new d();
        this.f5640h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    /* renamed from: i */
    public Map.Entry<K, V> m5384i() {
        return this.f5639g;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f5638f, this.f5639g);
        this.f5640h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: n */
    protected c<K, V> m5385n(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f5641i++;
        c<K, V> cVar2 = this.f5639g;
        if (cVar2 == null) {
            this.f5638f = cVar;
            this.f5639g = cVar;
            return cVar;
        }
        cVar2.f5644h = cVar;
        cVar.f5645i = cVar2;
        this.f5639g = cVar;
        return cVar;
    }

    /* renamed from: o */
    public V mo5378o(K k2, V v) {
        c<K, V> cVarMo5377g = mo5377g(k2);
        if (cVarMo5377g != null) {
            return cVarMo5377g.f5643g;
        }
        m5385n(k2, v);
        return null;
    }

    /* renamed from: q */
    public V mo5379q(K k2) {
        c<K, V> cVarMo5377g = mo5377g(k2);
        if (cVarMo5377g == null) {
            return null;
        }
        this.f5641i--;
        if (!this.f5640h.isEmpty()) {
            Iterator<f<K, V>> it = this.f5640h.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo5388b(cVarMo5377g);
            }
        }
        c<K, V> cVar = cVarMo5377g.f5645i;
        if (cVar != null) {
            cVar.f5644h = cVarMo5377g.f5644h;
        } else {
            this.f5638f = cVarMo5377g.f5644h;
        }
        c<K, V> cVar2 = cVarMo5377g.f5644h;
        if (cVar2 != null) {
            cVar2.f5645i = cVar;
        } else {
            this.f5639g = cVar;
        }
        cVarMo5377g.f5644h = null;
        cVarMo5377g.f5645i = null;
        return cVarMo5377g.f5643g;
    }

    public int size() {
        return this.f5641i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
