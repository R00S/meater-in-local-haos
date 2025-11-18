package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.b */
/* loaded from: classes3.dex */
public class C10206b extends AbstractC10211g<List<? extends AbstractC10211g<?>>> {

    /* renamed from: b */
    private final Function1<InterfaceC10592g0, AbstractC10344e0> f39556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10206b(List<? extends AbstractC10211g<?>> list, Function1<? super InterfaceC10592g0, ? extends AbstractC10344e0> function1) {
        super(list);
        C9801m.m32346f(list, "value");
        C9801m.m32346f(function1, "computeType");
        this.f39556b = function1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g
    /* renamed from: a */
    public AbstractC10344e0 mo36013a(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "module");
        AbstractC10344e0 abstractC10344e0Invoke = this.f39556b.invoke(interfaceC10592g0);
        if (!AbstractC9914h.m32738c0(abstractC10344e0Invoke) && !AbstractC9914h.m32754p0(abstractC10344e0Invoke)) {
            AbstractC9914h.m32728C0(abstractC10344e0Invoke);
        }
        return abstractC10344e0Invoke;
    }
}
