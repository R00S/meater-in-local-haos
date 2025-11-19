package N;

import F3.l;
import N.WindowSizeClass;
import android.app.Activity;
import androidx.compose.ui.platform.C2013e0;
import androidx.compose.ui.platform.M;
import i0.X0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: AndroidWindowSizeClass.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/app/Activity;", "activity", "LN/c;", "a", "(Landroid/app/Activity;LO/l;I)LN/c;", "material3-window-size-class_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final WindowSizeClass a(Activity activity, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(866044206, i10, -1, "androidx.compose.material3.windowsizeclass.calculateWindowSizeClass (AndroidWindowSizeClass.android.kt:36)");
        }
        interfaceC1554l.o(M.f());
        WindowSizeClass windowSizeClassB = WindowSizeClass.Companion.b(WindowSizeClass.INSTANCE, ((U0.d) interfaceC1554l.o(C2013e0.d())).Z(X0.e(l.INSTANCE.a().a(activity).a()).h()), null, null, 6, null);
        if (C1560o.J()) {
            C1560o.R();
        }
        return windowSizeClassB;
    }
}
