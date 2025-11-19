package Xb;

import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LXb/d0;", "LXb/B0;", "LXb/b0;", "handle", "<init>", "(LXb/b0;)V", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "F", "LXb/b0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1832d0 extends B0 {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1828b0 handle;

    public C1832d0(InterfaceC1828b0 interfaceC1828b0) {
        this.handle = interfaceC1828b0;
    }

    @Override // Xb.InterfaceC1861s0
    public void b(Throwable cause) {
        this.handle.c();
    }
}
