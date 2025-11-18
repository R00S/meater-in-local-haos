package com.google.android.material.navigation;

import C7.h;
import R7.i;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.transition.C2180a;
import androidx.transition.s;
import androidx.transition.v;
import com.google.android.material.internal.p;
import j.C3699a;
import java.util.HashSet;
import r1.C4341h;
import r1.InterfaceC4339f;
import s1.X;
import t1.t;

/* compiled from: NavigationBarMenuView.java */
/* loaded from: classes2.dex */
public abstract class c extends ViewGroup implements k {

    /* renamed from: j0, reason: collision with root package name */
    private static final int[] f36848j0 = {R.attr.state_checked};

    /* renamed from: k0, reason: collision with root package name */
    private static final int[] f36849k0 = {-16842910};

    /* renamed from: B, reason: collision with root package name */
    private final v f36850B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f36851C;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4339f<com.google.android.material.navigation.a> f36852D;

    /* renamed from: E, reason: collision with root package name */
    private final SparseArray<View.OnTouchListener> f36853E;

    /* renamed from: F, reason: collision with root package name */
    private int f36854F;

    /* renamed from: G, reason: collision with root package name */
    private com.google.android.material.navigation.a[] f36855G;

    /* renamed from: H, reason: collision with root package name */
    private int f36856H;

    /* renamed from: I, reason: collision with root package name */
    private int f36857I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f36858J;

    /* renamed from: K, reason: collision with root package name */
    private int f36859K;

    /* renamed from: L, reason: collision with root package name */
    private ColorStateList f36860L;

    /* renamed from: M, reason: collision with root package name */
    private final ColorStateList f36861M;

    /* renamed from: N, reason: collision with root package name */
    private int f36862N;

    /* renamed from: O, reason: collision with root package name */
    private int f36863O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f36864P;

    /* renamed from: Q, reason: collision with root package name */
    private Drawable f36865Q;

    /* renamed from: R, reason: collision with root package name */
    private ColorStateList f36866R;

    /* renamed from: S, reason: collision with root package name */
    private int f36867S;

    /* renamed from: T, reason: collision with root package name */
    private final SparseArray<E7.a> f36868T;

    /* renamed from: U, reason: collision with root package name */
    private int f36869U;

    /* renamed from: V, reason: collision with root package name */
    private int f36870V;

    /* renamed from: W, reason: collision with root package name */
    private int f36871W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f36872a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f36873b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f36874c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f36875d0;

    /* renamed from: e0, reason: collision with root package name */
    private X7.k f36876e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f36877f0;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f36878g0;

    /* renamed from: h0, reason: collision with root package name */
    private d f36879h0;

