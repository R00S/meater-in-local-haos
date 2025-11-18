package p024c.p025a.p028l.p029a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0265a;

/* compiled from: DrawableContainer.java */
/* renamed from: c.a.l.a.b */
/* loaded from: classes.dex */
class C0835b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private c f5478f;

    /* renamed from: g */
    private Rect f5479g;

    /* renamed from: h */
    private Drawable f5480h;

    /* renamed from: i */
    private Drawable f5481i;

    /* renamed from: k */
    private boolean f5483k;

    /* renamed from: m */
    private boolean f5485m;

    /* renamed from: n */
    private Runnable f5486n;

    /* renamed from: o */
    private long f5487o;

    /* renamed from: p */
    private long f5488p;

    /* renamed from: q */
    private b f5489q;

    /* renamed from: j */
    private int f5482j = 255;

    /* renamed from: l */
    private int f5484l = -1;

    /* compiled from: DrawableContainer.java */
    /* renamed from: c.a.l.a.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0835b.this.m5296a(true);
            C0835b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer.java */
    /* renamed from: c.a.l.a.b$b */
    static class b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f5491f;

        b() {
        }

        /* renamed from: a */
        public Drawable.Callback m5300a() {
            Drawable.Callback callback = this.f5491f;
            this.f5491f = null;
            return callback;
        }

        /* renamed from: b */
        public b m5301b(Drawable.Callback callback) {
            this.f5491f = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f5491f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f5491f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer.java */
    /* renamed from: c.a.l.a.b$c */
    static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        int f5492A;

        /* renamed from: B */
        int f5493B;

        /* renamed from: C */
        boolean f5494C;

        /* renamed from: D */
        ColorFilter f5495D;

        /* renamed from: E */
        boolean f5496E;

        /* renamed from: F */
        ColorStateList f5497F;

        /* renamed from: G */
        PorterDuff.Mode f5498G;

        /* renamed from: H */
        boolean f5499H;

        /* renamed from: I */
        boolean f5500I;

        /* renamed from: a */
        final C0835b f5501a;

        /* renamed from: b */
        Resources f5502b;

        /* renamed from: c */
        int f5503c;

        /* renamed from: d */
        int f5504d;

        /* renamed from: e */
        int f5505e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f5506f;

        /* renamed from: g */
        Drawable[] f5507g;

        /* renamed from: h */
        int f5508h;

        /* renamed from: i */
        boolean f5509i;

        /* renamed from: j */
        boolean f5510j;

        /* renamed from: k */
        Rect f5511k;

        /* renamed from: l */
        boolean f5512l;

        /* renamed from: m */
        boolean f5513m;

        /* renamed from: n */
        int f5514n;

        /* renamed from: o */
        int f5515o;

        /* renamed from: p */
        int f5516p;

        /* renamed from: q */
        int f5517q;

        /* renamed from: r */
        boolean f5518r;

        /* renamed from: s */
        int f5519s;

        /* renamed from: t */
        boolean f5520t;

        /* renamed from: u */
        boolean f5521u;

        /* renamed from: v */
        boolean f5522v;

        /* renamed from: w */
        boolean f5523w;

        /* renamed from: x */
        boolean f5524x;

        /* renamed from: y */
        boolean f5525y;

        /* renamed from: z */
        int f5526z;

        c(c cVar, C0835b c0835b, Resources resources) {
            this.f5503c = 160;
            this.f5509i = false;
            this.f5512l = false;
            this.f5524x = true;
            this.f5492A = 0;
            this.f5493B = 0;
            this.f5501a = c0835b;
            this.f5502b = resources != null ? resources : cVar != null ? cVar.f5502b : null;
            int iM5295f = C0835b.m5295f(resources, cVar != null ? cVar.f5503c : 0);
            this.f5503c = iM5295f;
            if (cVar == null) {
                this.f5507g = new Drawable[10];
                this.f5508h = 0;
                return;
            }
            this.f5504d = cVar.f5504d;
            this.f5505e = cVar.f5505e;
            this.f5522v = true;
            this.f5523w = true;
            this.f5509i = cVar.f5509i;
            this.f5512l = cVar.f5512l;
            this.f5524x = cVar.f5524x;
            this.f5525y = cVar.f5525y;
            this.f5526z = cVar.f5526z;
            this.f5492A = cVar.f5492A;
            this.f5493B = cVar.f5493B;
            this.f5494C = cVar.f5494C;
            this.f5495D = cVar.f5495D;
            this.f5496E = cVar.f5496E;
            this.f5497F = cVar.f5497F;
            this.f5498G = cVar.f5498G;
            this.f5499H = cVar.f5499H;
            this.f5500I = cVar.f5500I;
            if (cVar.f5503c == iM5295f) {
                if (cVar.f5510j) {
                    this.f5511k = new Rect(cVar.f5511k);
                    this.f5510j = true;
                }
                if (cVar.f5513m) {
                    this.f5514n = cVar.f5514n;
                    this.f5515o = cVar.f5515o;
                    this.f5516p = cVar.f5516p;
                    this.f5517q = cVar.f5517q;
                    this.f5513m = true;
                }
            }
            if (cVar.f5518r) {
                this.f5519s = cVar.f5519s;
                this.f5518r = true;
            }
            if (cVar.f5520t) {
                this.f5521u = cVar.f5521u;
                this.f5520t = true;
            }
            Drawable[] drawableArr = cVar.f5507g;
            this.f5507g = new Drawable[drawableArr.length];
            this.f5508h = cVar.f5508h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f5506f;
            if (sparseArray != null) {
                this.f5506f = sparseArray.clone();
            } else {
                this.f5506f = new SparseArray<>(this.f5508h);
            }
            int i2 = this.f5508h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                    if (constantState != null) {
                        this.f5506f.put(i3, constantState);
                    } else {
                        this.f5507g[i3] = drawableArr[i3];
                    }
                }
            }
        }

        /* renamed from: e */
        private void m5302e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f5506f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f5507g[this.f5506f.keyAt(i2)] = m5303s(this.f5506f.valueAt(i2).newDrawable(this.f5502b));
                }
                this.f5506f = null;
            }
        }

        /* renamed from: s */
        private Drawable m5303s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f5526z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f5501a);
            return drawableMutate;
        }

        /* renamed from: a */
        public final int m5304a(Drawable drawable) {
            int i2 = this.f5508h;
            if (i2 >= this.f5507g.length) {
                mo5317o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f5501a);
            this.f5507g[i2] = drawable;
            this.f5508h++;
            this.f5505e = drawable.getChangingConfigurations() | this.f5505e;
            m5318p();
            this.f5511k = null;
            this.f5510j = false;
            this.f5513m = false;
            this.f5522v = false;
            return i2;
        }

        /* renamed from: b */
        final void m5305b(Resources.Theme theme) {
            if (theme != null) {
                m5302e();
                int i2 = this.f5508h;
                Drawable[] drawableArr = this.f5507g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f5505e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                m5325y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean m5306c() {
            if (this.f5522v) {
                return this.f5523w;
            }
            m5302e();
            this.f5522v = true;
            int i2 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f5523w = false;
                    return false;
                }
            }
            this.f5523w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f5506f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m5307d() {
            this.f5513m = true;
            m5302e();
            int i2 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            this.f5515o = -1;
            this.f5514n = -1;
            this.f5517q = 0;
            this.f5516p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f5514n) {
                    this.f5514n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f5515o) {
                    this.f5515o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f5516p) {
                    this.f5516p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f5517q) {
                    this.f5517q = minimumHeight;
                }
            }
        }

        /* renamed from: f */
        final int m5308f() {
            return this.f5507g.length;
        }

        /* renamed from: g */
        public final Drawable m5309g(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f5507g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f5506f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableM5303s = m5303s(this.f5506f.valueAt(iIndexOfKey).newDrawable(this.f5502b));
            this.f5507g[i2] = drawableM5303s;
            this.f5506f.removeAt(iIndexOfKey);
            if (this.f5506f.size() == 0) {
                this.f5506f = null;
            }
            return drawableM5303s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5504d | this.f5505e;
        }

        /* renamed from: h */
        public final int m5310h() {
            return this.f5508h;
        }

        /* renamed from: i */
        public final int m5311i() {
            if (!this.f5513m) {
                m5307d();
            }
            return this.f5515o;
        }

        /* renamed from: j */
        public final int m5312j() {
            if (!this.f5513m) {
                m5307d();
            }
            return this.f5517q;
        }

        /* renamed from: k */
        public final int m5313k() {
            if (!this.f5513m) {
                m5307d();
            }
            return this.f5516p;
        }

        /* renamed from: l */
        public final Rect m5314l() {
            Rect rect = null;
            if (this.f5509i) {
                return null;
            }
            Rect rect2 = this.f5511k;
            if (rect2 != null || this.f5510j) {
                return rect2;
            }
            m5302e();
            Rect rect3 = new Rect();
            int i2 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f5510j = true;
            this.f5511k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m5315m() {
            if (!this.f5513m) {
                m5307d();
            }
            return this.f5514n;
        }

        /* renamed from: n */
        public final int m5316n() {
            if (this.f5518r) {
                return this.f5519s;
            }
            m5302e();
            int i2 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f5519s = opacity;
            this.f5518r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo5317o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f5507g, 0, drawableArr, 0, i2);
            this.f5507g = drawableArr;
        }

        /* renamed from: p */
        void m5318p() {
            this.f5518r = false;
            this.f5520t = false;
        }

        /* renamed from: q */
        public final boolean m5319q() {
            return this.f5512l;
        }

        /* renamed from: r */
        abstract void mo5288r();

        /* renamed from: t */
        public final void m5320t(boolean z) {
            this.f5512l = z;
        }

        /* renamed from: u */
        public final void m5321u(int i2) {
            this.f5492A = i2;
        }

        /* renamed from: v */
        public final void m5322v(int i2) {
            this.f5493B = i2;
        }

        /* renamed from: w */
        final boolean m5323w(int i2, int i3) {
            int i4 = this.f5508h;
            Drawable[] drawableArr = this.f5507g;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z = layoutDirection;
                    }
                }
            }
            this.f5526z = i2;
            return z;
        }

        /* renamed from: x */
        public final void m5324x(boolean z) {
            this.f5509i = z;
        }

        /* renamed from: y */
        final void m5325y(Resources resources) {
            if (resources != null) {
                this.f5502b = resources;
                int iM5295f = C0835b.m5295f(resources, this.f5503c);
                int i2 = this.f5503c;
                this.f5503c = iM5295f;
                if (i2 != iM5295f) {
                    this.f5513m = false;
                    this.f5510j = false;
                }
            }
        }
    }

    C0835b() {
    }

    /* renamed from: d */
    private void m5293d(Drawable drawable) {
        if (this.f5489q == null) {
            this.f5489q = new b();
        }
        drawable.setCallback(this.f5489q.m5301b(drawable.getCallback()));
        try {
            if (this.f5478f.f5492A <= 0 && this.f5483k) {
                drawable.setAlpha(this.f5482j);
            }
            c cVar = this.f5478f;
            if (cVar.f5496E) {
                drawable.setColorFilter(cVar.f5495D);
            } else {
                if (cVar.f5499H) {
                    C0265a.m1818o(drawable, cVar.f5497F);
                }
                c cVar2 = this.f5478f;
                if (cVar2.f5500I) {
                    C0265a.m1819p(drawable, cVar2.f5498G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f5478f.f5524x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i2 >= 19) {
                drawable.setAutoMirrored(this.f5478f.f5494C);
            }
            Rect rect = this.f5479g;
            if (i2 >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f5489q.m5300a());
        }
    }

    /* renamed from: e */
    private boolean m5294e() {
        return isAutoMirrored() && C0265a.m1809f(this) == 1;
    }

    /* renamed from: f */
    static int m5295f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m5296a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f5483k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f5480h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f5487o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f5482j
            r3.setAlpha(r9)
            r13.f5487o = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            c.a.l.a.b$c r9 = r13.f5478f
            int r9 = r9.f5492A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f5482j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f5487o = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f5481i
            if (r9 == 0) goto L65
            long r10 = r13.f5488p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f5481i = r0
            r13.f5488p = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            c.a.l.a.b$c r4 = r13.f5478f
            int r4 = r4.f5493B
            int r3 = r3 / r4
            int r4 = r13.f5482j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f5488p = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f5486n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p025a.p028l.p029a.C0835b.m5296a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f5478f.m5305b(theme);
    }

    /* renamed from: b */
    c mo5273b() {
        throw null;
    }

    /* renamed from: c */
    int m5297c() {
        return this.f5484l;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f5478f.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f5481i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m5298g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f5484l
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            c.a.l.a.b$c r0 = r9.f5478f
            int r0 = r0.f5493B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f5481i
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f5480h
            if (r0 == 0) goto L29
            r9.f5481i = r0
            c.a.l.a.b$c r0 = r9.f5478f
            int r0 = r0.f5493B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f5488p = r0
            goto L35
        L29:
            r9.f5481i = r4
            r9.f5488p = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f5480h
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            c.a.l.a.b$c r0 = r9.f5478f
            int r1 = r0.f5508h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m5309g(r10)
            r9.f5480h = r0
            r9.f5484l = r10
            if (r0 == 0) goto L5a
            c.a.l.a.b$c r10 = r9.f5478f
            int r10 = r10.f5492A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f5487o = r2
        L51:
            r9.m5293d(r0)
            goto L5a
        L55:
            r9.f5480h = r4
            r10 = -1
            r9.f5484l = r10
        L5a:
            long r0 = r9.f5487o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f5488p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f5486n
            if (r0 != 0) goto L73
            c.a.l.a.b$a r0 = new c.a.l.a.b$a
            r0.<init>()
            r9.f5486n = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m5296a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p025a.p028l.p029a.C0835b.m5298g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5482j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f5478f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f5478f.m5306c()) {
            return null;
        }
        this.f5478f.f5504d = getChangingConfigurations();
        return this.f5478f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f5480h;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f5479g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f5478f.m5319q()) {
            return this.f5478f.m5311i();
        }
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f5478f.m5319q()) {
            return this.f5478f.m5315m();
        }
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f5478f.m5319q()) {
            return this.f5478f.m5312j();
        }
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f5478f.m5319q()) {
            return this.f5478f.m5313k();
        }
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5480h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f5478f.m5316n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM5314l = this.f5478f.m5314l();
        if (rectM5314l != null) {
            rect.set(rectM5314l);
            padding = (rectM5314l.right | ((rectM5314l.left | rectM5314l.top) | rectM5314l.bottom)) != 0;
        } else {
            Drawable drawable = this.f5480h;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m5294e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    /* renamed from: h */
    void mo5274h(c cVar) {
        this.f5478f = cVar;
        int i2 = this.f5484l;
        if (i2 >= 0) {
            Drawable drawableM5309g = cVar.m5309g(i2);
            this.f5480h = drawableM5309g;
            if (drawableM5309g != null) {
                m5293d(drawableM5309g);
            }
        }
        this.f5481i = null;
    }

    /* renamed from: i */
    final void m5299i(Resources resources) {
        this.f5478f.m5325y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f5478f;
        if (cVar != null) {
            cVar.m5318p();
        }
        if (drawable != this.f5480h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f5478f.f5494C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f5481i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f5481i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f5480h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f5483k) {
                this.f5480h.setAlpha(this.f5482j);
            }
        }
        if (this.f5488p != 0) {
            this.f5488p = 0L;
            z = true;
        }
        if (this.f5487o != 0) {
            this.f5487o = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5485m && super.mutate() == this) {
            c cVarMo5273b = mo5273b();
            cVarMo5273b.mo5288r();
            mo5274h(cVarMo5273b);
            this.f5485m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5481i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5480h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f5478f.m5323w(i2, m5297c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f5481i;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f5480h;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5481i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f5480h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f5480h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f5483k && this.f5482j == i2) {
            return;
        }
        this.f5483k = true;
        this.f5482j = i2;
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            if (this.f5487o == 0) {
                drawable.setAlpha(i2);
            } else {
                m5296a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f5478f;
        if (cVar.f5494C != z) {
            cVar.f5494C = z;
            Drawable drawable = this.f5480h;
            if (drawable != null) {
                C0265a.m1813j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f5478f;
        cVar.f5496E = true;
        if (cVar.f5495D != colorFilter) {
            cVar.f5495D = colorFilter;
            Drawable drawable = this.f5480h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f5478f;
        if (cVar.f5524x != z) {
            cVar.f5524x = z;
            Drawable drawable = this.f5480h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            C0265a.m1814k(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f5479g;
        if (rect == null) {
            this.f5479g = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f5480h;
        if (drawable != null) {
            C0265a.m1815l(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f5478f;
        cVar.f5499H = true;
        if (cVar.f5497F != colorStateList) {
            cVar.f5497F = colorStateList;
            C0265a.m1818o(this.f5480h, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0266b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5478f;
        cVar.f5500I = true;
        if (cVar.f5498G != mode) {
            cVar.f5498G = mode;
            C0265a.m1819p(this.f5480h, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f5481i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f5480h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f5480h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
