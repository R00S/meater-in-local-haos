package ec;

import Xb.E;
import cc.C2383n;
import kotlin.Metadata;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lec/m;", "LXb/E;", "<init>", "()V", "Lta/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "r0", "(Lta/g;Ljava/lang/Runnable;)V", "p0", "", "parallelism", "C0", "(I)LXb/E;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class m extends E {

    /* renamed from: D, reason: collision with root package name */
    public static final m f41003D = new m();

    private m() {
    }

    @Override // Xb.E
    public E C0(int parallelism) {
        C2383n.a(parallelism);
        return parallelism >= l.f40998d ? this : super.C0(parallelism);
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        C3296c.f40984J.L0(block, l.f41002h, false);
    }

    @Override // Xb.E
    public void r0(ta.g context, Runnable block) {
        C3296c.f40984J.L0(block, l.f41002h, true);
    }
}
