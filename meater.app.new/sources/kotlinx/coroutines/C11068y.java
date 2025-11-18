package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import okhttp3.HttpUrl;

/* compiled from: CompletableDeferred.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a,\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m32267d2 = {"CompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "completeWith", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.y */
/* loaded from: classes3.dex */
public final class C11068y {
    /* renamed from: a */
    public static final <T> CompletableDeferred<T> m39707a(Job job) {
        return new CompletableDeferredImpl(job);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableDeferred m39708b(Job job, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            job = null;
        }
        return m39707a(job);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> boolean m39709c(CompletableDeferred<T> completableDeferred, Object obj) {
        Throwable thM37651b = Result.m37651b(obj);
        return thM37651b == null ? completableDeferred.mo39703B(obj) : completableDeferred.mo39702A(thM37651b);
    }
}
