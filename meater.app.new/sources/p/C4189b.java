package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4189b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: B, reason: collision with root package name */
    c<K, V> f47316B;

    /* renamed from: C, reason: collision with root package name */
    private c<K, V> f47317C;

    /* renamed from: D, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f47318D = new WeakHashMap<>();

    /* renamed from: E, reason: collision with root package name */
    private int f47319E = 0;

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.C4189b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f47323E;
        }

        @Override // p.C4189b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.f47322D;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$b, reason: collision with other inner class name */
    private static class C0657b<K, V> extends e<K, V> {
        C0657b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.C4189b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f47322D;
        }

        @Override // p.C4189b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.f47323E;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: B, reason: collision with root package name */
        final K f47320B;

        /* renamed from: C, reason: collision with root package name */
        final V f47321C;

        /* renamed from: D, reason: collision with root package name */
        c<K, V> f47322D;

        /* renamed from: E, reason: collision with root package name */
        c<K, V> f47323E;

        c(K k10, V v10) {
            this.f47320B = k10;
            this.f47321C = v10;
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
            return this.f47320B.equals(cVar.f47320B) && this.f47321C.equals(cVar.f47321C);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f47320B;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f47321C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f47320B.hashCode() ^ this.f47321C.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f47320B + "=" + this.f47321C;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        private c<K, V> f47324B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f47325C = true;

        d() {
        }

        @Override // p.C4189b.f
        void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f47324B;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f47323E;
                this.f47324B = cVar3;
                this.f47325C = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f47325C) {
                this.f47325C = false;
                this.f47324B = C4189b.this.f47316B;
            } else {
                c<K, V> cVar = this.f47324B;
                this.f47324B = cVar != null ? cVar.f47322D : null;
            }
            return this.f47324B;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f47325C) {
                return C4189b.this.f47316B != null;
            }
            c<K, V> cVar = this.f47324B;
            return (cVar == null || cVar.f47322D == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$e */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: B, reason: collision with root package name */
        c<K, V> f47327B;

        /* renamed from: C, reason: collision with root package name */
        c<K, V> f47328C;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f47327B = cVar2;
            this.f47328C = cVar;
        }

        private c<K, V> g() {
            c<K, V> cVar = this.f47328C;
            c<K, V> cVar2 = this.f47327B;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // p.C4189b.f
        public void b(c<K, V> cVar) {
            if (this.f47327B == cVar && cVar == this.f47328C) {
                this.f47328C = null;
                this.f47327B = null;
            }
            c<K, V> cVar2 = this.f47327B;
            if (cVar2 == cVar) {
                this.f47327B = d(cVar2);
            }
            if (this.f47328C == cVar) {
                this.f47328C = g();
            }
        }

        abstract c<K, V> d(c<K, V> cVar);

        abstract c<K, V> e(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f47328C;
            this.f47328C = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f47328C != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: p.b$f */
    public static abstract class f<K, V> {
        abstract void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f47316B;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0657b c0657b = new C0657b(this.f47317C, this.f47316B);
        this.f47318D.put(c0657b, Boolean.FALSE);
        return c0657b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4189b)) {
            return false;
        }
        C4189b c4189b = (C4189b) obj;
        if (size() != c4189b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c4189b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c<K, V> f(K k10) {
        c<K, V> cVar = this.f47316B;
        while (cVar != null && !cVar.f47320B.equals(k10)) {
            cVar = cVar.f47322D;
        }
        return cVar;
    }

    public C4189b<K, V>.d h() {
        C4189b<K, V>.d dVar = new d();
        this.f47318D.put(dVar, Boolean.FALSE);
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

    public Map.Entry<K, V> i() {
        return this.f47317C;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f47316B, this.f47317C);
        this.f47318D.put(aVar, Boolean.FALSE);
        return aVar;
    }

    c<K, V> j(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f47319E++;
        c<K, V> cVar2 = this.f47317C;
        if (cVar2 == null) {
            this.f47316B = cVar;
            this.f47317C = cVar;
            return cVar;
        }
        cVar2.f47322D = cVar;
        cVar.f47323E = cVar2;
        this.f47317C = cVar;
        return cVar;
    }

    public V r(K k10, V v10) {
        c<K, V> cVarF = f(k10);
        if (cVarF != null) {
            return cVarF.f47321C;
        }
        j(k10, v10);
        return null;
    }

    public int size() {
        return this.f47319E;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public V v(K k10) {
        c<K, V> cVarF = f(k10);
        if (cVarF == null) {
            return null;
        }
        this.f47319E--;
        if (!this.f47318D.isEmpty()) {
            Iterator<f<K, V>> it = this.f47318D.keySet().iterator();
            while (it.hasNext()) {
                it.next().b(cVarF);
            }
        }
        c<K, V> cVar = cVarF.f47323E;
        if (cVar != null) {
            cVar.f47322D = cVarF.f47322D;
        } else {
            this.f47316B = cVarF.f47322D;
        }
        c<K, V> cVar2 = cVarF.f47322D;
        if (cVar2 != null) {
            cVar2.f47323E = cVar;
        } else {
            this.f47317C = cVar;
        }
        cVarF.f47322D = null;
        cVarF.f47323E = null;
        return cVarF.f47321C;
    }
}
