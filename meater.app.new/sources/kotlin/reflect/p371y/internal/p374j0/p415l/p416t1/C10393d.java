package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10813s;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10432w;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: IntersectionType.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.d */
/* loaded from: classes3.dex */
public final class C10393d {
    /* renamed from: a */
    public static final AbstractC10381q1 m36918a(List<? extends AbstractC10381q1> list) {
        AbstractC10368m0 abstractC10368m0M37161W0;
        C9801m.m32346f(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (AbstractC10381q1) C10813s.m38866s0(list);
        }
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
        boolean z = false;
        boolean z2 = false;
        for (AbstractC10381q1 abstractC10381q1 : list) {
            z = z || C10350g0.m36706a(abstractC10381q1);
            if (abstractC10381q1 instanceof AbstractC10368m0) {
                abstractC10368m0M37161W0 = (AbstractC10368m0) abstractC10381q1;
            } else {
                if (!(abstractC10381q1 instanceof AbstractC10458y)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (C10432w.m37085a(abstractC10381q1)) {
                    return abstractC10381q1;
                }
                abstractC10368m0M37161W0 = ((AbstractC10458y) abstractC10381q1).m37161W0();
                z2 = true;
            }
            arrayList.add(abstractC10368m0M37161W0);
        }
        if (z) {
            return C10427k.m37053d(EnumC10426j.f40350y0, list.toString());
        }
        if (!z2) {
            return C10412w.f40213a.m36970c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C10335b0.m36585d((AbstractC10381q1) it.next()));
        }
        C10412w c10412w = C10412w.f40213a;
        return C10347f0.m36664d(c10412w.m36970c(arrayList), c10412w.m36970c(arrayList2));
    }
}
