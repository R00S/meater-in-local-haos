package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10725z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;

/* compiled from: ReflectJavaMethod.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.u */
/* loaded from: classes2.dex */
public final class C10720u extends AbstractC10719t implements InterfaceC10041r {

    /* renamed from: a */
    private final Method f41209a;

    public C10720u(Method method) {
        C9801m.m32346f(method, "member");
        this.f41209a = method;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r
    /* renamed from: L */
    public boolean mo33619L() {
        return InterfaceC10041r.a.m33622a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10719t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Method mo38106U() {
        return this.f41209a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public AbstractC10725z getReturnType() {
        AbstractC10725z.a aVar = AbstractC10725z.f41215a;
        Type genericReturnType = mo38106U().getGenericReturnType();
        C9801m.m32345e(genericReturnType, "member.genericReturnType");
        return aVar.m38122a(genericReturnType);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r
    /* renamed from: f */
    public List<InterfaceC10022b0> mo33620f() {
        Type[] genericParameterTypes = mo38106U().getGenericParameterTypes();
        C9801m.m32345e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo38106U().getParameterAnnotations();
        C9801m.m32345e(parameterAnnotations, "member.parameterAnnotations");
        return m38113V(genericParameterTypes, parameterAnnotations, mo38106U().isVarArgs());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10049z
    public List<C10698a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo38106U().getTypeParameters();
        C9801m.m32345e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C10698a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r
    /* renamed from: s */
    public InterfaceC10021b mo33621s() {
        Object defaultValue = mo38106U().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC10705f.f41185a.m38080a(defaultValue, null);
        }
        return null;
    }
}
