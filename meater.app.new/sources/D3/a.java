package D3;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: SafeWindowExtensionsProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"LD3/a;", "", "Ljava/lang/ClassLoader;", "loader", "<init>", "(Ljava/lang/ClassLoader;)V", "", "e", "()Z", "f", "a", "Ljava/lang/ClassLoader;", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "windowExtensionsProviderClass", "c", "windowExtensionsClass", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    /* compiled from: SafeWindowExtensionsProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "a", "()Ljava/lang/Class;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: D3.a$a, reason: collision with other inner class name */
    static final class C0054a extends AbstractC3864v implements Ba.a<Class<?>> {
        C0054a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke() throws ClassNotFoundException {
            Class<?> clsLoadClass = a.this.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            C3862t.f(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return clsLoadClass;
        }
    }

    /* compiled from: SafeWindowExtensionsProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            Method getWindowExtensionsMethod = a.this.d().getDeclaredMethod("getWindowExtensions", null);
            Class<?> clsC = a.this.c();
            K3.a aVar = K3.a.f8677a;
            C3862t.f(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(aVar.c(getWindowExtensionsMethod, clsC) && aVar.d(getWindowExtensionsMethod));
        }
    }

    public a(ClassLoader loader) {
        C3862t.g(loader, "loader");
        this.loader = loader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        C3862t.f(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return clsLoadClass;
    }

    private final boolean e() {
        return K3.a.f8677a.a(new C0054a());
    }

    public final Class<?> c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("androidx.window.extensions.WindowExtensions");
        C3862t.f(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return clsLoadClass;
    }

    public final boolean f() {
        return e() && K3.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
