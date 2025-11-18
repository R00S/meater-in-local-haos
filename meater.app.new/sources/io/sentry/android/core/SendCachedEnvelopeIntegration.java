package io.sentry.android.core;

import io.sentry.C9471i2;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9627u3;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9679x3;
import io.sentry.util.C9644o;
import io.sentry.util.C9646q;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class SendCachedEnvelopeIntegration implements Integration {

    /* renamed from: f */
    private final InterfaceC9679x3 f35831f;

    /* renamed from: g */
    private final C9644o<Boolean> f35832g;

    public SendCachedEnvelopeIntegration(InterfaceC9679x3 interfaceC9679x3, C9644o<Boolean> c9644o) {
        this.f35831f = (InterfaceC9679x3) C9646q.m31802c(interfaceC9679x3, "SendFireAndForgetFactory is required");
        this.f35832g = c9644o;
    }

    /* renamed from: b */
    static /* synthetic */ void m30137b(InterfaceC9627u3 interfaceC9627u3, SentryAndroidOptions sentryAndroidOptions) {
        try {
            interfaceC9627u3.mo31571a();
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed trying to send cached events.", th);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        C9646q.m31802c(interfaceC9658v1, "Hub is required");
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        if (!this.f35831f.mo31942c(c9680x4.getCacheDirPath(), c9680x4.getLogger())) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final InterfaceC9627u3 interfaceC9627u3Mo31941b = this.f35831f.mo31941b(interfaceC9658v1, sentryAndroidOptions);
        if (interfaceC9627u3Mo31941b == null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    SendCachedEnvelopeIntegration.m30137b(interfaceC9627u3Mo31941b, sentryAndroidOptions);
                }
            });
            if (this.f35832g.m31798a().booleanValue()) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (RejectedExecutionException e2) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e2);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }
}
