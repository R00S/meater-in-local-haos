package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r0 */
/* loaded from: classes2.dex */
public final class C10683r0 {

    /* renamed from: a */
    private final InterfaceC10597i f41134a;

    /* renamed from: b */
    private final List<InterfaceC10351g1> f41135b;

    /* renamed from: c */
    private final C10683r0 f41136c;

    /* JADX WARN: Multi-variable type inference failed */
    public C10683r0(InterfaceC10597i interfaceC10597i, List<? extends InterfaceC10351g1> list, C10683r0 c10683r0) {
        C9801m.m32346f(interfaceC10597i, "classifierDescriptor");
        C9801m.m32346f(list, "arguments");
        this.f41134a = interfaceC10597i;
        this.f41135b = list;
        this.f41136c = c10683r0;
    }

    /* renamed from: a */
    public final List<InterfaceC10351g1> m38010a() {
        return this.f41135b;
    }

    /* renamed from: b */
    public final InterfaceC10597i m38011b() {
        return this.f41134a;
    }

    /* renamed from: c */
    public final C10683r0 m38012c() {
        return this.f41136c;
    }
}
