package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j.C3699a;
import j1.C3725j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import q1.q;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.b {

    /* renamed from: B, reason: collision with root package name */
    private final C1983e f21215B;

    /* renamed from: C, reason: collision with root package name */
    private final C2001x f21216C;

    /* renamed from: D, reason: collision with root package name */
    private final C2000w f21217D;

    /* renamed from: E, reason: collision with root package name */
    private C1989k f21218E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21219F;

    /* renamed from: G, reason: collision with root package name */
    private a f21220G;

    /* renamed from: H, reason: collision with root package name */
    private Future<q1.q> f21221H;

    private interface a {
        int[] a();

        TextClassifier b();

        int c();

        void d(TextClassifier textClassifier);

        void e(int i10);

        void f(int i10, int i11, int i12, int i13);

        int g();

        int h();

        void i(int i10);

        int j();

        void k(int i10);

        void l(int i10, float f10);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10);
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void i(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void l(int i10, float f10) {
            AppCompatTextView.super.setLineHeight(i10, f10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private C1989k getEmojiTextViewHelper() {
        if (this.f21218E == null) {
            this.f21218E = new C1989k(this);
        }
        return this.f21218E;
    }

    private void r() {
        Future<q1.q> future = this.f21221H;
        if (future != null) {
            try {
                this.f21221H = null;
                androidx.core.widget.j.p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            c1983e.b();
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h0.f21702c) {
            return getSuperCaller().c();
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            return c2001x.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h0.f21702c) {
            return getSuperCaller().h();
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            return c2001x.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h0.f21702c) {
            return getSuperCaller().j();
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            return c2001x.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h0.f21702c) {
            return getSuperCaller().a();
        }
        C2001x c2001x = this.f21216C;
        return c2001x != null ? c2001x.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (h0.f21702c) {
            return getSuperCaller().g() == 1 ? 1 : 0;
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            return c2001x.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.s(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.c(this);
    }

    a getSuperCaller() {
        if (this.f21220G == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f21220G = new d();
            } else if (i10 >= 28) {
                this.f21220G = new c();
            } else {
                this.f21220G = new b();
            }
        }
        return this.f21220G;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            return c1983e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            return c1983e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21216C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21216C.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2000w c2000w;
        return (Build.VERSION.SDK_INT >= 28 || (c2000w = this.f21217D) == null) ? getSuperCaller().b() : c2000w.a();
    }

    public q.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f21216C.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return C1990l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C2001x c2001x = this.f21216C;
        if (c2001x == null || h0.f21702c || !c2001x.l()) {
            return;
        }
        this.f21216C.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (h0.f21702c) {
            getSuperCaller().f(i10, i11, i12, i13);
            return;
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (h0.f21702c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (h0.f21702c) {
            getSuperCaller().k(i10);
            return;
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            c1983e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            c1983e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.t(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().i(i10);
        } else {
            androidx.core.widget.j.l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i10);
        } else {
            androidx.core.widget.j.m(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        androidx.core.widget.j.n(this, i10);
    }

    public void setPrecomputedText(q1.q qVar) {
        androidx.core.widget.j.p(this, qVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            c1983e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1983e c1983e = this.f21215B;
        if (c1983e != null) {
            c1983e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f21216C.w(colorStateList);
        this.f21216C.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f21216C.x(mode);
        this.f21216C.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2000w c2000w;
        if (Build.VERSION.SDK_INT >= 28 || (c2000w = this.f21217D) == null) {
            getSuperCaller().d(textClassifier);
        } else {
            c2000w.b(textClassifier);
        }
    }

    public void setTextFuture(Future<q1.q> future) {
        this.f21221H = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(q.a aVar) {
        androidx.core.widget.j.r(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (h0.f21702c) {
            super.setTextSize(i10, f10);
            return;
        }
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f21219F) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : C3725j.a(getContext(), typeface, i10);
        this.f21219F = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f21219F = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().l(i10, f10);
        } else {
            androidx.core.widget.j.o(this, i10, f10);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        this.f21219F = false;
        this.f21220G = null;
        V.a(this, getContext());
        C1983e c1983e = new C1983e(this);
        this.f21215B = c1983e;
        c1983e.e(attributeSet, i10);
        C2001x c2001x = new C2001x(this);
        this.f21216C = c2001x;
        c2001x.m(attributeSet, i10);
        c2001x.b();
        this.f21217D = new C2000w(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C3699a.b(context, i10) : null, i11 != 0 ? C3699a.b(context, i11) : null, i12 != 0 ? C3699a.b(context, i12) : null, i13 != 0 ? C3699a.b(context, i13) : null);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C3699a.b(context, i10) : null, i11 != 0 ? C3699a.b(context, i11) : null, i12 != 0 ? C3699a.b(context, i12) : null, i13 != 0 ? C3699a.b(context, i13) : null);
        C2001x c2001x = this.f21216C;
        if (c2001x != null) {
            c2001x.p();
        }
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] a() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier b() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int c() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void f(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int g() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int h() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int j() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void k(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void i(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void l(int i10, float f10) {
        }
    }
}
