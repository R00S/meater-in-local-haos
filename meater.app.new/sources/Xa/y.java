package Xa;

import Ra.w0;
import Ra.x0;
import hb.InterfaceC3505B;
import hb.InterfaceC3508a;
import hb.InterfaceC3524q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaMember.kt */
/* loaded from: classes3.dex */
public abstract class y extends u implements j, A, InterfaceC3524q {
    @Override // hb.InterfaceC3524q
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q P() {
        Class<?> declaringClass = R().getDeclaringClass();
        C3862t.f(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member R();

    protected final List<InterfaceC3505B> S(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        C3862t.g(parameterTypes, "parameterTypes");
        C3862t.g(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> listB = C1819c.f18952a.b(R());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            E eA = E.f18933a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) kotlin.collections.r.m0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + eA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(eA, parameterAnnotations[i10], str, z10 && i10 == C3831l.c0(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && C3862t.b(R(), ((y) obj).R());
    }

    @Override // hb.InterfaceC3526s
    public boolean g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // hb.InterfaceC3511d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Xa.A
    public int getModifiers() {
        return R().getModifiers();
    }

    @Override // hb.InterfaceC3527t
    public qb.f getName() {
        qb.f fVarT;
        String name = R().getName();
        return (name == null || (fVarT = qb.f.t(name)) == null) ? qb.h.f48199b : fVarT;
    }

    @Override // hb.InterfaceC3526s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? w0.h.f15194c : Modifier.isPrivate(modifiers) ? w0.e.f15191c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? Va.c.f18235c : Va.b.f18234c : Va.a.f18233c;
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // hb.InterfaceC3526s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // hb.InterfaceC3526s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
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
        return getClass().getName() + ": " + R();
    }

    @Override // Xa.j
    public AnnotatedElement x() {
        Member memberR = R();
        C3862t.e(memberR, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberR;
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
