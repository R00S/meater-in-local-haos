package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10029f;

/* compiled from: ReflectJavaArrayType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.k */
/* loaded from: classes2.dex */
public final class C10710k extends AbstractC10725z implements InterfaceC10029f {

    /* renamed from: b */
    private final Type f41189b;

    /* renamed from: c */
    private final AbstractC10725z f41190c;

    /* renamed from: d */
    private final Collection<InterfaceC10019a> f41191d;

    /* renamed from: e */
    private final boolean f41192e;

    public C10710k(Type type) {
        AbstractC10725z abstractC10725zM38122a;
        C9801m.m32346f(type, "reflectType");
        this.f41189b = type;
        Type typeMo38066R = mo38066R();
        if (!(typeMo38066R instanceof GenericArrayType)) {
            if (typeMo38066R instanceof Class) {
                Class cls = (Class) typeMo38066R;
                if (cls.isArray()) {
                    AbstractC10725z.a aVar = AbstractC10725z.f41215a;
                    Class<?> componentType = cls.getComponentType();
                    C9801m.m32345e(componentType, "getComponentType()");
                    abstractC10725zM38122a = aVar.m38122a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo38066R().getClass() + "): " + mo38066R());
        }
        AbstractC10725z.a aVar2 = AbstractC10725z.f41215a;
        Type genericComponentType = ((GenericArrayType) typeMo38066R).getGenericComponentType();
        C9801m.m32345e(genericComponentType, "genericComponentType");
        abstractC10725zM38122a = aVar2.m38122a(genericComponentType);
        this.f41190c = abstractC10725zM38122a;
        this.f41191d = C10817u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z
    /* renamed from: R */
    protected Type mo38066R() {
        return this.f41189b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10029f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public AbstractC10725z mo33587n() {
        return this.f41190c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    public Collection<InterfaceC10019a> getAnnotations() {
        return this.f41191d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return this.f41192e;
    }
}
