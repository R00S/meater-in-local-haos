package androidx.compose.foundation.layout;

import A0.B;
import U0.h;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import y0.H;
import y0.InterfaceC5112q;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/t;", "LA0/B;", "Lb0/i$c;", "LU0/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/k;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "z", "width", "L", "o", "O", "F", "getMinWidth-D9Ej5fM", "()F", "k2", "(F)V", "P", "getMinHeight-D9Ej5fM", "j2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class t extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22330B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f22330B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.l(aVar, this.f22330B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ t(float f10, float f11, C3854k c3854k) {
        this(f10, f11);
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return Ha.g.d(interfaceC5112q.f0(i10), !U0.h.w(this.minHeight, U0.h.INSTANCE.c()) ? rVar.i1(this.minHeight) : 0);
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        float f10 = this.minWidth;
        h.Companion companion = U0.h.INSTANCE;
        Z zT = h10.T(U0.c.a((U0.h.w(f10, companion.c()) || U0.b.n(j10) != 0) ? U0.b.n(j10) : Ha.g.d(Ha.g.g(k10.i1(this.minWidth), U0.b.l(j10)), 0), U0.b.l(j10), (U0.h.w(this.minHeight, companion.c()) || U0.b.m(j10) != 0) ? U0.b.m(j10) : Ha.g.d(Ha.g.g(k10.i1(this.minHeight), U0.b.k(j10)), 0), U0.b.k(j10)));
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT), 4, null);
    }

    public final void j2(float f10) {
        this.minHeight = f10;
    }

    public final void k2(float f10) {
        this.minWidth = f10;
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return Ha.g.d(interfaceC5112q.q(i10), !U0.h.w(this.minHeight, U0.h.INSTANCE.c()) ? rVar.i1(this.minHeight) : 0);
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return Ha.g.d(interfaceC5112q.Q(i10), !U0.h.w(this.minWidth, U0.h.INSTANCE.c()) ? rVar.i1(this.minWidth) : 0);
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return Ha.g.d(interfaceC5112q.S(i10), !U0.h.w(this.minWidth, U0.h.INSTANCE.c()) ? rVar.i1(this.minWidth) : 0);
    }

    private t(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
