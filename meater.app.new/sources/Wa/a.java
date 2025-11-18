package Wa;

import Ua.C1777p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jb.n;
import jb.w;
import jb.x;
import kb.C3816a;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import qb.b;
import yb.C5148d;

/* compiled from: PackagePartScopeCache.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final n f18476a;

    /* renamed from: b, reason: collision with root package name */
    private final g f18477b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<qb.b, Ab.k> f18478c;

    public a(n resolver, g kotlinClassFinder) {
        C3862t.g(resolver, "resolver");
        C3862t.g(kotlinClassFinder, "kotlinClassFinder");
        this.f18476a = resolver;
        this.f18477b = kotlinClassFinder;
        this.f18478c = new ConcurrentHashMap<>();
    }

    public final Ab.k a(f fileClass) {
        Collection collectionE;
        C3862t.g(fileClass, "fileClass");
        ConcurrentHashMap<qb.b, Ab.k> concurrentHashMap = this.f18478c;
        qb.b bVarC = fileClass.c();
        Ab.k kVar = concurrentHashMap.get(bVarC);
        if (kVar == null) {
            qb.c cVarF = fileClass.c().f();
            if (fileClass.a().c() == C3816a.EnumC0573a.f43851I) {
                List<String> listF = fileClass.a().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    b.a aVar = qb.b.f48178d;
                    qb.c cVarE = C5148d.d(str).e();
                    C3862t.f(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    x xVarB = w.b(this.f18477b, aVar.c(cVarE), Rb.c.a(this.f18476a.f().g()));
                    if (xVarB != null) {
                        collectionE.add(xVarB);
                    }
                }
            } else {
                collectionE = r.e(fileClass);
            }
            C1777p c1777p = new C1777p(this.f18476a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                Ab.k kVarC = this.f18476a.c(c1777p, (x) it.next());
                if (kVarC != null) {
                    arrayList.add(kVarC);
                }
            }
            List listW0 = r.W0(arrayList);
            Ab.k kVarA = Ab.b.f1103d.a("package " + cVarF + " (" + fileClass + ')', listW0);
            Ab.k kVarPutIfAbsent = concurrentHashMap.putIfAbsent(bVarC, kVarA);
            kVar = kVarPutIfAbsent == null ? kVarA : kVarPutIfAbsent;
        }
        C3862t.f(kVar, "getOrPut(...)");
        return kVar;
    }
}
