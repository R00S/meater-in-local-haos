package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.C10520l;
import kotlin.sequences.C10522n;
import okhttp3.HttpUrl;
import p000.C0000a;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"handlers", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "exception", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: classes3.dex */
public final class C11013k0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f41849a = C10522n.m37377A(C10520l.m37368a(C0000a.m0a()));

    /* renamed from: a */
    public static final void m39616a(CoroutineContext coroutineContext, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = f41849a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, C11017l0.m39621b(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            Result.a aVar = Result.f40714f;
            C9821b.m32367a(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m37650a(C10775u.f41439a);
        } catch (Throwable th3) {
            Result.a aVar2 = Result.f40714f;
            Result.m37650a(C10568o.m37654a(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
