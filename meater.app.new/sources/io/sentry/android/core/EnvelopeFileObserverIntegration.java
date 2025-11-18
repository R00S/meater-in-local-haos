package io.sentry.android.core;

import io.sentry.C9471i2;
import io.sentry.C9491j3;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9646q;
import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {

    /* renamed from: f */
    private FileObserverC9356y0 f35796f;

    /* renamed from: g */
    private InterfaceC9670w1 f35797g;

    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        /* renamed from: e */
        protected String mo30121e(C9680x4 c9680x4) {
            return c9680x4.getOutboxPath();
        }
    }

    /* renamed from: b */
    public static EnvelopeFileObserverIntegration m30120b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        C9646q.m31802c(interfaceC9658v1, "Hub is required");
        C9646q.m31802c(c9680x4, "SentryOptions is required");
        this.f35797g = c9680x4.getLogger();
        String strMo30121e = mo30121e(c9680x4);
        if (strMo30121e == null) {
            this.f35797g.mo30214c(EnumC9587s4.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        InterfaceC9670w1 interfaceC9670w1 = this.f35797g;
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        interfaceC9670w1.mo30214c(enumC9587s4, "Registering EnvelopeFileObserverIntegration for path: %s", strMo30121e);
        FileObserverC9356y0 fileObserverC9356y0 = new FileObserverC9356y0(strMo30121e, new C9491j3(interfaceC9658v1, c9680x4.getEnvelopeReader(), c9680x4.getSerializer(), this.f35797g, c9680x4.getFlushTimeoutMillis()), this.f35797g, c9680x4.getFlushTimeoutMillis());
        this.f35796f = fileObserverC9356y0;
        try {
            fileObserverC9356y0.startWatching();
            this.f35797g.mo30214c(enumC9587s4, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            c9680x4.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileObserverC9356y0 fileObserverC9356y0 = this.f35796f;
        if (fileObserverC9356y0 != null) {
            fileObserverC9356y0.stopWatching();
            InterfaceC9670w1 interfaceC9670w1 = this.f35797g;
            if (interfaceC9670w1 != null) {
                interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    /* renamed from: e */
    abstract String mo30121e(C9680x4 c9680x4);
}
