package zc;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lzc/f;", "Ljava/util/logging/Handler;", "<init>", "()V", "Ljava/util/logging/LogRecord;", "record", "Loa/F;", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "close", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: zc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5231f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final C5231f f53937a = new C5231f();

    private C5231f() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        C3862t.g(record, "record");
        C5230e c5230e = C5230e.f53934a;
        String loggerName = record.getLoggerName();
        C3862t.f(loggerName, "record.loggerName");
        int iB = g.b(record);
        String message = record.getMessage();
        C3862t.f(message, "record.message");
        c5230e.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
