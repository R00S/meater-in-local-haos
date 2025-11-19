package nd;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import nd.c;
import nd.f;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform.java */
/* loaded from: classes3.dex */
class p {

    /* renamed from: c, reason: collision with root package name */
    private static final p f45967c = e();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f45968a;

    /* renamed from: b, reason: collision with root package name */
    private final Constructor<MethodHandles.Lookup> f45969b;

    /* compiled from: Platform.java */
    static final class a extends p {

        /* compiled from: Platform.java */
        /* renamed from: nd.p$a$a, reason: collision with other inner class name */
        static final class ExecutorC0630a implements Executor {

            /* renamed from: B, reason: collision with root package name */
            private final Handler f45970B = new Handler(Looper.getMainLooper());

            ExecutorC0630a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f45970B.post(runnable);
            }
        }

        a() {
            super(true);
        }

        @Override // nd.p
        public Executor b() {
            return new ExecutorC0630a();
        }

        @Override // nd.p
        Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
            return super.g(method, cls, obj, objArr);
        }
    }

    p(boolean z10) throws NoSuchMethodException, SecurityException {
        this.f45968a = z10;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z10) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f45969b = declaredConstructor;
    }

    private static p e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new p(true);
    }

    static p f() {
        return f45967c;
    }

    List<? extends c.a> a(Executor executor) {
        g gVar = new g(executor);
        return this.f45968a ? Arrays.asList(e.f45862a, gVar) : Collections.singletonList(gVar);
    }

    Executor b() {
        return null;
    }

    List<? extends f.a> c() {
        return this.f45968a ? Collections.singletonList(n.f45920a) : Collections.emptyList();
    }

    int d() {
        return this.f45968a ? 1 : 0;
    }

    @IgnoreJRERequirement
    Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f45969b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    boolean h(Method method) {
        return this.f45968a && method.isDefault();
    }
}
