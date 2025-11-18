package com.google.firebase.perf.network;

import A9.k;
import B9.l;
import java.io.IOException;
import oc.C4178B;
import oc.C4180D;
import oc.InterfaceC4185e;
import oc.InterfaceC4186f;
import oc.v;
import w9.g;
import y9.C5143d;

/* compiled from: InstrumentOkHttpEnqueueCallback.java */
/* loaded from: classes2.dex */
public class d implements InterfaceC4186f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4186f f38559a;

    /* renamed from: b, reason: collision with root package name */
    private final g f38560b;

    /* renamed from: c, reason: collision with root package name */
    private final l f38561c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38562d;

    public d(InterfaceC4186f interfaceC4186f, k kVar, l lVar, long j10) {
        this.f38559a = interfaceC4186f;
        this.f38560b = g.c(kVar);
        this.f38562d = j10;
        this.f38561c = lVar;
    }

    @Override // oc.InterfaceC4186f
    public void a(InterfaceC4185e interfaceC4185e, IOException iOException) {
        C4178B c4178bRequest = interfaceC4185e.request();
        if (c4178bRequest != null) {
            v url = c4178bRequest.getUrl();
            if (url != null) {
                this.f38560b.t(url.u().toString());
            }
            if (c4178bRequest.getMethod() != null) {
                this.f38560b.j(c4178bRequest.getMethod());
            }
        }
        this.f38560b.n(this.f38562d);
        this.f38560b.r(this.f38561c.c());
        C5143d.d(this.f38560b);
        this.f38559a.a(interfaceC4185e, iOException);
    }

    @Override // oc.InterfaceC4186f
    public void b(InterfaceC4185e interfaceC4185e, C4180D c4180d) {
        FirebasePerfOkHttpClient.a(c4180d, this.f38560b, this.f38562d, this.f38561c.c());
        this.f38559a.b(interfaceC4185e, c4180d);
    }
}
