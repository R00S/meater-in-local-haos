package J3;

import F3.WindowMetrics;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s1.C4469y0;

/* compiled from: ContextCompatHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJ3/f;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LF3/k;", "c", "(Landroid/content/Context;)LF3/k;", "Landroid/graphics/Rect;", "a", "(Landroid/content/Context;)Landroid/graphics/Rect;", "Ls1/y0;", "b", "(Landroid/content/Context;)Ls1/y0;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7274a = new f();

    private f() {
    }

    public final Rect a(Context context) {
        C3862t.g(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        C3862t.f(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final C4469y0 b(Context context) {
        C3862t.g(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        C3862t.f(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        C4469y0 c4469y0W = C4469y0.w(windowInsets);
        C3862t.f(c4469y0W, "toWindowInsetsCompat(platformInsets)");
        return c4469y0W;
    }

    public final WindowMetrics c(Context context) {
        C3862t.g(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        C4469y0 c4469y0W = C4469y0.w(windowManager.getCurrentWindowMetrics().getWindowInsets());
        C3862t.f(c4469y0W, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        C3862t.f(bounds, "wm.currentWindowMetrics.bounds");
        return new WindowMetrics(bounds, c4469y0W);
    }
}
