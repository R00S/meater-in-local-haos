package io.sentry.transport;

import java.net.Authenticator;

/* compiled from: AuthenticatorWrapper.java */
/* renamed from: io.sentry.transport.n */
/* loaded from: classes2.dex */
final class C9610n {

    /* renamed from: a */
    private static final C9610n f36893a = new C9610n();

    private C9610n() {
    }

    /* renamed from: a */
    public static C9610n m31692a() {
        return f36893a;
    }

    /* renamed from: b */
    public void m31693b(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
