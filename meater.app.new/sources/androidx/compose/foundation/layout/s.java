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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00106\u001a\u00020\u000f*\u0002038BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/s;", "LA0/B;", "Lb0/i$c;", "LU0/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/k;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "O", "F", "getMinWidth-D9Ej5fM", "()F", "o2", "(F)V", "P", "getMinHeight-D9Ej5fM", "n2", "Q", "getMaxWidth-D9Ej5fM", "m2", "R", "getMaxHeight-D9Ej5fM", "l2", "S", "Z", "getEnforceIncoming", "()Z", "k2", "(Z)V", "LU0/d;", "j2", "(LU0/d;)J", "targetConstraints", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float minHeight;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private float maxWidth;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private float maxHeight;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22327B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10) {
            super(1);
            this.f22327B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.l(aVar, this.f22327B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ s(float f10, float f11, float f12, float f13, boolean z10, C3854k c3854k) {
        this(f10, f11, f12, f13, z10);
    }

    private final long j2(U0.d dVar) {
        int iD;
        int iD2;
        float f10 = this.maxWidth;
        h.Companion companion = U0.h.INSTANCE;
        int i10 = 0;
        int iD3 = !U0.h.w(f10, companion.c()) ? Ha.g.d(dVar.i1(this.maxWidth), 0) : Integer.MAX_VALUE;
        int iD4 = !U0.h.w(this.maxHeight, companion.c()) ? Ha.g.d(dVar.i1(this.maxHeight), 0) : Integer.MAX_VALUE;
        if (U0.h.w(this.minWidth, companion.c()) || (iD = Ha.g.d(Ha.g.g(dVar.i1(this.minWidth), iD3), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!U0.h.w(this.minHeight, companion.c()) && (iD2 = Ha.g.d(Ha.g.g(dVar.i1(this.minHeight), iD4), 0)) != Integer.MAX_VALUE) {
            i10 = iD2;
        }
        return U0.c.a(iD, iD3, i10, iD4);
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        long jJ2 = j2(rVar);
        return U0.b.i(jJ2) ? U0.b.k(jJ2) : U0.c.h(jJ2, interfaceC5112q.f0(i10));
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        long jA;
        long jJ2 = j2(k10);
        if (this.enforceIncoming) {
            jA = U0.c.g(j10, jJ2);
        } else {
            float f10 = this.minWidth;
            h.Companion companion = U0.h.INSTANCE;
            jA = U0.c.a(!U0.h.w(f10, companion.c()) ? U0.b.n(jJ2) : Ha.g.g(U0.b.n(j10), U0.b.l(jJ2)), !U0.h.w(this.maxWidth, companion.c()) ? U0.b.l(jJ2) : Ha.g.d(U0.b.l(j10), U0.b.n(jJ2)), !U0.h.w(this.minHeight, companion.c()) ? U0.b.m(jJ2) : Ha.g.g(U0.b.m(j10), U0.b.k(jJ2)), !U0.h.w(this.maxHeight, companion.c()) ? U0.b.k(jJ2) : Ha.g.d(U0.b.k(j10), U0.b.m(jJ2)));
        }
        Z zT = h10.T(jA);
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT), 4, null);
    }

    public final void k2(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void l2(float f10) {
        this.maxHeight = f10;
    }

    public final void m2(float f10) {
        this.maxWidth = f10;
    }

    public final void n2(float f10) {
        this.minHeight = f10;
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        long jJ2 = j2(rVar);
        return U0.b.i(jJ2) ? U0.b.k(jJ2) : U0.c.h(jJ2, interfaceC5112q.q(i10));
    }

    public final void o2(float f10) {
        this.minWidth = f10;
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        long jJ2 = j2(rVar);
        return U0.b.j(jJ2) ? U0.b.l(jJ2) : U0.c.i(jJ2, interfaceC5112q.Q(i10));
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        long jJ2 = j2(rVar);
        return U0.b.j(jJ2) ? U0.b.l(jJ2) : U0.c.i(jJ2, interfaceC5112q.S(i10));
    }

    private s(float f10, float f11, float f12, float f13, boolean z10) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
    }
}
