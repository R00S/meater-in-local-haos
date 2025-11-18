package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.C8914h;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: w */
    private static final int[] f30484w;

    /* renamed from: x */
    private static final int[] f30485x;

    /* renamed from: A */
    private BaseTransientBottomBar.AbstractC8052r<Snackbar> f30486A;

    /* renamed from: y */
    private final AccessibilityManager f30487y;

    /* renamed from: z */
    private boolean f30488z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C8056v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C8056v, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C8056v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C8056v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C8056v, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C8056v, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class ViewOnClickListenerC8057a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f30489f;

        ViewOnClickListenerC8057a(View.OnClickListener onClickListener) {
            this.f30489f = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30489f.onClick(view);
            Snackbar.this.m24749u(1);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$b */
    public static class C8058b extends BaseTransientBottomBar.AbstractC8052r<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8052r
        public void onDismissed(Snackbar snackbar, int i2) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8052r
        public void onShown(Snackbar snackbar) {
        }
    }

    static {
        int i2 = C8908b.f33836z;
        f30484w = new int[]{i2};
        f30485x = new int[]{i2, C8908b.f33801B};
    }

    private Snackbar(ViewGroup viewGroup, View view, InterfaceC8059a interfaceC8059a) {
        super(viewGroup, view, interfaceC8059a);
        this.f30487y = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: X */
    private static ViewGroup m24761X(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: Y */
    private static boolean m24762Y(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f30485x);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* renamed from: Z */
    public static Snackbar m24763Z(View view, int i2, int i3) {
        return m24764a0(view, view.getResources().getText(i2), i3);
    }

    /* renamed from: a0 */
    public static Snackbar m24764a0(View view, CharSequence charSequence, int i2) {
        ViewGroup viewGroupM24761X = m24761X(view);
        if (viewGroupM24761X == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(viewGroupM24761X.getContext()).inflate(m24762Y(viewGroupM24761X.getContext()) ? C8914h.f33953o : C8914h.f33942d, viewGroupM24761X, false);
        Snackbar snackbar = new Snackbar(viewGroupM24761X, snackbarContentLayout, snackbarContentLayout);
        snackbar.m24768e0(charSequence);
        snackbar.m24742L(i2);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: P */
    public void mo24744P() {
        super.mo24744P();
    }

    /* renamed from: b0 */
    public Snackbar m24765b0(int i2, View.OnClickListener onClickListener) {
        return m24766c0(m24750w().getText(i2), onClickListener);
    }

    /* renamed from: c0 */
    public Snackbar m24766c0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f30436g.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f30488z = false;
        } else {
            this.f30488z = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new ViewOnClickListenerC8057a(onClickListener));
        }
        return this;
    }

    @Deprecated
    /* renamed from: d0 */
    public Snackbar m24767d0(C8058b c8058b) {
        BaseTransientBottomBar.AbstractC8052r<Snackbar> abstractC8052r = this.f30486A;
        if (abstractC8052r != null) {
            m24741K(abstractC8052r);
        }
        if (c8058b != null) {
            m24746p(c8058b);
        }
        this.f30486A = c8058b;
        return this;
    }

    /* renamed from: e0 */
    public Snackbar m24768e0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f30436g.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: t */
    public void mo24748t() {
        super.mo24748t();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: x */
    public int mo24751x() {
        int iMo24751x = super.mo24751x();
        if (iMo24751x == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f30487y.getRecommendedTimeoutMillis(iMo24751x, (this.f30488z ? 4 : 0) | 1 | 2);
        }
        if (this.f30488z && this.f30487y.isTouchExplorationEnabled()) {
            return -2;
        }
        return iMo24751x;
    }
}
