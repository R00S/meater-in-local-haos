package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.m */
/* loaded from: classes2.dex */
final class C10696m {

    /* renamed from: a */
    public static final C10696m f41155a = new C10696m();

    private C10696m() {
    }

    /* renamed from: a */
    public final String m38036a(Constructor<?> constructor) {
        C9801m.m32346f(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        C9801m.m32345e(parameterTypes, "constructor.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            C9801m.m32345e(cls, "parameterType");
            sb.append(C10703d.m38070b(cls));
        }
        sb.append(")V");
        String string = sb.toString();
        C9801m.m32345e(string, "sb.toString()");
        return string;
    }

    /* renamed from: b */
    public final String m38037b(Field field) {
        C9801m.m32346f(field, "field");
        Class<?> type = field.getType();
        C9801m.m32345e(type, "field.type");
        return C10703d.m38070b(type);
    }

    /* renamed from: c */
    public final String m38038c(Method method) {
        C9801m.m32346f(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9801m.m32345e(parameterTypes, "method.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            C9801m.m32345e(cls, "parameterType");
            sb.append(C10703d.m38070b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        C9801m.m32345e(returnType, "method.returnType");
        sb.append(C10703d.m38070b(returnType));
        String string = sb.toString();
        C9801m.m32345e(string, "sb.toString()");
        return string;
    }
}
