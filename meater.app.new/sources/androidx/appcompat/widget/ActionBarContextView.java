package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import s1.C4434g0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1979a {

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f21125J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence f21126K;

    /* renamed from: L, reason: collision with root package name */
    private View f21127L;

    /* renamed from: M, reason: collision with root package name */
    private View f21128M;

    /* renamed from: N, reason: collision with root package name */
    private View f21129N;

    /* renamed from: O, reason: collision with root package name */
    private LinearLayout f21130O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f21131P;

    /* renamed from: Q, reason: collision with root package name */
    private TextView f21132Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21133R;

    /* renamed from: S, reason: collision with root package name */
    private int f21134S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21135T;

    /* renamed from: U, reason: collision with root package name */
    private int f21136U;

    class a implements View.OnClickListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f21137B;

        a(androidx.appcompat.view.b bVar) {
            this.f21137B = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f21137B.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f21130O == null) {
            LayoutInflater.from(getContext()).inflate(i.g.f42526a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f21130O = linearLayout;
            this.f21131P = (TextView) linearLayout.findViewById(i.f.f42504e);
            this.f21132Q = (TextView) this.f21130O.findViewById(i.f.f42503d);
            if (this.f21133R != 0) {
                this.f21131P.setTextAppearance(getContext(), this.f21133R);
            }
            if (this.f21134S != 0) {
                this.f21132Q.setTextAppearance(getContext(), this.f21134S);
            }
        }
        this.f21131P.setText(this.f21125J);
        this.f21132Q.setText(this.f21126K);
        boolean zIsEmpty = TextUtils.isEmpty(this.f21125J);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f21126K);
        this.f21132Q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f21130O.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f21130O.getParent() == null) {
            addView(this.f21130O);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1979a
    public /* bridge */ /* synthetic */ C4434g0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f21127L == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1979a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1979a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f21126K;
    }

    public CharSequence getTitle() {
        return this.f21125J;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f21127L;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f21136U, (ViewGroup) this, false);
            this.f21127L = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f21127L);
        }
        View viewFindViewById = this.f21127L.findViewById(i.f.f42508i);
        this.f21128M = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C1981c c1981c = this.f21605E;
        if (c1981c != null) {
            c1981c.B();
        }
        C1981c c1981c2 = new C1981c(getContext());
        this.f21605E = c1981c2;
        c1981c2.M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f21605E, this.f21603C);
        ActionMenuView actionMenuView = (ActionMenuView) this.f21605E.r(this);
        this.f21604D = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f21604D, layoutParams);
    }

    public boolean j() {
        return this.f21135T;
    }

    public void k() {
        removeAllViews();
        this.f21129N = null;
        this.f21604D = null;
        this.f21605E = null;
        View view = this.f21128M;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C1981c c1981c = this.f21605E;
        if (c1981c != null) {
            return c1981c.N();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1981c c1981c = this.f21605E;
        if (c1981c != null) {
            c1981c.E();
            this.f21605E.F();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1979a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = h0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f21127L;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21127L.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC1979a.d(paddingRight, i14, zB);
            paddingRight = AbstractC1979a.d(iD + e(this.f21127L, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f21130O;
        if (linearLayout != null && this.f21129N == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f21130O, iE, paddingTop, paddingTop2, zB);
        }
        int i16 = iE;
        View view2 = this.f21129N;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f21604D;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f21606F;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f21127L;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21127L.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f21604D;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f21604D, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f21130O;
        if (linearLayout != null && this.f21129N == null) {
            if (this.f21135T) {
                this.f21130O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f21130O.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f21130O.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f21129N;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f21129N.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f21606F > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1979a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1979a
    public void setContentHeight(int i10) {
        this.f21606F = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f21129N;
        if (view2 != null) {
            removeView(view2);
        }
        this.f21129N = view;
        if (view != null && (linearLayout = this.f21130O) != null) {
            removeView(linearLayout);
            this.f21130O = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f21126K = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f21125J = charSequence;
        i();
        s1.X.q0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f21135T) {
            requestLayout();
        }
        this.f21135T = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC1979a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f42403j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a0 a0VarV = a0.v(context, attributeSet, i.j.f42804y, i10, 0);
        setBackground(a0VarV.g(i.j.f42809z));
        this.f21133R = a0VarV.n(i.j.f42577D, 0);
        this.f21134S = a0VarV.n(i.j.f42572C, 0);
        this.f21606F = a0VarV.m(i.j.f42567B, 0);
        this.f21136U = a0VarV.n(i.j.f42562A, i.g.f42529d);
        a0VarV.x();
    }
}
