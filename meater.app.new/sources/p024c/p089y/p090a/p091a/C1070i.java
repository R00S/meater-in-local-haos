package p024c.p089y.p090a.p091a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.p003d.C0259b;
import androidx.core.content.p003d.C0263f;
import androidx.core.content.p003d.C0264g;
import androidx.core.graphics.drawable.C0265a;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p041e.C0867a;
import p024c.p052i.p053e.C0925c;

/* compiled from: VectorDrawableCompat.java */
/* renamed from: c.y.a.a.i */
/* loaded from: classes.dex */
public class C1070i extends AbstractC1069h {

    /* renamed from: g */
    static final PorterDuff.Mode f6984g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    private h f6985h;

    /* renamed from: i */
    private PorterDuffColorFilter f6986i;

    /* renamed from: j */
    private ColorFilter f6987j;

    /* renamed from: k */
    private boolean f6988k;

    /* renamed from: l */
    private boolean f6989l;

    /* renamed from: m */
    private Drawable.ConstantState f6990m;

    /* renamed from: n */
    private final float[] f6991n;

    /* renamed from: o */
    private final Matrix f6992o;

    /* renamed from: p */
    private final Rect f6993p;

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$b */
    private static class b extends f {
        b() {
        }

        /* renamed from: f */
        private void m6735f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7020b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f7019a = C0925c.m5896d(string2);
            }
            this.f7021c = C0264g.m1776k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p024c.p089y.p090a.p091a.C1070i.f
        /* renamed from: c */
        public boolean mo6736c() {
            return true;
        }

