package Xa;

import hb.InterfaceC3508a;
import hb.InterfaceC3532y;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaTypeParameter.kt */
/* loaded from: classes3.dex */
public final class F extends u implements j, InterfaceC3532y {

    /* renamed from: a, reason: collision with root package name */
    private final TypeVariable<?> f18934a;

    public F(TypeVariable<?> typeVariable) {
        C3862t.g(typeVariable, "typeVariable");
        this.f18934a = typeVariable;
    }

    @Override // hb.InterfaceC3532y
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List<s> getUpperBounds() {
        Type[] bounds = this.f18934a.getBounds();
        C3862t.f(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) kotlin.collections.r.L0(arrayList);
        return C3862t.b(sVar != null ? sVar.Q() : null, Object.class) ? kotlin.collections.r.m() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && C3862t.b(this.f18934a, ((F) obj).f18934a);
    }

    @Override // hb.InterfaceC3511d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // hb.InterfaceC3527t
    public qb.f getName() {
        qb.f fVarT = qb.f.t(this.f18934a.getName());
        C3862t.f(fVarT, "identifier(...)");
        return fVarT;
    }

    public int hashCode() {
        return this.f18934a.hashCode();
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return false;
    }

    @Override // hb.InterfaceC3511d
    public /* bridge */ /* synthetic */ InterfaceC3508a o(qb.c cVar) {
        return o(cVar);
    }

    public String toString() {
        return F.class.getName() + ": " + this.f18934a;
    }

    @Override // Xa.j
    public AnnotatedElement x() {
        TypeVariable<?> typeVariable = this.f18934a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // Xa.j, hb.InterfaceC3511d
    public List<C1823g> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<C1823g> listB;
        AnnotatedElement annotatedElementX = x();
        return (annotatedElementX == null || (declaredAnnotations = annotatedElementX.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? kotlin.collections.r.m() : listB;
    }

    @Override // Xa.j, hb.InterfaceC3511d
    public C1823g o(qb.c fqName) {
        Annotation[] declaredAnnotations;
        C3862t.g(fqName, "fqName");
        AnnotatedElement annotatedElementX = x();
        if (annotatedElementX == null || (declaredAnnotations = annotatedElementX.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
