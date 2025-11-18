package kotlinx.coroutines;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10986i0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import okhttp3.HttpUrl;

/* compiled from: DispatchedTask.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, m32267d2 = {"MODE_ATOMIC", HttpUrl.FRAGMENT_ENCODE_SET, "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", HttpUrl.FRAGMENT_ENCODE_SET, "(I)Z", "isReusableMode", "dispatch", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", HttpUrl.FRAGMENT_ENCODE_SET, "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c1 */
/* loaded from: classes3.dex */
public final class C10895c1 {
    /* renamed from: a */
    public static final <T> void m39139a(DispatchedTask<? super T> dispatchedTask, int i2) {
        if (C11045s0.m39681a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        Continuation<? super T> continuationMo39115c = dispatchedTask.mo39115c();
        boolean z = i2 == 4;
        if (z || !(continuationMo39115c instanceof DispatchedContinuation) || m39140b(i2) != m39140b(dispatchedTask.f41578h)) {
            m39142d(dispatchedTask, continuationMo39115c, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((DispatchedContinuation) continuationMo39115c).f41778j;
        CoroutineContext f41861l = continuationMo39115c.getF41861l();
        if (coroutineDispatcher.mo39107N(f41861l)) {
            coroutineDispatcher.mo39106K(f41861l, dispatchedTask);
        } else {
            m39143e(dispatchedTask);
        }
    }

    /* renamed from: b */
    public static final boolean m39140b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    /* renamed from: c */
    public static final boolean m39141c(int i2) {
        return i2 == 2;
    }

    /* renamed from: d */
    public static final <T> void m39142d(DispatchedTask<? super T> dispatchedTask, Continuation<? super T> continuation, boolean z) {
        Object objMo39117f;
        Object objMo39119j = dispatchedTask.mo39119j();
        Throwable thMo39116d = dispatchedTask.mo39116d(objMo39119j);
        if (thMo39116d != null) {
            Result.a aVar = Result.f40714f;
            objMo39117f = C10568o.m37654a(thMo39116d);
        } else {
            Result.a aVar2 = Result.f40714f;
            objMo39117f = dispatchedTask.mo39117f(objMo39119j);
        }
        Object objM37650a = Result.m37650a(objMo39117f);
        if (!z) {
            continuation.resumeWith(objM37650a);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation<T> continuation2 = dispatchedContinuation.f41779k;
        Object obj = dispatchedContinuation.f41781m;
        CoroutineContext f41861l = continuation2.getF41861l();
        Object objM39492c = C10986i0.m39492c(f41861l, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineM39419g = objM39492c != C10986i0.f41784a ? C10962h0.m39419g(continuation2, f41861l, objM39492c) : null;
        try {
            dispatchedContinuation.f41779k.resumeWith(objM37650a);
            C10775u c10775u = C10775u.f41439a;
        } finally {
            if (undispatchedCoroutineM39419g == null || undispatchedCoroutineM39419g.m39705H0()) {
                C10986i0.m39490a(f41861l, objM39492c);
            }
        }
    }

    /* renamed from: e */
    private static final void m39143e(DispatchedTask<?> dispatchedTask) {
        EventLoop eventLoopM39697b = ThreadLocalEventLoop.f41888a.m39697b();
        if (eventLoopM39697b.m39434i0()) {
            eventLoopM39697b.m39431Z(dispatchedTask);
            return;
        }
        eventLoopM39697b.m39433e0(true);
        try {
            m39142d(dispatchedTask, dispatchedTask.mo39115c(), true);
            do {
            } while (eventLoopM39697b.m39437p0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
