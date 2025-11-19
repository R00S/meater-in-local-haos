package kotlin;

import Ba.l;
import i0.C3602t0;
import kotlin.C1560o;
import kotlin.C4741c;
import kotlin.C4748f0;
import kotlin.C4755j;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC4753i;
import kotlin.InterfaceC4770q0;
import kotlin.Metadata;
import kotlin.x1;
import oa.C4153F;

/* compiled from: SingleValueAnimation.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Li0/t0;", "targetValue", "Lv/i;", "animationSpec", "", "label", "Lkotlin/Function1;", "Loa/F;", "finishedListener", "LO/x1;", "a", "(JLv/i;Ljava/lang/String;LBa/l;LO/l;II)LO/x1;", "Lv/f0;", "Lv/f0;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4611e {

    /* renamed from: a, reason: collision with root package name */
    private static final C4748f0<C3602t0> f50171a = C4755j.h(0.0f, 0.0f, null, 7, null);

    public static final x1<C3602t0> a(long j10, InterfaceC4753i<C3602t0> interfaceC4753i, String str, l<? super C3602t0, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        InterfaceC4753i<C3602t0> interfaceC4753i2 = (i11 & 2) != 0 ? f50171a : interfaceC4753i;
        String str2 = (i11 & 4) != 0 ? "ColorAnimation" : str;
        l<? super C3602t0, C4153F> lVar2 = (i11 & 8) != 0 ? null : lVar;
        if (C1560o.J()) {
            C1560o.S(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zR = interfaceC1554l.R(C3602t0.p(j10));
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = (InterfaceC4770q0) C4608b.a(C3602t0.INSTANCE).invoke(C3602t0.p(j10));
            interfaceC1554l.J(objF);
        }
        int i12 = i10 << 6;
        x1<C3602t0> x1VarC = C4741c.c(C3602t0.g(j10), (InterfaceC4770q0) objF, interfaceC4753i2, null, str2, lVar2, interfaceC1554l, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarC;
    }
}
