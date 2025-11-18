package io.sentry.transport;

import io.sentry.C9449h4;
import io.sentry.C9517n1;
import io.sentry.cache.InterfaceC9394r;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NoOpEnvelopeCache.java */
/* renamed from: io.sentry.transport.t */
/* loaded from: classes2.dex */
public final class C9616t implements InterfaceC9394r {

    /* renamed from: f */
    private static final C9616t f36900f = new C9616t();

    /* renamed from: c */
    public static C9616t m31704c() {
        return f36900f;
    }

    @Override // io.sentry.cache.InterfaceC9394r
    /* renamed from: Z */
    public void mo30163Z(C9449h4 c9449h4, C9517n1 c9517n1) {
    }

    @Override // java.lang.Iterable
    public Iterator<C9449h4> iterator() {
        return new ArrayList(0).iterator();
    }

    @Override // io.sentry.cache.InterfaceC9394r
    /* renamed from: p */
    public void mo30636p(C9449h4 c9449h4) {
    }
}
