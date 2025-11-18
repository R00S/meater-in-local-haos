package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* compiled from: SentryLevel.java */
/* renamed from: io.sentry.s4 */
/* loaded from: classes2.dex */
public enum EnumC9587s4 implements InterfaceC9578r2 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* compiled from: SentryLevel.java */
    /* renamed from: io.sentry.s4$a */
    static final class a implements InterfaceC9504l2<EnumC9587s4> {
        a() {
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC9587s4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            return EnumC9587s4.valueOf(c9518n2.m31881J().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30819b(name().toLowerCase(Locale.ROOT));
    }
}
