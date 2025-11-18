package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzbbm {

    /* renamed from: a */
    public static final Executor f22757a;

    /* renamed from: b */
    public static final Executor f22758b;

    /* renamed from: c */
    public static final zzbbl f22759c;

    /* renamed from: d */
    private static final zzbbl f22760d;

    static {
        ExecutorC6663f7 executorC6663f7 = new ExecutorC6663f7();
        f22757a = executorC6663f7;
        ExecutorC6700g7 executorC6700g7 = new ExecutorC6700g7();
        f22758b = executorC6700g7;
        f22759c = m17381a(executorC6663f7);
        f22760d = m17381a(executorC6700g7);
    }

    /* renamed from: a */
    public static zzbbl m17381a(Executor executor) {
        return new C6737h7(executor, null);
    }
}
