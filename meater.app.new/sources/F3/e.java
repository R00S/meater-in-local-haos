package F3;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LF3/e;", "", "Ljava/lang/ClassLoader;", "loader", "LE3/d;", "consumerAdapter", "<init>", "(Ljava/lang/ClassLoader;LE3/d;)V", "", "e", "()Z", "o", "k", "l", "m", "n", "i", "j", "a", "Ljava/lang/ClassLoader;", "b", "LE3/d;", "LD3/a;", "c", "LD3/a;", "safeWindowExtensionsProvider", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "foldingFeatureClass", "h", "windowLayoutComponentClass", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "g", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader loader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final E3.d consumerAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D3.a safeWindowExtensionsProvider;

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r5 = this;
                F3.e r0 = F3.e.this
                java.lang.Class r0 = F3.e.b(r0)
                java.lang.String r1 = "getBounds"
                r2 = 0
                java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                java.lang.String r3 = "getType"
                java.lang.reflect.Method r3 = r0.getMethod(r3, r2)
                java.lang.String r4 = "getState"
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
                K3.a r2 = K3.a.f8677a
                java.lang.String r4 = "getBoundsMethod"
                kotlin.jvm.internal.C3862t.f(r1, r4)
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                Ia.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = r2.b(r1, r4)
                if (r4 == 0) goto L60
                boolean r1 = r2.d(r1)
                if (r1 == 0) goto L60
                java.lang.String r1 = "getTypeMethod"
                kotlin.jvm.internal.C3862t.f(r3, r1)
                java.lang.Class r1 = java.lang.Integer.TYPE
                Ia.d r4 = kotlin.jvm.internal.P.b(r1)
                boolean r4 = r2.b(r3, r4)
                if (r4 == 0) goto L60
                boolean r3 = r2.d(r3)
                if (r3 == 0) goto L60
                java.lang.String r3 = "getStateMethod"
                kotlin.jvm.internal.C3862t.f(r0, r3)
                Ia.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = r2.b(r0, r1)
                if (r1 == 0) goto L60
                boolean r0 = r2.d(r0)
                if (r0 == 0) goto L60
                r0 = 1
                goto L61
            L60:
                r0 = 0
            L61:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: F3.e.a.invoke():java.lang.Boolean");
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r4 = this;
                F3.e r0 = F3.e.this
                E3.d r0 = F3.e.a(r0)
                java.lang.Class r0 = r0.b()
                if (r0 != 0) goto Lf
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            Lf:
                F3.e r1 = F3.e.this
                java.lang.Class r1 = F3.e.d(r1)
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2, r0}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r2 = r1.getMethod(r3, r2)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                java.lang.reflect.Method r0 = r1.getMethod(r3, r0)
                K3.a r1 = K3.a.f8677a
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.C3862t.f(r2, r3)
                boolean r2 = r1.d(r2)
                if (r2 == 0) goto L45
                java.lang.String r2 = "removeListenerMethod"
                kotlin.jvm.internal.C3862t.f(r0, r2)
                boolean r0 = r1.d(r0)
                if (r0 == 0) goto L45
                r0 = 1
                goto L46
            L45:
                r0 = 0
            L46:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: F3.e.b.invoke():java.lang.Boolean");
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<Boolean> {
        c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r4 = this;
                F3.e r0 = F3.e.this
                java.lang.Class r0 = F3.e.d(r0)
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r2 = androidx.window.extensions.core.util.function.Consumer.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r1 = r0.getMethod(r3, r1)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                K3.a r2 = K3.a.f8677a
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.C3862t.f(r1, r3)
                boolean r1 = r2.d(r1)
                if (r1 == 0) goto L38
                java.lang.String r1 = "removeListenerMethod"
                kotlin.jvm.internal.C3862t.f(r0, r1)
                boolean r0 = r2.d(r0)
                if (r0 == 0) goto L38
                r0 = 1
                goto L39
            L38:
                r0 = 0
            L39:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: F3.e.c.invoke():java.lang.Boolean");
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<Boolean> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            Method getWindowLayoutComponentMethod = e.this.safeWindowExtensionsProvider.c().getMethod("getWindowLayoutComponent", null);
            Class<?> clsH = e.this.h();
            K3.a aVar = K3.a.f8677a;
            C3862t.f(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(aVar.d(getWindowLayoutComponentMethod) && aVar.c(getWindowLayoutComponentMethod, clsH));
        }
    }

    public e(ClassLoader loader, E3.d consumerAdapter) {
        C3862t.g(loader, "loader");
        C3862t.g(consumerAdapter, "consumerAdapter");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.safeWindowExtensionsProvider = new D3.a(loader);
    }

    private final boolean e() {
        if (!n()) {
            return false;
        }
        int iA = E3.e.f3829a.a();
        if (iA == 1) {
            return i();
        }
        if (2 > iA || iA > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> f() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("androidx.window.extensions.layout.FoldingFeature");
        C3862t.f(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> h() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C3862t.f(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean k() {
        return K3.a.e("FoldingFeature class is not valid", new a());
    }

    private final boolean l() {
        return K3.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    private final boolean m() {
        return K3.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    private final boolean o() {
        return K3.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean n() {
        return this.safeWindowExtensionsProvider.f() && o() && k();
    }
}
