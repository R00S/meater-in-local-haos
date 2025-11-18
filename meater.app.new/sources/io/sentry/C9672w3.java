package io.sentry;

import java.io.File;

/* compiled from: SendCachedEnvelopeFireAndForgetIntegration.java */
/* renamed from: io.sentry.w3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9672w3 {
    /* renamed from: a */
    public static boolean m31932a(InterfaceC9679x3 _this, String str, InterfaceC9670w1 interfaceC9670w1) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* renamed from: b */
    public static InterfaceC9627u3 m31933b(InterfaceC9679x3 _this, final AbstractC9425e1 abstractC9425e1, final String str, final InterfaceC9670w1 interfaceC9670w1) {
        final File file = new File(str);
        return new InterfaceC9627u3() { // from class: io.sentry.s
            @Override // io.sentry.InterfaceC9627u3
            /* renamed from: a */
            public final void mo31571a() {
                C9672w3.m31934c(interfaceC9670w1, str, abstractC9425e1, file);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m31934c(InterfaceC9670w1 interfaceC9670w1, String str, AbstractC9425e1 abstractC9425e1, File file) {
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        interfaceC9670w1.mo30214c(enumC9587s4, "Started processing cached files from %s", str);
        abstractC9425e1.mo30759e(file);
        interfaceC9670w1.mo30214c(enumC9587s4, "Finished processing cached files from %s", str);
    }
}
