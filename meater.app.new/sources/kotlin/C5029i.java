package kotlin;

import Ba.l;
import Ba.p;
import Xb.I;
import Xb.J;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.r1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.C4951D;
import w.EnumC4950C;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010'\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010&¨\u0006("}, d2 = {"Lx/i;", "Lx/x;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(LBa/l;)V", "Lw/C;", "scrollPriority", "Lkotlin/Function2;", "Lx/u;", "Lta/d;", "Loa/F;", "", "block", "b", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "delta", "f", "(F)F", "a", "LBa/l;", "l", "()LBa/l;", "Lx/u;", "scrollScope", "Lw/D;", "c", "Lw/D;", "scrollMutex", "LO/p0;", "", "d", "LO/p0;", "isScrollingState", "e", "isLastScrollForwardState", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5029i implements InterfaceC5044x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> onDelta;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5041u scrollScope = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4951D scrollMutex = new C4951D();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<Boolean> isScrollingState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<Boolean> isLastScrollForwardState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<Boolean> isLastScrollBackwardState;

    /* compiled from: ScrollableState.kt */
    @f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.i$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52404B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ EnumC4950C f52406D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> f52407E;

        /* compiled from: ScrollableState.kt */
        @f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {204}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/u;", "Loa/F;", "<anonymous>", "(Lx/u;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.i$a$a, reason: collision with other inner class name */
        static final class C0765a extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f52408B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f52409C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C5029i f52410D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> f52411E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0765a(C5029i c5029i, p<? super InterfaceC5041u, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C0765a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f52410D = c5029i;
                this.f52411E = pVar;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5041u interfaceC5041u, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0765a) create(interfaceC5041u, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0765a c0765a = new C0765a(this.f52410D, this.f52411E, interfaceC4588d);
                c0765a.f52409C = obj;
                return c0765a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f52408B;
                try {
                    if (i10 == 0) {
                        C4173r.b(obj);
                        InterfaceC5041u interfaceC5041u = (InterfaceC5041u) this.f52409C;
                        this.f52410D.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> pVar = this.f52411E;
                        this.f52408B = 1;
                        if (pVar.invoke(interfaceC5041u, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    this.f52410D.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return C4153F.f46609a;
                } catch (Throwable th) {
                    this.f52410D.isScrollingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(EnumC4950C enumC4950C, p<? super InterfaceC5041u, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52406D = enumC4950C;
            this.f52407E = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C5029i.this.new a(this.f52406D, this.f52407E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52404B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4951D c4951d = C5029i.this.scrollMutex;
                InterfaceC5041u interfaceC5041u = C5029i.this.scrollScope;
                EnumC4950C enumC4950C = this.f52406D;
                C0765a c0765a = new C0765a(C5029i.this, this.f52407E, null);
                this.f52404B = 1;
                if (c4951d.d(interfaceC5041u, enumC4950C, c0765a, this) == objE) {
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

    /* compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"x/i$b", "Lx/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.i$b */
    public static final class b implements InterfaceC5041u {
        b() {
        }

        @Override // kotlin.InterfaceC5041u
        public float a(float pixels) {
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = C5029i.this.l().invoke(Float.valueOf(pixels)).floatValue();
            C5029i.this.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            C5029i.this.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5029i(l<? super Float, Float> lVar) {
        this.onDelta = lVar;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = r1.c(bool, null, 2, null);
        this.isLastScrollForwardState = r1.c(bool, null, 2, null);
        this.isLastScrollBackwardState = r1.c(bool, null, 2, null);
    }

    @Override // kotlin.InterfaceC5044x
    public boolean a() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // kotlin.InterfaceC5044x
    public Object b(EnumC4950C enumC4950C, p<? super InterfaceC5041u, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new a(enumC4950C, pVar, null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    @Override // kotlin.InterfaceC5044x
    public float f(float delta) {
        return this.onDelta.invoke(Float.valueOf(delta)).floatValue();
    }

    public final l<Float, Float> l() {
        return this.onDelta;
    }
}
