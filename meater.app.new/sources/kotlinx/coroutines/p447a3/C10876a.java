package kotlinx.coroutines.p447a3;

import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.C10985i;
import okhttp3.HttpUrl;

/* compiled from: Cancellable.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a#\u0010\u0006\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0082\b\u001a\u001e\u0010\t\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a>\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001ay\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000b*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\u0006\u0010\u0011\u001a\u0002H\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00032%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m32267d2 = {"dispatcherFailure", HttpUrl.FRAGMENT_ENCODE_SET, "completion", "Lkotlin/coroutines/Continuation;", "e", HttpUrl.FRAGMENT_ENCODE_SET, "runSafely", "block", "Lkotlin/Function0;", "startCoroutineCancellable", "fatalCompletion", "T", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "onCancellation", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.a3.a */
/* loaded from: classes3.dex */
public final class C10876a {
    /* renamed from: a */
    private static final void m39098a(Continuation<?> continuation, Throwable th) throws Throwable {
        Result.a aVar = Result.f40714f;
        continuation.resumeWith(Result.m37650a(C10568o.m37654a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m39099b(Continuation<? super C10775u> continuation, Continuation<?> continuation2) throws Throwable {
        try {
            Continuation continuationM39044b = C10854c.m39044b(continuation);
            Result.a aVar = Result.f40714f;
            C10985i.m39489c(continuationM39044b, Result.m37650a(C10775u.f41439a), null, 2, null);
        } catch (Throwable th) {
            m39098a(continuation2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m39100c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation, Function1<? super Throwable, C10775u> function1) throws Throwable {
        try {
            Continuation continuationM39044b = C10854c.m39044b(C10854c.m39043a(function2, r, continuation));
            Result.a aVar = Result.f40714f;
            C10985i.m39488b(continuationM39044b, Result.m37650a(C10775u.f41439a), function1);
        } catch (Throwable th) {
            m39098a(continuation, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m39101d(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i2, Object obj2) throws Throwable {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        m39100c(function2, obj, continuation, function1);
    }
}
