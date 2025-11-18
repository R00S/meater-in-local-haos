package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1994p extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f21728b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f21729a;

    public C1994p(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        a0 a0VarV = a0.v(context, attributeSet, i.j.f42678Y1, i10, i11);
        int i12 = i.j.f42687a2;
        if (a0VarV.s(i12)) {
            b(a0VarV.a(i12, false));
        }
        setBackgroundDrawable(a0VarV.g(i.j.f42682Z1));
        a0VarV.x();
    }

    private void b(boolean z10) {
        if (f21728b) {
            this.f21729a = z10;
        } else {
            androidx.core.widget.i.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f21728b && this.f21729a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f21728b && this.f21729a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f21728b && this.f21729a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
