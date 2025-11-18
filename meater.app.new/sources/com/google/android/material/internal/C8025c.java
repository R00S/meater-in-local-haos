package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0297g;
import androidx.core.view.C0311u;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8918l;

/* compiled from: FlowLayout.java */
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes2.dex */
public class C8025c extends ViewGroup {

    /* renamed from: f */
    private int f30382f;

    /* renamed from: g */
    private int f30383g;

    /* renamed from: h */
    private boolean f30384h;

    /* renamed from: i */
    private int f30385i;

    public C8025c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m24659a(int i2, int i3, int i4) {
        return i3 != Integer.MIN_VALUE ? i3 != 1073741824 ? i4 : i2 : Math.min(i4, i2);
    }

    /* renamed from: d */
    private void m24660d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C8918l.f34185a2, 0, 0);
        this.f30382f = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34201c2, 0);
        this.f30383g = typedArrayObtainStyledAttributes.getDimensionPixelSize(C8918l.f34193b2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m24661b(View view) {
        Object tag = view.getTag(C8912f.f33936z);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo24163c() {
        return this.f30384h;
    }

    protected int getItemSpacing() {
        return this.f30383g;
    }

    protected int getLineSpacing() {
        return this.f30382f;
    }

    protected int getRowCount() {
        return this.f30385i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iM2044a;
        int iM2045b;
        if (getChildCount() == 0) {
            this.f30385i = 0;
            return;
        }
        this.f30385i = 1;
        boolean z2 = C0311u.m2162y(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i6 = (i4 - i2) - paddingLeft;
        int measuredWidth = paddingRight;
        int i7 = paddingTop;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C8912f.f33936z, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iM2045b = C0297g.m2045b(marginLayoutParams);
                    iM2044a = C0297g.m2044a(marginLayoutParams);
                } else {
                    iM2044a = 0;
                    iM2045b = 0;
                }
                int measuredWidth2 = measuredWidth + iM2045b + childAt.getMeasuredWidth();
                if (!this.f30384h && measuredWidth2 > i6) {
                    i7 = this.f30382f + paddingTop;
                    this.f30385i++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C8912f.f33936z, Integer.valueOf(this.f30385i - 1));
                int i9 = measuredWidth + iM2045b;
                int measuredWidth3 = childAt.getMeasuredWidth() + i9;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z2) {
                    childAt.layout(i6 - measuredWidth3, i7, (i6 - measuredWidth) - iM2045b, measuredHeight);
                } else {
                    childAt.layout(i9, i7, measuredWidth3, measuredHeight);
                }
                measuredWidth += iM2045b + iM2044a + childAt.getMeasuredWidth() + this.f30383g;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= paddingRight || mo24163c()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f30382f + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i5 + childAt.getMeasuredWidth() + this.f30383g;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m24659a(size, mode, i8 + getPaddingRight()), m24659a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i2) {
        this.f30383g = i2;
    }

    protected void setLineSpacing(int i2) {
        this.f30382f = i2;
    }

    public void setSingleLine(boolean z) {
        this.f30384h = z;
    }

    public C8025c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f30384h = false;
        m24660d(context, attributeSet);
    }
}
