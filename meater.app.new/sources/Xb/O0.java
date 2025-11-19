package Xb;

import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXb/O0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "LXb/E;", "dispatcher", "LXb/l;", "Loa/F;", "continuation", "<init>", "(LXb/E;LXb/l;)V", "run", "()V", "B", "LXb/E;", "C", "LXb/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class O0 implements Runnable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final E dispatcher;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1847l<C4153F> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public O0(E e10, InterfaceC1847l<? super C4153F> interfaceC1847l) {
        this.dispatcher = e10;
        this.continuation = interfaceC1847l;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.F(this.dispatcher, C4153F.f46609a);
    }
}
