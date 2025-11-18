package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes2.dex */
final class C8464v0 {

    /* renamed from: a */
    private static final long f32080a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f32081b = new Object();

    /* renamed from: c */
    private static WakeLock f32082c;

    /* renamed from: a */
    private static void m26661a(Context context) {
        if (f32082c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f32082c = wakeLock;
            wakeLock.m23633c(true);
        }
    }

    /* renamed from: b */
    static void m26662b(Intent intent) {
        synchronized (f32081b) {
            if (f32082c != null && m26663c(intent)) {
                m26664d(intent, false);
                f32082c.m23632b();
            }
        }
    }

    /* renamed from: c */
    static boolean m26663c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m26664d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: e */
    static ComponentName m26665e(Context context, Intent intent) {
        synchronized (f32081b) {
            m26661a(context);
            boolean zM26663c = m26663c(intent);
            m26664d(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zM26663c) {
                f32082c.m23631a(f32080a);
            }
            return componentNameStartService;
        }
    }
}
