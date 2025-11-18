package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Timeout.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0000H\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "coroutine", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "createCopy", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException implements CopyableThrowable<TimeoutCancellationException> {

    /* renamed from: f */
    public final transient Job f41558f;

    public TimeoutCancellationException(String str, Job job) {
        super(str);
        this.f41558f = job;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TimeoutCancellationException mo39074a() {
        String message = getMessage();
        if (message == null) {
            message = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f41558f);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
