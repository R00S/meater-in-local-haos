package s1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    private int f49061a;

    /* renamed from: b, reason: collision with root package name */
    private int f49062b;

    public H(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f49061a | this.f49062b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f49062b = i10;
        } else {
            this.f49061a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f49062b = 0;
        } else {
            this.f49061a = 0;
        }
    }
}
