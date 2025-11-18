package K8;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes2.dex */
class p {

    /* compiled from: CycleDetector.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final K8.c<?> f8782a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f8783b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f8784c = new HashSet();

        b(K8.c<?> cVar) {
            this.f8782a = cVar;
        }

        void a(b bVar) {
            this.f8783b.add(bVar);
        }

        void b(b bVar) {
            this.f8784c.add(bVar);
        }

        K8.c<?> c() {
            return this.f8782a;
        }

        Set<b> d() {
            return this.f8783b;
        }

        boolean e() {
            return this.f8783b.isEmpty();
        }

        boolean f() {
            return this.f8784c.isEmpty();
        }

        void g(b bVar) {
            this.f8784c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final A<?> f8785a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8786b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f8785a.equals(this.f8785a) && cVar.f8786b == this.f8786b;
        }

        public int hashCode() {
            return ((this.f8785a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8786b).hashCode();
        }

        private c(A<?> a10, boolean z10) {
            this.f8785a = a10;
            this.f8786b = z10;
        }
    }

    static void a(List<K8.c<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<K8.c<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<K8.c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            K8.c<?> next = it.next();
            b bVar3 = new b(next);
            for (A<? super Object> a10 : next.j()) {
                c cVar = new c(a10, !next.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f8786b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", a10));
                }
                set2.add(bVar3);
            }
        }
    }
}
