package com.google.android.material.appbar;

import C7.l;
import C7.m;
import X7.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b8.C2272a;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;
import k1.C3784a;
import s1.X;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: D0, reason: collision with root package name */
    private static final int f35871D0 = l.f2563F;

    /* renamed from: E0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f35872E0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: A0, reason: collision with root package name */
    private boolean f35873A0;

    /* renamed from: B0, reason: collision with root package name */
    private ImageView.ScaleType f35874B0;

    /* renamed from: C0, reason: collision with root package name */
    private Boolean f35875C0;

    /* renamed from: y0, reason: collision with root package name */
    private Integer f35876y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f35877z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2328m0);
    }

    private Pair<Integer, Integer> V(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void W(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (colorStateListValueOf != null) {
            X7.g gVar = new X7.g();
            gVar.b0(colorStateListValueOf);
            gVar.Q(context);
            gVar.a0(X.u(this));
            X.r0(this, gVar);
        }
    }

    private void X(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void Y() {
        if (this.f35877z0 || this.f35873A0) {
            TextView textViewG = s.g(this);
            TextView textViewE = s.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairV = V(textViewG, textViewE);
            if (this.f35877z0 && textViewG != null) {
                X(textViewG, pairV);
            }
            if (!this.f35873A0 || textViewE == null) {
                return;
            }
            X(textViewE, pairV);
        }
    }

    private Drawable Z(Drawable drawable) {
        if (drawable == null || this.f35876y0 == null) {
            return drawable;
        }
        Drawable drawableR = C3784a.r(drawable.mutate());
        C3784a.n(drawableR, this.f35876y0.intValue());
        return drawableR;
    }

    private void a0() {
        ImageView imageViewC = s.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f35875C0;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f35874B0;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f35874B0;
    }

    public Integer getNavigationIconTint() {
        return this.f35876y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Y();
        a0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f35875C0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f35875C0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f35874B0 != scaleType) {
            this.f35874B0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Z(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f35876y0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f35873A0 != z10) {
            this.f35873A0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f35877z0 != z10) {
            this.f35877z0 = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.e;
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).i0();
        }
        super.y(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.e) menu).h0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f35871D0;
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = r.i(context2, attributeSet, m.f2867b5, i10, i11, new int[0]);
        int i12 = m.f2900e5;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.f35877z0 = typedArrayI.getBoolean(m.f2922g5, false);
        this.f35873A0 = typedArrayI.getBoolean(m.f2911f5, false);
        int i13 = typedArrayI.getInt(m.f2889d5, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f35872E0;
            if (i13 < scaleTypeArr.length) {
                this.f35874B0 = scaleTypeArr[i13];
            }
        }
        int i14 = m.f2878c5;
        if (typedArrayI.hasValue(i14)) {
            this.f35875C0 = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        W(context2);
    }
}
