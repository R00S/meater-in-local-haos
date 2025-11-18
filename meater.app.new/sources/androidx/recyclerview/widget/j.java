package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
class j extends RecyclerView.p implements RecyclerView.u {

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f28932D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f28933E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    int f28934A;

    /* renamed from: B, reason: collision with root package name */
    private final Runnable f28935B;

    /* renamed from: C, reason: collision with root package name */
    private final RecyclerView.v f28936C;

    /* renamed from: a, reason: collision with root package name */
    private final int f28937a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28938b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f28939c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f28940d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28941e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28942f;

    /* renamed from: g, reason: collision with root package name */
    private final StateListDrawable f28943g;

    /* renamed from: h, reason: collision with root package name */
    private final Drawable f28944h;

    /* renamed from: i, reason: collision with root package name */
    private final int f28945i;

    /* renamed from: j, reason: collision with root package name */
    private final int f28946j;

    /* renamed from: k, reason: collision with root package name */
    int f28947k;

    /* renamed from: l, reason: collision with root package name */
    int f28948l;

    /* renamed from: m, reason: collision with root package name */
    float f28949m;

    /* renamed from: n, reason: collision with root package name */
    int f28950n;

    /* renamed from: o, reason: collision with root package name */
    int f28951o;

    /* renamed from: p, reason: collision with root package name */
    float f28952p;

    /* renamed from: s, reason: collision with root package name */
    private RecyclerView f28955s;

    /* renamed from: z, reason: collision with root package name */
    final ValueAnimator f28962z;

    /* renamed from: q, reason: collision with root package name */
    private int f28953q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f28954r = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28956t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28957u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f28958v = 0;

    /* renamed from: w, reason: collision with root package name */
    private int f28959w = 0;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f28960x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    private final int[] f28961y = new int[2];

