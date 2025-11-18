package qb;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import oa.v;

/* compiled from: StandardClassIds.kt */
/* loaded from: classes3.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str) {
        c cVarB = i.f48254a.b();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarB, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(String str) {
        c cVarF = i.f48254a.f();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarF, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b m(String str) {
        c cVarC = i.f48254a.c();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarC, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(String str) {
        c cVarD = i.f48254a.d();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarD, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(String str) {
        c cVarE = i.f48254a.e();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarE, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(M.d(r.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C4170o c4170oA = v.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(c4170oA.c(), c4170oA.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b q(f fVar) {
        i iVar = i.f48254a;
        c cVarF = iVar.a().f();
        f fVarT = f.t(fVar.p() + iVar.a().h().p());
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarF, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b r(String str) {
        c cVarG = i.f48254a.g();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarG, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(String str) {
        c cVarH = i.f48254a.h();
        f fVarT = f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarH, fVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b t(b bVar) {
        c cVarF = i.f48254a.f();
        f fVarT = f.t('U' + bVar.h().p());
        C3862t.f(fVarT, "identifier(...)");
        return new b(cVarF, fVarT);
    }
}
