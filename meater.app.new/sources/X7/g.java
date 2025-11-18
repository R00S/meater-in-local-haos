package X7;

import X7.k;
import X7.l;
import X7.m;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import r1.C4337d;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* renamed from: Y, reason: collision with root package name */
    private static final String f18774Y = "g";

    /* renamed from: Z, reason: collision with root package name */
    private static final Paint f18775Z;

    /* renamed from: B, reason: collision with root package name */
    private c f18776B;

    /* renamed from: C, reason: collision with root package name */
    private final m.g[] f18777C;

    /* renamed from: D, reason: collision with root package name */
    private final m.g[] f18778D;

    /* renamed from: E, reason: collision with root package name */
    private final BitSet f18779E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f18780F;

    /* renamed from: G, reason: collision with root package name */
    private final Matrix f18781G;

    /* renamed from: H, reason: collision with root package name */
    private final Path f18782H;

    /* renamed from: I, reason: collision with root package name */
    private final Path f18783I;

    /* renamed from: J, reason: collision with root package name */
    private final RectF f18784J;

    /* renamed from: K, reason: collision with root package name */
    private final RectF f18785K;

    /* renamed from: L, reason: collision with root package name */
    private final Region f18786L;

    /* renamed from: M, reason: collision with root package name */
    private final Region f18787M;

    /* renamed from: N, reason: collision with root package name */
    private k f18788N;

    /* renamed from: O, reason: collision with root package name */
    private final Paint f18789O;

    /* renamed from: P, reason: collision with root package name */
    private final Paint f18790P;

    /* renamed from: Q, reason: collision with root package name */
    private final W7.a f18791Q;

    /* renamed from: R, reason: collision with root package name */
    private final l.b f18792R;

    /* renamed from: S, reason: collision with root package name */
    private final l f18793S;

    /* renamed from: T, reason: collision with root package name */
    private PorterDuffColorFilter f18794T;

    /* renamed from: U, reason: collision with root package name */
    private PorterDuffColorFilter f18795U;

    /* renamed from: V, reason: collision with root package name */
    private int f18796V;

    /* renamed from: W, reason: collision with root package name */
    private final RectF f18797W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f18798X;

    /* compiled from: MaterialShapeDrawable.java */
    class a implements l.b {
        a() {
        }

        @Override // X7.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f18779E.set(i10 + 4, mVar.e());
            g.this.f18778D[i10] = mVar.f(matrix);
        }

        @Override // X7.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f18779E.set(i10, mVar.e());
            g.this.f18777C[i10] = mVar.f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f18800a;

        b(float f10) {
            this.f18800a = f10;
        }

        @Override // X7.k.c
        public X7.c a(X7.c cVar) {
            return cVar instanceof i ? cVar : new X7.b(this.f18800a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f18775Z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float G() {
        if (P()) {
            return this.f18790P.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.f18776B;
        int i10 = cVar.f18818q;
        return i10 != 1 && cVar.f18819r > 0 && (i10 == 2 || X());
    }

    private boolean O() {
        Paint.Style style = this.f18776B.f18823v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f18776B.f18823v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f18790P.getStrokeWidth() > 0.0f;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f18798X) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f18797W.width() - getBounds().width());
            int iHeight = (int) (this.f18797W.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f18797W.width()) + (this.f18776B.f18819r * 2) + iWidth, ((int) this.f18797W.height()) + (this.f18776B.f18819r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f18776B.f18819r) - iWidth;
            float f11 = (getBounds().top - this.f18776B.f18819r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void W(Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f18796V = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f18776B.f18811j != 1.0f) {
            this.f18781G.reset();
            Matrix matrix = this.f18781G;
            float f10 = this.f18776B.f18811j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f18781G);
        }
        path.computeBounds(this.f18797W, true);
    }

    private void i() {
        k kVarY = E().y(new b(-G()));
        this.f18788N = kVarY;
        this.f18793S.e(kVarY, this.f18776B.f18812k, v(), this.f18783I);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f18796V = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    private boolean l0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f18776B.f18805d == null || color2 == (colorForState2 = this.f18776B.f18805d.getColorForState(iArr, (color2 = this.f18789O.getColor())))) {
            z10 = false;
        } else {
            this.f18789O.setColor(colorForState2);
            z10 = true;
        }
        if (this.f18776B.f18806e == null || color == (colorForState = this.f18776B.f18806e.getColorForState(iArr, (color = this.f18790P.getColor())))) {
            return z10;
        }
        this.f18790P.setColor(colorForState);
        return true;
    }

    public static g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(M7.a.c(context, C7.c.f2331p, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.b0(colorStateList);
        gVar.a0(f10);
        return gVar;
    }

    private boolean m0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f18794T;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f18795U;
        c cVar = this.f18776B;
        this.f18794T = k(cVar.f18808g, cVar.f18809h, this.f18789O, true);
        c cVar2 = this.f18776B;
        this.f18795U = k(cVar2.f18807f, cVar2.f18809h, this.f18790P, false);
        c cVar3 = this.f18776B;
        if (cVar3.f18822u) {
            this.f18791Q.d(cVar3.f18808g.getColorForState(getState(), 0));
        }
        return (C4337d.a(porterDuffColorFilter, this.f18794T) && C4337d.a(porterDuffColorFilter2, this.f18795U)) ? false : true;
    }

    private void n(Canvas canvas) {
        if (this.f18779E.cardinality() > 0) {
            Log.w(f18774Y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f18776B.f18820s != 0) {
            canvas.drawPath(this.f18782H, this.f18791Q.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18777C[i10].a(this.f18791Q, this.f18776B.f18819r, canvas);
            this.f18778D[i10].a(this.f18791Q, this.f18776B.f18819r, canvas);
        }
        if (this.f18798X) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f18782H, f18775Z);
            canvas.translate(iB, iC);
        }
    }

    private void n0() {
        float fM = M();
        this.f18776B.f18819r = (int) Math.ceil(0.75f * fM);
        this.f18776B.f18820s = (int) Math.ceil(fM * 0.25f);
        m0();
        R();
    }

    private void o(Canvas canvas) {
        p(canvas, this.f18789O, this.f18782H, this.f18776B.f18802a, u());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f18776B.f18812k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF v() {
        this.f18785K.set(u());
        float fG = G();
        this.f18785K.inset(fG, fG);
        return this.f18785K;
    }

    public int A() {
        return this.f18796V;
    }

    public int B() {
        c cVar = this.f18776B;
        return (int) (cVar.f18820s * Math.sin(Math.toRadians(cVar.f18821t)));
    }

    public int C() {
        c cVar = this.f18776B;
        return (int) (cVar.f18820s * Math.cos(Math.toRadians(cVar.f18821t)));
    }

    public int D() {
        return this.f18776B.f18819r;
    }

    public k E() {
        return this.f18776B.f18802a;
    }

    public ColorStateList F() {
        return this.f18776B.f18806e;
    }

    public float H() {
        return this.f18776B.f18813l;
    }

    public ColorStateList I() {
        return this.f18776B.f18808g;
    }

    public float J() {
        return this.f18776B.f18802a.r().a(u());
    }

    public float K() {
        return this.f18776B.f18802a.t().a(u());
    }

    public float L() {
        return this.f18776B.f18817p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.f18776B.f18803b = new O7.a(context);
        n0();
    }

    public boolean S() {
        O7.a aVar = this.f18776B.f18803b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f18776B.f18802a.u(u());
    }

    public boolean X() {
        return (T() || this.f18782H.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f18776B.f18802a.w(f10));
    }

    public void Z(X7.c cVar) {
        setShapeAppearanceModel(this.f18776B.f18802a.x(cVar));
    }

    public void a0(float f10) {
        c cVar = this.f18776B;
        if (cVar.f18816o != f10) {
            cVar.f18816o = f10;
            n0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f18776B;
        if (cVar.f18805d != colorStateList) {
            cVar.f18805d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        c cVar = this.f18776B;
        if (cVar.f18812k != f10) {
            cVar.f18812k = f10;
            this.f18780F = true;
            invalidateSelf();
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
        c cVar = this.f18776B;
        if (cVar.f18810i == null) {
            cVar.f18810i = new Rect();
        }
        this.f18776B.f18810i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f18789O.setColorFilter(this.f18794T);
        int alpha = this.f18789O.getAlpha();
        this.f18789O.setAlpha(V(alpha, this.f18776B.f18814m));
        this.f18790P.setColorFilter(this.f18795U);
        this.f18790P.setStrokeWidth(this.f18776B.f18813l);
        int alpha2 = this.f18790P.getAlpha();
        this.f18790P.setAlpha(V(alpha2, this.f18776B.f18814m));
        if (this.f18780F) {
            i();
            g(u(), this.f18782H);
            this.f18780F = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f18789O.setAlpha(alpha);
        this.f18790P.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f18776B;
        if (cVar.f18815n != f10) {
            cVar.f18815n = f10;
            n0();
        }
    }

    public void f0(boolean z10) {
        this.f18798X = z10;
    }

    public void g0(int i10) {
        this.f18791Q.d(i10);
        this.f18776B.f18822u = false;
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18776B.f18814m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f18776B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f18776B.f18818q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f18776B.f18812k);
        } else {
            g(u(), this.f18782H);
            com.google.android.material.drawable.d.j(outline, this.f18782H);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f18776B.f18810i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f18786L.set(getBounds());
        g(u(), this.f18782H);
        this.f18787M.setPath(this.f18782H, this.f18786L);
        this.f18786L.op(this.f18787M, Region.Op.DIFFERENCE);
        return this.f18786L;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f18793S;
        c cVar = this.f18776B;
        lVar.d(cVar.f18802a, cVar.f18812k, rectF, this.f18792R, path);
    }

    public void h0(float f10, int i10) {
        k0(f10);
        j0(ColorStateList.valueOf(i10));
    }

    public void i0(float f10, ColorStateList colorStateList) {
        k0(f10);
        j0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f18780F = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f18776B.f18808g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f18776B.f18807f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f18776B.f18806e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f18776B.f18805d) != null && colorStateList4.isStateful())));
    }

    public void j0(ColorStateList colorStateList) {
        c cVar = this.f18776B;
        if (cVar.f18806e != colorStateList) {
            cVar.f18806e = colorStateList;
            onStateChange(getState());
        }
    }

    public void k0(float f10) {
        this.f18776B.f18813l = f10;
        invalidateSelf();
    }

    protected int l(int i10) {
        float fM = M() + z();
        O7.a aVar = this.f18776B.f18803b;
        return aVar != null ? aVar.c(i10, fM) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f18776B = new c(this.f18776B);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f18780F = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = l0(iArr) || m0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f18776B.f18802a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f18790P, this.f18783I, this.f18788N, v());
    }

    public float s() {
        return this.f18776B.f18802a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f18776B;
        if (cVar.f18814m != i10) {
            cVar.f18814m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18776B.f18804c = colorFilter;
        R();
    }

    @Override // X7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f18776B.f18802a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f18776B.f18808g = colorStateList;
        m0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f18776B;
        if (cVar.f18809h != mode) {
            cVar.f18809h = mode;
            m0();
            R();
        }
    }

    public float t() {
        return this.f18776B.f18802a.l().a(u());
    }

    protected RectF u() {
        this.f18784J.set(getBounds());
        return this.f18784J;
    }

    public float w() {
        return this.f18776B.f18816o;
    }

    public ColorStateList x() {
        return this.f18776B.f18805d;
    }

    public float y() {
        return this.f18776B.f18812k;
    }

    public float z() {
        return this.f18776B.f18815n;
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    protected g(c cVar) {
        l lVar;
        this.f18777C = new m.g[4];
        this.f18778D = new m.g[4];
        this.f18779E = new BitSet(8);
        this.f18781G = new Matrix();
        this.f18782H = new Path();
        this.f18783I = new Path();
        this.f18784J = new RectF();
        this.f18785K = new RectF();
        this.f18786L = new Region();
        this.f18787M = new Region();
        Paint paint = new Paint(1);
        this.f18789O = paint;
        Paint paint2 = new Paint(1);
        this.f18790P = paint2;
        this.f18791Q = new W7.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f18793S = lVar;
        this.f18797W = new RectF();
        this.f18798X = true;
        this.f18776B = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m0();
        l0(getState());
        this.f18792R = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MaterialShapeDrawable.java */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        k f18802a;

        /* renamed from: b, reason: collision with root package name */
        O7.a f18803b;

        /* renamed from: c, reason: collision with root package name */
        ColorFilter f18804c;

        /* renamed from: d, reason: collision with root package name */
        ColorStateList f18805d;

        /* renamed from: e, reason: collision with root package name */
        ColorStateList f18806e;

        /* renamed from: f, reason: collision with root package name */
        ColorStateList f18807f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f18808g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f18809h;

        /* renamed from: i, reason: collision with root package name */
        Rect f18810i;

        /* renamed from: j, reason: collision with root package name */
        float f18811j;

        /* renamed from: k, reason: collision with root package name */
        float f18812k;

        /* renamed from: l, reason: collision with root package name */
        float f18813l;

        /* renamed from: m, reason: collision with root package name */
        int f18814m;

        /* renamed from: n, reason: collision with root package name */
        float f18815n;

        /* renamed from: o, reason: collision with root package name */
        float f18816o;

        /* renamed from: p, reason: collision with root package name */
        float f18817p;

        /* renamed from: q, reason: collision with root package name */
        int f18818q;

        /* renamed from: r, reason: collision with root package name */
        int f18819r;

        /* renamed from: s, reason: collision with root package name */
        int f18820s;

        /* renamed from: t, reason: collision with root package name */
        int f18821t;

        /* renamed from: u, reason: collision with root package name */
        boolean f18822u;

        /* renamed from: v, reason: collision with root package name */
        Paint.Style f18823v;

        public c(k kVar, O7.a aVar) {
            this.f18805d = null;
            this.f18806e = null;
            this.f18807f = null;
            this.f18808g = null;
            this.f18809h = PorterDuff.Mode.SRC_IN;
            this.f18810i = null;
            this.f18811j = 1.0f;
            this.f18812k = 1.0f;
            this.f18814m = 255;
            this.f18815n = 0.0f;
            this.f18816o = 0.0f;
            this.f18817p = 0.0f;
            this.f18818q = 0;
            this.f18819r = 0;
            this.f18820s = 0;
            this.f18821t = 0;
            this.f18822u = false;
            this.f18823v = Paint.Style.FILL_AND_STROKE;
            this.f18802a = kVar;
            this.f18803b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f18780F = true;
            return gVar;
        }

        public c(c cVar) {
            this.f18805d = null;
            this.f18806e = null;
            this.f18807f = null;
            this.f18808g = null;
            this.f18809h = PorterDuff.Mode.SRC_IN;
            this.f18810i = null;
            this.f18811j = 1.0f;
            this.f18812k = 1.0f;
            this.f18814m = 255;
            this.f18815n = 0.0f;
            this.f18816o = 0.0f;
            this.f18817p = 0.0f;
            this.f18818q = 0;
            this.f18819r = 0;
            this.f18820s = 0;
            this.f18821t = 0;
            this.f18822u = false;
            this.f18823v = Paint.Style.FILL_AND_STROKE;
            this.f18802a = cVar.f18802a;
            this.f18803b = cVar.f18803b;
            this.f18813l = cVar.f18813l;
            this.f18804c = cVar.f18804c;
            this.f18805d = cVar.f18805d;
            this.f18806e = cVar.f18806e;
            this.f18809h = cVar.f18809h;
            this.f18808g = cVar.f18808g;
            this.f18814m = cVar.f18814m;
            this.f18811j = cVar.f18811j;
            this.f18820s = cVar.f18820s;
            this.f18818q = cVar.f18818q;
            this.f18822u = cVar.f18822u;
            this.f18812k = cVar.f18812k;
            this.f18815n = cVar.f18815n;
            this.f18816o = cVar.f18816o;
            this.f18817p = cVar.f18817p;
            this.f18819r = cVar.f18819r;
            this.f18821t = cVar.f18821t;
            this.f18807f = cVar.f18807f;
            this.f18823v = cVar.f18823v;
            if (cVar.f18810i != null) {
                this.f18810i = new Rect(cVar.f18810i);
            }
        }
    }
}
