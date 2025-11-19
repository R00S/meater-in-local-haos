package com.google.android.material.bottomnavigation;

import C7.e;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.c;
import java.util.ArrayList;
import java.util.List;
import s1.X;

/* compiled from: BottomNavigationMenuView.java */
/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: l0, reason: collision with root package name */
    private final int f35996l0;

    /* renamed from: m0, reason: collision with root package name */
    private final int f35997m0;

    /* renamed from: n0, reason: collision with root package name */
    private final int f35998n0;

    /* renamed from: o0, reason: collision with root package name */
    private final int f35999o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f36000p0;

    /* renamed from: q0, reason: collision with root package name */
    private final List<Integer> f36001q0;

    public b(Context context) {
        super(context);
        this.f36001q0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f35996l0 = resources.getDimensionPixelSize(e.f2385d);
        this.f35997m0 = resources.getDimensionPixelSize(e.f2387e);
        this.f35998n0 = resources.getDimensionPixelSize(e.f2381b);
        this.f35999o0 = resources.getDimensionPixelSize(e.f2383c);
    }

    @Override // com.google.android.material.navigation.c
    protected com.google.android.material.navigation.a g(Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (X.z(this) == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        androidx.appcompat.view.menu.e menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.G().size();
        int childCount = getChildCount();
        this.f36001q0.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (j(getLabelVisibilityMode(), size2) && r()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.f35999o0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f35998n0, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i14 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f35997m0 * i14), Math.min(iMax, this.f35998n0));
            int i15 = size - iMin;
            int iMin2 = Math.min(i15 / (i14 != 0 ? i14 : 1), this.f35996l0);
            int i16 = i15 - (i14 * iMin2);
            int i17 = 0;
            while (i17 < childCount) {
                if (getChildAt(i17).getVisibility() != 8) {
                    i13 = i17 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i16 > 0) {
                        i13++;
                        i16--;
                    }
                } else {
                    i13 = 0;
                }
                this.f36001q0.add(Integer.valueOf(i13));
                i17++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.f35998n0);
            int i18 = size - (size2 * iMin3);
            for (int i19 = 0; i19 < childCount; i19++) {
                if (getChildAt(i19).getVisibility() == 8) {
                    i12 = 0;
                } else if (i18 > 0) {
                    i12 = iMin3 + 1;
                    i18--;
                } else {
                    i12 = iMin3;
                }
                this.f36001q0.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f36001q0.get(i20).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public boolean r() {
        return this.f36000p0;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f36000p0 = z10;
    }
}
