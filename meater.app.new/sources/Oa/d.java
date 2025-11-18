package Oa;

import Oa.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qb.b;

/* compiled from: CompanionObjectMapping.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f13314a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<qb.b> f13315b;

    static {
        Set<m> set = m.f13337G;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(p.c((m) it.next()));
        }
        List listG0 = kotlin.collections.r.G0(kotlin.collections.r.G0(kotlin.collections.r.G0(arrayList, p.a.f13455h.l()), p.a.f13459j.l()), p.a.f13477s.l());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = qb.b.f48178d;
        Iterator it2 = listG0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((qb.c) it2.next()));
        }
        f13315b = linkedHashSet;
    }

    private d() {
    }

    public final Set<qb.b> a() {
        return f13315b;
    }

    public final Set<qb.b> b() {
        return f13315b;
    }
}
