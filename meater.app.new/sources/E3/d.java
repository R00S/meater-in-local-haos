package E3;

import Ba.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: ConsumerAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002\u000f\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\bJ[\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"LE3/d;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "T", "LIa/d;", "clazz", "Lkotlin/Function1;", "Loa/F;", "consumer", "a", "(LIa/d;LBa/l;)Ljava/lang/Object;", "b", "obj", "", "addMethodName", "removeMethodName", "Landroid/app/Activity;", "activity", "LE3/d$b;", "c", "(Ljava/lang/Object;LIa/d;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;LBa/l;)LE3/d$b;", "Ljava/lang/ClassLoader;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    /* compiled from: ConsumerAdapter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0013\u001a\u00020\u000e*\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J2\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000b2\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001e"}, d2 = {"LE3/d$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "LIa/d;", "clazz", "Lkotlin/Function1;", "Loa/F;", "consumer", "<init>", "(LIa/d;LBa/l;)V", "Ljava/lang/reflect/Method;", "", "args", "", "c", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "d", "b", "e", "obj", "method", "parameters", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parameter", "a", "(Ljava/lang/Object;)V", "LIa/d;", "LBa/l;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ia.d<T> clazz;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final l<T, C4153F> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.d<T> clazz, l<? super T, C4153F> consumer) {
            C3862t.g(clazz, "clazz");
            C3862t.g(consumer, "consumer");
            this.clazz = clazz;
            this.consumer = consumer;
        }

        private final boolean b(Method method, Object[] objArr) {
            return C3862t.b(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean c(Method method, Object[] objArr) {
            return C3862t.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean d(Method method, Object[] objArr) {
            return C3862t.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean e(Method method, Object[] objArr) {
            return C3862t.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public final void a(T parameter) {
            C3862t.g(parameter, "parameter");
            this.consumer.invoke(parameter);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] parameters) {
            C3862t.g(obj, "obj");
            C3862t.g(method, "method");
            if (b(method, parameters)) {
                a(Ia.e.a(this.clazz, parameters != null ? parameters[0] : null));
                return C4153F.f46609a;
            }
            if (c(method, parameters)) {
                return Boolean.valueOf(obj == (parameters != null ? parameters[0] : null));
            }
            if (d(method, parameters)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (e(method, parameters)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + parameters);
        }
    }

    /* compiled from: ConsumerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LE3/d$b;", "", "Loa/F;", "c", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void c();
    }

    /* compiled from: ConsumerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"E3/d$c", "LE3/d$b;", "Loa/F;", "c", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f3826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3828c;

        c(Method method, Object obj, Object obj2) {
            this.f3826a = method;
            this.f3827b = obj;
            this.f3828c = obj2;
        }

        @Override // E3.d.b
        public void c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f3826a.invoke(this.f3827b, this.f3828c);
        }
    }

    public d(ClassLoader loader) {
        C3862t.g(loader, "loader");
        this.loader = loader;
    }

    private final <T> Object a(Ia.d<T> clazz, l<? super T, C4153F> consumer) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{d()}, new a(clazz, consumer));
        C3862t.f(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    private final Class<?> d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("java.util.function.Consumer");
        C3862t.f(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    public final Class<?> b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> b c(Object obj, Ia.d<T> clazz, String addMethodName, String removeMethodName, Activity activity, l<? super T, C4153F> consumer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(obj, "obj");
        C3862t.g(clazz, "clazz");
        C3862t.g(addMethodName, "addMethodName");
        C3862t.g(removeMethodName, "removeMethodName");
        C3862t.g(activity, "activity");
        C3862t.g(consumer, "consumer");
        Object objA = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, objA);
    }
}
