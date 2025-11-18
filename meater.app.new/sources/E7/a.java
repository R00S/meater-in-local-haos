package E7;

import C7.l;
import E7.b;
import U7.d;
import X7.g;
import X7.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.o;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import s1.X;

/* compiled from: BadgeDrawable.java */
/* loaded from: classes2.dex */
public class a extends Drawable implements o.b {

    /* renamed from: O, reason: collision with root package name */
    private static final int f4011O = l.f2581r;

    /* renamed from: P, reason: collision with root package name */
    private static final int f4012P = C7.c.f2307c;

    /* renamed from: B, reason: collision with root package name */
    private final WeakReference<Context> f4013B;

    /* renamed from: C, reason: collision with root package name */
    private final g f4014C;

    /* renamed from: D, reason: collision with root package name */
    private final o f4015D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f4016E;

    /* renamed from: F, reason: collision with root package name */
    private final b f4017F;

    /* renamed from: G, reason: collision with root package name */
    private float f4018G;

    /* renamed from: H, reason: collision with root package name */
    private float f4019H;

    /* renamed from: I, reason: collision with root package name */
    private int f4020I;

    /* renamed from: J, reason: collision with root package name */
    private float f4021J;

    /* renamed from: K, reason: collision with root package name */
    private float f4022K;

    /* renamed from: L, reason: collision with root package name */
    private float f4023L;

    /* renamed from: M, reason: collision with root package name */
    private WeakReference<View> f4024M;

    /* renamed from: N, reason: collision with root package name */
    private WeakReference<FrameLayout> f4025N;

    /* compiled from: BadgeDrawable.java */
    /* renamed from: E7.a$a, reason: collision with other inner class name */
    class RunnableC0072a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ View f4026B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ FrameLayout f4027C;

        RunnableC0072a(View view, FrameLayout frameLayout) {
            this.f4026B = view;
            this.f4027C = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.S(this.f4026B, this.f4027C);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f4013B = new WeakReference<>(context);
        r.c(context);
        this.f4016E = new Rect();
        o oVar = new o(this);
        this.f4015D = oVar;
        oVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f4017F = bVar;
        this.f4014C = new g(k.b(context, A() ? bVar.m() : bVar.i(), A() ? bVar.l() : bVar.h()).m());
        O();
    }

    private boolean A() {
        return C() || B();
    }

    private boolean D() {
        FrameLayout frameLayoutJ = j();
        return frameLayoutJ != null && frameLayoutJ.getId() == C7.g.f2497x;
    }

