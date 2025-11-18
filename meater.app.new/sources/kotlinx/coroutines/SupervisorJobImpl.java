package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Supervisor.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m32267d2 = {"Lkotlinx/coroutines/SupervisorJobImpl;", "Lkotlinx/coroutines/JobImpl;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "childCancelled", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.r2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class SupervisorJobImpl extends JobImpl {
    public SupervisorJobImpl(Job job) {
        super(job);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: L */
    public boolean mo39348L(Throwable th) {
        return false;
    }
}
