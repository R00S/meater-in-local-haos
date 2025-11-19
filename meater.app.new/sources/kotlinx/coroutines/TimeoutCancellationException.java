package kotlinx.coroutines;

import Xb.InterfaceC1867v0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "message", "LXb/v0;", "coroutine", "<init>", "(Ljava/lang/String;LXb/v0;)V", "B", "LXb/v0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final transient InterfaceC1867v0 coroutine;

    public TimeoutCancellationException(String str, InterfaceC1867v0 interfaceC1867v0) {
        super(str);
        this.coroutine = interfaceC1867v0;
    }
}
