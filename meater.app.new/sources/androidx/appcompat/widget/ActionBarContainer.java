package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0311u;
import p024c.p025a.C0828f;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f691f;

    /* renamed from: g */
    private View f692g;

    /* renamed from: h */
    private View f693h;

    /* renamed from: i */
    private View f694i;

    /* renamed from: j */
    Drawable f695j;

    /* renamed from: k */
    Drawable f696k;

    /* renamed from: l */
    Drawable f697l;

    /* renamed from: m */
    boolean f698m;

    /* renamed from: n */
    boolean f699n;

    /* renamed from: o */
    private int f700o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0311u.m2139m0(this, new C0154b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5328a);
        this.f695j = typedArrayObtainStyledAttributes.getDrawable(C0832j.f5333b);
        this.f696k = typedArrayObtainStyledAttributes.getDrawable(C0832j.f5343d);
        this.f700o = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0832j.f5373j, -1);
        boolean z = true;
        if (getId() == C0828f.f5127H) {
            this.f698m = true;
            this.f697l = typedArrayObtainStyledAttributes.getDrawable(C0832j.f5338c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f698m ? this.f695j != null || this.f696k != null : this.f697l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m667a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m668b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f695j;
        if (drawable != null && drawable.isStateful()) {
            this.f695j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f696k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f696k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f697l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f697l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f692g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f695j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f696k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f697l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f693h = findViewById(C0828f.f5136a);
        this.f694i = findViewById(C0828f.f5141f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f691f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f692g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f698m) {
            Drawable drawable2 = this.f697l;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f695j != null) {
                if (this.f693h.getVisibility() == 0) {
                    this.f695j.setBounds(this.f693h.getLeft(), this.f693h.getTop(), this.f693h.getRight(), this.f693h.getBottom());
                } else {
                    View view2 = this.f694i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f695j.setBounds(0, 0, 0, 0);
                    } else {
                        this.f695j.setBounds(this.f694i.getLeft(), this.f694i.getTop(), this.f694i.getRight(), this.f694i.getBottom());
                    }
                }
                z3 = true;
            }
            this.f699n = z4;
            if (!z4 || (drawable = this.f696k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f693h == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f700o) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f693h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f692g;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m668b(this.f693h) ? m667a(this.f693h) : !m668b(this.f694i) ? m667a(this.f694i) : 0) + m667a(this.f692g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f695j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f695j);
        }
        this.f695j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f693h;
            if (view != null) {
                this.f695j.setBounds(view.getLeft(), this.f693h.getTop(), this.f693h.getRight(), this.f693h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f698m ? this.f695j != null || this.f696k != null : this.f697l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f697l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f697l);
        }
        this.f697l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f698m && (drawable2 = this.f697l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f698m ? !(this.f695j != null || this.f696k != null) : this.f697l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f696k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f696k);
        }
        this.f696k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f699n && (drawable2 = this.f696k) != null) {
                drawable2.setBounds(this.f692g.getLeft(), this.f692g.getTop(), this.f692g.getRight(), this.f692g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f698m ? this.f695j != null || this.f696k != null : this.f697l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0171j0 c0171j0) {
        View view = this.f692g;
        if (view != null) {
            removeView(view);
        }
        this.f692g = c0171j0;
        if (c0171j0 != null) {
            addView(c0171j0);
            ViewGroup.LayoutParams layoutParams = c0171j0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0171j0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f691f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f695j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f696k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f697l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f695j && !this.f698m) || (drawable == this.f696k && this.f699n) || ((drawable == this.f697l && this.f698m) || super.verifyDrawable(drawable));
    }
}
