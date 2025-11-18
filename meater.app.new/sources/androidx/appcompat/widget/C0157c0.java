package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C0311u;
import p024c.p025a.C0832j;

/* compiled from: LinearLayoutCompat.java */
/* renamed from: androidx.appcompat.widget.c0 */
/* loaded from: classes.dex */
public class C0157c0 extends ViewGroup {

    /* renamed from: f */
    private boolean f1047f;

    /* renamed from: g */
    private int f1048g;

    /* renamed from: h */
    private int f1049h;

    /* renamed from: i */
    private int f1050i;

    /* renamed from: j */
    private int f1051j;

    /* renamed from: k */
    private int f1052k;

    /* renamed from: l */
    private float f1053l;

    /* renamed from: m */
    private boolean f1054m;

    /* renamed from: n */
    private int[] f1055n;

    /* renamed from: o */
    private int[] f1056o;

    /* renamed from: p */
    private Drawable f1057p;

    /* renamed from: q */
    private int f1058q;

    /* renamed from: r */
    private int f1059r;

    /* renamed from: s */
    private int f1060s;

    /* renamed from: t */
    private int f1061t;

    public C0157c0(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m898A(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    /* renamed from: k */
    private void m899k(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewM908s = m908s(i4);
            if (viewM908s.getVisibility() != 8) {
                a aVar = (a) viewM908s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewM908s.getMeasuredWidth();
                    measureChildWithMargins(viewM908s, i3, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    /* renamed from: l */
    private void m900l(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewM908s = m908s(i4);
            if (viewM908s.getVisibility() != 8) {
                a aVar = (a) viewM908s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewM908s.getMeasuredHeight();
                    measureChildWithMargins(viewM908s, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: g */
    void m901g(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean zM1231b = C0197w0.m1231b(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewM908s = m908s(i3);
            if (viewM908s != null && viewM908s.getVisibility() != 8 && m909t(i3)) {
                a aVar = (a) viewM908s.getLayoutParams();
                m904j(canvas, zM1231b ? viewM908s.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewM908s.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1058q);
            }
        }
        if (m909t(virtualChildCount)) {
            View viewM908s2 = m908s(virtualChildCount - 1);
            if (viewM908s2 != null) {
                a aVar2 = (a) viewM908s2.getLayoutParams();
                if (zM1231b) {
                    left = viewM908s2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i2 = this.f1058q;
                    right = left - i2;
                } else {
                    right = viewM908s2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zM1231b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f1058q;
                right = left - i2;
            }
            m904j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1048g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1048g;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1048g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1049h;
        if (this.f1050i == 1 && (i2 = this.f1051j & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1052k) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1052k;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1048g;
    }

    public Drawable getDividerDrawable() {
        return this.f1057p;
    }

    public int getDividerPadding() {
        return this.f1061t;
    }

    public int getDividerWidth() {
        return this.f1058q;
    }

    public int getGravity() {
        return this.f1051j;
    }

    public int getOrientation() {
        return this.f1050i;
    }

    public int getShowDividers() {
        return this.f1060s;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1053l;
    }

    /* renamed from: h */
    void m902h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewM908s = m908s(i2);
            if (viewM908s != null && viewM908s.getVisibility() != 8 && m909t(i2)) {
                m903i(canvas, (viewM908s.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewM908s.getLayoutParams())).topMargin) - this.f1059r);
            }
        }
        if (m909t(virtualChildCount)) {
            View viewM908s2 = m908s(virtualChildCount - 1);
            m903i(canvas, viewM908s2 == null ? (getHeight() - getPaddingBottom()) - this.f1059r : viewM908s2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewM908s2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: i */
    void m903i(Canvas canvas, int i2) {
        this.f1057p.setBounds(getPaddingLeft() + this.f1061t, i2, (getWidth() - getPaddingRight()) - this.f1061t, this.f1059r + i2);
        this.f1057p.draw(canvas);
    }

    /* renamed from: j */
    void m904j(Canvas canvas, int i2) {
        this.f1057p.setBounds(i2, getPaddingTop() + this.f1061t, this.f1058q + i2, (getHeight() - getPaddingBottom()) - this.f1061t);
        this.f1057p.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.f1050i;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1057p == null) {
            return;
        }
        if (this.f1050i == 1) {
            m902h(canvas);
        } else {
            m901g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f1050i == 1) {
            m911v(i2, i3, i4, i5);
        } else {
            m910u(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f1050i == 1) {
            m915z(i2, i3);
        } else {
            m913x(i2, i3);
        }
    }

    /* renamed from: p */
    int m905p(View view, int i2) {
        return 0;
    }

    /* renamed from: q */
    int m906q(View view) {
        return 0;
    }

    /* renamed from: r */
    int m907r(View view) {
        return 0;
    }

    /* renamed from: s */
    View m908s(int i2) {
        return getChildAt(i2);
    }

    public void setBaselineAligned(boolean z) {
        this.f1047f = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1048g = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1057p) {
            return;
        }
        this.f1057p = drawable;
        if (drawable != null) {
            this.f1058q = drawable.getIntrinsicWidth();
            this.f1059r = drawable.getIntrinsicHeight();
        } else {
            this.f1058q = 0;
            this.f1059r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1061t = i2;
    }

    public void setGravity(int i2) {
        if (this.f1051j != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1051j = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1051j;
        if ((8388615 & i4) != i3) {
            this.f1051j = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1054m = z;
    }

    public void setOrientation(int i2) {
        if (this.f1050i != i2) {
            this.f1050i = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1060s) {
            requestLayout();
        }
        this.f1060s = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f1051j;
        if ((i4 & 112) != i3) {
            this.f1051j = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1053l = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    protected boolean m909t(int i2) {
        if (i2 == 0) {
            return (this.f1060s & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f1060s & 4) != 0;
        }
        if ((this.f1060s & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m910u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0157c0.m910u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m911v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1051j
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1052k
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1052k
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.m908s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m914y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.c0$a r5 = (androidx.appcompat.widget.C0157c0.a) r5
            int r1 = r5.f1063b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = androidx.core.view.C0311u.m2162y(r17)
            int r1 = androidx.core.view.C0286d.m1932b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.m909t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f1059r
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m906q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m898A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m907r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m905p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0157c0.m911v(int, int, int, int):void");
    }

    /* renamed from: w */
    void m912w(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m913x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0157c0.m913x(int, int):void");
    }

    /* renamed from: y */
    int m914y(int i2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0330  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m915z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0157c0.m915z(int, int):void");
    }

    public C0157c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0157c0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1047f = true;
        this.f1048g = -1;
        this.f1049h = 0;
        this.f1051j = 8388659;
        int[] iArr = C0832j.f5335b1;
        C0185q0 c0185q0M1091v = C0185q0.m1091v(context, attributeSet, iArr, i2, 0);
        C0311u.m2127g0(this, context, iArr, attributeSet, c0185q0M1091v.m1109r(), i2, 0);
        int iM1102k = c0185q0M1091v.m1102k(C0832j.f5345d1, -1);
        if (iM1102k >= 0) {
            setOrientation(iM1102k);
        }
        int iM1102k2 = c0185q0M1091v.m1102k(C0832j.f5340c1, -1);
        if (iM1102k2 >= 0) {
            setGravity(iM1102k2);
        }
        boolean zM1092a = c0185q0M1091v.m1092a(C0832j.f5350e1, true);
        if (!zM1092a) {
            setBaselineAligned(zM1092a);
        }
        this.f1053l = c0185q0M1091v.m1100i(C0832j.f5360g1, -1.0f);
        this.f1048g = c0185q0M1091v.m1102k(C0832j.f5355f1, -1);
        this.f1054m = c0185q0M1091v.m1092a(C0832j.f5375j1, false);
        setDividerDrawable(c0185q0M1091v.m1098g(C0832j.f5365h1));
        this.f1060s = c0185q0M1091v.m1102k(C0832j.f5380k1, 0);
        this.f1061t = c0185q0M1091v.m1097f(C0832j.f5370i1, 0);
        c0185q0M1091v.m1111w();
    }

    /* compiled from: LinearLayoutCompat.java */
    /* renamed from: androidx.appcompat.widget.c0$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1062a;

        /* renamed from: b */
        public int f1063b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1063b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5385l1);
            this.f1062a = typedArrayObtainStyledAttributes.getFloat(C0832j.f5395n1, 0.0f);
            this.f1063b = typedArrayObtainStyledAttributes.getInt(C0832j.f5390m1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1063b = -1;
            this.f1062a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1063b = -1;
        }
    }
}
