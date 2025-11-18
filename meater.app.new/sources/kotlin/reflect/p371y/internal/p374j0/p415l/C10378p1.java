package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;

/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.l.p1 */
/* loaded from: classes3.dex */
public final class C10378p1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final AbstractC10344e0 m36803a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        if (abstractC10344e0 instanceof InterfaceC10375o1) {
            return ((InterfaceC10375o1) abstractC10344e0).mo36563H();
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC10381q1 m36804b(AbstractC10381q1 abstractC10381q1, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10381q1, "<this>");
        C9801m.m32346f(abstractC10344e0, "origin");
        return m36806d(abstractC10381q1, m36803a(abstractC10344e0));
    }

    /* renamed from: c */
    public static final AbstractC10381q1 m36805c(AbstractC10381q1 abstractC10381q1, AbstractC10344e0 abstractC10344e0, Function1<? super AbstractC10344e0, ? extends AbstractC10344e0> function1) {
        C9801m.m32346f(abstractC10381q1, "<this>");
        C9801m.m32346f(abstractC10344e0, "origin");
        C9801m.m32346f(function1, "transform");
        AbstractC10344e0 abstractC10344e0M36803a = m36803a(abstractC10344e0);
        return m36806d(abstractC10381q1, abstractC10344e0M36803a != null ? function1.invoke(abstractC10344e0M36803a) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final AbstractC10381q1 m36806d(AbstractC10381q1 abstractC10381q1, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10381q1, "<this>");
        if (abstractC10381q1 instanceof InterfaceC10375o1) {
            return m36806d(((InterfaceC10375o1) abstractC10381q1).mo36566v(), abstractC10344e0);
        }
        if (abstractC10344e0 == null || C9801m.m32341a(abstractC10344e0, abstractC10381q1)) {
            return abstractC10381q1;
        }
        if (abstractC10381q1 instanceof AbstractC10368m0) {
            return new C10377p0((AbstractC10368m0) abstractC10381q1, abstractC10344e0);
        }
        if (abstractC10381q1 instanceof AbstractC10458y) {
            return new C10332a0((AbstractC10458y) abstractC10381q1, abstractC10344e0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
