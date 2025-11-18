package p456rx.exceptions;

/* loaded from: classes3.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
