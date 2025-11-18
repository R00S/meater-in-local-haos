package Xb;

import kotlin.Metadata;

/* compiled from: Unconfined.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LXb/W0;", "LXb/E;", "<init>", "()V", "Lta/g;", "context", "", "v0", "(Lta/g;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class W0 extends E {

    /* renamed from: D, reason: collision with root package name */
    public static final W0 f19055D = new W0();

    private W0() {
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        a1 a1Var = (a1) context.b(a1.INSTANCE);
        if (a1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        a1Var.dispatcherWasUnconfined = true;
    }

    @Override // Xb.E
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // Xb.E
    public boolean v0(ta.g context) {
        return false;
    }
}
