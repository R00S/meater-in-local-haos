package w;

import b0.i;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.InterfaceC5112q;
import y0.Z;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001a\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J#\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lw/M;", "LA0/B;", "Lb0/i$c;", "Landroidx/compose/foundation/o;", "scrollerState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZZ)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "O", "Landroidx/compose/foundation/o;", "j2", "()Landroidx/compose/foundation/o;", "n2", "(Landroidx/compose/foundation/o;)V", "P", "Z", "k2", "()Z", "m2", "(Z)V", "Q", "l2", "o2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M extends i.c implements A0.B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.o scrollerState;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isReversed;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f51683C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z f51684D;

        /* compiled from: Scroll.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: w.M$a$a, reason: collision with other inner class name */
        static final class C0744a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Z f51685B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f51686C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f51687D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0744a(Z z10, int i10, int i11) {
                super(1);
                this.f51685B = z10;
                this.f51686C = i10;
                this.f51687D = i11;
            }

            public final void a(Z.a aVar) {
                Z.a.p(aVar, this.f51685B, this.f51686C, this.f51687D, 0.0f, null, 12, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Z z10) {
            super(1);
            this.f51683C = i10;
            this.f51684D = z10;
        }

        public final void a(Z.a aVar) {
            int iK = Ha.g.k(M.this.getScrollerState().m(), 0, this.f51683C);
            int i10 = M.this.getIsReversed() ? iK - this.f51683C : -iK;
            aVar.A(new C0744a(this.f51684D, M.this.getIsVertical() ? 0 : i10, M.this.getIsVertical() ? i10 : 0));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public M(androidx.compose.foundation.o oVar, boolean z10, boolean z11) {
        this.scrollerState = oVar;
        this.isReversed = z10;
        this.isVertical = z11;
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.isVertical ? interfaceC5112q.f0(i10) : interfaceC5112q.f0(Integer.MAX_VALUE);
    }

    @Override // A0.B
    public y0.J b(y0.K k10, y0.H h10, long j10) {
        C4961f.a(j10, this.isVertical ? EnumC5037q.Vertical : EnumC5037q.Horizontal);
        Z zT = h10.T(U0.b.d(j10, 0, this.isVertical ? U0.b.l(j10) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : U0.b.k(j10), 5, null));
        int iG = Ha.g.g(zT.getWidth(), U0.b.l(j10));
        int iG2 = Ha.g.g(zT.getHeight(), U0.b.k(j10));
        int height = zT.getHeight() - iG2;
        int width = zT.getWidth() - iG;
        if (!this.isVertical) {
            height = width;
        }
        this.scrollerState.n(height);
        this.scrollerState.p(this.isVertical ? iG2 : iG);
        return y0.K.E1(k10, iG, iG2, null, new a(height, zT), 4, null);
    }

    /* renamed from: j2, reason: from getter */
    public final androidx.compose.foundation.o getScrollerState() {
        return this.scrollerState;
    }

    /* renamed from: k2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* renamed from: l2, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void m2(boolean z10) {
        this.isReversed = z10;
    }

    public final void n2(androidx.compose.foundation.o oVar) {
        this.scrollerState = oVar;
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.isVertical ? interfaceC5112q.q(i10) : interfaceC5112q.q(Integer.MAX_VALUE);
    }

    public final void o2(boolean z10) {
        this.isVertical = z10;
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.isVertical ? interfaceC5112q.Q(Integer.MAX_VALUE) : interfaceC5112q.Q(i10);
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.isVertical ? interfaceC5112q.S(Integer.MAX_VALUE) : interfaceC5112q.S(i10);
    }
}
