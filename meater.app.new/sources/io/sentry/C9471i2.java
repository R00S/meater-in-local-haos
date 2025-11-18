package io.sentry;

import okhttp3.HttpUrl;

/* compiled from: IntegrationName.java */
/* renamed from: io.sentry.i2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9471i2 {
    /* renamed from: a */
    public static void m30845a(InterfaceC9490j2 _this) {
        C9573q4.m31555c().m31556a(_this.mo30004d());
    }

    /* renamed from: b */
    public static String m30846b(InterfaceC9490j2 _this) {
        return _this.getClass().getSimpleName().replace("Sentry", HttpUrl.FRAGMENT_ENCODE_SET).replace("Integration", HttpUrl.FRAGMENT_ENCODE_SET).replace("Interceptor", HttpUrl.FRAGMENT_ENCODE_SET).replace("EventProcessor", HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
