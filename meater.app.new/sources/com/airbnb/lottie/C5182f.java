package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.p111r.C5227a;
import com.airbnb.lottie.p111r.C5228b;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p115k.C5269b;
import com.airbnb.lottie.p117u.C5307s;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.ChoreographerFrameCallbackC5317c;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: LottieDrawable.java */
/* renamed from: com.airbnb.lottie.f */
/* loaded from: classes.dex */
public class C5182f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: f */
    private static final String f12354f = C5182f.class.getSimpleName();

    /* renamed from: g */
    private final Matrix f12355g = new Matrix();

    /* renamed from: h */
    private C5180d f12356h;

    /* renamed from: i */
    private final ChoreographerFrameCallbackC5317c f12357i;

    /* renamed from: j */
    private float f12358j;

    /* renamed from: k */
    private final Set<?> f12359k;

    /* renamed from: l */
    private final ArrayList<j> f12360l;

    /* renamed from: m */
    private C5228b f12361m;

    /* renamed from: n */
    private String f12362n;

    /* renamed from: o */
    private InterfaceC5178b f12363o;

    /* renamed from: p */
    private C5227a f12364p;

    /* renamed from: q */
    C5177a f12365q;

    /* renamed from: r */
    C5192p f12366r;

    /* renamed from: s */
    private boolean f12367s;

    /* renamed from: t */
    private C5269b f12368t;

    /* renamed from: u */
    private int f12369u;

    /* renamed from: v */
    private boolean f12370v;

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$a */
    class a implements j {

        /* renamed from: a */
        final /* synthetic */ int f12371a;

        a(int i2) {
            this.f12371a = i2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9447H(this.f12371a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$b */
    class b implements j {

        /* renamed from: a */
        final /* synthetic */ float f12373a;

        b(float f2) {
            this.f12373a = f2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9455P(this.f12373a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$c */
    class c implements j {

        /* renamed from: a */
        final /* synthetic */ C5233e f12375a;

        /* renamed from: b */
        final /* synthetic */ Object f12376b;

        /* renamed from: c */
        final /* synthetic */ C5323c f12377c;

        c(C5233e c5233e, Object obj, C5323c c5323c) {
            this.f12375a = c5233e;
            this.f12376b = obj;
            this.f12377c = c5323c;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9462c(this.f12375a, this.f12376b, this.f12377c);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$d */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C5182f.this.f12368t != null) {
                C5182f.this.f12368t.mo9722A(C5182f.this.f12357i.m9858j());
            }
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$e */
    class e implements j {
        e() {
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9442C();
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$f */
    class f implements j {

        /* renamed from: a */
        final /* synthetic */ int f12381a;

        f(int i2) {
            this.f12381a = i2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9452M(this.f12381a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$g */
    class g implements j {

        /* renamed from: a */
        final /* synthetic */ float f12383a;

        g(float f2) {
            this.f12383a = f2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9453N(this.f12383a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$h */
    class h implements j {

        /* renamed from: a */
        final /* synthetic */ int f12385a;

        h(int i2) {
            this.f12385a = i2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9450K(this.f12385a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$i */
    class i implements j {

        /* renamed from: a */
        final /* synthetic */ float f12387a;

        i(float f2) {
            this.f12387a = f2;
        }

        @Override // com.airbnb.lottie.C5182f.j
        /* renamed from: a */
        public void mo9481a(C5180d c5180d) {
            C5182f.this.m9451L(this.f12387a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$j */
    private interface j {
        /* renamed from: a */
        void mo9481a(C5180d c5180d);
    }

    public C5182f() {
        ChoreographerFrameCallbackC5317c choreographerFrameCallbackC5317c = new ChoreographerFrameCallbackC5317c();
        this.f12357i = choreographerFrameCallbackC5317c;
        this.f12358j = 1.0f;
        this.f12359k = new HashSet();
        this.f12360l = new ArrayList<>();
        this.f12369u = 255;
        choreographerFrameCallbackC5317c.addUpdateListener(new d());
    }

    /* renamed from: V */
    private void m9432V() {
        if (this.f12356h == null) {
            return;
        }
        float fM9478x = m9478x();
        setBounds(0, 0, (int) (this.f12356h.m9396b().width() * fM9478x), (int) (this.f12356h.m9396b().height() * fM9478x));
    }

    /* renamed from: d */
    private void m9435d() {
        this.f12368t = new C5269b(this, C5307s.m9829b(this.f12356h), this.f12356h.m9404j(), this.f12356h);
    }

    /* renamed from: k */
    private Context m9436k() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: l */
    private C5227a m9437l() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f12364p == null) {
            this.f12364p = new C5227a(getCallback(), this.f12365q);
        }
        return this.f12364p;
    }

    /* renamed from: o */
    private C5228b m9438o() {
        if (getCallback() == null) {
            return null;
        }
        C5228b c5228b = this.f12361m;
        if (c5228b != null && !c5228b.m9588b(m9436k())) {
            this.f12361m.m9589d();
            this.f12361m = null;
        }
        if (this.f12361m == null) {
            this.f12361m = new C5228b(getCallback(), this.f12362n, this.f12363o, this.f12356h.m9403i());
        }
        return this.f12361m;
    }

    /* renamed from: r */
    private float m9439r(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f12356h.m9396b().width(), canvas.getHeight() / this.f12356h.m9396b().height());
    }

    /* renamed from: A */
    public Typeface m9440A(String str, String str2) {
        C5227a c5227aM9437l = m9437l();
        if (c5227aM9437l != null) {
            return c5227aM9437l.m9584b(str, str2);
        }
        return null;
    }

    /* renamed from: B */
    public boolean m9441B() {
        return this.f12357i.isRunning();
    }

    /* renamed from: C */
    public void m9442C() {
        if (this.f12368t == null) {
            this.f12360l.add(new e());
        } else {
            this.f12357i.m9863q();
        }
    }

    /* renamed from: D */
    public void m9443D() {
        C5228b c5228b = this.f12361m;
        if (c5228b != null) {
            c5228b.m9589d();
        }
    }

    /* renamed from: E */
    public List<C5233e> m9444E(C5233e c5233e) {
        if (this.f12368t == null) {
            Log.w("LOTTIE", "Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f12368t.mo9514c(c5233e, 0, arrayList, new C5233e(new String[0]));
        return arrayList;
    }

    /* renamed from: F */
    public boolean m9445F(C5180d c5180d) {
        if (this.f12356h == c5180d) {
            return false;
        }
        m9464f();
        this.f12356h = c5180d;
        m9435d();
        this.f12357i.m9868v(c5180d);
        m9455P(this.f12357i.getAnimatedFraction());
        m9458S(this.f12358j);
        m9432V();
        Iterator it = new ArrayList(this.f12360l).iterator();
        while (it.hasNext()) {
            ((j) it.next()).mo9481a(c5180d);
            it.remove();
        }
        this.f12360l.clear();
        c5180d.m9410p(this.f12370v);
        return true;
    }

    /* renamed from: G */
    public void m9446G(C5177a c5177a) {
        C5227a c5227a = this.f12364p;
        if (c5227a != null) {
            c5227a.m9585c(c5177a);
        }
    }

    /* renamed from: H */
    public void m9447H(int i2) {
        if (this.f12356h == null) {
            this.f12360l.add(new a(i2));
        } else {
            this.f12357i.m9869w(i2);
        }
    }

    /* renamed from: I */
    public void m9448I(InterfaceC5178b interfaceC5178b) {
        this.f12363o = interfaceC5178b;
        C5228b c5228b = this.f12361m;
        if (c5228b != null) {
            c5228b.m9590e(interfaceC5178b);
        }
    }

    /* renamed from: J */
    public void m9449J(String str) {
        this.f12362n = str;
    }

    /* renamed from: K */
    public void m9450K(int i2) {
        if (this.f12356h == null) {
            this.f12360l.add(new h(i2));
        } else {
            this.f12357i.m9852A(i2);
        }
    }

    /* renamed from: L */
    public void m9451L(float f2) {
        C5180d c5180d = this.f12356h;
        if (c5180d == null) {
            this.f12360l.add(new i(f2));
        } else {
            m9450K((int) C5319e.m9880j(c5180d.m9407m(), this.f12356h.m9400f(), f2));
        }
    }

    /* renamed from: M */
    public void m9452M(int i2) {
        if (this.f12356h == null) {
            this.f12360l.add(new f(i2));
        } else {
            this.f12357i.m9854C(i2);
        }
    }

    /* renamed from: N */
    public void m9453N(float f2) {
        C5180d c5180d = this.f12356h;
        if (c5180d == null) {
            this.f12360l.add(new g(f2));
        } else {
            m9452M((int) C5319e.m9880j(c5180d.m9407m(), this.f12356h.m9400f(), f2));
        }
    }

    /* renamed from: O */
    public void m9454O(boolean z) {
        this.f12370v = z;
        C5180d c5180d = this.f12356h;
        if (c5180d != null) {
            c5180d.m9410p(z);
        }
    }

    /* renamed from: P */
    public void m9455P(float f2) {
        C5180d c5180d = this.f12356h;
        if (c5180d == null) {
            this.f12360l.add(new b(f2));
        } else {
            m9447H((int) C5319e.m9880j(c5180d.m9407m(), this.f12356h.m9400f(), f2));
        }
    }

    /* renamed from: Q */
    public void m9456Q(int i2) {
        this.f12357i.setRepeatCount(i2);
    }

    /* renamed from: R */
    public void m9457R(int i2) {
        this.f12357i.setRepeatMode(i2);
    }

    /* renamed from: S */
    public void m9458S(float f2) {
        this.f12358j = f2;
        m9432V();
    }

    /* renamed from: T */
    public void m9459T(float f2) {
        this.f12357i.m9855D(f2);
    }

    /* renamed from: U */
    public void m9460U(C5192p c5192p) {
    }

    /* renamed from: W */
    public boolean m9461W() {
        return this.f12366r == null && this.f12356h.m9397c().m5487l() > 0;
    }

    /* renamed from: c */
    public <T> void m9462c(C5233e c5233e, T t, C5323c<T> c5323c) {
        if (this.f12368t == null) {
            this.f12360l.add(new c(c5233e, t, c5323c));
            return;
        }
        boolean zIsEmpty = true;
        if (c5233e.m9607d() != null) {
            c5233e.m9607d().mo9517h(t, c5323c);
        } else {
            List<C5233e> listM9444E = m9444E(c5233e);
            for (int i2 = 0; i2 < listM9444E.size(); i2++) {
                listM9444E.get(i2).m9607d().mo9517h(t, c5323c);
            }
            zIsEmpty = true ^ listM9444E.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == InterfaceC5186j.f12417w) {
                m9455P(m9475u());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        C5179c.m9391a("Drawable#draw");
        if (this.f12368t == null) {
            return;
        }
        float f3 = this.f12358j;
        float fM9439r = m9439r(canvas);
        if (f3 > fM9439r) {
            f2 = this.f12358j / fM9439r;
        } else {
            fM9439r = f3;
            f2 = 1.0f;
        }
        if (f2 > 1.0f) {
            canvas.save();
            float fWidth = this.f12356h.m9396b().width() / 2.0f;
            float fHeight = this.f12356h.m9396b().height() / 2.0f;
            float f4 = fWidth * fM9439r;
            float f5 = fHeight * fM9439r;
            canvas.translate((m9478x() * fWidth) - f4, (m9478x() * fHeight) - f5);
            canvas.scale(f2, f2, f4, f5);
        }
        this.f12355g.reset();
        this.f12355g.preScale(fM9439r, fM9439r);
        this.f12368t.mo9516f(canvas, this.f12355g, this.f12369u);
        C5179c.m9393c("Drawable#draw");
        if (f2 > 1.0f) {
            canvas.restore();
        }
    }

    /* renamed from: e */
    public void m9463e() {
        this.f12360l.clear();
        this.f12357i.cancel();
    }

    /* renamed from: f */
    public void m9464f() {
        m9443D();
        if (this.f12357i.isRunning()) {
            this.f12357i.cancel();
        }
        this.f12356h = null;
        this.f12368t = null;
        this.f12361m = null;
        this.f12357i.m9856h();
        invalidateSelf();
    }

    /* renamed from: g */
    public void m9465g(boolean z) {
        if (this.f12367s == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            Log.w(f12354f, "Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f12367s = z;
        if (this.f12356h != null) {
            m9435d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12369u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f12356h == null) {
            return -1;
        }
        return (int) (r0.m9396b().height() * m9478x());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f12356h == null) {
            return -1;
        }
        return (int) (r0.m9396b().width() * m9478x());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean m9466h() {
        return this.f12367s;
    }

    /* renamed from: i */
    public void m9467i() {
        this.f12360l.clear();
        this.f12357i.m9857i();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m9441B();
    }

    /* renamed from: j */
    public C5180d m9468j() {
        return this.f12356h;
    }

    /* renamed from: m */
    public int m9469m() {
        return (int) this.f12357i.m9859k();
    }

    /* renamed from: n */
    public Bitmap m9470n(String str) {
        C5228b c5228bM9438o = m9438o();
        if (c5228bM9438o != null) {
            return c5228bM9438o.m9587a(str);
        }
        return null;
    }

    /* renamed from: p */
    public String m9471p() {
        return this.f12362n;
    }

    /* renamed from: q */
    public float m9472q() {
        return this.f12357i.m9860m();
    }

    /* renamed from: s */
    public float m9473s() {
        return this.f12357i.m9861n();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f12369u = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        m9442C();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m9467i();
    }

    /* renamed from: t */
    public C5189m m9474t() {
        C5180d c5180d = this.f12356h;
        if (c5180d != null) {
            return c5180d.m9405k();
        }
        return null;
    }

    /* renamed from: u */
    public float m9475u() {
        return this.f12357i.m9858j();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public int m9476v() {
        return this.f12357i.getRepeatCount();
    }

    /* renamed from: w */
    public int m9477w() {
        return this.f12357i.getRepeatMode();
    }

    /* renamed from: x */
    public float m9478x() {
        return this.f12358j;
    }

    /* renamed from: y */
    public float m9479y() {
        return this.f12357i.m9862o();
    }

    /* renamed from: z */
    public C5192p m9480z() {
        return this.f12366r;
    }
}
