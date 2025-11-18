package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "Lac/f;", "Lta/d;", "Loa/F;", "", "block", "Lac/e;", "b", "(LBa/p;)Lac/e;", "value", "c", "(Ljava/lang/Object;)Lac/e;", "LZb/t;", "a", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: ac.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C1973h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ac/h$a", "Lac/e;", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ac.h$a */
    public static final class a<T> implements InterfaceC1970e<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Object f20358B;

        public a(Object obj) {
            this.f20358B = obj;
        }

        @Override // ac.InterfaceC1970e
        public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            Object objA = interfaceC1971f.a((Object) this.f20358B, interfaceC4588d);
            return objA == C4696b.e() ? objA : C4153F.f46609a;
        }
    }

    public static final <T> InterfaceC1970e<T> a(Ba.p<? super Zb.t<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        return new C1967b(pVar, null, 0, null, 14, null);
    }

    public static final <T> InterfaceC1970e<T> b(Ba.p<? super InterfaceC1971f<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        return new w(pVar);
    }

    public static final <T> InterfaceC1970e<T> c(T t10) {
        return new a(t10);
    }
}
