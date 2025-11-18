package Xa;

import Xa.E;
import hb.InterfaceC3506C;
import hb.InterfaceC3508a;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaWildcardType.kt */
/* loaded from: classes3.dex */
public final class H extends E implements InterfaceC3506C {

    /* renamed from: b, reason: collision with root package name */
    private final WildcardType f18939b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<InterfaceC3508a> f18940c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18941d;

    public H(WildcardType reflectType) {
        C3862t.g(reflectType, "reflectType");
        this.f18939b = reflectType;
        this.f18940c = kotlin.collections.r.m();
    }

    @Override // hb.InterfaceC3506C
    public boolean J() {
        C3862t.f(Q().getUpperBounds(), "getUpperBounds(...)");
        return !C3862t.b(C3831l.Y(r0), Object.class);
    }

    @Override // hb.InterfaceC3506C
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public E D() {
        Type[] upperBounds = Q().getUpperBounds();
        Type[] lowerBounds = Q().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + Q());
        }
        if (lowerBounds.length == 1) {
            E.a aVar = E.f18933a;
            C3862t.d(lowerBounds);
            Object objV0 = C3831l.v0(lowerBounds);
            C3862t.f(objV0, "single(...)");
            return aVar.a((Type) objV0);
        }
        if (upperBounds.length == 1) {
            C3862t.d(upperBounds);
            Type type = (Type) C3831l.v0(upperBounds);
            if (!C3862t.b(type, Object.class)) {
                E.a aVar2 = E.f18933a;
                C3862t.d(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xa.E
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public WildcardType Q() {
        return this.f18939b;
    }

    @Override // hb.InterfaceC3511d
    public Collection<InterfaceC3508a> getAnnotations() {
        return this.f18940c;
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return this.f18941d;
    }
}
