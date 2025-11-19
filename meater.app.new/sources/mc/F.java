package mc;

import ic.C3695c;
import ic.InterfaceC3693a;
import ic.InterfaceC3694b;
import ic.InterfaceC3697e;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Platform.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a+\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aQ\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\n2\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\f\u001aM\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\"\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001d\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0015\u001a+\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"", "T", "LIa/d;", "Lic/a;", "b", "(LIa/d;)Lic/a;", "", "args", "c", "(LIa/d;[Lic/a;)Lic/a;", "Ljava/lang/Class;", "d", "(Ljava/lang/Class;[Lic/a;)Lic/a;", "f", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "l", "(Ljava/lang/Class;)Z", "m", "i", "(Ljava/lang/Class;)Lic/a;", "jClass", "k", "companion", "j", "(Ljava/lang/Object;[Lic/a;)Lic/a;", "", "companionName", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "e", "h", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F {
    private static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> InterfaceC3693a<T> b(Ia.d<T> dVar) {
        C3862t.g(dVar, "<this>");
        return c(dVar, new InterfaceC3693a[0]);
    }

    public static final <T> InterfaceC3693a<T> c(Ia.d<T> dVar, InterfaceC3693a<Object>... args) {
        C3862t.g(dVar, "<this>");
        C3862t.g(args, "args");
        return d(Aa.a.b(dVar), (InterfaceC3693a[]) Arrays.copyOf(args, args.length));
    }

    public static final <T> InterfaceC3693a<T> d(Class<T> cls, InterfaceC3693a<Object>... args) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC3693a<T> interfaceC3693aI;
        C3862t.g(cls, "<this>");
        C3862t.g(args, "args");
        if (cls.isEnum() && l(cls)) {
            return e(cls);
        }
        if (cls.isInterface() && (interfaceC3693aI = i(cls)) != null) {
            return interfaceC3693aI;
        }
        InterfaceC3693a<T> interfaceC3693aK = k(cls, (InterfaceC3693a[]) Arrays.copyOf(args, args.length));
        if (interfaceC3693aK != null) {
            return interfaceC3693aK;
        }
        InterfaceC3693a<T> interfaceC3693aH = h(cls);
        if (interfaceC3693aH != null) {
            return interfaceC3693aH;
        }
        InterfaceC3693a<T> interfaceC3693aF = f(cls, (InterfaceC3693a[]) Arrays.copyOf(args, args.length));
        if (interfaceC3693aF != null) {
            return interfaceC3693aF;
        }
        if (m(cls)) {
            return new C3695c(Aa.a.e(cls));
        }
        return null;
    }

    private static final <T> InterfaceC3693a<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        C3862t.f(canonicalName, "getCanonicalName(...)");
        C3862t.e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C4036p(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> InterfaceC3693a<T> f(Class<T> cls, InterfaceC3693a<Object>... interfaceC3693aArr) {
        Field field;
        InterfaceC3693a<T> interfaceC3693aJ;
        Object objG = g(cls);
        if (objG != null && (interfaceC3693aJ = j(objG, (InterfaceC3693a[]) Arrays.copyOf(interfaceC3693aArr, interfaceC3693aArr.length))) != null) {
            return interfaceC3693aJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            C3862t.f(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (C3862t.b(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof InterfaceC3693a) {
                return (InterfaceC3693a) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        C3862t.f(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC4019A.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        C3862t.f(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> ic.InterfaceC3693a<T> h(java.lang.Class<T> r11) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = Ub.n.G(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = Ub.n.G(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.C3862t.f(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.C3862t.b(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.C3862t.b(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.C3862t.f(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.C3862t.b(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.C3862t.f(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<ic.a> r9 = ic.InterfaceC3693a.class
            boolean r8 = kotlin.jvm.internal.C3862t.b(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof ic.InterfaceC3693a
            if (r0 == 0) goto Lae
            r1 = r11
            ic.a r1 = (ic.InterfaceC3693a) r1
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.F.h(java.lang.Class):ic.a");
    }

    private static final <T> InterfaceC3693a<T> i(Class<T> cls) {
        InterfaceC3697e interfaceC3697e = (InterfaceC3697e) cls.getAnnotation(InterfaceC3697e.class);
        if (interfaceC3697e == null || C3862t.b(kotlin.jvm.internal.P.b(interfaceC3697e.with()), kotlin.jvm.internal.P.b(C3695c.class))) {
            return new C3695c(Aa.a.e(cls));
        }
        return null;
    }

    private static final <T> InterfaceC3693a<T> j(Object obj, InterfaceC3693a<Object>... interfaceC3693aArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC3693aArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC3693aArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = InterfaceC3693a.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC3693aArr, interfaceC3693aArr.length));
            if (objInvoke instanceof InterfaceC3693a) {
                return (InterfaceC3693a) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> InterfaceC3693a<T> k(Class<?> cls, InterfaceC3693a<Object>... interfaceC3693aArr) {
        Object objA = a(cls, "Companion");
        if (objA == null) {
            return null;
        }
        return j(objA, (InterfaceC3693a[]) Arrays.copyOf(interfaceC3693aArr, interfaceC3693aArr.length));
    }

    private static final <T> boolean l(Class<T> cls) {
        return cls.getAnnotation(InterfaceC3697e.class) == null && cls.getAnnotation(InterfaceC3694b.class) == null;
    }

    private static final <T> boolean m(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC3694b.class) != null) {
            return true;
        }
        InterfaceC3697e interfaceC3697e = (InterfaceC3697e) cls.getAnnotation(InterfaceC3697e.class);
        return interfaceC3697e != null && C3862t.b(kotlin.jvm.internal.P.b(interfaceC3697e.with()), kotlin.jvm.internal.P.b(C3695c.class));
    }
}
