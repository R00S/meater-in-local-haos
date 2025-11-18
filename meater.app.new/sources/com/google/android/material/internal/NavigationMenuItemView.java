package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.C0157c0;
import androidx.appcompat.widget.C0189s0;
import androidx.core.content.p003d.C0263f;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.widget.C0330k;
import androidx.recyclerview.widget.RecyclerView;
import p024c.p025a.C0823a;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8911e;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends C8026d implements InterfaceC0094n.a {

    /* renamed from: A */
    private static final int[] f30313A = {R.attr.state_checked};

    /* renamed from: B */
    private int f30314B;

    /* renamed from: C */
    private boolean f30315C;

    /* renamed from: D */
    boolean f30316D;

    /* renamed from: E */
    private final CheckedTextView f30317E;

    /* renamed from: F */
    private FrameLayout f30318F;

    /* renamed from: G */
    private C0089i f30319G;

    /* renamed from: H */
    private ColorStateList f30320H;

    /* renamed from: I */
    private boolean f30321I;

    /* renamed from: J */
    private Drawable f30322J;

    /* renamed from: K */
    private final C0280a f30323K;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C8021a extends C0280a {
        C8021a() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1968W(NavigationMenuItemView.this.f30316D);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m24585B() {
        if (m24587D()) {
            this.f30317E.setVisibility(8);
            FrameLayout frameLayout = this.f30318F;
            if (frameLayout != null) {
                C0157c0.a aVar = (C0157c0.a) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) aVar).width = -1;
                this.f30318F.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f30317E.setVisibility(0);
        FrameLayout frameLayout2 = this.f30318F;
        if (frameLayout2 != null) {
            C0157c0.a aVar2 = (C0157c0.a) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) aVar2).width = -2;
            this.f30318F.setLayoutParams(aVar2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m24586C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0823a.f5048v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f30313A, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    private boolean m24587D() {
        return this.f30319G.getTitle() == null && this.f30319G.getIcon() == null && this.f30319G.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f30318F == null) {
                this.f30318F = (FrameLayout) ((ViewStub) findViewById(C8912f.f33915e)).inflate();
            }
            this.f30318F.removeAllViews();
            this.f30318F.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: d */
    public boolean mo471d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: e */
    public void mo472e(C0089i c0089i, int i2) throws Resources.NotFoundException {
        this.f30319G = c0089i;
        if (c0089i.getItemId() > 0) {
            setId(c0089i.getItemId());
        }
        setVisibility(c0089i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0311u.m2139m0(this, m24586C());
        }
        setCheckable(c0089i.isCheckable());
        setChecked(c0089i.isChecked());
        setEnabled(c0089i.isEnabled());
        setTitle(c0089i.getTitle());
        setIcon(c0089i.getIcon());
        setActionView(c0089i.getActionView());
        setContentDescription(c0089i.getContentDescription());
        C0189s0.m1179a(this, c0089i.getTooltipText());
        m24585B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    public C0089i getItemData() {
        return this.f30319G;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0089i c0089i = this.f30319G;
        if (c0089i != null && c0089i.isCheckable() && this.f30319G.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, f30313A);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f30316D != z) {
            this.f30316D = z;
            this.f30323K.mo1862l(this.f30317E, RecyclerView.AbstractC0599l.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f30317E.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f30321I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0265a.m1821r(drawable).mutate();
                C0265a.m1818o(drawable, this.f30320H);
            }
            int i2 = this.f30314B;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f30315C) {
            if (this.f30322J == null) {
                Drawable drawableM1751d = C0263f.m1751d(getResources(), C8911e.f33899h, getContext().getTheme());
                this.f30322J = drawableM1751d;
                if (drawableM1751d != null) {
                    int i3 = this.f30314B;
                    drawableM1751d.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f30322J;
        }
        C0330k.m2328i(this.f30317E, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f30317E.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f30314B = i2;
    }

    void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f30320H = colorStateList;
        this.f30321I = colorStateList != null;
        C0089i c0089i = this.f30319G;
        if (c0089i != null) {
            setIcon(c0089i.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f30317E.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f30315C = z;
    }

    public void setTextAppearance(int i2) {
        C0330k.m2333n(this.f30317E, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f30317E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f30317E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8021a c8021a = new C8021a();
        this.f30323K = c8021a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C8914h.f33943e, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C8910d.f33878m));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C8912f.f33916f);
        this.f30317E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0311u.m2131i0(checkedTextView, c8021a);
    }
}
