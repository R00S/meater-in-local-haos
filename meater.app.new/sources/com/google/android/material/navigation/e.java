package com.google.android.material.navigation;

import C7.m;
import X7.g;
import X7.h;
import X7.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.a0;
import b8.C2272a;
import com.google.android.material.internal.r;
import k1.C3784a;
import s1.X;
import y1.AbstractC5121a;

/* compiled from: NavigationBarView.java */
/* loaded from: classes2.dex */
public abstract class e extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private final com.google.android.material.navigation.b f36888B;

    /* renamed from: C, reason: collision with root package name */
    private final com.google.android.material.navigation.c f36889C;

    /* renamed from: D, reason: collision with root package name */
    private final com.google.android.material.navigation.d f36890D;

    /* renamed from: E, reason: collision with root package name */
    private MenuInflater f36891E;

    /* renamed from: F, reason: collision with root package name */
    private c f36892F;

    /* compiled from: NavigationBarView.java */
    public interface b {
    }

    /* compiled from: NavigationBarView.java */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* compiled from: NavigationBarView.java */
    static class d extends AbstractC5121a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: D, reason: collision with root package name */
        Bundle f36894D;

        /* compiled from: NavigationBarView.java */
        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f36894D = parcel.readBundle(classLoader);
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f36894D);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public e(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        super(C2272a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.navigation.d dVar = new com.google.android.material.navigation.d();
        this.f36890D = dVar;
        Context context2 = getContext();
        int[] iArr = m.f3097w5;
        int i12 = m.f2686J5;
        int i13 = m.f2666H5;
        a0 a0VarJ = r.j(context2, attributeSet, iArr, i10, i11, i12, i13);
        com.google.android.material.navigation.b bVar = new com.google.android.material.navigation.b(context2, getClass(), getMaxItemCount());
        this.f36888B = bVar;
        com.google.android.material.navigation.c cVarC = c(context2);
        this.f36889C = cVarC;
        dVar.b(cVarC);
        dVar.a(1);
        cVarC.setPresenter(dVar);
        bVar.b(dVar);
        dVar.j(getContext(), bVar);
        int i14 = m.f2626D5;
        if (a0VarJ.s(i14)) {
            cVarC.setIconTintList(a0VarJ.c(i14));
        } else {
            cVarC.setIconTintList(cVarC.e(R.attr.textColorSecondary));
        }
        setItemIconSize(a0VarJ.f(m.f2616C5, getResources().getDimensionPixelSize(C7.e.f2414r0)));
        if (a0VarJ.s(i12)) {
            setItemTextAppearanceInactive(a0VarJ.n(i12, 0));
        }
        if (a0VarJ.s(i13)) {
            setItemTextAppearanceActive(a0VarJ.n(i13, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(a0VarJ.a(m.f2676I5, true));
        int i15 = m.f2696K5;
        if (a0VarJ.s(i15)) {
            setItemTextColor(a0VarJ.c(i15));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(background);
        if (background == null || colorStateListF != null) {
            g gVar = new g(k.e(context2, attributeSet, i10, i11).m());
            if (colorStateListF != null) {
                gVar.b0(colorStateListF);
            }
            gVar.Q(context2);
            X.r0(this, gVar);
        }
        int i16 = m.f2646F5;
        if (a0VarJ.s(i16)) {
            setItemPaddingTop(a0VarJ.f(i16, 0));
        }
        int i17 = m.f2636E5;
        if (a0VarJ.s(i17)) {
            setItemPaddingBottom(a0VarJ.f(i17, 0));
        }
        int i18 = m.f3107x5;
        if (a0VarJ.s(i18)) {
            setActiveIndicatorLabelPadding(a0VarJ.f(i18, 0));
        }
        if (a0VarJ.s(m.f3127z5)) {
            setElevation(a0VarJ.f(r10, 0));
        }
        C3784a.o(getBackground().mutate(), U7.c.b(context2, a0VarJ, m.f3117y5));
        setLabelVisibilityMode(a0VarJ.l(m.f2706L5, -1));
        int iN = a0VarJ.n(m.f2606B5, 0);
        if (iN != 0) {
            cVarC.setItemBackgroundRes(iN);
        } else {
            setItemRippleColor(U7.c.b(context2, a0VarJ, m.f2656G5));
        }
        int iN2 = a0VarJ.n(m.f2596A5, 0);
        if (iN2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iN2, m.f3032q5);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f3054s5, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f3043r5, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(m.f3076u5, 0));
            setItemActiveIndicatorColor(U7.c.a(context2, typedArrayObtainStyledAttributes, m.f3065t5));
            setItemActiveIndicatorShapeAppearance(k.b(context2, typedArrayObtainStyledAttributes.getResourceId(m.f3087v5, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i19 = m.f2716M5;
        if (a0VarJ.s(i19)) {
            e(a0VarJ.n(i19, 0));
        }
        a0VarJ.x();
        addView(cVarC);
        bVar.W(new a());
    }

    static /* synthetic */ b a(e eVar) {
        eVar.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f36891E == null) {
            this.f36891E = new androidx.appcompat.view.g(getContext());
        }
        return this.f36891E;
    }

    protected abstract com.google.android.material.navigation.c c(Context context);

    public E7.a d(int i10) {
        return this.f36889C.i(i10);
    }

    public void e(int i10) throws Resources.NotFoundException {
        this.f36890D.l(true);
        getMenuInflater().inflate(i10, this.f36888B);
        this.f36890D.l(false);
        this.f36890D.e(true);
    }

    public void f(int i10) {
        this.f36889C.l(i10);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f36889C.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f36889C.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f36889C.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f36889C.getItemActiveIndicatorMarginHorizontal();
    }

    public k getItemActiveIndicatorShapeAppearance() {
        return this.f36889C.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f36889C.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f36889C.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f36889C.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f36889C.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f36889C.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f36889C.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f36889C.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f36889C.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f36889C.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f36889C.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f36889C.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f36889C.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f36888B;
    }

    public androidx.appcompat.view.menu.k getMenuView() {
        return this.f36889C;
    }

    public com.google.android.material.navigation.d getPresenter() {
        return this.f36890D;
    }

    public int getSelectedItemId() {
        return this.f36889C.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f36888B.T(dVar.f36894D);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f36894D = bundle;
        this.f36888B.V(bundle);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f36889C.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f36889C.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f36889C.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f36889C.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f36889C.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(k kVar) {
        this.f36889C.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f36889C.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f36889C.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f36889C.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(int i10) {
        this.f36889C.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f36889C.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f36889C.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f36889C.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f36889C.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f36889C.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        this.f36889C.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f36889C.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f36889C.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) throws Resources.NotFoundException {
        if (this.f36889C.getLabelVisibilityMode() != i10) {
            this.f36889C.setLabelVisibilityMode(i10);
            this.f36890D.e(false);
        }
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f36892F = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem menuItemFindItem = this.f36888B.findItem(i10);
        if (menuItemFindItem == null || this.f36888B.P(menuItemFindItem, this.f36890D, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    /* compiled from: NavigationBarView.java */
    class a implements e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a(e.this);
            return (e.this.f36892F == null || e.this.f36892F.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }
}
