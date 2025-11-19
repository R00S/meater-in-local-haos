package p6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p6.l;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes2.dex */
class g<K extends l, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f47616a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f47617b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f47618a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f47619b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f47620c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f47621d;

        a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f47619b == null) {
                this.f47619b = new ArrayList();
            }
            this.f47619b.add(v10);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f47619b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f47619b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k10) {
            this.f47621d = this;
            this.f47620c = this;
            this.f47618a = k10;
        }
    }

    g() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f47616a;
        aVar.f47621d = aVar2;
        aVar.f47620c = aVar2.f47620c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f47616a;
        aVar.f47621d = aVar2.f47621d;
        aVar.f47620c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f47621d;
        aVar2.f47620c = aVar.f47620c;
        aVar.f47620c.f47621d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f47620c.f47621d = aVar;
        aVar.f47621d.f47620c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f47617b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f47617b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f47617b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f47617b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f47616a.f47621d; !aVar.equals(this.f47616a); aVar = aVar.f47621d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f47617b.remove(aVar.f47618a);
            ((l) aVar.f47618a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f47616a.f47620c;
        boolean z10 = false;
        while (!aVar.equals(this.f47616a)) {
            sb2.append('{');
            sb2.append(aVar.f47618a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f47620c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
