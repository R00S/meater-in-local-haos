package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.C0189s0;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0309s;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.widget.C0330k;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C7939a;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8911e;
import p241e.p254e.p256b.p271c.C8912f;
import p241e.p254e.p256b.p271c.C8914h;
import p241e.p254e.p256b.p271c.C8916j;

/* compiled from: BottomNavigationItemView.java */
/* renamed from: com.google.android.material.bottomnavigation.a */
/* loaded from: classes2.dex */
public class C7960a extends FrameLayout implements InterfaceC0094n.a {

    /* renamed from: f */
    private static final int[] f29786f = {R.attr.state_checked};

    /* renamed from: g */
    private final int f29787g;

    /* renamed from: h */
    private float f29788h;

    /* renamed from: i */
    private float f29789i;

    /* renamed from: j */
    private float f29790j;

    /* renamed from: k */
    private int f29791k;

    /* renamed from: l */
    private boolean f29792l;

    /* renamed from: m */
    private ImageView f29793m;

    /* renamed from: n */
    private final TextView f29794n;

    /* renamed from: o */
    private final TextView f29795o;

    /* renamed from: p */
    private int f29796p;

    /* renamed from: q */
    private C0089i f29797q;

    /* renamed from: r */
    private ColorStateList f29798r;

    /* renamed from: s */
    private Drawable f29799s;

    /* renamed from: t */
    private Drawable f29800t;

    /* renamed from: u */
    private BadgeDrawable f29801u;

