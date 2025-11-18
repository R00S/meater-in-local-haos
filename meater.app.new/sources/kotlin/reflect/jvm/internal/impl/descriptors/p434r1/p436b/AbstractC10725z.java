package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: ReflectJavaType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z */
/* loaded from: classes2.dex */
public abstract class AbstractC10725z implements InterfaceC10047x {

    /* renamed from: a */
    public static final a f41215a = new a(null);

    /* compiled from: ReflectJavaType.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10725z m38122a(Type type) {
            C9801m.m32346f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C10723x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C10710k(type) : type instanceof WildcardType ? new C10702c0((WildcardType) type) : new C10713n(type);
        }
    }

    /* renamed from: R */
    protected abstract Type mo38066R();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC10725z) && C9801m.m32341a(mo38066R(), ((AbstractC10725z) obj).mo38066R());
    }

    public int hashCode() {
        return mo38066R().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: l */
    public InterfaceC10019a mo33582l(C10160c c10160c) {
        return InterfaceC10047x.a.m33628a(this, c10160c);
    }

    public String toString() {
        return getClass().getName() + ": " + mo38066R();
    }
}
