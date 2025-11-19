package androidx.compose.foundation.layout;

import A.N;
import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/q;", "LA0/B;", "Lb0/i$c;", "LA/N;", "paddingValues", "<init>", "(LA/N;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "LA/N;", "j2", "()LA/N;", "k2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private N paddingValues;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22298B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ K f22299C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q f22300D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z z10, K k10, q qVar) {
            super(1);
            this.f22298B = z10;
            this.f22299C = k10;
            this.f22300D = qVar;
        }

        public final void a(Z.a aVar) {
            Z.a.h(aVar, this.f22298B, this.f22299C.i1(this.f22300D.getPaddingValues().a(this.f22299C.getLayoutDirection())), this.f22299C.i1(this.f22300D.getPaddingValues().getTop()), 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public q(N n10) {
        this.paddingValues = n10;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        float f10 = 0;
        if (U0.h.t(this.paddingValues.a(k10.getLayoutDirection()), U0.h.u(f10)) < 0 || U0.h.t(this.paddingValues.getTop(), U0.h.u(f10)) < 0 || U0.h.t(this.paddingValues.c(k10.getLayoutDirection()), U0.h.u(f10)) < 0 || U0.h.t(this.paddingValues.getBottom(), U0.h.u(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iI1 = k10.i1(this.paddingValues.a(k10.getLayoutDirection())) + k10.i1(this.paddingValues.c(k10.getLayoutDirection()));
        int iI12 = k10.i1(this.paddingValues.getTop()) + k10.i1(this.paddingValues.getBottom());
        Z zT = h10.T(U0.c.n(j10, -iI1, -iI12));
        return K.E1(k10, U0.c.i(j10, zT.getWidth() + iI1), U0.c.h(j10, zT.getHeight() + iI12), null, new a(zT, k10, this), 4, null);
    }

    /* renamed from: j2, reason: from getter */
    public final N getPaddingValues() {
        return this.paddingValues;
    }

    public final void k2(N n10) {
        this.paddingValues = n10;
    }
}
