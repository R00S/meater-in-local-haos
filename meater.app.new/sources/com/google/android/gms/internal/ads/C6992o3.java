package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.o3 */
/* loaded from: classes2.dex */
final class C6992o3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f20132f;

    /* renamed from: g */
    private final /* synthetic */ zzaqx f20133g;

    C6992o3(zzaqx zzaqxVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f20133g = zzaqxVar;
        this.f20132f = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f20133g.m16886d(thread, th);
            } catch (Throwable unused) {
                zzbad.m17351g("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20132f;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f20132f;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
