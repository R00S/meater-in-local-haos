package Xb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u000f"}, d2 = {"LXb/t0;", "LXb/w0;", "LXb/s0;", "handler", "<init>", "(LXb/s0;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "F", "LXb/s0;", "Lkotlinx/atomicfu/AtomicInt;", "_invoked", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1863t0 extends AbstractC1869w0 {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19106G = AtomicIntegerFieldUpdater.newUpdater(C1863t0.class, "_invoked$volatile");

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1861s0 handler;
    private volatile /* synthetic */ int _invoked$volatile;

    public C1863t0(InterfaceC1861s0 interfaceC1861s0) {
        this.handler = interfaceC1861s0;
    }

    @Override // Xb.InterfaceC1861s0
    public void b(Throwable cause) {
        if (f19106G.compareAndSet(this, 0, 1)) {
            this.handler.b(cause);
        }
    }
}
