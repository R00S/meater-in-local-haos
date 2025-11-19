package com.google.android.material.transformation;

import C7.b;
import D7.h;
import D7.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import s1.X;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: J, reason: collision with root package name */
    private Map<View, Integer> f37563J;

    public FabTransformationSheetBehavior() {
    }

    private void k0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f37563J = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f37563J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        X.x0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f37563J;
                        if (map != null && map.containsKey(childAt)) {
                            X.x0(childAt, this.f37563J.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f37563J = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean L(View view, View view2, boolean z10, boolean z11) {
        k0(view2, z10);
        return super.L(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e i0(Context context, boolean z10) {
        int i10 = z10 ? b.f2276d : b.f2275c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f37556a = h.c(context, i10);
        eVar.f37557b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
