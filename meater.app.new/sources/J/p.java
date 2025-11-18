package J;

import A0.InterfaceC0831j;
import i0.C3602t0;
import i0.InterfaceC3608w0;
import kotlin.C1560o;
import kotlin.C4716F;
import kotlin.C4768p0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import kotlin.m1;
import kotlin.x1;
import oa.InterfaceC4156a;
import w.z;
import z.C5153b;
import z.C5155d;
import z.C5157f;
import z.InterfaceC5159h;
import z.InterfaceC5160i;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lz/i;", "interactionSource", "", "bounded", "LU0/h;", "radius", "Li0/w0;", "color", "Lkotlin/Function0;", "LJ/g;", "rippleAlpha", "LA0/j;", "c", "(Lz/i;ZFLi0/w0;LBa/a;)LA0/j;", "Li0/t0;", "Lw/z;", "f", "(ZFJLO/l;II)Lw/z;", "Lz/h;", "interaction", "Lv/i;", "", "d", "(Lz/h;)Lv/i;", "e", "Lv/p0;", "a", "Lv/p0;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final C4768p0<Float> f7133a = new C4768p0<>(15, 0, C4716F.e(), 2, null);

    public static final InterfaceC0831j c(InterfaceC5160i interfaceC5160i, boolean z10, float f10, InterfaceC3608w0 interfaceC3608w0, Ba.a<RippleAlpha> aVar) {
        return t.d(interfaceC5160i, z10, f10, interfaceC3608w0, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4753i<Float> d(InterfaceC5159h interfaceC5159h) {
        return interfaceC5159h instanceof C5157f ? f7133a : interfaceC5159h instanceof C5155d ? new C4768p0(45, 0, C4716F.e(), 2, null) : interfaceC5159h instanceof C5153b ? new C4768p0(45, 0, C4716F.e(), 2, null) : f7133a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4753i<Float> e(InterfaceC5159h interfaceC5159h) {
        return interfaceC5159h instanceof C5157f ? f7133a : interfaceC5159h instanceof C5155d ? f7133a : interfaceC5159h instanceof C5153b ? new C4768p0(150, 0, C4716F.e(), 2, null) : f7133a;
    }

    @InterfaceC4156a
    public static final z f(boolean z10, float f10, long j10, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = U0.h.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            j10 = C3602t0.INSTANCE.e();
        }
        if (C1560o.J()) {
            C1560o.S(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        x1 x1VarM = m1.m(C3602t0.g(j10), interfaceC1554l, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && interfaceC1554l.c(z10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !interfaceC1554l.g(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objF = interfaceC1554l.f();
        if (z13 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new e(z10, f10, x1VarM, null);
            interfaceC1554l.J(objF);
        }
        e eVar = (e) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return eVar;
    }
}
