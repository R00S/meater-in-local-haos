package kotlinx.coroutines;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.internal.C10986i0;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.p447a3.C10876a;
import kotlinx.coroutines.p447a3.C10877b;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aU\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00152)\b\b\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086Jø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aO\u0010\u0017\u001a\u00020\u0018*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m32267d2 = {"RESUMED", HttpUrl.FRAGMENT_ENCODE_SET, "SUSPENDED", "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "invoke", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "Lkotlinx/coroutines/Job;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11008j {
    /* renamed from: a */
    public static final Job m39596a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super C10775u>, ? extends Object> function2) {
        CoroutineContext coroutineContextM39417e = C10962h0.m39417e(coroutineScope, coroutineContext);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart.m39678q() ? new LazyStandaloneCoroutine(coroutineContextM39417e, function2) : new StandaloneCoroutine(coroutineContextM39417e, true);
        lazyStandaloneCoroutine.m39080F0(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    /* renamed from: b */
    public static /* synthetic */ Job m39597b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f41531f;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C10961h.m39408a(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* renamed from: c */
    public static final <T> Object m39598c(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        Object objM39093H0;
        CoroutineContext context = continuation.getF41861l();
        CoroutineContext coroutineContextM39416d = C10962h0.m39416d(context, coroutineContext);
        C10884b2.m39124e(coroutineContextM39416d);
        if (coroutineContextM39416d == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(coroutineContextM39416d, continuation);
            objM39093H0 = C10877b.m39103b(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.b bVar = ContinuationInterceptor.f41528b;
            if (C9801m.m32341a(coroutineContextM39416d.get(bVar), context.get(bVar))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(coroutineContextM39416d, continuation);
                Object objM39492c = C10986i0.m39492c(coroutineContextM39416d, null);
                try {
                    Object objM39103b = C10877b.m39103b(undispatchedCoroutine, undispatchedCoroutine, function2);
                    C10986i0.m39490a(coroutineContextM39416d, objM39492c);
                    objM39093H0 = objM39103b;
                } catch (Throwable th) {
                    C10986i0.m39490a(coroutineContextM39416d, objM39492c);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(coroutineContextM39416d, continuation);
                C10876a.m39101d(function2, dispatchedCoroutine, dispatchedCoroutine, null, 4, null);
                objM39093H0 = dispatchedCoroutine.m39093H0();
            }
        }
        if (objM39093H0 == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39093H0;
    }
}
