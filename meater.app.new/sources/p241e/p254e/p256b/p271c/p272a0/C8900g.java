package p241e.p254e.p256b.p271c.p272a0;

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
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.InterfaceC0266b;
import java.util.BitSet;
import p024c.p052i.p059j.C0954d;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.p272a0.C8904k;
import p241e.p254e.p256b.p271c.p272a0.C8905l;
import p241e.p254e.p256b.p271c.p272a0.C8906m;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p281t.C8940a;
import p241e.p254e.p256b.p271c.p287z.C8953a;

/* compiled from: MaterialShapeDrawable.java */
/* renamed from: e.e.b.c.a0.g */
/* loaded from: classes2.dex */
public class C8900g extends Drawable implements InterfaceC0266b, InterfaceC8907n {

    /* renamed from: f */
    private static final String f33682f = C8900g.class.getSimpleName();

    /* renamed from: g */
    private static final Paint f33683g = new Paint(1);

    /* renamed from: A */
    private PorterDuffColorFilter f33684A;

    /* renamed from: B */
    private final RectF f33685B;

    /* renamed from: C */
    private boolean f33686C;

    /* renamed from: h */
    private c f33687h;

    /* renamed from: i */
    private final C8906m.g[] f33688i;

    /* renamed from: j */
    private final C8906m.g[] f33689j;

    /* renamed from: k */
    private final BitSet f33690k;

    /* renamed from: l */
    private boolean f33691l;

    /* renamed from: m */
    private final Matrix f33692m;

    /* renamed from: n */
    private final Path f33693n;

    /* renamed from: o */
    private final Path f33694o;

    /* renamed from: p */
    private final RectF f33695p;

    /* renamed from: q */
    private final RectF f33696q;

    /* renamed from: r */
    private final Region f33697r;

    /* renamed from: s */
    private final Region f33698s;

    /* renamed from: t */
    private C8904k f33699t;

    /* renamed from: u */
    private final Paint f33700u;

    /* renamed from: v */
    private final Paint f33701v;

    /* renamed from: w */
    private final C8953a f33702w;

    /* renamed from: x */
    private final C8905l.a f33703x;

    /* renamed from: y */
    private final C8905l f33704y;

