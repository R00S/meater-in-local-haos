package Xb;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import oa.C4153F;
import oa.InterfaceC4156a;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;

/* compiled from: NonCancellable.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0004\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b)\u0010\u0007R\u001a\u0010,\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0004\u001a\u0004\b,\u0010\u0007R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00020.8VX\u0097\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0004\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"LXb/I0;", "Lta/a;", "LXb/v0;", "<init>", "()V", "", "start", "()Z", "Loa/F;", "o", "(Lta/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LXb/b0;", "q", "(LBa/l;)LXb/b0;", "onCancelling", "invokeImmediately", "o0", "(ZZLBa/l;)LXb/b0;", "cause", "e", "(Ljava/util/concurrent/CancellationException;)V", "LXb/t;", "child", "LXb/r;", "a0", "(LXb/t;)LXb/r;", "", "toString", "()Ljava/lang/String;", "getParent", "()LXb/v0;", "getParent$annotations", "parent", "a", "isActive$annotations", "isActive", "isCancelled", "isCancelled$annotations", "LTb/h;", "p", "()LTb/h;", "getChildren$annotations", "children", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I0 extends AbstractC4585a implements InterfaceC1867v0 {

    /* renamed from: C, reason: collision with root package name */
    public static final I0 f19028C = new I0();

    private I0() {
        super(InterfaceC1867v0.INSTANCE);
    }

    @Override // Xb.InterfaceC1867v0
    public boolean a() {
        return true;
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public r a0(InterfaceC1862t child) {
        return J0.f19029B;
    }

    @Override // Xb.InterfaceC1867v0
    public InterfaceC1867v0 getParent() {
        return null;
    }

    @Override // Xb.InterfaceC1867v0
    public boolean isCancelled() {
        return false;
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public Object o(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public InterfaceC1828b0 o0(boolean onCancelling, boolean invokeImmediately, Ba.l<? super Throwable, C4153F> handler) {
        return J0.f19029B;
    }

    @Override // Xb.InterfaceC1867v0
    public Tb.h<InterfaceC1867v0> p() {
        return Tb.k.e();
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public InterfaceC1828b0 q(Ba.l<? super Throwable, C4153F> handler) {
        return J0.f19029B;
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public CancellationException u() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Xb.InterfaceC1867v0
    @InterfaceC4156a
    public void e(CancellationException cause) {
    }
}
