package m8;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import l8.AbstractC3912e;
import m8.J.h;
import m8.J.l;

/* compiled from: MapMakerInternalMap.java */
/* loaded from: classes2.dex */
class J<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: K, reason: collision with root package name */
    static final y<Object, Object, d> f45176K = new C3985a();

    /* renamed from: B, reason: collision with root package name */
    final transient int f45177B;

    /* renamed from: C, reason: collision with root package name */
    final transient int f45178C;

    /* renamed from: D, reason: collision with root package name */
    final transient l<K, V, E, S>[] f45179D;

    /* renamed from: E, reason: collision with root package name */
    final int f45180E;

    /* renamed from: F, reason: collision with root package name */
    final AbstractC3912e<Object> f45181F;

    /* renamed from: G, reason: collision with root package name */
    final transient i<K, V, E, S> f45182G;

    /* renamed from: H, reason: collision with root package name */
    transient Set<K> f45183H;

    /* renamed from: I, reason: collision with root package name */
    transient Collection<V> f45184I;

    /* renamed from: J, reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f45185J;

    /* compiled from: MapMakerInternalMap.java */
    final class A extends AbstractC3990e<K, V> {

        /* renamed from: B, reason: collision with root package name */
        final K f45186B;

        /* renamed from: C, reason: collision with root package name */
        V f45187C;

        A(K k10, V v10) {
            this.f45186B = k10;
            this.f45187C = v10;
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f45186B.equals(entry.getKey()) && this.f45187C.equals(entry.getValue());
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public K getKey() {
            return this.f45186B;
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public V getValue() {
            return this.f45187C;
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public int hashCode() {
            return this.f45186B.hashCode() ^ this.f45187C.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) J.this.put(this.f45186B, v10);
            this.f45187C = v10;
            return v11;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final K f45189a;

        /* renamed from: b, reason: collision with root package name */
        final int f45190b;

        b(K k10, int i10) {
            this.f45189a = k10;
            this.f45190b = i10;
        }

        @Override // m8.J.h
        public final int b() {
            return this.f45190b;
        }

        @Override // m8.J.h
        public final K getKey() {
            return this.f45189a;
        }

        @Override // m8.J.h
        public E o() {
            return null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final int f45191a;

        c(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(k10, referenceQueue);
            this.f45191a = i10;
        }

        @Override // m8.J.h
        public final int b() {
            return this.f45191a;
        }

        @Override // m8.J.h
        public final K getKey() {
            return get();
        }

        @Override // m8.J.h
        public E o() {
            return null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class d implements h<Object, Object, d> {
        private d() {
            throw new AssertionError();
        }

        @Override // m8.J.h
        public int b() {
            throw new AssertionError();
        }

        @Override // m8.J.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d o() {
            throw new AssertionError();
        }

        @Override // m8.J.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // m8.J.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class e extends J<K, V, E, S>.g<Map.Entry<K, V>> {
        e() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return e();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class f extends AbstractSet<Map.Entry<K, V>> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            J.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = J.this.get(key)) != null && J.this.m().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return J.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && J.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    abstract class g<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        int f45194B;

        /* renamed from: C, reason: collision with root package name */
        int f45195C = -1;

        /* renamed from: D, reason: collision with root package name */
        l<K, V, E, S> f45196D;

        /* renamed from: E, reason: collision with root package name */
        AtomicReferenceArray<E> f45197E;

        /* renamed from: F, reason: collision with root package name */
        E f45198F;

        /* renamed from: G, reason: collision with root package name */
        J<K, V, E, S>.A f45199G;

        /* renamed from: H, reason: collision with root package name */
        J<K, V, E, S>.A f45200H;

        g() {
            this.f45194B = J.this.f45179D.length - 1;
            b();
        }

        final void b() {
            this.f45199G = null;
            if (f() || g()) {
                return;
            }
            while (true) {
                int i10 = this.f45194B;
                if (i10 < 0) {
                    return;
                }
                l<K, V, E, S>[] lVarArr = J.this.f45179D;
                this.f45194B = i10 - 1;
                l<K, V, E, S> lVar = lVarArr[i10];
                this.f45196D = lVar;
                if (lVar.f45205C != 0) {
                    this.f45197E = this.f45196D.f45208F;
                    this.f45195C = r0.length() - 1;
                    if (g()) {
                        return;
                    }
                }
            }
        }

        boolean d(E e10) {
            try {
                Object key = e10.getKey();
                Object objC = J.this.c(e10);
                if (objC == null) {
                    this.f45196D.r();
                    return false;
                }
                this.f45199G = new A(key, objC);
                this.f45196D.r();
                return true;
            } catch (Throwable th) {
                this.f45196D.r();
                throw th;
            }
        }

        J<K, V, E, S>.A e() {
            J<K, V, E, S>.A a10 = this.f45199G;
            if (a10 == null) {
                throw new NoSuchElementException();
            }
            this.f45200H = a10;
            b();
            return this.f45200H;
        }

        boolean f() {
            E e10 = this.f45198F;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f45198F = (E) e10.o();
                E e11 = this.f45198F;
                if (e11 == null) {
                    return false;
                }
                if (d(e11)) {
                    return true;
                }
                e10 = this.f45198F;
            }
        }

        boolean g() {
            while (true) {
                int i10 = this.f45195C;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f45197E;
                this.f45195C = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f45198F = e10;
                if (e10 != null && (d(e10) || f())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45199G != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C3994i.c(this.f45200H != null);
            J.this.remove(this.f45200H.getKey());
            this.f45200H = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface h<K, V, E extends h<K, V, E>> {
        int b();

        K getKey();

        V getValue();

        E o();
    }

    /* compiled from: MapMakerInternalMap.java */
    interface i<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> {
        m a();

        void b(S s10, E e10, V v10);

        E c(S s10, K k10, int i10, E e10);

        E d(S s10, E e10, E e11);

        S e(J<K, V, E, S> j10, int i10);
    }

    /* compiled from: MapMakerInternalMap.java */
    final class j extends J<K, V, E, S>.g<K> {
        j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return e().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class k extends AbstractSet<K> {
        k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            J.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return J.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return J.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return J.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J.this.size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    static abstract class m {

        /* renamed from: B, reason: collision with root package name */
        public static final m f45210B = new a("STRONG", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final m f45211C = new b("WEAK", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ m[] f45212D = c();

        /* compiled from: MapMakerInternalMap.java */
        enum a extends m {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // m8.J.m
            AbstractC3912e<Object> j() {
                return AbstractC3912e.c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        enum b extends m {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // m8.J.m
            AbstractC3912e<Object> j() {
                return AbstractC3912e.f();
            }
        }

        private m(String str, int i10) {
        }

        private static /* synthetic */ m[] c() {
            return new m[]{f45210B, f45211C};
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) f45212D.clone();
        }

        abstract AbstractC3912e<Object> j();

        /* synthetic */ m(String str, int i10, C3985a c3985a) {
            this(str, i10);
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static class n<K, V> extends b<K, V, n<K, V>> implements h {

        /* renamed from: c, reason: collision with root package name */
        private volatile V f45213c;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements i<K, V, n<K, V>, o<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f45214a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f45214a;
            }

            @Override // m8.J.i
            public m a() {
                return m.f45210B;
            }

            @Override // m8.J.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public n<K, V> d(o<K, V> oVar, n<K, V> nVar, n<K, V> nVar2) {
                n<K, V> nVarC = c(oVar, nVar.f45189a, nVar.f45190b, nVar2);
                ((n) nVarC).f45213c = ((n) nVar).f45213c;
                return nVarC;
            }

            @Override // m8.J.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public n<K, V> c(o<K, V> oVar, K k10, int i10, n<K, V> nVar) {
                return nVar == null ? new n<>(k10, i10, null) : new b(k10, i10, nVar);
            }

            @Override // m8.J.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public o<K, V> e(J<K, V, n<K, V>, o<K, V>> j10, int i10) {
                return new o<>(j10, i10);
            }

            @Override // m8.J.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(o<K, V> oVar, n<K, V> nVar, V v10) {
                ((n) nVar).f45213c = v10;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends n<K, V> {

            /* renamed from: d, reason: collision with root package name */
            private final n<K, V> f45215d;

            b(K k10, int i10, n<K, V> nVar) {
                super(k10, i10, null);
                this.f45215d = nVar;
            }

            @Override // m8.J.b, m8.J.h
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public n<K, V> o() {
                return this.f45215d;
            }
        }

        /* synthetic */ n(Object obj, int i10, C3985a c3985a) {
            this(obj, i10);
        }

        @Override // m8.J.h
        public final V getValue() {
            return this.f45213c;
        }

        private n(K k10, int i10) {
            super(k10, i10);
            this.f45213c = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static class p<K, V> extends b<K, V, p<K, V>> implements x<K, V, p<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private volatile y<K, V, p<K, V>> f45216c;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements i<K, V, p<K, V>, q<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f45217a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f45217a;
            }

            @Override // m8.J.i
            public m a() {
                return m.f45211C;
            }

            @Override // m8.J.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public p<K, V> d(q<K, V> qVar, p<K, V> pVar, p<K, V> pVar2) {
                if (l.n(pVar)) {
                    return null;
                }
                p<K, V> pVarC = c(qVar, pVar.f45189a, pVar.f45190b, pVar2);
                ((p) pVarC).f45216c = ((p) pVar).f45216c.b(((q) qVar).f45219H, pVarC);
                return pVarC;
            }

            @Override // m8.J.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public p<K, V> c(q<K, V> qVar, K k10, int i10, p<K, V> pVar) {
                return pVar == null ? new p<>(k10, i10, null) : new b(k10, i10, pVar);
            }

            @Override // m8.J.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K, V> e(J<K, V, p<K, V>, q<K, V>> j10, int i10) {
                return new q<>(j10, i10);
            }

            @Override // m8.J.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(q<K, V> qVar, p<K, V> pVar, V v10) {
                y yVar = ((p) pVar).f45216c;
                ((p) pVar).f45216c = new z(((q) qVar).f45219H, v10, pVar);
                yVar.clear();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends p<K, V> {

            /* renamed from: d, reason: collision with root package name */
            private final p<K, V> f45218d;

            b(K k10, int i10, p<K, V> pVar) {
                super(k10, i10, null);
                this.f45218d = pVar;
            }

            @Override // m8.J.b, m8.J.h
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public p<K, V> o() {
                return this.f45218d;
            }
        }

        /* synthetic */ p(Object obj, int i10, C3985a c3985a) {
            this(obj, i10);
        }

        @Override // m8.J.x
        public final y<K, V, p<K, V>> a() {
            return this.f45216c;
        }

        @Override // m8.J.h
        public final V getValue() {
            return this.f45216c.get();
        }

        private p(K k10, int i10) {
            super(k10, i10);
            this.f45216c = J.l();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class r extends J<K, V, E, S>.g<V> {
        r() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return e().getValue();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    final class s extends AbstractCollection<V> {
        s() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            J.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return J.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return J.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return J.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static class t<K, V> extends c<K, V, t<K, V>> implements h {

        /* renamed from: b, reason: collision with root package name */
        private volatile V f45222b;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements i<K, V, t<K, V>, u<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f45223a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f45223a;
            }

            @Override // m8.J.i
            public m a() {
                return m.f45210B;
            }

            @Override // m8.J.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public t<K, V> d(u<K, V> uVar, t<K, V> tVar, t<K, V> tVar2) {
                K key = tVar.getKey();
                if (key == null) {
                    return null;
                }
                t<K, V> tVarC = c(uVar, key, tVar.f45191a, tVar2);
                ((t) tVarC).f45222b = ((t) tVar).f45222b;
                return tVarC;
            }

            @Override // m8.J.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public t<K, V> c(u<K, V> uVar, K k10, int i10, t<K, V> tVar) {
                return tVar == null ? new t<>(((u) uVar).f45225H, k10, i10, null) : new b(((u) uVar).f45225H, k10, i10, tVar, null);
            }

            @Override // m8.J.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> e(J<K, V, t<K, V>, u<K, V>> j10, int i10) {
                return new u<>(j10, i10);
            }

            @Override // m8.J.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(u<K, V> uVar, t<K, V> tVar, V v10) {
                ((t) tVar).f45222b = v10;
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends t<K, V> {

            /* renamed from: c, reason: collision with root package name */
            private final t<K, V> f45224c;

            /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i10, t tVar, C3985a c3985a) {
                this(referenceQueue, obj, i10, tVar);
            }

            @Override // m8.J.c, m8.J.h
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public t<K, V> o() {
                return this.f45224c;
            }

            private b(ReferenceQueue<K> referenceQueue, K k10, int i10, t<K, V> tVar) {
                super(referenceQueue, k10, i10, null);
                this.f45224c = tVar;
            }
        }

        /* synthetic */ t(ReferenceQueue referenceQueue, Object obj, int i10, C3985a c3985a) {
            this(referenceQueue, obj, i10);
        }

        @Override // m8.J.h
        public final V getValue() {
            return this.f45222b;
        }

        private t(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f45222b = null;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static class v<K, V> extends c<K, V, v<K, V>> implements x<K, V, v<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private volatile y<K, V, v<K, V>> f45226b;

        /* compiled from: MapMakerInternalMap.java */
        static final class a<K, V> implements i<K, V, v<K, V>, w<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            private static final a<?, ?> f45227a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f45227a;
            }

            @Override // m8.J.i
            public m a() {
                return m.f45211C;
            }

            @Override // m8.J.i
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public v<K, V> d(w<K, V> wVar, v<K, V> vVar, v<K, V> vVar2) {
                K key = vVar.getKey();
                if (key == null || l.n(vVar)) {
                    return null;
                }
                v<K, V> vVarC = c(wVar, key, vVar.f45191a, vVar2);
                ((v) vVarC).f45226b = ((v) vVar).f45226b.b(((w) wVar).f45230I, vVarC);
                return vVarC;
            }

            @Override // m8.J.i
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public v<K, V> c(w<K, V> wVar, K k10, int i10, v<K, V> vVar) {
                return vVar == null ? new v<>(((w) wVar).f45229H, k10, i10) : new b(((w) wVar).f45229H, k10, i10, vVar);
            }

            @Override // m8.J.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public w<K, V> e(J<K, V, v<K, V>, w<K, V>> j10, int i10) {
                return new w<>(j10, i10);
            }

            @Override // m8.J.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(w<K, V> wVar, v<K, V> vVar, V v10) {
                y yVar = ((v) vVar).f45226b;
                ((v) vVar).f45226b = new z(((w) wVar).f45230I, v10, vVar);
                yVar.clear();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        private static final class b<K, V> extends v<K, V> {

            /* renamed from: c, reason: collision with root package name */
            private final v<K, V> f45228c;

            b(ReferenceQueue<K> referenceQueue, K k10, int i10, v<K, V> vVar) {
                super(referenceQueue, k10, i10);
                this.f45228c = vVar;
            }

            @Override // m8.J.c, m8.J.h
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public v<K, V> o() {
                return this.f45228c;
            }
        }

        v(ReferenceQueue<K> referenceQueue, K k10, int i10) {
            super(referenceQueue, k10, i10);
            this.f45226b = J.l();
        }

        @Override // m8.J.x
        public final y<K, V, v<K, V>> a() {
            return this.f45226b;
        }

        @Override // m8.J.h
        public final V getValue() {
            return this.f45226b.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    interface x<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        y<K, V, E> a();
    }

    /* compiled from: MapMakerInternalMap.java */
    interface y<K, V, E extends h<K, V, E>> {
        E a();

        y<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class z<K, V, E extends h<K, V, E>> extends WeakReference<V> implements y<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        final E f45231a;

        z(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f45231a = e10;
        }

        @Override // m8.J.y
        public E a() {
            return this.f45231a;
        }

        @Override // m8.J.y
        public y<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new z(referenceQueue, get(), e10);
        }
    }

    private J(I i10, i<K, V, E, S> iVar) {
        this.f45180E = Math.min(i10.a(), 65536);
        this.f45181F = i10.c();
        this.f45182G = iVar;
        int iMin = Math.min(i10.b(), 1073741824);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f45180E) {
            i13++;
            i14 <<= 1;
        }
        this.f45178C = 32 - i13;
        this.f45177B = i14 - 1;
        this.f45179D = g(i14);
        int i15 = iMin / i14;
        while (i12 < (i14 * i15 < iMin ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        while (true) {
            l<K, V, E, S>[] lVarArr = this.f45179D;
            if (i11 >= lVarArr.length) {
                return;
            }
            lVarArr[i11] = b(i12);
            i11++;
        }
    }

    static <K, V> J<K, V, ? extends h<K, V, ?>, ?> a(I i10) {
        m mVarD = i10.d();
        m mVar = m.f45210B;
        if (mVarD == mVar && i10.e() == mVar) {
            return new J<>(i10, n.a.g());
        }
        if (i10.d() == mVar && i10.e() == m.f45211C) {
            return new J<>(i10, p.a.g());
        }
        m mVarD2 = i10.d();
        m mVar2 = m.f45211C;
        if (mVarD2 == mVar2 && i10.e() == mVar) {
            return new J<>(i10, t.a.g());
        }
        if (i10.d() == mVar2 && i10.e() == mVar2) {
            return new J<>(i10, v.a.g());
        }
        throw new AssertionError();
    }

    static int j(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    static <K, V, E extends h<K, V, E>> y<K, V, E> l() {
        return (y<K, V, E>) f45176K;
    }

    l<K, V, E, S> b(int i10) {
        return this.f45182G.e(this, i10);
    }

    V c(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (l<K, V, E, S> lVar : this.f45179D) {
            lVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iD = d(obj);
        return k(iD).c(obj, iD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        l<K, V, E, S>[] lVarArr = this.f45179D;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = lVarArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                l<K, V, E, S> lVar = lVarArr[r10];
                int i11 = lVar.f45205C;
                AtomicReferenceArray<E> atomicReferenceArray = lVar.f45208F;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eO = atomicReferenceArray.get(r13); eO != null; eO = eO.o()) {
                        V vL = lVar.l(eO);
                        if (vL != null && m().d(obj, vL)) {
                            return true;
                        }
                    }
                }
                j11 += lVar.f45206D;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    int d(Object obj) {
        return j(this.f45181F.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f45185J;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f45185J = fVar;
        return fVar;
    }

    final l<K, V, E, S>[] g(int i10) {
        return new l[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        return k(iD).h(obj, iD);
    }

    void h(E e10) {
        int iB = e10.b();
        k(iB).u(e10, iB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void i(y<K, V, E> yVar) {
        h hVarA = yVar.a();
        int iB = hVarA.b();
        k(iB).v(hVarA.getKey(), iB, yVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        l<K, V, E, S>[] lVarArr = this.f45179D;
        long j10 = 0;
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            if (lVarArr[i10].f45205C != 0) {
                return false;
            }
            j10 += lVarArr[i10].f45206D;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < lVarArr.length; i11++) {
            if (lVarArr[i11].f45205C != 0) {
                return false;
            }
            j10 -= lVarArr[i11].f45206D;
        }
        return j10 == 0;
    }

    l<K, V, E, S> k(int i10) {
        return this.f45179D[(i10 >>> this.f45178C) & this.f45177B];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f45183H;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f45183H = kVar;
        return kVar;
    }

    AbstractC3912e<Object> m() {
        return this.f45182G.a().j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        l8.m.l(k10);
        l8.m.l(v10);
        int iD = d(k10);
        return k(iD).t(k10, iD, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        l8.m.l(k10);
        l8.m.l(v10);
        int iD = d(k10);
        return k(iD).t(k10, iD, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iD = d(obj);
        return k(iD).w(obj, iD);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        l8.m.l(k10);
        l8.m.l(v11);
        if (v10 == null) {
            return false;
        }
        int iD = d(k10);
        return k(iD).A(k10, iD, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f45179D.length; i10++) {
            j10 += r0[i10].f45205C;
        }
        return p8.f.k(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f45184I;
        if (collection != null) {
            return collection;
        }
        s sVar = new s();
        this.f45184I = sVar;
        return sVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iD = d(obj);
        return k(iD).x(obj, iD, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        l8.m.l(k10);
        l8.m.l(v10);
        int iD = d(k10);
        return k(iD).z(k10, iD, v10);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: m8.J$a, reason: case insensitive filesystem */
    class C3985a implements y<Object, Object, d> {
        C3985a() {
        }

        @Override // m8.J.y
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // m8.J.y
        public Object get() {
            return null;
        }

        @Override // m8.J.y
        public void clear() {
        }

        @Override // m8.J.y
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public y<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static abstract class l<K, V, E extends h<K, V, E>, S extends l<K, V, E, S>> extends ReentrantLock {

        /* renamed from: B, reason: collision with root package name */
        final J<K, V, E, S> f45204B;

        /* renamed from: C, reason: collision with root package name */
        volatile int f45205C;

        /* renamed from: D, reason: collision with root package name */
        int f45206D;

        /* renamed from: E, reason: collision with root package name */
        int f45207E;

        /* renamed from: F, reason: collision with root package name */
        volatile AtomicReferenceArray<E> f45208F;

        /* renamed from: G, reason: collision with root package name */
        final AtomicInteger f45209G = new AtomicInteger();

        l(J<K, V, E, S> j10, int i10) {
            this.f45204B = j10;
            m(q(i10));
        }

        static <K, V, E extends h<K, V, E>> boolean n(E e10) {
            return e10.getValue() == null;
        }

        boolean A(K k10, int i10, V v10, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    Object key = hVarO.getKey();
                    if (hVarO.b() == i10 && key != null && this.f45204B.f45181F.d(k10, key)) {
                        Object value = hVarO.getValue();
                        if (value != null) {
                            if (!this.f45204B.m().d(v10, value)) {
                                return false;
                            }
                            this.f45206D++;
                            E(hVarO, v11);
                            return true;
                        }
                        if (n(hVarO)) {
                            this.f45206D++;
                            h hVarY = y(hVar, hVarO);
                            int i11 = this.f45205C - 1;
                            atomicReferenceArray.set(length, hVarY);
                            this.f45205C = i11;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void B() {
            C();
        }

        void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f45209G.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S D();

        void E(E e10, V v10) {
            this.f45204B.f45182G.b(D(), e10, v10);
        }

        void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.f45205C != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.f45209G.set(0);
                    this.f45206D++;
                    this.f45205C = 0;
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        boolean c(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f45205C == 0) {
                    return false;
                }
                h hVarK = k(obj, i10);
                if (hVarK != null) {
                    if (hVarK.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                r();
            }
        }

        E d(E e10, E e11) {
            return (E) this.f45204B.f45182G.d(D(), e10, e11);
        }

        void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f45204B.h((h) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f45204B.i((y) referencePoll);
                i10++;
            } while (i10 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f45205C;
            AtomicReferenceArray<E> atomicReferenceArrayQ = q(length << 1);
            this.f45207E = (atomicReferenceArrayQ.length() * 3) / 4;
            int length2 = atomicReferenceArrayQ.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E eO = atomicReferenceArray.get(i11);
                if (eO != null) {
                    h hVarO = eO.o();
                    int iB = eO.b() & length2;
                    if (hVarO == null) {
                        atomicReferenceArrayQ.set(iB, eO);
                    } else {
                        h hVar = eO;
                        while (hVarO != null) {
                            int iB2 = hVarO.b() & length2;
                            if (iB2 != iB) {
                                hVar = hVarO;
                                iB = iB2;
                            }
                            hVarO = hVarO.o();
                        }
                        atomicReferenceArrayQ.set(iB, hVar);
                        while (eO != hVar) {
                            int iB3 = eO.b() & length2;
                            h hVarD = d(eO, (h) atomicReferenceArrayQ.get(iB3));
                            if (hVarD != null) {
                                atomicReferenceArrayQ.set(iB3, hVarD);
                            } else {
                                i10--;
                            }
                            eO = eO.o();
                        }
                    }
                }
            }
            this.f45208F = atomicReferenceArrayQ;
            this.f45205C = i10;
        }

        V h(Object obj, int i10) {
            try {
                h hVarK = k(obj, i10);
                if (hVarK == null) {
                    r();
                    return null;
                }
                V v10 = (V) hVarK.getValue();
                if (v10 == null) {
                    F();
                }
                return v10;
            } finally {
                r();
            }
        }

        E i(Object obj, int i10) {
            if (this.f45205C == 0) {
                return null;
            }
            for (E e10 = (E) j(i10); e10 != null; e10 = (E) e10.o()) {
                if (e10.b() == i10) {
                    Object key = e10.getKey();
                    if (key == null) {
                        F();
                    } else if (this.f45204B.f45181F.d(obj, key)) {
                        return e10;
                    }
                }
            }
            return null;
        }

        E j(int i10) {
            return this.f45208F.get(i10 & (r0.length() - 1));
        }

        E k(Object obj, int i10) {
            return (E) i(obj, i10);
        }

        V l(E e10) {
            if (e10.getKey() == null) {
                F();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 != null) {
                return v10;
            }
            F();
            return null;
        }

        void m(AtomicReferenceArray<E> atomicReferenceArray) {
            this.f45207E = (atomicReferenceArray.length() * 3) / 4;
            this.f45208F = atomicReferenceArray;
        }

        AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void r() {
            if ((this.f45209G.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        void s() {
            C();
        }

        V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f45205C + 1;
                if (i11 > this.f45207E) {
                    g();
                    i11 = this.f45205C + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    Object key = hVarO.getKey();
                    if (hVarO.b() == i10 && key != null && this.f45204B.f45181F.d(k10, key)) {
                        V v11 = (V) hVarO.getValue();
                        if (v11 == null) {
                            this.f45206D++;
                            E(hVarO, v10);
                            this.f45205C = this.f45205C;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return v11;
                        }
                        this.f45206D++;
                        E(hVarO, v10);
                        unlock();
                        return v11;
                    }
                }
                this.f45206D++;
                h hVarC = this.f45204B.f45182G.c(D(), k10, i10, hVar);
                E(hVarC, v10);
                atomicReferenceArray.set(length, hVarC);
                this.f45205C = i11;
                unlock();
                return null;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        boolean u(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = i10 & (atomicReferenceArray.length() - 1);
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    if (hVarO == e10) {
                        this.f45206D++;
                        h hVarY = y(hVar, hVarO);
                        int i11 = this.f45205C - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f45205C = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        boolean v(K k10, int i10, y<K, V, E> yVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    Object key = hVarO.getKey();
                    if (hVarO.b() == i10 && key != null && this.f45204B.f45181F.d(k10, key)) {
                        if (((x) hVarO).a() != yVar) {
                            return false;
                        }
                        this.f45206D++;
                        h hVarY = y(hVar, hVarO);
                        int i11 = this.f45205C - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f45205C = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        V w(Object obj, int i10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    Object key = hVarO.getKey();
                    if (hVarO.b() == i10 && key != null && this.f45204B.f45181F.d(obj, key)) {
                        V v10 = (V) hVarO.getValue();
                        if (v10 == null && !n(hVarO)) {
                            return null;
                        }
                        this.f45206D++;
                        h hVarY = y(hVar, hVarO);
                        int i11 = this.f45205C - 1;
                        atomicReferenceArray.set(length, hVarY);
                        this.f45205C = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f45204B.m().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f45206D++;
            r9 = y(r3, r4);
            r10 = r8.f45205C - 1;
            r0.set(r1, r9);
            r8.f45205C = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends m8.J$h<K, V, E>> r0 = r8.f45208F     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                m8.J$h r3 = (m8.J.h) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                m8.J<K, V, E extends m8.J$h<K, V, E>, S extends m8.J$l<K, V, E, S>> r7 = r8.f45204B     // Catch: java.lang.Throwable -> L5c
                l8.e<java.lang.Object> r7 = r7.f45181F     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                m8.J<K, V, E extends m8.J$h<K, V, E>, S extends m8.J$l<K, V, E, S>> r10 = r8.f45204B     // Catch: java.lang.Throwable -> L5c
                l8.e r10 = r10.m()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f45206D     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f45206D = r9     // Catch: java.lang.Throwable -> L5c
                m8.J$h r9 = r8.y(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f45205C     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f45205C = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                m8.J$h r4 = r4.o()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m8.J.l.x(java.lang.Object, int, java.lang.Object):boolean");
        }

        E y(E e10, E e11) {
            int i10 = this.f45205C;
            E e12 = (E) e11.o();
            while (e10 != e11) {
                h hVarD = d(e10, e12);
                if (hVarD != null) {
                    e12 = (E) hVarD;
                } else {
                    i10--;
                }
                e10 = (E) e10.o();
            }
            this.f45205C = i10;
            return e12;
        }

        V z(K k10, int i10, V v10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f45208F;
                int length = (atomicReferenceArray.length() - 1) & i10;
                h hVar = (h) atomicReferenceArray.get(length);
                for (h hVarO = hVar; hVarO != null; hVarO = hVarO.o()) {
                    Object key = hVarO.getKey();
                    if (hVarO.b() == i10 && key != null && this.f45204B.f45181F.d(k10, key)) {
                        V v11 = (V) hVarO.getValue();
                        if (v11 != null) {
                            this.f45206D++;
                            E(hVarO, v10);
                            return v11;
                        }
                        if (n(hVarO)) {
                            this.f45206D++;
                            h hVarY = y(hVar, hVarO);
                            int i11 = this.f45205C - 1;
                            atomicReferenceArray.set(length, hVarY);
                            this.f45205C = i11;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        void o() {
        }

        void p() {
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class o<K, V> extends l<K, V, n<K, V>, o<K, V>> {
        o(J<K, V, n<K, V>, o<K, V>> j10, int i10) {
            super(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.J.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public o<K, V> D() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class q<K, V> extends l<K, V, p<K, V>, q<K, V>> {

        /* renamed from: H, reason: collision with root package name */
        private final ReferenceQueue<V> f45219H;

        q(J<K, V, p<K, V>, q<K, V>> j10, int i10) {
            super(j10, i10);
            this.f45219H = new ReferenceQueue<>();
        }

        @Override // m8.J.l
        void o() {
            b(this.f45219H);
        }

        @Override // m8.J.l
        void p() {
            f(this.f45219H);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.J.l
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public q<K, V> D() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class u<K, V> extends l<K, V, t<K, V>, u<K, V>> {

        /* renamed from: H, reason: collision with root package name */
        private final ReferenceQueue<K> f45225H;

        u(J<K, V, t<K, V>, u<K, V>> j10, int i10) {
            super(j10, i10);
            this.f45225H = new ReferenceQueue<>();
        }

        @Override // m8.J.l
        void o() {
            b(this.f45225H);
        }

        @Override // m8.J.l
        void p() {
            e(this.f45225H);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.J.l
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public u<K, V> D() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    static final class w<K, V> extends l<K, V, v<K, V>, w<K, V>> {

        /* renamed from: H, reason: collision with root package name */
        private final ReferenceQueue<K> f45229H;

        /* renamed from: I, reason: collision with root package name */
        private final ReferenceQueue<V> f45230I;

        w(J<K, V, v<K, V>, w<K, V>> j10, int i10) {
            super(j10, i10);
            this.f45229H = new ReferenceQueue<>();
            this.f45230I = new ReferenceQueue<>();
        }

        @Override // m8.J.l
        void o() {
            b(this.f45229H);
        }

        @Override // m8.J.l
        void p() {
            e(this.f45229H);
            f(this.f45230I);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.J.l
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public w<K, V> D() {
            return this;
        }
    }
}
