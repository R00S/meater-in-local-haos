package com.bumptech.glide.load.engine.p126z;

import com.bumptech.glide.load.engine.p126z.InterfaceC5421m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* renamed from: com.bumptech.glide.load.engine.z.h */
/* loaded from: classes.dex */
class C5416h<K extends InterfaceC5421m, V> {

    /* renamed from: a */
    private final a<K, V> f13517a = new a<>();

    /* renamed from: b */
    private final Map<K, a<K, V>> f13518b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    /* renamed from: com.bumptech.glide.load.engine.z.h$a */
    private static class a<K, V> {

        /* renamed from: a */
        final K f13519a;

        /* renamed from: b */
        private List<V> f13520b;

        /* renamed from: c */
        a<K, V> f13521c;

        /* renamed from: d */
        a<K, V> f13522d;

        a() {
            this(null);
        }

        /* renamed from: a */
        public void m10399a(V v) {
            if (this.f13520b == null) {
                this.f13520b = new ArrayList();
            }
            this.f13520b.add(v);
        }

        /* renamed from: b */
        public V m10400b() {
            int iM10401c = m10401c();
            if (iM10401c > 0) {
                return this.f13520b.remove(iM10401c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int m10401c() {
            List<V> list = this.f13520b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k2) {
            this.f13522d = this;
            this.f13521c = this;
            this.f13519a = k2;
        }
    }

    C5416h() {
    }

    /* renamed from: b */
    private void m10392b(a<K, V> aVar) {
        m10394e(aVar);
        a<K, V> aVar2 = this.f13517a;
        aVar.f13522d = aVar2;
        aVar.f13521c = aVar2.f13521c;
        m10395g(aVar);
    }

    /* renamed from: c */
    private void m10393c(a<K, V> aVar) {
        m10394e(aVar);
        a<K, V> aVar2 = this.f13517a;
        aVar.f13522d = aVar2.f13522d;
        aVar.f13521c = aVar2;
        m10395g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m10394e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f13522d;
        aVar2.f13521c = aVar.f13521c;
        aVar.f13521c.f13522d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m10395g(a<K, V> aVar) {
        aVar.f13521c.f13522d = aVar;
        aVar.f13522d.f13521c = aVar;
    }

    /* renamed from: a */
    public V m10396a(K k2) {
        a<K, V> aVar = this.f13518b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f13518b.put(k2, aVar);
        } else {
            k2.mo10378a();
        }
        m10392b(aVar);
        return aVar.m10400b();
    }

    /* renamed from: d */
    public void m10397d(K k2, V v) {
        a<K, V> aVar = this.f13518b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            m10393c(aVar);
            this.f13518b.put(k2, aVar);
        } else {
            k2.mo10378a();
        }
        aVar.m10399a(v);
    }

    /* renamed from: f */
    public V m10398f() {
        for (a aVar = this.f13517a.f13522d; !aVar.equals(this.f13517a); aVar = aVar.f13522d) {
            V v = (V) aVar.m10400b();
            if (v != null) {
                return v;
            }
            m10394e(aVar);
            this.f13518b.remove(aVar.f13519a);
            ((InterfaceC5421m) aVar.f13519a).mo10378a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f13517a.f13521c; !aVar.equals(this.f13517a); aVar = aVar.f13521c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f13519a);
            sb.append(':');
            sb.append(aVar.m10401c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
