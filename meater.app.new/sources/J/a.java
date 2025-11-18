package J;

import Xb.I;
import android.view.ViewGroup;
import h0.C3482m;
import i0.C3545H;
import i0.C3602t0;
import i0.InterfaceC3586l0;
import k0.InterfaceC3783c;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.R0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.InterfaceC4156a;
import z.m;

/* compiled from: Ripple.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0011*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R/\u00109\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010?\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010.R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00110F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"LJ/a;", "LJ/o;", "LO/R0;", "LJ/k;", "", "bounded", "LU0/h;", "radius", "LO/x1;", "Li0/t0;", "color", "LJ/g;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLO/x1;LO/x1;Landroid/view/ViewGroup;Lkotlin/jvm/internal/k;)V", "Loa/F;", "k", "()V", "LJ/j;", "m", "()LJ/j;", "Lk0/c;", "a", "(Lk0/c;)V", "Lz/m$b;", "interaction", "LXb/I;", "scope", "e", "(Lz/m$b;LXb/I;)V", "g", "(Lz/m$b;)V", "d", "c", "b", "z0", "D", "Z", "E", "F", "LO/x1;", "G", "H", "Landroid/view/ViewGroup;", "I", "LJ/j;", "rippleContainer", "LJ/n;", "<set-?>", "J", "LO/p0;", "n", "()LJ/n;", "p", "(LJ/n;)V", "rippleHostView", "K", "l", "()Z", "o", "(Z)V", "invalidateTick", "Lh0/m;", "L", "rippleSize", "", "M", "rippleRadius", "Lkotlin/Function0;", "N", "LBa/a;", "onInvalidateRipple", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class a extends o implements R0, k {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final x1<C3602t0> color;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final x1<RippleAlpha> rippleAlpha;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup view;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private j rippleContainer;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 rippleHostView;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 invalidateTick;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private int rippleRadius;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onInvalidateRipple;

    /* compiled from: Ripple.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: J.a$a, reason: collision with other inner class name */
    static final class C0145a extends AbstractC3864v implements Ba.a<C4153F> {
        C0145a() {
            super(0);
        }

        public final void a() {
            a.this.o(!r0.l());
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ a(boolean z10, float f10, x1 x1Var, x1 x1Var2, ViewGroup viewGroup, C3854k c3854k) {
        this(z10, f10, x1Var, x1Var2, viewGroup);
    }

    private final void k() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    private final j m() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            C3862t.d(jVar);
            return jVar;
        }
        j jVarC = t.c(this.view);
        this.rippleContainer = jVarC;
        C3862t.d(jVarC);
        return jVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n n() {
        return (n) this.rippleHostView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.invalidateTick.setValue(Boolean.valueOf(z10));
    }

    private final void p(n nVar) {
        this.rippleHostView.setValue(nVar);
    }

    @Override // w.InterfaceC4948A
    public void a(InterfaceC3783c interfaceC3783c) {
        this.rippleSize = interfaceC3783c.C();
        this.rippleRadius = Float.isNaN(this.radius) ? Da.a.c(i.a(interfaceC3783c, this.bounded, interfaceC3783c.C())) : interfaceC3783c.i1(this.radius);
        long value = this.color.getValue().getValue();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        interfaceC3783c.C1();
        f(interfaceC3783c, this.radius, value);
        InterfaceC3586l0 interfaceC3586l0G = interfaceC3783c.getDrawContext().G();
        l();
        n nVarN = n();
        if (nVarN != null) {
            nVarN.f(interfaceC3783c.C(), value, pressedAlpha);
            nVarN.draw(C3545H.d(interfaceC3586l0G));
        }
    }

    @Override // kotlin.R0
    public void b() {
        k();
    }

    @Override // kotlin.R0
    public void c() {
        k();
    }

    @Override // J.o
    public void e(m.b interaction, I scope) {
        n nVarB = m().b(this);
        nVarB.b(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().getValue(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        p(nVarB);
    }

    @Override // J.o
    public void g(m.b interaction) {
        n nVarN = n();
        if (nVarN != null) {
            nVarN.e();
        }
    }

    @Override // J.k
    public void z0() {
        p(null);
    }

    private a(boolean z10, float f10, x1<C3602t0> x1Var, x1<RippleAlpha> x1Var2, ViewGroup viewGroup) {
        super(z10, x1Var2);
        this.bounded = z10;
        this.radius = f10;
        this.color = x1Var;
        this.rippleAlpha = x1Var2;
        this.view = viewGroup;
        this.rippleHostView = r1.c(null, null, 2, null);
        this.invalidateTick = r1.c(Boolean.TRUE, null, 2, null);
        this.rippleSize = C3482m.INSTANCE.b();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new C0145a();
    }

    @Override // kotlin.R0
    public void d() {
    }
}
