package kotlin.coroutines.p442j.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DebugProbes.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b"}, m32267d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", HttpUrl.FRAGMENT_ENCODE_SET, "frame", "probeCoroutineSuspended", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.y.j.a.h */
/* loaded from: classes2.dex */
public final class C10863h {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Continuation<T> m39058a(Continuation<? super T> continuation) {
        C9801m.m32346f(continuation, "completion");
        return continuation;
    }

    /* renamed from: b */
    public static final void m39059b(Continuation<?> continuation) {
        C9801m.m32346f(continuation, "frame");
    }

    /* renamed from: c */
    public static final void m39060c(Continuation<?> continuation) {
        C9801m.m32346f(continuation, "frame");
    }
}
