package R1;

import Xb.A0;
import Xb.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CloseableCoroutineScope.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LR1/a;", "Ljava/lang/AutoCloseable;", "LXb/I;", "Lta/g;", "coroutineContext", "<init>", "(Lta/g;)V", "Loa/F;", "close", "()V", "B", "Lta/g;", "getCoroutineContext", "()Lta/g;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements AutoCloseable, I {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final ta.g coroutineContext;

    public a(ta.g coroutineContext) {
        C3862t.g(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        A0.f(getCoroutineContext(), null, 1, null);
    }

    @Override // Xb.I
    public ta.g getCoroutineContext() {
        return this.coroutineContext;
    }
}
