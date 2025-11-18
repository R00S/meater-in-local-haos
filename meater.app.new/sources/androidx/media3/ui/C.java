package androidx.media3.ui;

import X1.C1804a;
import X1.L;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import e3.C3185a;

/* compiled from: SubtitlePainter.java */
/* loaded from: classes.dex */
final class C {

    /* renamed from: A, reason: collision with root package name */
    private int f28075A;

    /* renamed from: B, reason: collision with root package name */
    private int f28076B;

    /* renamed from: C, reason: collision with root package name */
    private int f28077C;

    /* renamed from: D, reason: collision with root package name */
    private int f28078D;

    /* renamed from: E, reason: collision with root package name */
    private StaticLayout f28079E;

    /* renamed from: F, reason: collision with root package name */
    private StaticLayout f28080F;

    /* renamed from: G, reason: collision with root package name */
    private int f28081G;

    /* renamed from: H, reason: collision with root package name */
    private int f28082H;

    /* renamed from: I, reason: collision with root package name */
    private int f28083I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f28084J;

    /* renamed from: a, reason: collision with root package name */
    private final float f28085a;

    /* renamed from: b, reason: collision with root package name */
    private final float f28086b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28087c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28088d;

    /* renamed from: e, reason: collision with root package name */
    private final float f28089e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f28090f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f28091g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f28092h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f28093i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f28094j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f28095k;

    /* renamed from: l, reason: collision with root package name */
    private float f28096l;

    /* renamed from: m, reason: collision with root package name */
    private int f28097m;

    /* renamed from: n, reason: collision with root package name */
    private int f28098n;

    /* renamed from: o, reason: collision with root package name */
    private float f28099o;

    /* renamed from: p, reason: collision with root package name */
    private int f28100p;

    /* renamed from: q, reason: collision with root package name */
    private float f28101q;

    /* renamed from: r, reason: collision with root package name */
    private float f28102r;

    /* renamed from: s, reason: collision with root package name */
    private int f28103s;

    /* renamed from: t, reason: collision with root package name */
    private int f28104t;

    /* renamed from: u, reason: collision with root package name */
    private int f28105u;

    /* renamed from: v, reason: collision with root package name */
    private int f28106v;

    /* renamed from: w, reason: collision with root package name */
    private int f28107w;

    /* renamed from: x, reason: collision with root package name */
    private float f28108x;

    /* renamed from: y, reason: collision with root package name */
    private float f28109y;

    /* renamed from: z, reason: collision with root package name */
    private float f28110z;

    public C(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f28089e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f28088d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f28085a = fRound;
        this.f28086b = fRound;
        this.f28087c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f28090f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f28091g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f28092h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f28095k, (Rect) null, this.f28084J, this.f28092h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        C1804a.e(this.f28084J);
        C1804a.e(this.f28095k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.f28079E;
        StaticLayout staticLayout2 = this.f28080F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f28081G, this.f28082H);
        if (Color.alpha(this.f28105u) > 0) {
            this.f28091g.setColor(this.f28105u);
            canvas.drawRect(-this.f28083I, 0.0f, staticLayout.getWidth() + this.f28083I, staticLayout.getHeight(), this.f28091g);
        }
        int i10 = this.f28107w;
        if (i10 == 1) {
            this.f28090f.setStrokeJoin(Paint.Join.ROUND);
            this.f28090f.setStrokeWidth(this.f28085a);
            this.f28090f.setColor(this.f28106v);
            this.f28090f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f28090f;
            float f10 = this.f28086b;
            float f11 = this.f28087c;
            textPaint.setShadowLayer(f10, f11, f11, this.f28106v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f28106v;
            int i12 = z10 ? this.f28106v : -1;
            float f12 = this.f28086b / 2.0f;
            this.f28090f.setColor(this.f28103s);
            this.f28090f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f28090f.setShadowLayer(this.f28086b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f28090f.setShadowLayer(this.f28086b, f12, f12, i12);
        }
        this.f28090f.setColor(this.f28103s);
        this.f28090f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f28090f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f28095k
            int r1 = r7.f28077C
            int r2 = r7.f28075A
            int r1 = r1 - r2
            int r3 = r7.f28078D
            int r4 = r7.f28076B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f28099o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f28096l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f28101q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f28102r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f28100p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f28098n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f28084J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C.g():void");
    }

    public void b(W1.a aVar, C3185a c3185a, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = aVar.f18302d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(aVar.f18299a)) {
            return;
        } else {
            i14 = aVar.f18310l ? aVar.f18311m : c3185a.f40405c;
        }
        if (a(this.f28093i, aVar.f18299a) && L.d(this.f28094j, aVar.f18300b) && this.f28095k == aVar.f18302d && this.f28096l == aVar.f18303e && this.f28097m == aVar.f18304f && L.d(Integer.valueOf(this.f28098n), Integer.valueOf(aVar.f18305g)) && this.f28099o == aVar.f18306h && L.d(Integer.valueOf(this.f28100p), Integer.valueOf(aVar.f18307i)) && this.f28101q == aVar.f18308j && this.f28102r == aVar.f18309k && this.f28103s == c3185a.f40403a && this.f28104t == c3185a.f40404b && this.f28105u == i14 && this.f28107w == c3185a.f40406d && this.f28106v == c3185a.f40407e && L.d(this.f28090f.getTypeface(), c3185a.f40408f) && this.f28108x == f10 && this.f28109y == f11 && this.f28110z == f12 && this.f28075A == i10 && this.f28076B == i11 && this.f28077C == i12 && this.f28078D == i13) {
            d(canvas, z10);
            return;
        }
        this.f28093i = aVar.f18299a;
        this.f28094j = aVar.f18300b;
        this.f28095k = aVar.f18302d;
        this.f28096l = aVar.f18303e;
        this.f28097m = aVar.f18304f;
        this.f28098n = aVar.f18305g;
        this.f28099o = aVar.f18306h;
        this.f28100p = aVar.f18307i;
        this.f28101q = aVar.f18308j;
        this.f28102r = aVar.f18309k;
        this.f28103s = c3185a.f40403a;
        this.f28104t = c3185a.f40404b;
        this.f28105u = i14;
        this.f28107w = c3185a.f40406d;
        this.f28106v = c3185a.f40407e;
        this.f28090f.setTypeface(c3185a.f40408f);
        this.f28108x = f10;
        this.f28109y = f11;
        this.f28110z = f12;
        this.f28075A = i10;
        this.f28076B = i11;
        this.f28077C = i12;
        this.f28078D = i13;
        if (z10) {
            C1804a.e(this.f28093i);
            g();
        } else {
            C1804a.e(this.f28095k);
            f();
        }
        d(canvas, z10);
    }
}
