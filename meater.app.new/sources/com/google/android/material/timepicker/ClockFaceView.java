package com.google.android.material.timepicker;

import C7.g;
import C7.i;
import C7.l;
import C7.m;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import j.C3699a;
import java.util.Arrays;
import s1.C4421a;
import s1.X;
import t1.t;

/* loaded from: classes2.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* renamed from: g0, reason: collision with root package name */
    private final ClockHandView f37470g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Rect f37471h0;

    /* renamed from: i0, reason: collision with root package name */
    private final RectF f37472i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Rect f37473j0;

    /* renamed from: k0, reason: collision with root package name */
    private final SparseArray<TextView> f37474k0;

    /* renamed from: l0, reason: collision with root package name */
    private final C4421a f37475l0;

    /* renamed from: m0, reason: collision with root package name */
    private final int[] f37476m0;

    /* renamed from: n0, reason: collision with root package name */
    private final float[] f37477n0;

    /* renamed from: o0, reason: collision with root package name */
    private final int f37478o0;

    /* renamed from: p0, reason: collision with root package name */
    private final int f37479p0;

    /* renamed from: q0, reason: collision with root package name */
    private final int f37480q0;

    /* renamed from: r0, reason: collision with root package name */
    private final int f37481r0;

    /* renamed from: s0, reason: collision with root package name */
    private String[] f37482s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f37483t0;

    /* renamed from: u0, reason: collision with root package name */
    private final ColorStateList f37484u0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f37470g0.i()) - ClockFaceView.this.f37478o0);
            return true;
        }
    }

    class b extends C4421a {
        b() {
        }

        @Override // s1.C4421a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            int iIntValue = ((Integer) view.getTag(g.f2491r)).intValue();
            if (iIntValue > 0) {
                tVar.R0((View) ClockFaceView.this.f37474k0.get(iIntValue - 1));
            }
            tVar.k0(t.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            tVar.i0(true);
            tVar.b(t.a.f49782i);
        }

        @Override // s1.C4421a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f37471h0);
            float fCenterX = ClockFaceView.this.f37471h0.centerX();
            float fCenterY = ClockFaceView.this.f37471h0.centerY();
            ClockFaceView.this.f37470g0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f37470g0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7.c.f2280D);
    }

    private void P() {
        RectF rectFE = this.f37470g0.e();
        TextView textViewR = R(rectFE);
        for (int i10 = 0; i10 < this.f37474k0.size(); i10++) {
            TextView textView = this.f37474k0.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewR);
                textView.getPaint().setShader(Q(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.f37471h0);
        this.f37472i0.set(this.f37471h0);
        textView.getLineBounds(0, this.f37473j0);
        RectF rectF2 = this.f37472i0;
        Rect rect = this.f37473j0;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f37472i0)) {
            return new RadialGradient(rectF.centerX() - this.f37472i0.left, rectF.centerY() - this.f37472i0.top, rectF.width() * 0.5f, this.f37476m0, this.f37477n0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView R(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f37474k0.size(); i10++) {
            TextView textView2 = this.f37474k0.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f37471h0);
                this.f37472i0.set(this.f37471h0);
                this.f37472i0.union(rectF);
                float fWidth = this.f37472i0.width() * this.f37472i0.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float S(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void U(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f37474k0.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f37482s0.length, size); i11++) {
            TextView textView = this.f37474k0.get(i11);
            if (i11 >= this.f37482s0.length) {
                removeView(textView);
                this.f37474k0.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(i.f2512j, (ViewGroup) this, false);
                    this.f37474k0.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f37482s0[i11]);
                textView.setTag(g.f2491r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(g.f2486m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                X.n0(textView, this.f37475l0);
                textView.setTextColor(this.f37484u0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f37482s0[i11]));
                }
            }
        }
        this.f37470g0.q(z10);
    }

    @Override // com.google.android.material.timepicker.d
    public void H(int i10) {
        if (i10 != G()) {
            super.H(i10);
            this.f37470g0.m(G());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void J() {
        super.J();
        for (int i10 = 0; i10 < this.f37474k0.size(); i10++) {
            this.f37474k0.get(i10).setVisibility(0);
        }
    }

    public void T(String[] strArr, int i10) {
        this.f37482s0 = strArr;
        U(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f37483t0 - f10) > 0.001f) {
            this.f37483t0 = f10;
            P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.Y0(accessibilityNodeInfo).j0(t.e.a(1, this.f37482s0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iS = (int) (this.f37481r0 / S(this.f37479p0 / displayMetrics.heightPixels, this.f37480q0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iS, 1073741824);
        setMeasuredDimension(iS, iS);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37471h0 = new Rect();
        this.f37472i0 = new RectF();
        this.f37473j0 = new Rect();
        this.f37474k0 = new SparseArray<>();
        this.f37477n0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f2772S1, i10, l.f2562E);
        Resources resources = getResources();
        ColorStateList colorStateListA = U7.c.a(context, typedArrayObtainStyledAttributes, m.f2792U1);
        this.f37484u0 = colorStateListA;
        LayoutInflater.from(context).inflate(i.f2513k, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(g.f2485l);
        this.f37470g0 = clockHandView;
        this.f37478o0 = resources.getDimensionPixelSize(C7.e.f2362J);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f37476m0 = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C3699a.a(context, C7.d.f2348g).getDefaultColor();
        ColorStateList colorStateListA2 = U7.c.a(context, typedArrayObtainStyledAttributes, m.f2782T1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f37475l0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T(strArr, 0);
        this.f37479p0 = resources.getDimensionPixelSize(C7.e.f2375W);
        this.f37480q0 = resources.getDimensionPixelSize(C7.e.f2376X);
        this.f37481r0 = resources.getDimensionPixelSize(C7.e.f2364L);
    }
}
