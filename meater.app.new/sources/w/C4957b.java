package w;

import android.content.Context;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lw/I;", "a", "(LO/l;I)Lw/I;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4957b {
    public static final I a(InterfaceC1554l interfaceC1554l, int i10) {
        I i11;
        if (C1560o.J()) {
            C1560o.S(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) interfaceC1554l.o(androidx.compose.ui.platform.M.g());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) interfaceC1554l.o(C4955H.a());
        if (overscrollConfiguration != null) {
            interfaceC1554l.S(1586021609);
            boolean zR = interfaceC1554l.R(context) | interfaceC1554l.R(overscrollConfiguration);
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new C4956a(context, overscrollConfiguration);
                interfaceC1554l.J(objF);
            }
            i11 = (C4956a) objF;
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(1586120933);
            interfaceC1554l.I();
            i11 = C4953F.f51673a;
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return i11;
    }
}
