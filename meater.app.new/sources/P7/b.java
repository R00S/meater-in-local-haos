package P7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f14132a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14133b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f14134c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f14132a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f14132a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f14132a);
        }
    }

    public int b() {
        return this.f14134c;
    }

    public boolean c() {
        return this.f14133b;
    }

    public void d(Bundle bundle) {
        this.f14133b = bundle.getBoolean("expanded", false);
        this.f14134c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f14133b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f14133b);
        bundle.putInt("expandedComponentIdHint", this.f14134c);
        return bundle;
    }

    public void f(int i10) {
        this.f14134c = i10;
    }
}
