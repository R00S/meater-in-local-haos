package P5;

import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CustomUncaughtExceptionHandler.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"LP5/g;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "uncaughtExceptionHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "", "exception", "", "a", "(Ljava/lang/Throwable;)Z", "Ljava/lang/Thread;", "thread", "Loa/F;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/Thread$UncaughtExceptionHandler;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1599g implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public C1599g(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C3862t.g(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    private final boolean a(Throwable exception) {
        return C3862t.b(kotlin.jvm.internal.P.b(exception.getClass()).r(), "CannotDeliverBroadcastException");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable exception) {
        C3862t.g(thread, "thread");
        C3862t.g(exception, "exception");
        if (a(exception)) {
            return;
        }
        this.uncaughtExceptionHandler.uncaughtException(thread, exception);
    }
}
