package Xa;

import Xa.AbstractC1824h;
import hb.InterfaceC3508a;
import hb.InterfaceC3509b;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaAnnotation.kt */
/* renamed from: Xa.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1823g extends u implements InterfaceC3508a {

    /* renamed from: a, reason: collision with root package name */
    private final Annotation f18962a;

    public C1823g(Annotation annotation) {
        C3862t.g(annotation, "annotation");
        this.f18962a = annotation;
    }

    public final Annotation Q() {
        return this.f18962a;
    }

    @Override // hb.InterfaceC3508a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public q A() {
        return new q(Aa.a.b(Aa.a.a(this.f18962a)));
    }

    @Override // hb.InterfaceC3508a
    public Collection<InterfaceC3509b> b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = Aa.a.b(Aa.a.a(this.f18962a)).getDeclaredMethods();
        C3862t.f(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC1824h.a aVar = AbstractC1824h.f18963b;
            Object objInvoke = method.invoke(this.f18962a, null);
            C3862t.f(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, qb.f.t(method.getName())));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3508a
    public qb.b c() {
        return C1822f.e(Aa.a.b(Aa.a.a(this.f18962a)));
    }

    @Override // hb.InterfaceC3508a
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1823g) && this.f18962a == ((C1823g) obj).f18962a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f18962a);
    }

    public String toString() {
        return C1823g.class.getName() + ": " + this.f18962a;
    }

    @Override // hb.InterfaceC3508a
    public boolean w() {
        return false;
    }
}
