package ab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import qb.b;

/* compiled from: FakePureImplementationsProvider.kt */
/* renamed from: ab.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1958r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1958r f20267a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<qb.b, qb.b> f20268b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<qb.c, qb.c> f20269c;

    static {
        C1958r c1958r = new C1958r();
        f20267a = c1958r;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f20268b = linkedHashMap;
        qb.i iVar = qb.i.f48254a;
        c1958r.c(iVar.l(), c1958r.a("java.util.ArrayList", "java.util.LinkedList"));
        c1958r.c(iVar.n(), c1958r.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c1958r.c(iVar.m(), c1958r.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = qb.b.f48178d;
        c1958r.c(aVar.c(new qb.c("java.util.function.Function")), c1958r.a("java.util.function.UnaryOperator"));
        c1958r.c(aVar.c(new qb.c("java.util.function.BiFunction")), c1958r.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(oa.v.a(((qb.b) entry.getKey()).a(), ((qb.b) entry.getValue()).a()));
        }
        f20269c = kotlin.collections.M.p(arrayList);
    }

    private C1958r() {
    }

    private final List<qb.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(qb.b.f48178d.c(new qb.c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(qb.b bVar, List<qb.b> list) {
        Map<qb.b, qb.b> map = f20268b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final qb.c b(qb.c classFqName) {
        C3862t.g(classFqName, "classFqName");
        return f20269c.get(classFqName);
    }
}
