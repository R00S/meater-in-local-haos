package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p024c.p041e.C0873g;

/* compiled from: FragmentFactory.java */
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class C0473i {

    /* renamed from: a */
    private static final C0873g<ClassLoader, C0873g<String, Class<?>>> f3286a = new C0873g<>();

    /* renamed from: b */
    static boolean m3650b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3651c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m3651c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0873g<ClassLoader, C0873g<String, Class<?>>> c0873g = f3286a;
        C0873g<String, Class<?>> c0873g2 = c0873g.get(classLoader);
        if (c0873g2 == null) {
            c0873g2 = new C0873g<>();
            c0873g.put(classLoader, c0873g2);
        }
        Class<?> cls = c0873g2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0873g2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3652d(ClassLoader classLoader, String str) {
        try {
            return m3651c(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    /* renamed from: a */
    public Fragment mo3524a(ClassLoader classLoader, String str) {
        throw null;
    }
}
