package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.widget.C0185q0;
import androidx.core.content.C0255a;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8032j;
import com.google.android.material.internal.C8033k;
import com.google.android.material.theme.p178a.C8079a;
import p024c.p025a.p032o.C0847g;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8909c;
import p241e.p254e.p256b.p271c.C8910d;
import p241e.p254e.p256b.p271c.C8917k;
import p241e.p254e.p256b.p271c.C8918l;
import p241e.p254e.p256b.p271c.p272a0.C8900g;
import p241e.p254e.p256b.p271c.p272a0.C8901h;
import p241e.p254e.p256b.p271c.p285x.C8947c;
import p241e.p254e.p256b.p271c.p286y.C8952b;

/* loaded from: classes2.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: f */
    private static final int f29775f = C8917k.f33983h;

    /* renamed from: g */
    private final C0087g f29776g;

    /* renamed from: h */
    final C7962c f29777h;

    /* renamed from: i */
    private final BottomNavigationPresenter f29778i;

    /* renamed from: j */
    private ColorStateList f29779j;

    /* renamed from: k */
    private MenuInflater f29780k;

    /* renamed from: l */
    private InterfaceC7959d f29781l;

    /* renamed from: m */
    private InterfaceC7958c f29782m;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7955a();

        /* renamed from: h */
        Bundle f29783h;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
        static class C7955a implements Parcelable.ClassLoaderCreator<SavedState> {
            C7955a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m23941b(Parcel parcel, ClassLoader classLoader) {
            this.f29783h = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f29783h);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m23941b(parcel, classLoader == null ? SavedState.class.getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C7956a implements C0087g.a {
        C7956a() {
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: a */
        public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
            if (BottomNavigationView.this.f29782m == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return (BottomNavigationView.this.f29781l == null || BottomNavigationView.this.f29781l.mo7346a(menuItem)) ? false : true;
            }
            BottomNavigationView.this.f29782m.m23946a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.C0087g.a
        /* renamed from: b */
        public void mo349b(C0087g c0087g) {
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    class C7957b implements C8033k.c {
        C7957b() {
        }

        @Override // com.google.android.material.internal.C8033k.c
        /* renamed from: a */
        public C0285c0 mo23945a(View view, C0285c0 c0285c0, C8033k.d dVar) {
            dVar.f30428d += c0285c0.m1881h();
            dVar.m24702a(view);
            return c0285c0;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface InterfaceC7958c {
        /* renamed from: a */
        void m23946a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public interface InterfaceC7959d {
        /* renamed from: a */
        boolean mo7346a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8908b.f33814d);
    }

    /* renamed from: c */
    private void m23937c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0255a.m1675d(context, C8909c.f33837a));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C8910d.f33874i)));
        addView(view);
    }

    /* renamed from: d */
    private void m23938d() {
        C8033k.m24696a(this, new C7957b());
    }

    /* renamed from: e */
    private C8900g m23939e(Context context) {
        C8900g c8900g = new C8900g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            c8900g.m28284X(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        c8900g.m28278N(context);
        return c8900g;
    }

    private MenuInflater getMenuInflater() {
        if (this.f29780k == null) {
            this.f29780k = new C0847g(getContext());
        }
        return this.f29780k;
    }

    /* renamed from: f */
    public void m23940f(int i2) {
        this.f29778i.m23932m(true);
        getMenuInflater().inflate(i2, this.f29776g);
        this.f29778i.m23932m(false);
        this.f29778i.mo493c(true);
    }

    public Drawable getItemBackground() {
        return this.f29777h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f29777h.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f29777h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f29777h.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f29779j;
    }

    public int getItemTextAppearanceActive() {
        return this.f29777h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f29777h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f29777h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f29777h.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f29776g;
    }

    public int getSelectedItemId() {
        return this.f29777h.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8901h.m28311e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        this.f29776g.m572S(savedState.f29783h);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f29783h = bundle;
        this.f29776g.m574U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C8901h.m28310d(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f29777h.setItemBackground(drawable);
        this.f29779j = null;
    }

    public void setItemBackgroundResource(int i2) {
        this.f29777h.setItemBackgroundRes(i2);
        this.f29779j = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f29777h.m23965f() != z) {
            this.f29777h.setItemHorizontalTranslationEnabled(z);
            this.f29778i.mo493c(false);
        }
    }

    public void setItemIconSize(int i2) {
        this.f29777h.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f29777h.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f29779j == colorStateList) {
            if (colorStateList != null || this.f29777h.getItemBackground() == null) {
                return;
            }
            this.f29777h.setItemBackground(null);
            return;
        }
        this.f29779j = colorStateList;
        if (colorStateList == null) {
            this.f29777h.setItemBackground(null);
            return;
        }
        ColorStateList colorStateListM28519a = C8952b.m28519a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f29777h.setItemBackground(new RippleDrawable(colorStateListM28519a, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable drawableM1821r = C0265a.m1821r(gradientDrawable);
        C0265a.m1818o(drawableM1821r, colorStateListM28519a);
        this.f29777h.setItemBackground(drawableM1821r);
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f29777h.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f29777h.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f29777h.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f29777h.getLabelVisibilityMode() != i2) {
            this.f29777h.setLabelVisibilityMode(i2);
            this.f29778i.mo493c(false);
        }
    }

    public void setOnNavigationItemReselectedListener(InterfaceC7958c interfaceC7958c) {
        this.f29782m = interfaceC7958c;
    }

    public void setOnNavigationItemSelectedListener(InterfaceC7959d interfaceC7959d) {
        this.f29781l = interfaceC7959d;
    }

    public void setSelectedItemId(int i2) {
        MenuItem menuItemFindItem = this.f29776g.findItem(i2);
        if (menuItemFindItem == null || this.f29776g.m569O(menuItemFindItem, this.f29778i, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(C8079a.m24906c(context, attributeSet, i2, f29775f), attributeSet, i2);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f29778i = bottomNavigationPresenter;
        Context context2 = getContext();
        C0087g c7961b = new C7961b(context2);
        this.f29776g = c7961b;
        C7962c c7962c = new C7962c(context2);
        this.f29777h = c7962c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c7962c.setLayoutParams(layoutParams);
        bottomNavigationPresenter.m23930a(c7962c);
        bottomNavigationPresenter.m23931j(1);
        c7962c.setPresenter(bottomNavigationPresenter);
        c7961b.m581b(bottomNavigationPresenter);
        bottomNavigationPresenter.mo497h(getContext(), c7961b);
        int[] iArr = C8918l.f34028E;
        int i3 = C8917k.f33983h;
        int i4 = C8918l.f34091N;
        int i5 = C8918l.f34084M;
        C0185q0 c0185q0M24695i = C8032j.m24695i(context2, attributeSet, iArr, i2, i3, i4, i5);
        int i6 = C8918l.f34070K;
        if (c0185q0M24695i.m1110s(i6)) {
            c7962c.setIconTintList(c0185q0M24695i.m1094c(i6));
        } else {
            c7962c.setIconTintList(c7962c.m23964e(R.attr.textColorSecondary));
        }
        setItemIconSize(c0185q0M24695i.m1097f(C8918l.f34063J, getResources().getDimensionPixelSize(C8910d.f33870e)));
        if (c0185q0M24695i.m1110s(i4)) {
            setItemTextAppearanceInactive(c0185q0M24695i.m1105n(i4, 0));
        }
        if (c0185q0M24695i.m1110s(i5)) {
            setItemTextAppearanceActive(c0185q0M24695i.m1105n(i5, 0));
        }
        int i7 = C8918l.f34098O;
        if (c0185q0M24695i.m1110s(i7)) {
            setItemTextColor(c0185q0M24695i.m1094c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0311u.m2139m0(this, m23939e(context2));
        }
        if (c0185q0M24695i.m1110s(C8918l.f34042G)) {
            C0311u.m2147q0(this, c0185q0M24695i.m1097f(r2, 0));
        }
        C0265a.m1818o(getBackground().mutate(), C8947c.m28500b(context2, c0185q0M24695i, C8918l.f34035F));
        setLabelVisibilityMode(c0185q0M24695i.m1103l(C8918l.f34105P, -1));
        setItemHorizontalTranslationEnabled(c0185q0M24695i.m1092a(C8918l.f34056I, true));
        int iM1105n = c0185q0M24695i.m1105n(C8918l.f34049H, 0);
        if (iM1105n != 0) {
            c7962c.setItemBackgroundRes(iM1105n);
        } else {
            setItemRippleColor(C8947c.m28500b(context2, c0185q0M24695i, C8918l.f34077L));
        }
        int i8 = C8918l.f34112Q;
        if (c0185q0M24695i.m1110s(i8)) {
            m23940f(c0185q0M24695i.m1105n(i8, 0));
        }
        c0185q0M24695i.m1111w();
        addView(c7962c, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            m23937c(context2);
        }
        c7961b.mo575V(new C7956a());
        m23938d();
    }
}
