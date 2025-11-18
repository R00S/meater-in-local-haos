package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* renamed from: com.google.firebase.components.u */
/* loaded from: classes2.dex */
class C8131u {

    /* compiled from: CycleDetector.java */
    /* renamed from: com.google.firebase.components.u$b */
    private static class b {

        /* renamed from: a */
        private final C8124n<?> f30732a;

        /* renamed from: b */
        private final Set<b> f30733b = new HashSet();

        /* renamed from: c */
        private final Set<b> f30734c = new HashSet();

        b(C8124n<?> c8124n) {
            this.f30732a = c8124n;
        }

        /* renamed from: a */
        void m25047a(b bVar) {
            this.f30733b.add(bVar);
        }

        /* renamed from: b */
        void m25048b(b bVar) {
            this.f30734c.add(bVar);
        }

        /* renamed from: c */
        C8124n<?> m25049c() {
            return this.f30732a;
        }

        /* renamed from: d */
        Set<b> m25050d() {
            return this.f30733b;
        }

        /* renamed from: e */
        boolean m25051e() {
            return this.f30733b.isEmpty();
        }

        /* renamed from: f */
        boolean m25052f() {
            return this.f30734c.isEmpty();
        }

        /* renamed from: g */
        void m25053g(b bVar) {
            this.f30734c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector.java */
    /* renamed from: com.google.firebase.components.u$c */
    private static class c {

        /* renamed from: a */
        private final C8111b0<?> f30735a;

        /* renamed from: b */
        private final boolean f30736b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f30735a.equals(this.f30735a) && cVar.f30736b == this.f30736b;
        }

        public int hashCode() {
            return ((this.f30735a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f30736b).hashCode();
        }

        private c(C8111b0<?> c8111b0, boolean z) {
            this.f30735a = c8111b0;
            this.f30736b = z;
        }
    }

    /* renamed from: a */
    static void m25044a(List<C8124n<?>> list) {
        Set<b> setM25046c = m25046c(list);
        Set<b> setM25045b = m25045b(setM25046c);
        int i2 = 0;
        while (!setM25045b.isEmpty()) {
            b next = setM25045b.iterator().next();
            setM25045b.remove(next);
            i2++;
            for (b bVar : next.m25050d()) {
                bVar.m25053g(next);
                if (bVar.m25052f()) {
                    setM25045b.add(bVar);
                }
            }
        }
        if (i2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setM25046c) {
            if (!bVar2.m25052f() && !bVar2.m25051e()) {
                arrayList.add(bVar2.m25049c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    /* renamed from: b */
    private static Set<b> m25045b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m25052f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<b> m25046c(List<C8124n<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<C8124n<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C8132v c8132v : bVar.m25049c().m24993e()) {
                            if (c8132v.m25066e() && (set = (Set) map.get(new c(c8132v.m25064c(), c8132v.m25068g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m25047a(bVar2);
                                    bVar2.m25048b(bVar);
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
            C8124n<?> next = it.next();
            b bVar3 = new b(next);
            for (C8111b0<? super Object> c8111b0 : next.m24996h()) {
                c cVar = new c(c8111b0, !next.m25000n());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f30736b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c8111b0));
                }
                set2.add(bVar3);
            }
        }
    }
}
