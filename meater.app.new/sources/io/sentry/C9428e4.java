package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryCrashLastRunState.java */
@ApiStatus.Internal
/* renamed from: io.sentry.e4 */
/* loaded from: classes2.dex */
public final class C9428e4 {

    /* renamed from: a */
    private static final C9428e4 f36297a = new C9428e4();

    /* renamed from: b */
    private boolean f36298b;

    /* renamed from: c */
    private Boolean f36299c;

    /* renamed from: d */
    private final Object f36300d = new Object();

    private C9428e4() {
    }

    /* renamed from: a */
    public static C9428e4 m30762a() {
        return f36297a;
    }

    /* renamed from: b */
    public void m30763b(boolean z) {
        synchronized (this.f36300d) {
            if (!this.f36298b) {
                this.f36299c = Boolean.valueOf(z);
                this.f36298b = true;
            }
        }
    }
}
