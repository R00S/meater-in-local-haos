package U7;

import C7.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import i1.h;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f17645a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f17646b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f17647c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17648d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17650f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17651g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17652h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17653i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17654j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17655k;

    /* renamed from: l, reason: collision with root package name */
    public final float f17656l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f17657m;

    /* renamed from: n, reason: collision with root package name */
    private float f17658n;

    /* renamed from: o, reason: collision with root package name */
    private final int f17659o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17660p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f17661q;

    /* compiled from: TextAppearance.java */
    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f17662a;

        a(f fVar) {
            this.f17662a = fVar;
        }

        @Override // i1.h.e
        /* renamed from: h */
        public void f(int i10) {
            d.this.f17660p = true;
            this.f17662a.a(i10);
        }

        @Override // i1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f17661q = Typeface.create(typeface, dVar.f17649e);
            d.this.f17660p = true;
            this.f17662a.b(d.this.f17661q, false);
        }
    }

    /* compiled from: TextAppearance.java */
    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f17664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f17665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f17666c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f17664a = context;
            this.f17665b = textPaint;
            this.f17666c = fVar;
        }

        @Override // U7.f
        public void a(int i10) {
            this.f17666c.a(i10);
        }

        @Override // U7.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f17664a, this.f17665b, typeface);
            this.f17666c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, m.f3109x7);
        l(typedArrayObtainStyledAttributes.getDimension(m.f3119y7, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, m.f2608B7));
        this.f17645a = c.a(context, typedArrayObtainStyledAttributes, m.f2618C7);
        this.f17646b = c.a(context, typedArrayObtainStyledAttributes, m.f2628D7);
        this.f17649e = typedArrayObtainStyledAttributes.getInt(m.f2598A7, 0);
        this.f17650f = typedArrayObtainStyledAttributes.getInt(m.f3129z7, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, m.f2688J7, m.f2678I7);
        this.f17659o = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f17648d = typedArrayObtainStyledAttributes.getString(iG);
        this.f17651g = typedArrayObtainStyledAttributes.getBoolean(m.f2698K7, false);
        this.f17647c = c.a(context, typedArrayObtainStyledAttributes, m.f2638E7);
        this.f17652h = typedArrayObtainStyledAttributes.getFloat(m.f2648F7, 0.0f);
        this.f17653i = typedArrayObtainStyledAttributes.getFloat(m.f2658G7, 0.0f);
        this.f17654j = typedArrayObtainStyledAttributes.getFloat(m.f2668H7, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, m.f2775S4);
        int i11 = m.f2785T4;
        this.f17655k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f17656l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f17661q == null && (str = this.f17648d) != null) {
            this.f17661q = Typeface.create(str, this.f17649e);
        }
        if (this.f17661q == null) {
            int i10 = this.f17650f;
            if (i10 == 1) {
                this.f17661q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f17661q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f17661q = Typeface.DEFAULT;
            } else {
                this.f17661q = Typeface.MONOSPACE;
            }
            this.f17661q = Typeface.create(this.f17661q, this.f17649e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f17659o;
        return (i10 != 0 ? i1.h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f17661q;
    }

    public Typeface f(Context context) {
        if (this.f17660p) {
            return this.f17661q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = i1.h.g(context, this.f17659o);
                this.f17661q = typefaceG;
                if (typefaceG != null) {
                    this.f17661q = Typeface.create(typefaceG, this.f17649e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f17648d, e10);
            }
        }
        d();
        this.f17660p = true;
        return this.f17661q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f17659o;
        if (i10 == 0) {
            this.f17660p = true;
        }
        if (this.f17660p) {
            fVar.b(this.f17661q, true);
            return;
        }
        try {
            i1.h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f17660p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f17648d, e10);
            this.f17660p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f17657m;
    }

    public float j() {
        return this.f17658n;
    }

    public void k(ColorStateList colorStateList) {
        this.f17657m = colorStateList;
    }

    public void l(float f10) {
        this.f17658n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f17657m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f17654j;
        float f11 = this.f17652h;
        float f12 = this.f17653i;
        ColorStateList colorStateList2 = this.f17647c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f17649e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f17658n);
        if (this.f17655k) {
            textPaint.setLetterSpacing(this.f17656l);
        }
    }
}
