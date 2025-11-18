package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import i1.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* renamed from: j1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3726k extends C3730o {

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f43462b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor<?> f43463c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f43464d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f43465e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f43466f = false;

    C3726k() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        j();
        try {
            return ((Boolean) f43464d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        j();
        try {
            Object objNewInstance = Array.newInstance(f43462b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f43465e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f43466f) {
            return;
        }
        f43466f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f43463c = constructor;
        f43462b = cls;
        f43464d = method2;
        f43465e = method;
    }

    private static Object k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        j();
        try {
            return f43463c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // j1.C3730o
    public Typeface a(Context context, e.c cVar, Resources resources, int i10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objK = k();
        for (e.d dVar : cVar.a()) {
            File fileD = p.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!p.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!h(objK, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return i(objK);
    }
}
