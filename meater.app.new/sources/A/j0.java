package A;

import A.d0;
import j1.C3719d;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lj1/d;", "LA/G;", "c", "(Lj1/d;)LA/G;", "insets", "", "name", "LA/b0;", "a", "(Lj1/d;Ljava/lang/String;)LA/b0;", "LA/d0$a;", "LA/d0;", "b", "(LA/d0$a;LO/l;I)LA/d0;", "systemBars", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {
    public static final b0 a(C3719d c3719d, String str) {
        return new b0(c(c3719d), str);
    }

    public static final d0 b(d0.Companion companion, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-282936756, i10, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)");
        }
        C0793a c0793aE = e0.INSTANCE.c(interfaceC1554l, 6).getSystemBars();
        if (C1560o.J()) {
            C1560o.R();
        }
        return c0793aE;
    }

    public static final InsetsValues c(C3719d c3719d) {
        return new InsetsValues(c3719d.f43450a, c3719d.f43451b, c3719d.f43452c, c3719d.f43453d);
    }
}
