package d;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s1.C4442k0;
import s1.X0;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld/t;", "Ld/A;", "<init>", "()V", "Ld/L;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "Loa/F;", "a", "(Ld/L;Ld/L;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
class t extends C2989A {
    @Override // d.InterfaceC2990B
    public void a(L statusBarStyle, L navigationBarStyle, Window window, View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        C3862t.g(statusBarStyle, "statusBarStyle");
        C3862t.g(navigationBarStyle, "navigationBarStyle");
        C3862t.g(window, "window");
        C3862t.g(view, "view");
        C4442k0.b(window, false);
        window.setStatusBarColor(statusBarStyle.c(statusBarIsDark));
        window.setNavigationBarColor(navigationBarStyle.c(navigationBarIsDark));
        X0 x02 = new X0(window, view);
        x02.c(!statusBarIsDark);
        x02.b(!navigationBarIsDark);
    }
}
