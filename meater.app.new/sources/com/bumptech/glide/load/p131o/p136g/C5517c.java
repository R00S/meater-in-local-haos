package com.bumptech.glide.load.p131o.p136g;

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
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.p131o.p136g.C5521g;
import com.bumptech.glide.p122l.InterfaceC5360a;
import com.bumptech.glide.p145r.C5596j;
import java.nio.ByteBuffer;
import java.util.List;
import p024c.p089y.p090a.p091a.AbstractC1063b;

/* compiled from: GifDrawable.java */
/* renamed from: com.bumptech.glide.load.o.g.c */
/* loaded from: classes.dex */
public class C5517c extends Drawable implements C5521g.b, Animatable {

    /* renamed from: f */
    private final a f13804f;

    /* renamed from: g */
    private boolean f13805g;

    /* renamed from: h */
    private boolean f13806h;

    /* renamed from: i */
    private boolean f13807i;

    /* renamed from: j */
    private boolean f13808j;

    /* renamed from: k */
    private int f13809k;

    /* renamed from: l */
    private int f13810l;

    /* renamed from: m */
    private boolean f13811m;

    /* renamed from: n */
    private Paint f13812n;

    /* renamed from: o */
    private Rect f13813o;

    /* renamed from: p */
    private List<AbstractC1063b> f13814p;

    /* compiled from: GifDrawable.java */
    /* renamed from: com.bumptech.glide.load.o.g.c$a */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        final C5521g f13815a;

        a(C5521g c5521g) {
            this.f13815a = c5521g;
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
            return new C5517c(this);
        }
    }

    public C5517c(Context context, InterfaceC5360a interfaceC5360a, InterfaceC5429l<Bitmap> interfaceC5429l, int i2, int i3, Bitmap bitmap) {
        this(new a(new C5521g(ComponentCallbacks2C5349c.m9972c(context), interfaceC5360a, i2, i3, interfaceC5429l, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private Drawable.Callback m10732b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: d */
    private Rect m10733d() {
        if (this.f13813o == null) {
            this.f13813o = new Rect();
        }
        return this.f13813o;
    }

    /* renamed from: h */
    private Paint m10734h() {
        if (this.f13812n == null) {
            this.f13812n = new Paint(2);
        }
        return this.f13812n;
    }

    /* renamed from: j */
    private void m10735j() {
        List<AbstractC1063b> list = this.f13814p;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f13814p.get(i2).m6693a(this);
            }
        }
    }

    /* renamed from: l */
    private void m10736l() {
        this.f13809k = 0;
    }

    /* renamed from: n */
    private void m10737n() {
        C5596j.m11039a(!this.f13807i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f13804f.f13815a.m10760f() == 1) {
            invalidateSelf();
        } else {
            if (this.f13805g) {
                return;
            }
            this.f13805g = true;
            this.f13804f.f13815a.m10766s(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    private void m10738o() {
        this.f13805g = false;
        this.f13804f.f13815a.m10767t(this);
    }

    @Override // com.bumptech.glide.load.p131o.p136g.C5521g.b
    /* renamed from: a */
    public void mo10739a() {
        if (m10732b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m10743g() == m10742f() - 1) {
            this.f13809k++;
        }
        int i2 = this.f13810l;
        if (i2 == -1 || this.f13809k < i2) {
            return;
        }
        m10735j();
        stop();
    }

    /* renamed from: c */
    public ByteBuffer m10740c() {
        return this.f13804f.f13815a.m10756b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f13807i) {
            return;
        }
        if (this.f13811m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m10733d());
            this.f13811m = false;
        }
        canvas.drawBitmap(this.f13804f.f13815a.m10757c(), (Rect) null, m10733d(), m10734h());
    }

    /* renamed from: e */
    public Bitmap m10741e() {
        return this.f13804f.f13815a.m10759e();
    }

    /* renamed from: f */
    public int m10742f() {
        return this.f13804f.f13815a.m10760f();
    }

    /* renamed from: g */
    public int m10743g() {
        return this.f13804f.f13815a.m10758d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f13804f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f13804f.f13815a.m10761i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f13804f.f13815a.m10763l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* renamed from: i */
    public int m10744i() {
        return this.f13804f.f13815a.m10762k();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f13805g;
    }

    /* renamed from: k */
    public void m10745k() {
        this.f13807i = true;
        this.f13804f.f13815a.m10755a();
    }

    /* renamed from: m */
    public void m10746m(InterfaceC5429l<Bitmap> interfaceC5429l, Bitmap bitmap) {
        this.f13804f.f13815a.m10765p(interfaceC5429l, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13811m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        m10734h().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m10734h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C5596j.m11039a(!this.f13807i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f13808j = z;
        if (!z) {
            m10738o();
        } else if (this.f13806h) {
            m10737n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f13806h = true;
        m10736l();
        if (this.f13808j) {
            m10737n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f13806h = false;
        m10738o();
    }

    C5517c(a aVar) {
        this.f13808j = true;
        this.f13810l = -1;
        this.f13804f = (a) C5596j.m11042d(aVar);
    }
}
