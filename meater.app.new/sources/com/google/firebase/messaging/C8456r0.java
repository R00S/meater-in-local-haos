package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.r0 */
/* loaded from: classes2.dex */
final class C8456r0 {

    /* renamed from: a */
    private static WeakReference<C8456r0> f32044a;

    /* renamed from: b */
    private final SharedPreferences f32045b;

    /* renamed from: c */
    private C8448n0 f32046c;

    /* renamed from: d */
    private final Executor f32047d;

    private C8456r0(SharedPreferences sharedPreferences, Executor executor) {
        this.f32047d = executor;
        this.f32045b = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C8456r0 m26630a(Context context, Executor executor) {
        WeakReference<C8456r0> weakReference = f32044a;
        C8456r0 c8456r0 = weakReference != null ? weakReference.get() : null;
        if (c8456r0 != null) {
            return c8456r0;
        }
        C8456r0 c8456r02 = new C8456r0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        c8456r02.m26631c();
        f32044a = new WeakReference<>(c8456r02);
        return c8456r02;
    }

    /* renamed from: c */
    private synchronized void m26631c() {
        this.f32046c = C8448n0.m26587c(this.f32045b, "topic_operation_queue", ",", this.f32047d);
    }

    /* renamed from: b */
    synchronized C8454q0 m26632b() {
        return C8454q0.m26625a(this.f32046c.m26592e());
    }

    /* renamed from: d */
    synchronized boolean m26633d(C8454q0 c8454q0) {
        return this.f32046c.m26593f(c8454q0.m26629e());
    }
}
