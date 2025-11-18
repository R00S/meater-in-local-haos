package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
class C0074k {

    /* renamed from: a */
    private static Field f380a;

    /* renamed from: b */
    private static boolean f381b;

    /* renamed from: c */
    private static Class<?> f382c;

    /* renamed from: d */
    private static boolean f383d;

    /* renamed from: e */
    private static Field f384e;

    /* renamed from: f */
    private static boolean f385f;

    /* renamed from: g */
    private static Field f386g;

    /* renamed from: h */
    private static boolean f387h;

    /* renamed from: a */
    static void m413a(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        if (i2 >= 24) {
            m416d(resources);
        } else if (i2 >= 23) {
            m415c(resources);
        } else if (i2 >= 21) {
            m414b(resources);
        }
    }

    /* renamed from: b */
    private static void m414b(Resources resources) throws NoSuchFieldException {
        if (!f381b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f380a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f381b = true;
        }
        Field field = f380a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m415c(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f381b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f380a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f381b = true;
        }
        Object obj = null;
        Field field = f380a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        m417e(obj);
    }

    /* renamed from: d */
    private static void m416d(Resources resources) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object obj;
        if (!f387h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f386g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f387h = true;
        }
        Field field = f386g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f381b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f380a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f381b = true;
        }
        Field field2 = f380a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 != null) {
            m417e(obj2);
        }
    }

    /* renamed from: e */
    private static void m417e(Object obj) throws NoSuchFieldException {
        if (!f383d) {
            try {
                f382c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f383d = true;
        }
        Class<?> cls = f382c;
        if (cls == null) {
            return;
        }
        if (!f385f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f384e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f385f = true;
        }
        Field field = f384e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
