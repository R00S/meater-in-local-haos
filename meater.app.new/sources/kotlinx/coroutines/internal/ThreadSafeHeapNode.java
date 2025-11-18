package kotlinx.coroutines.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ThreadSafeHeap.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", HttpUrl.FRAGMENT_ENCODE_SET, "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getIndex", "()I", "setIndex", "(I)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.k0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public interface ThreadSafeHeapNode {
    /* renamed from: D */
    void mo39527D(int i2);

    /* renamed from: g */
    int mo39528g();

    /* renamed from: q */
    void mo39529q(ThreadSafeHeap<?> threadSafeHeap);

    /* renamed from: v */
    ThreadSafeHeap<?> mo39530v();
}
