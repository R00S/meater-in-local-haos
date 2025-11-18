package com.bumptech.glide.load.engine.p126z;

import android.util.Log;
import com.bumptech.glide.p145r.C5596j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* renamed from: com.bumptech.glide.load.engine.z.j */
/* loaded from: classes.dex */
public final class C5418j implements InterfaceC5410b {

    /* renamed from: a */
    private final C5416h<a, Object> f13523a = new C5416h<>();

    /* renamed from: b */
    private final b f13524b = new b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f13525c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC5409a<?>> f13526d = new HashMap();

    /* renamed from: e */
    private final int f13527e;

    /* renamed from: f */
    private int f13528f;

    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$a */
    private static final class a implements InterfaceC5421m {

        /* renamed from: a */
        private final b f13529a;

        /* renamed from: b */
        int f13530b;

        /* renamed from: c */
        private Class<?> f13531c;

        a(b bVar) {
            this.f13529a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5421m
        /* renamed from: a */
        public void mo10378a() {
            this.f13529a.m10384c(this);
        }

        /* renamed from: b */
        void m10415b(int i2, Class<?> cls) {
            this.f13530b = i2;
            this.f13531c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13530b == aVar.f13530b && this.f13531c == aVar.f13531c;
        }

        public int hashCode() {
            int i2 = this.f13530b * 31;
            Class<?> cls = this.f13531c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f13530b + "array=" + this.f13531c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* renamed from: com.bumptech.glide.load.engine.z.j$b */
    private static final class b extends AbstractC5412d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p126z.AbstractC5412d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo10380a() {
            return new a(this);
        }

        /* renamed from: e */
        a m10417e(int i2, Class<?> cls) {
            a aVarM10383b = m10383b();
            aVarM10383b.m10415b(i2, cls);
            return aVarM10383b;
        }
    }

    public C5418j(int i2) {
        this.f13527e = i2;
    }

    /* renamed from: f */
    private void m10404f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM10411m = m10411m(cls);
        Integer num = (Integer) navigableMapM10411m.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM10411m.remove(Integer.valueOf(i2));
                return;
            } else {
                navigableMapM10411m.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    /* renamed from: g */
    private void m10405g() {
        m10406h(this.f13527e);
    }

    /* renamed from: h */
    private void m10406h(int i2) {
        while (this.f13528f > i2) {
            Object objM10398f = this.f13523a.m10398f();
            C5596j.m11042d(objM10398f);
            InterfaceC5409a interfaceC5409aM10407i = m10407i(objM10398f);
            this.f13528f -= interfaceC5409aM10407i.mo10364b(objM10398f) * interfaceC5409aM10407i.mo10363a();
            m10404f(interfaceC5409aM10407i.mo10364b(objM10398f), objM10398f.getClass());
            if (Log.isLoggable(interfaceC5409aM10407i.getTag(), 2)) {
                Log.v(interfaceC5409aM10407i.getTag(), "evicted: " + interfaceC5409aM10407i.mo10364b(objM10398f));
            }
        }
    }

    /* renamed from: i */
    private <T> InterfaceC5409a<T> m10407i(T t) {
        return m10408j(t.getClass());
    }

    /* renamed from: j */
    private <T> InterfaceC5409a<T> m10408j(Class<T> cls) {
        InterfaceC5409a<T> c5415g = (InterfaceC5409a) this.f13526d.get(cls);
        if (c5415g == null) {
            if (cls.equals(int[].class)) {
                c5415g = new C5417i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                c5415g = new C5415g();
            }
            this.f13526d.put(cls, c5415g);
        }
        return c5415g;
    }

    /* renamed from: k */
    private <T> T m10409k(a aVar) {
        return (T) this.f13523a.m10396a(aVar);
    }

    /* renamed from: l */
    private <T> T m10410l(a aVar, Class<T> cls) {
        InterfaceC5409a<T> interfaceC5409aM10408j = m10408j(cls);
        T t = (T) m10409k(aVar);
        if (t != null) {
            this.f13528f -= interfaceC5409aM10408j.mo10364b(t) * interfaceC5409aM10408j.mo10363a();
            m10404f(interfaceC5409aM10408j.mo10364b(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(interfaceC5409aM10408j.getTag(), 2)) {
            Log.v(interfaceC5409aM10408j.getTag(), "Allocated " + aVar.f13530b + " bytes");
        }
        return interfaceC5409aM10408j.newArray(aVar.f13530b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m10411m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f13525c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f13525c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m10412n() {
        int i2 = this.f13528f;
        return i2 == 0 || this.f13527e / i2 >= 2;
    }

    /* renamed from: o */
    private boolean m10413o(int i2) {
        return i2 <= this.f13527e / 2;
    }

    /* renamed from: p */
    private boolean m10414p(int i2, Integer num) {
        return num != null && (m10412n() || num.intValue() <= i2 * 8);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5410b
    /* renamed from: a */
    public synchronized void mo10365a(int i2) {
        try {
            if (i2 >= 40) {
                mo10366b();
            } else if (i2 >= 20 || i2 == 15) {
                m10406h(this.f13527e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5410b
    /* renamed from: b */
    public synchronized void mo10366b() {
        m10406h(0);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5410b
    /* renamed from: c */
    public synchronized <T> T mo10367c(int i2, Class<T> cls) {
        return (T) m10410l(this.f13524b.m10417e(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5410b
    /* renamed from: d */
    public synchronized <T> void mo10368d(T t) {
        Class<?> cls = t.getClass();
        InterfaceC5409a<T> interfaceC5409aM10408j = m10408j(cls);
        int iMo10364b = interfaceC5409aM10408j.mo10364b(t);
        int iMo10363a = interfaceC5409aM10408j.mo10363a() * iMo10364b;
        if (m10413o(iMo10363a)) {
            a aVarM10417e = this.f13524b.m10417e(iMo10364b, cls);
            this.f13523a.m10397d(aVarM10417e, t);
            NavigableMap<Integer, Integer> navigableMapM10411m = m10411m(cls);
            Integer num = (Integer) navigableMapM10411m.get(Integer.valueOf(aVarM10417e.f13530b));
            Integer numValueOf = Integer.valueOf(aVarM10417e.f13530b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM10411m.put(numValueOf, Integer.valueOf(iIntValue));
            this.f13528f += iMo10363a;
            m10405g();
        }
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5410b
    /* renamed from: e */
    public synchronized <T> T mo10369e(int i2, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = m10411m(cls).ceilingKey(Integer.valueOf(i2));
        return (T) m10410l(m10414p(i2, numCeilingKey) ? this.f13524b.m10417e(numCeilingKey.intValue(), cls) : this.f13524b.m10417e(i2, cls), cls);
    }
}
