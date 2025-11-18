package Xb;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"LXb/p;", "LXb/z;", "Lta/d;", "continuation", "", "cause", "", "handled", "<init>", "(Lta/d;Ljava/lang/Throwable;Z)V", "e", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1855p extends C1874z {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19100c = AtomicIntegerFieldUpdater.newUpdater(C1855p.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C1855p(InterfaceC4588d<?> interfaceC4588d, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC4588d + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f19100c.compareAndSet(this, 0, 1);
    }
}
