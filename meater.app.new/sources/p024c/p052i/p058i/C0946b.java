package p024c.p052i.p058i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat.java */
/* renamed from: c.i.i.b */
/* loaded from: classes.dex */
public final class C0946b {

    /* renamed from: a */
    private static Method f6377a;

    /* renamed from: b */
    private static Method f6378b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (i2 < 24) {
                try {
                    f6378b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f6377a = cls.getMethod("getScript", String.class);
            f6378b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e3) {
            f6377a = null;
            f6378b = null;
            Log.w("ICUCompat", e3);
        }
    }

    /* renamed from: a */
    private static String m6032a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f6378b;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return string;
    }

    /* renamed from: b */
    private static String m6033b(String str) {
        try {
            Method method = f6377a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return null;
    }

    /* renamed from: c */
    public static String m6034c(Locale locale) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i2 < 21) {
            String strM6032a = m6032a(locale);
            if (strM6032a != null) {
                return m6033b(strM6032a);
            }
            return null;
        }
        try {
            return ((Locale) f6378b.invoke(null, locale)).getScript();
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
            return locale.getScript();
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
            return locale.getScript();
        }
    }
}
