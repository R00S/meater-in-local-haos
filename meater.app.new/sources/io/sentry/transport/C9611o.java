package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: CurrentDateProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.transport.o */
/* loaded from: classes2.dex */
public final class C9611o implements InterfaceC9613q {

    /* renamed from: a */
    private static final InterfaceC9613q f36894a = new C9611o();

    private C9611o() {
    }

    /* renamed from: b */
    public static InterfaceC9613q m31694b() {
        return f36894a;
    }

    @Override // io.sentry.transport.InterfaceC9613q
    /* renamed from: a */
    public final long mo30147a() {
        return System.currentTimeMillis();
    }
}
