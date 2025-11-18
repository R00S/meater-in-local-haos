package kotlin;

import Ba.l;
import Ba.p;
import Xb.I;
import Xb.J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.C4951D;
import w.EnumC4950C;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lx/g;", "Lx/m;", "Lkotlin/Function1;", "", "Loa/F;", "onDelta", "<init>", "(LBa/l;)V", "Lw/C;", "dragPriority", "Lkotlin/Function2;", "Lx/k;", "Lta/d;", "", "block", "a", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "LBa/l;", "d", "()LBa/l;", "b", "Lx/k;", "dragScope", "Lw/D;", "c", "Lw/D;", "scrollMutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5027g implements InterfaceC5033m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, C4153F> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5031k dragScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4951D scrollMutex = new C4951D();

    /* compiled from: Draggable.kt */
    @f(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {626}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52380B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ EnumC4950C f52382D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC5031k, InterfaceC4588d<? super C4153F>, Object> f52383E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC4950C enumC4950C, p<? super InterfaceC5031k, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52382D = enumC4950C;
            this.f52383E = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C5027g.this.new a(this.f52382D, this.f52383E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52380B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4951D c4951d = C5027g.this.scrollMutex;
                InterfaceC5031k interfaceC5031k = C5027g.this.dragScope;
                EnumC4950C enumC4950C = this.f52382D;
                p<InterfaceC5031k, InterfaceC4588d<? super C4153F>, Object> pVar = this.f52383E;
                this.f52380B = 1;
                if (c4951d.d(interfaceC5031k, enumC4950C, pVar, this) == objE) {
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

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x/g$b", "Lx/k;", "", "pixels", "Loa/F;", "a", "(F)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.g$b */
    public static final class b implements InterfaceC5031k {
        b() {
        }

        @Override // kotlin.InterfaceC5031k
        public void a(float pixels) {
            C5027g.this.d().invoke(Float.valueOf(pixels));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5027g(l<? super Float, C4153F> lVar) {
        this.onDelta = lVar;
    }

    @Override // kotlin.InterfaceC5033m
    public Object a(EnumC4950C enumC4950C, p<? super InterfaceC5031k, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new a(enumC4950C, pVar, null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    public final l<Float, C4153F> d() {
        return this.onDelta;
    }
}