    /* renamed from: i0, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f36880i0;

    /* compiled from: NavigationBarMenuView.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g itemData = ((com.google.android.material.navigation.a) view).getItemData();
            if (c.this.f36880i0.P(itemData, c.this.f36879h0, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public c(Context context) {
        super(context);
        this.f36852D = new C4341h(5);
        this.f36853E = new SparseArray<>(5);
        this.f36856H = 0;
        this.f36857I = 0;
        this.f36868T = new SparseArray<>(5);
        this.f36869U = -1;
        this.f36870V = -1;
        this.f36871W = -1;
        this.f36877f0 = false;
        this.f36861M = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f36850B = null;
        } else {
            C2180a c2180a = new C2180a();
            this.f36850B = c2180a;
            c2180a.K0(0);
            c2180a.o0(i.f(getContext(), C7.c.f2285I, getResources().getInteger(h.f2501b)));
            c2180a.q0(i.g(getContext(), C7.c.f2294R, D7.a.f3487b));
            c2180a.A0(new p());
        }
        this.f36851C = new a();
        X.x0(this, 1);
    }

    private Drawable f() {
        if (this.f36876e0 == null || this.f36878g0 == null) {
            return null;
        }
        X7.g gVar = new X7.g(this.f36876e0);
        gVar.b0(this.f36878g0);
        return gVar;
    }

    private com.google.android.material.navigation.a getNewItem() {
        com.google.android.material.navigation.a aVarB = this.f36852D.b();
        return aVarB == null ? g(getContext()) : aVarB;
    }

    private boolean k(int i10) {
        return i10 != -1;
    }

    private void m() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f36880i0.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f36880i0.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f36868T.size(); i11++) {
            int iKeyAt = this.f36868T.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f36868T.delete(iKeyAt);
            }
        }
    }

    private void q(int i10) {
        if (k(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    private void setBadgeIfNeeded(com.google.android.material.navigation.a aVar) {
        E7.a aVar2;
        int id2 = aVar.getId();
        if (k(id2) && (aVar2 = this.f36868T.get(id2)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f36880i0 = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() throws Resources.NotFoundException {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f36852D.a(aVar);
                    aVar.h();
                }
            }
        }
        if (this.f36880i0.size() == 0) {
            this.f36856H = 0;
            this.f36857I = 0;
            this.f36855G = null;
            return;
        }
        m();
        this.f36855G = new com.google.android.material.navigation.a[this.f36880i0.size()];
        boolean zJ = j(this.f36854F, this.f36880i0.G().size());
        for (int i10 = 0; i10 < this.f36880i0.size(); i10++) {
            this.f36879h0.l(true);
            this.f36880i0.getItem(i10).setCheckable(true);
            this.f36879h0.l(false);
            com.google.android.material.navigation.a newItem = getNewItem();
            this.f36855G[i10] = newItem;
            newItem.setIconTintList(this.f36858J);
            newItem.setIconSize(this.f36859K);
            newItem.setTextColor(this.f36861M);
            newItem.setTextAppearanceInactive(this.f36862N);
            newItem.setTextAppearanceActive(this.f36863O);
            newItem.setTextAppearanceActiveBoldEnabled(this.f36864P);
            newItem.setTextColor(this.f36860L);
            int i11 = this.f36869U;
            if (i11 != -1) {
                newItem.setItemPaddingTop(i11);
            }
            int i12 = this.f36870V;
            if (i12 != -1) {
                newItem.setItemPaddingBottom(i12);
            }
            int i13 = this.f36871W;
            if (i13 != -1) {
                newItem.setActiveIndicatorLabelPadding(i13);
            }
            newItem.setActiveIndicatorWidth(this.f36873b0);
            newItem.setActiveIndicatorHeight(this.f36874c0);
            newItem.setActiveIndicatorMarginHorizontal(this.f36875d0);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.f36877f0);
            newItem.setActiveIndicatorEnabled(this.f36872a0);
            Drawable drawable = this.f36865Q;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f36867S);
            }
            newItem.setItemRippleColor(this.f36866R);
            newItem.setShifting(zJ);
            newItem.setLabelVisibilityMode(this.f36854F);
            g gVar = (g) this.f36880i0.getItem(i10);
            newItem.e(gVar, 0);
            newItem.setItemPosition(i10);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.f36853E.get(itemId));
            newItem.setOnClickListener(this.f36851C);
            int i14 = this.f36856H;
            if (i14 != 0 && itemId == i14) {
                this.f36857I = i10;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f36880i0.size() - 1, this.f36857I);
        this.f36857I = iMin;
        this.f36880i0.getItem(iMin).setChecked(true);
    }

    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = C3699a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.f42418y, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f36849k0;
        return new ColorStateList(new int[][]{iArr, f36848j0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    protected abstract com.google.android.material.navigation.a g(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f36871W;
    }

    SparseArray<E7.a> getBadgeDrawables() {
        return this.f36868T;
    }

    public ColorStateList getIconTintList() {
        return this.f36858J;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f36878g0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f36872a0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f36874c0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f36875d0;
    }

    public X7.k getItemActiveIndicatorShapeAppearance() {
        return this.f36876e0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f36873b0;
    }

    public Drawable getItemBackground() {
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f36865Q : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f36867S;
    }

    public int getItemIconSize() {
        return this.f36859K;
    }

    public int getItemPaddingBottom() {
        return this.f36870V;
    }

    public int getItemPaddingTop() {
        return this.f36869U;
    }

    public ColorStateList getItemRippleColor() {
        return this.f36866R;
    }

    public int getItemTextAppearanceActive() {
        return this.f36863O;
    }

    public int getItemTextAppearanceInactive() {
        return this.f36862N;
    }

    public ColorStateList getItemTextColor() {
        return this.f36860L;
    }

    public int getLabelVisibilityMode() {
        return this.f36854F;
    }

    protected androidx.appcompat.view.menu.e getMenu() {
        return this.f36880i0;
    }

    public int getSelectedItemId() {
        return this.f36856H;
    }

    protected int getSelectedItemPosition() {
        return this.f36857I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public com.google.android.material.navigation.a h(int i10) {
        q(i10);
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr == null) {
            return null;
        }
        for (com.google.android.material.navigation.a aVar : aVarArr) {
            if (aVar.getId() == i10) {
                return aVar;
            }
        }
        return null;
    }

    E7.a i(int i10) {
        q(i10);
        E7.a aVarD = this.f36868T.get(i10);
        if (aVarD == null) {
            aVarD = E7.a.d(getContext());
            this.f36868T.put(i10, aVarD);
        }
        com.google.android.material.navigation.a aVarH = h(i10);
        if (aVarH != null) {
            aVarH.setBadge(aVarD);
        }
        return aVarD;
    }

    protected boolean j(int i10, int i11) {
        if (i10 == -1) {
            if (i11 <= 3) {
                return false;
            }
        } else if (i10 != 0) {
            return false;
        }
        return true;
    }

    void l(int i10) {
        q(i10);
        com.google.android.material.navigation.a aVarH = h(i10);
        if (aVarH != null) {
            aVarH.p();
        }
        this.f36868T.put(i10, null);
    }

    void n(SparseArray<E7.a> sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f36868T.indexOfKey(iKeyAt) < 0) {
                this.f36868T.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                E7.a aVar2 = this.f36868T.get(aVar.getId());
                if (aVar2 != null) {
                    aVar.setBadge(aVar2);
                }
            }
        }
    }

    void o(int i10) {
        int size = this.f36880i0.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.f36880i0.getItem(i11);
            if (i10 == item.getItemId()) {
                this.f36856H = i10;
                this.f36857I = i11;
                item.setChecked(true);
                return;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.Y0(accessibilityNodeInfo).j0(t.e.a(1, this.f36880i0.G().size(), false, 1));
    }

    public void p() throws Resources.NotFoundException {
        v vVar;
        androidx.appcompat.view.menu.e eVar = this.f36880i0;
        if (eVar == null || this.f36855G == null) {
            return;
        }
        int size = eVar.size();
        if (size != this.f36855G.length) {
            d();
            return;
        }
        int i10 = this.f36856H;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.f36880i0.getItem(i11);
            if (item.isChecked()) {
                this.f36856H = item.getItemId();
                this.f36857I = i11;
            }
        }
        if (i10 != this.f36856H && (vVar = this.f36850B) != null) {
            s.a(this, vVar);
        }
        boolean zJ = j(this.f36854F, this.f36880i0.G().size());
        for (int i12 = 0; i12 < size; i12++) {
            this.f36879h0.l(true);
            this.f36855G[i12].setLabelVisibilityMode(this.f36854F);
            this.f36855G[i12].setShifting(zJ);
            this.f36855G[i12].e((g) this.f36880i0.getItem(i12), 0);
            this.f36879h0.l(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f36871W = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorLabelPadding(i10);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f36858J = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f36878g0 = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f36872a0 = z10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f36874c0 = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f36875d0 = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.f36877f0 = z10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(X7.k kVar) {
        this.f36876e0 = kVar;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f36873b0 = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f36865Q = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f36867S = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f36859K = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f36870V = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f36869U = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f36866R = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f36863O = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f36860L;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        this.f36864P = z10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActiveBoldEnabled(z10);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f36862N = i10;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f36860L;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f36860L = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f36855G;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f36854F = i10;
    }

    public void setPresenter(d dVar) {
        this.f36879h0 = dVar;
    }
}
