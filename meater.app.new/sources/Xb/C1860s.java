package Xb;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LXb/s;", "LXb/w0;", "LXb/r;", "LXb/t;", "childJob", "<init>", "(LXb/t;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "", "j", "(Ljava/lang/Throwable;)Z", "F", "LXb/t;", "LXb/v0;", "getParent", "()LXb/v0;", "parent", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1860s extends AbstractC1869w0 implements r {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC1862t childJob;

    public C1860s(InterfaceC1862t interfaceC1862t) {
        this.childJob = interfaceC1862t;
    }

    @Override // Xb.InterfaceC1861s0
    public void b(Throwable cause) {
        this.childJob.x(w());
    }

    @Override // Xb.r
    public InterfaceC1867v0 getParent() {
        return w();
    }

    @Override // Xb.r
    public boolean j(Throwable cause) {
        return w().c0(cause);
    }
}
