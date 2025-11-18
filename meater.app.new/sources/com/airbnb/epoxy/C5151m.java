package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: EpoxyAsyncUtil.java */
/* renamed from: com.airbnb.epoxy.m */
/* loaded from: classes.dex */
public final class C5151m {

    /* renamed from: a */
    public static final Handler f12248a = m9309b(Looper.getMainLooper(), false);

    /* renamed from: b */
    public static final Handler f12249b = m9309b(Looper.getMainLooper(), true);

    /* renamed from: c */
    private static Handler f12250c;

    /* renamed from: a */
    public static Looper m9308a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    /* renamed from: b */
    public static Handler m9309b(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return Handler.createAsync(looper);
        }
        if (i2 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (Throwable unused) {
            }
        }
        return new Handler(looper);
    }

    /* renamed from: c */
    public static Handler m9310c() {
        if (f12250c == null) {
            f12250c = m9309b(m9308a("epoxy"), true);
        }
        return f12250c;
    }
}
