package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.java */
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public class C0529y {

    /* renamed from: a */
    private final b f3516a;

    /* renamed from: b */
    private final C0530z f3517b;

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.y$a */
    public static class a extends d {

        /* renamed from: b */
        private static a f3518b;

        /* renamed from: c */
        private Application f3519c;

        public a(Application application) {
            this.f3519c = application;
        }

        /* renamed from: c */
        public static a m3917c(Application application) {
            if (f3518b == null) {
                f3518b = new a(application);
            }
            return f3518b;
        }

        @Override // androidx.lifecycle.C0529y.d, androidx.lifecycle.C0529y.b
        /* renamed from: a */
        public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
            if (!C0500a.class.isAssignableFrom(cls)) {
                return (T) super.mo3685a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f3519c);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.y$b */
    public interface b {
        /* renamed from: a */
        <T extends AbstractC0528x> T mo3685a(Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.y$c */
    static abstract class c extends e implements b {
        c() {
        }

        /* renamed from: a */
        public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC0528x> T mo3904c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.y$d */
    public static class d implements b {

        /* renamed from: a */
        private static d f3520a;

        /* renamed from: b */
        static d m3918b() {
            if (f3520a == null) {
                f3520a = new d();
            }
            return f3520a;
        }

        @Override // androidx.lifecycle.C0529y.b
        /* renamed from: a */
        public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* compiled from: ViewModelProvider.java */
    /* renamed from: androidx.lifecycle.y$e */
    static class e {
        e() {
        }

        /* renamed from: b */
        void mo3903b(AbstractC0528x abstractC0528x) {
        }
    }

    public C0529y(C0530z c0530z, b bVar) {
        this.f3516a = bVar;
        this.f3517b = c0530z;
    }

    /* renamed from: a */
    public <T extends AbstractC0528x> T m3915a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m3916b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* renamed from: b */
    public <T extends AbstractC0528x> T m3916b(String str, Class<T> cls) {
        T t = (T) this.f3517b.m3920b(str);
        if (cls.isInstance(t)) {
            Object obj = this.f3516a;
            if (obj instanceof e) {
                ((e) obj).mo3903b(t);
            }
            return t;
        }
        b bVar = this.f3516a;
        T t2 = bVar instanceof c ? (T) ((c) bVar).mo3904c(str, cls) : (T) bVar.mo3685a(cls);
        this.f3517b.m3922d(str, t2);
        return t2;
    }
}
