package p241e.p254e.p256b.p271c.p282u;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ExpandableWidgetHelper.java */
/* renamed from: e.e.b.c.u.b */
/* loaded from: classes2.dex */
public final class C8942b {

    /* renamed from: a */
    private final View f34416a;

    /* renamed from: b */
    private boolean f34417b = false;

    /* renamed from: c */
    private int f34418c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C8942b(InterfaceC8941a interfaceC8941a) {
        this.f34416a = (View) interfaceC8941a;
    }

    /* renamed from: a */
    private void m28483a() {
        ViewParent parent = this.f34416a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m1428f(this.f34416a);
        }
    }

    /* renamed from: b */
    public int m28484b() {
        return this.f34418c;
    }

    /* renamed from: c */
    public boolean m28485c() {
        return this.f34417b;
    }

    /* renamed from: d */
    public void m28486d(Bundle bundle) {
        this.f34417b = bundle.getBoolean("expanded", false);
        this.f34418c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f34417b) {
            m28483a();
        }
    }

    /* renamed from: e */
    public Bundle m28487e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f34417b);
        bundle.putInt("expandedComponentIdHint", this.f34418c);
        return bundle;
    }

    /* renamed from: f */
    public void m28488f(int i2) {
        this.f34418c = i2;
    }
}
