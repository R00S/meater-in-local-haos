package A;

import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import oa.C4153F;
import y0.InterfaceC5091B;
import y0.Z;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR+\u0010$\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0007R+\u0010(\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010\u0007R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"LA/E;", "Ly0/B;", "Lz0/d;", "Lz0/j;", "LA/d0;", "insets", "<init>", "(LA/d0;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Lz0/k;", "scope", "Loa/F;", "g", "(Lz0/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LA/d0;", "<set-?>", "c", "LO/p0;", "n", "()LA/d0;", "v", "unconsumedInsets", "d", "m", "s", "consumedInsets", "Lz0/l;", "getKey", "()Lz0/l;", "key", "p", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E implements InterfaceC5091B, z0.d, z0.j<d0> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 insets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 unconsumedInsets;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 consumedInsets;

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ y0.Z f10B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f11C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f12D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0.Z z10, int i10, int i11) {
            super(1);
            this.f10B = z10;
            this.f11C = i10;
            this.f12D = i11;
        }

        public final void a(Z.a aVar) {
            Z.a.h(aVar, this.f10B, this.f11C, this.f12D, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public E(d0 d0Var) {
        this.insets = d0Var;
        this.unconsumedInsets = r1.c(d0Var, null, 2, null);
        this.consumedInsets = r1.c(d0Var, null, 2, null);
    }

    private final d0 m() {
        return (d0) this.consumedInsets.getValue();
    }

    private final d0 n() {
        return (d0) this.unconsumedInsets.getValue();
    }

    private final void s(d0 d0Var) {
        this.consumedInsets.setValue(d0Var);
    }

    private final void v(d0 d0Var) {
        this.unconsumedInsets.setValue(d0Var);
    }

    @Override // y0.InterfaceC5091B
    public y0.J b(y0.K k10, y0.H h10, long j10) {
        int iC = n().c(k10, k10.getLayoutDirection());
        int iB = n().b(k10);
        int iA = n().a(k10, k10.getLayoutDirection()) + iC;
        int iD = n().d(k10) + iB;
        y0.Z zT = h10.T(U0.c.n(j10, -iA, -iD));
        return y0.K.E1(k10, U0.c.i(j10, zT.getWidth() + iA), U0.c.h(j10, zT.getHeight() + iD), null, new a(zT, iC, iB), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof E) {
            return C3862t.b(((E) other).insets, this.insets);
        }
        return false;
    }

    @Override // z0.d
    public void g(z0.k scope) {
        d0 d0Var = (d0) scope.J(g0.a());
        v(f0.e(this.insets, d0Var));
        s(f0.g(d0Var, this.insets));
    }

    @Override // z0.j
    public z0.l<d0> getKey() {
        return g0.a();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // z0.j
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public d0 getValue() {
        return m();
    }
}
