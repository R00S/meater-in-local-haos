package io.sentry;

import java.lang.Thread;

/* compiled from: UncaughtExceptionHandler.java */
/* renamed from: io.sentry.v5 */
/* loaded from: classes2.dex */
interface InterfaceC9662v5 {

    /* compiled from: UncaughtExceptionHandler.java */
    /* renamed from: io.sentry.v5$a */
    public static final class a implements InterfaceC9662v5 {

        /* renamed from: a */
        private static final a f36951a = new a();

        private a() {
        }

        /* renamed from: c */
        static InterfaceC9662v5 m31850c() {
            return f36951a;
        }

        @Override // io.sentry.InterfaceC9662v5
        /* renamed from: a */
        public void mo31848a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.InterfaceC9662v5
        /* renamed from: b */
        public Thread.UncaughtExceptionHandler mo31849b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    /* renamed from: a */
    void mo31848a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    /* renamed from: b */
    Thread.UncaughtExceptionHandler mo31849b();
}
