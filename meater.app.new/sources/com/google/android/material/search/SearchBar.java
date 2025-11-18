package com.google.android.material.search;

import C7.c;
import C7.e;
import C7.f;
import C7.l;
import X7.g;
import X7.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.s;
import k1.C3784a;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* renamed from: K0, reason: collision with root package name */
    private static final int f36985K0 = l.f2578o;

    /* renamed from: A0, reason: collision with root package name */
    private final boolean f36986A0;

    /* renamed from: B0, reason: collision with root package name */
    private final Drawable f36987B0;

    /* renamed from: C0, reason: collision with root package name */
    private final boolean f36988C0;

    /* renamed from: D0, reason: collision with root package name */
    private final boolean f36989D0;

    /* renamed from: E0, reason: collision with root package name */
    private View f36990E0;

    /* renamed from: F0, reason: collision with root package name */
    private Integer f36991F0;

    /* renamed from: G0, reason: collision with root package name */
    private Drawable f36992G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f36993H0;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f36994I0;

    /* renamed from: J0, reason: collision with root package name */
    private g f36995J0;

    /* renamed from: y0, reason: collision with root package name */
    private final TextView f36996y0;

    /* renamed from: z0, reason: collision with root package name */
    private final boolean f36997z0;

    static class a extends AbstractC5121a {
        public static final Parcelable.Creator<a> CREATOR = new C0474a();

        /* renamed from: D, reason: collision with root package name */
        String f36999D;

        /* renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        class C0474a implements Parcelable.ClassLoaderCreator<a> {
            C0474a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f36999D);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36999D = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private int V(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private void W() {
        View view = this.f36990E0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f36990E0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        X(this.f36990E0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private void X(View view, int i10, int i11, int i12, int i13) {
        if (X.z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private Drawable Y(Drawable drawable) {
        int iD;
        if (!this.f36988C0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f36991F0;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = M7.a.d(this, drawable == this.f36987B0 ? c.f2327m : c.f2325l);
        }
        Drawable drawableR = C3784a.r(drawable.mutate());
        C3784a.n(drawableR, iD);
        return drawableR;
    }

    private void Z(int i10, int i11) {
        View view = this.f36990E0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void a0() throws Resources.NotFoundException {
        if (this.f36986A0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(e.f2358F);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = V(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = V(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = V(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = V(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void b0() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonD = s.d(this);
        int width = (imageButtonD == null || !imageButtonD.isClickable()) ? 0 : z10 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        ActionMenuView actionMenuViewA = s.a(this);
        int right = actionMenuViewA != null ? z10 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    private void c0() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f36994I0) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonD = s.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z10);
        imageButtonD.setFocusable(!z10);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f36992G0 = background;
        }
        imageButtonD.setBackgroundDrawable(z10 ? null : this.f36992G0);
        b0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f36997z0 && this.f36990E0 == null && !(view instanceof ActionMenuView)) {
            this.f36990E0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f36990E0;
    }

    float getCompatElevation() {
        g gVar = this.f36995J0;
        return gVar != null ? gVar.w() : X.u(this);
    }

    public float getCornerSize() {
        return this.f36995J0.J();
    }

    protected int getDefaultMarginVerticalResource() {
        return e.f2359G;
    }

    protected int getDefaultNavigationIconResource() {
        return f.f2433c;
    }

    public CharSequence getHint() {
        return this.f36996y0.getHint();
    }

    int getMenuResId() {
        return this.f36993H0;
    }

    public int getStrokeColor() {
        return this.f36995J0.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f36995J0.H();
    }

    public CharSequence getText() {
        return this.f36996y0.getText();
    }

    public TextView getTextView() {
        return this.f36996y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        h.f(this, this.f36995J0);
        a0();
        c0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        W();
        b0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Z(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f36999D);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f36999D = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f36990E0;
        if (view2 != null) {
            removeView(view2);
            this.f36990E0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f36994I0 = z10;
        c0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = this.f36995J0;
        if (gVar != null) {
            gVar.a0(f10);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f36996y0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f36989D0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f36995J0.j0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f36995J0.k0(f10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f36996y0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.e;
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).i0();
        }
        super.y(i10);
        this.f36993H0 = i10;
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).h0();
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: I, reason: collision with root package name */
        private boolean f36998I;

        public ScrollingViewBehavior() {
            this.f36998I = false;
        }

        private void Y(AppBarLayout appBarLayout) throws Resources.NotFoundException {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.d
        protected boolean T() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f36998I && (view2 instanceof AppBarLayout)) {
                this.f36998I = true;
                Y((AppBarLayout) view2);
            }
            return zL;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36998I = false;
        }
    }

    public void setHint(int i10) {
        this.f36996y0.setHint(i10);
    }

    public void setText(int i10) {
        this.f36996y0.setText(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
