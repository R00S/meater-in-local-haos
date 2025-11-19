package Xb;

import kotlin.Metadata;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LXb/N0;", "LXb/B0;", "Lta/d;", "Loa/F;", "continuation", "<init>", "(Lta/d;)V", "", "cause", "b", "(Ljava/lang/Throwable;)V", "F", "Lta/d;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class N0 extends B0 {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4588d<C4153F> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public N0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        this.continuation = interfaceC4588d;
    }

    @Override // Xb.InterfaceC1861s0
    public void b(Throwable cause) {
        InterfaceC4588d<C4153F> interfaceC4588d = this.continuation;
        C4172q.Companion companion = C4172q.INSTANCE;
        interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
    }
}
