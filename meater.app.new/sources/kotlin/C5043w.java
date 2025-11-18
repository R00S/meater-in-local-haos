package kotlin;

import U0.t;
import kotlin.C1560o;
import kotlin.C4614h;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC4787z;
import kotlin.Metadata;
import w.C4957b;
import w.I;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lx/w;", "", "<init>", "()V", "Lx/n;", "a", "(LO/l;I)Lx/n;", "Lw/I;", "b", "(LO/l;I)Lw/I;", "LU0/t;", "layoutDirection", "Lx/q;", "orientation", "", "reverseScrolling", "c", "(LU0/t;Lx/q;Z)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5043w {

    /* renamed from: a, reason: collision with root package name */
    public static final C5043w f52509a = new C5043w();

    private C5043w() {
    }

    public final InterfaceC5034n a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        InterfaceC4787z interfaceC4787zB = C4614h.b(interfaceC1554l, 0);
        boolean zR = interfaceC1554l.R(interfaceC4787zB);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C5028h(interfaceC4787zB, null, 2, 0 == true ? 1 : 0);
            interfaceC1554l.J(objF);
        }
        C5028h c5028h = (C5028h) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c5028h;
    }

    public final I b(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        I iA = C4957b.a(interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return iA;
    }

    public final boolean c(t layoutDirection, EnumC5037q orientation, boolean reverseScrolling) {
        return (layoutDirection != t.Rtl || orientation == EnumC5037q.Vertical) ? !reverseScrolling : reverseScrolling;
    }
}
