package y0;

import kotlin.Metadata;
import l0.C3870c;
import oa.C4153F;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R0\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020&8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R*\u0010-\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0014\u00101\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Ly0/Z;", "Ly0/L;", "<init>", "()V", "Loa/F;", "B0", "LU0/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "C0", "(JFLBa/l;)V", "Ll0/c;", "layer", "D0", "(JFLl0/c;)V", "", "<set-?>", "B", "I", "A0", "()I", "width", "C", "t0", "height", "LU0/r;", "value", "D", "J", "w0", "()J", "K0", "(J)V", "measuredSize", "LU0/b;", "E", "z0", "L0", "measurementConstraints", "F", "s0", "apparentToRealOffset", "y0", "measuredWidth", "v0", "measuredHeight", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Z implements L {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private long measuredSize = U0.s.a(0, 0);

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints = a0.f53008b;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset = U0.n.INSTANCE.a();

    /* compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJ<\u0010\u0018\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0019J.\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010 J.\u0010!\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b!\u0010 J!\u0010#\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8$X¤\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Ly0/Z$a;", "", "<init>", "()V", "Ly0/Z;", "Loa/F;", "f", "(Ly0/Z;)V", "LU0/n;", "position", "", "zIndex", "m", "(Ly0/Z;JF)V", "", "x", "y", "k", "(Ly0/Z;IIF)V", "g", "i", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "q", "(Ly0/Z;JFLBa/l;)V", "o", "(Ly0/Z;IIFLBa/l;)V", "u", "w", "Ll0/c;", "layer", "(Ly0/Z;JLl0/c;F)V", "r", "block", "A", "(LBa/l;)V", "", "a", "Z", "motionFrameOfReferencePlacement", "e", "()I", "parentWidth", "LU0/t;", "d", "()LU0/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(Z z10) {
            if (z10 instanceof A0.W) {
                ((A0.W) z10).a0(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void h(a aVar, Z z10, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.g(z10, i10, i11, f10);
        }

        public static /* synthetic */ void j(a aVar, Z z10, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.i(z10, j10, f10);
        }

        public static /* synthetic */ void l(a aVar, Z z10, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.k(z10, i10, i11, f10);
        }

        public static /* synthetic */ void n(a aVar, Z z10, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m(z10, j10, f10);
        }

        public static /* synthetic */ void p(a aVar, Z z10, int i10, int i11, float f10, Ba.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = a0.f53007a;
            }
            aVar.o(z10, i10, i11, f11, lVar);
        }

        public static /* synthetic */ void s(a aVar, Z z10, long j10, float f10, Ba.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = a0.f53007a;
            }
            aVar.q(z10, j10, f11, lVar);
        }

        public static /* synthetic */ void t(a aVar, Z z10, long j10, C3870c c3870c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.r(z10, j10, c3870c, f10);
        }

        public static /* synthetic */ void v(a aVar, Z z10, int i10, int i11, float f10, Ba.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = a0.f53007a;
            }
            aVar.u(z10, i10, i11, f11, lVar);
        }

        public static /* synthetic */ void y(a aVar, Z z10, long j10, float f10, Ba.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = a0.f53007a;
            }
            aVar.w(z10, j10, f11, lVar);
        }

        public static /* synthetic */ void z(a aVar, Z z10, long j10, C3870c c3870c, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.x(z10, j10, c3870c, f10);
        }

        public final void A(Ba.l<? super a, C4153F> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: d */
        public abstract U0.t getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public abstract int getParentWidth();

        public final void g(Z z10, int i10, int i11, float f10) {
            long jA = U0.o.a(i10, i11);
            f(z10);
            z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, null);
        }

        public final void i(Z z10, long j10, float f10) {
            f(z10);
            z10.C0(U0.n.l(j10, z10.apparentToRealOffset), f10, null);
        }

        public final void k(Z z10, int i10, int i11, float f10) {
            long jA = U0.o.a(i10, i11);
            if (getParentLayoutDirection() == U0.t.Ltr || getParentWidth() == 0) {
                f(z10);
                z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, null);
            } else {
                long jA2 = U0.o.a((getParentWidth() - z10.getWidth()) - U0.n.h(jA), U0.n.i(jA));
                f(z10);
                z10.C0(U0.n.l(jA2, z10.apparentToRealOffset), f10, null);
            }
        }

        public final void m(Z z10, long j10, float f10) {
            if (getParentLayoutDirection() == U0.t.Ltr || getParentWidth() == 0) {
                f(z10);
                z10.C0(U0.n.l(j10, z10.apparentToRealOffset), f10, null);
            } else {
                long jA = U0.o.a((getParentWidth() - z10.getWidth()) - U0.n.h(j10), U0.n.i(j10));
                f(z10);
                z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, null);
            }
        }

        public final void o(Z z10, int i10, int i11, float f10, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
            long jA = U0.o.a(i10, i11);
            if (getParentLayoutDirection() == U0.t.Ltr || getParentWidth() == 0) {
                f(z10);
                z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, lVar);
            } else {
                long jA2 = U0.o.a((getParentWidth() - z10.getWidth()) - U0.n.h(jA), U0.n.i(jA));
                f(z10);
                z10.C0(U0.n.l(jA2, z10.apparentToRealOffset), f10, lVar);
            }
        }

        public final void q(Z z10, long j10, float f10, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
            if (getParentLayoutDirection() == U0.t.Ltr || getParentWidth() == 0) {
                f(z10);
                z10.C0(U0.n.l(j10, z10.apparentToRealOffset), f10, lVar);
            } else {
                long jA = U0.o.a((getParentWidth() - z10.getWidth()) - U0.n.h(j10), U0.n.i(j10));
                f(z10);
                z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, lVar);
            }
        }

        public final void r(Z z10, long j10, C3870c c3870c, float f10) {
            if (getParentLayoutDirection() == U0.t.Ltr || getParentWidth() == 0) {
                f(z10);
                z10.D0(U0.n.l(j10, z10.apparentToRealOffset), f10, c3870c);
            } else {
                long jA = U0.o.a((getParentWidth() - z10.getWidth()) - U0.n.h(j10), U0.n.i(j10));
                f(z10);
                z10.D0(U0.n.l(jA, z10.apparentToRealOffset), f10, c3870c);
            }
        }

        public final void u(Z z10, int i10, int i11, float f10, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
            long jA = U0.o.a(i10, i11);
            f(z10);
            z10.C0(U0.n.l(jA, z10.apparentToRealOffset), f10, lVar);
        }

        public final void w(Z z10, long j10, float f10, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
            f(z10);
            z10.C0(U0.n.l(j10, z10.apparentToRealOffset), f10, lVar);
        }

        public final void x(Z z10, long j10, C3870c c3870c, float f10) {
            f(z10);
            z10.D0(U0.n.l(j10, z10.apparentToRealOffset), f10, c3870c);
        }
    }

    private final void B0() {
        this.width = Ha.g.k(U0.r.g(this.measuredSize), U0.b.n(this.measurementConstraints), U0.b.l(this.measurementConstraints));
        this.height = Ha.g.k(U0.r.f(this.measuredSize), U0.b.m(this.measurementConstraints), U0.b.k(this.measurementConstraints));
        this.apparentToRealOffset = U0.o.a((this.width - U0.r.g(this.measuredSize)) / 2, (this.height - U0.r.f(this.measuredSize)) / 2);
    }

    /* renamed from: A0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock);

    /* JADX INFO: Access modifiers changed from: protected */
    public void D0(long position, float zIndex, C3870c layer) {
        C0(position, zIndex, null);
    }

    protected final void K0(long j10) {
        if (U0.r.e(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        B0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L0(long j10) {
        if (U0.b.f(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        B0();
    }

    /* renamed from: s0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* renamed from: t0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int v0() {
        return U0.r.f(this.measuredSize);
    }

    /* renamed from: w0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int y0() {
        return U0.r.g(this.measuredSize);
    }

    /* renamed from: z0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }
}
