package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.f0;
import k1.C3784a;
import s1.C4421a;
import s1.X;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends h implements k.a {

    /* renamed from: k0, reason: collision with root package name */
    private static final int[] f36659k0 = {R.attr.state_checked};

    /* renamed from: W, reason: collision with root package name */
    private int f36660W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f36661a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f36662b0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f36663c0;

    /* renamed from: d0, reason: collision with root package name */
    private final CheckedTextView f36664d0;

    /* renamed from: e0, reason: collision with root package name */
    private FrameLayout f36665e0;

    /* renamed from: f0, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f36666f0;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f36667g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f36668h0;

    /* renamed from: i0, reason: collision with root package name */
    private Drawable f36669i0;

    /* renamed from: j0, reason: collision with root package name */
    private final C4421a f36670j0;

    class a extends C4421a {
        a() {
        }

        @Override // s1.C4421a
        public void g(View view, t1.t tVar) {
            super.g(view, tVar);
            tVar.f0(NavigationMenuItemView.this.f36662b0);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f36664d0.setVisibility(8);
            FrameLayout frameLayout = this.f36665e0;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f36665e0.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f36664d0.setVisibility(0);
        FrameLayout frameLayout2 = this.f36665e0;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f36665e0.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i.a.f42416w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f36659k0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f36666f0.getTitle() == null && this.f36666f0.getIcon() == null && this.f36666f0.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f36665e0 == null) {
                this.f36665e0 = (FrameLayout) ((ViewStub) findViewById(C7.g.f2480g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f36665e0.removeAllViews();
            this.f36665e0.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f36666f0 = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            X.r0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        f0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f36666f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f36666f0;
        if (gVar != null && gVar.isCheckable() && this.f36666f0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36659k0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f36662b0 != z10) {
            this.f36662b0 = z10;
            this.f36670j0.l(this.f36664d0, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f36664d0.setChecked(z10);
        CheckedTextView checkedTextView = this.f36664d0;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f36663c0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f36668h0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C3784a.r(drawable).mutate();
                C3784a.o(drawable, this.f36667g0);
            }
            int i10 = this.f36660W;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f36661a0) {
            if (this.f36669i0 == null) {
                Drawable drawableE = i1.h.e(getResources(), C7.f.f2443m, getContext().getTheme());
                this.f36669i0 = drawableE;
                if (drawableE != null) {
                    int i11 = this.f36660W;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f36669i0;
        }
        androidx.core.widget.j.k(this.f36664d0, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f36664d0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f36660W = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f36667g0 = colorStateList;
        this.f36668h0 = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f36666f0;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f36664d0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f36661a0 = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.q(this.f36664d0, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f36664d0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36664d0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36663c0 = true;
        a aVar = new a();
        this.f36670j0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C7.i.f2509g, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C7.e.f2399k));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C7.g.f2481h);
        this.f36664d0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        X.n0(checkedTextView, aVar);
    }
}
