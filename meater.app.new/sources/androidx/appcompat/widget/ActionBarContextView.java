package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0087g;
import androidx.core.view.C0311u;
import androidx.core.view.C0315y;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p025a.C0829g;
import p024c.p025a.C0832j;
import p024c.p025a.p032o.AbstractC0842b;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0152a {

    /* renamed from: n */
    private CharSequence f701n;

    /* renamed from: o */
    private CharSequence f702o;

    /* renamed from: p */
    private View f703p;

    /* renamed from: q */
    private View f704q;

    /* renamed from: r */
    private LinearLayout f705r;

    /* renamed from: s */
    private TextView f706s;

    /* renamed from: t */
    private TextView f707t;

    /* renamed from: u */
    private int f708u;

    /* renamed from: v */
    private int f709v;

    /* renamed from: w */
    private boolean f710w;

    /* renamed from: x */
    private int f711x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class ViewOnClickListenerC0100a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC0842b f712f;

        ViewOnClickListenerC0100a(AbstractC0842b abstractC0842b) {
            this.f712f = abstractC0842b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f712f.mo452c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m669i() {
        if (this.f705r == null) {
            LayoutInflater.from(getContext()).inflate(C0829g.f5162a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f705r = linearLayout;
            this.f706s = (TextView) linearLayout.findViewById(C0828f.f5140e);
            this.f707t = (TextView) this.f705r.findViewById(C0828f.f5139d);
            if (this.f708u != 0) {
                this.f706s.setTextAppearance(getContext(), this.f708u);
            }
            if (this.f709v != 0) {
                this.f707t.setTextAppearance(getContext(), this.f709v);
            }
        }
        this.f706s.setText(this.f701n);
        this.f707t.setText(this.f702o);
        boolean z = !TextUtils.isEmpty(this.f701n);
        boolean z2 = !TextUtils.isEmpty(this.f702o);
        int i2 = 0;
        this.f707t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f705r;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f705r.getParent() == null) {
            addView(this.f705r);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0152a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0315y mo670f(int i2, long j2) {
        return super.mo670f(i2, j2);
    }

    /* renamed from: g */
    public void m671g() {
        if (this.f703p == null) {
            m674k();
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

    @Override // androidx.appcompat.widget.AbstractC0152a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0152a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f702o;
    }

    public CharSequence getTitle() {
        return this.f701n;
    }

    /* renamed from: h */
    public void m672h(AbstractC0842b abstractC0842b) {
        View view = this.f703p;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f711x, (ViewGroup) this, false);
            this.f703p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f703p);
        }
        this.f703p.findViewById(C0828f.f5144i).setOnClickListener(new ViewOnClickListenerC0100a(abstractC0842b));
        C0087g c0087g = (C0087g) abstractC0842b.mo454e();
        ActionMenuPresenter actionMenuPresenter = this.f1024i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m712A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1024i = actionMenuPresenter2;
        actionMenuPresenter2.m722L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0087g.m583c(this.f1024i, this.f1022g);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1024i.mo504q(this);
        this.f1023h = actionMenuView;
        C0311u.m2139m0(actionMenuView, null);
        addView(this.f1023h, layoutParams);
    }

    /* renamed from: j */
    public boolean m673j() {
        return this.f710w;
    }

    /* renamed from: k */
    public void m674k() {
        removeAllViews();
        this.f704q = null;
        this.f1023h = null;
    }

    /* renamed from: l */
    public boolean m675l() {
        ActionMenuPresenter actionMenuPresenter = this.f1024i;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m723M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1024i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m714D();
            this.f1024i.m715E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0152a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f701n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean zM1231b = C0197w0.m1231b(this);
        int paddingRight = zM1231b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f703p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f703p.getLayoutParams();
            int i6 = zM1231b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zM1231b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM887d = AbstractC0152a.m887d(paddingRight, i6, zM1231b);
            paddingRight = AbstractC0152a.m887d(iM887d + m889e(this.f703p, iM887d, paddingTop, paddingTop2, zM1231b), i7, zM1231b);
        }
        int iM889e = paddingRight;
        LinearLayout linearLayout = this.f705r;
        if (linearLayout != null && this.f704q == null && linearLayout.getVisibility() != 8) {
            iM889e += m889e(this.f705r, iM889e, paddingTop, paddingTop2, zM1231b);
        }
        int i8 = iM889e;
        View view2 = this.f704q;
        if (view2 != null) {
            m889e(view2, i8, paddingTop, paddingTop2, zM1231b);
        }
        int paddingLeft = zM1231b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1023h;
        if (actionMenuView != null) {
            m889e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM1231b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f1025j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f703p;
        if (view != null) {
            int iM888c = m888c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f703p.getLayoutParams();
            paddingLeft = iM888c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1023h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m888c(this.f1023h, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f705r;
        if (linearLayout != null && this.f704q == null) {
            if (this.f710w) {
                this.f705r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f705r.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f705r.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m888c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f704q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f704q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f1025j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.AbstractC0152a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0152a
    public void setContentHeight(int i2) {
        this.f1025j = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f704q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f704q = view;
        if (view != null && (linearLayout = this.f705r) != null) {
            removeView(linearLayout);
            this.f705r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f702o = charSequence;
        m669i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f701n = charSequence;
        m669i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f710w) {
            requestLayout();
        }
        this.f710w = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0152a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5036j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, C0832j.f5448y, i2, 0);
        C0311u.m2139m0(this, c0185q0M1091v.m1098g(C0832j.f5453z));
        this.f708u = c0185q0M1091v.m1105n(C0832j.f5214D, 0);
        this.f709v = c0185q0M1091v.m1105n(C0832j.f5209C, 0);
        this.f1025j = c0185q0M1091v.m1104m(C0832j.f5204B, 0);
        this.f711x = c0185q0M1091v.m1105n(C0832j.f5199A, C0829g.f5165d);
        c0185q0M1091v.m1111w();
    }
}
