package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, m32267d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", HttpUrl.FRAGMENT_ENCODE_SET, "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "complete", "completeExceptionally", "exception", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.a2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class JobImpl extends JobSupport implements CompletableJob {

    /* renamed from: g */
    private final boolean f41566g;

    public JobImpl(Job job) {
        super(true);
        m39352a0(job);
        this.f41566g = m39095C0();
    }

    /* renamed from: C0 */
    private final boolean m39095C0() {
        JobSupport jobSupportM39303F;
        ChildHandle childHandleM39349W = m39349W();
        ChildHandleNode childHandleNode = childHandleM39349W instanceof ChildHandleNode ? (ChildHandleNode) childHandleM39349W : null;
        if (childHandleNode != null && (jobSupportM39303F = childHandleNode.m39303F()) != null) {
            while (!jobSupportM39303F.getF41566g()) {
                ChildHandle childHandleM39349W2 = jobSupportM39303F.m39349W();
                ChildHandleNode childHandleNode2 = childHandleM39349W2 instanceof ChildHandleNode ? (ChildHandleNode) childHandleM39349W2 : null;
                if (childHandleNode2 == null || (jobSupportM39303F = childHandleNode2.m39303F()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: T, reason: from getter */
    public boolean getF41566g() {
        return this.f41566g;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: U */
    public boolean mo39097U() {
        return true;
    }
}
