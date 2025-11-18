package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import i1.h;
import java.lang.ref.WeakReference;
import v1.C4793a;

/* compiled from: AppCompatTextHelper.java */
/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2001x {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f21775a;

    /* renamed from: b, reason: collision with root package name */
    private Y f21776b;

    /* renamed from: c, reason: collision with root package name */
    private Y f21777c;

    /* renamed from: d, reason: collision with root package name */
    private Y f21778d;

    /* renamed from: e, reason: collision with root package name */
    private Y f21779e;

    /* renamed from: f, reason: collision with root package name */
    private Y f21780f;

    /* renamed from: g, reason: collision with root package name */
    private Y f21781g;

    /* renamed from: h, reason: collision with root package name */
    private Y f21782h;

    /* renamed from: i, reason: collision with root package name */
    private final C2002y f21783i;

    /* renamed from: j, reason: collision with root package name */
    private int f21784j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f21785k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f21786l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21787m;

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.x$b */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ TextView f21792B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Typeface f21793C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f21794D;

        b(TextView textView, Typeface typeface, int i10) {
            this.f21792B = textView;
            this.f21793C = typeface;
            this.f21794D = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21792B.setTypeface(this.f21793C, this.f21794D);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.x$c */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.x$d */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.x$e */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    C2001x(TextView textView) {
        this.f21775a = textView;
        this.f21783i = new C2002y(textView);
    }

    private void B(int i10, float f10) {
        this.f21783i.t(i10, f10);
    }

    private void C(Context context, a0 a0Var) {
        String strO;
        this.f21784j = a0Var.k(i.j.f42667V2, this.f21784j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = a0Var.k(i.j.f42679Y2, -1);
            this.f21785k = iK;
            if (iK != -1) {
                this.f21784j &= 2;
            }
        }
        int i11 = i.j.f42675X2;
        if (!a0Var.s(i11) && !a0Var.s(i.j.f42683Z2)) {
            int i12 = i.j.f42663U2;
            if (a0Var.s(i12)) {
                this.f21787m = false;
                int iK2 = a0Var.k(i12, 1);
                if (iK2 == 1) {
                    this.f21786l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f21786l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f21786l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f21786l = null;
        int i13 = i.j.f42683Z2;
        if (a0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f21785k;
        int i15 = this.f21784j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = a0Var.j(i11, this.f21784j, new a(i14, i15, new WeakReference(this.f21775a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f21785k == -1) {
                        this.f21786l = typefaceJ;
                    } else {
                        this.f21786l = e.a(Typeface.create(typefaceJ, 0), this.f21785k, (this.f21784j & 2) != 0);
                    }
                }
                this.f21787m = this.f21786l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f21786l != null || (strO = a0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f21785k == -1) {
            this.f21786l = Typeface.create(strO, this.f21784j);
        } else {
            this.f21786l = e.a(Typeface.create(strO, 0), this.f21785k, (this.f21784j & 2) != 0);
        }
    }

    private void a(Drawable drawable, Y y10) {
        if (drawable == null || y10 == null) {
            return;
        }
        C1987i.i(drawable, y10, this.f21775a.getDrawableState());
    }

    private static Y d(Context context, C1987i c1987i, int i10) {
        ColorStateList colorStateListF = c1987i.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        Y y10 = new Y();
        y10.f21600d = true;
        y10.f21597a = colorStateListF;
        return y10;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f21775a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f21775a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f21775a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f21775a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f21775a.getCompoundDrawables();
        TextView textView2 = this.f21775a;
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
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        Y y10 = this.f21782h;
        this.f21776b = y10;
        this.f21777c = y10;
        this.f21778d = y10;
        this.f21779e = y10;
        this.f21780f = y10;
        this.f21781g = y10;
    }

    void A(int i10, float f10) {
        if (h0.f21702c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f21776b != null || this.f21777c != null || this.f21778d != null || this.f21779e != null) {
            Drawable[] compoundDrawables = this.f21775a.getCompoundDrawables();
            a(compoundDrawables[0], this.f21776b);
            a(compoundDrawables[1], this.f21777c);
            a(compoundDrawables[2], this.f21778d);
            a(compoundDrawables[3], this.f21779e);
        }
        if (this.f21780f == null && this.f21781g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f21775a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f21780f);
        a(compoundDrawablesRelative[2], this.f21781g);
    }

    void c() {
        this.f21783i.a();
    }

    int e() {
        return this.f21783i.f();
    }

    int f() {
        return this.f21783i.g();
    }

    int g() {
        return this.f21783i.h();
    }

    int[] h() {
        return this.f21783i.i();
    }

    int i() {
        return this.f21783i.j();
    }

    ColorStateList j() {
        Y y10 = this.f21782h;
        if (y10 != null) {
            return y10.f21597a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        Y y10 = this.f21782h;
        if (y10 != null) {
            return y10.f21598b;
        }
        return null;
    }

    boolean l() {
        return this.f21783i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C2001x.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f21787m) {
            this.f21786l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f21784j));
                } else {
                    textView.setTypeface(typeface, this.f21784j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (h0.f21702c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        a0 a0VarT = a0.t(context, i10, i.j.f42655S2);
        int i11 = i.j.f42693b3;
        if (a0VarT.s(i11)) {
            s(a0VarT.a(i11, false));
        }
        int i12 = i.j.f42659T2;
        if (a0VarT.s(i12) && a0VarT.f(i12, -1) == 0) {
            this.f21775a.setTextSize(0, 0.0f);
        }
        C(context, a0VarT);
        int i13 = i.j.f42688a3;
        if (a0VarT.s(i13) && (strO = a0VarT.o(i13)) != null) {
            d.d(this.f21775a, strO);
        }
        a0VarT.x();
        Typeface typeface = this.f21786l;
        if (typeface != null) {
            this.f21775a.setTypeface(typeface, this.f21784j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C4793a.e(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f21775a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f21783i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f21783i.q(iArr, i10);
    }

    void v(int i10) {
        this.f21783i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f21782h == null) {
            this.f21782h = new Y();
        }
        Y y10 = this.f21782h;
        y10.f21597a = colorStateList;
        y10.f21600d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f21782h == null) {
            this.f21782h = new Y();
        }
        Y y10 = this.f21782h;
        y10.f21598b = mode;
        y10.f21599c = mode != null;
        z();
    }

    /* compiled from: AppCompatTextHelper.java */
    /* renamed from: androidx.appcompat.widget.x$a */
    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21788a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f21790c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f21788a = i10;
            this.f21789b = i11;
            this.f21790c = weakReference;
        }

        @Override // i1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f21788a) != -1) {
                typeface = e.a(typeface, i10, (this.f21789b & 2) != 0);
            }
            C2001x.this.n(this.f21790c, typeface);
        }

        @Override // i1.h.e
        /* renamed from: h */
        public void f(int i10) {
        }
    }
}
