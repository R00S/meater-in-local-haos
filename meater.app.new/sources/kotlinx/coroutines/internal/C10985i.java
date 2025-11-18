package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.C10937e0;
import kotlinx.coroutines.C10962h0;
import kotlinx.coroutines.C11045s0;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import okhttp3.HttpUrl;

/* compiled from: DispatchedContinuation.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m32267d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", HttpUrl.FRAGMENT_ENCODE_SET, "mode", HttpUrl.FRAGMENT_ENCODE_SET, "doYield", "block", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: classes3.dex */
public final class C10985i {

    /* renamed from: a */
    private static final Symbol f41782a = new Symbol("UNDEFINED");

    /* renamed from: b */
    public static final Symbol f41783b = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T> void m39488b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, C10775u> function1) {
        boolean z;
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Object objM39297b = C10937e0.m39297b(obj, function1);
        if (dispatchedContinuation.f41778j.mo39107N(dispatchedContinuation.getF41861l())) {
            dispatchedContinuation.f41780l = objM39297b;
            dispatchedContinuation.f41578h = 1;
            dispatchedContinuation.f41778j.mo39106K(dispatchedContinuation.getF41861l(), dispatchedContinuation);
            return;
        }
        C11045s0.m39681a();
        EventLoop eventLoopM39697b = ThreadLocalEventLoop.f41888a.m39697b();
        if (eventLoopM39697b.m39434i0()) {
            dispatchedContinuation.f41780l = objM39297b;
            dispatchedContinuation.f41578h = 1;
            eventLoopM39697b.m39431Z(dispatchedContinuation);
            return;
        }
        eventLoopM39697b.m39433e0(true);
        try {
            Job job = (Job) dispatchedContinuation.getF41861l().get(Job.f41899e);
            if (job == null || job.mo39083b()) {
                z = false;
            } else {
                CancellationException cancellationExceptionMo39357j = job.mo39357j();
                dispatchedContinuation.mo39114a(objM39297b, cancellationExceptionMo39357j);
                Result.a aVar = Result.f40714f;
                dispatchedContinuation.resumeWith(Result.m37650a(C10568o.m37654a(cancellationExceptionMo39357j)));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation2 = dispatchedContinuation.f41779k;
                Object obj2 = dispatchedContinuation.f41781m;
                CoroutineContext context = continuation2.getF41861l();
                Object objM39492c = C10986i0.m39492c(context, obj2);
                UndispatchedCoroutine<?> undispatchedCoroutineM39419g = objM39492c != C10986i0.f41784a ? C10962h0.m39419g(continuation2, context, objM39492c) : null;
                try {
                    dispatchedContinuation.f41779k.resumeWith(obj);
                    C10775u c10775u = C10775u.f41439a;
                    if (undispatchedCoroutineM39419g == null || undispatchedCoroutineM39419g.m39705H0()) {
                        C10986i0.m39490a(context, objM39492c);
                    }
                } catch (Throwable th) {
                    if (undispatchedCoroutineM39419g == null || undispatchedCoroutineM39419g.m39705H0()) {
                        C10986i0.m39490a(context, objM39492c);
                    }
                    throw th;
                }
            }
            while (eventLoopM39697b.m39437p0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m39489c(Continuation continuation, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        m39488b(continuation, obj, function1);
    }
}
