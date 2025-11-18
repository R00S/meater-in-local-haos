package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import i1.k;
import j1.C3721f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k1.C3784a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C4391a;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* renamed from: L, reason: collision with root package name */
    static final PorterDuff.Mode f29632L = PorterDuff.Mode.SRC_IN;

    /* renamed from: C, reason: collision with root package name */
    private C0413h f29633C;

    /* renamed from: D, reason: collision with root package name */
    private PorterDuffColorFilter f29634D;

    /* renamed from: E, reason: collision with root package name */
    private ColorFilter f29635E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f29636F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f29637G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable.ConstantState f29638H;

    /* renamed from: I, reason: collision with root package name */
    private final float[] f29639I;

    /* renamed from: J, reason: collision with root package name */
    private final Matrix f29640J;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f29641K;

    /* compiled from: VectorDrawableCompat.java */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f29668b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f29667a = C3721f.d(string2);
            }
            this.f29669c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f29604d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h, reason: collision with other inner class name */
    private static class C0413h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f29688a;

        /* renamed from: b, reason: collision with root package name */
        g f29689b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f29690c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f29691d;

        /* renamed from: e, reason: collision with root package name */
        boolean f29692e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f29693f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f29694g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f29695h;

        /* renamed from: i, reason: collision with root package name */
        int f29696i;

        /* renamed from: j, reason: collision with root package name */
        boolean f29697j;

        /* renamed from: k, reason: collision with root package name */
        boolean f29698k;

        /* renamed from: l, reason: collision with root package name */
        Paint f29699l;

        public C0413h(C0413h c0413h) {
            this.f29690c = null;
            this.f29691d = h.f29632L;
            if (c0413h != null) {
                this.f29688a = c0413h.f29688a;
                g gVar = new g(c0413h.f29689b);
                this.f29689b = gVar;
                if (c0413h.f29689b.f29676e != null) {
                    gVar.f29676e = new Paint(c0413h.f29689b.f29676e);
                }
                if (c0413h.f29689b.f29675d != null) {
                    this.f29689b.f29675d = new Paint(c0413h.f29689b.f29675d);
                }
                this.f29690c = c0413h.f29690c;
                this.f29691d = c0413h.f29691d;
                this.f29692e = c0413h.f29692e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f29693f.getWidth() && i11 == this.f29693f.getHeight();
        }

        public boolean b() {
            return !this.f29698k && this.f29694g == this.f29690c && this.f29695h == this.f29691d && this.f29697j == this.f29692e && this.f29696i == this.f29689b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f29693f == null || !a(i10, i11)) {
                this.f29693f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f29698k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f29693f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f29699l == null) {
                Paint paint = new Paint();
                this.f29699l = paint;
                paint.setFilterBitmap(true);
            }
            this.f29699l.setAlpha(this.f29689b.getRootAlpha());
            this.f29699l.setColorFilter(colorFilter);
            return this.f29699l;
        }

        public boolean f() {
            return this.f29689b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f29689b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29688a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f29689b.g(iArr);
            this.f29698k |= zG;
            return zG;
        }

        public void i() {
            this.f29694g = this.f29690c;
            this.f29695h = this.f29691d;
            this.f29696i = this.f29689b.getRootAlpha();
            this.f29697j = this.f29692e;
            this.f29698k = false;
        }

        public void j(int i10, int i11) {
            this.f29693f.eraseColor(0);
            this.f29689b.b(new Canvas(this.f29693f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0413h() {
            this.f29690c = null;
            this.f29691d = h.f29632L;
            this.f29689b = new g();
        }
    }

    h() {
        this.f29637G = true;
        this.f29639I = new float[9];
        this.f29640J = new Matrix();
        this.f29641K = new Rect();
        this.f29633C = new C0413h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static h b(Resources resources, int i10, Resources.Theme theme) {
        h hVar = new h();
        hVar.f29631B = i1.h.e(resources, i10, theme);
        hVar.f29638H = new i(hVar.f29631B.getConstantState());
        return hVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0413h c0413h = this.f29633C;
        g gVar = c0413h.f29689b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f29679h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f29655b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f29687p.put(cVar.getPathName(), cVar);
                    }
                    c0413h.f29688a = cVar.f29670d | c0413h.f29688a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f29655b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f29687p.put(bVar.getPathName(), bVar);
                    }
                    c0413h.f29688a = bVar.f29670d | c0413h.f29688a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f29655b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f29687p.put(dVar2.getGroupName(), dVar2);
                    }
                    c0413h.f29688a = dVar2.f29664k | c0413h.f29688a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && C3784a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0413h c0413h = this.f29633C;
        g gVar = c0413h.f29689b;
        c0413h.f29691d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0413h.f29690c = colorStateListC;
        }
        c0413h.f29692e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, c0413h.f29692e);
        gVar.f29682k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f29682k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f29683l);
        gVar.f29683l = f10;
        if (gVar.f29682k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f29680i = typedArray.getDimension(3, gVar.f29680i);
        float dimension = typedArray.getDimension(2, gVar.f29681j);
        gVar.f29681j = dimension;
        if (gVar.f29680i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f29685n = string;
            gVar.f29687p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f29633C.f29689b.f29687p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f29631B;
        if (drawable == null) {
            return false;
        }
        C3784a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f29641K);
        if (this.f29641K.width() <= 0 || this.f29641K.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f29635E;
        if (colorFilter == null) {
            colorFilter = this.f29634D;
        }
        canvas.getMatrix(this.f29640J);
        this.f29640J.getValues(this.f29639I);
        float fAbs = Math.abs(this.f29639I[0]);
        float fAbs2 = Math.abs(this.f29639I[4]);
        float fAbs3 = Math.abs(this.f29639I[1]);
        float fAbs4 = Math.abs(this.f29639I[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f29641K.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f29641K.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f29641K;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f29641K.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f29641K.offsetTo(0, 0);
        this.f29633C.c(iMin, iMin2);
        if (!this.f29637G) {
            this.f29633C.j(iMin, iMin2);
        } else if (!this.f29633C.b()) {
            this.f29633C.j(iMin, iMin2);
            this.f29633C.i();
        }
        this.f29633C.d(canvas, colorFilter, this.f29641K);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f29637G = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.d(drawable) : this.f29633C.f29689b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f29633C.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.e(drawable) : this.f29635E;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f29631B != null) {
            return new i(this.f29631B.getConstantState());
        }
        this.f29633C.f29688a = getChangingConfigurations();
        return this.f29633C;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f29633C.f29689b.f29681j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f29633C.f29689b.f29680i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f29631B;
        return drawable != null ? C3784a.h(drawable) : this.f29633C.f29692e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0413h c0413h;
        ColorStateList colorStateList;
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0413h = this.f29633C) != null && (c0413h.g() || ((colorStateList = this.f29633C.f29690c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f29636F && super.mutate() == this) {
            this.f29633C = new C0413h(this.f29633C);
            this.f29636F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0413h c0413h = this.f29633C;
        ColorStateList colorStateList = c0413h.f29690c;
        if (colorStateList == null || (mode = c0413h.f29691d) == null) {
            z10 = false;
        } else {
            this.f29634D = i(this.f29634D, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!c0413h.g() || !c0413h.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f29633C.f29689b.getRootAlpha() != i10) {
            this.f29633C.f29689b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.j(drawable, z10);
        } else {
            this.f29633C.f29692e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.o(drawable, colorStateList);
            return;
        }
        C0413h c0413h = this.f29633C;
        if (c0413h.f29690c != colorStateList) {
            c0413h.f29690c = colorStateList;
            this.f29634D = i(this.f29634D, colorStateList, c0413h.f29691d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.p(drawable, mode);
            return;
        }
        C0413h c0413h = this.f29633C;
        if (c0413h.f29691d != mode) {
            c0413h.f29691d = mode;
            this.f29634D = i(this.f29634D, c0413h.f29690c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f29631B;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f29700a;

        public i(Drawable.ConstantState constantState) {
            this.f29700a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f29700a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f29700a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f29631B = (VectorDrawable) this.f29700a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f29631B = (VectorDrawable) this.f29700a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f29631B = (VectorDrawable) this.f29700a.newDrawable(resources, theme);
            return hVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29635E = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected C3721f.b[] f29667a;

        /* renamed from: b, reason: collision with root package name */
        String f29668b;

        /* renamed from: c, reason: collision with root package name */
        int f29669c;

        /* renamed from: d, reason: collision with root package name */
        int f29670d;

        public f() {
            super();
            this.f29667a = null;
            this.f29669c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            C3721f.b[] bVarArr = this.f29667a;
            if (bVarArr != null) {
                C3721f.b.h(bVarArr, path);
            }
        }

        public C3721f.b[] getPathData() {
            return this.f29667a;
        }

        public String getPathName() {
            return this.f29668b;
        }

        public void setPathData(C3721f.b[] bVarArr) {
            if (C3721f.b(this.f29667a, bVarArr)) {
                C3721f.k(this.f29667a, bVarArr);
            } else {
                this.f29667a = C3721f.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f29667a = null;
            this.f29669c = 0;
            this.f29668b = fVar.f29668b;
            this.f29670d = fVar.f29670d;
            this.f29667a = C3721f.f(fVar.f29667a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f29631B;
        if (drawable != null) {
            C3784a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0413h c0413h = this.f29633C;
        c0413h.f29689b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f29601a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        c0413h.f29688a = getChangingConfigurations();
        c0413h.f29698k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f29634D = i(this.f29634D, c0413h.f29690c, c0413h.f29691d);
    }

    h(C0413h c0413h) {
        this.f29637G = true;
        this.f29639I = new float[9];
        this.f29640J = new Matrix();
        this.f29641K = new Rect();
        this.f29633C = c0413h;
        this.f29634D = i(this.f29634D, c0413h.f29690c, c0413h.f29691d);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f29642e;

        /* renamed from: f, reason: collision with root package name */
        i1.d f29643f;

        /* renamed from: g, reason: collision with root package name */
        float f29644g;

        /* renamed from: h, reason: collision with root package name */
        i1.d f29645h;

        /* renamed from: i, reason: collision with root package name */
        float f29646i;

        /* renamed from: j, reason: collision with root package name */
        float f29647j;

        /* renamed from: k, reason: collision with root package name */
        float f29648k;

        /* renamed from: l, reason: collision with root package name */
        float f29649l;

        /* renamed from: m, reason: collision with root package name */
        float f29650m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f29651n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f29652o;

        /* renamed from: p, reason: collision with root package name */
        float f29653p;

        c() {
            this.f29644g = 0.0f;
            this.f29646i = 1.0f;
            this.f29647j = 1.0f;
            this.f29648k = 0.0f;
            this.f29649l = 1.0f;
            this.f29650m = 0.0f;
            this.f29651n = Paint.Cap.BUTT;
            this.f29652o = Paint.Join.MITER;
            this.f29653p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f29642e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f29668b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f29667a = C3721f.d(string2);
                }
                this.f29645h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f29647j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f29647j);
                this.f29651n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f29651n);
                this.f29652o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f29652o);
                this.f29653p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f29653p);
                this.f29643f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f29646i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f29646i);
                this.f29644g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f29644g);
                this.f29649l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f29649l);
                this.f29650m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f29650m);
                this.f29648k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f29648k);
                this.f29669c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f29669c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f29645h.i() || this.f29643f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f29643f.j(iArr) | this.f29645h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f29603c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f29647j;
        }

        int getFillColor() {
            return this.f29645h.e();
        }

        float getStrokeAlpha() {
            return this.f29646i;
        }

        int getStrokeColor() {
            return this.f29643f.e();
        }

        float getStrokeWidth() {
            return this.f29644g;
        }

        float getTrimPathEnd() {
            return this.f29649l;
        }

        float getTrimPathOffset() {
            return this.f29650m;
        }

        float getTrimPathStart() {
            return this.f29648k;
        }

        void setFillAlpha(float f10) {
            this.f29647j = f10;
        }

        void setFillColor(int i10) {
            this.f29645h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f29646i = f10;
        }

        void setStrokeColor(int i10) {
            this.f29643f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f29644g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f29649l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f29650m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f29648k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f29644g = 0.0f;
            this.f29646i = 1.0f;
            this.f29647j = 1.0f;
            this.f29648k = 0.0f;
            this.f29649l = 1.0f;
            this.f29650m = 0.0f;
            this.f29651n = Paint.Cap.BUTT;
            this.f29652o = Paint.Join.MITER;
            this.f29653p = 4.0f;
            this.f29642e = cVar.f29642e;
            this.f29643f = cVar.f29643f;
            this.f29644g = cVar.f29644g;
            this.f29646i = cVar.f29646i;
            this.f29645h = cVar.f29645h;
            this.f29669c = cVar.f29669c;
            this.f29647j = cVar.f29647j;
            this.f29648k = cVar.f29648k;
            this.f29649l = cVar.f29649l;
            this.f29650m = cVar.f29650m;
            this.f29651n = cVar.f29651n;
            this.f29652o = cVar.f29652o;
            this.f29653p = cVar.f29653p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f29671q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f29672a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f29673b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f29674c;

        /* renamed from: d, reason: collision with root package name */
        Paint f29675d;

        /* renamed from: e, reason: collision with root package name */
        Paint f29676e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f29677f;

        /* renamed from: g, reason: collision with root package name */
        private int f29678g;

        /* renamed from: h, reason: collision with root package name */
        final d f29679h;

        /* renamed from: i, reason: collision with root package name */
        float f29680i;

        /* renamed from: j, reason: collision with root package name */
        float f29681j;

        /* renamed from: k, reason: collision with root package name */
        float f29682k;

        /* renamed from: l, reason: collision with root package name */
        float f29683l;

        /* renamed from: m, reason: collision with root package name */
        int f29684m;

        /* renamed from: n, reason: collision with root package name */
        String f29685n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f29686o;

        /* renamed from: p, reason: collision with root package name */
        final C4391a<String, Object> f29687p;

        public g() {
            this.f29674c = new Matrix();
            this.f29680i = 0.0f;
            this.f29681j = 0.0f;
            this.f29682k = 0.0f;
            this.f29683l = 0.0f;
            this.f29684m = 255;
            this.f29685n = null;
            this.f29686o = null;
            this.f29687p = new C4391a<>();
            this.f29679h = new d();
            this.f29672a = new Path();
            this.f29673b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f29654a.set(matrix);
            dVar.f29654a.preConcat(dVar.f29663j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f29655b.size(); i12++) {
                e eVar = dVar.f29655b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f29654a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f29682k;
            float f11 = i11 / this.f29683l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f29654a;
            this.f29674c.set(matrix);
            this.f29674c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f29672a);
            Path path = this.f29672a;
            this.f29673b.reset();
            if (fVar.c()) {
                this.f29673b.setFillType(fVar.f29669c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f29673b.addPath(path, this.f29674c);
                canvas.clipPath(this.f29673b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f29648k;
            if (f12 != 0.0f || cVar.f29649l != 1.0f) {
                float f13 = cVar.f29650m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f29649l + f13) % 1.0f;
                if (this.f29677f == null) {
                    this.f29677f = new PathMeasure();
                }
                this.f29677f.setPath(this.f29672a, false);
                float length = this.f29677f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f29677f.getSegment(f16, length, path, true);
                    this.f29677f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f29677f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f29673b.addPath(path, this.f29674c);
            if (cVar.f29645h.l()) {
                i1.d dVar2 = cVar.f29645h;
                if (this.f29676e == null) {
                    Paint paint = new Paint(1);
                    this.f29676e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f29676e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f29674c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f29647j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f29647j));
                }
                paint2.setColorFilter(colorFilter);
                this.f29673b.setFillType(cVar.f29669c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f29673b, paint2);
            }
            if (cVar.f29643f.l()) {
                i1.d dVar3 = cVar.f29643f;
                if (this.f29675d == null) {
                    Paint paint3 = new Paint(1);
                    this.f29675d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f29675d;
                Paint.Join join = cVar.f29652o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f29651n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f29653p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f29674c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f29646i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f29646i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f29644g * fMin * fE);
                canvas.drawPath(this.f29673b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f29679h, f29671q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f29686o == null) {
                this.f29686o = Boolean.valueOf(this.f29679h.a());
            }
            return this.f29686o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f29679h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f29684m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f29684m = i10;
        }

        public g(g gVar) {
            this.f29674c = new Matrix();
            this.f29680i = 0.0f;
            this.f29681j = 0.0f;
            this.f29682k = 0.0f;
            this.f29683l = 0.0f;
            this.f29684m = 255;
            this.f29685n = null;
            this.f29686o = null;
            C4391a<String, Object> c4391a = new C4391a<>();
            this.f29687p = c4391a;
            this.f29679h = new d(gVar.f29679h, c4391a);
            this.f29672a = new Path(gVar.f29672a);
            this.f29673b = new Path(gVar.f29673b);
            this.f29680i = gVar.f29680i;
            this.f29681j = gVar.f29681j;
            this.f29682k = gVar.f29682k;
            this.f29683l = gVar.f29683l;
            this.f29678g = gVar.f29678g;
            this.f29684m = gVar.f29684m;
            this.f29685n = gVar.f29685n;
            String str = gVar.f29685n;
            if (str != null) {
                c4391a.put(str, this);
            }
            this.f29686o = gVar.f29686o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f29654a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f29655b;

        /* renamed from: c, reason: collision with root package name */
        float f29656c;

        /* renamed from: d, reason: collision with root package name */
        private float f29657d;

        /* renamed from: e, reason: collision with root package name */
        private float f29658e;

        /* renamed from: f, reason: collision with root package name */
        private float f29659f;

        /* renamed from: g, reason: collision with root package name */
        private float f29660g;

        /* renamed from: h, reason: collision with root package name */
        private float f29661h;

        /* renamed from: i, reason: collision with root package name */
        private float f29662i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f29663j;

        /* renamed from: k, reason: collision with root package name */
        int f29664k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f29665l;

        /* renamed from: m, reason: collision with root package name */
        private String f29666m;

        public d(d dVar, C4391a<String, Object> c4391a) {
            f bVar;
            super();
            this.f29654a = new Matrix();
            this.f29655b = new ArrayList<>();
            this.f29656c = 0.0f;
            this.f29657d = 0.0f;
            this.f29658e = 0.0f;
            this.f29659f = 1.0f;
            this.f29660g = 1.0f;
            this.f29661h = 0.0f;
            this.f29662i = 0.0f;
            Matrix matrix = new Matrix();
            this.f29663j = matrix;
            this.f29666m = null;
            this.f29656c = dVar.f29656c;
            this.f29657d = dVar.f29657d;
            this.f29658e = dVar.f29658e;
            this.f29659f = dVar.f29659f;
            this.f29660g = dVar.f29660g;
            this.f29661h = dVar.f29661h;
            this.f29662i = dVar.f29662i;
            this.f29665l = dVar.f29665l;
            String str = dVar.f29666m;
            this.f29666m = str;
            this.f29664k = dVar.f29664k;
            if (str != null) {
                c4391a.put(str, this);
            }
            matrix.set(dVar.f29663j);
            ArrayList<e> arrayList = dVar.f29655b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f29655b.add(new d((d) eVar, c4391a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f29655b.add(bVar);
                    String str2 = bVar.f29668b;
                    if (str2 != null) {
                        c4391a.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f29663j.reset();
            this.f29663j.postTranslate(-this.f29657d, -this.f29658e);
            this.f29663j.postScale(this.f29659f, this.f29660g);
            this.f29663j.postRotate(this.f29656c, 0.0f, 0.0f);
            this.f29663j.postTranslate(this.f29661h + this.f29657d, this.f29662i + this.f29658e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f29665l = null;
            this.f29656c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f29656c);
            this.f29657d = typedArray.getFloat(1, this.f29657d);
            this.f29658e = typedArray.getFloat(2, this.f29658e);
            this.f29659f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f29659f);
            this.f29660g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f29660g);
            this.f29661h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f29661h);
            this.f29662i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f29662i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f29666m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f29655b.size(); i10++) {
                if (this.f29655b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f29655b.size(); i10++) {
                zB |= this.f29655b.get(i10).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f29602b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f29666m;
        }

        public Matrix getLocalMatrix() {
            return this.f29663j;
        }

        public float getPivotX() {
            return this.f29657d;
        }

        public float getPivotY() {
            return this.f29658e;
        }

        public float getRotation() {
            return this.f29656c;
        }

        public float getScaleX() {
            return this.f29659f;
        }

        public float getScaleY() {
            return this.f29660g;
        }

        public float getTranslateX() {
            return this.f29661h;
        }

        public float getTranslateY() {
            return this.f29662i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f29657d) {
                this.f29657d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f29658e) {
                this.f29658e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f29656c) {
                this.f29656c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f29659f) {
                this.f29659f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f29660g) {
                this.f29660g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f29661h) {
                this.f29661h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f29662i) {
                this.f29662i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f29654a = new Matrix();
            this.f29655b = new ArrayList<>();
            this.f29656c = 0.0f;
            this.f29657d = 0.0f;
            this.f29658e = 0.0f;
            this.f29659f = 1.0f;
            this.f29660g = 1.0f;
            this.f29661h = 0.0f;
            this.f29662i = 0.0f;
            this.f29663j = new Matrix();
            this.f29666m = null;
        }
    }
}
