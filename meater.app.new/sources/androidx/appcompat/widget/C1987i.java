package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.P;
import j.C3699a;
import j1.C3718c;

/* compiled from: AppCompatDrawableManager.java */
/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987i {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f21703b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static C1987i f21704c;

    /* renamed from: a, reason: collision with root package name */
    private P f21705a;

    /* compiled from: AppCompatDrawableManager.java */
    /* renamed from: androidx.appcompat.widget.i$a */
    class a implements P.c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f21706a = {i.e.f42457R, i.e.f42455P, i.e.f42459a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f21707b = {i.e.f42473o, i.e.f42441B, i.e.f42478t, i.e.f42474p, i.e.f42475q, i.e.f42477s, i.e.f42476r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f21708c = {i.e.f42454O, i.e.f42456Q, i.e.f42469k, i.e.f42450K, i.e.f42451L, i.e.f42452M, i.e.f42453N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f21709d = {i.e.f42481w, i.e.f42467i, i.e.f42480v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f21710e = {i.e.f42449J, i.e.f42458S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f21711f = {i.e.f42461c, i.e.f42465g, i.e.f42462d, i.e.f42466h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = V.c(context, i.a.f42416w);
            return new ColorStateList(new int[][]{V.f21580b, V.f21583e, V.f21581c, V.f21587i}, new int[]{V.b(context, i.a.f42414u), C3718c.g(iC, i10), C3718c.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, V.c(context, i.a.f42413t));
        }

        private ColorStateList j(Context context) {
            return h(context, V.c(context, i.a.f42414u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = i.a.f42419z;
            ColorStateList colorStateListE = V.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = V.f21580b;
                iArr2[0] = V.b(context, i10);
                iArr[1] = V.f21584f;
                iArr2[1] = V.c(context, i.a.f42415v);
                iArr[2] = V.f21587i;
                iArr2[2] = V.c(context, i10);
            } else {
                int[] iArr3 = V.f21580b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = V.f21584f;
                iArr2[1] = V.c(context, i.a.f42415v);
                iArr[2] = V.f21587i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(P p10, Context context, int i10) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = p10.i(context, i.e.f42445F);
            Drawable drawableI2 = p10.i(context, i.e.f42446G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C1987i.f21703b;
            }
            drawableMutate.setColorFilter(C1987i.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.P.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C1987i.a()
                int[] r1 = r7.f21706a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = i.a.f42417x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f21708c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = i.a.f42415v
                goto L11
            L20:
                int[] r1 = r7.f21709d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = i.e.f42479u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = i.e.f42470l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L66
                android.graphics.drawable.Drawable r10 = r10.mutate()
                int r8 = androidx.appcompat.widget.V.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C1987i.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L65
                r10.setAlpha(r0)
            L65:
                return r2
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1987i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.P.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == i.e.f42447H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P.c
        public Drawable c(P p10, Context context, int i10) {
            if (i10 == i.e.f42468j) {
                return new LayerDrawable(new Drawable[]{p10.i(context, i.e.f42467i), p10.i(context, i.e.f42469k)});
            }
            if (i10 == i.e.f42483y) {
                return l(p10, context, i.d.f42437i);
            }
            if (i10 == i.e.f42482x) {
                return l(p10, context, i.d.f42438j);
            }
            if (i10 == i.e.f42484z) {
                return l(p10, context, i.d.f42439k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == i.e.f42471m) {
                return C3699a.a(context, i.c.f42425e);
            }
            if (i10 == i.e.f42448I) {
                return C3699a.a(context, i.c.f42428h);
            }
            if (i10 == i.e.f42447H) {
                return k(context);
            }
            if (i10 == i.e.f42464f) {
                return j(context);
            }
            if (i10 == i.e.f42460b) {
                return g(context);
            }
            if (i10 == i.e.f42463e) {
                return i(context);
            }
            if (i10 == i.e.f42443D || i10 == i.e.f42444E) {
                return C3699a.a(context, i.c.f42427g);
            }
            if (f(this.f21707b, i10)) {
                return V.e(context, i.a.f42417x);
            }
            if (f(this.f21710e, i10)) {
                return C3699a.a(context, i.c.f42424d);
            }
            if (f(this.f21711f, i10)) {
                return C3699a.a(context, i.c.f42423c);
            }
            if (i10 == i.e.f42440A) {
                return C3699a.a(context, i.c.f42426f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.P.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == i.e.f42442C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = i.a.f42417x;
                m(drawableFindDrawableByLayerId, V.c(context, i11), C1987i.f21703b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), V.c(context, i11), C1987i.f21703b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), V.c(context, i.a.f42415v), C1987i.f21703b);
                return true;
            }
            if (i10 != i.e.f42483y && i10 != i.e.f42482x && i10 != i.e.f42484z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), V.b(context, i.a.f42417x), C1987i.f21703b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = i.a.f42415v;
            m(drawableFindDrawableByLayerId2, V.c(context, i12), C1987i.f21703b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), V.c(context, i12), C1987i.f21703b);
            return true;
        }
    }

    public static synchronized C1987i b() {
        try {
            if (f21704c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21704c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return P.k(i10, mode);
    }

    public static synchronized void h() {
        if (f21704c == null) {
            C1987i c1987i = new C1987i();
            f21704c = c1987i;
            c1987i.f21705a = P.g();
            f21704c.f21705a.t(new a());
        }
    }

    static void i(Drawable drawable, Y y10, int[] iArr) {
        P.v(drawable, y10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f21705a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f21705a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f21705a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f21705a.r(context);
    }
}
