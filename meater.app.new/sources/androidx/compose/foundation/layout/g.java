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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/g;", "LA0/B;", "Lb0/i$c;", "LA/n;", "direction", "", "fraction", "<init>", "(LA/n;F)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "LA/n;", "getDirection", "()LA/n;", "j2", "(LA/n;)V", "P", "F", "getFraction", "()F", "k2", "(F)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private EnumC0806n direction;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22259B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f22259B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.l(aVar, this.f22259B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public g(EnumC0806n enumC0806n, float f10) {
        this.direction = enumC0806n;
        this.fraction = f10;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!U0.b.h(j10) || this.direction == EnumC0806n.Vertical) {
            iN = U0.b.n(j10);
            iL = U0.b.l(j10);
        } else {
            iN = Ha.g.k(Math.round(U0.b.l(j10) * this.fraction), U0.b.n(j10), U0.b.l(j10));
            iL = iN;
        }
        if (!U0.b.g(j10) || this.direction == EnumC0806n.Horizontal) {
            int iM = U0.b.m(j10);
            iK = U0.b.k(j10);
            iK2 = iM;
        } else {
            iK2 = Ha.g.k(Math.round(U0.b.k(j10) * this.fraction), U0.b.m(j10), U0.b.k(j10));
            iK = iK2;
        }
        Z zT = h10.T(U0.c.a(iN, iL, iK2, iK));
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT), 4, null);
    }

    public final void j2(EnumC0806n enumC0806n) {
        this.direction = enumC0806n;
    }

    public final void k2(float f10) {
        this.fraction = f10;
    }
}
