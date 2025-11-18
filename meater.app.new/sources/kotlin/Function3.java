package kotlin;

import Ba.q;
import ac.InterfaceC1971f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Lac/f;", "", "Lta/d;", "Loa/F;", "a", "LBa/q;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.p, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class Function3 {

    /* renamed from: a, reason: collision with root package name */
    private static final q<InterfaceC1971f<Object>, Object, InterfaceC4588d<? super C4153F>, Object> f30792a;

    /* compiled from: SafeCollector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bc.p$a */
    /* synthetic */ class a extends C3860q implements q<InterfaceC1971f<? super Object>, Object, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f30793B = new a();

        a() {
            super(3, InterfaceC1971f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Ba.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object g(InterfaceC1971f<Object> interfaceC1971f, Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return interfaceC1971f.a(obj, interfaceC4588d);
        }
    }

    static {
        a aVar = a.f30793B;
        C3862t.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f30792a = (q) W.f(aVar, 3);
    }
}
