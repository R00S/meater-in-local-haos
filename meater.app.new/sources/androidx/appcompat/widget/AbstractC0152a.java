package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0311u;
import androidx.core.view.C0315y;
import androidx.core.view.InterfaceC0316z;
import p024c.p025a.C0823a;
import p024c.p025a.C0832j;

/* compiled from: AbsActionBarView.java */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
abstract class AbstractC0152a extends ViewGroup {

    /* renamed from: f */
    protected final a f1021f;

    /* renamed from: g */
    protected final Context f1022g;

    /* renamed from: h */
    protected ActionMenuView f1023h;

    /* renamed from: i */
    protected ActionMenuPresenter f1024i;

    /* renamed from: j */
    protected int f1025j;

    /* renamed from: k */
    protected C0315y f1026k;

    /* renamed from: l */
    private boolean f1027l;

    /* renamed from: m */
    private boolean f1028m;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a */
    protected class a implements InterfaceC0316z {

        /* renamed from: a */
        private boolean f1029a = false;

        /* renamed from: b */
        int f1030b;

        protected a() {
        }

        /* renamed from: a */
        public a m890a(C0315y c0315y, int i2) {
            AbstractC0152a.this.f1026k = c0315y;
            this.f1030b = i2;
            return this;
        }

        @Override // androidx.core.view.InterfaceC0316z
        public void onAnimationCancel(View view) {
            this.f1029a = true;
        }

        @Override // androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            if (this.f1029a) {
                return;
            }
            AbstractC0152a abstractC0152a = AbstractC0152a.this;
            abstractC0152a.f1026k = null;
            AbstractC0152a.super.setVisibility(this.f1030b);
        }

        @Override // androidx.core.view.InterfaceC0316z
        public void onAnimationStart(View view) {
            AbstractC0152a.super.setVisibility(0);
            this.f1029a = false;
        }
    }

    AbstractC0152a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    protected static int m887d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* renamed from: c */
    protected int m888c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* renamed from: e */
    protected int m889e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0315y mo670f(int i2, long j2) {
        C0315y c0315y = this.f1026k;
        if (c0315y != null) {
            c0315y.m2218b();
        }
        if (i2 != 0) {
            C0315y c0315yM2217a = C0311u.m2118c(this).m2217a(0.0f);
            c0315yM2217a.m2220d(j2);
            c0315yM2217a.m2222f(this.f1021f.m890a(c0315yM2217a, i2));
            return c0315yM2217a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0315y c0315yM2217a2 = C0311u.m2118c(this).m2217a(1.0f);
        c0315yM2217a2.m2220d(j2);
        c0315yM2217a2.m2222f(this.f1021f.m890a(c0315yM2217a2, i2));
        return c0315yM2217a2;
    }

    public int getAnimatedVisibility() {
        return this.f1026k != null ? this.f1021f.f1030b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1025j;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0832j.f5328a, C0823a.f5029c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C0832j.f5373j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1024i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m718H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1028m = false;
        }
        if (!this.f1028m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1028m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1028m = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1027l = false;
        }
        if (!this.f1027l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1027l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1027l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            C0315y c0315y = this.f1026k;
            if (c0315y != null) {
                c0315y.m2218b();
            }
            super.setVisibility(i2);
        }
    }

    AbstractC0152a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1021f = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0823a.f5027a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1022g = context;
        } else {
            this.f1022g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
