package androidx.compose.foundation.layout;

import A.EnumC0806n;
import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/u;", "LA0/B;", "Lb0/i$c;", "LA/n;", "direction", "", "unbounded", "Lkotlin/Function2;", "LU0/r;", "LU0/t;", "LU0/n;", "alignmentCallback", "<init>", "(LA/n;ZLBa/p;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "LA/n;", "getDirection", "()LA/n;", "l2", "(LA/n;)V", "P", "Z", "getUnbounded", "()Z", "m2", "(Z)V", "Q", "LBa/p;", "j2", "()LBa/p;", "k2", "(LBa/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private EnumC0806n direction;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean unbounded;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super U0.r, ? super U0.t, U0.n> alignmentCallback;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f22335C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Z f22336D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f22337E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ K f22338F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Z z10, int i11, K k10) {
            super(1);
            this.f22335C = i10;
            this.f22336D = z10;
            this.f22337E = i11;
            this.f22338F = k10;
        }

        public final void a(Z.a aVar) {
            Z.a.j(aVar, this.f22336D, u.this.j2().invoke(U0.r.b(U0.s.a(this.f22335C - this.f22336D.getWidth(), this.f22337E - this.f22336D.getHeight())), this.f22338F.getLayoutDirection()).getPackedValue(), 0.0f, 2, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public u(EnumC0806n enumC0806n, boolean z10, Ba.p<? super U0.r, ? super U0.t, U0.n> pVar) {
        this.direction = enumC0806n;
        this.unbounded = z10;
        this.alignmentCallback = pVar;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        EnumC0806n enumC0806n = this.direction;
        EnumC0806n enumC0806n2 = EnumC0806n.Vertical;
        int iN = enumC0806n != enumC0806n2 ? 0 : U0.b.n(j10);
        EnumC0806n enumC0806n3 = this.direction;
        EnumC0806n enumC0806n4 = EnumC0806n.Horizontal;
        Z zT = h10.T(U0.c.a(iN, (this.direction == enumC0806n2 || !this.unbounded) ? U0.b.l(j10) : Integer.MAX_VALUE, enumC0806n3 == enumC0806n4 ? U0.b.m(j10) : 0, (this.direction == enumC0806n4 || !this.unbounded) ? U0.b.k(j10) : Integer.MAX_VALUE));
        int iK = Ha.g.k(zT.getWidth(), U0.b.n(j10), U0.b.l(j10));
        int iK2 = Ha.g.k(zT.getHeight(), U0.b.m(j10), U0.b.k(j10));
        return K.E1(k10, iK, iK2, null, new a(iK, zT, iK2, k10), 4, null);
    }

    public final Ba.p<U0.r, U0.t, U0.n> j2() {
        return this.alignmentCallback;
    }

    public final void k2(Ba.p<? super U0.r, ? super U0.t, U0.n> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void l2(EnumC0806n enumC0806n) {
        this.direction = enumC0806n;
    }

    public final void m2(boolean z10) {
        this.unbounded = z10;
    }
}