    /* renamed from: z */
    private PorterDuffColorFilter f33705z;

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: e.e.b.c.a0.g$a */
    class a implements C8905l.a {
        a() {
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8905l.a
        /* renamed from: a */
        public void mo28304a(C8906m c8906m, Matrix matrix, int i2) {
            C8900g.this.f33690k.set(i2, c8906m.m28393e());
            C8900g.this.f33688i[i2] = c8906m.m28394f(matrix);
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8905l.a
        /* renamed from: b */
        public void mo28305b(C8906m c8906m, Matrix matrix, int i2) {
            C8900g.this.f33690k.set(i2 + 4, c8906m.m28393e());
            C8900g.this.f33689j[i2] = c8906m.m28394f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: e.e.b.c.a0.g$b */
    class b implements C8904k.c {

        /* renamed from: a */
        final /* synthetic */ float f33707a;

        b(float f2) {
            this.f33707a = f2;
        }

        @Override // p241e.p254e.p256b.p271c.p272a0.C8904k.c
        /* renamed from: a */
        public InterfaceC8896c mo28306a(InterfaceC8896c interfaceC8896c) {
            return interfaceC8896c instanceof C8902i ? interfaceC8896c : new C8895b(this.f33707a, interfaceC8896c);
        }
    }

    /* synthetic */ C8900g(c cVar, a aVar) {
        this(cVar);
    }

    /* renamed from: E */
    private float m28242E() {
        if (m28245M()) {
            return this.f33701v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: K */
    private boolean m28243K() {
        c cVar = this.f33687h;
        int i2 = cVar.f33725q;
        return i2 != 1 && cVar.f33726r > 0 && (i2 == 2 || m28281U());
    }

    /* renamed from: L */
    private boolean m28244L() {
        Paint.Style style = this.f33687h.f33730v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: M */
    private boolean m28245M() {
        Paint.Style style = this.f33687h.f33730v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f33701v.getStrokeWidth() > 0.0f;
    }

    /* renamed from: O */
    private void m28246O() {
        super.invalidateSelf();
    }

    /* renamed from: R */
    private void m28247R(Canvas canvas) {
        if (m28243K()) {
            canvas.save();
            m28249T(canvas);
            if (!this.f33686C) {
                m28264n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f33685B.width() - getBounds().width());
            int iHeight = (int) (this.f33685B.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f33685B.width()) + (this.f33687h.f33726r * 2) + iWidth, ((int) this.f33685B.height()) + (this.f33687h.f33726r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f2 = (getBounds().left - this.f33687h.f33726r) - iWidth;
            float f3 = (getBounds().top - this.f33687h.f33726r) - iHeight;
            canvas2.translate(-f2, -f3);
            m28264n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: S */
    private static int m28248S(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    /* renamed from: T */
    private void m28249T(Canvas canvas) {
        int iM28269A = m28269A();
        int iM28270B = m28270B();
        if (Build.VERSION.SDK_INT < 21 && this.f33686C) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f33687h.f33726r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(iM28269A, iM28270B);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(iM28269A, iM28270B);
    }

    /* renamed from: f */
    private PorterDuffColorFilter m28254f(Paint paint, boolean z) {
        int color;
        int iM28262l;
        if (!z || (iM28262l = m28262l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iM28262l, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: g */
    private void m28255g(RectF rectF, Path path) {
        m28294h(rectF, path);
        if (this.f33687h.f33718j != 1.0f) {
            this.f33692m.reset();
            Matrix matrix = this.f33692m;
            float f2 = this.f33687h.f33718j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f33692m);
        }
        path.computeBounds(this.f33685B, true);
    }

    /* renamed from: i */
    private void m28256i() {
        C8904k c8904kM28336x = m28272D().m28336x(new b(-m28242E()));
        this.f33699t = c8904kM28336x;
        this.f33704y.m28379d(c8904kM28336x, this.f33687h.f33719k, m28268v(), this.f33694o);
    }

    /* renamed from: i0 */
    private boolean m28257i0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f33687h.f33712d == null || color2 == (colorForState2 = this.f33687h.f33712d.getColorForState(iArr, (color2 = this.f33700u.getColor())))) {
            z = false;
        } else {
            this.f33700u.setColor(colorForState2);
            z = true;
        }
        if (this.f33687h.f33713e == null || color == (colorForState = this.f33687h.f33713e.getColorForState(iArr, (color = this.f33701v.getColor())))) {
            return z;
        }
        this.f33701v.setColor(colorForState);
        return true;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m28258j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m28262l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private boolean m28259j0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f33705z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f33684A;
        c cVar = this.f33687h;
        this.f33705z = m28260k(cVar.f33715g, cVar.f33716h, this.f33700u, true);
        c cVar2 = this.f33687h;
        this.f33684A = m28260k(cVar2.f33714f, cVar2.f33716h, this.f33701v, false);
        c cVar3 = this.f33687h;
        if (cVar3.f33729u) {
            this.f33702w.m28527d(cVar3.f33715g.getColorForState(getState(), 0));
        }
        return (C0954d.m6056a(porterDuffColorFilter, this.f33705z) && C0954d.m6056a(porterDuffColorFilter2, this.f33684A)) ? false : true;
    }

    /* renamed from: k */
    private PorterDuffColorFilter m28260k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m28254f(paint, z) : m28258j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    private void m28261k0() {
        float fM28277J = m28277J();
        this.f33687h.f33726r = (int) Math.ceil(0.75f * fM28277J);
        this.f33687h.f33727s = (int) Math.ceil(fM28277J * 0.25f);
        m28259j0();
        m28246O();
    }

    /* renamed from: l */
    private int m28262l(int i2) {
        float fM28277J = m28277J() + m28303z();
        C8940a c8940a = this.f33687h.f33710b;
        return c8940a != null ? c8940a.m28481c(i2, fM28277J) : i2;
    }

    /* renamed from: m */
    public static C8900g m28263m(Context context, float f2) {
        int iM28471b = C8937a.m28471b(context, C8908b.f33825o, C8900g.class.getSimpleName());
        C8900g c8900g = new C8900g();
        c8900g.m28278N(context);
        c8900g.m28284X(ColorStateList.valueOf(iM28471b));
        c8900g.m28283W(f2);
        return c8900g;
    }

    /* renamed from: n */
    private void m28264n(Canvas canvas) {
        if (this.f33690k.cardinality() > 0) {
            Log.w(f33682f, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f33687h.f33727s != 0) {
            canvas.drawPath(this.f33693n, this.f33702w.m28526c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f33688i[i2].m28429b(this.f33702w, this.f33687h.f33726r, canvas);
            this.f33689j[i2].m28429b(this.f33702w, this.f33687h.f33726r, canvas);
        }
        if (this.f33686C) {
            int iM28269A = m28269A();
            int iM28270B = m28270B();
            canvas.translate(-iM28269A, -iM28270B);
            canvas.drawPath(this.f33693n, f33683g);
            canvas.translate(iM28269A, iM28270B);
        }
    }

    /* renamed from: o */
    private void m28265o(Canvas canvas) {
        m28266q(canvas, this.f33700u, this.f33693n, this.f33687h.f33709a, m28299u());
    }

    /* renamed from: q */
    private void m28266q(Canvas canvas, Paint paint, Path path, C8904k c8904k, RectF rectF) {
        if (!c8904k.m28333u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo28238a = c8904k.m28332t().mo28238a(rectF) * this.f33687h.f33719k;
            canvas.drawRoundRect(rectF, fMo28238a, fMo28238a, paint);
        }
    }

    /* renamed from: r */
    private void m28267r(Canvas canvas) {
        m28266q(canvas, this.f33701v, this.f33694o, this.f33699t, m28268v());
    }

    /* renamed from: v */
    private RectF m28268v() {
        this.f33696q.set(m28299u());
        float fM28242E = m28242E();
        this.f33696q.inset(fM28242E, fM28242E);
        return this.f33696q;
    }

    /* renamed from: A */
    public int m28269A() {
        double d2 = this.f33687h.f33727s;
        double dSin = Math.sin(Math.toRadians(r0.f33728t));
        Double.isNaN(d2);
        return (int) (d2 * dSin);
    }

    /* renamed from: B */
    public int m28270B() {
        double d2 = this.f33687h.f33727s;
        double dCos = Math.cos(Math.toRadians(r0.f33728t));
        Double.isNaN(d2);
        return (int) (d2 * dCos);
    }

    /* renamed from: C */
    public int m28271C() {
        return this.f33687h.f33726r;
    }

    /* renamed from: D */
    public C8904k m28272D() {
        return this.f33687h.f33709a;
    }

    /* renamed from: F */
    public ColorStateList m28273F() {
        return this.f33687h.f33715g;
    }

    /* renamed from: G */
    public float m28274G() {
        return this.f33687h.f33709a.m28330r().mo28238a(m28299u());
    }

    /* renamed from: H */
    public float m28275H() {
        return this.f33687h.f33709a.m28332t().mo28238a(m28299u());
    }

    /* renamed from: I */
    public float m28276I() {
        return this.f33687h.f33724p;
    }

    /* renamed from: J */
    public float m28277J() {
        return m28300w() + m28276I();
    }

    /* renamed from: N */
    public void m28278N(Context context) {
        this.f33687h.f33710b = new C8940a(context);
        m28261k0();
    }

    /* renamed from: P */
    public boolean m28279P() {
        C8940a c8940a = this.f33687h.f33710b;
        return c8940a != null && c8940a.m28482d();
    }

    /* renamed from: Q */
    public boolean m28280Q() {
        return this.f33687h.f33709a.m28333u(m28299u());
    }

    /* renamed from: U */
    public boolean m28281U() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 21 || !(m28280Q() || this.f33693n.isConvex() || i2 >= 29);
    }

    /* renamed from: V */
    public void m28282V(float f2) {
        setShapeAppearanceModel(this.f33687h.f33709a.m28335w(f2));
    }

    /* renamed from: W */
    public void m28283W(float f2) {
        c cVar = this.f33687h;
        if (cVar.f33723o != f2) {
            cVar.f33723o = f2;
            m28261k0();
        }
    }

    /* renamed from: X */
    public void m28284X(ColorStateList colorStateList) {
        c cVar = this.f33687h;
        if (cVar.f33712d != colorStateList) {
            cVar.f33712d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void m28285Y(float f2) {
        c cVar = this.f33687h;
        if (cVar.f33719k != f2) {
            cVar.f33719k = f2;
            this.f33691l = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void m28286Z(int i2, int i3, int i4, int i5) {
        c cVar = this.f33687h;
        if (cVar.f33717i == null) {
            cVar.f33717i = new Rect();
        }
        this.f33687h.f33717i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m28287a0(float f2) {
        c cVar = this.f33687h;
        if (cVar.f33722n != f2) {
            cVar.f33722n = f2;
            m28261k0();
        }
    }

    /* renamed from: b0 */
    public void m28288b0(boolean z) {
        this.f33686C = z;
    }

    /* renamed from: c0 */
    public void m28289c0(int i2) {
        this.f33702w.m28527d(i2);
        this.f33687h.f33729u = false;
        m28246O();
    }

    /* renamed from: d0 */
    public void m28290d0(int i2) {
        c cVar = this.f33687h;
        if (cVar.f33728t != i2) {
            cVar.f33728t = i2;
            m28246O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f33700u.setColorFilter(this.f33705z);
        int alpha = this.f33700u.getAlpha();
        this.f33700u.setAlpha(m28248S(alpha, this.f33687h.f33721m));
        this.f33701v.setColorFilter(this.f33684A);
        this.f33701v.setStrokeWidth(this.f33687h.f33720l);
        int alpha2 = this.f33701v.getAlpha();
        this.f33701v.setAlpha(m28248S(alpha2, this.f33687h.f33721m));
        if (this.f33691l) {
            m28256i();
            m28255g(m28299u(), this.f33693n);
            this.f33691l = false;
        }
        m28247R(canvas);
        if (m28244L()) {
            m28265o(canvas);
        }
        if (m28245M()) {
            m28267r(canvas);
        }
        this.f33700u.setAlpha(alpha);
        this.f33701v.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m28291e0(float f2, int i2) {
        m28295h0(f2);
        m28293g0(ColorStateList.valueOf(i2));
    }

    /* renamed from: f0 */
    public void m28292f0(float f2, ColorStateList colorStateList) {
        m28295h0(f2);
        m28293g0(colorStateList);
    }

    /* renamed from: g0 */
    public void m28293g0(ColorStateList colorStateList) {
        c cVar = this.f33687h;
        if (cVar.f33713e != colorStateList) {
            cVar.f33713e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f33687h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f33687h.f33725q == 2) {
            return;
        }
        if (m28280Q()) {
            outline.setRoundRect(getBounds(), m28274G() * this.f33687h.f33719k);
            return;
        }
        m28255g(m28299u(), this.f33693n);
        if (this.f33693n.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f33693n);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f33687h.f33717i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f33697r.set(getBounds());
        m28255g(m28299u(), this.f33693n);
        this.f33698s.setPath(this.f33693n, this.f33697r);
        this.f33697r.op(this.f33698s, Region.Op.DIFFERENCE);
        return this.f33697r;
    }

    /* renamed from: h */
    protected final void m28294h(RectF rectF, Path path) {
        C8905l c8905l = this.f33704y;
        c cVar = this.f33687h;
        c8905l.m28380e(cVar.f33709a, cVar.f33719k, rectF, this.f33703x, path);
    }

    /* renamed from: h0 */
    public void m28295h0(float f2) {
        this.f33687h.f33720l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f33691l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f33687h.f33715g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f33687h.f33714f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f33687h.f33713e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f33687h.f33712d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f33687h = new c(this.f33687h);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f33691l = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C8030h.b
    protected boolean onStateChange(int[] iArr) {
        boolean z = m28257i0(iArr) || m28259j0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    protected void m28296p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m28266q(canvas, paint, path, this.f33687h.f33709a, rectF);
    }

    /* renamed from: s */
    public float m28297s() {
        return this.f33687h.f33709a.m28323j().mo28238a(m28299u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c cVar = this.f33687h;
        if (cVar.f33721m != i2) {
            cVar.f33721m = i2;
            m28246O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f33687h.f33711c = colorFilter;
        m28246O();
    }

    @Override // p241e.p254e.p256b.p271c.p272a0.InterfaceC8907n
    public void setShapeAppearanceModel(C8904k c8904k) {
        this.f33687h.f33709a = c8904k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        this.f33687h.f33715g = colorStateList;
        m28259j0();
        m28246O();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f33687h;
        if (cVar.f33716h != mode) {
            cVar.f33716h = mode;
            m28259j0();
            m28246O();
        }
    }

    /* renamed from: t */
    public float m28298t() {
        return this.f33687h.f33709a.m28325l().mo28238a(m28299u());
    }

    /* renamed from: u */
    protected RectF m28299u() {
        this.f33695p.set(getBounds());
        return this.f33695p;
    }

    /* renamed from: w */
    public float m28300w() {
        return this.f33687h.f33723o;
    }

    /* renamed from: x */
    public ColorStateList m28301x() {
        return this.f33687h.f33712d;
    }

    /* renamed from: y */
    public float m28302y() {
        return this.f33687h.f33719k;
    }

    /* renamed from: z */
    public float m28303z() {
        return this.f33687h.f33722n;
    }

    public C8900g() {
        this(new C8904k());
    }

    public C8900g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(C8904k.m28317e(context, attributeSet, i2, i3).m28355m());
    }

    public C8900g(C8904k c8904k) {
        this(new c(c8904k, null));
    }

    private C8900g(c cVar) {
        this.f33688i = new C8906m.g[4];
        this.f33689j = new C8906m.g[4];
        this.f33690k = new BitSet(8);
        this.f33692m = new Matrix();
        this.f33693n = new Path();
        this.f33694o = new Path();
        this.f33695p = new RectF();
        this.f33696q = new RectF();
        this.f33697r = new Region();
        this.f33698s = new Region();
        Paint paint = new Paint(1);
        this.f33700u = paint;
        Paint paint2 = new Paint(1);
        this.f33701v = paint2;
        this.f33702w = new C8953a();
        this.f33704y = new C8905l();
        this.f33685B = new RectF();
        this.f33686C = true;
        this.f33687h = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f33683g;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m28259j0();
        m28257i0(getState());
        this.f33703x = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: e.e.b.c.a0.g$c */
    static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public C8904k f33709a;

        /* renamed from: b */
        public C8940a f33710b;

        /* renamed from: c */
        public ColorFilter f33711c;

        /* renamed from: d */
        public ColorStateList f33712d;

        /* renamed from: e */
        public ColorStateList f33713e;

        /* renamed from: f */
        public ColorStateList f33714f;

        /* renamed from: g */
        public ColorStateList f33715g;

        /* renamed from: h */
        public PorterDuff.Mode f33716h;

        /* renamed from: i */
        public Rect f33717i;

        /* renamed from: j */
        public float f33718j;

        /* renamed from: k */
        public float f33719k;

        /* renamed from: l */
        public float f33720l;

        /* renamed from: m */
        public int f33721m;

        /* renamed from: n */
        public float f33722n;

        /* renamed from: o */
        public float f33723o;

        /* renamed from: p */
        public float f33724p;

        /* renamed from: q */
        public int f33725q;

        /* renamed from: r */
        public int f33726r;

        /* renamed from: s */
        public int f33727s;

        /* renamed from: t */
        public int f33728t;

        /* renamed from: u */
        public boolean f33729u;

        /* renamed from: v */
        public Paint.Style f33730v;

        public c(C8904k c8904k, C8940a c8940a) {
            this.f33712d = null;
            this.f33713e = null;
            this.f33714f = null;
            this.f33715g = null;
            this.f33716h = PorterDuff.Mode.SRC_IN;
            this.f33717i = null;
            this.f33718j = 1.0f;
            this.f33719k = 1.0f;
            this.f33721m = 255;
            this.f33722n = 0.0f;
            this.f33723o = 0.0f;
            this.f33724p = 0.0f;
            this.f33725q = 0;
            this.f33726r = 0;
            this.f33727s = 0;
            this.f33728t = 0;
            this.f33729u = false;
            this.f33730v = Paint.Style.FILL_AND_STROKE;
            this.f33709a = c8904k;
            this.f33710b = c8940a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C8900g c8900g = new C8900g(this, null);
            c8900g.f33691l = true;
            return c8900g;
        }

        public c(c cVar) {
            this.f33712d = null;
            this.f33713e = null;
            this.f33714f = null;
            this.f33715g = null;
            this.f33716h = PorterDuff.Mode.SRC_IN;
            this.f33717i = null;
            this.f33718j = 1.0f;
            this.f33719k = 1.0f;
            this.f33721m = 255;
            this.f33722n = 0.0f;
            this.f33723o = 0.0f;
            this.f33724p = 0.0f;
            this.f33725q = 0;
            this.f33726r = 0;
            this.f33727s = 0;
            this.f33728t = 0;
            this.f33729u = false;
            this.f33730v = Paint.Style.FILL_AND_STROKE;
            this.f33709a = cVar.f33709a;
            this.f33710b = cVar.f33710b;
            this.f33720l = cVar.f33720l;
            this.f33711c = cVar.f33711c;
            this.f33712d = cVar.f33712d;
            this.f33713e = cVar.f33713e;
            this.f33716h = cVar.f33716h;
            this.f33715g = cVar.f33715g;
            this.f33721m = cVar.f33721m;
            this.f33718j = cVar.f33718j;
            this.f33727s = cVar.f33727s;
            this.f33725q = cVar.f33725q;
            this.f33729u = cVar.f33729u;
            this.f33719k = cVar.f33719k;
            this.f33722n = cVar.f33722n;
            this.f33723o = cVar.f33723o;
            this.f33724p = cVar.f33724p;
            this.f33726r = cVar.f33726r;
            this.f33728t = cVar.f33728t;
            this.f33714f = cVar.f33714f;
            this.f33730v = cVar.f33730v;
            if (cVar.f33717i != null) {
                this.f33717i = new Rect(cVar.f33717i);
            }
        }
    }
}
