package kotlinx.coroutines.flow.internal;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.HttpUrl;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, m32267d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "F", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "allocateLocked", HttpUrl.FRAGMENT_ENCODE_SET, "flow", "(Ljava/lang/Object;)Z", "freeLocked", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;)[Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AbstractSharedFlowSlot<F> {
    /* renamed from: a */
    public abstract boolean mo39387a(F f2);

    /* renamed from: b */
    public abstract Continuation<C10775u>[] mo39388b(F f2);
}