    private void E() {
        this.f4015D.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void F() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f4017F.e());
        if (this.f4014C.x() != colorStateListValueOf) {
            this.f4014C.b0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void G() {
        this.f4015D.l(true);
        I();
        T();
        invalidateSelf();
    }

    private void H() {
        WeakReference<View> weakReference = this.f4024M;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f4024M.get();
        WeakReference<FrameLayout> weakReference2 = this.f4025N;
        S(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void I() {
        Context context = this.f4013B.get();
        if (context == null) {
            return;
        }
        this.f4014C.setShapeAppearanceModel(k.b(context, A() ? this.f4017F.m() : this.f4017F.i(), A() ? this.f4017F.l() : this.f4017F.h()).m());
        invalidateSelf();
    }

    private void J() {
        d dVar;
        Context context = this.f4013B.get();
        if (context == null || this.f4015D.e() == (dVar = new d(context, this.f4017F.A()))) {
            return;
        }
        this.f4015D.k(dVar, context);
        K();
        T();
        invalidateSelf();
    }

    private void K() {
        this.f4015D.g().setColor(this.f4017F.j());
        invalidateSelf();
    }

    private void L() {
        U();
        this.f4015D.l(true);
        T();
        invalidateSelf();
    }

    private void M() {
        if (C()) {
            return;
        }
        G();
    }

    private void N() {
        boolean zG = this.f4017F.G();
        setVisible(zG, false);
        if (!c.f4070a || j() == null || zG) {
            return;
        }
        ((ViewGroup) j().getParent()).invalidate();
    }

    private void O() {
        I();
        J();
        L();
        G();
        E();
        F();
        K();
        H();
        T();
        N();
    }

    private void Q(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C7.g.f2497x) {
            WeakReference<FrameLayout> weakReference = this.f4025N;
            if (weakReference == null || weakReference.get() != viewGroup) {
                R(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C7.g.f2497x);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f4025N = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0072a(view, frameLayout));
            }
        }
    }

    private static void R(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void T() {
        Context context = this.f4013B.get();
        WeakReference<View> weakReference = this.f4024M;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f4016E);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f4025N;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || c.f4070a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        c.f(this.f4016E, this.f4018G, this.f4019H, this.f4022K, this.f4023L);
        float f10 = this.f4021J;
        if (f10 != -1.0f) {
            this.f4014C.Y(f10);
        }
        if (rect.equals(this.f4016E)) {
            return;
        }
        this.f4014C.setBounds(this.f4016E);
    }

    private void U() {
        if (n() != -2) {
            this.f4020I = ((int) Math.pow(10.0d, n() - 1.0d)) - 1;
        } else {
            this.f4020I = o();
        }
    }

    private void b(View view) {
        float y10;
        float x10;
        View viewJ = j();
        if (viewJ == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y11 = view.getY();
            x10 = view.getX();
            viewJ = (View) view.getParent();
            y10 = y11;
        } else if (!D()) {
            y10 = 0.0f;
            x10 = 0.0f;
        } else {
            if (!(viewJ.getParent() instanceof View)) {
                return;
            }
            y10 = viewJ.getY();
            x10 = viewJ.getX();
            viewJ = (View) viewJ.getParent();
        }
        float fX = x(viewJ, y10);
        float fM = m(viewJ, x10);
        float fH = h(viewJ, y10);
        float fS = s(viewJ, x10);
        if (fX < 0.0f) {
            this.f4019H += Math.abs(fX);
        }
        if (fM < 0.0f) {
            this.f4018G += Math.abs(fM);
        }
        if (fH > 0.0f) {
            this.f4019H -= Math.abs(fH);
        }
        if (fS > 0.0f) {
            this.f4018G -= Math.abs(fS);
        }
    }

    private void c(Rect rect, View view) {
        float f10 = A() ? this.f4017F.f4032d : this.f4017F.f4031c;
        this.f4021J = f10;
        if (f10 != -1.0f) {
            this.f4022K = f10;
            this.f4023L = f10;
        } else {
            this.f4022K = Math.round((A() ? this.f4017F.f4035g : this.f4017F.f4033e) / 2.0f);
            this.f4023L = Math.round((A() ? this.f4017F.f4036h : this.f4017F.f4034f) / 2.0f);
        }
        if (A()) {
            String strG = g();
            this.f4022K = Math.max(this.f4022K, (this.f4015D.h(strG) / 2.0f) + this.f4017F.g());
            float fMax = Math.max(this.f4023L, (this.f4015D.f(strG) / 2.0f) + this.f4017F.k());
            this.f4023L = fMax;
            this.f4022K = Math.max(this.f4022K, fMax);
        }
        int iZ = z();
        int iF = this.f4017F.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f4019H = rect.bottom - iZ;
        } else {
            this.f4019H = rect.top + iZ;
        }
        int iY = y();
        int iF2 = this.f4017F.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            this.f4018G = X.z(view) == 0 ? (rect.left - this.f4022K) + iY : (rect.right + this.f4022K) - iY;
        } else {
            this.f4018G = X.z(view) == 0 ? (rect.right + this.f4022K) - iY : (rect.left - this.f4022K) + iY;
        }
        if (this.f4017F.F()) {
            b(view);
        }
    }

    public static a d(Context context) {
        return new a(context, 0, f4012P, f4011O, null);
    }

    static a e(Context context, b.a aVar) {
        return new a(context, 0, f4012P, f4011O, aVar);
    }

    private void f(Canvas canvas) {
        String strG = g();
        if (strG != null) {
            Rect rect = new Rect();
            this.f4015D.g().getTextBounds(strG, 0, strG.length(), rect);
            float fExactCenterY = this.f4019H - rect.exactCenterY();
            canvas.drawText(strG, this.f4018G, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f4015D.g());
        }
    }

    private String g() {
        if (C()) {
            return v();
        }
        if (B()) {
            return q();
        }
        return null;
    }

    private float h(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f4019H + this.f4023L) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
    }

    private CharSequence k() {
        return this.f4017F.p();
    }

    private float m(View view, float f10) {
        return (this.f4018G - this.f4022K) + view.getX() + f10;
    }

    private String q() {
        if (this.f4020I == -2 || p() <= this.f4020I) {
            return NumberFormat.getInstance(this.f4017F.x()).format(p());
        }
        Context context = this.f4013B.get();
        return context == null ? "" : String.format(this.f4017F.x(), context.getString(C7.k.f2547p), Integer.valueOf(this.f4020I), "+");
    }

    private String r() {
        Context context;
        if (this.f4017F.q() == 0 || (context = this.f4013B.get()) == null) {
            return null;
        }
        return (this.f4020I == -2 || p() <= this.f4020I) ? context.getResources().getQuantityString(this.f4017F.q(), p(), Integer.valueOf(p())) : context.getString(this.f4017F.n(), Integer.valueOf(this.f4020I));
    }

    private float s(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f4018G + this.f4022K) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
    }

    private String v() {
        String strU = u();
        int iN = n();
        if (iN == -2 || strU == null || strU.length() <= iN) {
            return strU;
        }
        Context context = this.f4013B.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(C7.k.f2540i), strU.substring(0, iN - 1), "…");
    }

    private CharSequence w() {
        CharSequence charSequenceO = this.f4017F.o();
        return charSequenceO != null ? charSequenceO : u();
    }

    private float x(View view, float f10) {
        return (this.f4019H - this.f4023L) + view.getY() + f10;
    }

    private int y() {
        int iR = A() ? this.f4017F.r() : this.f4017F.s();
        if (this.f4017F.f4039k == 1) {
            iR += A() ? this.f4017F.f4038j : this.f4017F.f4037i;
        }
        return iR + this.f4017F.b();
    }

    private int z() {
        int iC = this.f4017F.C();
        if (A()) {
            iC = this.f4017F.B();
            Context context = this.f4013B.get();
            if (context != null) {
                iC = D7.a.c(iC, iC - this.f4017F.t(), D7.a.b(0.0f, 1.0f, 0.3f, 1.0f, U7.c.f(context) - 1.0f));
            }
        }
        if (this.f4017F.f4039k == 0) {
            iC -= Math.round(this.f4023L);
        }
        return iC + this.f4017F.c();
    }

    public boolean B() {
        return !this.f4017F.E() && this.f4017F.D();
    }

    public boolean C() {
        return this.f4017F.E();
    }

    public void P(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f4017F.w() != iMax) {
            this.f4017F.J(iMax);
            M();
        }
    }

    public void S(View view, FrameLayout frameLayout) {
        this.f4024M = new WeakReference<>(view);
        boolean z10 = c.f4070a;
        if (z10 && frameLayout == null) {
            Q(view);
        } else {
            this.f4025N = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            R(view);
        }
        T();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.o.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4014C.draw(canvas);
        if (A()) {
            f(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4017F.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4016E.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4016E.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence i() {
        if (isVisible()) {
            return C() ? w() : B() ? r() : k();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.f4025N;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int l() {
        return this.f4017F.s();
    }

    public int n() {
        return this.f4017F.u();
    }

    public int o() {
        return this.f4017F.v();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.o.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        if (this.f4017F.D()) {
            return this.f4017F.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f4017F.I(i10);
        E();
    }

    b.a t() {
        return this.f4017F.y();
    }

    public String u() {
        return this.f4017F.z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
