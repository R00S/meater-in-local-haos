package ab;

import Oa.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: BuiltinSpecialProperties.kt */
/* renamed from: ab.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1950j f20256a = new C1950j();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<qb.c, qb.f> f20257b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<qb.f, List<qb.f>> f20258c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<qb.c> f20259d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<qb.c> f20260e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<qb.f> f20261f;

    static {
        qb.d dVar = p.a.f13477s;
        C4170o c4170oA = oa.v.a(C1951k.d(dVar, "name"), Oa.p.f13386m);
        C4170o c4170oA2 = oa.v.a(C1951k.d(dVar, "ordinal"), qb.f.t("ordinal"));
        C4170o c4170oA3 = oa.v.a(C1951k.c(p.a.f13438X, "size"), qb.f.t("size"));
        qb.c cVar = p.a.f13444b0;
        Map<qb.c, qb.f> mapK = kotlin.collections.M.k(c4170oA, c4170oA2, c4170oA3, oa.v.a(C1951k.c(cVar, "size"), qb.f.t("size")), oa.v.a(C1951k.d(p.a.f13453g, "length"), qb.f.t("length")), oa.v.a(C1951k.c(cVar, "keys"), qb.f.t("keySet")), oa.v.a(C1951k.c(cVar, "values"), qb.f.t("values")), oa.v.a(C1951k.c(cVar, "entries"), qb.f.t("entrySet")));
        f20257b = mapK;
        Set<Map.Entry<qb.c, qb.f>> setEntrySet = mapK.entrySet();
        ArrayList<C4170o> arrayList = new ArrayList(kotlin.collections.r.x(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new C4170o(((qb.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C4170o c4170o : arrayList) {
            qb.f fVar = (qb.f) c4170o.d();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((qb.f) c4170o.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.M.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), kotlin.collections.r.c0((Iterable) entry2.getValue()));
        }
        f20258c = linkedHashMap2;
        Map<qb.c, qb.f> map = f20257b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<qb.c, qb.f> entry3 : map.entrySet()) {
            Qa.c cVar2 = Qa.c.f14576a;
            qb.d dVarJ = entry3.getKey().e().j();
            C3862t.f(dVarJ, "toUnsafe(...)");
            qb.b bVarN = cVar2.n(dVarJ);
            C3862t.d(bVarN);
            linkedHashSet.add(bVarN.a().c(entry3.getValue()));
        }
        f20259d = linkedHashSet;
        Set<qb.c> setKeySet = f20257b.keySet();
        f20260e = setKeySet;
        Set<qb.c> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((qb.c) it2.next()).g());
        }
        f20261f = kotlin.collections.r.b1(arrayList3);
    }

    private C1950j() {
    }

    public final Map<qb.c, qb.f> a() {
        return f20257b;
    }

    public final List<qb.f> b(qb.f name1) {
        C3862t.g(name1, "name1");
        List<qb.f> list = f20258c.get(name1);
        return list == null ? kotlin.collections.r.m() : list;
    }

    public final Set<qb.c> c() {
        return f20260e;
    }

    public final Set<qb.f> d() {
        return f20261f;
    }
}
