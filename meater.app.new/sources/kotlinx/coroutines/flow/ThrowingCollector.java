package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: Emitters.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m32267d2 = {"Lkotlinx/coroutines/flow/ThrowingCollector;", "Lkotlinx/coroutines/flow/FlowCollector;", HttpUrl.FRAGMENT_ENCODE_SET, "e", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Throwable;)V", "emit", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.r, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ThrowingCollector implements FlowCollector<Object> {

    /* renamed from: f */
    public final Throwable f41959f;

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: c */
    public Object mo2409c(Object obj, Continuation<? super C10775u> continuation) throws Throwable {
        throw this.f41959f;
    }
}
