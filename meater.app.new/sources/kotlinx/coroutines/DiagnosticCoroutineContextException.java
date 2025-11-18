package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import okhttp3.HttpUrl;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lkotlinx/coroutines/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "fillInStackTrace", HttpUrl.FRAGMENT_ENCODE_SET, "getLocalizedMessage", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: f */
    private final CoroutineContext f41903f;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.f41903f = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f41903f.toString();
    }
}
