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
import s1.C4434g0;
import s1.InterfaceC4436h0;

/* compiled from: AbsActionBarView.java */
/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1979a extends ViewGroup {

    /* renamed from: B, reason: collision with root package name */
    protected final C0302a f21602B;

    /* renamed from: C, reason: collision with root package name */
    protected final Context f21603C;

    /* renamed from: D, reason: collision with root package name */
    protected ActionMenuView f21604D;

    /* renamed from: E, reason: collision with root package name */
    protected C1981c f21605E;

    /* renamed from: F, reason: collision with root package name */
    protected int f21606F;

    /* renamed from: G, reason: collision with root package name */
    protected C4434g0 f21607G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21608H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21609I;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0302a implements InterfaceC4436h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f21610a = false;

        /* renamed from: b, reason: collision with root package name */
        int f21611b;

        protected C0302a() {
        }

        @Override // s1.InterfaceC4436h0
        public void a(View view) {
            this.f21610a = true;
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            if (this.f21610a) {
                return;
            }
            AbstractC1979a abstractC1979a = AbstractC1979a.this;
            abstractC1979a.f21607G = null;
            AbstractC1979a.super.setVisibility(this.f21611b);
        }

        @Override // s1.InterfaceC4436h0
        public void c(View view) {
            AbstractC1979a.super.setVisibility(0);
            this.f21610a = false;
        }

        public C0302a d(C4434g0 c4434g0, int i10) {
            AbstractC1979a.this.f21607G = c4434g0;
            this.f21611b = i10;
            return this;
        }
    }

    AbstractC1979a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C4434g0 f(int i10, long j10) {
        C4434g0 c4434g0 = this.f21607G;
        if (c4434g0 != null) {
            c4434g0.c();
        }
        if (i10 != 0) {
            C4434g0 c4434g0B = s1.X.e(this).b(0.0f);
            c4434g0B.f(j10);
            c4434g0B.h(this.f21602B.d(c4434g0B, i10));
            return c4434g0B;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C4434g0 c4434g0B2 = s1.X.e(this).b(1.0f);
        c4434g0B2.f(j10);
        c4434g0B2.h(this.f21602B.d(c4434g0B2, i10));
        return c4434g0B2;
    }

    public int getAnimatedVisibility() {
        return this.f21607G != null ? this.f21602B.f21611b : getVisibility();
    }

    public int getContentHeight() {
        return this.f21606F;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.f42684a, i.a.f42396c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.j.f42729j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1981c c1981c = this.f21605E;
        if (c1981c != null) {
            c1981c.I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f21609I = false;
        }
        if (!this.f21609I) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f21609I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f21609I = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21608H = false;
        }
        if (!this.f21608H) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f21608H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f21608H = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f21606F = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C4434g0 c4434g0 = this.f21607G;
            if (c4434g0 != null) {
                c4434g0.c();
            }
            super.setVisibility(i10);
        }
    }

    AbstractC1979a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21602B = new C0302a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i.a.f42394a, typedValue, true) || typedValue.resourceId == 0) {
            this.f21603C = context;
        } else {
            this.f21603C = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
