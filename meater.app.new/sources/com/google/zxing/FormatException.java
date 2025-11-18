package com.google.zxing;

/* loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* renamed from: h */
    private static final FormatException f32713h;

    static {
        FormatException formatException = new FormatException();
        f32713h = formatException;
        formatException.setStackTrace(ReaderException.f32716g);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m27222a() {
        return ReaderException.f32715f ? new FormatException() : f32713h;
    }
}
