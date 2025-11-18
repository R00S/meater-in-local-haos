package com.bumptech.glide;

import A6.o;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;

/* compiled from: Glide.java */
/* loaded from: classes2.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: L, reason: collision with root package name */
    private static volatile b f32923L;

    /* renamed from: M, reason: collision with root package name */
    private static volatile boolean f32924M;

    /* renamed from: B, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f32925B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC4239d f32926C;

    /* renamed from: D, reason: collision with root package name */
    private final q6.h f32927D;

    /* renamed from: E, reason: collision with root package name */
    private final d f32928E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC4237b f32929F;

    /* renamed from: G, reason: collision with root package name */
    private final o f32930G;

    /* renamed from: H, reason: collision with root package name */
    private final A6.c f32931H;

    /* renamed from: J, reason: collision with root package name */
    private final a f32933J;

    /* renamed from: I, reason: collision with root package name */
    private final List<k> f32932I = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    private f f32934K = f.NORMAL;

    /* compiled from: Glide.java */
    public interface a {
        D6.g e();
    }

    b(Context context, com.bumptech.glide.load.engine.j jVar, q6.h hVar, InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b, o oVar, A6.c cVar, int i10, a aVar, Map<Class<?>, l<?, ?>> map, List<D6.f<Object>> list, List<B6.b> list2, B6.a aVar2, e eVar) {
        this.f32925B = jVar;
        this.f32926C = interfaceC4239d;
        this.f32929F = interfaceC4237b;
        this.f32927D = hVar;
        this.f32930G = oVar;
        this.f32931H = cVar;
        this.f32933J = aVar;
        this.f32928E = new d(context, interfaceC4237b, i.d(this, list2, aVar2), new E6.f(), aVar, map, list, jVar, eVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f32924M) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f32924M = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f32924M = false;
        }
    }

    public static b c(Context context) {
        if (f32923L == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f32923L == null) {
                        a(context, generatedAppGlideModuleD);
                    }
                } finally {
                }
            }
        }
        return f32923L;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            q(e10);
            return null;
        } catch (InstantiationException e11) {
            q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            q(e13);
            return null;
        }
    }

    private static o l(Context context) {
        H6.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<B6.b> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new B6.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<B6.b> it = listEmptyList.iterator();
            while (it.hasNext()) {
                B6.b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<B6.b> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<B6.b> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f32923L = bVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Context context) {
        return l(context).d(context);
    }

    public static k u(androidx.fragment.app.o oVar) {
        return l(oVar).e(oVar);
    }

    public void b() {
        H6.l.a();
        this.f32927D.b();
        this.f32926C.b();
        this.f32929F.b();
    }

    public InterfaceC4237b e() {
        return this.f32929F;
    }

    public InterfaceC4239d f() {
        return this.f32926C;
    }

    A6.c g() {
        return this.f32931H;
    }

    public Context h() {
        return this.f32928E.getBaseContext();
    }

    d i() {
        return this.f32928E;
    }

    public Registry j() {
        return this.f32928E.i();
    }

    public o k() {
        return this.f32930G;
    }

    void o(k kVar) {
        synchronized (this.f32932I) {
            try {
                if (this.f32932I.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f32932I.add(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    boolean p(E6.i<?> iVar) {
        synchronized (this.f32932I) {
            try {
                Iterator<k> it = this.f32932I.iterator();
                while (it.hasNext()) {
                    if (it.next().D(iVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i10) {
        H6.l.a();
        synchronized (this.f32932I) {
            try {
                Iterator<k> it = this.f32932I.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32927D.a(i10);
        this.f32926C.a(i10);
        this.f32929F.a(i10);
    }

    void s(k kVar) {
        synchronized (this.f32932I) {
            try {
                if (!this.f32932I.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f32932I.remove(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
