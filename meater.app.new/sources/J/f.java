package J;

import Xb.I;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import i0.C3602t0;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.InterfaceC4948A;
import w.z;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H'ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"LJ/f;", "Lw/z;", "", "bounded", "LU0/h;", "radius", "LO/x1;", "Li0/t0;", "color", "<init>", "(ZFLO/x1;Lkotlin/jvm/internal/k;)V", "Lz/i;", "interactionSource", "Lw/A;", "b", "(Lz/i;LO/l;I)Lw/A;", "LJ/g;", "rippleAlpha", "LJ/o;", "c", "(Lz/i;ZFLO/x1;LO/x1;LO/l;I)LJ/o;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "F", "LO/x1;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public abstract class f implements z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x1<C3602t0> color;

    /* compiled from: Ripple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {219}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7073B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7074C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f7075D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ o f7076E;

        /* compiled from: Ripple.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: J.f$a$a, reason: collision with other inner class name */
        static final class C0146a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ o f7077B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ I f7078C;

            C0146a(o oVar, I i10) {
                this.f7077B = oVar;
                this.f7078C = i10;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                if (interfaceC5159h instanceof m.b) {
                    this.f7077B.e((m.b) interfaceC5159h, this.f7078C);
                } else if (interfaceC5159h instanceof m.c) {
                    this.f7077B.g(((m.c) interfaceC5159h).getPress());
                } else if (interfaceC5159h instanceof m.a) {
                    this.f7077B.g(((m.a) interfaceC5159h).getPress());
                } else {
                    this.f7077B.h(interfaceC5159h, this.f7078C);
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5160i interfaceC5160i, o oVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7075D = interfaceC5160i;
            this.f7076E = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f7075D, this.f7076E, interfaceC4588d);
            aVar.f7074C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7073B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f7074C;
                InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = this.f7075D.b();
                C0146a c0146a = new C0146a(this.f7076E, i11);
                this.f7073B = 1;
                if (interfaceC1970eB.b(c0146a, this) == objE) {
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

    public /* synthetic */ f(boolean z10, float f10, x1 x1Var, C3854k c3854k) {
        this(z10, f10, x1Var);
    }

    @Override // w.z
    @InterfaceC4156a
    public final InterfaceC4948A b(InterfaceC5160i interfaceC5160i, InterfaceC1554l interfaceC1554l, int i10) {
        long jA;
        interfaceC1554l.S(988743187);
        if (C1560o.J()) {
            C1560o.S(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        r rVar = (r) interfaceC1554l.o(s.d());
        if (this.color.getValue().getValue() != 16) {
            interfaceC1554l.S(-303571590);
            interfaceC1554l.I();
            jA = this.color.getValue().getValue();
        } else {
            interfaceC1554l.S(-303521246);
            jA = rVar.a(interfaceC1554l, 0);
            interfaceC1554l.I();
        }
        x1<C3602t0> x1VarM = m1.m(C3602t0.g(jA), interfaceC1554l, 0);
        x1<RippleAlpha> x1VarM2 = m1.m(rVar.b(interfaceC1554l, 0), interfaceC1554l, 0);
        int i11 = i10 & 14;
        o oVarC = c(interfaceC5160i, this.bounded, this.radius, x1VarM, x1VarM2, interfaceC1554l, i11 | ((i10 << 12) & 458752));
        boolean zL = interfaceC1554l.l(oVarC) | (((i11 ^ 6) > 4 && interfaceC1554l.R(interfaceC5160i)) || (i10 & 6) == 4);
        Object objF = interfaceC1554l.f();
        if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new a(interfaceC5160i, oVarC, null);
            interfaceC1554l.J(objF);
        }
        C1516O.f(oVarC, interfaceC5160i, (Ba.p) objF, interfaceC1554l, (i10 << 3) & 112);
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return oVarC;
    }

    public abstract o c(InterfaceC5160i interfaceC5160i, boolean z10, float f10, x1<C3602t0> x1Var, x1<RippleAlpha> x1Var2, InterfaceC1554l interfaceC1554l, int i10);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return this.bounded == fVar.bounded && U0.h.w(this.radius, fVar.radius) && C3862t.b(this.color, fVar.color);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.bounded) * 31) + U0.h.x(this.radius)) * 31) + this.color.hashCode();
    }

    private f(boolean z10, float f10, x1<C3602t0> x1Var) {
        this.bounded = z10;
        this.radius = f10;
        this.color = x1Var;
    }
}
