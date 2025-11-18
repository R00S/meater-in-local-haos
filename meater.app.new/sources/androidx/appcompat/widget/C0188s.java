package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.p003d.C0263f;
import androidx.core.widget.InterfaceC0323d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0832j;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
class C0188s {

    /* renamed from: a */
    private final TextView f1266a;

    /* renamed from: b */
    private C0181o0 f1267b;

    /* renamed from: c */
    private C0181o0 f1268c;

    /* renamed from: d */
    private C0181o0 f1269d;

    /* renamed from: e */
    private C0181o0 f1270e;

    /* renamed from: f */
    private C0181o0 f1271f;

    /* renamed from: g */
    private C0181o0 f1272g;

    /* renamed from: h */
    private C0181o0 f1273h;

    /* renamed from: i */
    private final C0192u f1274i;

    /* renamed from: j */
    private int f1275j = 0;

    /* renamed from: k */
    private int f1276k = -1;

    /* renamed from: l */
    private Typeface f1277l;

    /* renamed from: m */
    private boolean f1278m;

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.s$a */
    class a extends C0263f.c {

        /* renamed from: a */
        final /* synthetic */ int f1279a;

        /* renamed from: b */
        final /* synthetic */ int f1280b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1281c;

        a(int i2, int i3, WeakReference weakReference) {
            this.f1279a = i2;
            this.f1280b = i3;
            this.f1281c = weakReference;
        }

        @Override // androidx.core.content.p003d.C0263f.c
        /* renamed from: d */
        public void mo1177d(int i2) {
        }

