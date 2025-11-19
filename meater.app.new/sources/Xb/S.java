package Xb;

import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LXb/S;", "", "", "timeMillis", "LXb/l;", "Loa/F;", "continuation", "i0", "(JLXb/l;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lta/g;", "context", "LXb/b0;", "h0", "(JLjava/lang/Runnable;Lta/g;)LXb/b0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface S {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static InterfaceC1828b0 a(S s10, long j10, Runnable runnable, ta.g gVar) {
            return O.a().h0(j10, runnable, gVar);
        }
    }

    InterfaceC1828b0 h0(long timeMillis, Runnable block, ta.g context);

    void i0(long timeMillis, InterfaceC1847l<? super C4153F> continuation);
}
