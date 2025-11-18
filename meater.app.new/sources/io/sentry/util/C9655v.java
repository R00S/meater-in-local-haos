package io.sentry.util;

import io.sentry.C9526o3;
import io.sentry.C9586s3;
import io.sentry.C9624u0;
import io.sentry.C9680x4;
import io.sentry.InterfaceC9593t3;
import io.sentry.InterfaceC9658v1;

/* compiled from: TracingUtils.java */
/* renamed from: io.sentry.util.v */
/* loaded from: classes2.dex */
public final class C9655v {
    /* renamed from: a */
    static /* synthetic */ void m31823a(C9680x4 c9680x4, C9586s3 c9586s3, C9526o3 c9526o3) {
        C9624u0 c9624u0M31124b = c9526o3.m31124b();
        if (c9624u0M31124b == null) {
            c9624u0M31124b = new C9624u0(c9680x4.getLogger());
            c9526o3.m31129g(c9624u0M31124b);
        }
        if (c9624u0M31124b.m31753q()) {
            c9624u0M31124b.m31737D(c9586s3, c9680x4);
            c9624u0M31124b.m31740a();
        }
    }

    /* renamed from: d */
    public static C9526o3 m31826d(final C9586s3 c9586s3, final C9680x4 c9680x4) {
        return c9586s3.m31587B(new C9586s3.a() { // from class: io.sentry.util.f
            @Override // io.sentry.C9586s3.a
            /* renamed from: a */
            public final void mo31614a(C9526o3 c9526o3) {
                C9655v.m31823a(c9680x4, c9586s3, c9526o3);
            }
        });
    }

    /* renamed from: e */
    public static void m31827e(InterfaceC9658v1 interfaceC9658v1) {
        interfaceC9658v1.mo31154o(new InterfaceC9593t3() { // from class: io.sentry.util.g
            @Override // io.sentry.InterfaceC9593t3
            /* renamed from: a */
            public final void mo30217a(C9586s3 c9586s3) {
                c9586s3.m31587B(new C9586s3.a() { // from class: io.sentry.util.e
                    @Override // io.sentry.C9586s3.a
                    /* renamed from: a */
                    public final void mo31614a(C9526o3 c9526o3) {
                        c9586s3.m31611x(new C9526o3());
                    }
                });
            }
        });
    }
}
