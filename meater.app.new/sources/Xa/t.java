package Xa;

import hb.InterfaceC3505B;
import hb.InterfaceC3518k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaConstructor.kt */
/* loaded from: classes3.dex */
public final class t extends y implements InterfaceC3518k {

    /* renamed from: a, reason: collision with root package name */
    private final Constructor<?> f18983a;

    public t(Constructor<?> member) {
        C3862t.g(member, "member");
        this.f18983a = member;
    }

    @Override // Xa.y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Constructor<?> R() {
        return this.f18983a;
    }

    @Override // hb.InterfaceC3533z
    public List<F> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = R().getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3518k
    public List<InterfaceC3505B> k() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        C3862t.d(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return kotlin.collections.r.m();
        }
        Class<?> declaringClass = R().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C3831l.r(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + R());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            C3862t.d(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) C3831l.r(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        C3862t.d(genericParameterTypes);
        C3862t.d(parameterAnnotations);
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }
}
