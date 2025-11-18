package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C0311u;
import p024c.p025a.C0828f;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: f */
    private boolean f836f;

    /* renamed from: g */
    private int f837g;

    /* renamed from: h */
    private int f838h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f837g = -1;
        this.f838h = 0;
        int[] iArr = C0832j.f5270O0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0311u.m2127g0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f836f = typedArrayObtainStyledAttributes.getBoolean(C0832j.f5275P0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m769a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m770b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(C0828f.f5126G);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f838h, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f836f) {
            if (size > this.f837g && m770b()) {
                setStacked(false);
            }
            this.f837g = size;
        }
        if (m770b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f836f && !m770b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i2, i3);
        }
        int iM769a = m769a(0);
        if (iM769a >= 0) {
            View childAt = getChildAt(iM769a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m770b()) {
                int iM769a2 = m769a(iM769a + 1);
                if (iM769a2 >= 0) {
                    paddingTop += getChildAt(iM769a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (C0311u.m2164z(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f836f != z) {
            this.f836f = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
