package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C9471i2;
import io.sentry.C9517n1;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9318o;
import io.sentry.protocol.C9546e;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {

    /* renamed from: f */
    private final Context f35788f;

    /* renamed from: g */
    private InterfaceC9658v1 f35789g;

    /* renamed from: h */
    private SentryAndroidOptions f35790h;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f35788f = (Context) C9646q.m31802c(context, "Context is required");
    }

    /* renamed from: b */
    private void m30110b(Integer num) {
        if (this.f35789g != null) {
            C9657v0 c9657v0 = new C9657v0();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c9657v0.m31841m("level", num);
                }
            }
            c9657v0.m31844p("system");
            c9657v0.m31840l("device.event");
            c9657v0.m31843o("Low memory");
            c9657v0.m31841m("action", "LOW_MEMORY");
            c9657v0.m31842n(EnumC9587s4.WARNING);
            this.f35789g.mo31148i(c9657v0);
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
        this.f35789g = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35790h = sentryAndroidOptions;
        InterfaceC9670w1 logger = sentryAndroidOptions.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f35790h.isEnableAppComponentBreadcrumbs()));
        if (this.f35790h.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f35788f.registerComponentCallbacks(this);
                c9680x4.getLogger().mo30214c(enumC9587s4, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } catch (Throwable th) {
                this.f35790h.setEnableAppComponentBreadcrumbs(false);
                c9680x4.getLogger().mo30212a(EnumC9587s4.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f35788f.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f35790h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30212a(EnumC9587s4.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f35790h;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo30214c(EnumC9587s4.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f35789g != null) {
            C9546e.b bVarM30292a = C9318o.m30292a(this.f35788f.getResources().getConfiguration().orientation);
            String lowerCase = bVarM30292a != null ? bVarM30292a.name().toLowerCase(Locale.ROOT) : "undefined";
            C9657v0 c9657v0 = new C9657v0();
            c9657v0.m31844p("navigation");
            c9657v0.m31840l("device.orientation");
            c9657v0.m31841m("position", lowerCase);
            c9657v0.m31842n(EnumC9587s4.INFO);
            C9517n1 c9517n1 = new C9517n1();
            c9517n1.m31079j("android:configuration", configuration);
            this.f35789g.mo31153n(c9657v0, c9517n1);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m30110b(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        m30110b(Integer.valueOf(i2));
    }
}
