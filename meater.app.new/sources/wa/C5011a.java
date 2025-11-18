package wa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: PlatformImplementations.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwa/a;", "", "<init>", "()V", "", "cause", "exception", "Loa/F;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "LFa/c;", "b", "()LFa/c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5011a {

    /* compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lwa/a$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "addSuppressed", "c", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wa.a$a, reason: collision with other inner class name */
    private static final class C0753a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0753a f52006a = new C0753a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Method addSuppressed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            C3862t.d(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (C3862t.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C3862t.f(parameterTypes, "getParameterTypes(...)");
                    if (C3862t.b(C3831l.w0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (C3862t.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            getSuppressed = method;
        }

        private C0753a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(cause, "cause");
        C3862t.g(exception, "exception");
        Method method = C0753a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Fa.c b() {
        return new Fa.b();
    }
}
