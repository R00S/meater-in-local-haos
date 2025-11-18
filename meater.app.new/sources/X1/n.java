package X1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: Log.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static int f18679b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f18680c = true;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f18678a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static a f18681d = a.f18682a;

    /* compiled from: Log.java */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18682a = new C0272a();

        /* compiled from: Log.java */
        /* renamed from: X1.n$a$a, reason: collision with other inner class name */
        class C0272a implements a {
            C0272a() {
            }

            @Override // X1.n.a
            public void a(String str, String str2, Throwable th) {
                Log.w(str, n.a(str2, th));
            }

            @Override // X1.n.a
            public void b(String str, String str2, Throwable th) {
                Log.e(str, n.a(str2, th));
            }

            @Override // X1.n.a
            public void c(String str, String str2, Throwable th) {
                Log.d(str, n.a(str2, th));
            }

            @Override // X1.n.a
            public void d(String str, String str2, Throwable th) {
                Log.i(str, n.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f18678a) {
            try {
                if (f18679b == 0) {
                    f18681d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f18678a) {
            try {
                if (f18679b <= 3) {
                    f18681d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f18678a) {
            try {
                if (f18679b <= 3) {
                    f18681d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f18678a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f18680c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f18678a) {
            try {
                if (f18679b <= 1) {
                    f18681d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f18678a) {
            try {
                if (f18679b <= 2) {
                    f18681d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f18678a) {
            try {
                if (f18679b <= 2) {
                    f18681d.a(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
