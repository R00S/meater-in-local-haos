package io.sentry;

import io.sentry.protocol.C9556o;
import io.sentry.protocol.C9558q;
import io.sentry.util.C9646q;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelope.java */
@ApiStatus.Internal
/* renamed from: io.sentry.h4 */
/* loaded from: classes2.dex */
public final class C9449h4 {

    /* renamed from: a */
    private final C9473i4 f36342a;

    /* renamed from: b */
    private final Iterable<C9492j4> f36343b;

    public C9449h4(C9473i4 c9473i4, Iterable<C9492j4> iterable) {
        this.f36342a = (C9473i4) C9646q.m31802c(c9473i4, "SentryEnvelopeHeader is required.");
        this.f36343b = (Iterable) C9646q.m31802c(iterable, "SentryEnvelope items are required.");
    }

    /* renamed from: a */
    public static C9449h4 m30830a(InterfaceC9373c2 interfaceC9373c2, C9422d5 c9422d5, C9556o c9556o) throws IOException {
        C9646q.m31802c(interfaceC9373c2, "Serializer is required.");
        C9646q.m31802c(c9422d5, "session is required.");
        return new C9449h4(null, c9556o, C9492j4.m30892f(interfaceC9373c2, c9422d5));
    }

    /* renamed from: b */
    public C9473i4 m30831b() {
        return this.f36342a;
    }

    /* renamed from: c */
    public Iterable<C9492j4> m30832c() {
        return this.f36343b;
    }

    public C9449h4(C9558q c9558q, C9556o c9556o, C9492j4 c9492j4) {
        C9646q.m31802c(c9492j4, "SentryEnvelopeItem is required.");
        this.f36342a = new C9473i4(c9558q, c9556o);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c9492j4);
        this.f36343b = arrayList;
    }
}
