package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10622i;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: kotlin.f0.y.e.j0.l.j */
/* loaded from: classes3.dex */
public final class C10358j extends AbstractC10459y0<C10358j> {

    /* renamed from: a */
    private final InterfaceC10620g f40130a;

    public C10358j(InterfaceC10620g interfaceC10620g) {
        C9801m.m32346f(interfaceC10620g, "annotations");
        this.f40130a = interfaceC10620g;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10459y0
    /* renamed from: b */
    public KClass<? extends C10358j> mo36721b() {
        return C9790g0.m32298b(C10358j.class);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10459y0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C10358j mo36720a(C10358j c10358j) {
        return c10358j == null ? this : new C10358j(C10622i.m37739a(this.f40130a, c10358j.f40130a));
    }

    /* renamed from: e */
    public final InterfaceC10620g m36724e() {
        return this.f40130a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10358j) {
            return C9801m.m32341a(((C10358j) obj).f40130a, this.f40130a);
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10459y0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C10358j mo36722c(C10358j c10358j) {
        if (C9801m.m32341a(c10358j, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f40130a.hashCode();
    }
}
