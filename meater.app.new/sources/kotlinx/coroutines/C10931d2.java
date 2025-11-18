package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a\u001b\u0010\u001b\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m32267d2 = {"isActive", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10931d2 {
    /* renamed from: a */
    public static final CompletableJob m39271a(Job job) {
        return new JobImpl(job);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableJob m39272b(Job job, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            job = null;
        }
        return C10884b2.m39120a(job);
    }

    /* renamed from: c */
    public static final void m39273c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job = (Job) coroutineContext.get(Job.f41899e);
        if (job != null) {
            job.mo39346H(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m39274d(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.f41899e);
        if (job != null) {
            C10884b2.m39125f(job);
        }
    }

    /* renamed from: e */
    public static final void m39275e(Job job) {
        if (!job.mo39083b()) {
            throw job.mo39357j();
        }
    }
}
