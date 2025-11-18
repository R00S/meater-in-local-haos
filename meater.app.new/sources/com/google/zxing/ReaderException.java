package com.google.zxing;

/* loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: f */
    protected static final boolean f32715f;

    /* renamed from: g */
    protected static final StackTraceElement[] f32716g;

    static {
        f32715f = System.getProperty("surefire.test.class.path") != null;
        f32716g = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
