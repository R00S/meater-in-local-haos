package io.sentry.android.core;

import android.app.Activity;
import io.sentry.C9471i2;
import io.sentry.C9489j1;
import io.sentry.C9506l4;
import io.sentry.C9517n1;
import io.sentry.C9583s0;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9490j2;
import io.sentry.InterfaceC9496k1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C9310g;
import io.sentry.android.core.internal.util.C9317n;
import io.sentry.android.core.internal.util.C9322s;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements InterfaceC9496k1, InterfaceC9490j2 {

    /* renamed from: f */
    private final SentryAndroidOptions f35828f;

    /* renamed from: g */
    private final C9344s0 f35829g;

    /* renamed from: h */
    private final C9317n f35830h = new C9317n(C9310g.m30272b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0) {
        this.f35828f = (SentryAndroidOptions) C9646q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f35829g = (C9344s0) C9646q.m31802c(c9344s0, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            mo30003a();
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        if (!c9506l4.m31008w0()) {
            return c9506l4;
        }
        if (!this.f35828f.isAttachScreenshot()) {
            this.f35828f.getLogger().mo30214c(EnumC9587s4.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c9506l4;
        }
        Activity activityM30429b = C9348u0.m30427c().m30429b();
        if (activityM30429b != null && !C9642m.m31782e(c9517n1)) {
            boolean zM30291a = this.f35830h.m30291a();
            SentryAndroidOptions.InterfaceC9258a beforeScreenshotCaptureCallback = this.f35828f.getBeforeScreenshotCaptureCallback();
            if (beforeScreenshotCaptureCallback != null) {
                if (!beforeScreenshotCaptureCallback.m30138a(c9506l4, c9517n1, zM30291a)) {
                    return c9506l4;
                }
            } else if (zM30291a) {
                return c9506l4;
            }
            byte[] bArrM30307d = C9322s.m30307d(activityM30429b, this.f35828f.getMainThreadChecker(), this.f35828f.getLogger(), this.f35829g);
            if (bArrM30307d == null) {
                return c9506l4;
            }
            c9517n1.m31080k(C9583s0.m31572a(bArrM30307d));
            c9517n1.m31079j("android:activity", activityM30429b);
        }
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public /* synthetic */ C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return C9489j1.m30876a(this, c9565x, c9517n1);
    }
}
