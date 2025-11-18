package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10467c;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10469e;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10483s;

/* compiled from: TypeAttributes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.a1 */
/* loaded from: classes3.dex */
public final class C10333a1 extends AbstractC10469e<AbstractC10459y0<?>, AbstractC10459y0<?>> implements Iterable<AbstractC10459y0<?>>, KMappedMarker {

    /* renamed from: g */
    public static final a f40041g = new a(null);

    /* renamed from: h */
    private static final C10333a1 f40042h = new C10333a1((List<? extends AbstractC10459y0<?>>) C10817u.m38888j());

    /* compiled from: TypeAttributes.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.a1$a */
    public static final class a extends AbstractC10483s<AbstractC10459y0<?>, AbstractC10459y0<?>> {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10483s
        /* renamed from: b */
        public <T extends AbstractC10459y0<?>> int mo36575b(ConcurrentHashMap<KClass<? extends AbstractC10459y0<?>>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends AbstractC10459y0<?>>, Integer> function1) {
            int iIntValue;
            C9801m.m32346f(concurrentHashMap, "<this>");
            C9801m.m32346f(kClass, "kClass");
            C9801m.m32346f(function1, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(kClass);
                if (num2 == null) {
                    Integer numInvoke = function1.invoke(kClass);
                    concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(numInvoke.intValue()));
                    num2 = numInvoke;
                }
                C9801m.m32345e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                iIntValue = num2.intValue();
            }
            return iIntValue;
        }

        /* renamed from: g */
        public final C10333a1 m36576g(List<? extends AbstractC10459y0<?>> list) {
            C9801m.m32346f(list, "attributes");
            return list.isEmpty() ? m36577h() : new C10333a1(list, null);
        }

        /* renamed from: h */
        public final C10333a1 m36577h() {
            return C10333a1.f40042h;
        }
    }

    private C10333a1(List<? extends AbstractC10459y0<?>> list) {
        for (AbstractC10459y0<?> abstractC10459y0 : list) {
            m37193h(abstractC10459y0.mo36721b(), abstractC10459y0);
        }
    }

    public /* synthetic */ C10333a1(List list, C9789g c9789g) {
        this((List<? extends AbstractC10459y0<?>>) list);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10465a
    /* renamed from: f */
    protected AbstractC10483s<AbstractC10459y0<?>, AbstractC10459y0<?>> mo36568f() {
        return f40041g;
    }

    /* renamed from: n */
    public final C10333a1 m36569n(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "other");
        if (isEmpty() && c10333a1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f40041g.m37222e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC10459y0<?> abstractC10459y0 = mo37184c().get(iIntValue);
            AbstractC10459y0<?> abstractC10459y02 = c10333a1.mo37184c().get(iIntValue);
            C10767a.m38508a(arrayList, abstractC10459y0 == null ? abstractC10459y02 != null ? abstractC10459y02.mo36720a(abstractC10459y0) : null : abstractC10459y0.mo36720a(abstractC10459y02));
        }
        return f40041g.m36576g(arrayList);
    }

    /* renamed from: o */
    public final boolean m36570o(AbstractC10459y0<?> abstractC10459y0) {
        C9801m.m32346f(abstractC10459y0, "attribute");
        return mo37184c().get(f40041g.m37221d(abstractC10459y0.mo36721b())) != null;
    }

    /* renamed from: q */
    public final C10333a1 m36571q(C10333a1 c10333a1) {
        C9801m.m32346f(c10333a1, "other");
        if (isEmpty() && c10333a1.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f40041g.m37222e().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC10459y0<?> abstractC10459y0 = mo37184c().get(iIntValue);
            AbstractC10459y0<?> abstractC10459y02 = c10333a1.mo37184c().get(iIntValue);
            C10767a.m38508a(arrayList, abstractC10459y0 == null ? abstractC10459y02 != null ? abstractC10459y02.mo36722c(abstractC10459y0) : null : abstractC10459y0.mo36722c(abstractC10459y02));
        }
        return f40041g.m36576g(arrayList);
    }

    /* renamed from: r */
    public final C10333a1 m36572r(AbstractC10459y0<?> abstractC10459y0) {
        C9801m.m32346f(abstractC10459y0, "attribute");
        if (m36570o(abstractC10459y0)) {
            return this;
        }
        if (isEmpty()) {
            return new C10333a1(abstractC10459y0);
        }
        return f40041g.m36576g(C10782c0.m38610p0(C10782c0.m38569E0(this), abstractC10459y0));
    }

    /* renamed from: s */
    public final C10333a1 m36573s(AbstractC10459y0<?> abstractC10459y0) {
        C9801m.m32346f(abstractC10459y0, "attribute");
        if (isEmpty()) {
            return this;
        }
        AbstractC10467c<AbstractC10459y0<?>> abstractC10467cMo37184c = mo37184c();
        ArrayList arrayList = new ArrayList();
        for (AbstractC10459y0<?> abstractC10459y02 : abstractC10467cMo37184c) {
            if (!C9801m.m32341a(abstractC10459y02, abstractC10459y0)) {
                arrayList.add(abstractC10459y02);
            }
        }
        return arrayList.size() == mo37184c().mo37188c() ? this : f40041g.m36576g(arrayList);
    }

    private C10333a1(AbstractC10459y0<?> abstractC10459y0) {
        this((List<? extends AbstractC10459y0<?>>) C10815t.m38883e(abstractC10459y0));
    }
}
