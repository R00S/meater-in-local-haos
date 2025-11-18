package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(m32266d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, m32268k = 4, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.z2.d */
/* loaded from: classes3.dex */
public final class C11078d {
    /* renamed from: a */
    public static final <T> Flow<T> m39719a(Flow<? extends T> flow, Function3<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super C10775u>, ? extends Object> function3) {
        return C11082h.m39729a(flow, function3);
    }

    /* renamed from: b */
    public static final <T> Object m39720b(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, Continuation<? super Throwable> continuation) {
        return C11082h.m39730b(flow, flowCollector, continuation);
    }

    /* renamed from: c */
    public static final <T> Flow<T> m39721c(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return C11083i.m39733a(flow, function2);
    }

    /* renamed from: d */
    public static final <T> Object m39722d(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, Continuation<? super C10775u> continuation) {
        return C11080f.m39727a(flowCollector, flow, continuation);
    }

    /* renamed from: e */
    public static final void m39723e(FlowCollector<?> flowCollector) {
        C11081g.m39728a(flowCollector);
    }

    /* renamed from: f */
    public static final <T> Object m39724f(Flow<? extends T> flow, Continuation<? super T> continuation) {
        return C11084j.m39734a(flow, continuation);
    }

    /* renamed from: g */
    public static final <T> Flow<T> m39725g(Function2<? super FlowCollector<? super T>, ? super Continuation<? super C10775u>, ? extends Object> function2) {
        return C11079e.m39726a(function2);
    }
}
