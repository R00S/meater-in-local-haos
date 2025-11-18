package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.C9471i2;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.util.C9320q;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Context f35823f;

    /* renamed from: g */
    private SentryAndroidOptions f35824g;

    /* renamed from: h */
    C9257a f35825h;

    /* renamed from: i */
    private TelephonyManager f35826i;

    /* renamed from: io.sentry.android.core.PhoneStateBreadcrumbsIntegration$a */
    static final class C9257a extends PhoneStateListener {

        /* renamed from: a */
        private final InterfaceC9658v1 f35827a;

        C9257a(InterfaceC9658v1 interfaceC9658v1) {
            this.f35827a = interfaceC9658v1;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i2, String str) {
            if (i2 == 1) {
                C9657v0 c9657v0 = new C9657v0();
                c9657v0.m31844p("system");
                c9657v0.m31840l("device.event");
                c9657v0.m31841m("action", "CALL_STATE_RINGING");
                c9657v0.m31843o("Device ringing");
                c9657v0.m31842n(EnumC9587s4.INFO);
                this.f35827a.mo31148i(c9657v0);
            }
        }
    }

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.f35823f = (Context) C9646q.m31802c(context, "Context is required");
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
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35824g = sentryAndroidOptions;
        InterfaceC9670w1 logger = sentryAndroidOptions.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f35824g.isEnableSystemEventBreadcrumbs()));
        if (this.f35824g.isEnableSystemEventBreadcrumbs() && C9320q.m30298a(this.f35823f, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f35823f.getSystemService("phone");
            this.f35826i = telephonyManager;
            if (telephonyManager == null) {
                this.f35824g.getLogger().mo30214c(EnumC9587s4.INFO, "TelephonyManager is not available", new Object[0]);
                return;
            }
            try {
                C9257a c9257a = new C9257a(interfaceC9658v1);
                this.f35825h = c9257a;
                this.f35826i.listen(c9257a, 32);
                c9680x4.getLogger().mo30214c(enumC9587s4, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } catch (Throwable th) {
                this.f35824g.getLogger().mo30212a(EnumC9587s4.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C9257a c9257a;
        TelephonyManager telephonyManager = this.f35826i;
        if (telephonyManager == null || (c9257a = this.f35825h) == null) {
            return;
        }
        telephonyManager.listen(c9257a, 0);
        this.f35825h = null;
        SentryAndroidOptions sentryAndroidOptions = this.f35824g;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }
}
