package p241e.p254e.p256b.p271c.p285x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p003d.C0263f;
import p241e.p254e.p256b.p271c.C8918l;

/* compiled from: TextAppearance.java */
/* renamed from: e.e.b.c.x.d */
/* loaded from: classes2.dex */
public class C8948d {

    /* renamed from: a */
    public final float f34426a;

    /* renamed from: b */
    public final ColorStateList f34427b;

    /* renamed from: c */
    public final ColorStateList f34428c;

    /* renamed from: d */
    public final ColorStateList f34429d;

    /* renamed from: e */
    public final int f34430e;

    /* renamed from: f */
    public final int f34431f;

    /* renamed from: g */
    public final String f34432g;

    /* renamed from: h */
    public final boolean f34433h;

    /* renamed from: i */
    public final ColorStateList f34434i;

    /* renamed from: j */
    public final float f34435j;

    /* renamed from: k */
    public final float f34436k;

    /* renamed from: l */
    public final float f34437l;

    /* renamed from: m */
    private final int f34438m;

    /* renamed from: n */
    private boolean f34439n = false;

    /* renamed from: o */
    private Typeface f34440o;

    /* compiled from: TextAppearance.java */
    /* renamed from: e.e.b.c.x.d$a */
    class a extends C0263f.c {

        /* renamed from: a */
        final /* synthetic */ AbstractC8950f f34441a;

        a(AbstractC8950f abstractC8950f) {
            this.f34441a = abstractC8950f;
        }

        @Override // androidx.core.content.p003d.C0263f.c
        /* renamed from: d */
        public void mo1177d(int i2) {
            C8948d.this.f34439n = true;
            this.f34441a.mo24151a(i2);
        }

        @Override // androidx.core.content.p003d.C0263f.c
        /* renamed from: e */
        public void mo1178e(Typeface typeface) {
            C8948d c8948d = C8948d.this;
            c8948d.f34440o = Typeface.create(typeface, c8948d.f34430e);
            C8948d.this.f34439n = true;
            this.f34441a.mo24152b(C8948d.this.f34440o, false);
        }
    }

    /* compiled from: TextAppearance.java */
    /* renamed from: e.e.b.c.x.d$b */
    class b extends AbstractC8950f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f34443a;

        /* renamed from: b */
        final /* synthetic */ AbstractC8950f f34444b;

        b(TextPaint textPaint, AbstractC8950f abstractC8950f) {
            this.f34443a = textPaint;
            this.f34444b = abstractC8950f;
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: a */
        public void mo24151a(int i2) {
            this.f34444b.mo24151a(i2);
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: b */
        public void mo24152b(Typeface typeface, boolean z) {
            C8948d.this.m28515k(this.f34443a, typeface);
            this.f34444b.mo24152b(typeface, z);
        }
    }

    public C8948d(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C8918l.f34354x4);
        this.f34426a = typedArrayObtainStyledAttributes.getDimension(C8918l.f34361y4, 0.0f);
        this.f34427b = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34012B4);
        this.f34428c = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34019C4);
        this.f34429d = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34026D4);
        this.f34430e = typedArrayObtainStyledAttributes.getInt(C8918l.f34005A4, 0);
        this.f34431f = typedArrayObtainStyledAttributes.getInt(C8918l.f34368z4, 1);
        int iM28503e = C8947c.m28503e(typedArrayObtainStyledAttributes, C8918l.f34068J4, C8918l.f34061I4);
        this.f34438m = typedArrayObtainStyledAttributes.getResourceId(iM28503e, 0);
        this.f34432g = typedArrayObtainStyledAttributes.getString(iM28503e);
        this.f34433h = typedArrayObtainStyledAttributes.getBoolean(C8918l.f34075K4, false);
        this.f34434i = C8947c.m28499a(context, typedArrayObtainStyledAttributes, C8918l.f34033E4);
        this.f34435j = typedArrayObtainStyledAttributes.getFloat(C8918l.f34040F4, 0.0f);
        this.f34436k = typedArrayObtainStyledAttributes.getFloat(C8918l.f34047G4, 0.0f);
        this.f34437l = typedArrayObtainStyledAttributes.getFloat(C8918l.f34054H4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m28508d() {
        String str;
        if (this.f34440o == null && (str = this.f34432g) != null) {
            this.f34440o = Typeface.create(str, this.f34430e);
        }
        if (this.f34440o == null) {
            int i2 = this.f34431f;
            if (i2 == 1) {
                this.f34440o = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f34440o = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f34440o = Typeface.DEFAULT;
            } else {
                this.f34440o = Typeface.MONOSPACE;
            }
            this.f34440o = Typeface.create(this.f34440o, this.f34430e);
        }
    }

    /* renamed from: e */
    public Typeface m28509e() {
        m28508d();
        return this.f34440o;
    }

    /* renamed from: f */
    public Typeface m28510f(Context context) {
        if (this.f34439n) {
            return this.f34440o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1752e = C0263f.m1752e(context, this.f34438m);
                this.f34440o = typefaceM1752e;
                if (typefaceM1752e != null) {
                    this.f34440o = Typeface.create(typefaceM1752e, this.f34430e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f34432g, e2);
            }
        }
        m28508d();
        this.f34439n = true;
        return this.f34440o;
    }

    /* renamed from: g */
    public void m28511g(Context context, TextPaint textPaint, AbstractC8950f abstractC8950f) {
        m28515k(textPaint, m28509e());
        m28512h(context, new b(textPaint, abstractC8950f));
    }

    /* renamed from: h */
    public void m28512h(Context context, AbstractC8950f abstractC8950f) {
        if (C8949e.m28516a()) {
            m28510f(context);
        } else {
            m28508d();
        }
        int i2 = this.f34438m;
        if (i2 == 0) {
            this.f34439n = true;
        }
        if (this.f34439n) {
            abstractC8950f.mo24152b(this.f34440o, true);
            return;
        }
        try {
            C0263f.m1754g(context, i2, new a(abstractC8950f), null);
        } catch (Resources.NotFoundException unused) {
            this.f34439n = true;
            abstractC8950f.mo24151a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f34432g, e2);
            this.f34439n = true;
            abstractC8950f.mo24151a(-3);
        }
    }

    /* renamed from: i */
    public void m28513i(Context context, TextPaint textPaint, AbstractC8950f abstractC8950f) {
        m28514j(context, textPaint, abstractC8950f);
        ColorStateList colorStateList = this.f34427b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f34437l;
        float f3 = this.f34435j;
        float f4 = this.f34436k;
        ColorStateList colorStateList2 = this.f34434i;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void m28514j(Context context, TextPaint textPaint, AbstractC8950f abstractC8950f) {
        if (C8949e.m28516a()) {
            m28515k(textPaint, m28510f(context));
        } else {
            m28511g(context, textPaint, abstractC8950f);
        }
    }

    /* renamed from: k */
    public void m28515k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f34430e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f34426a);
    }
}
