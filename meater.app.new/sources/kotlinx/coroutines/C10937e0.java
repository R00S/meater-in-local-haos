package kotlinx.coroutines;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.C10976d0;
import okhttp3.HttpUrl;

/* compiled from: CompletionState.kt */
@Metadata(m32266d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001aI\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a.\u0010\b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m32267d2 = {"recoverResult", "Lkotlin/Result;", "T", "state", HttpUrl.FRAGMENT_ENCODE_SET, "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toState", "onCancellation", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ParameterName;", "name", "cause", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.e0 */
/* loaded from: classes3.dex */
public final class C10937e0 {
    /* renamed from: a */
    public static final <T> Object m39296a(Object obj, Continuation<? super T> continuation) {
        if (!(obj instanceof CompletedExceptionally)) {
            Result.a aVar = Result.f40714f;
            return Result.m37650a(obj);
        }
        Result.a aVar2 = Result.f40714f;
        Throwable thM39462j = ((CompletedExceptionally) obj).f41577b;
        if (C11045s0.m39684d() && (continuation instanceof CoroutineStackFrame)) {
            thM39462j = C10976d0.m39462j(thM39462j, (CoroutineStackFrame) continuation);
        }
        return Result.m37650a(C10568o.m37654a(thM39462j));
    }

    /* renamed from: b */
    public static final <T> Object m39297b(Object obj, Function1<? super Throwable, C10775u> function1) {
        Throwable thM37651b = Result.m37651b(obj);
        return thM37651b == null ? function1 != null ? new CompletedWithCancellation(obj, function1) : obj : new CompletedExceptionally(thM37651b, false, 2, null);
    }

    /* renamed from: c */
    public static final <T> Object m39298c(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thM37651b = Result.m37651b(obj);
        if (thM37651b != null) {
            if (C11045s0.m39684d() && (cancellableContinuation instanceof CoroutineStackFrame)) {
                thM37651b = C10976d0.m39462j(thM37651b, (CoroutineStackFrame) cancellableContinuation);
            }
            obj = new CompletedExceptionally(thM37651b, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m39299d(Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        return m39297b(obj, function1);
    }
}
