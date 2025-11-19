package com.google.android.material.search;

import C7.e;
import C7.f;
import C7.l;
import R7.g;
import X7.h;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.s;
import d.C2998b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k1.C3784a;
import s1.X;
import y1.AbstractC5121a;

/* loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, R7.b {

    /* renamed from: b0, reason: collision with root package name */
    private static final int f37000b0 = l.f2579p;

    /* renamed from: B, reason: collision with root package name */
    final ClippableRoundedCornerLayout f37001B;

    /* renamed from: C, reason: collision with root package name */
    final View f37002C;

    /* renamed from: D, reason: collision with root package name */
    final View f37003D;

    /* renamed from: E, reason: collision with root package name */
    final FrameLayout f37004E;

    /* renamed from: F, reason: collision with root package name */
    final MaterialToolbar f37005F;

    /* renamed from: G, reason: collision with root package name */
    final TextView f37006G;

    /* renamed from: H, reason: collision with root package name */
    final EditText f37007H;

    /* renamed from: I, reason: collision with root package name */
    final TouchObserverFrameLayout f37008I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f37009J;

    /* renamed from: K, reason: collision with root package name */
    private final R7.c f37010K;

    /* renamed from: L, reason: collision with root package name */
    private final boolean f37011L;

    /* renamed from: M, reason: collision with root package name */
    private final O7.a f37012M;

    /* renamed from: N, reason: collision with root package name */
    private final Set<b> f37013N;

    /* renamed from: O, reason: collision with root package name */
    private SearchBar f37014O;

    /* renamed from: P, reason: collision with root package name */
    private int f37015P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f37016Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f37017R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f37018S;

    /* renamed from: T, reason: collision with root package name */
    private final int f37019T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f37020U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f37021V;

    /* renamed from: W, reason: collision with root package name */
    private c f37022W;

    /* renamed from: a0, reason: collision with root package name */
    private Map<View, Integer> f37023a0;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.g() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class a extends AbstractC5121a {
        public static final Parcelable.Creator<a> CREATOR = new C0475a();

        /* renamed from: D, reason: collision with root package name */
        String f37024D;

        /* renamed from: E, reason: collision with root package name */
        int f37025E;

        /* renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        class C0475a implements Parcelable.ClassLoaderCreator<a> {
            C0475a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // y1.AbstractC5121a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f37024D);
            parcel.writeInt(this.f37025E);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37024D = parcel.readString();
            this.f37025E = parcel.readInt();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface b {
        void a(SearchView searchView, c cVar, c cVar2);
    }

    public enum c {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private boolean f() {
        return this.f37022W.equals(c.HIDDEN) || this.f37022W.equals(c.HIDING);
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.b.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f37014O;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(e.f2360H);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void h(c cVar, boolean z10) {
        if (this.f37022W.equals(cVar)) {
            return;
        }
        if (z10) {
            if (cVar == c.SHOWN) {
                setModalForAccessibility(true);
            } else if (cVar == c.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        c cVar2 = this.f37022W;
        this.f37022W = cVar;
        Iterator it = new LinkedHashSet(this.f37013N).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, cVar2, cVar);
        }
        j(cVar);
    }

    @SuppressLint({"InlinedApi"})
    private void i(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f37001B.getId()) != null) {
                    i((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.f37023a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    X.x0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f37023a0;
                    if (map != null && map.containsKey(childAt)) {
                        X.x0(childAt, this.f37023a0.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void j(c cVar) {
        if (this.f37014O == null || !this.f37011L) {
            return;
        }
        if (cVar.equals(c.SHOWN)) {
            this.f37010K.b();
        } else if (cVar.equals(c.HIDDEN)) {
            this.f37010K.d();
        }
    }

    private void k() {
        ImageButton imageButtonD = s.d(this.f37005F);
        if (imageButtonD == null) {
            return;
        }
        int i10 = this.f37001B.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = C3784a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof k.b) {
            ((k.b) drawableQ).setProgress(i10);
        }
        if (drawableQ instanceof com.google.android.material.internal.e) {
            ((com.google.android.material.internal.e) drawableQ).a(i10);
        }
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f37003D.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        O7.a aVar = this.f37012M;
        if (aVar == null || this.f37002C == null) {
            return;
        }
        this.f37002C.setBackgroundColor(aVar.c(this.f37019T, f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            e(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f37004E, false));
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        if (this.f37003D.getLayoutParams().height != i10) {
            this.f37003D.getLayoutParams().height = i10;
            this.f37003D.requestLayout();
        }
    }

    @Override // R7.b
    public void a(C2998b c2998b) {
        if (!f() && this.f37014O != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f37009J) {
            this.f37008I.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    @Override // R7.b
    public void b() {
        if (!f()) {
            throw null;
        }
    }

    @Override // R7.b
    public void c(C2998b c2998b) {
        if (!f() && this.f37014O != null) {
            throw null;
        }
    }

    @Override // R7.b
    public void d() {
        if (!f() && this.f37014O != null && Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    public void e(View view) {
        this.f37004E.addView(view);
        this.f37004E.setVisibility(0);
    }

    public boolean g() {
        return this.f37014O != null;
    }

    g getBackHelper() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f37022W;
    }

    protected int getDefaultNavigationIconResource() {
        return f.f2432b;
    }

    public EditText getEditText() {
        return this.f37007H;
    }

    public CharSequence getHint() {
        return this.f37007H.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f37006G;
    }

    public CharSequence getSearchPrefixText() {
        return this.f37006G.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f37015P;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f37007H.getText();
    }

    public Toolbar getToolbar() {
        return this.f37005F;
    }

    public void l() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f37015P = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f37024D);
        setVisible(aVar.f37025E == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        aVar.f37024D = text == null ? null : text.toString();
        aVar.f37025E = this.f37001B.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f37016Q = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f37018S = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f37007H.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f37017R = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f37023a0 = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z10);
        if (z10) {
            return;
        }
        this.f37023a0 = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f37005F.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f37006G.setText(charSequence);
        this.f37006G.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f37021V = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f37007H.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f37005F.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(c cVar) {
        h(cVar, true);
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f37020U = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f37001B.getVisibility() == 0;
        this.f37001B.setVisibility(z10 ? 0 : 8);
        k();
        h(z10 ? c.SHOWN : c.HIDDEN, z11 != z10);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f37014O = searchBar;
        throw null;
    }

    public void setHint(int i10) {
        this.f37007H.setHint(i10);
    }

    public void setText(int i10) {
        this.f37007H.setText(i10);
    }
}
