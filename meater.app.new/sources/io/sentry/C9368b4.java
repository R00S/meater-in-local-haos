package io.sentry;

import io.sentry.util.C9648s;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryAutoDateProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.b4 */
/* loaded from: classes2.dex */
public final class C9368b4 implements InterfaceC9442g4 {

    /* renamed from: a */
    private final InterfaceC9442g4 f36152a;

    public C9368b4() {
        if (m30493b()) {
            this.f36152a = new C9534p4();
        } else {
            this.f36152a = new C9673w4();
        }
    }

    /* renamed from: b */
    private static boolean m30493b() {
        return C9648s.m31806b() && C9648s.m31805a();
    }

    @Override // io.sentry.InterfaceC9442g4
    /* renamed from: a */
    public AbstractC9435f4 mo30210a() {
        return this.f36152a.mo30210a();
    }
}
