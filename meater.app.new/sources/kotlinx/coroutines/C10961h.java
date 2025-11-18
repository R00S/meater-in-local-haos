package kotlinx.coroutines;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m32266d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, m32268k = 4, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes3.dex */
public final class C10961h {
    /* renamed from: a */
    public static final Job m39408a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super C10775u>, ? extends Object> function2) {
        return C11008j.m39596a(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* renamed from: c */
    public static final <T> T m39410c(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) C10965i.m39423a(coroutineContext, function2);
    }

    /* renamed from: e */
    public static final <T> Object m39412e(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return C11008j.m39598c(coroutineContext, function2, continuation);
    }
}
