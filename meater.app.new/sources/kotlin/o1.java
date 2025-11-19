package kotlin;

import Ba.p;
import Xb.I;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "LO/E0;", "Lta/d;", "Loa/F;", "", "producer", "LO/x1;", "a", "(Ljava/lang/Object;LBa/p;LO/l;I)LO/x1;", "key1", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LBa/p;LO/l;I)LO/x1;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class o1 {

    /* compiled from: ProduceState.kt */
    @f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {83}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12957B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f12958C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1497E0<T>, InterfaceC4588d<? super C4153F>, Object> f12959D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<T> f12960E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super InterfaceC1497E0<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1563p0<T> interfaceC1563p0, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12959D = pVar;
            this.f12960E = interfaceC1563p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f12959D, this.f12960E, interfaceC4588d);
            aVar.f12958C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f12957B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f12958C;
                p<InterfaceC1497E0<T>, InterfaceC4588d<? super C4153F>, Object> pVar = this.f12959D;
                C1499F0 c1499f0 = new C1499F0(this.f12960E, i11.getCoroutineContext());
                this.f12957B = 1;
                if (pVar.invoke(c1499f0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: ProduceState.kt */
    @f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12961B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f12962C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1497E0<T>, InterfaceC4588d<? super C4153F>, Object> f12963D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<T> f12964E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super InterfaceC1497E0<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1563p0<T> interfaceC1563p0, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12963D = pVar;
            this.f12964E = interfaceC1563p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f12963D, this.f12964E, interfaceC4588d);
            bVar.f12962C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f12961B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f12962C;
                p<InterfaceC1497E0<T>, InterfaceC4588d<? super C4153F>, Object> pVar = this.f12963D;
                C1499F0 c1499f0 = new C1499F0(this.f12964E, i11.getCoroutineContext());
                this.f12961B = 1;
                if (pVar.invoke(c1499f0, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public static final <T> x1<T> a(T t10, p<? super InterfaceC1497E0<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = r1.c(t10, null, 2, null);
            interfaceC1554l.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        C4153F c4153f = C4153F.f46609a;
        boolean zL = interfaceC1554l.l(pVar);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == companion.a()) {
            objF2 = new a(pVar, interfaceC1563p0, null);
            interfaceC1554l.J(objF2);
        }
        C1516O.e(c4153f, (p) objF2, interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC1563p0;
    }

    public static final <T> x1<T> b(T t10, Object obj, Object obj2, p<? super InterfaceC1497E0<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = r1.c(t10, null, 2, null);
            interfaceC1554l.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        boolean zL = interfaceC1554l.l(pVar);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == companion.a()) {
            objF2 = new b(pVar, interfaceC1563p0, null);
            interfaceC1554l.J(objF2);
        }
        C1516O.f(obj, obj2, (p) objF2, interfaceC1554l, (i10 >> 3) & 126);
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC1563p0;
    }
}
