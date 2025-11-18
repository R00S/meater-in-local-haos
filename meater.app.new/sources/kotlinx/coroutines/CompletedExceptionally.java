package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: CompletionState.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0010\u0018\u00002\u00020\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "makeHandled", "()Z", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getHandled", "kotlinx-coroutines-core", HttpUrl.FRAGMENT_ENCODE_SET}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class CompletedExceptionally {

    /* renamed from: a */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f41576a = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: b */
    public final Throwable f41577b;

    public CompletedExceptionally(Throwable th, boolean z) {
        this.f41577b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m39112a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m39113b() {
        return f41576a.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C11049t0.m39687a(this) + '[' + this.f41577b + ']';
    }

    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z, int i2, C9789g c9789g) {
        this(th, (i2 & 2) != 0 ? false : z);
    }
}
