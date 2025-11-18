package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.C9752a;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10705f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaAnnotation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.e */
/* loaded from: classes2.dex */
public final class C10704e extends AbstractC10715p implements InterfaceC10019a {

    /* renamed from: a */
    private final Annotation f41184a;

    public C10704e(Annotation annotation) {
        C9801m.m32346f(annotation, "annotation");
        this.f41184a = annotation;
    }

    /* renamed from: R */
    public final Annotation m38078R() {
        return this.f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C10711l mo33574z() {
        return new C10711l(C9752a.m32276b(C9752a.m32275a(this.f41184a)));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a
    /* renamed from: b */
    public Collection<InterfaceC10021b> mo33570b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = C9752a.m32276b(C9752a.m32275a(this.f41184a)).getDeclaredMethods();
        C9801m.m32345e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC10705f.a aVar = AbstractC10705f.f41185a;
            Object objInvoke = method.invoke(this.f41184a, new Object[0]);
            C9801m.m32345e(objInvoke, "method.invoke(annotation)");
            arrayList.add(aVar.m38080a(objInvoke, C10163f.m35454x(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a
    /* renamed from: e */
    public C10159b mo33571e() {
        return C10703d.m38069a(C9752a.m32276b(C9752a.m32275a(this.f41184a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10704e) && this.f41184a == ((C10704e) obj).f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a
    /* renamed from: g */
    public boolean mo33572g() {
        return InterfaceC10019a.a.m33576b(this);
    }

    public int hashCode() {
        return System.identityHashCode(this.f41184a);
    }

    public String toString() {
        return C10704e.class.getName() + ": " + this.f41184a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a
    /* renamed from: v */
    public boolean mo33573v() {
        return InterfaceC10019a.a.m33575a(this);
    }
}
