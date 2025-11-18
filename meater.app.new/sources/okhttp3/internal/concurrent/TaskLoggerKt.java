package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9797k;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskLogger.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m32267d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "messageBlock", "Lkotlin/u;", "taskLog", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/a0/c/a;)V", "T", "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/a0/c/a;)Ljava/lang/Object;", "message", "log", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "ns", "formatDuration", "(J)Ljava/lang/String;", "okhttp"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, Function0<? extends T> function0) {
        long jNanoTime;
        C9801m.m32346f(task, "task");
        C9801m.m32346f(taskQueue, "queue");
        C9801m.m32346f(function0, "block");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = function0.invoke();
            C9797k.m32324b(1);
            if (zIsLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            C9797k.m32323a(1);
            return tInvoke;
        } catch (Throwable th) {
            C9797k.m32324b(1);
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            C9797k.m32323a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, Function0<String> function0) {
        C9801m.m32346f(task, "task");
        C9801m.m32346f(taskQueue, "queue");
        C9801m.m32346f(function0, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, function0.invoke());
        }
    }
}
