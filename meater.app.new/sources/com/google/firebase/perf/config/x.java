package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v9.C4925a;

/* compiled from: DeviceCacheManager.java */
/* loaded from: classes2.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    private static final C4925a f38496c = C4925a.e();

    /* renamed from: d, reason: collision with root package name */
    private static x f38497d;

    /* renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f38498a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f38499b;

    public x(ExecutorService executorService) {
        this.f38499b = executorService;
    }

    private Context d() {
        try {
            com.google.firebase.f.l();
            return com.google.firebase.f.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized x e() {
        try {
            if (f38497d == null) {
                f38497d = new x(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38497d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        if (this.f38498a != null || context == null) {
            return;
        }
        this.f38498a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public B9.g<Boolean> b(String str) {
        if (str == null) {
            f38496c.a("Key is null when getting boolean value on device cache.");
            return B9.g.a();
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return B9.g.a();
            }
        }
        if (!this.f38498a.contains(str)) {
            return B9.g.a();
        }
        try {
            return B9.g.e(Boolean.valueOf(this.f38498a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f38496c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return B9.g.a();
        }
    }

    public B9.g<Double> c(String str) {
        if (str == null) {
            f38496c.a("Key is null when getting double value on device cache.");
            return B9.g.a();
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return B9.g.a();
            }
        }
        if (!this.f38498a.contains(str)) {
            return B9.g.a();
        }
        try {
            try {
                return B9.g.e(Double.valueOf(Double.longBitsToDouble(this.f38498a.getLong(str, 0L))));
            } catch (ClassCastException e10) {
                f38496c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
                return B9.g.a();
            }
        } catch (ClassCastException unused) {
            return B9.g.e(Double.valueOf(Float.valueOf(this.f38498a.getFloat(str, 0.0f)).doubleValue()));
        }
    }

    public B9.g<Long> f(String str) {
        if (str == null) {
            f38496c.a("Key is null when getting long value on device cache.");
            return B9.g.a();
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return B9.g.a();
            }
        }
        if (!this.f38498a.contains(str)) {
            return B9.g.a();
        }
        try {
            return B9.g.e(Long.valueOf(this.f38498a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f38496c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return B9.g.a();
        }
    }

    public B9.g<String> g(String str) {
        if (str == null) {
            f38496c.a("Key is null when getting String value on device cache.");
            return B9.g.a();
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return B9.g.a();
            }
        }
        if (!this.f38498a.contains(str)) {
            return B9.g.a();
        }
        try {
            return B9.g.e(this.f38498a.getString(str, ""));
        } catch (ClassCastException e10) {
            f38496c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return B9.g.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.f38498a == null && context != null) {
            this.f38499b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38494B.h(context);
                }
            });
        }
    }

    public boolean j(String str, double d10) {
        if (str == null) {
            f38496c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return false;
            }
        }
        this.f38498a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean k(String str, long j10) {
        if (str == null) {
            f38496c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return false;
            }
        }
        this.f38498a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f38496c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f38498a.edit().remove(str).apply();
            return true;
        }
        this.f38498a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z10) {
        if (str == null) {
            f38496c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f38498a == null) {
            i(d());
            if (this.f38498a == null) {
                return false;
            }
        }
        this.f38498a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
