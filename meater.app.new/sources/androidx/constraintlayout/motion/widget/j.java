package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.F;

/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public class j extends ConstraintLayout implements F {

    /* renamed from: W0, reason: collision with root package name */
    public static boolean f23837W0;

    /* renamed from: A0, reason: collision with root package name */
    long f23838A0;

    /* renamed from: B0, reason: collision with root package name */
    float f23839B0;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f23840C0;

    /* renamed from: D0, reason: collision with root package name */
    private ArrayList<h> f23841D0;

    /* renamed from: E0, reason: collision with root package name */
    private ArrayList<h> f23842E0;

    /* renamed from: F0, reason: collision with root package name */
    private ArrayList<h> f23843F0;

    /* renamed from: G0, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f23844G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f23845H0;

    /* renamed from: I0, reason: collision with root package name */
    private float f23846I0;

    /* renamed from: J0, reason: collision with root package name */
    boolean f23847J0;

    /* renamed from: K0, reason: collision with root package name */
    protected boolean f23848K0;

    /* renamed from: L0, reason: collision with root package name */
    float f23849L0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f23850M0;

    /* renamed from: N0, reason: collision with root package name */
    private b f23851N0;

    /* renamed from: O0, reason: collision with root package name */
    private Runnable f23852O0;

    /* renamed from: P0, reason: collision with root package name */
    private int[] f23853P0;

    /* renamed from: Q0, reason: collision with root package name */
    int f23854Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f23855R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f23856S0;

    /* renamed from: T0, reason: collision with root package name */
    d f23857T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f23858U0;

    /* renamed from: V0, reason: collision with root package name */
    ArrayList<Integer> f23859V0;

    /* renamed from: d0, reason: collision with root package name */
    Interpolator f23860d0;

    /* renamed from: e0, reason: collision with root package name */
    Interpolator f23861e0;

    /* renamed from: f0, reason: collision with root package name */
    float f23862f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f23863g0;

    /* renamed from: h0, reason: collision with root package name */
    int f23864h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f23865i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f23866j0;

    /* renamed from: k0, reason: collision with root package name */
    HashMap<View, g> f23867k0;

    /* renamed from: l0, reason: collision with root package name */
    private long f23868l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f23869m0;

    /* renamed from: n0, reason: collision with root package name */
    float f23870n0;

    /* renamed from: o0, reason: collision with root package name */
    float f23871o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f23872p0;

    /* renamed from: q0, reason: collision with root package name */
    float f23873q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f23874r0;

    /* renamed from: s0, reason: collision with root package name */
    boolean f23875s0;

    /* renamed from: t0, reason: collision with root package name */
    private c f23876t0;

    /* renamed from: u0, reason: collision with root package name */
    int f23877u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f23878v0;

    /* renamed from: w0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f23879w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f23880x0;

    /* renamed from: y0, reason: collision with root package name */
    float f23881y0;

    /* renamed from: z0, reason: collision with root package name */
    float f23882z0;

    /* compiled from: MotionLayout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f23851N0.a();
        }
    }

    /* compiled from: MotionLayout.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        float f23884a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        float f23885b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        int f23886c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f23887d = -1;

        /* renamed from: e, reason: collision with root package name */
        final String f23888e = "motion.progress";

        /* renamed from: f, reason: collision with root package name */
        final String f23889f = "motion.velocity";

        /* renamed from: g, reason: collision with root package name */
        final String f23890g = "motion.StartState";

        /* renamed from: h, reason: collision with root package name */
        final String f23891h = "motion.EndState";

        b() {
        }

        void a() {
            int i10 = this.f23886c;
            if (i10 != -1 || this.f23887d != -1) {
                if (i10 == -1) {
                    j.this.R(this.f23887d);
                } else {
                    int i11 = this.f23887d;
                    if (i11 == -1) {
                        j.this.O(i10, -1, -1);
                    } else {
                        j.this.P(i10, i11);
                    }
                }
                j.this.setState(d.SETUP);
            }
            if (Float.isNaN(this.f23885b)) {
                if (Float.isNaN(this.f23884a)) {
                    return;
                }
                j.this.setProgress(this.f23884a);
            } else {
                j.this.N(this.f23884a, this.f23885b);
                this.f23884a = Float.NaN;
                this.f23885b = Float.NaN;
                this.f23886c = -1;
                this.f23887d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f23884a);
            bundle.putFloat("motion.velocity", this.f23885b);
            bundle.putInt("motion.StartState", this.f23886c);
            bundle.putInt("motion.EndState", this.f23887d);
            return bundle;
        }

        public void c() {
            this.f23887d = j.this.f23865i0;
            this.f23886c = j.this.f23863g0;
            this.f23885b = j.this.getVelocity();
            this.f23884a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f23887d = i10;
        }

        public void e(float f10) {
            this.f23884a = f10;
        }

        public void f(int i10) {
            this.f23886c = i10;
        }

        public void g(Bundle bundle) {
            this.f23884a = bundle.getFloat("motion.progress");
            this.f23885b = bundle.getFloat("motion.velocity");
            this.f23886c = bundle.getInt("motion.StartState");
            this.f23887d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f23885b = f10;
        }
    }

    /* compiled from: MotionLayout.java */
    public interface c {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10, int i11);

        void c(j jVar, int i10);
    }

    /* compiled from: MotionLayout.java */
    enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void I() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f23876t0 == null && ((copyOnWriteArrayList = this.f23844G0) == null || copyOnWriteArrayList.isEmpty())) || this.f23846I0 == this.f23870n0) {
            return;
        }
        if (this.f23845H0 != -1) {
            K();
            this.f23847J0 = true;
        }
        this.f23845H0 = -1;
        float f10 = this.f23870n0;
        this.f23846I0 = f10;
        c cVar = this.f23876t0;
        if (cVar != null) {
            cVar.a(this, this.f23863g0, this.f23865i0, f10);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f23844G0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<c> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f23863g0, this.f23865i0, this.f23870n0);
            }
        }
        this.f23847J0 = true;
    }

    private void K() {
        c cVar = this.f23876t0;
        if (cVar != null) {
            cVar.b(this, this.f23863g0, this.f23865i0);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f23844G0;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this, this.f23863g0, this.f23865i0);
            }
        }
    }

    private void M() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (this.f23876t0 == null && ((copyOnWriteArrayList = this.f23844G0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f23847J0 = false;
        Iterator<Integer> it = this.f23859V0.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            c cVar = this.f23876t0;
            if (cVar != null) {
                cVar.c(this, next.intValue());
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f23844G0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().c(this, next.intValue());
                }
            }
        }
        this.f23859V0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void H(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        float interpolation;
        boolean z14;
        boolean z15;
        if (this.f23872p0 == -1) {
            this.f23872p0 = getNanoTime();
        }
        float f10 = this.f23871o0;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f23864h0 = -1;
        }
        if (this.f23840C0 || (this.f23875s0 && (z10 || this.f23873q0 != f10))) {
            float fSignum = Math.signum(this.f23873q0 - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f23860d0;
            float f11 = !(interpolator instanceof i) ? (((nanoTime - this.f23872p0) * fSignum) * 1.0E-9f) / this.f23869m0 : 0.0f;
            float f12 = this.f23871o0 + f11;
            if (this.f23874r0) {
                f12 = this.f23873q0;
            }
            if ((fSignum <= 0.0f || f12 < this.f23873q0) && (fSignum > 0.0f || f12 > this.f23873q0)) {
                z11 = false;
            } else {
                f12 = this.f23873q0;
                this.f23875s0 = false;
                z11 = true;
            }
            this.f23871o0 = f12;
            this.f23870n0 = f12;
            this.f23872p0 = nanoTime;
            if (interpolator == null || z11) {
                this.f23862f0 = f11;
            } else {
                if (this.f23878v0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f23868l0) * 1.0E-9f);
                    Interpolator interpolator2 = this.f23860d0;
                    if (interpolator2 == null) {
                        throw null;
                    }
                    this.f23871o0 = interpolation;
                    this.f23872p0 = nanoTime;
                    if (interpolator2 instanceof i) {
                        float fA = ((i) interpolator2).a();
                        this.f23862f0 = fA;
                        Math.abs(fA);
                        if (fA <= 0.0f || interpolation < 1.0f) {
                            z14 = false;
                        } else {
                            this.f23871o0 = 1.0f;
                            z14 = false;
                            this.f23875s0 = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.f23871o0 = 0.0f;
                            this.f23875s0 = z14;
                            f12 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.f23860d0;
                    if (interpolator3 instanceof i) {
                        this.f23862f0 = ((i) interpolator3).a();
                    } else {
                        this.f23862f0 = ((interpolator3.getInterpolation(f12 + f11) - interpolation) * fSignum) / f11;
                    }
                }
                f12 = interpolation;
            }
            if (Math.abs(this.f23862f0) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((fSignum > 0.0f && f12 >= this.f23873q0) || (fSignum <= 0.0f && f12 <= this.f23873q0)) {
                f12 = this.f23873q0;
                this.f23875s0 = false;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                z12 = 0;
                this.f23875s0 = false;
                setState(d.FINISHED);
            } else {
                z12 = 0;
            }
            int childCount = getChildCount();
            this.f23840C0 = z12;
            long nanoTime2 = getNanoTime();
            this.f23849L0 = f12;
            Interpolator interpolator4 = this.f23861e0;
            float interpolation2 = interpolator4 == null ? f12 : interpolator4.getInterpolation(f12);
            Interpolator interpolator5 = this.f23861e0;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((fSignum / this.f23869m0) + f12);
                this.f23862f0 = interpolation3;
                this.f23862f0 = interpolation3 - this.f23861e0.getInterpolation(f12);
            }
            for (int i11 = z12; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = this.f23867k0.get(childAt);
                if (gVar != null) {
                    this.f23840C0 |= gVar.c(childAt, interpolation2, nanoTime2, null);
                }
            }
            boolean z16 = (fSignum > 0.0f && f12 >= this.f23873q0) || (fSignum <= 0.0f && f12 <= this.f23873q0);
            if (!this.f23840C0 && !this.f23875s0 && z16) {
                setState(d.FINISHED);
            }
            if (this.f23848K0) {
                requestLayout();
            }
            z13 = true;
            boolean z17 = this.f23840C0 | (!z16);
            this.f23840C0 = z17;
            if (f12 <= 0.0f && (i10 = this.f23863g0) != -1 && this.f23864h0 != i10) {
                this.f23864h0 = i10;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i12 = this.f23864h0;
                int i13 = this.f23865i0;
                if (i12 != i13) {
                    this.f23864h0 = i13;
                    throw null;
                }
            }
            if (z17 || this.f23875s0) {
                invalidate();
            } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                setState(d.FINISHED);
            }
            if (!this.f23840C0 && !this.f23875s0 && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                L();
            }
        } else {
            z13 = true;
        }
        float f13 = this.f23871o0;
        if (f13 >= 1.0f) {
            int i14 = this.f23864h0;
            int i15 = this.f23865i0;
            if (i14 == i15) {
                z13 = false;
            }
            this.f23864h0 = i15;
        } else {
            if (f13 > 0.0f) {
                z15 = false;
                this.f23858U0 |= z15;
                if (z15 && !this.f23850M0) {
                    requestLayout();
                }
                this.f23870n0 = this.f23871o0;
            }
            int i16 = this.f23864h0;
            int i17 = this.f23863g0;
            if (i16 == i17) {
                z13 = false;
            }
            this.f23864h0 = i17;
        }
        z15 = z13;
        this.f23858U0 |= z15;
        if (z15) {
            requestLayout();
        }
        this.f23870n0 = this.f23871o0;
    }

    protected void J() {
        int iIntValue;
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f23876t0 != null || ((copyOnWriteArrayList = this.f23844G0) != null && !copyOnWriteArrayList.isEmpty())) && this.f23845H0 == -1) {
            this.f23845H0 = this.f23864h0;
            if (this.f23859V0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f23859V0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.f23864h0;
            if (iIntValue != i10 && i10 != -1) {
                this.f23859V0.add(Integer.valueOf(i10));
            }
        }
        M();
        Runnable runnable = this.f23852O0;
        if (runnable != null) {
            runnable.run();
            this.f23852O0 = null;
        }
        int[] iArr = this.f23853P0;
        if (iArr == null || this.f23854Q0 <= 0) {
            return;
        }
        R(iArr[0]);
        int[] iArr2 = this.f23853P0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f23854Q0--;
    }

    public void N(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f23851N0 == null) {
                this.f23851N0 = new b();
            }
            this.f23851N0.e(f10);
            this.f23851N0.h(f11);
            return;
        }
        setProgress(f10);
        setState(d.MOVING);
        this.f23862f0 = f11;
        if (f11 != 0.0f) {
            G(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            G(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void O(int i10, int i11, int i12) {
        setState(d.SETUP);
        this.f23864h0 = i10;
        this.f23863g0 = -1;
        this.f23865i0 = -1;
        androidx.constraintlayout.widget.c cVar = this.f23931L;
        if (cVar != null) {
            cVar.d(i10, i11, i12);
        }
    }

    public void P(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f23851N0 == null) {
            this.f23851N0 = new b();
        }
        this.f23851N0.f(i10);
        this.f23851N0.d(i11);
    }

    public void Q() {
        G(1.0f);
        this.f23852O0 = null;
    }

    public void R(int i10) {
        if (isAttachedToWindow()) {
            S(i10, -1, -1);
            return;
        }
        if (this.f23851N0 == null) {
            this.f23851N0 = new b();
        }
        this.f23851N0.d(i10);
    }

    public void S(int i10, int i11, int i12) {
        T(i10, i11, i12, -1);
    }

    public void T(int i10, int i11, int i12, int i13) {
        int i14 = this.f23864h0;
        if (i14 == i10) {
            return;
        }
        if (this.f23863g0 == i10) {
            G(0.0f);
            if (i13 > 0) {
                this.f23869m0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f23865i0 == i10) {
            G(1.0f);
            if (i13 > 0) {
                this.f23869m0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f23865i0 = i10;
        if (i14 != -1) {
            P(i14, i10);
            G(1.0f);
            this.f23871o0 = 0.0f;
            Q();
            if (i13 > 0) {
                this.f23869m0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f23878v0 = false;
        this.f23873q0 = 1.0f;
        this.f23870n0 = 0.0f;
        this.f23871o0 = 0.0f;
        this.f23872p0 = getNanoTime();
        this.f23868l0 = getNanoTime();
        this.f23874r0 = false;
        this.f23860d0 = null;
        if (i13 == -1) {
            throw null;
        }
        this.f23863g0 = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        ArrayList<h> arrayList = this.f23843F0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        H(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f23864h0;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f23879w0 == null) {
            this.f23879w0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f23879w0;
    }

    public int getEndState() {
        return this.f23865i0;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f23871o0;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f23863g0;
    }

    public float getTargetPosition() {
        return this.f23873q0;
    }

    public Bundle getTransitionState() {
        if (this.f23851N0 == null) {
            this.f23851N0 = new b();
        }
        this.f23851N0.c();
        return this.f23851N0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.f23869m0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f23862f0;
    }

    @Override // s1.F
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f23880x0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f23880x0 = false;
    }

    @Override // s1.E
    public boolean l(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // s1.E
    public void m(View view, View view2, int i10, int i11) {
        this.f23838A0 = getNanoTime();
        this.f23839B0 = 0.0f;
        this.f23881y0 = 0.0f;
        this.f23882z0 = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f23855R0 = display.getRotation();
        }
        L();
        b bVar = this.f23851N0;
        if (bVar != null) {
            if (this.f23856S0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f23850M0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f23850M0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f23844G0 == null) {
                this.f23844G0 = new CopyOnWriteArrayList<>();
            }
            this.f23844G0.add(hVar);
            if (hVar.v()) {
                if (this.f23841D0 == null) {
                    this.f23841D0 = new ArrayList<>();
                }
                this.f23841D0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f23842E0 == null) {
                    this.f23842E0 = new ArrayList<>();
                }
                this.f23842E0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f23843F0 == null) {
                    this.f23843F0 = new ArrayList<>();
                }
                this.f23843F0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f23841D0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f23842E0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f23877u0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f23856S0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f23866j0 = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f23842E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f23842E0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f23841D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f23841D0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f23851N0 == null) {
                this.f23851N0 = new b();
            }
            this.f23851N0.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f23871o0 == 1.0f && this.f23864h0 == this.f23865i0) {
                setState(d.MOVING);
            }
            this.f23864h0 = this.f23863g0;
            if (this.f23871o0 == 0.0f) {
                setState(d.FINISHED);
                return;
            }
            return;
        }
        if (f10 < 1.0f) {
            this.f23864h0 = -1;
            setState(d.MOVING);
            return;
        }
        if (this.f23871o0 == 0.0f && this.f23864h0 == this.f23863g0) {
            setState(d.MOVING);
        }
        this.f23864h0 = this.f23865i0;
        if (this.f23871o0 == 1.0f) {
            setState(d.FINISHED);
        }
    }

    public void setScene(l lVar) {
        t();
        throw null;
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f23864h0 = i10;
            return;
        }
        if (this.f23851N0 == null) {
            this.f23851N0 = new b();
        }
        this.f23851N0.f(i10);
        this.f23851N0.d(i10);
    }

    void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.f23864h0 == -1) {
            return;
        }
        d dVar3 = this.f23857T0;
        this.f23857T0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            I();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                J();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            I();
        }
        if (dVar == dVar2) {
            J();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f23876t0 = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f23851N0 == null) {
            this.f23851N0 = new b();
        }
        this.f23851N0.g(bundle);
        if (isAttachedToWindow()) {
            this.f23851N0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.f23863g0) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.f23865i0) + " (pos:" + this.f23871o0 + " Dpos/Dt:" + this.f23862f0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void v(int i10) {
        this.f23931L = null;
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    void L() {
    }

    void G(float f10) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // s1.E
    public void n(View view, int i10) {
    }

    @Override // s1.E
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // s1.E
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
