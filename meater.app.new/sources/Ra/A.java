package Ra;

import Lb.j;
import kotlin.jvm.internal.C3862t;

/* compiled from: InlineClassRepresentation.kt */
/* loaded from: classes3.dex */
public final class A<Type extends Lb.j> extends r0<Type> {

    /* renamed from: a, reason: collision with root package name */
    private final qb.f f15102a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f15103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(qb.f underlyingPropertyName, Type underlyingType) {
        super(null);
        C3862t.g(underlyingPropertyName, "underlyingPropertyName");
        C3862t.g(underlyingType, "underlyingType");
        this.f15102a = underlyingPropertyName;
        this.f15103b = underlyingType;
    }

    @Override // Ra.r0
    public boolean a(qb.f name) {
        C3862t.g(name, "name");
        return C3862t.b(this.f15102a, name);
    }

    public final qb.f c() {
        return this.f15102a;
    }

    public final Type d() {
        return this.f15103b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f15102a + ", underlyingType=" + this.f15103b + ')';
    }
}