    /* compiled from: FastScroller.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.q(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE);
        }
    }

    /* compiled from: FastScroller.java */
    class b extends RecyclerView.v {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            j.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f28965a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28965a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f28965a) {
                this.f28965a = false;
                return;
            }
            if (((Float) j.this.f28962z.getAnimatedValue()).floatValue() == 0.0f) {
                j jVar = j.this;
                jVar.f28934A = 0;
                jVar.y(0);
            } else {
                j jVar2 = j.this;
                jVar2.f28934A = 2;
                jVar2.v();
            }
        }
    }

    /* compiled from: FastScroller.java */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f28939c.setAlpha(iFloatValue);
            j.this.f28940d.setAlpha(iFloatValue);
            j.this.v();
        }
    }

    j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28962z = valueAnimatorOfFloat;
        this.f28934A = 0;
        this.f28935B = new a();
        this.f28936C = new b();
        this.f28939c = stateListDrawable;
        this.f28940d = drawable;
        this.f28943g = stateListDrawable2;
        this.f28944h = drawable2;
        this.f28941e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f28942f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f28945i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f28946j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f28937a = i11;
        this.f28938b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f28948l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f28949m, fMax, iArrP, this.f28955s.computeVerticalScrollRange(), this.f28955s.computeVerticalScrollOffset(), this.f28954r);
        if (iX != 0) {
            this.f28955s.scrollBy(0, iX);
        }
        this.f28949m = fMax;
    }

    private void k() {
        this.f28955s.removeCallbacks(this.f28935B);
    }

    private void l() {
        this.f28955s.j1(this);
        this.f28955s.k1(this);
        this.f28955s.l1(this.f28936C);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.f28954r;
        int i11 = this.f28945i;
        int i12 = this.f28951o;
        int i13 = this.f28950n;
        this.f28943g.setBounds(0, 0, i13, i11);
        this.f28944h.setBounds(0, 0, this.f28953q, this.f28946j);
        canvas.translate(0.0f, i10 - i11);
        this.f28944h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f28943g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f28953q;
        int i11 = this.f28941e;
        int i12 = i10 - i11;
        int i13 = this.f28948l;
        int i14 = this.f28947k;
        int i15 = i13 - (i14 / 2);
        this.f28939c.setBounds(0, 0, i11, i14);
        this.f28940d.setBounds(0, 0, this.f28942f, this.f28954r);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f28940d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f28939c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f28940d.draw(canvas);
        canvas.translate(this.f28941e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f28939c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f28941e, -i15);
    }

    private int[] o() {
        int[] iArr = this.f28961y;
        int i10 = this.f28938b;
        iArr[0] = i10;
        iArr[1] = this.f28953q - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f28960x;
        int i10 = this.f28938b;
        iArr[0] = i10;
        iArr[1] = this.f28954r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f28951o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f28952p, fMax, iArrO, this.f28955s.computeHorizontalScrollRange(), this.f28955s.computeHorizontalScrollOffset(), this.f28953q);
        if (iX != 0) {
            this.f28955s.scrollBy(iX, 0);
        }
        this.f28952p = fMax;
    }

    private boolean s() {
        return this.f28955s.getLayoutDirection() == 1;
    }

    private void w(int i10) {
        k();
        this.f28955s.postDelayed(this.f28935B, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.f28955s.j(this);
        this.f28955s.m(this);
        this.f28955s.n(this.f28936C);
    }

    public void A() {
        int i10 = this.f28934A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f28962z.cancel();
            }
        }
        this.f28934A = 1;
        ValueAnimator valueAnimator = this.f28962z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f28962z.setDuration(500L);
        this.f28962z.setStartDelay(0L);
        this.f28962z.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f28955s.computeVerticalScrollRange();
        int i12 = this.f28954r;
        this.f28956t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f28937a;
        int iComputeHorizontalScrollRange = this.f28955s.computeHorizontalScrollRange();
        int i13 = this.f28953q;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f28937a;
        this.f28957u = z10;
        boolean z11 = this.f28956t;
        if (!z11 && !z10) {
            if (this.f28958v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f28948l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f28947k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f28957u) {
            float f11 = i13;
            this.f28951o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f28950n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.f28958v;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f28958v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f28959w = 1;
                    this.f28952p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f28959w = 2;
                    this.f28949m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f28958v == 2) {
            this.f28949m = 0.0f;
            this.f28952p = 0.0f;
            y(1);
            this.f28959w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f28958v == 2) {
            A();
            if (this.f28959w == 1) {
                r(motionEvent.getX());
            }
            if (this.f28959w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f28958v;
        if (i10 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f28959w = 1;
                this.f28952p = (int) motionEvent.getX();
            } else if (zU) {
                this.f28959w = 2;
                this.f28949m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        if (this.f28953q != this.f28955s.getWidth() || this.f28954r != this.f28955s.getHeight()) {
            this.f28953q = this.f28955s.getWidth();
            this.f28954r = this.f28955s.getHeight();
            y(0);
        } else if (this.f28934A != 0) {
            if (this.f28956t) {
                n(canvas);
            }
            if (this.f28957u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f28955s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f28955s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.f28934A;
        if (i11 == 1) {
            this.f28962z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f28934A = 3;
        ValueAnimator valueAnimator = this.f28962z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f28962z.setDuration(i10);
        this.f28962z.start();
    }

    boolean t(float f10, float f11) {
        if (f11 >= this.f28954r - this.f28945i) {
            int i10 = this.f28951o;
            int i11 = this.f28950n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f10, float f11) {
        if (!s() ? f10 >= this.f28953q - this.f28941e : f10 <= this.f28941e) {
            int i10 = this.f28948l;
            int i11 = this.f28947k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f28955s.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.f28958v != 2) {
            this.f28939c.setState(f28932D);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.f28958v == 2 && i10 != 2) {
            this.f28939c.setState(f28933E);
            w(1200);
        } else if (i10 == 1) {
            w(ProtocolParameters.MAX_UDP_MSG_LENGTH);
        }
        this.f28958v = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void c(boolean z10) {
    }
}
