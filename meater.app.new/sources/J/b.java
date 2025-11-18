package J;

import A0.C0830i;
import A0.C0839s;
import android.view.View;
import androidx.compose.ui.platform.M;
import i0.C3545H;
import i0.InterfaceC3586l0;
import i0.InterfaceC3608w0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Ripple.android.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LJ/b;", "LJ/q;", "LJ/k;", "Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "<init>", "(Lz/i;ZFLi0/w0;LBa/a;Lkotlin/jvm/internal/k;)V", "LJ/j;", "x2", "()LJ/j;", "Lk0/f;", "Loa/F;", "p2", "(Lk0/f;)V", "Lz/m$b;", "interaction", "Lh0/m;", "size", "", "targetRadius", "o2", "(Lz/m$b;JF)V", "v2", "(Lz/m$b;)V", "U1", "()V", "z0", "Z", "LJ/j;", "rippleContainer", "LJ/n;", "value", "a0", "LJ/n;", "y2", "(LJ/n;)V", "rippleHostView", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends q implements k {

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private j rippleContainer;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private n rippleHostView;

    /* compiled from: Ripple.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {
        a() {
            super(0);
        }

        public final void a() {
            C0839s.a(b.this);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ b(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a aVar, C3854k c3854k) {
        this(interfaceC5160i, z10, f10, interfaceC3608w0, aVar);
    }

    private final j x2() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            C3862t.d(jVar);
            return jVar;
        }
        j jVarC = t.c(t.e((View) C0830i.a(this, M.k())));
        this.rippleContainer = jVarC;
        C3862t.d(jVarC);
        return jVarC;
    }

    private final void y2(n nVar) {
        this.rippleHostView = nVar;
        C0839s.a(this);
    }

    @Override // b0.i.c
    public void U1() {
        j jVar = this.rippleContainer;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    @Override // J.q
    public void o2(m.b interaction, long size, float targetRadius) {
        n nVarB = x2().b(this);
        nVarB.b(interaction, getBounded(), size, Da.a.c(targetRadius), s2(), r2().invoke().getPressedAlpha(), new a());
        y2(nVarB);
    }

    @Override // J.q
    public void p2(k0.f fVar) {
        InterfaceC3586l0 interfaceC3586l0G = fVar.getDrawContext().G();
        n nVar = this.rippleHostView;
        if (nVar != null) {
            nVar.f(getRippleSize(), s2(), r2().invoke().getPressedAlpha());
            nVar.draw(C3545H.d(interfaceC3586l0G));
        }
    }

    @Override // J.q
    public void v2(m.b interaction) {
        n nVar = this.rippleHostView;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // J.k
    public void z0() {
        y2(null);
    }

    private b(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a<RippleAlpha> aVar) {
        super(interfaceC5160i, z10, f10, interfaceC3608w0, aVar, null);
    }
}
