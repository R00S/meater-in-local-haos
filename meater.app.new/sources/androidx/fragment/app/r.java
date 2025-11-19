package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import s.X;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final X<ClassLoader, X<String, Class<?>>> f25716a = new X<>();

    static boolean d(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(e(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> e(ClassLoader classLoader, String str) throws ClassNotFoundException {
        X<ClassLoader, X<String, Class<?>>> x10 = f25716a;
        X<String, Class<?>> x11 = x10.get(classLoader);
        if (x11 == null) {
            x11 = new X<>();
            x10.put(classLoader, x11);
        }
        Class<?> cls = x11.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        x11.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> f(ClassLoader classLoader, String str) {
        try {
            return e(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public Fragment c(ClassLoader classLoader, String str) {
        try {
            return f(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
