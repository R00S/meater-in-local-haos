package kotlinx.coroutines.flow.internal;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9795j;
import kotlin.jvm.internal.C9800l0;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;

/* compiled from: SafeCollector.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\">\u0010\u0000\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"emitFun", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "getEmitFun$annotations", "()V", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.i */
/* loaded from: classes3.dex */
public final class C10954i {

    /* renamed from: a */
    private static final Function3<FlowCollector<Object>, Object, Continuation<? super C10775u>, Object> f41738a = (Function3) C9800l0.m32330e(a.f41739h, 3);

    /* compiled from: SafeCollector.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.i$a */
    /* synthetic */ class a extends C9795j implements Function3<FlowCollector<? super Object>, Object, Continuation<? super C10775u>, Object> {

        /* renamed from: h */
        public static final a f41739h = new a();

        a() {
            super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object mo26879d(FlowCollector<Object> flowCollector, Object obj, Continuation<? super C10775u> continuation) {
            return flowCollector.mo2409c(obj, continuation);
        }
    }
}
