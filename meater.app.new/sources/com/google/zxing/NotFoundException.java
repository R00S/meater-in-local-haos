package com.google.zxing;

/* loaded from: classes2.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: h */
    private static final NotFoundException f32714h;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f32714h = notFoundException;
        notFoundException.setStackTrace(ReaderException.f32716g);
    }

    private NotFoundException() {
    }
}
