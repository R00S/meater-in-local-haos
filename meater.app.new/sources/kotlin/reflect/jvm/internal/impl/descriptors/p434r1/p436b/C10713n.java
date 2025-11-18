package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10032i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: ReflectJavaClassifierType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.n */
/* loaded from: classes2.dex */
public final class C10713n extends AbstractC10725z implements InterfaceC10033j {

    /* renamed from: b */
    private final Type f41203b;

    /* renamed from: c */
    private final InterfaceC10032i f41204c;

    public C10713n(Type type) {
        InterfaceC10032i c10711l;
        C9801m.m32346f(type, "reflectType");
        this.f41203b = type;
        Type typeMo38066R = mo38066R();
        if (typeMo38066R instanceof Class) {
            c10711l = new C10711l((Class) typeMo38066R);
        } else if (typeMo38066R instanceof TypeVariable) {
            c10711l = new C10698a0((TypeVariable) typeMo38066R);
        } else {
            if (!(typeMo38066R instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeMo38066R.getClass() + "): " + typeMo38066R);
            }
            Type rawType = ((ParameterizedType) typeMo38066R).getRawType();
            C9801m.m32344d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c10711l = new C10711l((Class) rawType);
        }
        this.f41204c = c10711l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j
    /* renamed from: F */
    public List<InterfaceC10047x> mo33605F() {
        List<Type> listM38071c = C10703d.m38071c(mo38066R());
        AbstractC10725z.a aVar = AbstractC10725z.f41215a;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38071c, 10));
        Iterator<T> it = listM38071c.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.m38122a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z
    /* renamed from: R */
    public Type mo38066R() {
        return this.f41203b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j
    /* renamed from: c */
    public InterfaceC10032i mo33606c() {
        return this.f41204c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    public Collection<InterfaceC10019a> getAnnotations() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: l */
    public InterfaceC10019a mo33582l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j
    /* renamed from: p */
    public String mo33607p() {
        return mo38066R().toString();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j
    /* renamed from: x */
    public boolean mo33608x() {
        Type typeMo38066R = mo38066R();
        if (!(typeMo38066R instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) typeMo38066R).getTypeParameters();
        C9801m.m32345e(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j
    /* renamed from: y */
    public String mo33609y() {
        throw new UnsupportedOperationException("Type not found: " + mo38066R());
    }
}
