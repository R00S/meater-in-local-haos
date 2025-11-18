package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* compiled from: SpanStatus.java */
/* renamed from: io.sentry.j5 */
/* loaded from: classes2.dex */
public enum EnumC9493j5 implements InterfaceC9578r2 {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* compiled from: SpanStatus.java */
    /* renamed from: io.sentry.j5$a */
    public static final class a implements InterfaceC9504l2<EnumC9493j5> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC9493j5 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            return EnumC9493j5.valueOf(c9518n2.m31881J().toUpperCase(Locale.ROOT));
        }
    }

    EnumC9493j5(int i2) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i2;
    }

    public static EnumC9493j5 fromHttpStatusCode(int i2) {
        for (EnumC9493j5 enumC9493j5 : values()) {
            if (enumC9493j5.matches(i2)) {
                return enumC9493j5;
            }
        }
        return null;
    }

    private boolean matches(int i2) {
        return i2 >= this.minHttpStatusCode && i2 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30819b(name().toLowerCase(Locale.ROOT));
    }

    public static EnumC9493j5 fromHttpStatusCode(Integer num, EnumC9493j5 enumC9493j5) {
        EnumC9493j5 enumC9493j5FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC9493j5;
        return enumC9493j5FromHttpStatusCode != null ? enumC9493j5FromHttpStatusCode : enumC9493j5;
    }

    EnumC9493j5(int i2, int i3) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i3;
    }
}
