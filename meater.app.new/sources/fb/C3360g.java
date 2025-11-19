package fb;

import Hb.D0;
import Hb.E0;
import Hb.G0;
import Hb.H;
import Hb.I;
import Hb.M0;
import Hb.Q0;
import Hb.U;
import Ra.m0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: RawProjectionComputer.kt */
/* renamed from: fb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3360g extends H {

    /* compiled from: RawProjectionComputer.kt */
    /* renamed from: fb.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41441a;

        static {
            int[] iArr = new int[EnumC3356c.values().length];
            try {
                iArr[EnumC3356c.f41428D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3356c.f41427C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3356c.f41426B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41441a = iArr;
        }
    }

    @Override // Hb.H
    public E0 a(m0 parameter, I typeAttr, D0 typeParameterUpperBoundEraser, U erasedUpperBound) {
        C3862t.g(parameter, "parameter");
        C3862t.g(typeAttr, "typeAttr");
        C3862t.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C3862t.g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof C3354a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        C3354a c3354aL = (C3354a) typeAttr;
        if (!c3354aL.i()) {
            c3354aL = c3354aL.l(EnumC3356c.f41426B);
        }
        int i10 = a.f41441a[c3354aL.g().ordinal()];
        if (i10 == 1) {
            return new G0(Q0.f5693F, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.p().j()) {
            return new G0(Q0.f5693F, C5087e.m(parameter).H());
        }
        List<m0> parameters = erasedUpperBound.O0().getParameters();
        C3862t.f(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new G0(Q0.f5695H, erasedUpperBound);
        }
        E0 e0T = M0.t(parameter, c3354aL);
        C3862t.d(e0T);
        return e0T;
    }
}
