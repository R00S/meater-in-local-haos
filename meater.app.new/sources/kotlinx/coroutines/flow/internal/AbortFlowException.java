package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;

/* compiled from: FlowExceptions.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "fillInStackTrace", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes3.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: f */
    public final transient FlowCollector<?> f41719f;

    public AbortFlowException(FlowCollector<?> flowCollector) {
        super("Flow was aborted, no more elements needed");
        this.f41719f = flowCollector;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C11045s0.m39683c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
