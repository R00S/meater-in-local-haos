package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348f1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: mappingUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.j */
/* loaded from: classes2.dex */
public final class C9936j {
    /* renamed from: a */
    public static final AbstractC10348f1 m33012a(InterfaceC10585e interfaceC10585e, InterfaceC10585e interfaceC10585e2) {
        C9801m.m32346f(interfaceC10585e, "from");
        C9801m.m32346f(interfaceC10585e2, "to");
        interfaceC10585e.mo32884w().size();
        interfaceC10585e2.mo32884w().size();
        AbstractC10348f1.a aVar = AbstractC10348f1.f40104c;
        List<InterfaceC10587e1> listMo32884w = interfaceC10585e.mo32884w();
        C9801m.m32345e(listMo32884w, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo32884w, 10));
        Iterator<T> it = listMo32884w.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10587e1) it.next()).mo32877h());
        }
        List<InterfaceC10587e1> listMo32884w2 = interfaceC10585e2.mo32884w();
        C9801m.m32345e(listMo32884w2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(listMo32884w2, 10));
        Iterator<T> it2 = listMo32884w2.iterator();
        while (it2.hasNext()) {
            AbstractC10368m0 abstractC10368m0Mo36400s = ((InterfaceC10587e1) it2.next()).mo36400s();
            C9801m.m32345e(abstractC10368m0Mo36400s, "it.defaultType");
            arrayList2.add(C10457a.m37135a(abstractC10368m0Mo36400s));
        }
        return AbstractC10348f1.a.m36680e(aVar, C10810q0.m38805q(C10782c0.m38580L0(arrayList, arrayList2)), false, 2, null);
    }
}
