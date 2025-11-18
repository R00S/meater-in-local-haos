package Qa;

import Hb.AbstractC1082f0;
import Hb.z0;
import Ra.InterfaceC1692e;
import Ra.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;

/* compiled from: mappingUtil.kt */
/* loaded from: classes3.dex */
public final class y {
    public static final z0 a(InterfaceC1692e from, InterfaceC1692e to) {
        C3862t.g(from, "from");
        C3862t.g(to, "to");
        from.w().size();
        to.w().size();
        z0.a aVar = z0.f5820c;
        List<m0> listW = from.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        List<m0> list = listW;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).l());
        }
        List<m0> listW2 = to.w();
        C3862t.f(listW2, "getDeclaredTypeParameters(...)");
        List<m0> list2 = listW2;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            AbstractC1082f0 abstractC1082f0U = ((m0) it2.next()).u();
            C3862t.f(abstractC1082f0U, "getDefaultType(...)");
            arrayList2.add(Mb.d.d(abstractC1082f0U));
        }
        return z0.a.e(aVar, M.p(kotlin.collections.r.e1(arrayList, arrayList2)), false, 2, null);
    }
}
