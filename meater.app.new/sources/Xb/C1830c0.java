package Xb;

import kotlin.Metadata;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXb/c0;", "LXb/k;", "LXb/b0;", "handle", "<init>", "(LXb/b0;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "B", "LXb/b0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1830c0 implements InterfaceC1845k {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1828b0 handle;

    public C1830c0(InterfaceC1828b0 interfaceC1828b0) {
        this.handle = interfaceC1828b0;
    }

    @Override // Xb.InterfaceC1845k
    public void b(Throwable cause) {
        this.handle.c();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }
}
