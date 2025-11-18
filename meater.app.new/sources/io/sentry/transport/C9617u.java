package io.sentry.transport;

import io.sentry.C9449h4;
import io.sentry.C9517n1;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NoOpTransport.java */
@ApiStatus.Internal
/* renamed from: io.sentry.transport.u */
/* loaded from: classes2.dex */
public final class C9617u implements InterfaceC9614r {

    /* renamed from: f */
    private static final C9617u f36901f = new C9617u();

    private C9617u() {
    }

    /* renamed from: a */
    public static C9617u m31705a() {
        return f36901f;
    }

    @Override // io.sentry.transport.InterfaceC9614r
    /* renamed from: V */
    public void mo31675V(C9449h4 c9449h4, C9517n1 c9517n1) throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.InterfaceC9614r
    /* renamed from: h */
    public void mo31676h(long j2) {
    }
}
