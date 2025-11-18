package com.google.firebase.iid;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes2.dex */
class C8354b {

    /* renamed from: a */
    private static final Executor f31719a = ExecutorC8353a.f31718f;

    /* renamed from: a */
    static Executor m26200a() {
        return f31719a;
    }

    /* renamed from: b */
    static ExecutorService m26201b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
