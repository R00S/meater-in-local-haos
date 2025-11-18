package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C9471i2;
import io.sentry.C9506l4;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.C9275e0;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.C9451a;
import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9467q;
import io.sentry.protocol.C9550i;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AnrIntegration implements Integration, Closeable {

    /* renamed from: f */
    @SuppressLint({"StaticFieldLeak"})
    private static C9275e0 f35769f;

    /* renamed from: g */
    private static final Object f35770g = new Object();

    /* renamed from: h */
    private final Context f35771h;

    /* renamed from: i */
    private C9680x4 f35772i;

    /* renamed from: io.sentry.android.core.AnrIntegration$a */
    static final class C9249a implements InterfaceC9452b, InterfaceC9467q {

        /* renamed from: a */
        private final boolean f35773a;

        C9249a(boolean z) {
            this.f35773a = z;
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: c */
        public /* synthetic */ Long mo30102c() {
            return C9451a.m30835b(this);
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: d */
        public boolean mo30103d() {
            return true;
        }

        @Override // io.sentry.hints.InterfaceC9452b
        /* renamed from: f */
        public String mo30104f() {
            return this.f35773a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f35771h = context;
    }

    /* renamed from: b */
    private Throwable m30097b(boolean z, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.m30117a());
        C9550i c9550i = new C9550i();
        c9550i.m31372j("ANR");
        return new ExceptionMechanismException(c9550i, applicationNotResponding2, applicationNotResponding2.m30117a(), true);
    }

    /* renamed from: j */
    private void m30099j(final InterfaceC9658v1 interfaceC9658v1, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC9670w1 logger = sentryAndroidOptions.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f35770g) {
                if (f35769f == null) {
                    sentryAndroidOptions.getLogger().mo30214c(enumC9587s4, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C9275e0 c9275e0 = new C9275e0(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C9275e0.a() { // from class: io.sentry.android.core.v
                        @Override // io.sentry.android.core.C9275e0.a
                        /* renamed from: a */
                        public final void mo30178a(ApplicationNotResponding applicationNotResponding) {
                            this.f36107a.m30100f(interfaceC9658v1, sentryAndroidOptions, applicationNotResponding);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f35771h);
                    f35769f = c9275e0;
                    c9275e0.start();
                    sentryAndroidOptions.getLogger().mo30214c(enumC9587s4, "AnrIntegration installed.", new Object[0]);
                    mo30003a();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        this.f35772i = (C9680x4) C9646q.m31802c(c9680x4, "SentryOptions is required");
        m30099j(interfaceC9658v1, (SentryAndroidOptions) c9680x4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (f35770g) {
            C9275e0 c9275e0 = f35769f;
            if (c9275e0 != null) {
                c9275e0.interrupt();
                f35769f = null;
                C9680x4 c9680x4 = this.f35772i;
                if (c9680x4 != null) {
                    c9680x4.getLogger().mo30214c(EnumC9587s4.DEBUG, "AnrIntegration removed.", new Object[0]);
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m30100f(InterfaceC9658v1 interfaceC9658v1, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(C9342r0.m30399a().m30400b());
        C9506l4 c9506l4 = new C9506l4(m30097b(zEquals, sentryAndroidOptions, applicationNotResponding));
        c9506l4.m31011z0(EnumC9587s4.ERROR);
        interfaceC9658v1.mo31159t(c9506l4, C9642m.m31778a(new C9249a(zEquals)));
    }
}
