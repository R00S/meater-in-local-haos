package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;

/* compiled from: flexibleTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.b0 */
/* loaded from: classes3.dex */
public final class C10335b0 {
    /* renamed from: a */
    public static final AbstractC10458y m36582a(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        C9801m.m32344d(abstractC10381q1Mo36635R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (AbstractC10458y) abstractC10381q1Mo36635R0;
    }

    /* renamed from: b */
    public static final boolean m36583b(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        return abstractC10344e0.mo36635R0() instanceof AbstractC10458y;
    }

    /* renamed from: c */
    public static final AbstractC10368m0 m36584c(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            return ((AbstractC10458y) abstractC10381q1Mo36635R0).m37161W0();
        }
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            return (AbstractC10368m0) abstractC10381q1Mo36635R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final AbstractC10368m0 m36585d(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            return ((AbstractC10458y) abstractC10381q1Mo36635R0).m37162X0();
        }
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            return (AbstractC10368m0) abstractC10381q1Mo36635R0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
