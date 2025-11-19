package com.google.android.material.floatingactionbutton;

import C7.l;
import C7.m;
import D7.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import s1.X;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: g0, reason: collision with root package name */
    private static final int f36524g0 = l.f2589z;

    /* renamed from: h0, reason: collision with root package name */
    static final Property<View, Float> f36525h0 = new a(Float.class, "width");

    /* renamed from: i0, reason: collision with root package name */
    static final Property<View, Float> f36526i0 = new b(Float.class, "height");

    /* renamed from: j0, reason: collision with root package name */
    static final Property<View, Float> f36527j0 = new c(Float.class, "paddingStart");

    /* renamed from: k0, reason: collision with root package name */
    static final Property<View, Float> f36528k0 = new d(Float.class, "paddingEnd");

    /* renamed from: V, reason: collision with root package name */
    private final int f36529V;

    /* renamed from: W, reason: collision with root package name */
    private int f36530W;

    /* renamed from: a0, reason: collision with root package name */
    private int f36531a0;

    /* renamed from: b0, reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f36532b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f36533c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f36534d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f36535e0;

    /* renamed from: f0, reason: collision with root package name */
    protected ColorStateList f36536f0;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(X.E(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            X.C0(view, f10.intValue(), view.getPaddingTop(), X.D(view), view.getPaddingBottom());
        }
    }

    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(X.D(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            X.C0(view, X.E(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, e eVar) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i10);
    }

    private void l() {
        this.f36536f0 = getTextColors();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f36532b0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i10 = this.f36529V;
        return i10 < 0 ? (Math.min(X.E(this), X.D(this)) * 2) + getIconSize() : i10;
    }

    public h getExtendMotionSpec() {
        throw null;
    }

    public h getHideMotionSpec() {
        throw null;
    }

    public h getShowMotionSpec() {
        throw null;
    }

    public h getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36533c0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f36533c0 = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f36535e0 = z10;
    }

    public void setExtendMotionSpec(h hVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f36533c0 != z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(h hVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.f36533c0 || this.f36534d0) {
            return;
        }
        this.f36530W = X.E(this);
        this.f36531a0 = X.D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.f36533c0 || this.f36534d0) {
            return;
        }
        this.f36530W = i10;
        this.f36531a0 = i12;
    }

    public void setShowMotionSpec(h hVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        l();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: B, reason: collision with root package name */
        private Rect f36537B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f36538C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f36539D;

        public ExtendedFloatingActionButtonBehavior() {
            this.f36538C = false;
            this.f36539D = true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f36538C || this.f36539D) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f36537B == null) {
                this.f36537B = new Rect();
            }
            Rect rect = this.f36537B;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        private boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        protected void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f36539D ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listR.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        protected void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f36539D ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f24694h == 0) {
                fVar.f24694h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2996n2);
            this.f36538C = typedArrayObtainStyledAttributes.getBoolean(m.f3007o2, false);
            this.f36539D = typedArrayObtainStyledAttributes.getBoolean(m.f3018p2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        l();
    }
}
