package Xb;

import kotlin.Metadata;
import oa.C4172q;
import oa.C4173r;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LXb/M0;", "T", "LXb/B0;", "LXb/m;", "continuation", "<init>", "(LXb/m;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "F", "LXb/m;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class M0<T> extends B0 {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final C1849m<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public M0(C1849m<? super T> c1849m) {
        this.continuation = c1849m;
    }

    @Override // Xb.InterfaceC1861s0
    public void b(Throwable cause) {
        Object objR0 = w().r0();
        if (objR0 instanceof C1874z) {
            C1849m<T> c1849m = this.continuation;
            C4172q.Companion companion = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(C4173r.a(((C1874z) objR0).cause)));
        } else {
            C1849m<T> c1849m2 = this.continuation;
            C4172q.Companion companion2 = C4172q.INSTANCE;
            c1849m2.resumeWith(C4172q.a(D0.h(objR0)));
        }
    }
}
