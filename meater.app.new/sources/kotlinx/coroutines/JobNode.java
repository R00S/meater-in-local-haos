package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m32267d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/CompletionHandlerBase;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "job", "Lkotlinx/coroutines/JobSupport;", "getJob", "()Lkotlinx/coroutines/JobSupport;", "setJob", "(Lkotlinx/coroutines/JobSupport;)V", "list", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "dispose", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.e2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class JobNode extends CompletionHandlerBase implements DisposableHandle, Incomplete {

    /* renamed from: i */
    public JobSupport f41704i;

    /* renamed from: F */
    public final JobSupport m39303F() {
        JobSupport jobSupport = this.f41704i;
        if (jobSupport != null) {
            return jobSupport;
        }
        C9801m.m32363w("job");
        return null;
    }

    /* renamed from: G */
    public final void m39304G(JobSupport jobSupport) {
        this.f41704i = jobSupport;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: b */
    public boolean getF41754f() {
        return true;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: e */
    public NodeList getF41716f() {
        return null;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: k */
    public void mo39285k() {
        m39303F().m39362q0(this);
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return C11049t0.m39687a(this) + '@' + C11049t0.m39688b(this) + "[job@" + C11049t0.m39688b(m39303F()) + ']';
    }
}
