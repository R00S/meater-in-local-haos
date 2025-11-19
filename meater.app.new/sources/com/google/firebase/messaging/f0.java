package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import y7.C5133a;
import z7.AbstractC5208j;
import z7.InterfaceC5203e;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes2.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f38389a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f38390b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C5133a f38391c;

    private static void b(Context context) {
        if (f38391c == null) {
            C5133a c5133a = new C5133a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f38391c = c5133a;
            c5133a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f38390b) {
            try {
                if (f38391c != null && d(intent)) {
                    g(intent, false);
                    f38391c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    @SuppressLint({"TaskMainThread"})
    static void f(Context context, k0 k0Var, final Intent intent) {
        synchronized (f38390b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                if (!zD) {
                    f38391c.a(f38389a);
                }
                k0Var.d(intent).c(new InterfaceC5203e() { // from class: com.google.firebase.messaging.e0
                    @Override // z7.InterfaceC5203e
                    public final void a(AbstractC5208j abstractC5208j) {
                        f0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName h(Context context, Intent intent) {
        synchronized (f38390b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f38391c.a(f38389a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
