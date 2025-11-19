package Wa;

import Xa.C1822f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes3.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f18494a = new m();

    private m() {
    }

    public final String a(Constructor<?> constructor) {
        C3862t.g(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = C3846c.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            C3862t.d(cls);
            sb2.append(C1822f.f(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        C3862t.g(field, "field");
        Class<?> type = field.getType();
        C3862t.f(type, "getType(...)");
        return C1822f.f(type);
    }

    public final String c(Method method) {
        C3862t.g(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = C3846c.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            C3862t.d(cls);
            sb2.append(C1822f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        C3862t.f(returnType, "getReturnType(...)");
        sb2.append(C1822f.f(returnType));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
