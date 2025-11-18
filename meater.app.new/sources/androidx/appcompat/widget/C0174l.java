package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0311u;
import androidx.core.widget.C0326g;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: AppCompatImageHelper.java */
/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public class C0174l {

    /* renamed from: a */
    private final ImageView f1201a;

    /* renamed from: b */
    private C0181o0 f1202b;

    /* renamed from: c */
    private C0181o0 f1203c;

    /* renamed from: d */
    private C0181o0 f1204d;

    public C0174l(ImageView imageView) {
        this.f1201a = imageView;
    }

    /* renamed from: a */
    private boolean m1058a(Drawable drawable) {
        if (this.f1204d == null) {
            this.f1204d = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1204d;
        c0181o0.m1083a();
        ColorStateList colorStateListM2311a = C0326g.m2311a(this.f1201a);
        if (colorStateListM2311a != null) {
            c0181o0.f1230d = true;
            c0181o0.f1227a = colorStateListM2311a;
        }
        PorterDuff.Mode modeM2312b = C0326g.m2312b(this.f1201a);
        if (modeM2312b != null) {
            c0181o0.f1229c = true;
            c0181o0.f1228b = modeM2312b;
        }
        if (!c0181o0.f1230d && !c0181o0.f1229c) {
            return false;
        }
        C0166h.m1011i(drawable, c0181o0, this.f1201a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1059j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f1202b != null : i2 == 21;
    }

    /* renamed from: b */
    void m1060b() {
        Drawable drawable = this.f1201a.getDrawable();
        if (drawable != null) {
            C0200y.m1235b(drawable);
        }
        if (drawable != null) {
            if (m1059j() && m1058a(drawable)) {
                return;
            }
            C0181o0 c0181o0 = this.f1203c;
            if (c0181o0 != null) {
                C0166h.m1011i(drawable, c0181o0, this.f1201a.getDrawableState());
                return;
            }
            C0181o0 c0181o02 = this.f1202b;
            if (c0181o02 != null) {
                C0166h.m1011i(drawable, c0181o02, this.f1201a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    ColorStateList m1061c() {
        C0181o0 c0181o0 = this.f1203c;
        if (c0181o0 != null) {
            return c0181o0.f1227a;
        }
        return null;
    }

    /* renamed from: d */
    PorterDuff.Mode m1062d() {
        C0181o0 c0181o0 = this.f1203c;
        if (c0181o0 != null) {
            return c0181o0.f1228b;
        }
        return null;
    }

    /* renamed from: e */
    boolean m1063e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1201a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m1064f(AttributeSet attributeSet, int i2) {
        int iM1105n;
        Context context = this.f1201a.getContext();
        int[] iArr = C0832j.f5284R;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f1201a;
        C0311u.m2127g0(imageView, imageView.getContext(), iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        try {
            Drawable drawable = this.f1201a.getDrawable();
            if (drawable == null && (iM1105n = c0185q0M1091v.m1105n(C0832j.f5289S, -1)) != -1 && (drawable = C0833a.m5262d(this.f1201a.getContext(), iM1105n)) != null) {
                this.f1201a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0200y.m1235b(drawable);
            }
            int i3 = C0832j.f5294T;
            if (c0185q0M1091v.m1110s(i3)) {
                C0326g.m2313c(this.f1201a, c0185q0M1091v.m1094c(i3));
            }
            int i4 = C0832j.f5299U;
            if (c0185q0M1091v.m1110s(i4)) {
                C0326g.m2314d(this.f1201a, C0200y.m1238e(c0185q0M1091v.m1102k(i4, -1), null));
            }
        } finally {
            c0185q0M1091v.m1111w();
        }
    }

    /* renamed from: g */
    public void m1065g(int i2) {
        if (i2 != 0) {
            Drawable drawableM5262d = C0833a.m5262d(this.f1201a.getContext(), i2);
            if (drawableM5262d != null) {
                C0200y.m1235b(drawableM5262d);
            }
            this.f1201a.setImageDrawable(drawableM5262d);
        } else {
            this.f1201a.setImageDrawable(null);
        }
        m1060b();
    }

    /* renamed from: h */
    void m1066h(ColorStateList colorStateList) {
        if (this.f1203c == null) {
            this.f1203c = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1203c;
        c0181o0.f1227a = colorStateList;
        c0181o0.f1230d = true;
        m1060b();
    }

    /* renamed from: i */
    void m1067i(PorterDuff.Mode mode) {
        if (this.f1203c == null) {
            this.f1203c = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1203c;
        c0181o0.f1228b = mode;
        c0181o0.f1229c = true;
        m1060b();
    }
}
