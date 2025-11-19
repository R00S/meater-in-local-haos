package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
final class a0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference<a0> f38348d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38349a;

    /* renamed from: b, reason: collision with root package name */
    private W f38350b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f38351c;

    private a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f38351c = executor;
        this.f38349a = sharedPreferences;
    }

    public static synchronized a0 a(Context context, Executor executor) {
        a0 a0Var;
        try {
            WeakReference<a0> weakReference = f38348d;
            a0Var = weakReference != null ? weakReference.get() : null;
            if (a0Var == null) {
                a0Var = new a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                a0Var.c();
                f38348d = new WeakReference<>(a0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a0Var;
    }

    private synchronized void c() {
        this.f38350b = W.c(this.f38349a, "topic_operation_queue", ",", this.f38351c);
    }

    synchronized Z b() {
        return Z.a(this.f38350b.e());
    }

    synchronized boolean d(Z z10) {
        return this.f38350b.f(z10.e());
    }
}
