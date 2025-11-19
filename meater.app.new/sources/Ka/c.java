package Ka;

import Ia.h;
import Ia.i;
import Ia.m;
import Ia.q;
import Ia.x;
import La.A;
import La.K0;
import La.U0;
import La.j1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJvmMapping.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LIa/m;", "Ljava/lang/reflect/Field;", "b", "(LIa/m;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(LIa/m;)Ljava/lang/reflect/Method;", "javaGetter", "LIa/i;", "e", "(LIa/i;)Ljava/lang/reflect/Method;", "javaSetter", "LIa/h;", "d", "(LIa/h;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(LIa/h;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(LIa/h;)V", "javaConstructor", "LIa/q;", "Ljava/lang/reflect/Type;", "f", "(LIa/q;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static final <T> Constructor<T> a(h<? extends T> hVar) {
        Ma.h<?> hVarR;
        C3862t.g(hVar, "<this>");
        A<?> aB = j1.b(hVar);
        Member memberB = (aB == null || (hVarR = aB.R()) == null) ? null : hVarR.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(m<?> mVar) {
        C3862t.g(mVar, "<this>");
        K0<?> k0D = j1.d(mVar);
        if (k0D != null) {
            return k0D.i0();
        }
        return null;
    }

    public static final Method c(m<?> mVar) {
        C3862t.g(mVar, "<this>");
        return d(mVar.h0());
    }

    public static final Method d(h<?> hVar) {
        Ma.h<?> hVarR;
        C3862t.g(hVar, "<this>");
        A<?> aB = j1.b(hVar);
        Member memberB = (aB == null || (hVarR = aB.R()) == null) ? null : hVarR.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(i<?> iVar) {
        C3862t.g(iVar, "<this>");
        return d(iVar.h());
    }

    public static final Type f(q qVar) {
        C3862t.g(qVar, "<this>");
        Type typeM = ((U0) qVar).m();
        return typeM == null ? x.f(qVar) : typeM;
    }
}
