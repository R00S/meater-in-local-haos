package J;

import Xb.I;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.x1;
import oa.InterfaceC4156a;
import w.InterfaceC4948A;
import z.InterfaceC5159h;
import z.m;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001a\u001a\u00020\r*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"LJ/o;", "Lw/A;", "", "bounded", "LO/x1;", "LJ/g;", "rippleAlpha", "<init>", "(ZLO/x1;)V", "Lz/m$b;", "interaction", "LXb/I;", "scope", "Loa/F;", "e", "(Lz/m$b;LXb/I;)V", "g", "(Lz/m$b;)V", "Lz/h;", "h", "(Lz/h;LXb/I;)V", "Lk0/f;", "LU0/h;", "radius", "Li0/t0;", "color", "f", "(Lk0/f;FJ)V", "B", "Z", "LJ/u;", "C", "LJ/u;", "stateLayer", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public abstract class o implements InterfaceC4948A {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final u stateLayer;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LJ/g;", "a", "()LJ/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<RippleAlpha> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<RippleAlpha> f7132B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x1<RippleAlpha> x1Var) {
            super(0);
            this.f7132B = x1Var;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RippleAlpha invoke() {
            return this.f7132B.getValue();
        }
    }

    public o(boolean z10, x1<RippleAlpha> x1Var) {
        this.bounded = z10;
        this.stateLayer = new u(z10, new a(x1Var));
    }

    public abstract void e(m.b interaction, I scope);

    public final void f(k0.f fVar, float f10, long j10) {
        this.stateLayer.b(fVar, Float.isNaN(f10) ? i.a(fVar, this.bounded, fVar.C()) : fVar.X0(f10), j10);
    }

    public abstract void g(m.b interaction);

    public final void h(InterfaceC5159h interaction, I scope) {
        this.stateLayer.c(interaction, scope);
    }
}
