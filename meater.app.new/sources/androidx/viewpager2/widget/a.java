package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f29821b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f29822a;

    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0415a implements Comparator<int[]> {
        C0415a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f29821b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f29822a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int iO = this.f29822a.O();
        if (iO == 0) {
            return true;
        }
        boolean z10 = this.f29822a.r2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iO, 2);
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN = this.f29822a.N(i12);
            if (viewN == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewN.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f29821b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = viewN.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = viewN.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = viewN.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewN.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C0415a());
        for (int i13 = 1; i13 < iO; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[iO - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int iO = this.f29822a.O();
        for (int i10 = 0; i10 < iO; i10++) {
            if (c(this.f29822a.N(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f29822a.O() <= 1) && b();
    }
}
