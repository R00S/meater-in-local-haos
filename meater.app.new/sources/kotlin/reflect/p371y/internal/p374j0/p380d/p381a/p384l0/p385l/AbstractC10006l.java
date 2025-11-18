package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: LazyJavaStaticScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.l */
/* loaded from: classes2.dex */
public abstract class AbstractC10006l extends AbstractC10004j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10006l(C9990g c9990g) {
        super(c9990g, null, 2, null);
        C9801m.m32346f(c9990g, "c");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: H */
    protected AbstractC10004j.a mo33401H(InterfaceC10041r interfaceC10041r, List<? extends InterfaceC10587e1> list, AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10599i1> list2) {
        C9801m.m32346f(interfaceC10041r, "method");
        C9801m.m32346f(list, "methodTypeParameters");
        C9801m.m32346f(abstractC10344e0, "returnType");
        C9801m.m32346f(list2, "valueParameters");
        return new AbstractC10004j.a(abstractC10344e0, null, list2, list, false, C10817u.m38888j());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: s */
    protected void mo33409s(C10163f c10163f, Collection<InterfaceC10729t0> collection) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(collection, "result");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: z */
    protected InterfaceC10735w0 mo33413z() {
        return null;
    }
}
