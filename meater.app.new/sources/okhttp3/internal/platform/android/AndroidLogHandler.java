package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;

/* compiled from: AndroidLog.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b"}, m32267d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lkotlin/u;", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "()V", "close", "<init>", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        C9801m.m32346f(record, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = record.getLoggerName();
        C9801m.m32345e(loggerName, "record.loggerName");
        int androidLevel = AndroidLogKt.getAndroidLevel(record);
        String message = record.getMessage();
        C9801m.m32345e(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, androidLevel, message, record.getThrown());
    }
}
