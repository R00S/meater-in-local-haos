package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* compiled from: LayoutInflaterCompat.java */
/* renamed from: androidx.core.view.f */
/* loaded from: classes.dex */
public final class C0296f {

    /* renamed from: a */
    private static Field f2389a;

    /* renamed from: b */
    private static boolean f2390b;

    /* renamed from: a */
    private static void m2042a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f2390b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2389a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e2);
            }
            f2390b = true;
        }
        Field field = f2389a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    /* renamed from: b */
    public static void m2043b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m2042a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m2042a(layoutInflater, factory2);
            }
        }
    }
}
