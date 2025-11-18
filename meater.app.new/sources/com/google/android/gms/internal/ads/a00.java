package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class a00 implements Executor {

    /* renamed from: f */
    private final /* synthetic */ Handler f18065f;

    a00(zzi zziVar, Handler handler) {
        this.f18065f = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18065f.post(runnable);
    }
}
