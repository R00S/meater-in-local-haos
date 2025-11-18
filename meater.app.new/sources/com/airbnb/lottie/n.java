package com.airbnb.lottie;

import L3.C;
import L3.C1357b;
import L3.C1360e;
import L3.EnumC1356a;
import L3.F;
import L3.H;
import L3.InterfaceC1358c;
import L3.u;
import L3.y;
import V3.v;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class n extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f31273t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final List<String> f31274u0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* renamed from: v0, reason: collision with root package name */
    private static final Executor f31275v0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new X3.e());

    /* renamed from: B, reason: collision with root package name */
    private L3.i f31276B;

    /* renamed from: C, reason: collision with root package name */
    private final X3.g f31277C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f31278D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31279E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f31280F;

    /* renamed from: G, reason: collision with root package name */
    private b f31281G;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList<a> f31282H;

    /* renamed from: I, reason: collision with root package name */
    private P3.b f31283I;

    /* renamed from: J, reason: collision with root package name */
    private String f31284J;

    /* renamed from: K, reason: collision with root package name */
    private P3.a f31285K;

    /* renamed from: L, reason: collision with root package name */
    private Map<String, Typeface> f31286L;

    /* renamed from: M, reason: collision with root package name */
    String f31287M;

    /* renamed from: N, reason: collision with root package name */
    H f31288N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31289O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31290P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f31291Q;

    /* renamed from: R, reason: collision with root package name */
    private T3.c f31292R;

    /* renamed from: S, reason: collision with root package name */
    private int f31293S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f31294T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f31295U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f31296V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f31297W;

    /* renamed from: X, reason: collision with root package name */
    private F f31298X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f31299Y;

    /* renamed from: Z, reason: collision with root package name */
    private final Matrix f31300Z;

    /* renamed from: a0, reason: collision with root package name */
    private Bitmap f31301a0;

    /* renamed from: b0, reason: collision with root package name */
    private Canvas f31302b0;

    /* renamed from: c0, reason: collision with root package name */
    private Rect f31303c0;

    /* renamed from: d0, reason: collision with root package name */
    private RectF f31304d0;

    /* renamed from: e0, reason: collision with root package name */
    private Paint f31305e0;

    /* renamed from: f0, reason: collision with root package name */
    private Rect f31306f0;

    /* renamed from: g0, reason: collision with root package name */
    private Rect f31307g0;

    /* renamed from: h0, reason: collision with root package name */
    private RectF f31308h0;

    /* renamed from: i0, reason: collision with root package name */
    private RectF f31309i0;

    /* renamed from: j0, reason: collision with root package name */
    private Matrix f31310j0;

    /* renamed from: k0, reason: collision with root package name */
    private Matrix f31311k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f31312l0;

    /* renamed from: m0, reason: collision with root package name */
    private EnumC1356a f31313m0;

    /* renamed from: n0, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f31314n0;

    /* renamed from: o0, reason: collision with root package name */
    private final Semaphore f31315o0;

    /* renamed from: p0, reason: collision with root package name */
    private Handler f31316p0;

    /* renamed from: q0, reason: collision with root package name */
    private Runnable f31317q0;

    /* renamed from: r0, reason: collision with root package name */
    private final Runnable f31318r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f31319s0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    interface a {
        void a(L3.i iVar);
    }

    /* compiled from: LottieDrawable.java */
    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    public n() {
        X3.g gVar = new X3.g();
        this.f31277C = gVar;
        this.f31278D = true;
        this.f31279E = false;
        this.f31280F = false;
        this.f31281G = b.NONE;
        this.f31282H = new ArrayList<>();
        this.f31290P = false;
        this.f31291Q = true;
        this.f31293S = 255;
        this.f31297W = false;
        this.f31298X = F.AUTOMATIC;
        this.f31299Y = false;
        this.f31300Z = new Matrix();
        this.f31312l0 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: L3.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9198a.g0(valueAnimator);
            }
        };
        this.f31314n0 = animatorUpdateListener;
        this.f31315o0 = new Semaphore(1);
        this.f31318r0 = new Runnable() { // from class: L3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f9199B.i0();
            }
        };
        this.f31319s0 = -3.4028235E38f;
        gVar.addUpdateListener(animatorUpdateListener);
    }

    private void A0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void B(int i10, int i11) {
        Bitmap bitmap = this.f31301a0;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f31301a0.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f31301a0 = bitmapCreateBitmap;
            this.f31302b0.setBitmap(bitmapCreateBitmap);
            this.f31312l0 = true;
            return;
        }
        if (this.f31301a0.getWidth() > i10 || this.f31301a0.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f31301a0, 0, 0, i10, i11);
            this.f31301a0 = bitmapCreateBitmap2;
            this.f31302b0.setBitmap(bitmapCreateBitmap2);
            this.f31312l0 = true;
        }
    }

    private void C() {
        if (this.f31302b0 != null) {
            return;
        }
        this.f31302b0 = new Canvas();
        this.f31309i0 = new RectF();
        this.f31310j0 = new Matrix();
        this.f31311k0 = new Matrix();
        this.f31303c0 = new Rect();
        this.f31304d0 = new RectF();
        this.f31305e0 = new M3.a();
        this.f31306f0 = new Rect();
        this.f31307g0 = new Rect();
        this.f31308h0 = new RectF();
    }

    private Context J() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private P3.a K() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f31285K == null) {
            P3.a aVar = new P3.a(getCallback(), null);
            this.f31285K = aVar;
            String str = this.f31287M;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f31285K;
    }

    private P3.b M() {
        P3.b bVar = this.f31283I;
        if (bVar != null && !bVar.b(J())) {
            this.f31283I = null;
        }
        if (this.f31283I == null) {
            this.f31283I = new P3.b(getCallback(), this.f31284J, null, this.f31276B.j());
        }
        return this.f31283I;
    }

    private Q3.h Q() {
        Iterator<String> it = f31274u0.iterator();
        Q3.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f31276B.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    private boolean b0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(Q3.e eVar, Object obj, Y3.c cVar, L3.i iVar) {
        q(eVar, obj, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(ValueAnimator valueAnimator) {
        if (E()) {
            invalidateSelf();
            return;
        }
        T3.c cVar = this.f31292R;
        if (cVar != null) {
            cVar.N(this.f31277C.m());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    private boolean h1() {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return false;
        }
        float f10 = this.f31319s0;
        float fM = this.f31277C.m();
        this.f31319s0 = fM;
        return Math.abs(fM - f10) * iVar.d() >= 50.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0() {
        T3.c cVar = this.f31292R;
        if (cVar == null) {
            return;
        }
        try {
            this.f31315o0.acquire();
            cVar.N(this.f31277C.m());
            if (f31273t0 && this.f31312l0) {
                if (this.f31316p0 == null) {
                    this.f31316p0 = new Handler(Looper.getMainLooper());
                    this.f31317q0 = new Runnable() { // from class: L3.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9197B.h0();
                        }
                    };
                }
                this.f31316p0.post(this.f31317q0);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.f31315o0.release();
            throw th;
        }
        this.f31315o0.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(L3.i iVar) {
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(L3.i iVar) {
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(int i10, L3.i iVar) {
        J0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(String str, L3.i iVar) {
        P0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(int i10, L3.i iVar) {
        O0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(float f10, L3.i iVar) {
        Q0(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(String str, L3.i iVar) {
        S0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(int i10, int i11, L3.i iVar) {
        R0(i10, i11);
    }

    private boolean r() {
        return this.f31278D || this.f31279E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(int i10, L3.i iVar) {
        T0(i10);
    }

    private void s() {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return;
        }
        T3.c cVar = new T3.c(this, v.a(iVar), iVar.k(), iVar);
        this.f31292R = cVar;
        if (this.f31295U) {
            cVar.L(true);
        }
        this.f31292R.R(this.f31291Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(String str, L3.i iVar) {
        U0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(float f10, L3.i iVar) {
        V0(f10);
    }

    private void u() {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return;
        }
        this.f31299Y = this.f31298X.j(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(float f10, L3.i iVar) {
        Y0(f10);
    }

    private void v(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void w(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void x(Canvas canvas) {
        T3.c cVar = this.f31292R;
        L3.i iVar = this.f31276B;
        if (cVar == null || iVar == null) {
            return;
        }
        this.f31300Z.reset();
        if (!getBounds().isEmpty()) {
            this.f31300Z.preScale(r2.width() / iVar.b().width(), r2.height() / iVar.b().height());
            this.f31300Z.preTranslate(r2.left, r2.top);
        }
        cVar.g(canvas, this.f31300Z, this.f31293S);
    }

    private void x0(Canvas canvas, T3.c cVar) {
        if (this.f31276B == null || cVar == null) {
            return;
        }
        C();
        canvas.getMatrix(this.f31310j0);
        canvas.getClipBounds(this.f31303c0);
        v(this.f31303c0, this.f31304d0);
        this.f31310j0.mapRect(this.f31304d0);
        w(this.f31304d0, this.f31303c0);
        if (this.f31291Q) {
            this.f31309i0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.e(this.f31309i0, null, false);
        }
        this.f31310j0.mapRect(this.f31309i0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        A0(this.f31309i0, fWidth, fHeight);
        if (!b0()) {
            RectF rectF = this.f31309i0;
            Rect rect = this.f31303c0;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f31309i0.width());
        int iCeil2 = (int) Math.ceil(this.f31309i0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        B(iCeil, iCeil2);
        if (this.f31312l0) {
            this.f31300Z.set(this.f31310j0);
            this.f31300Z.preScale(fWidth, fHeight);
            Matrix matrix = this.f31300Z;
            RectF rectF2 = this.f31309i0;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f31301a0.eraseColor(0);
            cVar.g(this.f31302b0, this.f31300Z, this.f31293S);
            this.f31310j0.invert(this.f31311k0);
            this.f31311k0.mapRect(this.f31308h0, this.f31309i0);
            w(this.f31308h0, this.f31307g0);
        }
        this.f31306f0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f31301a0, this.f31306f0, this.f31307g0, this.f31305e0);
    }

    public void A() {
        this.f31282H.clear();
        this.f31277C.l();
        if (isVisible()) {
            return;
        }
        this.f31281G = b.NONE;
    }

    public void B0(boolean z10) {
        this.f31296V = z10;
    }

    public void C0(EnumC1356a enumC1356a) {
        this.f31313m0 = enumC1356a;
    }

    public EnumC1356a D() {
        EnumC1356a enumC1356a = this.f31313m0;
        return enumC1356a != null ? enumC1356a : C1360e.d();
    }

    public void D0(boolean z10) {
        if (z10 != this.f31297W) {
            this.f31297W = z10;
            invalidateSelf();
        }
    }

    public boolean E() {
        return D() == EnumC1356a.ENABLED;
    }

    public void E0(boolean z10) {
        if (z10 != this.f31291Q) {
            this.f31291Q = z10;
            T3.c cVar = this.f31292R;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public Bitmap F(String str) {
        P3.b bVarM = M();
        if (bVarM != null) {
            return bVarM.a(str);
        }
        return null;
    }

    public boolean F0(L3.i iVar) {
        if (this.f31276B == iVar) {
            return false;
        }
        this.f31312l0 = true;
        t();
        this.f31276B = iVar;
        s();
        this.f31277C.D(iVar);
        Y0(this.f31277C.getAnimatedFraction());
        Iterator it = new ArrayList(this.f31282H).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f31282H.clear();
        iVar.v(this.f31294T);
        u();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public boolean G() {
        return this.f31297W;
    }

    public void G0(String str) {
        this.f31287M = str;
        P3.a aVarK = K();
        if (aVarK != null) {
            aVarK.c(str);
        }
    }

    public boolean H() {
        return this.f31291Q;
    }

    public void H0(C1357b c1357b) {
        P3.a aVar = this.f31285K;
        if (aVar != null) {
            aVar.d(c1357b);
        }
    }

    public L3.i I() {
        return this.f31276B;
    }

    public void I0(Map<String, Typeface> map) {
        if (map == this.f31286L) {
            return;
        }
        this.f31286L = map;
        invalidateSelf();
    }

    public void J0(final int i10) {
        if (this.f31276B == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31271a.l0(i10, iVar);
                }
            });
        } else {
            this.f31277C.E(i10);
        }
    }

    public void K0(boolean z10) {
        this.f31279E = z10;
    }

    public int L() {
        return (int) this.f31277C.n();
    }

    public void L0(InterfaceC1358c interfaceC1358c) {
        P3.b bVar = this.f31283I;
        if (bVar != null) {
            bVar.d(interfaceC1358c);
        }
    }

    public void M0(String str) {
        this.f31284J = str;
    }

    public String N() {
        return this.f31284J;
    }

    public void N0(boolean z10) {
        this.f31290P = z10;
    }

    public u O(String str) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void O0(final int i10) {
        if (this.f31276B == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31248a.n0(i10, iVar);
                }
            });
        } else {
            this.f31277C.F(i10 + 0.99f);
        }
    }

    public boolean P() {
        return this.f31290P;
    }

    public void P0(final String str) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar2) {
                    this.f31262a.m0(str, iVar2);
                }
            });
            return;
        }
        Q3.h hVarL = iVar.l(str);
        if (hVarL != null) {
            O0((int) (hVarL.f14319b + hVarL.f14320c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void Q0(final float f10) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar2) {
                    this.f31256a.o0(f10, iVar2);
                }
            });
        } else {
            this.f31277C.F(X3.i.i(iVar.p(), this.f31276B.f(), f10));
        }
    }

    public float R() {
        return this.f31277C.p();
    }

    public void R0(final int i10, final int i11) {
        if (this.f31276B == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31258a.q0(i10, i11, iVar);
                }
            });
        } else {
            this.f31277C.G(i10, i11 + 0.99f);
        }
    }

    public float S() {
        return this.f31277C.q();
    }

    public void S0(final String str) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar2) {
                    this.f31246a.p0(str, iVar2);
                }
            });
            return;
        }
        Q3.h hVarL = iVar.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f14319b;
            R0(i10, ((int) hVarL.f14320c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public C T() {
        L3.i iVar = this.f31276B;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void T0(final int i10) {
        if (this.f31276B == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31250a.r0(i10, iVar);
                }
            });
        } else {
            this.f31277C.H(i10);
        }
    }

    public float U() {
        return this.f31277C.m();
    }

    public void U0(final String str) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar2) {
                    this.f31264a.s0(str, iVar2);
                }
            });
            return;
        }
        Q3.h hVarL = iVar.l(str);
        if (hVarL != null) {
            T0((int) hVarL.f14319b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public F V() {
        return this.f31299Y ? F.SOFTWARE : F.HARDWARE;
    }

    public void V0(final float f10) {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar2) {
                    this.f31267a.t0(f10, iVar2);
                }
            });
        } else {
            T0((int) X3.i.i(iVar.p(), this.f31276B.f(), f10));
        }
    }

    public int W() {
        return this.f31277C.getRepeatCount();
    }

    public void W0(boolean z10) {
        if (this.f31295U == z10) {
            return;
        }
        this.f31295U = z10;
        T3.c cVar = this.f31292R;
        if (cVar != null) {
            cVar.L(z10);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int X() {
        return this.f31277C.getRepeatMode();
    }

    public void X0(boolean z10) {
        this.f31294T = z10;
        L3.i iVar = this.f31276B;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    public float Y() {
        return this.f31277C.r();
    }

    public void Y0(final float f10) {
        if (this.f31276B == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31269a.u0(f10, iVar);
                }
            });
            return;
        }
        if (C1360e.g()) {
            C1360e.b("Drawable#setProgress");
        }
        this.f31277C.E(this.f31276B.h(f10));
        if (C1360e.g()) {
            C1360e.c("Drawable#setProgress");
        }
    }

    public H Z() {
        return this.f31288N;
    }

    public void Z0(F f10) {
        this.f31298X = f10;
        u();
    }

    public Typeface a0(Q3.c cVar) {
        Map<String, Typeface> map = this.f31286L;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        P3.a aVarK = K();
        if (aVarK != null) {
            return aVarK.b(cVar);
        }
        return null;
    }

    public void a1(int i10) {
        this.f31277C.setRepeatCount(i10);
    }

    public void b1(int i10) {
        this.f31277C.setRepeatMode(i10);
    }

    public boolean c0() {
        X3.g gVar = this.f31277C;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public void c1(boolean z10) {
        this.f31280F = z10;
    }

    boolean d0() {
        if (isVisible()) {
            return this.f31277C.isRunning();
        }
        b bVar = this.f31281G;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public void d1(float f10) {
        this.f31277C.I(f10);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        T3.c cVar = this.f31292R;
        if (cVar == null) {
            return;
        }
        boolean zE = E();
        if (zE) {
            try {
                this.f31315o0.acquire();
            } catch (InterruptedException unused) {
                if (C1360e.g()) {
                    C1360e.c("Drawable#draw");
                }
                if (!zE) {
                    return;
                }
                this.f31315o0.release();
                if (cVar.Q() == this.f31277C.m()) {
                    return;
                }
            } catch (Throwable th) {
                if (C1360e.g()) {
                    C1360e.c("Drawable#draw");
                }
                if (zE) {
                    this.f31315o0.release();
                    if (cVar.Q() != this.f31277C.m()) {
                        f31275v0.execute(this.f31318r0);
                    }
                }
                throw th;
            }
        }
        if (C1360e.g()) {
            C1360e.b("Drawable#draw");
        }
        if (zE && h1()) {
            Y0(this.f31277C.m());
        }
        if (this.f31280F) {
            try {
                if (this.f31299Y) {
                    x0(canvas, cVar);
                } else {
                    x(canvas);
                }
            } catch (Throwable th2) {
                X3.d.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f31299Y) {
            x0(canvas, cVar);
        } else {
            x(canvas);
        }
        this.f31312l0 = false;
        if (C1360e.g()) {
            C1360e.c("Drawable#draw");
        }
        if (zE) {
            this.f31315o0.release();
            if (cVar.Q() == this.f31277C.m()) {
                return;
            }
            f31275v0.execute(this.f31318r0);
        }
    }

    public boolean e0() {
        return this.f31296V;
    }

    public void e1(Boolean bool) {
        this.f31278D = bool.booleanValue();
    }

    public void f1(H h10) {
        this.f31288N = h10;
    }

    public void g1(boolean z10) {
        this.f31277C.J(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31293S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        L3.i iVar = this.f31276B;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean i1() {
        return this.f31286L == null && this.f31288N == null && this.f31276B.c().q() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f31312l0) {
            return;
        }
        this.f31312l0 = true;
        if ((!f31273t0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return c0();
    }

    public <T> void q(final Q3.e eVar, final T t10, final Y3.c<T> cVar) {
        T3.c cVar2 = this.f31292R;
        if (cVar2 == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31252a.f0(eVar, t10, cVar, iVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == Q3.e.f14313c) {
            cVar2.c(t10, cVar);
        } else if (eVar.d() != null) {
            eVar.d().c(t10, cVar);
        } else {
            List<Q3.e> listY0 = y0(eVar);
            for (int i10 = 0; i10 < listY0.size(); i10++) {
                listY0.get(i10).d().c(t10, cVar);
            }
            zIsEmpty = true ^ listY0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == y.f9210E) {
                Y0(U());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f31293S = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        X3.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f31281G;
            if (bVar == b.PLAY) {
                w0();
            } else if (bVar == b.RESUME) {
                z0();
            }
        } else if (this.f31277C.isRunning()) {
            v0();
            this.f31281G = b.RESUME;
        } else if (zIsVisible) {
            this.f31281G = b.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        w0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        A();
    }

    public void t() {
        if (this.f31277C.isRunning()) {
            this.f31277C.cancel();
            if (!isVisible()) {
                this.f31281G = b.NONE;
            }
        }
        this.f31276B = null;
        this.f31292R = null;
        this.f31283I = null;
        this.f31319s0 = -3.4028235E38f;
        this.f31277C.k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v0() {
        this.f31282H.clear();
        this.f31277C.t();
        if (isVisible()) {
            return;
        }
        this.f31281G = b.NONE;
    }

    public void w0() {
        if (this.f31292R == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31266a.j0(iVar);
                }
            });
            return;
        }
        u();
        if (r() || W() == 0) {
            if (isVisible()) {
                this.f31277C.u();
                this.f31281G = b.NONE;
            } else {
                this.f31281G = b.PLAY;
            }
        }
        if (r()) {
            return;
        }
        Q3.h hVarQ = Q();
        if (hVarQ != null) {
            J0((int) hVarQ.f14319b);
        } else {
            J0((int) (Y() < 0.0f ? S() : R()));
        }
        this.f31277C.l();
        if (isVisible()) {
            return;
        }
        this.f31281G = b.NONE;
    }

    public void y(boolean z10) {
        if (this.f31289O == z10) {
            return;
        }
        this.f31289O = z10;
        if (this.f31276B != null) {
            s();
        }
    }

    public List<Q3.e> y0(Q3.e eVar) {
        if (this.f31292R == null) {
            X3.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f31292R.d(eVar, 0, arrayList, new Q3.e(new String[0]));
        return arrayList;
    }

    public boolean z() {
        return this.f31289O;
    }

    public void z0() {
        if (this.f31292R == null) {
            this.f31282H.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.n.a
                public final void a(L3.i iVar) {
                    this.f31261a.k0(iVar);
                }
            });
            return;
        }
        u();
        if (r() || W() == 0) {
            if (isVisible()) {
                this.f31277C.B();
                this.f31281G = b.NONE;
            } else {
                this.f31281G = b.RESUME;
            }
        }
        if (r()) {
            return;
        }
        J0((int) (Y() < 0.0f ? S() : R()));
        this.f31277C.l();
        if (isVisible()) {
            return;
        }
        this.f31281G = b.NONE;
    }
}
