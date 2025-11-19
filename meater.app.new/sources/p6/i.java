package p6;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes2.dex */
public final class i implements InterfaceC4237b {

    /* renamed from: a, reason: collision with root package name */
    private final g<a, Object> f47622a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f47623b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f47624c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, InterfaceC4236a<?>> f47625d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f47626e;

    /* renamed from: f, reason: collision with root package name */
    private int f47627f;

    /* compiled from: LruArrayPool.java */
    private static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final b f47628a;

        /* renamed from: b, reason: collision with root package name */
        int f47629b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f47630c;

        a(b bVar) {
            this.f47628a = bVar;
        }

        @Override // p6.l
        public void a() {
            this.f47628a.c(this);
        }

        void b(int i10, Class<?> cls) {
            this.f47629b = i10;
            this.f47630c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47629b == aVar.f47629b && this.f47630c == aVar.f47630c;
        }

        public int hashCode() {
            int i10 = this.f47629b * 31;
            Class<?> cls = this.f47630c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f47629b + "array=" + this.f47630c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    private static final class b extends AbstractC4238c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p6.AbstractC4238c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i10, cls);
            return aVarB;
        }
    }

    public i(int i10) {
        this.f47626e = i10;
    }

    private void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM = m(cls);
        Integer num = navigableMapM.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void g() {
        h(this.f47626e);
    }

    private void h(int i10) {
        while (this.f47627f > i10) {
            Object objF = this.f47622a.f();
            H6.k.d(objF);
            InterfaceC4236a interfaceC4236aI = i(objF);
            this.f47627f -= interfaceC4236aI.c(objF) * interfaceC4236aI.b();
            f(interfaceC4236aI.c(objF), objF.getClass());
            if (Log.isLoggable(interfaceC4236aI.a(), 2)) {
                Log.v(interfaceC4236aI.a(), "evicted: " + interfaceC4236aI.c(objF));
            }
        }
    }

    private <T> InterfaceC4236a<T> i(T t10) {
        return j(t10.getClass());
    }

    private <T> InterfaceC4236a<T> j(Class<T> cls) {
        InterfaceC4236a<T> c4241f = (InterfaceC4236a) this.f47625d.get(cls);
        if (c4241f == null) {
            if (cls.equals(int[].class)) {
                c4241f = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                c4241f = new C4241f();
            }
            this.f47625d.put(cls, c4241f);
        }
        return c4241f;
    }

    private <T> T k(a aVar) {
        return (T) this.f47622a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        InterfaceC4236a<T> interfaceC4236aJ = j(cls);
        T t10 = (T) k(aVar);
        if (t10 != null) {
            this.f47627f -= interfaceC4236aJ.c(t10) * interfaceC4236aJ.b();
            f(interfaceC4236aJ.c(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(interfaceC4236aJ.a(), 2)) {
            Log.v(interfaceC4236aJ.a(), "Allocated " + aVar.f47629b + " bytes");
        }
        return interfaceC4236aJ.newArray(aVar.f47629b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f47624c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f47624c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i10 = this.f47627f;
        return i10 == 0 || this.f47626e / i10 >= 2;
    }

    private boolean o(int i10) {
        return i10 <= this.f47626e / 2;
    }

    private boolean p(int i10, Integer num) {
        return num != null && (n() || num.intValue() <= i10 * 8);
    }

    @Override // p6.InterfaceC4237b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f47626e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p6.InterfaceC4237b
    public synchronized void b() {
        h(0);
    }

    @Override // p6.InterfaceC4237b
    public synchronized <T> T c(int i10, Class<T> cls) {
        return (T) l(this.f47623b.e(i10, cls), cls);
    }

    @Override // p6.InterfaceC4237b
    public synchronized <T> void d(T t10) {
        Class<?> cls = t10.getClass();
        InterfaceC4236a<T> interfaceC4236aJ = j(cls);
        int iC = interfaceC4236aJ.c(t10);
        int iB = interfaceC4236aJ.b() * iC;
        if (o(iB)) {
            a aVarE = this.f47623b.e(iC, cls);
            this.f47622a.d(aVarE, t10);
            NavigableMap<Integer, Integer> navigableMapM = m(cls);
            Integer num = navigableMapM.get(Integer.valueOf(aVarE.f47629b));
            Integer numValueOf = Integer.valueOf(aVarE.f47629b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM.put(numValueOf, Integer.valueOf(iIntValue));
            this.f47627f += iB;
            g();
        }
    }

    @Override // p6.InterfaceC4237b
    public synchronized <T> T e(int i10, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = m(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return (T) l(p(i10, numCeilingKey) ? this.f47623b.e(numCeilingKey.intValue(), cls) : this.f47623b.e(i10, cls), cls);
    }
}
