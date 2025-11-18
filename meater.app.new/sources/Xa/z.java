package Xa;

import Xa.E;
import hb.InterfaceC3505B;
import hb.InterfaceC3509b;
import hb.InterfaceC3525r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaMethod.kt */
/* loaded from: classes3.dex */
public final class z extends y implements InterfaceC3525r {

    /* renamed from: a, reason: collision with root package name */
    private final Method f18987a;

    public z(Method member) {
        C3862t.g(member, "member");
        this.f18987a = member;
    }

    @Override // hb.InterfaceC3525r
    public boolean L() {
        return r() != null;
    }

    @Override // Xa.y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Method R() {
        return this.f18987a;
    }

    @Override // hb.InterfaceC3525r
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public E getReturnType() {
        E.a aVar = E.f18933a;
        Type genericReturnType = R().getGenericReturnType();
        C3862t.f(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // hb.InterfaceC3533z
    public List<F> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = R().getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3525r
    public List<InterfaceC3505B> k() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        C3862t.f(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        C3862t.f(parameterAnnotations, "getParameterAnnotations(...)");
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }

    @Override // hb.InterfaceC3525r
    public InterfaceC3509b r() {
        Object defaultValue = R().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC1824h.f18963b.a(defaultValue, null);
        }
        return null;
    }
}
