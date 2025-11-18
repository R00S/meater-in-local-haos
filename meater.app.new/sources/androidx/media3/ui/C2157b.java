package androidx.media3.ui;

import X1.C1804a;
import X1.L;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.G;
import e3.C3183D;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DefaultTimeBar.java */
/* renamed from: androidx.media3.ui.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2157b extends View implements G {

    /* renamed from: B, reason: collision with root package name */
    private final Rect f28189B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f28190C;

    /* renamed from: D, reason: collision with root package name */
    private final Rect f28191D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f28192E;

    /* renamed from: F, reason: collision with root package name */
    private final Paint f28193F;

    /* renamed from: G, reason: collision with root package name */
    private final Paint f28194G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f28195H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f28196I;

    /* renamed from: J, reason: collision with root package name */
    private final Paint f28197J;

    /* renamed from: K, reason: collision with root package name */
    private final Paint f28198K;

    /* renamed from: L, reason: collision with root package name */
    private final Drawable f28199L;

    /* renamed from: M, reason: collision with root package name */
    private final int f28200M;

    /* renamed from: N, reason: collision with root package name */
    private final int f28201N;

    /* renamed from: O, reason: collision with root package name */
    private final int f28202O;

    /* renamed from: P, reason: collision with root package name */
    private final int f28203P;

    /* renamed from: Q, reason: collision with root package name */
    private final int f28204Q;

    /* renamed from: R, reason: collision with root package name */
    private final int f28205R;

    /* renamed from: S, reason: collision with root package name */
    private final int f28206S;

    /* renamed from: T, reason: collision with root package name */
    private final int f28207T;

    /* renamed from: U, reason: collision with root package name */
    private final int f28208U;

    /* renamed from: V, reason: collision with root package name */
    private final StringBuilder f28209V;

    /* renamed from: W, reason: collision with root package name */
    private final Formatter f28210W;

    /* renamed from: a0, reason: collision with root package name */
    private final Runnable f28211a0;

    /* renamed from: b0, reason: collision with root package name */
    private final CopyOnWriteArraySet<G.a> f28212b0;

    /* renamed from: c0, reason: collision with root package name */
    private final Point f28213c0;

    /* renamed from: d0, reason: collision with root package name */
    private final float f28214d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f28215e0;

    /* renamed from: f0, reason: collision with root package name */
    private long f28216f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f28217g0;

    /* renamed from: h0, reason: collision with root package name */
    private Rect f28218h0;

    /* renamed from: i0, reason: collision with root package name */
    private ValueAnimator f28219i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f28220j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f28221k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f28222l0;

    /* renamed from: m0, reason: collision with root package name */
    private long f28223m0;

    /* renamed from: n0, reason: collision with root package name */
    private long f28224n0;

    /* renamed from: o0, reason: collision with root package name */
    private long f28225o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f28226p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f28227q0;

    /* renamed from: r0, reason: collision with root package name */
    private long[] f28228r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean[] f28229s0;

    public C2157b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f28189B = new Rect();
        this.f28190C = new Rect();
        this.f28191D = new Rect();
        this.f28192E = new Rect();
        Paint paint = new Paint();
        this.f28193F = paint;
        Paint paint2 = new Paint();
        this.f28194G = paint2;
        Paint paint3 = new Paint();
        this.f28195H = paint3;
        Paint paint4 = new Paint();
        this.f28196I = paint4;
        Paint paint5 = new Paint();
        this.f28197J = paint5;
        Paint paint6 = new Paint();
        this.f28198K = paint6;
        paint6.setAntiAlias(true);
        this.f28212b0 = new CopyOnWriteArraySet<>();
        this.f28213c0 = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f28214d0 = f10;
        this.f28208U = e(f10, -50);
        int iE = e(f10, 4);
        int iE2 = e(f10, 26);
        int iE3 = e(f10, 4);
        int iE4 = e(f10, 12);
        int iE5 = e(f10, 0);
        int iE6 = e(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3183D.f40366e, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C3183D.f40388p);
                this.f28199L = drawable;
                if (drawable != null) {
                    q(drawable);
                    iE2 = Math.max(drawable.getMinimumHeight(), iE2);
                }
                this.f28200M = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40374i, iE);
                this.f28201N = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40392r, iE2);
                this.f28202O = typedArrayObtainStyledAttributes.getInt(C3183D.f40372h, 0);
                this.f28203P = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40370g, iE3);
                this.f28204Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40390q, iE4);
                this.f28205R = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40384n, iE5);
                this.f28206S = typedArrayObtainStyledAttributes.getDimensionPixelSize(C3183D.f40386o, iE6);
                int i12 = typedArrayObtainStyledAttributes.getInt(C3183D.f40380l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(C3183D.f40382m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(C3183D.f40376j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(C3183D.f40394s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(C3183D.f40368f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(C3183D.f40378k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f28200M = iE;
            this.f28201N = iE2;
            this.f28202O = 0;
            this.f28203P = iE3;
            this.f28204Q = iE4;
            this.f28205R = iE5;
            this.f28206S = iE6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f28199L = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f28209V = sb2;
        this.f28210W = new Formatter(sb2, Locale.getDefault());
        this.f28211a0 = new Runnable() { // from class: e3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f40409B.k();
            }
        };
        Drawable drawable2 = this.f28199L;
        if (drawable2 != null) {
            this.f28207T = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f28207T = (Math.max(this.f28205R, Math.max(this.f28204Q, this.f28206S)) + 1) / 2;
        }
        this.f28220j0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f28219i0 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e3.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f40410a.l(valueAnimator2);
            }
        });
        this.f28224n0 = -9223372036854775807L;
        this.f28216f0 = -9223372036854775807L;
        this.f28215e0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void f(Canvas canvas) {
        if (this.f28224n0 <= 0) {
            return;
        }
        Rect rect = this.f28192E;
        int iP = L.p(rect.right, rect.left, this.f28190C.right);
        int iCenterY = this.f28192E.centerY();
        if (this.f28199L == null) {
            canvas.drawCircle(iP, iCenterY, (int) ((((this.f28222l0 || isFocused()) ? this.f28206S : isEnabled() ? this.f28204Q : this.f28205R) * this.f28220j0) / 2.0f), this.f28198K);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.f28220j0)) / 2;
        int intrinsicHeight = ((int) (this.f28199L.getIntrinsicHeight() * this.f28220j0)) / 2;
        this.f28199L.setBounds(iP - intrinsicWidth, iCenterY - intrinsicHeight, iP + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f28199L.draw(canvas);
    }

    private void g(Canvas canvas) {
        int iHeight = this.f28190C.height();
        int iCenterY = this.f28190C.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.f28224n0 <= 0) {
            Rect rect = this.f28190C;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f28195H);
            return;
        }
        Rect rect2 = this.f28191D;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f28190C.left, i12), this.f28192E.right);
        int i13 = this.f28190C.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f28195H);
        }
        int iMax2 = Math.max(i11, this.f28192E.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f28194G);
        }
        if (this.f28192E.width() > 0) {
            Rect rect3 = this.f28192E;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f28193F);
        }
        if (this.f28227q0 == 0) {
            return;
        }
        long[] jArr = (long[]) C1804a.e(this.f28228r0);
        boolean[] zArr = (boolean[]) C1804a.e(this.f28229s0);
        int i14 = this.f28203P / 2;
        for (int i15 = 0; i15 < this.f28227q0; i15++) {
            int iWidth = ((int) ((this.f28190C.width() * L.q(jArr[i15], 0L, this.f28224n0)) / this.f28224n0)) - i14;
            Rect rect4 = this.f28190C;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f28203P, Math.max(0, iWidth)), iCenterY, r10 + this.f28203P, i10, zArr[i15] ? this.f28197J : this.f28196I);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.f28216f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.f28224n0;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / this.f28215e0;
    }

    private String getProgressText() {
        return L.n0(this.f28209V, this.f28210W, this.f28225o0);
    }

    private long getScrubberPosition() {
        if (this.f28190C.width() <= 0 || this.f28224n0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f28192E.width() * this.f28224n0) / this.f28190C.width();
    }

    private boolean j(float f10, float f11) {
        return this.f28189B.contains((int) f10, (int) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.f28220j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f28189B);
    }

    private void m(float f10) {
        Rect rect = this.f28192E;
        Rect rect2 = this.f28190C;
        rect.right = L.p((int) f10, rect2.left, rect2.right);
    }

    private static int n(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point o(MotionEvent motionEvent) {
        this.f28213c0.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f28213c0;
    }

    private boolean p(long j10) {
        long j11 = this.f28224n0;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f28222l0 ? this.f28223m0 : this.f28225o0;
        long jQ = L.q(j12 + j10, 0L, j11);
        if (jQ == j12) {
            return false;
        }
        if (this.f28222l0) {
            z(jQ);
        } else {
            v(jQ);
        }
        x();
        return true;
    }

    private boolean q(Drawable drawable) {
        return L.f18626a >= 23 && r(drawable, getLayoutDirection());
    }

    private static boolean r(Drawable drawable, int i10) {
        return L.f18626a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void s(int i10, int i11) {
        Rect rect = this.f28218h0;
        if (rect != null && rect.width() == i10 && this.f28218h0.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.f28218h0 = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void v(long j10) {
        this.f28223m0 = j10;
        this.f28222l0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<G.a> it = this.f28212b0.iterator();
        while (it.hasNext()) {
            it.next().D(this, j10);
        }
    }

    private void w(boolean z10) {
        removeCallbacks(this.f28211a0);
        this.f28222l0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<G.a> it = this.f28212b0.iterator();
        while (it.hasNext()) {
            it.next().L(this, this.f28223m0, z10);
        }
    }

    private void x() {
        this.f28191D.set(this.f28190C);
        this.f28192E.set(this.f28190C);
        long j10 = this.f28222l0 ? this.f28223m0 : this.f28225o0;
        if (this.f28224n0 > 0) {
            int iWidth = (int) ((this.f28190C.width() * this.f28226p0) / this.f28224n0);
            Rect rect = this.f28191D;
            Rect rect2 = this.f28190C;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((this.f28190C.width() * j10) / this.f28224n0);
            Rect rect3 = this.f28192E;
            Rect rect4 = this.f28190C;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f28191D;
            int i10 = this.f28190C.left;
            rect5.right = i10;
            this.f28192E.right = i10;
        }
        invalidate(this.f28189B);
    }

    private void y() {
        Drawable drawable = this.f28199L;
        if (drawable != null && drawable.isStateful() && this.f28199L.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void z(long j10) {
        if (this.f28223m0 == j10) {
            return;
        }
        this.f28223m0 = j10;
        Iterator<G.a> it = this.f28212b0.iterator();
        while (it.hasNext()) {
            it.next().I(this, j10);
        }
    }

    @Override // androidx.media3.ui.G
    public void a(G.a aVar) {
        C1804a.e(aVar);
        this.f28212b0.add(aVar);
    }

    @Override // androidx.media3.ui.G
    public void b(long[] jArr, boolean[] zArr, int i10) {
        C1804a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f28227q0 = i10;
        this.f28228r0 = jArr;
        this.f28229s0 = zArr;
        x();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    @Override // androidx.media3.ui.G
    public long getPreferredUpdateDelay() {
        int iN = n(this.f28214d0, this.f28190C.width());
        if (iN != 0) {
            long j10 = this.f28224n0;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / iN;
            }
        }
        return Long.MAX_VALUE;
    }

    public void h(long j10) {
        if (this.f28219i0.isStarted()) {
            this.f28219i0.cancel();
        }
        this.f28219i0.setFloatValues(this.f28220j0, 0.0f);
        this.f28219i0.setDuration(j10);
        this.f28219i0.start();
    }

    public void i(boolean z10) {
        if (this.f28219i0.isStarted()) {
            this.f28219i0.cancel();
        }
        this.f28221k0 = z10;
        this.f28220j0 = 0.0f;
        invalidate(this.f28189B);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f28199L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f28222l0 || z10) {
            return;
        }
        w(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f28224n0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f28211a0
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f28211a0
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f28222l0
            if (r0 == 0) goto L30
            r5 = 0
            r4.w(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2157b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f28221k0 ? 0 : this.f28207T;
        if (this.f28202O == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f28201N;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f28200M;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f28201N) / 2;
            iMax = (i15 - this.f28200M) / 2;
        }
        this.f28189B.set(paddingLeft, paddingBottom, paddingRight, this.f28201N + paddingBottom);
        Rect rect = this.f28190C;
        Rect rect2 = this.f28189B;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f28200M + iMax);
        if (L.f18626a >= 29) {
            s(i14, i15);
        }
        x();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f28201N;
        } else if (mode != 1073741824) {
            size = Math.min(this.f28201N, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        y();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f28199L;
        if (drawable == null || !r(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f28224n0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.o(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f28222l0
            if (r8 == 0) goto L76
            int r8 = r7.f28208U
            if (r0 >= r8) goto L3a
            int r8 = r7.f28217g0
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m(r8)
            goto L40
        L3a:
            r7.f28217g0 = r2
            float r8 = (float) r2
            r7.m(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.z(r0)
            r7.x()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f28222l0
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.w(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.j(r8, r0)
            if (r0 == 0) goto L76
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            r7.x()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2157b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f28224n0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (p(-getPositionIncrement())) {
                w(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (p(getPositionIncrement())) {
                w(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f28196I.setColor(i10);
        invalidate(this.f28189B);
    }

    public void setBufferedColor(int i10) {
        this.f28194G.setColor(i10);
        invalidate(this.f28189B);
    }

    @Override // androidx.media3.ui.G
    public void setBufferedPosition(long j10) {
        if (this.f28226p0 == j10) {
            return;
        }
        this.f28226p0 = j10;
        x();
    }

    @Override // androidx.media3.ui.G
    public void setDuration(long j10) {
        if (this.f28224n0 == j10) {
            return;
        }
        this.f28224n0 = j10;
        if (this.f28222l0 && j10 == -9223372036854775807L) {
            w(true);
        }
        x();
    }

    @Override // android.view.View, androidx.media3.ui.G
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f28222l0 || z10) {
            return;
        }
        w(true);
    }

    public void setKeyCountIncrement(int i10) {
        C1804a.a(i10 > 0);
        this.f28215e0 = i10;
        this.f28216f0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        C1804a.a(j10 > 0);
        this.f28215e0 = -1;
        this.f28216f0 = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f28197J.setColor(i10);
        invalidate(this.f28189B);
    }

    public void setPlayedColor(int i10) {
        this.f28193F.setColor(i10);
        invalidate(this.f28189B);
    }

    @Override // androidx.media3.ui.G
    public void setPosition(long j10) {
        if (this.f28225o0 == j10) {
            return;
        }
        this.f28225o0 = j10;
        setContentDescription(getProgressText());
        x();
    }

    public void setScrubberColor(int i10) {
        this.f28198K.setColor(i10);
        invalidate(this.f28189B);
    }

    public void setUnplayedColor(int i10) {
        this.f28195H.setColor(i10);
        invalidate(this.f28189B);
    }

    public void t() {
        if (this.f28219i0.isStarted()) {
            this.f28219i0.cancel();
        }
        this.f28221k0 = false;
        this.f28220j0 = 1.0f;
        invalidate(this.f28189B);
    }

    public void u(long j10) {
        if (this.f28219i0.isStarted()) {
            this.f28219i0.cancel();
        }
        this.f28221k0 = false;
        this.f28219i0.setFloatValues(this.f28220j0, 1.0f);
        this.f28219i0.setDuration(j10);
        this.f28219i0.start();
    }
}
