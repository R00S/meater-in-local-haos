package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private boolean f21115B;

    /* renamed from: C, reason: collision with root package name */
    private View f21116C;

    /* renamed from: D, reason: collision with root package name */
    private View f21117D;

    /* renamed from: E, reason: collision with root package name */
    private View f21118E;

    /* renamed from: F, reason: collision with root package name */
    Drawable f21119F;

    /* renamed from: G, reason: collision with root package name */
    Drawable f21120G;

    /* renamed from: H, reason: collision with root package name */
    Drawable f21121H;

    /* renamed from: I, reason: collision with root package name */
    boolean f21122I;

    /* renamed from: J, reason: collision with root package name */
    boolean f21123J;

    /* renamed from: K, reason: collision with root package name */
    private int f21124K;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1980b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42684a);
        this.f21119F = typedArrayObtainStyledAttributes.getDrawable(i.j.f42689b);
        this.f21120G = typedArrayObtainStyledAttributes.getDrawable(i.j.f42699d);
        this.f21124K = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f42729j, -1);
        boolean z10 = true;
        if (getId() == i.f.f42491G) {
            this.f21122I = true;
            this.f21121H = typedArrayObtainStyledAttributes.getDrawable(i.j.f42694c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f21122I ? this.f21119F != null || this.f21120G != null : this.f21121H != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21119F;
        if (drawable != null && drawable.isStateful()) {
            this.f21119F.setState(getDrawableState());
        }
        Drawable drawable2 = this.f21120G;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f21120G.setState(getDrawableState());
        }
        Drawable drawable3 = this.f21121H;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f21121H.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f21116C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21119F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f21120G;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f21121H;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f21117D = findViewById(i.f.f42500a);
        this.f21118E = findViewById(i.f.f42505f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f21115B || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f21116C
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f21122I
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f21121H
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f21119F
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f21117D
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f21119F
            android.view.View r7 = r4.f21117D
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f21117D
            int r8 = r8.getTop()
            android.view.View r0 = r4.f21117D
            int r0 = r0.getRight()
            android.view.View r2 = r4.f21117D
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f21118E
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f21119F
            android.view.View r7 = r4.f21118E
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f21118E
            int r8 = r8.getTop()
            android.view.View r0 = r4.f21118E
            int r0 = r0.getRight()
            android.view.View r2 = r4.f21118E
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f21119F
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f21123J = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f21120G
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f21117D == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f21124K) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f21117D == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f21116C;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f21117D) ? a(this.f21117D) : !b(this.f21118E) ? a(this.f21118E) : 0) + a(this.f21116C), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f21119F;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f21119F);
        }
        this.f21119F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f21117D;
            if (view != null) {
                this.f21119F.setBounds(view.getLeft(), this.f21117D.getTop(), this.f21117D.getRight(), this.f21117D.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f21122I ? !(this.f21119F != null || this.f21120G != null) : this.f21121H == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f21121H;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f21121H);
        }
        this.f21121H = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f21122I && (drawable2 = this.f21121H) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f21122I ? !(this.f21119F != null || this.f21120G != null) : this.f21121H == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f21120G;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f21120G);
        }
        this.f21120G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f21123J && (drawable2 = this.f21120G) != null) {
                drawable2.setBounds(this.f21116C.getLeft(), this.f21116C.getTop(), this.f21116C.getRight(), this.f21116C.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f21122I ? !(this.f21119F != null || this.f21120G != null) : this.f21121H == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(T t10) {
        View view = this.f21116C;
        if (view != null) {
            removeView(view);
        }
        this.f21116C = t10;
        if (t10 != null) {
            addView(t10);
            ViewGroup.LayoutParams layoutParams = t10.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t10.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f21115B = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f21119F;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f21120G;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f21121H;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f21119F && !this.f21122I) || (drawable == this.f21120G && this.f21123J) || ((drawable == this.f21121H && this.f21122I) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
