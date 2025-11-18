package H3;

import F3.WindowMetrics;
import F3.c;
import F3.d;
import F3.j;
import F3.o;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LH3/f;", "", "<init>", "()V", "LF3/k;", "windowMetrics", "LE3/b;", "bounds", "", "d", "(LF3/k;LE3/b;)Z", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "LF3/c;", "a", "(LF3/k;Landroidx/window/extensions/layout/FoldingFeature;)LF3/c;", "Landroid/content/Context;", "context", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "LF3/j;", "c", "(Landroid/content/Context;Landroidx/window/extensions/layout/WindowLayoutInfo;)LF3/j;", "b", "(LF3/k;Landroidx/window/extensions/layout/WindowLayoutInfo;)LF3/j;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5505a = new f();

    private f() {
    }

    private final boolean d(WindowMetrics windowMetrics, E3.b bounds) {
        Rect rectA = windowMetrics.a();
        if (bounds.e()) {
            return false;
        }
        if (bounds.d() != rectA.width() && bounds.a() != rectA.height()) {
            return false;
        }
        if (bounds.d() >= rectA.width() || bounds.a() >= rectA.height()) {
            return (bounds.d() == rectA.width() && bounds.a() == rectA.height()) ? false : true;
        }
        return false;
    }

    public final F3.c a(WindowMetrics windowMetrics, FoldingFeature oemFeature) {
        d.b bVarA;
        c.b bVar;
        C3862t.g(windowMetrics, "windowMetrics");
        C3862t.g(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            bVarA = d.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.INSTANCE.b();
        }
        int state = oemFeature.getState();
        if (state == 1) {
            bVar = c.b.f4485c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = c.b.f4486d;
        }
        Rect bounds = oemFeature.getBounds();
        C3862t.f(bounds, "oemFeature.bounds");
        if (!d(windowMetrics, new E3.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        C3862t.f(bounds2, "oemFeature.bounds");
        return new F3.d(new E3.b(bounds2), bVarA, bVar);
    }

    public final j b(WindowMetrics windowMetrics, WindowLayoutInfo info) {
        F3.c cVarA;
        C3862t.g(windowMetrics, "windowMetrics");
        C3862t.g(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        C3862t.f(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                f fVar = f5505a;
                C3862t.f(feature, "feature");
                cVarA = fVar.a(windowMetrics, feature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new j(arrayList);
    }

    public final j c(Context context, WindowLayoutInfo info) {
        C3862t.g(context, "context");
        C3862t.g(info, "info");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return b(o.f4526b.b(context), info);
        }
        if (i10 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return b(o.f4526b.a((Activity) context), info);
    }
}
