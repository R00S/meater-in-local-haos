package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r;

/* compiled from: RuntimeErrorReporter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.j */
/* loaded from: classes2.dex */
public final class C10693j implements InterfaceC10308r {

    /* renamed from: b */
    public static final C10693j f41149b = new C10693j();

    private C10693j() {
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r
    /* renamed from: a */
    public void mo36470a(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC10576b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r
    /* renamed from: b */
    public void mo36471b(InterfaceC10585e interfaceC10585e, List<String> list) {
        C9801m.m32346f(interfaceC10585e, "descriptor");
        C9801m.m32346f(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC10585e.getName() + ", unresolved classes " + list);
    }
}