    /* compiled from: BottomNavigationItemView.java */
    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (C7960a.this.f29793m.getVisibility() == 0) {
                C7960a c7960a = C7960a.this;
                c7960a.m23956m(c7960a.f29793m);
            }
        }
    }

    public C7960a(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m23949c(float f2, float f3) {
        this.f29788h = f2 - f3;
        this.f29789i = (f3 * 1.0f) / f2;
        this.f29790j = (f2 * 1.0f) / f3;
    }

    /* renamed from: f */
    private FrameLayout m23950f(View view) {
        ImageView imageView = this.f29793m;
        if (view == imageView && C7939a.f29706a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m23951g() {
        return this.f29801u != null;
    }

    /* renamed from: i */
    private void m23952i(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private void m23953j(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    /* renamed from: k */
    private void m23954k(View view) {
        if (m23951g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C7939a.m23852a(this.f29801u, view, m23950f(view));
        }
    }

    /* renamed from: l */
    private void m23955l(View view) {
        if (m23951g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C7939a.m23855d(this.f29801u, view, m23950f(view));
            }
            this.f29801u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m23956m(View view) {
        if (m23951g()) {
            C7939a.m23856e(this.f29801u, view, m23950f(view));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: d */
    public boolean mo471d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    /* renamed from: e */
    public void mo472e(C0089i c0089i, int i2) {
        this.f29797q = c0089i;
        setCheckable(c0089i.isCheckable());
        setChecked(c0089i.isChecked());
        setEnabled(c0089i.isEnabled());
        setIcon(c0089i.getIcon());
        setTitle(c0089i.getTitle());
        setId(c0089i.getItemId());
        if (!TextUtils.isEmpty(c0089i.getContentDescription())) {
            setContentDescription(c0089i.getContentDescription());
        }
        C0189s0.m1179a(this, !TextUtils.isEmpty(c0089i.getTooltipText()) ? c0089i.getTooltipText() : c0089i.getTitle());
        setVisibility(c0089i.isVisible() ? 0 : 8);
    }

    BadgeDrawable getBadge() {
        return this.f29801u;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0094n.a
    public C0089i getItemData() {
        return this.f29797q;
    }

    public int getItemPosition() {
        return this.f29796p;
    }

    /* renamed from: h */
    void m23957h() {
        m23955l(this.f29793m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0089i c0089i = this.f29797q;
        if (c0089i != null && c0089i.isCheckable() && this.f29797q.isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f29786f);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f29801u;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f29797q.getTitle();
            if (!TextUtils.isEmpty(this.f29797q.getContentDescription())) {
                title = this.f29797q.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f29801u.m23818f()));
        }
        C0289c c0289cM1949y0 = C0289c.m1949y0(accessibilityNodeInfo);
        c0289cM1949y0.m1975b0(C0289c.c.m2017f(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            c0289cM1949y0.m1971Z(false);
            c0289cM1949y0.m1964Q(C0289c.a.f2352e);
        }
        c0289cM1949y0.m1997p0(getResources().getString(C8916j.f33963g));
    }

    void setBadge(BadgeDrawable badgeDrawable) {
        this.f29801u = badgeDrawable;
        ImageView imageView = this.f29793m;
        if (imageView != null) {
            m23954k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f29795o.setPivotX(r0.getWidth() / 2);
        this.f29795o.setPivotY(r0.getBaseline());
        this.f29794n.setPivotX(r0.getWidth() / 2);
        this.f29794n.setPivotY(r0.getBaseline());
        int i2 = this.f29791k;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z) {
                    m23952i(this.f29793m, this.f29787g, 49);
                    m23953j(this.f29795o, 1.0f, 1.0f, 0);
                } else {
                    m23952i(this.f29793m, this.f29787g, 17);
                    m23953j(this.f29795o, 0.5f, 0.5f, 4);
                }
                this.f29794n.setVisibility(4);
            } else if (i2 != 1) {
                if (i2 == 2) {
                    m23952i(this.f29793m, this.f29787g, 17);
                    this.f29795o.setVisibility(8);
                    this.f29794n.setVisibility(8);
                }
            } else if (z) {
                m23952i(this.f29793m, (int) (this.f29787g + this.f29788h), 49);
                m23953j(this.f29795o, 1.0f, 1.0f, 0);
                TextView textView = this.f29794n;
                float f2 = this.f29789i;
                m23953j(textView, f2, f2, 4);
            } else {
                m23952i(this.f29793m, this.f29787g, 49);
                TextView textView2 = this.f29795o;
                float f3 = this.f29790j;
                m23953j(textView2, f3, f3, 4);
                m23953j(this.f29794n, 1.0f, 1.0f, 0);
            }
        } else if (this.f29792l) {
            if (z) {
                m23952i(this.f29793m, this.f29787g, 49);
                m23953j(this.f29795o, 1.0f, 1.0f, 0);
            } else {
                m23952i(this.f29793m, this.f29787g, 17);
                m23953j(this.f29795o, 0.5f, 0.5f, 4);
            }
            this.f29794n.setVisibility(4);
        } else if (z) {
            m23952i(this.f29793m, (int) (this.f29787g + this.f29788h), 49);
            m23953j(this.f29795o, 1.0f, 1.0f, 0);
            TextView textView3 = this.f29794n;
            float f4 = this.f29789i;
            m23953j(textView3, f4, f4, 4);
        } else {
            m23952i(this.f29793m, this.f29787g, 49);
            TextView textView4 = this.f29795o;
            float f5 = this.f29790j;
            m23953j(textView4, f5, f5, 4);
            m23953j(this.f29794n, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f29794n.setEnabled(z);
        this.f29795o.setEnabled(z);
        this.f29793m.setEnabled(z);
        if (z) {
            C0311u.m2161x0(this, C0309s.m2082b(getContext(), 1002));
        } else {
            C0311u.m2161x0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f29799s) {
            return;
        }
        this.f29799s = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0265a.m1821r(drawable).mutate();
            this.f29800t = drawable;
            ColorStateList colorStateList = this.f29798r;
            if (colorStateList != null) {
                C0265a.m1818o(drawable, colorStateList);
            }
        }
        this.f29793m.setImageDrawable(drawable);
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29793m.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f29793m.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f29798r = colorStateList;
        if (this.f29797q == null || (drawable = this.f29800t) == null) {
            return;
        }
        C0265a.m1818o(drawable, colorStateList);
        this.f29800t.invalidateSelf();
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : C0255a.m1677f(getContext(), i2));
    }

    public void setItemPosition(int i2) {
        this.f29796p = i2;
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f29791k != i2) {
            this.f29791k = i2;
            C0089i c0089i = this.f29797q;
            if (c0089i != null) {
                setChecked(c0089i.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f29792l != z) {
            this.f29792l = z;
            C0089i c0089i = this.f29797q;
            if (c0089i != null) {
                setChecked(c0089i.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i2) {
        C0330k.m2333n(this.f29795o, i2);
        m23949c(this.f29794n.getTextSize(), this.f29795o.getTextSize());
    }

    public void setTextAppearanceInactive(int i2) {
        C0330k.m2333n(this.f29794n, i2);
        m23949c(this.f29794n.getTextSize(), this.f29795o.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f29794n.setTextColor(colorStateList);
            this.f29795o.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f29794n.setText(charSequence);
        this.f29795o.setText(charSequence);
        C0089i c0089i = this.f29797q;
        if (c0089i == null || TextUtils.isEmpty(c0089i.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0089i c0089i2 = this.f29797q;
        if (c0089i2 != null && !TextUtils.isEmpty(c0089i2.getTooltipText())) {
            charSequence = this.f29797q.getTooltipText();
        }
        C0189s0.m1179a(this, charSequence);
    }

    public C7960a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7960a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f29796p = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C8914h.f33939a, (ViewGroup) this, true);
        setBackgroundResource(C8911e.f33892a);
        this.f29787g = resources.getDimensionPixelSize(C8910d.f33873h);
        this.f29793m = (ImageView) findViewById(C8912f.f33917g);
        TextView textView = (TextView) findViewById(C8912f.f33900A);
        this.f29794n = textView;
        TextView textView2 = (TextView) findViewById(C8912f.f33918h);
        this.f29795o = textView2;
        C0311u.m2153t0(textView, 2);
        C0311u.m2153t0(textView2, 2);
        setFocusable(true);
        m23949c(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f29793m;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0311u.m2139m0(this, drawable);
    }
}
