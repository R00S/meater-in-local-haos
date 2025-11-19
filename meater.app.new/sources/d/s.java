package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import d.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\r\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ld/j;", "Ld/L;", "statusBarStyle", "navigationBarStyle", "Loa/F;", "a", "(Ld/j;Ld/L;Ld/L;)V", "", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Ld/B;", "c", "Ld/B;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f39614a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    private static final int f39615b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC2990B f39616c;

    public static final void a(ActivityC3006j activityC3006j, L statusBarStyle, L navigationBarStyle) {
        C3862t.g(activityC3006j, "<this>");
        C3862t.g(statusBarStyle, "statusBarStyle");
        C3862t.g(navigationBarStyle, "navigationBarStyle");
        View decorView = activityC3006j.getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        Ba.l<Resources, Boolean> lVarA = statusBarStyle.a();
        Resources resources = decorView.getResources();
        C3862t.f(resources, "view.resources");
        boolean zBooleanValue = lVarA.invoke(resources).booleanValue();
        Ba.l<Resources, Boolean> lVarA2 = navigationBarStyle.a();
        Resources resources2 = decorView.getResources();
        C3862t.f(resources2, "view.resources");
        boolean zBooleanValue2 = lVarA2.invoke(resources2).booleanValue();
        InterfaceC2990B zVar = f39616c;
        if (zVar == null) {
            int i10 = Build.VERSION.SDK_INT;
            zVar = i10 >= 30 ? new z() : i10 >= 29 ? new y() : i10 >= 28 ? new v() : new t();
        }
        Window window = activityC3006j.getWindow();
        C3862t.f(window, "window");
        zVar.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = activityC3006j.getWindow();
        C3862t.f(window2, "window");
        zVar.b(window2);
    }

    public static /* synthetic */ void b(ActivityC3006j activityC3006j, L l10, L l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = L.Companion.b(L.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            l11 = L.Companion.b(L.INSTANCE, f39614a, f39615b, null, 4, null);
        }
        a(activityC3006j, l10, l11);
    }
}
