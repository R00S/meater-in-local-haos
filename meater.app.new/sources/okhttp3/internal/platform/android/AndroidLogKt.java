package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: AndroidLog.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m32267d2 = {"Ljava/util/logging/LogRecord;", HttpUrl.FRAGMENT_ENCODE_SET, "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "androidLevel", "okhttp"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class AndroidLogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getAndroidLevel(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
