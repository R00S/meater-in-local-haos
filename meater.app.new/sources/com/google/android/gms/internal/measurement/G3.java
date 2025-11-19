package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class G3 implements InterfaceC2515k3 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, G3> f33746g = new C4391a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f33747a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f33748b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f33749c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33750d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map<String, ?> f33751e;

    /* renamed from: f, reason: collision with root package name */
    private final List<InterfaceC2499i3> f33752f;

    private G3(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.J3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                G3.e(this.f33792a, sharedPreferences2, str);
            }
        };
        this.f33749c = onSharedPreferenceChangeListener;
        this.f33750d = new Object();
        this.f33752f = new ArrayList();
        this.f33747a = sharedPreferences;
        this.f33748b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferencesA = C2631z0.a(context, str, 0, C2599v0.f34403a);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferencesA;
            }
            if (C2475f3.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferencesA2 = C2631z0.a(context, str.substring(12), 0, C2599v0.f34403a);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferencesA2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    static G3 b(Context context, String str, Runnable runnable) {
        G3 g32;
        if (!((!C2475f3.a() || str.startsWith("direct_boot:")) ? true : C2475f3.c(context))) {
            return null;
        }
        synchronized (G3.class) {
            try {
                Map<String, G3> map = f33746g;
                g32 = map.get(str);
                if (g32 == null) {
                    g32 = new G3(a(context, str), runnable);
                    map.put(str, g32);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g32;
    }

    static synchronized void d() {
        try {
            for (G3 g32 : f33746g.values()) {
                g32.f33747a.unregisterOnSharedPreferenceChangeListener(g32.f33749c);
            }
            f33746g.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void e(G3 g32, SharedPreferences sharedPreferences, String str) {
        synchronized (g32.f33750d) {
            g32.f33751e = null;
            g32.f33748b.run();
        }
        synchronized (g32) {
            try {
                Iterator<InterfaceC2499i3> it = g32.f33752f.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2515k3
    public final Object c(String str) {
        Map<String, ?> map = this.f33751e;
        if (map == null) {
            synchronized (this.f33750d) {
                try {
                    map = this.f33751e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f33747a.getAll();
                            this.f33751e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
