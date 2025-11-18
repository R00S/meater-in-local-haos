package cm.aptoide.p092pt.logger;

import android.util.Log;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Logger {
    private static boolean DBG;
    private static Logger instance;

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void setDBG(boolean z) {
        DBG = z;
    }

    /* renamed from: d */
    public void m8272d(Object obj, String str) {
        m8273d(obj.getClass().getSimpleName(), str);
    }

    /* renamed from: e */
    public void m8275e(Object obj, String str) {
        m8277e(obj.getClass().getName(), str);
    }

    /* renamed from: i */
    public void m8281i(Object obj, String str) {
        m8282i(obj.getClass().getSimpleName(), str);
    }

    /* renamed from: v */
    public void m8283v(String str, String str2) {
        if (!DBG || str2 == null) {
            return;
        }
        Log.v(str, str2);
    }

    /* renamed from: w */
    public void m8285w(String str, String str2) {
        if (str2 != null) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public void m8286w(String str, String str2, Throwable th) {
        if (str2 != null) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: v */
    public void m8284v(String str, String str2, Throwable th) {
        if (!DBG || str2 == null) {
            return;
        }
        Log.v(str, str2, th);
    }

    /* renamed from: d */
    public void m8273d(String str, String str2) {
        if (!DBG || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: e */
    public void m8277e(String str, String str2) {
        if (str2 != null) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public void m8282i(String str, String str2) {
        if (!DBG || str2 == null) {
            return;
        }
        Log.i(str, str2);
    }

    /* renamed from: e */
    public void m8276e(Object obj, Throwable th) {
        m8279e(obj.getClass().getName(), th);
    }

    /* renamed from: d */
    public void m8274d(String str, String str2, Throwable th) {
        if (!DBG || str2 == null) {
            return;
        }
        Log.d(str, str2, th);
    }

    /* renamed from: i */
    public void m8280i(Class cls, String str) {
        m8282i(cls.getSimpleName(), str);
    }

    /* renamed from: e */
    public void m8279e(String str, Throwable th) {
        Log.e(str, HttpUrl.FRAGMENT_ENCODE_SET, th);
    }

    /* renamed from: e */
    public void m8278e(String str, String str2, Throwable th) {
        if (str2 != null) {
            Log.e(str, str2, th);
        }
    }
}
