package F3;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s1.C4469y0;

/* compiled from: WindowMetrics.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"LF3/k;", "", "LE3/b;", "_bounds", "Ls1/y0;", "_windowInsetsCompat", "<init>", "(LE3/b;Ls1/y0;)V", "Landroid/graphics/Rect;", "bounds", "insets", "(Landroid/graphics/Rect;Ls1/y0;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LE3/b;", "b", "Ls1/y0;", "()Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: F3.k, reason: from toString */
/* loaded from: classes.dex */
public final class WindowMetrics {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final E3.b _bounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C4469y0 windowInsetsCompat;

    public WindowMetrics(E3.b _bounds, C4469y0 _windowInsetsCompat) {
        C3862t.g(_bounds, "_bounds");
        C3862t.g(_windowInsetsCompat, "_windowInsetsCompat");
        this._bounds = _bounds;
        this.windowInsetsCompat = _windowInsetsCompat;
    }

    public final Rect a() {
        return this._bounds.f();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C3862t.b(WindowMetrics.class, other != null ? other.getClass() : null)) {
            return false;
        }
        C3862t.e(other, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        WindowMetrics windowMetrics = (WindowMetrics) other;
        return C3862t.b(this._bounds, windowMetrics._bounds) && C3862t.b(this.windowInsetsCompat, windowMetrics.windowInsetsCompat);
    }

    public int hashCode() {
        return (this._bounds.hashCode() * 31) + this.windowInsetsCompat.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this._bounds + ", windowInsetsCompat=" + this.windowInsetsCompat + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowMetrics(Rect rect, C4469y0 c4469y0, int i10, C3854k c3854k) {
        if ((i10 & 2) != 0) {
            c4469y0 = new C4469y0.a().a();
            C3862t.f(c4469y0, "Builder().build()");
        }
        this(rect, c4469y0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowMetrics(Rect bounds, C4469y0 insets) {
        this(new E3.b(bounds), insets);
        C3862t.g(bounds, "bounds");
        C3862t.g(insets, "insets");
    }
}
