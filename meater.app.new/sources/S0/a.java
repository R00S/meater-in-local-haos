package S0;

import Ha.f;
import Ha.g;
import S0.c;
import Ub.n;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.J;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.U;
import oa.InterfaceC4156a;

/* compiled from: ComposableInvoker.jvm.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LS0/a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "composableMethodTypes", "previewParameterTypes", "", "a", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "", "methodName", "args", "d", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "previewParamArgs", "e", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "f", "(Ljava/lang/Class;)Ljava/lang/Object;", "instance", "LO/l;", "composer", "h", "(Ljava/lang/reflect/Method;Ljava/lang/Object;LO/l;[Ljava/lang/Object;)Ljava/lang/Object;", "", "realValueParams", "thisParams", "b", "(II)I", "c", "(I)I", "className", "Loa/F;", "g", "(Ljava/lang/String;Ljava/lang/String;LO/l;[Ljava/lang/Object;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15260a = new a();

    private a() {
    }

    private final boolean a(Class<?>[] composableMethodTypes, Class<?>[] previewParameterTypes) {
        if (composableMethodTypes.length != previewParameterTypes.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(composableMethodTypes.length);
        int length = composableMethodTypes.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                break;
            }
            Class<?> cls = composableMethodTypes[i10];
            int i12 = i11 + 1;
            Class<?> cls2 = previewParameterTypes[i11];
            if (!C3862t.b(Aa.a.e(cls), Aa.a.e(cls2)) && !cls.isAssignableFrom(cls2)) {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
            i10++;
            i11 = i12;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final int b(int realValueParams, int thisParams) {
        if (realValueParams == 0) {
            return 1;
        }
        return (int) Math.ceil((realValueParams + thisParams) / 10.0d);
    }

    private final int c(int realValueParams) {
        return (int) Math.ceil(realValueParams / 31.0d);
    }

    private final Method d(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methodArr[i10];
            if (!C3862t.b(str, method2.getName())) {
                if (!n.G(method2.getName(), str + '-', false, 2, null)) {
                    continue;
                }
                i10++;
            }
            if (f15260a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i10++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Method e(Class<?> cls, String str, Object... objArr) throws SecurityException {
        Class<?> cls2;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                f fVarP = g.p(0, iB);
                ArrayList arrayList2 = new ArrayList(r.x(fVarP, 10));
                Iterator<Integer> it = fVarP.iterator();
                while (it.hasNext()) {
                    ((J) it).b();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                U u10 = new U(3);
                u10.b(clsArr);
                u10.a(InterfaceC1554l.class);
                u10.b(clsArr2);
                return d(declaredMethods, str, (Class[]) u10.d(new Class[u10.c()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!C3862t.b(method.getName(), str)) {
                        if (!n.G(method.getName(), str + '-', false, 2, null)) {
                        }
                    }
                    cls2 = method;
                    break;
                }
                return cls2;
            }
        } catch (ReflectiveOperationException unused2) {
            return cls2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }

    private final Object h(Method method, Object obj, InterfaceC1554l interfaceC1554l, Object... objArr) {
        Object objF;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i10 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (C3862t.b(parameterTypes[length], InterfaceC1554l.class)) {
                    i10 = length;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        int i12 = i10 + 1;
        int iB = b(i10, obj != null ? 1 : 0) + i12;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iB ? c(i10) : 0) + iB != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i13 = 0;
        while (i13 < length2) {
            if (i13 >= 0 && i13 < i10) {
                objF = (i13 < 0 || i13 > C3831l.c0(objArr)) ? f15260a.f(method.getParameterTypes()[i13]) : objArr[i13];
            } else if (i13 == i10) {
                objF = interfaceC1554l;
            } else if (i12 <= i13 && i13 < iB) {
                objF = 0;
            } else {
                if (iB > i13 || i13 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                objF = 2097151;
            }
            objArr2[i13] = objF;
            i13++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void g(String className, String methodName, InterfaceC1554l composer, Object... args) throws Exception {
        try {
            Class<?> cls = Class.forName(className);
            Method methodE = e(cls, methodName, Arrays.copyOf(args, args.length));
            if (methodE != null) {
                methodE.setAccessible(true);
                if (Modifier.isStatic(methodE.getModifiers())) {
                    h(methodE, null, composer, Arrays.copyOf(args, args.length));
                    return;
                } else {
                    h(methodE, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(args, args.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + className + '.' + methodName + " not found");
        } catch (Exception e10) {
            c.Companion.c(c.INSTANCE, "Failed to invoke Composable Method '" + className + '.' + methodName + '\'', null, 2, null);
            throw e10;
        }
    }
}
