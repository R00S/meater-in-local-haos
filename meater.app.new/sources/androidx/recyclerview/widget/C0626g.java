package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0311u;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FastScroller.java */
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
class C0626g extends RecyclerView.AbstractC0601n implements RecyclerView.InterfaceC0606s {

    /* renamed from: a */
    private static final int[] f4146a = {R.attr.state_pressed};

    /* renamed from: b */
    private static final int[] f4147b = new int[0];

    /* renamed from: B */
    final ValueAnimator f4149B;

    /* renamed from: C */
    int f4150C;

    /* renamed from: D */
    private final Runnable f4151D;

    /* renamed from: E */
    private final RecyclerView.AbstractC0607t f4152E;

    /* renamed from: c */
    private final int f4153c;

    /* renamed from: d */
    private final int f4154d;

    /* renamed from: e */
    final StateListDrawable f4155e;

    /* renamed from: f */
    final Drawable f4156f;

    /* renamed from: g */
    private final int f4157g;

    /* renamed from: h */
    private final int f4158h;

    /* renamed from: i */
    private final StateListDrawable f4159i;

    /* renamed from: j */
    private final Drawable f4160j;

    /* renamed from: k */
    private final int f4161k;

    /* renamed from: l */
    private final int f4162l;

    /* renamed from: m */
    int f4163m;

    /* renamed from: n */
    int f4164n;

    /* renamed from: o */
    float f4165o;

    /* renamed from: p */
    int f4166p;

    /* renamed from: q */
    int f4167q;

    /* renamed from: r */
    float f4168r;

    /* renamed from: u */
    private RecyclerView f4171u;

    /* renamed from: s */
    private int f4169s = 0;

    /* renamed from: t */
    private int f4170t = 0;

    /* renamed from: v */
    private boolean f4172v = false;

    /* renamed from: w */
    private boolean f4173w = false;

    /* renamed from: x */
    private int f4174x = 0;

    /* renamed from: y */
    private int f4175y = 0;

    /* renamed from: z */
    private final int[] f4176z = new int[2];

