package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.p003d.C0263f;
import java.io.File;

/* compiled from: ContextCompat.java */
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0255a {

    /* renamed from: a */
    private static final Object f2190a = new Object();

    /* renamed from: b */
    private static final Object f2191b = new Object();

    /* renamed from: c */
    private static TypedValue f2192c;

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$a */
    static class a {
        /* renamed from: a */
        static void m1684a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m1685b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$b */
    static class b {
        /* renamed from: a */
        static File[] m1686a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m1687b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m1688c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$c */
    static class c {
        /* renamed from: a */
        static File m1689a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m1690b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        /* renamed from: c */
        static File m1691c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$d */
    static class d {
        /* renamed from: a */
        static int m1692a(Context context, int i2) {
            return context.getColor(i2);
        }

        /* renamed from: b */
        static ColorStateList m1693b(Context context, int i2) {
            return context.getColorStateList(i2);
        }

        /* renamed from: c */
        static <T> T m1694c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m1695d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$e */
    static class e {
        /* renamed from: a */
        static Context m1696a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m1697b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m1698c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* renamed from: androidx.core.content.a$f */
    static class f {
        /* renamed from: a */
        static ComponentName m1699a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public static int m1672a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static Context m1673b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.m1696a(context);
        }
        return null;
    }

    /* renamed from: c */
    private static File m1674c(File file) {
        synchronized (f2191b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    /* renamed from: d */
    public static int m1675d(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? d.m1692a(context, i2) : context.getResources().getColor(i2);
    }

    /* renamed from: e */
    public static ColorStateList m1676e(Context context, int i2) {
        return C0263f.m1750c(context.getResources(), i2, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m1677f(Context context, int i2) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            return c.m1690b(context, i2);
        }
        if (i4 >= 16) {
            return context.getResources().getDrawable(i2);
        }
        synchronized (f2190a) {
            if (f2192c == null) {
                f2192c = new TypedValue();
            }
            context.getResources().getValue(i2, f2192c, true);
            i3 = f2192c.resourceId;
        }
        return context.getResources().getDrawable(i3);
    }

    /* renamed from: g */
    public static File[] m1678g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? b.m1686a(context) : new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: h */
    public static File[] m1679h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? b.m1687b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: i */
    public static File m1680i(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? c.m1691c(context) : m1674c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: j */
    public static boolean m1681j(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.m1684a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: k */
    public static void m1682k(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.m1685b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: l */
    public static void m1683l(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.m1699a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
