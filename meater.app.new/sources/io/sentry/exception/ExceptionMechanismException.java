package io.sentry.exception;

import io.sentry.protocol.C9550i;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ExceptionMechanismException extends RuntimeException {

    /* renamed from: f */
    private final C9550i f36311f;

    /* renamed from: g */
    private final Throwable f36312g;

    /* renamed from: h */
    private final Thread f36313h;

    /* renamed from: i */
    private final boolean f36314i;

    public ExceptionMechanismException(C9550i c9550i, Throwable th, Thread thread, boolean z) {
        this.f36311f = (C9550i) C9646q.m31802c(c9550i, "Mechanism is required.");
        this.f36312g = (Throwable) C9646q.m31802c(th, "Throwable is required.");
        this.f36313h = (Thread) C9646q.m31802c(thread, "Thread is required.");
        this.f36314i = z;
    }

    /* renamed from: a */
    public C9550i m30779a() {
        return this.f36311f;
    }

    /* renamed from: b */
    public Thread m30780b() {
        return this.f36313h;
    }

    /* renamed from: c */
    public Throwable m30781c() {
        return this.f36312g;
    }

    /* renamed from: d */
    public boolean m30782d() {
        return this.f36314i;
    }

    public ExceptionMechanismException(C9550i c9550i, Throwable th, Thread thread) {
        this(c9550i, th, thread, false);
    }
}