    /* renamed from: A */
    private final int[] f4148A = new int[2];

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.g$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0626g.this.m4499k(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.g$b */
    class b extends RecyclerView.AbstractC0607t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            C0626g.this.m4505v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.g$c */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4179a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4179a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4179a) {
                this.f4179a = false;
                return;
            }
            if (((Float) C0626g.this.f4149B.getAnimatedValue()).floatValue() == 0.0f) {
                C0626g c0626g = C0626g.this;
                c0626g.f4150C = 0;
                c0626g.m4503s(0);
            } else {
                C0626g c0626g2 = C0626g.this;
                c0626g2.f4150C = 2;
                c0626g2.m4502p();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* renamed from: androidx.recyclerview.widget.g$d */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0626g.this.f4155e.setAlpha(iFloatValue);
            C0626g.this.f4156f.setAlpha(iFloatValue);
            C0626g.this.m4502p();
        }
    }

    C0626g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4149B = valueAnimatorOfFloat;
        this.f4150C = 0;
        this.f4151D = new a();
        this.f4152E = new b();
        this.f4155e = stateListDrawable;
        this.f4156f = drawable;
        this.f4159i = stateListDrawable2;
        this.f4160j = drawable2;
        this.f4157g = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f4158h = Math.max(i2, drawable.getIntrinsicWidth());
        this.f4161k = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f4162l = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f4153c = i3;
        this.f4154d = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m4498d(recyclerView);
    }

    /* renamed from: e */
    private void m4486e() {
        this.f4171u.removeCallbacks(this.f4151D);
    }

    /* renamed from: f */
    private void m4487f() {
        this.f4171u.removeItemDecoration(this);
        this.f4171u.removeOnItemTouchListener(this);
        this.f4171u.removeOnScrollListener(this.f4152E);
        m4486e();
    }

    /* renamed from: g */
    private void m4488g(Canvas canvas) {
        int i2 = this.f4170t;
        int i3 = this.f4161k;
        int i4 = this.f4167q;
        int i5 = this.f4166p;
        this.f4159i.setBounds(0, 0, i5, i3);
        this.f4160j.setBounds(0, 0, this.f4169s, this.f4162l);
        canvas.translate(0.0f, i2 - i3);
        this.f4160j.draw(canvas);
        canvas.translate(i4 - (i5 / 2), 0.0f);
        this.f4159i.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: h */
    private void m4489h(Canvas canvas) {
        int i2 = this.f4169s;
        int i3 = this.f4157g;
        int i4 = i2 - i3;
        int i5 = this.f4164n;
        int i6 = this.f4163m;
        int i7 = i5 - (i6 / 2);
        this.f4155e.setBounds(0, 0, i3, i6);
        this.f4156f.setBounds(0, 0, this.f4158h, this.f4170t);
        if (!m4493m()) {
            canvas.translate(i4, 0.0f);
            this.f4156f.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f4155e.draw(canvas);
            canvas.translate(-i4, -i7);
            return;
        }
        this.f4156f.draw(canvas);
        canvas.translate(this.f4157g, i7);
        canvas.scale(-1.0f, 1.0f);
        this.f4155e.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f4157g, -i7);
    }

    /* renamed from: i */
    private int[] m4490i() {
        int[] iArr = this.f4148A;
        int i2 = this.f4154d;
        iArr[0] = i2;
        iArr[1] = this.f4169s - i2;
        return iArr;
    }

    /* renamed from: j */
    private int[] m4491j() {
        int[] iArr = this.f4176z;
        int i2 = this.f4154d;
        iArr[0] = i2;
        iArr[1] = this.f4170t - i2;
        return iArr;
    }

    /* renamed from: l */
    private void m4492l(float f2) {
        int[] iArrM4490i = m4490i();
        float fMax = Math.max(iArrM4490i[0], Math.min(iArrM4490i[1], f2));
        if (Math.abs(this.f4167q - fMax) < 2.0f) {
            return;
        }
        int iM4495r = m4495r(this.f4168r, fMax, iArrM4490i, this.f4171u.computeHorizontalScrollRange(), this.f4171u.computeHorizontalScrollOffset(), this.f4169s);
        if (iM4495r != 0) {
            this.f4171u.scrollBy(iM4495r, 0);
        }
        this.f4168r = fMax;
    }

    /* renamed from: m */
    private boolean m4493m() {
        return C0311u.m2162y(this.f4171u) == 1;
    }

    /* renamed from: q */
    private void m4494q(int i2) {
        m4486e();
        this.f4171u.postDelayed(this.f4151D, i2);
    }

    /* renamed from: r */
    private int m4495r(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    /* renamed from: t */
    private void m4496t() {
        this.f4171u.addItemDecoration(this);
        this.f4171u.addOnItemTouchListener(this);
        this.f4171u.addOnScrollListener(this.f4152E);
    }

    /* renamed from: w */
    private void m4497w(float f2) {
        int[] iArrM4491j = m4491j();
        float fMax = Math.max(iArrM4491j[0], Math.min(iArrM4491j[1], f2));
        if (Math.abs(this.f4164n - fMax) < 2.0f) {
            return;
        }
        int iM4495r = m4495r(this.f4165o, fMax, iArrM4491j, this.f4171u.computeVerticalScrollRange(), this.f4171u.computeVerticalScrollOffset(), this.f4170t);
        if (iM4495r != 0) {
            this.f4171u.scrollBy(0, iM4495r);
        }
        this.f4165o = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0606s
    /* renamed from: a */
    public void mo4244a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4174x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM4501o = m4501o(motionEvent.getX(), motionEvent.getY());
            boolean zM4500n = m4500n(motionEvent.getX(), motionEvent.getY());
            if (zM4501o || zM4500n) {
                if (zM4500n) {
                    this.f4175y = 1;
                    this.f4168r = (int) motionEvent.getX();
                } else if (zM4501o) {
                    this.f4175y = 2;
                    this.f4165o = (int) motionEvent.getY();
                }
                m4503s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4174x == 2) {
            this.f4165o = 0.0f;
            this.f4168r = 0.0f;
            m4503s(1);
            this.f4175y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4174x == 2) {
            m4504u();
            if (this.f4175y == 1) {
                m4492l(motionEvent.getX());
            }
            if (this.f4175y == 2) {
                m4497w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0606s
    /* renamed from: b */
    public boolean mo4245b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.f4174x;
        if (i2 == 1) {
            boolean zM4501o = m4501o(motionEvent.getX(), motionEvent.getY());
            boolean zM4500n = m4500n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zM4501o && !zM4500n) {
                return false;
            }
            if (zM4500n) {
                this.f4175y = 1;
                this.f4168r = (int) motionEvent.getX();
            } else if (zM4501o) {
                this.f4175y = 2;
                this.f4165o = (int) motionEvent.getY();
            }
            m4503s(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0606s
    /* renamed from: c */
    public void mo4246c(boolean z) {
    }

    /* renamed from: d */
    public void m4498d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4171u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4487f();
        }
        this.f4171u = recyclerView;
        if (recyclerView != null) {
            m4496t();
        }
    }

    /* renamed from: k */
    void m4499k(int i2) {
        int i3 = this.f4150C;
        if (i3 == 1) {
            this.f4149B.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.f4150C = 3;
        ValueAnimator valueAnimator = this.f4149B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4149B.setDuration(i2);
        this.f4149B.start();
    }

    /* renamed from: n */
    boolean m4500n(float f2, float f3) {
        if (f3 >= this.f4170t - this.f4161k) {
            int i2 = this.f4167q;
            int i3 = this.f4166p;
            if (f2 >= i2 - (i3 / 2) && f2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    boolean m4501o(float f2, float f3) {
        if (!m4493m() ? f2 >= this.f4169s - this.f4157g : f2 <= this.f4157g / 2) {
            int i2 = this.f4164n;
            int i3 = this.f4163m;
            if (f3 >= i2 - (i3 / 2) && f3 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        if (this.f4169s != this.f4171u.getWidth() || this.f4170t != this.f4171u.getHeight()) {
            this.f4169s = this.f4171u.getWidth();
            this.f4170t = this.f4171u.getHeight();
            m4503s(0);
        } else if (this.f4150C != 0) {
            if (this.f4172v) {
                m4489h(canvas);
            }
            if (this.f4173w) {
                m4488g(canvas);
            }
        }
    }

    /* renamed from: p */
    void m4502p() {
        this.f4171u.invalidate();
    }

    /* renamed from: s */
    void m4503s(int i2) {
        if (i2 == 2 && this.f4174x != 2) {
            this.f4155e.setState(f4146a);
            m4486e();
        }
        if (i2 == 0) {
            m4502p();
        } else {
            m4504u();
        }
        if (this.f4174x == 2 && i2 != 2) {
            this.f4155e.setState(f4147b);
            m4494q(1200);
        } else if (i2 == 1) {
            m4494q(1500);
        }
        this.f4174x = i2;
    }

    /* renamed from: u */
    public void m4504u() {
        int i2 = this.f4150C;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.f4149B.cancel();
            }
        }
        this.f4150C = 1;
        ValueAnimator valueAnimator = this.f4149B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4149B.setDuration(500L);
        this.f4149B.setStartDelay(0L);
        this.f4149B.start();
    }

    /* renamed from: v */
    void m4505v(int i2, int i3) {
        int iComputeVerticalScrollRange = this.f4171u.computeVerticalScrollRange();
        int i4 = this.f4170t;
        this.f4172v = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.f4153c;
        int iComputeHorizontalScrollRange = this.f4171u.computeHorizontalScrollRange();
        int i5 = this.f4169s;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.f4153c;
        this.f4173w = z;
        boolean z2 = this.f4172v;
        if (!z2 && !z) {
            if (this.f4174x != 0) {
                m4503s(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i4;
            this.f4164n = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f4163m = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (this.f4173w) {
            float f3 = i5;
            this.f4167q = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f4166p = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.f4174x;
        if (i6 == 0 || i6 == 1) {
            m4503s(1);
        }
    }
}
