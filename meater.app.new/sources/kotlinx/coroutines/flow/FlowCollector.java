package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: FlowCollector.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m32267d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "emit", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public interface FlowCollector<T> {
    /* renamed from: c */
    Object mo2409c(T t, Continuation<? super C10775u> continuation);
}
