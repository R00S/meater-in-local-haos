package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10795j;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10034k;

/* compiled from: ReflectJavaConstructor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.o */
/* loaded from: classes2.dex */
public final class C10714o extends AbstractC10719t implements InterfaceC10034k {

    /* renamed from: a */
    private final Constructor<?> f41205a;

    public C10714o(Constructor<?> constructor) {
        C9801m.m32346f(constructor, "member");
        this.f41205a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10719t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Constructor<?> mo38106U() {
        return this.f41205a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10034k
    /* renamed from: f */
    public List<InterfaceC10022b0> mo33610f() {
        Type[] genericParameterTypes = mo38106U().getGenericParameterTypes();
        C9801m.m32345e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C10817u.m38888j();
        }
        Class<?> declaringClass = mo38106U().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C10795j.m38681i(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo38106U().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + mo38106U());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            C9801m.m32345e(parameterAnnotations, "annotations");
            parameterAnnotations = (Annotation[][]) C10795j.m38681i(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        C9801m.m32345e(genericParameterTypes, "realTypes");
        C9801m.m32345e(parameterAnnotations, "realAnnotations");
        return m38113V(genericParameterTypes, parameterAnnotations, mo38106U().isVarArgs());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10049z
    public List<C10698a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = mo38106U().getTypeParameters();
        C9801m.m32345e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C10698a0(typeVariable));
        }
        return arrayList;
    }
}
