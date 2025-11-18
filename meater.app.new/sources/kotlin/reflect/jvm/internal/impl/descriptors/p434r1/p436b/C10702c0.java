package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C10795j;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10024c0;

/* compiled from: ReflectJavaWildcardType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c0 */
/* loaded from: classes2.dex */
public final class C10702c0 extends AbstractC10725z implements InterfaceC10024c0 {

    /* renamed from: b */
    private final WildcardType f41175b;

    /* renamed from: c */
    private final Collection<InterfaceC10019a> f41176c;

    /* renamed from: d */
    private final boolean f41177d;

    public C10702c0(WildcardType wildcardType) {
        C9801m.m32346f(wildcardType, "reflectType");
        this.f41175b = wildcardType;
        this.f41176c = C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10024c0
    /* renamed from: J */
    public boolean mo33581J() {
        C9801m.m32345e(mo38066R().getUpperBounds(), "reflectType.upperBounds");
        return !C9801m.m32341a(C10795j.m38696x(r0), Object.class);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10024c0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC10725z mo33580C() {
        Type[] upperBounds = mo38066R().getUpperBounds();
        Type[] lowerBounds = mo38066R().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo38066R());
        }
        if (lowerBounds.length == 1) {
            AbstractC10725z.a aVar = AbstractC10725z.f41215a;
            C9801m.m32345e(lowerBounds, "lowerBounds");
            Object objM38661N = C10795j.m38661N(lowerBounds);
            C9801m.m32345e(objM38661N, "lowerBounds.single()");
            return aVar.m38122a((Type) objM38661N);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        C9801m.m32345e(upperBounds, "upperBounds");
        Type type = (Type) C10795j.m38661N(upperBounds);
        if (C9801m.m32341a(type, Object.class)) {
            return null;
        }
        AbstractC10725z.a aVar2 = AbstractC10725z.f41215a;
        C9801m.m32345e(type, "ub");
        return aVar2.m38122a(type);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public WildcardType mo38066R() {
        return this.f41175b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    public Collection<InterfaceC10019a> getAnnotations() {
        return this.f41176c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return this.f41177d;
    }
}
