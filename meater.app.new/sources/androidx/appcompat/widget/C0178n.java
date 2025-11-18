package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0329j;
import p024c.p025a.C0832j;

/* compiled from: AppCompatPopupWindow.java */
/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
class C0178n extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1218a;

    /* renamed from: b */
    private boolean f1219b;

    static {
        f1218a = Build.VERSION.SDK_INT < 21;
    }

    public C0178n(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i2, i3);
        m1074a(context, attributeSet, i2, i3);
    }

    /* renamed from: a */
    private void m1074a(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, C0832j.f5336b2, i2, i3);
        int i4 = C0832j.f5346d2;
        if (c0185q0M1091v.m1110s(i4)) {
            m1075b(c0185q0M1091v.m1092a(i4, false));
        }
        setBackgroundDrawable(c0185q0M1091v.m1098g(C0832j.f5341c2));
        c0185q0M1091v.m1111w();
    }

    /* renamed from: b */
    private void m1075b(boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (f1218a) {
            this.f1219b = z;
        } else {
            C0329j.m2317a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f1218a && this.f1219b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f1218a && this.f1219b) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1218a && this.f1219b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }
}
