package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Job.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m32267d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "()V", "parent", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "childCancelled", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "dispose", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.k2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {

    /* renamed from: f */
    public static final NonDisposableHandle f41850f = new NonDisposableHandle();

    private NonDisposableHandle() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: k */
    public void mo39285k() {
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: u */
    public boolean mo39619u(Throwable th) {
        return false;
    }
}
