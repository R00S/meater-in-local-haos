package kotlin;

import Ba.q;
import U0.y;
import U0.z;
import Xb.I;
import androidx.compose.foundation.gestures.DraggableElement;
import b0.i;
import h0.C3476g;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.InterfaceC5162k;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a¥\u0001\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122*\b\u0002\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u001f\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0016\u0010 \u001a\u00020\u001e*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\"6\u0010#\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"\"6\u0010%\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lkotlin/Function1;", "", "Loa/F;", "onDelta", "Lx/m;", "a", "(LBa/l;)Lx/m;", "i", "(LBa/l;LO/l;I)Lx/m;", "Lb0/i;", "state", "Lx/q;", "orientation", "", "enabled", "Lz/k;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LXb/I;", "Lh0/g;", "Lta/d;", "", "onDragStarted", "onDragStopped", "reverseDirection", "g", "(Lb0/i;Lx/m;Lx/q;ZLz/k;ZLBa/q;LBa/q;Z)Lb0/i;", "j", "(JLx/q;)F", "LU0/y;", "k", "l", "(J)J", "LBa/q;", "NoOpOnDragStarted", "b", "NoOpOnDragStopped", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.l, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5032l {

    /* renamed from: a, reason: collision with root package name */
    private static final q<I, C3476g, InterfaceC4588d<? super C4153F>, Object> f52478a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final q<I, Float, InterfaceC4588d<? super C4153F>, Object> f52479b = new b(null);

    /* compiled from: Draggable.kt */
    @f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXb/I;", "Lh0/g;", "it", "Loa/F;", "<anonymous>", "(LXb/I;Lh0/g;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.l$a */
    static final class a extends l implements q<I, C3476g, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52480B;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(I i10, long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return new a(interfaceC4588d).invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(I i10, C3476g c3476g, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(i10, c3476g.getPackedValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f52480B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Draggable.kt */
    @f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXb/I;", "", "it", "Loa/F;", "<anonymous>", "(LXb/I;F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.l$b */
    static final class b extends l implements q<I, Float, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52481B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(I i10, float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return new b(interfaceC4588d).invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(I i10, Float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(i10, f10.floatValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f52481B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.l$c */
    static final class c extends AbstractC3864v implements Ba.l<Float, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<Ba.l<Float, C4153F>> f52482B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(x1<? extends Ba.l<? super Float, C4153F>> x1Var) {
            super(1);
            this.f52482B = x1Var;
        }

        public final void a(float f10) {
            this.f52482B.getValue().invoke(Float.valueOf(f10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Float f10) {
            a(f10.floatValue());
            return C4153F.f46609a;
        }
    }

    public static final InterfaceC5033m a(Ba.l<? super Float, C4153F> lVar) {
        return new C5027g(lVar);
    }

    public static final i g(i iVar, InterfaceC5033m interfaceC5033m, EnumC5037q enumC5037q, boolean z10, InterfaceC5162k interfaceC5162k, boolean z11, q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, q<? super I, ? super Float, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar2, boolean z12) {
        return iVar.e(new DraggableElement(interfaceC5033m, enumC5037q, z10, interfaceC5162k, z11, qVar, qVar2, z12));
    }

    public static final InterfaceC5033m i(Ba.l<? super Float, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        x1 x1VarM = m1.m(lVar, interfaceC1554l, i10 & 14);
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = a(new c(x1VarM));
            interfaceC1554l.J(objF);
        }
        InterfaceC5033m interfaceC5033m = (InterfaceC5033m) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC5033m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(long j10, EnumC5037q enumC5037q) {
        return enumC5037q == EnumC5037q.Vertical ? C3476g.n(j10) : C3476g.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(long j10, EnumC5037q enumC5037q) {
        return enumC5037q == EnumC5037q.Vertical ? y.i(j10) : y.h(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        return z.a(Float.isNaN(y.h(j10)) ? 0.0f : y.h(j10), Float.isNaN(y.i(j10)) ? 0.0f : y.i(j10));
    }
}
