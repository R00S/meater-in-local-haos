package io.sentry.android.core;

import io.sentry.util.C9646q;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: f */
    private final Thread f35794f;

    ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) C9646q.m31802c(thread, "Thread must be provided.");
        this.f35794f = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    /* renamed from: a */
    public Thread m30117a() {
        return this.f35794f;
    }
}
