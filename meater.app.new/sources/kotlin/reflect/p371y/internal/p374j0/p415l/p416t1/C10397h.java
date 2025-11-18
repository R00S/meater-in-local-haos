package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10589f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.h */
/* loaded from: classes3.dex */
public final class C10397h {

    /* renamed from: a */
    private static final C10589f0<C10405p<AbstractC10413x>> f40184a = new C10589f0<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final C10589f0<C10405p<AbstractC10413x>> m36932a() {
        return f40184a;
    }

    /* renamed from: b */
    public static final List<AbstractC10344e0> m36933b(AbstractC10396g abstractC10396g, Iterable<? extends AbstractC10344e0> iterable) {
        C9801m.m32346f(abstractC10396g, "<this>");
        C9801m.m32346f(iterable, "types");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterable, 10));
        Iterator<? extends AbstractC10344e0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC10396g.mo36717a(it.next()));
        }
        return arrayList;
    }
}
