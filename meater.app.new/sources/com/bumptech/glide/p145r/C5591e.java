package com.bumptech.glide.p145r;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* renamed from: com.bumptech.glide.r.e */
/* loaded from: classes.dex */
public final class C5591e {

    /* renamed from: a */
    private static final Executor f14034a = new a();

    /* renamed from: b */
    private static final Executor f14035b = new b();

    /* compiled from: Executors.java */
    /* renamed from: com.bumptech.glide.r.e$a */
    class a implements Executor {

        /* renamed from: f */
        private final Handler f14036f = new Handler(Looper.getMainLooper());

        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f14036f.post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* renamed from: com.bumptech.glide.r.e$b */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m11025a() {
        return f14035b;
    }

    /* renamed from: b */
    public static Executor m11026b() {
        return f14034a;
    }
}
