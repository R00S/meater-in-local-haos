package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m32267d2 = {"runBlocking", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10965i {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T m39423a(kotlin.coroutines.CoroutineContext r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5) throws java.lang.InterruptedException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.y.e$b r1 = kotlin.coroutines.ContinuationInterceptor.f41528b
            kotlin.y.g$b r1 = r4.get(r1)
            kotlin.y.e r1 = (kotlin.coroutines.ContinuationInterceptor) r1
            if (r1 != 0) goto L1f
            kotlinx.coroutines.u2 r1 = kotlinx.coroutines.ThreadLocalEventLoop.f41888a
            kotlinx.coroutines.i1 r1 = r1.m39697b()
            kotlinx.coroutines.r1 r2 = kotlinx.coroutines.GlobalScope.f41877f
            kotlin.y.g r4 = r4.plus(r1)
            kotlin.y.g r4 = kotlinx.coroutines.C10962h0.m39417e(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof kotlinx.coroutines.EventLoop
            r3 = 0
            if (r2 == 0) goto L27
            kotlinx.coroutines.i1 r1 = (kotlinx.coroutines.EventLoop) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.m39438q0()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            kotlinx.coroutines.u2 r1 = kotlinx.coroutines.ThreadLocalEventLoop.f41888a
            kotlinx.coroutines.i1 r1 = r1.m39696a()
        L3c:
            kotlinx.coroutines.r1 r2 = kotlinx.coroutines.GlobalScope.f41877f
            kotlin.y.g r4 = kotlinx.coroutines.C10962h0.m39417e(r2, r4)
        L42:
            kotlinx.coroutines.f r2 = new kotlinx.coroutines.f
            r2.<init>(r4, r0, r1)
            kotlinx.coroutines.q0 r4 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r2.m39080F0(r4, r2, r5)
            java.lang.Object r4 = r2.m39309G0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10965i.m39423a(kotlin.y.g, kotlin.a0.c.p):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m39424b(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f41531f;
        }
        return C10961h.m39410c(coroutineContext, function2);
    }
}
