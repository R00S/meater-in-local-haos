package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.C10775u;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Future.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lkotlinx/coroutines/CancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "future", "Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Future;)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.k, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class CancelFutureOnCancel extends CancelHandler {

    /* renamed from: f */
    private final Future<?> f41848f;

    public CancelFutureOnCancel(Future<?> future) {
        this.f41848f = future;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: b */
    public void mo39222b(Throwable th) {
        if (th != null) {
            this.f41848f.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
        mo39222b(th);
        return C10775u.f41439a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f41848f + ']';
    }
}
