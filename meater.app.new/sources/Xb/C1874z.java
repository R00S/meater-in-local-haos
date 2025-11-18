package Xb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, d2 = {"LXb/z;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Throwable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1874z {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19117b = AtomicIntegerFieldUpdater.newUpdater(C1874z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Throwable cause;

    public C1874z(Throwable th, boolean z10) {
        this.cause = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f19117b.get(this) != 0;
    }

    public final boolean c() {
        return f19117b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ C1874z(Throwable th, boolean z10, int i10, C3854k c3854k) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
