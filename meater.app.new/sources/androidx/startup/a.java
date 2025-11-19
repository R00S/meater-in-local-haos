package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x3.C5054b;
import x3.InterfaceC5053a;
import y3.C5123a;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f29322d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f29323e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f29326c;

    /* renamed from: b, reason: collision with root package name */
    final Set<Class<? extends InterfaceC5053a<?>>> f29325b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f29324a = new HashMap();

    a(Context context) {
        this.f29326c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends InterfaceC5053a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (C5123a.d()) {
            try {
                C5123a.a(cls.getSimpleName());
            } catch (Throwable th) {
                C5123a.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f29324a.containsKey(cls)) {
            t10 = (T) this.f29324a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC5053a<?> interfaceC5053aNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC5053a<?>>> listA = interfaceC5053aNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends InterfaceC5053a<?>> cls2 : listA) {
                        if (!this.f29324a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) interfaceC5053aNewInstance.b(this.f29326c);
                set.remove(cls);
                this.f29324a.put(cls, t10);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        C5123a.b();
        return t10;
    }

    public static a e(Context context) {
        if (f29322d == null) {
            synchronized (f29323e) {
                try {
                    if (f29322d == null) {
                        f29322d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f29322d;
    }

    void a() {
        try {
            try {
                C5123a.a("Startup");
                b(this.f29326c.getPackageManager().getProviderInfo(new ComponentName(this.f29326c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            C5123a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f29326c.getString(C5054b.f52597a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC5053a.class.isAssignableFrom(cls)) {
                            this.f29325b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC5053a<?>>> it = this.f29325b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    <T> T c(Class<? extends InterfaceC5053a<?>> cls) {
        T t10;
        synchronized (f29323e) {
            try {
                t10 = (T) this.f29324a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends InterfaceC5053a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends InterfaceC5053a<?>> cls) {
        return this.f29325b.contains(cls);
    }
}