        /* renamed from: e */
        public void m6737e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0264g.m1783r(xmlPullParser, "pathData")) {
                TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6957d);
                m6735f(typedArrayM1784s, xmlPullParser);
                typedArrayM1784s.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$e */
    private static abstract class e {
        private e() {
        }

        /* renamed from: a */
        public boolean mo6741a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo6742b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$h */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f7040a;

        /* renamed from: b */
        g f7041b;

        /* renamed from: c */
        ColorStateList f7042c;

        /* renamed from: d */
        PorterDuff.Mode f7043d;

        /* renamed from: e */
        boolean f7044e;

        /* renamed from: f */
        Bitmap f7045f;

        /* renamed from: g */
        ColorStateList f7046g;

        /* renamed from: h */
        PorterDuff.Mode f7047h;

        /* renamed from: i */
        int f7048i;

        /* renamed from: j */
        boolean f7049j;

        /* renamed from: k */
        boolean f7050k;

        /* renamed from: l */
        Paint f7051l;

        public h(h hVar) {
            this.f7042c = null;
            this.f7043d = C1070i.f6984g;
            if (hVar != null) {
                this.f7040a = hVar.f7040a;
                g gVar = new g(hVar.f7041b);
                this.f7041b = gVar;
                if (hVar.f7041b.f7028f != null) {
                    gVar.f7028f = new Paint(hVar.f7041b.f7028f);
                }
                if (hVar.f7041b.f7027e != null) {
                    this.f7041b.f7027e = new Paint(hVar.f7041b.f7027e);
                }
                this.f7042c = hVar.f7042c;
                this.f7043d = hVar.f7043d;
                this.f7044e = hVar.f7044e;
            }
        }

        /* renamed from: a */
        public boolean m6755a(int i2, int i3) {
            return i2 == this.f7045f.getWidth() && i3 == this.f7045f.getHeight();
        }

        /* renamed from: b */
        public boolean m6756b() {
            return !this.f7050k && this.f7046g == this.f7042c && this.f7047h == this.f7043d && this.f7049j == this.f7044e && this.f7048i == this.f7041b.getRootAlpha();
        }

        /* renamed from: c */
        public void m6757c(int i2, int i3) {
            if (this.f7045f == null || !m6755a(i2, i3)) {
                this.f7045f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f7050k = true;
            }
        }

        /* renamed from: d */
        public void m6758d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f7045f, (Rect) null, rect, m6759e(colorFilter));
        }

        /* renamed from: e */
        public Paint m6759e(ColorFilter colorFilter) {
            if (!m6760f() && colorFilter == null) {
                return null;
            }
            if (this.f7051l == null) {
                Paint paint = new Paint();
                this.f7051l = paint;
                paint.setFilterBitmap(true);
            }
            this.f7051l.setAlpha(this.f7041b.getRootAlpha());
            this.f7051l.setColorFilter(colorFilter);
            return this.f7051l;
        }

        /* renamed from: f */
        public boolean m6760f() {
            return this.f7041b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m6761g() {
            return this.f7041b.m6753f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7040a;
        }

        /* renamed from: h */
        public boolean m6762h(int[] iArr) {
            boolean zM6754g = this.f7041b.m6754g(iArr);
            this.f7050k |= zM6754g;
            return zM6754g;
        }

        /* renamed from: i */
        public void m6763i() {
            this.f7046g = this.f7042c;
            this.f7047h = this.f7043d;
            this.f7048i = this.f7041b.getRootAlpha();
            this.f7049j = this.f7044e;
            this.f7050k = false;
        }

        /* renamed from: j */
        public void m6764j(int i2, int i3) {
            this.f7045f.eraseColor(0);
            this.f7041b.m6752b(new Canvas(this.f7045f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1070i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1070i(this);
        }

        public h() {
            this.f7042c = null;
            this.f7043d = C1070i.f6984g;
            this.f7041b = new g();
        }
    }

    C1070i() {
        this.f6989l = true;
        this.f6991n = new float[9];
        this.f6992o = new Matrix();
        this.f6993p = new Rect();
        this.f6985h = new h();
    }

    /* renamed from: a */
    static int m6725a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    /* renamed from: b */
    public static C1070i m6726b(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1070i c1070i = new C1070i();
            c1070i.f6983f = C0263f.m1751d(resources, i2, theme);
            c1070i.f6990m = new i(c1070i.f6983f.getConstantState());
            return c1070i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m6727c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    /* renamed from: c */
    public static C1070i m6727c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1070i c1070i = new C1070i();
        c1070i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1070i;
    }

    /* renamed from: e */
    private void m6728e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f6985h;
        g gVar = hVar.f7041b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f7031i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m6743g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7007b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f7039q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f7040a = cVar.f7022d | hVar.f7040a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m6737e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7007b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f7039q.put(bVar.getPathName(), bVar);
                    }
                    hVar.f7040a = bVar.f7022d | hVar.f7040a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m6746c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f7007b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f7039q.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f7040a = dVar2.f7016k | hVar.f7040a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m6729f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0265a.m1809f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m6730g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
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

    /* renamed from: i */
    private void m6731i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f6985h;
        g gVar = hVar.f7041b;
        hVar.f7043d = m6730g(C0264g.m1776k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM1772g = C0264g.m1772g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM1772g != null) {
            hVar.f7042c = colorStateListM1772g;
        }
        hVar.f7044e = C0264g.m1770e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f7044e);
        gVar.f7034l = C0264g.m1775j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f7034l);
        float fM1775j = C0264g.m1775j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f7035m);
        gVar.f7035m = fM1775j;
        if (gVar.f7034l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM1775j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f7032j = typedArray.getDimension(3, gVar.f7032j);
        float dimension = typedArray.getDimension(2, gVar.f7033k);
        gVar.f7033k = dimension;
        if (gVar.f7032j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C0264g.m1775j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f7037o = string;
            gVar.f7039q.put(string, gVar);
        }
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6983f;
        if (drawable == null) {
            return false;
        }
        C0265a.m1805b(drawable);
        return false;
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    Object m6732d(String str) {
        return this.f6985h.f7041b.f7039q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6993p);
        if (this.f6993p.width() <= 0 || this.f6993p.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6987j;
        if (colorFilter == null) {
            colorFilter = this.f6986i;
        }
        canvas.getMatrix(this.f6992o);
        this.f6992o.getValues(this.f6991n);
        float fAbs = Math.abs(this.f6991n[0]);
        float fAbs2 = Math.abs(this.f6991n[4]);
        float fAbs3 = Math.abs(this.f6991n[1]);
        float fAbs4 = Math.abs(this.f6991n[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(RecyclerView.AbstractC0599l.FLAG_MOVED, (int) (this.f6993p.width() * fAbs));
        int iMin2 = Math.min(RecyclerView.AbstractC0599l.FLAG_MOVED, (int) (this.f6993p.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f6993p;
        canvas.translate(rect.left, rect.top);
        if (m6729f()) {
            canvas.translate(this.f6993p.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f6993p.offsetTo(0, 0);
        this.f6985h.m6757c(iMin, iMin2);
        if (!this.f6989l) {
            this.f6985h.m6764j(iMin, iMin2);
        } else if (!this.f6985h.m6756b()) {
            this.f6985h.m6764j(iMin, iMin2);
            this.f6985h.m6763i();
        }
        this.f6985h.m6758d(canvas, colorFilter, this.f6993p);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1807d(drawable) : this.f6985h.f7041b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6985h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1808e(drawable) : this.f6987j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6983f != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f6983f.getConstantState());
        }
        this.f6985h.f7040a = getChangingConfigurations();
        return this.f6985h;
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6985h.f7041b.f7033k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6985h.f7041b.f7032j;
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    void m6733h(boolean z) {
        this.f6989l = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6983f;
        return drawable != null ? C0265a.m1811h(drawable) : this.f6985h.f7044e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f6985h) != null && (hVar.m6761g() || ((colorStateList = this.f6985h.f7042c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m6734j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6988k && super.mutate() == this) {
            this.f6985h = new h(this.f6985h);
            this.f6988k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f6985h;
        ColorStateList colorStateList = hVar.f7042c;
        if (colorStateList != null && (mode = hVar.f7043d) != null) {
            this.f6986i = m6734j(this.f6986i, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.m6761g() || !hVar.m6762h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f6985h.f7041b.getRootAlpha() != i2) {
            this.f6985h.f7041b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1813j(drawable, z);
        } else {
            this.f6985h.f7044e = z;
        }
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // p024c.p089y.p090a.p091a.AbstractC1069h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTint(int i2) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1817n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1818o(drawable, colorStateList);
            return;
        }
        h hVar = this.f6985h;
        if (hVar.f7042c != colorStateList) {
            hVar.f7042c = colorStateList;
            this.f6986i = m6734j(this.f6986i, colorStateList, hVar.f7043d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1819p(drawable, mode);
            return;
        }
        h hVar = this.f6985h;
        if (hVar.f7043d != mode) {
            hVar.f7043d = mode;
            this.f6986i = m6734j(this.f6986i, hVar.f7042c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6983f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$i */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f7052a;

        public i(Drawable.ConstantState constantState) {
            this.f7052a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f7052a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7052a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1070i c1070i = new C1070i();
            c1070i.f6983f = (VectorDrawable) this.f7052a.newDrawable();
            return c1070i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1070i c1070i = new C1070i();
            c1070i.f6983f = (VectorDrawable) this.f7052a.newDrawable(resources);
            return c1070i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1070i c1070i = new C1070i();
            c1070i.f6983f = (VectorDrawable) this.f7052a.newDrawable(resources, theme);
            return c1070i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6987j = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$f */
    private static abstract class f extends e {

        /* renamed from: a */
        protected C0925c.b[] f7019a;

        /* renamed from: b */
        String f7020b;

        /* renamed from: c */
        int f7021c;

        /* renamed from: d */
        int f7022d;

        public f() {
            super();
            this.f7019a = null;
            this.f7021c = 0;
        }

        /* renamed from: c */
        public boolean mo6736c() {
            return false;
        }

        /* renamed from: d */
        public void m6747d(Path path) {
            path.reset();
            C0925c.b[] bVarArr = this.f7019a;
            if (bVarArr != null) {
                C0925c.b.m5906e(bVarArr, path);
            }
        }

        public C0925c.b[] getPathData() {
            return this.f7019a;
        }

        public String getPathName() {
            return this.f7020b;
        }

        public void setPathData(C0925c.b[] bVarArr) {
            if (C0925c.m5894b(this.f7019a, bVarArr)) {
                C0925c.m5902j(this.f7019a, bVarArr);
            } else {
                this.f7019a = C0925c.m5898f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f7019a = null;
            this.f7021c = 0;
            this.f7020b = fVar.f7020b;
            this.f7022d = fVar.f7022d;
            this.f7019a = C0925c.m5898f(fVar.f7019a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6983f;
        if (drawable != null) {
            C0265a.m1810g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f6985h;
        hVar.f7041b = new g();
        TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6954a);
        m6731i(typedArrayM1784s, xmlPullParser, theme);
        typedArrayM1784s.recycle();
        hVar.f7040a = getChangingConfigurations();
        hVar.f7050k = true;
        m6728e(resources, xmlPullParser, attributeSet, theme);
        this.f6986i = m6734j(this.f6986i, hVar.f7042c, hVar.f7043d);
    }

    C1070i(h hVar) {
        this.f6989l = true;
        this.f6991n = new float[9];
        this.f6992o = new Matrix();
        this.f6993p = new Rect();
        this.f6985h = hVar;
        this.f6986i = m6734j(this.f6986i, hVar.f7042c, hVar.f7043d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$c */
    private static class c extends f {

        /* renamed from: e */
        private int[] f6994e;

        /* renamed from: f */
        C0259b f6995f;

        /* renamed from: g */
        float f6996g;

        /* renamed from: h */
        C0259b f6997h;

        /* renamed from: i */
        float f6998i;

        /* renamed from: j */
        float f6999j;

        /* renamed from: k */
        float f7000k;

        /* renamed from: l */
        float f7001l;

        /* renamed from: m */
        float f7002m;

        /* renamed from: n */
        Paint.Cap f7003n;

        /* renamed from: o */
        Paint.Join f7004o;

        /* renamed from: p */
        float f7005p;

        c() {
            this.f6996g = 0.0f;
            this.f6998i = 1.0f;
            this.f6999j = 1.0f;
            this.f7000k = 0.0f;
            this.f7001l = 1.0f;
            this.f7002m = 0.0f;
            this.f7003n = Paint.Cap.BUTT;
            this.f7004o = Paint.Join.MITER;
            this.f7005p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m6738e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m6739f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m6740h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6994e = null;
            if (C0264g.m1783r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f7020b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f7019a = C0925c.m5896d(string2);
                }
                this.f6997h = C0264g.m1774i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f6999j = C0264g.m1775j(typedArray, xmlPullParser, "fillAlpha", 12, this.f6999j);
                this.f7003n = m6738e(C0264g.m1776k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f7003n);
                this.f7004o = m6739f(C0264g.m1776k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f7004o);
                this.f7005p = C0264g.m1775j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f7005p);
                this.f6995f = C0264g.m1774i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f6998i = C0264g.m1775j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6998i);
                this.f6996g = C0264g.m1775j(typedArray, xmlPullParser, "strokeWidth", 4, this.f6996g);
                this.f7001l = C0264g.m1775j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f7001l);
                this.f7002m = C0264g.m1775j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f7002m);
                this.f7000k = C0264g.m1775j(typedArray, xmlPullParser, "trimPathStart", 5, this.f7000k);
                this.f7021c = C0264g.m1776k(typedArray, xmlPullParser, "fillType", 13, this.f7021c);
            }
        }

        @Override // p024c.p089y.p090a.p091a.C1070i.e
        /* renamed from: a */
        public boolean mo6741a() {
            return this.f6997h.m1718i() || this.f6995f.m1718i();
        }

        @Override // p024c.p089y.p090a.p091a.C1070i.e
        /* renamed from: b */
        public boolean mo6742b(int[] iArr) {
            return this.f6995f.m1719j(iArr) | this.f6997h.m1719j(iArr);
        }

        /* renamed from: g */
        public void m6743g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6956c);
            m6740h(typedArrayM1784s, xmlPullParser, theme);
            typedArrayM1784s.recycle();
        }

        float getFillAlpha() {
            return this.f6999j;
        }

        int getFillColor() {
            return this.f6997h.m1715e();
        }

        float getStrokeAlpha() {
            return this.f6998i;
        }

        int getStrokeColor() {
            return this.f6995f.m1715e();
        }

        float getStrokeWidth() {
            return this.f6996g;
        }

        float getTrimPathEnd() {
            return this.f7001l;
        }

        float getTrimPathOffset() {
            return this.f7002m;
        }

        float getTrimPathStart() {
            return this.f7000k;
        }

        void setFillAlpha(float f2) {
            this.f6999j = f2;
        }

        void setFillColor(int i2) {
            this.f6997h.m1720k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f6998i = f2;
        }

        void setStrokeColor(int i2) {
            this.f6995f.m1720k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f6996g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f7001l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f7002m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f7000k = f2;
        }

        c(c cVar) {
            super(cVar);
            this.f6996g = 0.0f;
            this.f6998i = 1.0f;
            this.f6999j = 1.0f;
            this.f7000k = 0.0f;
            this.f7001l = 1.0f;
            this.f7002m = 0.0f;
            this.f7003n = Paint.Cap.BUTT;
            this.f7004o = Paint.Join.MITER;
            this.f7005p = 4.0f;
            this.f6994e = cVar.f6994e;
            this.f6995f = cVar.f6995f;
            this.f6996g = cVar.f6996g;
            this.f6998i = cVar.f6998i;
            this.f6997h = cVar.f6997h;
            this.f7021c = cVar.f7021c;
            this.f6999j = cVar.f6999j;
            this.f7000k = cVar.f7000k;
            this.f7001l = cVar.f7001l;
            this.f7002m = cVar.f7002m;
            this.f7003n = cVar.f7003n;
            this.f7004o = cVar.f7004o;
            this.f7005p = cVar.f7005p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$g */
    private static class g {

        /* renamed from: a */
        private static final Matrix f7023a = new Matrix();

        /* renamed from: b */
        private final Path f7024b;

        /* renamed from: c */
        private final Path f7025c;

        /* renamed from: d */
        private final Matrix f7026d;

        /* renamed from: e */
        Paint f7027e;

        /* renamed from: f */
        Paint f7028f;

        /* renamed from: g */
        private PathMeasure f7029g;

        /* renamed from: h */
        private int f7030h;

        /* renamed from: i */
        final d f7031i;

        /* renamed from: j */
        float f7032j;

        /* renamed from: k */
        float f7033k;

        /* renamed from: l */
        float f7034l;

        /* renamed from: m */
        float f7035m;

        /* renamed from: n */
        int f7036n;

        /* renamed from: o */
        String f7037o;

        /* renamed from: p */
        Boolean f7038p;

        /* renamed from: q */
        final C0867a<String, Object> f7039q;

        public g() {
            this.f7026d = new Matrix();
            this.f7032j = 0.0f;
            this.f7033k = 0.0f;
            this.f7034l = 0.0f;
            this.f7035m = 0.0f;
            this.f7036n = 255;
            this.f7037o = null;
            this.f7038p = null;
            this.f7039q = new C0867a<>();
            this.f7031i = new d();
            this.f7024b = new Path();
            this.f7025c = new Path();
        }

        /* renamed from: a */
        private static float m6748a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        /* renamed from: c */
        private void m6749c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f7006a.set(matrix);
            dVar.f7006a.preConcat(dVar.f7015j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f7007b.size(); i4++) {
                e eVar = dVar.f7007b.get(i4);
                if (eVar instanceof d) {
                    m6749c((d) eVar, dVar.f7006a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    m6750d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6750d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f7034l;
            float f3 = i3 / this.f7035m;
            float fMin = Math.min(f2, f3);
            Matrix matrix = dVar.f7006a;
            this.f7026d.set(matrix);
            this.f7026d.postScale(f2, f3);
            float fM6751e = m6751e(matrix);
            if (fM6751e == 0.0f) {
                return;
            }
            fVar.m6747d(this.f7024b);
            Path path = this.f7024b;
            this.f7025c.reset();
            if (fVar.mo6736c()) {
                this.f7025c.setFillType(fVar.f7021c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f7025c.addPath(path, this.f7026d);
                canvas.clipPath(this.f7025c);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f7000k;
            if (f4 != 0.0f || cVar.f7001l != 1.0f) {
                float f5 = cVar.f7002m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.f7001l + f5) % 1.0f;
                if (this.f7029g == null) {
                    this.f7029g = new PathMeasure();
                }
                this.f7029g.setPath(this.f7024b, false);
                float length = this.f7029g.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f7029g.getSegment(f8, length, path, true);
                    this.f7029g.getSegment(0.0f, f9, path, true);
                } else {
                    this.f7029g.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f7025c.addPath(path, this.f7026d);
            if (cVar.f6997h.m1721l()) {
                C0259b c0259b = cVar.f6997h;
                if (this.f7028f == null) {
                    Paint paint = new Paint(1);
                    this.f7028f = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f7028f;
                if (c0259b.m1717h()) {
                    Shader shaderM1716f = c0259b.m1716f();
                    shaderM1716f.setLocalMatrix(this.f7026d);
                    paint2.setShader(shaderM1716f);
                    paint2.setAlpha(Math.round(cVar.f6999j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C1070i.m6725a(c0259b.m1715e(), cVar.f6999j));
                }
                paint2.setColorFilter(colorFilter);
                this.f7025c.setFillType(cVar.f7021c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f7025c, paint2);
            }
            if (cVar.f6995f.m1721l()) {
                C0259b c0259b2 = cVar.f6995f;
                if (this.f7027e == null) {
                    Paint paint3 = new Paint(1);
                    this.f7027e = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f7027e;
                Paint.Join join = cVar.f7004o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f7003n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f7005p);
                if (c0259b2.m1717h()) {
                    Shader shaderM1716f2 = c0259b2.m1716f();
                    shaderM1716f2.setLocalMatrix(this.f7026d);
                    paint4.setShader(shaderM1716f2);
                    paint4.setAlpha(Math.round(cVar.f6998i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C1070i.m6725a(c0259b2.m1715e(), cVar.f6998i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f6996g * fMin * fM6751e);
                canvas.drawPath(this.f7025c, paint4);
            }
        }

        /* renamed from: e */
        private float m6751e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM6748a = m6748a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM6748a) / fMax;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m6752b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            m6749c(this.f7031i, f7023a, canvas, i2, i3, colorFilter);
        }

        /* renamed from: f */
        public boolean m6753f() {
            if (this.f7038p == null) {
                this.f7038p = Boolean.valueOf(this.f7031i.mo6741a());
            }
            return this.f7038p.booleanValue();
        }

        /* renamed from: g */
        public boolean m6754g(int[] iArr) {
            return this.f7031i.mo6742b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7036n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f7036n = i2;
        }

        public g(g gVar) {
            this.f7026d = new Matrix();
            this.f7032j = 0.0f;
            this.f7033k = 0.0f;
            this.f7034l = 0.0f;
            this.f7035m = 0.0f;
            this.f7036n = 255;
            this.f7037o = null;
            this.f7038p = null;
            C0867a<String, Object> c0867a = new C0867a<>();
            this.f7039q = c0867a;
            this.f7031i = new d(gVar.f7031i, c0867a);
            this.f7024b = new Path(gVar.f7024b);
            this.f7025c = new Path(gVar.f7025c);
            this.f7032j = gVar.f7032j;
            this.f7033k = gVar.f7033k;
            this.f7034l = gVar.f7034l;
            this.f7035m = gVar.f7035m;
            this.f7030h = gVar.f7030h;
            this.f7036n = gVar.f7036n;
            this.f7037o = gVar.f7037o;
            String str = gVar.f7037o;
            if (str != null) {
                c0867a.put(str, this);
            }
            this.f7038p = gVar.f7038p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: c.y.a.a.i$d */
    private static class d extends e {

        /* renamed from: a */
        final Matrix f7006a;

        /* renamed from: b */
        final ArrayList<e> f7007b;

        /* renamed from: c */
        float f7008c;

        /* renamed from: d */
        private float f7009d;

        /* renamed from: e */
        private float f7010e;

        /* renamed from: f */
        private float f7011f;

        /* renamed from: g */
        private float f7012g;

        /* renamed from: h */
        private float f7013h;

        /* renamed from: i */
        private float f7014i;

        /* renamed from: j */
        final Matrix f7015j;

        /* renamed from: k */
        int f7016k;

        /* renamed from: l */
        private int[] f7017l;

        /* renamed from: m */
        private String f7018m;

        public d(d dVar, C0867a<String, Object> c0867a) {
            f bVar;
            super();
            this.f7006a = new Matrix();
            this.f7007b = new ArrayList<>();
            this.f7008c = 0.0f;
            this.f7009d = 0.0f;
            this.f7010e = 0.0f;
            this.f7011f = 1.0f;
            this.f7012g = 1.0f;
            this.f7013h = 0.0f;
            this.f7014i = 0.0f;
            Matrix matrix = new Matrix();
            this.f7015j = matrix;
            this.f7018m = null;
            this.f7008c = dVar.f7008c;
            this.f7009d = dVar.f7009d;
            this.f7010e = dVar.f7010e;
            this.f7011f = dVar.f7011f;
            this.f7012g = dVar.f7012g;
            this.f7013h = dVar.f7013h;
            this.f7014i = dVar.f7014i;
            this.f7017l = dVar.f7017l;
            String str = dVar.f7018m;
            this.f7018m = str;
            this.f7016k = dVar.f7016k;
            if (str != null) {
                c0867a.put(str, this);
            }
            matrix.set(dVar.f7015j);
            ArrayList<e> arrayList = dVar.f7007b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f7007b.add(new d((d) eVar, c0867a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f7007b.add(bVar);
                    String str2 = bVar.f7020b;
                    if (str2 != null) {
                        c0867a.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6744d() {
            this.f7015j.reset();
            this.f7015j.postTranslate(-this.f7009d, -this.f7010e);
            this.f7015j.postScale(this.f7011f, this.f7012g);
            this.f7015j.postRotate(this.f7008c, 0.0f, 0.0f);
            this.f7015j.postTranslate(this.f7013h + this.f7009d, this.f7014i + this.f7010e);
        }

        /* renamed from: e */
        private void m6745e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f7017l = null;
            this.f7008c = C0264g.m1775j(typedArray, xmlPullParser, "rotation", 5, this.f7008c);
            this.f7009d = typedArray.getFloat(1, this.f7009d);
            this.f7010e = typedArray.getFloat(2, this.f7010e);
            this.f7011f = C0264g.m1775j(typedArray, xmlPullParser, "scaleX", 3, this.f7011f);
            this.f7012g = C0264g.m1775j(typedArray, xmlPullParser, "scaleY", 4, this.f7012g);
            this.f7013h = C0264g.m1775j(typedArray, xmlPullParser, "translateX", 6, this.f7013h);
            this.f7014i = C0264g.m1775j(typedArray, xmlPullParser, "translateY", 7, this.f7014i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7018m = string;
            }
            m6744d();
        }

        @Override // p024c.p089y.p090a.p091a.C1070i.e
        /* renamed from: a */
        public boolean mo6741a() {
            for (int i2 = 0; i2 < this.f7007b.size(); i2++) {
                if (this.f7007b.get(i2).mo6741a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p024c.p089y.p090a.p091a.C1070i.e
        /* renamed from: b */
        public boolean mo6742b(int[] iArr) {
            boolean zMo6742b = false;
            for (int i2 = 0; i2 < this.f7007b.size(); i2++) {
                zMo6742b |= this.f7007b.get(i2).mo6742b(iArr);
            }
            return zMo6742b;
        }

        /* renamed from: c */
        public void m6746c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM1784s = C0264g.m1784s(resources, theme, attributeSet, C1062a.f6955b);
            m6745e(typedArrayM1784s, xmlPullParser);
            typedArrayM1784s.recycle();
        }

        public String getGroupName() {
            return this.f7018m;
        }

        public Matrix getLocalMatrix() {
            return this.f7015j;
        }

        public float getPivotX() {
            return this.f7009d;
        }

        public float getPivotY() {
            return this.f7010e;
        }

        public float getRotation() {
            return this.f7008c;
        }

        public float getScaleX() {
            return this.f7011f;
        }

        public float getScaleY() {
            return this.f7012g;
        }

        public float getTranslateX() {
            return this.f7013h;
        }

        public float getTranslateY() {
            return this.f7014i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f7009d) {
                this.f7009d = f2;
                m6744d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f7010e) {
                this.f7010e = f2;
                m6744d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f7008c) {
                this.f7008c = f2;
                m6744d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f7011f) {
                this.f7011f = f2;
                m6744d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f7012g) {
                this.f7012g = f2;
                m6744d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f7013h) {
                this.f7013h = f2;
                m6744d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f7014i) {
                this.f7014i = f2;
                m6744d();
            }
        }

        public d() {
            super();
            this.f7006a = new Matrix();
            this.f7007b = new ArrayList<>();
            this.f7008c = 0.0f;
            this.f7009d = 0.0f;
            this.f7010e = 0.0f;
            this.f7011f = 1.0f;
            this.f7012g = 1.0f;
            this.f7013h = 0.0f;
            this.f7014i = 0.0f;
            this.f7015j = new Matrix();
            this.f7018m = null;
        }
    }
}
