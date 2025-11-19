package android.view;

import Xb.E;
import Xb.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: PausingDispatcher.jvm.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/G;", "LXb/E;", "<init>", "()V", "Lta/g;", "context", "", "v0", "(Lta/g;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "Landroidx/lifecycle/h;", "D", "Landroidx/lifecycle/h;", "dispatchQueue", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G extends E {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final C2101h dispatchQueue = new C2101h();

    @Override // Xb.E
    public void p0(g context, Runnable block) {
        C3862t.g(context, "context");
        C3862t.g(block, "block");
        this.dispatchQueue.c(context, block);
    }

    @Override // Xb.E
    public boolean v0(g context) {
        C3862t.g(context, "context");
        if (Z.c().M0().v0(context)) {
            return true;
        }
        return !this.dispatchQueue.b();
    }
}