        @Override // androidx.core.content.p003d.C0263f.c
        /* renamed from: e */
        public void mo1178e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f1279a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f1280b & 2) != 0);
            }
            C0188s.this.m1166n(this.f1281c, typeface);
        }
    }

    C0188s(TextView textView) {
        this.f1266a = textView;
        this.f1274i = new C0192u(textView);
    }

    /* renamed from: A */
    private void m1149A(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1274i.m1219y(i2, f2);
    }

    /* renamed from: B */
    private void m1150B(Context context, C0185q0 c0185q0) {
        String strM1106o;
        this.f1275j = c0185q0.m1102k(C0832j.f5332a3, this.f1275j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iM1102k = c0185q0.m1102k(C0832j.f5357f3, -1);
            this.f1276k = iM1102k;
            if (iM1102k != -1) {
                this.f1275j = (this.f1275j & 2) | 0;
            }
        }
        int i3 = C0832j.f5352e3;
        if (!c0185q0.m1110s(i3) && !c0185q0.m1110s(C0832j.f5362g3)) {
            int i4 = C0832j.f5327Z2;
            if (c0185q0.m1110s(i4)) {
                this.f1278m = false;
                int iM1102k2 = c0185q0.m1102k(i4, 1);
                if (iM1102k2 == 1) {
                    this.f1277l = Typeface.SANS_SERIF;
                    return;
                } else if (iM1102k2 == 2) {
                    this.f1277l = Typeface.SERIF;
                    return;
                } else {
                    if (iM1102k2 != 3) {
                        return;
                    }
                    this.f1277l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1277l = null;
        int i5 = C0832j.f5362g3;
        if (c0185q0.m1110s(i5)) {
            i3 = i5;
        }
        int i6 = this.f1276k;
        int i7 = this.f1275j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1101j = c0185q0.m1101j(i3, this.f1275j, new a(i6, i7, new WeakReference(this.f1266a)));
                if (typefaceM1101j != null) {
                    if (i2 < 28 || this.f1276k == -1) {
                        this.f1277l = typefaceM1101j;
                    } else {
                        this.f1277l = Typeface.create(Typeface.create(typefaceM1101j, 0), this.f1276k, (this.f1275j & 2) != 0);
                    }
                }
                this.f1278m = this.f1277l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1277l != null || (strM1106o = c0185q0.m1106o(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1276k == -1) {
            this.f1277l = Typeface.create(strM1106o, this.f1275j);
        } else {
            this.f1277l = Typeface.create(Typeface.create(strM1106o, 0), this.f1276k, (this.f1275j & 2) != 0);
        }
    }

    /* renamed from: a */
    private void m1151a(Drawable drawable, C0181o0 c0181o0) {
        if (drawable == null || c0181o0 == null) {
            return;
        }
        C0166h.m1011i(drawable, c0181o0, this.f1266a.getDrawableState());
    }

    /* renamed from: d */
    private static C0181o0 m1152d(Context context, C0166h c0166h, int i2) {
        ColorStateList colorStateListM1014f = c0166h.m1014f(context, i2);
        if (colorStateListM1014f == null) {
            return null;
        }
        C0181o0 c0181o0 = new C0181o0();
        c0181o0.f1230d = true;
        c0181o0.f1227a = colorStateListM1014f;
        return c0181o0;
    }

    /* renamed from: x */
    private void m1153x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1266a.getCompoundDrawablesRelative();
            TextView textView = this.f1266a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f1266a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f1266a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f1266a.getCompoundDrawables();
        TextView textView3 = this.f1266a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: y */
    private void m1154y() {
        C0181o0 c0181o0 = this.f1273h;
        this.f1267b = c0181o0;
        this.f1268c = c0181o0;
        this.f1269d = c0181o0;
        this.f1270e = c0181o0;
        this.f1271f = c0181o0;
        this.f1272g = c0181o0;
    }

    /* renamed from: b */
    void m1155b() {
        if (this.f1267b != null || this.f1268c != null || this.f1269d != null || this.f1270e != null) {
            Drawable[] compoundDrawables = this.f1266a.getCompoundDrawables();
            m1151a(compoundDrawables[0], this.f1267b);
            m1151a(compoundDrawables[1], this.f1268c);
            m1151a(compoundDrawables[2], this.f1269d);
            m1151a(compoundDrawables[3], this.f1270e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1271f == null && this.f1272g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1266a.getCompoundDrawablesRelative();
            m1151a(compoundDrawablesRelative[0], this.f1271f);
            m1151a(compoundDrawablesRelative[2], this.f1272g);
        }
    }

    /* renamed from: c */
    void m1156c() {
        this.f1274i.m1206b();
    }

    /* renamed from: e */
    int m1157e() {
        return this.f1274i.m1208j();
    }

    /* renamed from: f */
    int m1158f() {
        return this.f1274i.m1209k();
    }

    /* renamed from: g */
    int m1159g() {
        return this.f1274i.m1210l();
    }

    /* renamed from: h */
    int[] m1160h() {
        return this.f1274i.m1211m();
    }

    /* renamed from: i */
    int m1161i() {
        return this.f1274i.m1212n();
    }

    /* renamed from: j */
    ColorStateList m1162j() {
        C0181o0 c0181o0 = this.f1273h;
        if (c0181o0 != null) {
            return c0181o0.f1227a;
        }
        return null;
    }

    /* renamed from: k */
    PorterDuff.Mode m1163k() {
        C0181o0 c0181o0 = this.f1273h;
        if (c0181o0 != null) {
            return c0181o0.f1228b;
        }
        return null;
    }

    /* renamed from: l */
    boolean m1164l() {
        return this.f1274i.m1214s();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1165m(android.util.AttributeSet r24, int r25) throws android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0188s.m1165m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m1166n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1278m) {
            this.f1277l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1275j);
            }
        }
    }

    /* renamed from: o */
    void m1167o(boolean z, int i2, int i3, int i4, int i5) {
        if (InterfaceC0323d.f2508a) {
            return;
        }
        m1156c();
    }

    /* renamed from: p */
    void m1168p() {
        m1155b();
    }

    /* renamed from: q */
    void m1169q(Context context, int i2) {
        String strM1106o;
        ColorStateList colorStateListM1094c;
        C0185q0 c0185q0M1089t = C0185q0.m1089t(context, i2, C0832j.f5317X2);
        int i3 = C0832j.f5372i3;
        if (c0185q0M1089t.m1110s(i3)) {
            m1170r(c0185q0M1089t.m1092a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = C0832j.f5337b3;
            if (c0185q0M1089t.m1110s(i5) && (colorStateListM1094c = c0185q0M1089t.m1094c(i5)) != null) {
                this.f1266a.setTextColor(colorStateListM1094c);
            }
        }
        int i6 = C0832j.f5322Y2;
        if (c0185q0M1089t.m1110s(i6) && c0185q0M1089t.m1097f(i6, -1) == 0) {
            this.f1266a.setTextSize(0, 0.0f);
        }
        m1150B(context, c0185q0M1089t);
        if (i4 >= 26) {
            int i7 = C0832j.f5367h3;
            if (c0185q0M1089t.m1110s(i7) && (strM1106o = c0185q0M1089t.m1106o(i7)) != null) {
                this.f1266a.setFontVariationSettings(strM1106o);
            }
        }
        c0185q0M1089t.m1111w();
        Typeface typeface = this.f1277l;
        if (typeface != null) {
            this.f1266a.setTypeface(typeface, this.f1275j);
        }
    }

    /* renamed from: r */
    void m1170r(boolean z) {
        this.f1266a.setAllCaps(z);
    }

    /* renamed from: s */
    void m1171s(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.f1274i.m1216u(i2, i3, i4, i5);
    }

    /* renamed from: t */
    void m1172t(int[] iArr, int i2) throws IllegalArgumentException {
        this.f1274i.m1217v(iArr, i2);
    }

    /* renamed from: u */
    void m1173u(int i2) throws IllegalArgumentException {
        this.f1274i.m1218w(i2);
    }

    /* renamed from: v */
    void m1174v(ColorStateList colorStateList) {
        if (this.f1273h == null) {
            this.f1273h = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1273h;
        c0181o0.f1227a = colorStateList;
        c0181o0.f1230d = colorStateList != null;
        m1154y();
    }

    /* renamed from: w */
    void m1175w(PorterDuff.Mode mode) {
        if (this.f1273h == null) {
            this.f1273h = new C0181o0();
        }
        C0181o0 c0181o0 = this.f1273h;
        c0181o0.f1228b = mode;
        c0181o0.f1229c = mode != null;
        m1154y();
    }

    /* renamed from: z */
    void m1176z(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (InterfaceC0323d.f2508a || m1164l()) {
            return;
        }
        m1149A(i2, f2);
    }
}
