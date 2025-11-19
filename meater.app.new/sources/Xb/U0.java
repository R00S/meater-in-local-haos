package Xb;

import cc.C2357B;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LXb/U0;", "U", "T", "Lcc/B;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lta/d;", "uCont", "<init>", "(JLta/d;)V", "Loa/F;", "run", "()V", "", "G0", "()Ljava/lang/String;", "F", "J", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class U0<U, T extends U> extends C2357B<T> implements Runnable {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final long time;

    public U0(long j10, InterfaceC4588d<? super U> interfaceC4588d) {
        super(interfaceC4588d.getContext(), interfaceC4588d);
        this.time = j10;
    }

    @Override // Xb.AbstractC1825a, Xb.C0
    public String G0() {
        return super.G0() + "(timeMillis=" + this.time + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        U(V0.a(this.time, T.b(getContext()), this));
    }
}
