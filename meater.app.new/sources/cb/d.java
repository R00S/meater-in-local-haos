package cb;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.Z;
import Ra.g0;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: g0, reason: collision with root package name */
    private final g0 f31127g0;

    /* renamed from: h0, reason: collision with root package name */
    private final g0 f31128h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Z f31129i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC1692e ownerDescriptor, g0 getterMethod, g0 g0Var, Z overriddenProperty) {
        super(ownerDescriptor, Sa.h.f15630e.b(), getterMethod.m(), getterMethod.getVisibility(), g0Var != null, overriddenProperty.getName(), getterMethod.j(), null, InterfaceC1689b.a.DECLARATION, false, null);
        C3862t.g(ownerDescriptor, "ownerDescriptor");
        C3862t.g(getterMethod, "getterMethod");
        C3862t.g(overriddenProperty, "overriddenProperty");
        this.f31127g0 = getterMethod;
        this.f31128h0 = g0Var;
        this.f31129i0 = overriddenProperty;
    }
}
