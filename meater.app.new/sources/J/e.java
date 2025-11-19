package J;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.M;
import i0.C3602t0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.x1;
import oa.InterfaceC4156a;
import z.InterfaceC5160i;

/* compiled from: Ripple.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LJ/e;", "LJ/f;", "", "bounded", "LU0/h;", "radius", "LO/x1;", "Li0/t0;", "color", "<init>", "(ZFLO/x1;Lkotlin/jvm/internal/k;)V", "Lz/i;", "interactionSource", "LJ/g;", "rippleAlpha", "LJ/o;", "c", "(Lz/i;ZFLO/x1;LO/x1;LO/l;I)LJ/o;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public final class e extends f {
    public /* synthetic */ e(boolean z10, float f10, x1 x1Var, C3854k c3854k) {
        this(z10, f10, x1Var);
    }

    @Override // J.f
    public o c(InterfaceC5160i interfaceC5160i, boolean z10, float f10, x1<C3602t0> x1Var, x1<RippleAlpha> x1Var2, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(331259447);
        if (C1560o.J()) {
            C1560o.S(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup viewGroupE = t.e((View) interfaceC1554l.o(M.k()));
        boolean zR = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.R(interfaceC5160i)) || (i10 & 6) == 4) | ((((458752 & i10) ^ 196608) > 131072 && interfaceC1554l.R(this)) || (i10 & 196608) == 131072) | interfaceC1554l.R(viewGroupE);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new a(z10, f10, x1Var, x1Var2, viewGroupE, null);
            interfaceC1554l.J(objF);
        }
        a aVar = (a) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return aVar;
    }

    private e(boolean z10, float f10, x1<C3602t0> x1Var) {
        super(z10, f10, x1Var, null);
    }
}
