package y6;

import H6.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import l6.InterfaceC3902a;
import m6.InterfaceC3976k;
import y6.g;

/* compiled from: GifDrawable.java */
/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5131c extends Drawable implements g.b, Animatable {

    /* renamed from: B, reason: collision with root package name */
    private final a f53152B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f53153C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f53154D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f53155E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f53156F;

    /* renamed from: G, reason: collision with root package name */
    private int f53157G;

    /* renamed from: H, reason: collision with root package name */
    private int f53158H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f53159I;

    /* renamed from: J, reason: collision with root package name */
    private Paint f53160J;

    /* renamed from: K, reason: collision with root package name */
    private Rect f53161K;

    /* renamed from: L, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f53162L;

    /* compiled from: GifDrawable.java */
    /* renamed from: y6.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f53163a;

        a(g gVar) {
            this.f53163a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5131c(this);
        }
    }

    public C5131c(Context context, InterfaceC3902a interfaceC3902a, InterfaceC3976k<Bitmap> interfaceC3976k, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), interfaceC3902a, i10, i11, interfaceC3976k, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f53161K == null) {
            this.f53161K = new Rect();
        }
        return this.f53161K;
    }

    private Paint h() {
        if (this.f53160J == null) {
            this.f53160J = new Paint(2);
        }
        return this.f53160J;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f53162L;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f53162L.get(i10).b(this);
            }
        }
    }

    private void l() {
        this.f53157G = 0;
    }

    private void n() {
        k.a(!this.f53155E, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f53152B.f53163a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f53153C) {
                return;
            }
            this.f53153C = true;
            this.f53152B.f53163a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f53153C = false;
        this.f53152B.f53163a.s(this);
    }

    @Override // y6.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f53157G++;
        }
        int i10 = this.f53158H;
        if (i10 == -1 || this.f53157G < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f53152B.f53163a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f53155E) {
            return;
        }
        if (this.f53159I) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f53159I = false;
        }
        canvas.drawBitmap(this.f53152B.f53163a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f53152B.f53163a.e();
    }

    public int f() {
        return this.f53152B.f53163a.f();
    }

    public int g() {
        return this.f53152B.f53163a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f53152B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53152B.f53163a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53152B.f53163a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f53152B.f53163a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f53153C;
    }

    public void k() {
        this.f53155E = true;
        this.f53152B.f53163a.a();
    }

    public void m(InterfaceC3976k<Bitmap> interfaceC3976k, Bitmap bitmap) {
        this.f53152B.f53163a.o(interfaceC3976k, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f53159I = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f53155E, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f53156F = z10;
        if (!z10) {
            o();
        } else if (this.f53154D) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f53154D = true;
        l();
        if (this.f53156F) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f53154D = false;
        o();
    }

    C5131c(a aVar) {
        this.f53156F = true;
        this.f53158H = -1;
        this.f53152B = (a) k.d(aVar);
    }
}
