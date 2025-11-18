package com.airbnb.lottie.p112s.p115k;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p108q.p109a.InterfaceC5196d;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5213c;
import com.airbnb.lottie.p108q.p110b.C5217g;
import com.airbnb.lottie.p108q.p110b.C5225o;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.InterfaceC5234f;
import com.airbnb.lottie.p112s.p114j.C5257g;
import com.airbnb.lottie.p112s.p114j.C5262l;
import com.airbnb.lottie.p112s.p115k.C5271d;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* renamed from: com.airbnb.lottie.s.k.a */
/* loaded from: classes.dex */
public abstract class AbstractC5268a implements InterfaceC5196d, AbstractC5211a.a, InterfaceC5234f {

    /* renamed from: a */
    private final Path f12799a = new Path();

    /* renamed from: b */
    private final Matrix f12800b = new Matrix();

    /* renamed from: c */
    private final Paint f12801c = new Paint(1);

    /* renamed from: d */
    private final Paint f12802d;

    /* renamed from: e */
    private final Paint f12803e;

    /* renamed from: f */
    private final Paint f12804f;

    /* renamed from: g */
    private final Paint f12805g;

    /* renamed from: h */
    private final RectF f12806h;

    /* renamed from: i */
    private final RectF f12807i;

    /* renamed from: j */
    private final RectF f12808j;

    /* renamed from: k */
    private final RectF f12809k;

    /* renamed from: l */
    private final String f12810l;

    /* renamed from: m */
    final Matrix f12811m;

    /* renamed from: n */
    final C5182f f12812n;

    /* renamed from: o */
    final C5271d f12813o;

    /* renamed from: p */
    private C5217g f12814p;

    /* renamed from: q */
    private AbstractC5268a f12815q;

    /* renamed from: r */
    private AbstractC5268a f12816r;

    /* renamed from: s */
    private List<AbstractC5268a> f12817s;

    /* renamed from: t */
    private final List<AbstractC5211a<?, ?>> f12818t;

    /* renamed from: u */
    final C5225o f12819u;

    /* renamed from: v */
    private boolean f12820v;

    /* compiled from: BaseLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.a$a */
    class a implements AbstractC5211a.a {

        /* renamed from: a */
        final /* synthetic */ C5213c f12821a;

        a(C5213c c5213c) {
            this.f12821a = c5213c;
        }

        @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
        /* renamed from: a */
        public void mo9512a() {
            AbstractC5268a.this.m9709B(this.f12821a.mo9552h().floatValue() == 1.0f);
        }
    }

    /* compiled from: BaseLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.a$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12823a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12824b;

        static {
            int[] iArr = new int[C5257g.a.values().length];
            f12824b = iArr;
            try {
                iArr[C5257g.a.MaskModeSubtract.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12824b[C5257g.a.MaskModeIntersect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12824b[C5257g.a.MaskModeAdd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C5271d.a.values().length];
            f12823a = iArr2;
            try {
                iArr2[C5271d.a.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12823a[C5271d.a.PreComp.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12823a[C5271d.a.Solid.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12823a[C5271d.a.Image.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12823a[C5271d.a.Null.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12823a[C5271d.a.Text.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12823a[C5271d.a.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    AbstractC5268a(C5182f c5182f, C5271d c5271d) {
        Paint paint = new Paint(1);
        this.f12802d = paint;
        Paint paint2 = new Paint(1);
        this.f12803e = paint2;
        Paint paint3 = new Paint(1);
        this.f12804f = paint3;
        Paint paint4 = new Paint();
        this.f12805g = paint4;
        this.f12806h = new RectF();
        this.f12807i = new RectF();
        this.f12808j = new RectF();
        this.f12809k = new RectF();
        this.f12811m = new Matrix();
        this.f12818t = new ArrayList();
        this.f12820v = true;
        this.f12812n = c5182f;
        this.f12813o = c5271d;
        this.f12810l = c5271d.m9738g() + "#draw";
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (c5271d.m9737f() == C5271d.b.Invert) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C5225o c5225oM9620b = c5271d.m9752u().m9620b();
        this.f12819u = c5225oM9620b;
        c5225oM9620b.m9574b(this);
        if (c5271d.m9736e() != null && !c5271d.m9736e().isEmpty()) {
            C5217g c5217g = new C5217g(c5271d.m9736e());
            this.f12814p = c5217g;
            Iterator<AbstractC5211a<C5262l, Path>> it = c5217g.m9562a().iterator();
            while (it.hasNext()) {
                it.next().m9548a(this);
            }
            for (AbstractC5211a<Integer, Integer> abstractC5211a : this.f12814p.m9564c()) {
                m9723i(abstractC5211a);
                abstractC5211a.m9548a(this);
            }
        }
        m9710C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m9709B(boolean z) {
        if (z != this.f12820v) {
            this.f12820v = z;
            m9719u();
        }
    }

    /* renamed from: C */
    private void m9710C() {
        if (this.f12813o.m9734c().isEmpty()) {
            m9709B(true);
            return;
        }
        C5213c c5213c = new C5213c(this.f12813o.m9734c());
        c5213c.m9555k();
        c5213c.m9548a(new a(c5213c));
        m9709B(c5213c.mo9552h().floatValue() == 1.0f);
        m9723i(c5213c);
    }

    /* renamed from: j */
    private void m9712j(Canvas canvas, Matrix matrix) {
        m9713k(canvas, matrix, C5257g.a.MaskModeAdd);
        m9713k(canvas, matrix, C5257g.a.MaskModeIntersect);
        m9713k(canvas, matrix, C5257g.a.MaskModeSubtract);
    }

    /* renamed from: k */
    private void m9713k(Canvas canvas, Matrix matrix, C5257g.a aVar) {
        boolean z = true;
        Paint paint = b.f12824b[aVar.ordinal()] != 1 ? this.f12802d : this.f12803e;
        int size = this.f12814p.m9563b().size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            } else if (this.f12814p.m9563b().get(i2).m9655a() == aVar) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C5179c.m9391a("Layer#drawMask");
            C5179c.m9391a("Layer#saveLayer");
            m9721x(canvas, this.f12806h, paint, false);
            C5179c.m9393c("Layer#saveLayer");
            m9715m(canvas);
            for (int i3 = 0; i3 < size; i3++) {
                if (this.f12814p.m9563b().get(i3).m9655a() == aVar) {
                    this.f12799a.set(this.f12814p.m9562a().get(i3).mo9552h());
                    this.f12799a.transform(matrix);
                    AbstractC5211a<Integer, Integer> abstractC5211a = this.f12814p.m9564c().get(i3);
                    int alpha = this.f12801c.getAlpha();
                    this.f12801c.setAlpha((int) (abstractC5211a.mo9552h().intValue() * 2.55f));
                    canvas.drawPath(this.f12799a, this.f12801c);
                    this.f12801c.setAlpha(alpha);
                }
            }
            C5179c.m9391a("Layer#restoreLayer");
            canvas.restore();
            C5179c.m9393c("Layer#restoreLayer");
            C5179c.m9393c("Layer#drawMask");
        }
    }

    /* renamed from: l */
    private void m9714l() {
        if (this.f12817s != null) {
            return;
        }
        if (this.f12816r == null) {
            this.f12817s = Collections.emptyList();
            return;
        }
        this.f12817s = new ArrayList();
        for (AbstractC5268a abstractC5268a = this.f12816r; abstractC5268a != null; abstractC5268a = abstractC5268a.f12816r) {
            this.f12817s.add(abstractC5268a);
        }
    }

    /* renamed from: m */
    private void m9715m(Canvas canvas) {
        C5179c.m9391a("Layer#clearLayer");
        RectF rectF = this.f12806h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f12805g);
        C5179c.m9393c("Layer#clearLayer");
    }

    /* renamed from: o */
    static AbstractC5268a m9716o(C5271d c5271d, C5182f c5182f, C5180d c5180d) {
        switch (b.f12823a[c5271d.m9735d().ordinal()]) {
            case 1:
                return new C5273f(c5182f, c5271d);
            case 2:
                return new C5269b(c5182f, c5271d, c5180d.m9406l(c5271d.m9742k()), c5180d);
            case 3:
                return new C5274g(c5182f, c5271d);
            case 4:
                return new C5270c(c5182f, c5271d);
            case 5:
                return new C5272e(c5182f, c5271d);
            case 6:
                return new C5275h(c5182f, c5271d);
            default:
                C5179c.m9394d("Unknown layer type " + c5271d.m9735d());
                return null;
        }
    }

    /* renamed from: s */
    private void m9717s(RectF rectF, Matrix matrix) {
        this.f12807i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m9726q()) {
            int size = this.f12814p.m9563b().size();
            for (int i2 = 0; i2 < size; i2++) {
                C5257g c5257g = this.f12814p.m9563b().get(i2);
                this.f12799a.set(this.f12814p.m9562a().get(i2).mo9552h());
                this.f12799a.transform(matrix);
                int i3 = b.f12824b[c5257g.m9655a().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return;
                }
                this.f12799a.computeBounds(this.f12809k, false);
                if (i2 == 0) {
                    this.f12807i.set(this.f12809k);
                } else {
                    RectF rectF2 = this.f12807i;
                    rectF2.set(Math.min(rectF2.left, this.f12809k.left), Math.min(this.f12807i.top, this.f12809k.top), Math.max(this.f12807i.right, this.f12809k.right), Math.max(this.f12807i.bottom, this.f12809k.bottom));
                }
            }
            rectF.set(Math.max(rectF.left, this.f12807i.left), Math.max(rectF.top, this.f12807i.top), Math.min(rectF.right, this.f12807i.right), Math.min(rectF.bottom, this.f12807i.bottom));
        }
    }

    /* renamed from: t */
    private void m9718t(RectF rectF, Matrix matrix) {
        if (m9727r() && this.f12813o.m9737f() != C5271d.b.Invert) {
            this.f12815q.mo9515d(this.f12808j, matrix);
            rectF.set(Math.max(rectF.left, this.f12808j.left), Math.max(rectF.top, this.f12808j.top), Math.min(rectF.right, this.f12808j.right), Math.min(rectF.bottom, this.f12808j.bottom));
        }
    }

    /* renamed from: u */
    private void m9719u() {
        this.f12812n.invalidateSelf();
    }

    /* renamed from: v */
    private void m9720v(float f2) {
        this.f12812n.m9468j().m9405k().m9506a(this.f12813o.m9738g(), f2);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: x */
    private void m9721x(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: A */
    void mo9722A(float f2) {
        this.f12819u.m9581i(f2);
        if (this.f12814p != null) {
            for (int i2 = 0; i2 < this.f12814p.m9562a().size(); i2++) {
                this.f12814p.m9562a().get(i2).mo9556l(f2);
            }
        }
        if (this.f12813o.m9751t() != 0.0f) {
            f2 /= this.f12813o.m9751t();
        }
        AbstractC5268a abstractC5268a = this.f12815q;
        if (abstractC5268a != null) {
            this.f12815q.mo9722A(abstractC5268a.f12813o.m9751t() * f2);
        }
        for (int i3 = 0; i3 < this.f12818t.size(); i3++) {
            this.f12818t.get(i3).mo9556l(f2);
        }
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        m9719u();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        if (c5233e.m9609g(getName(), i2)) {
            if (!"__container".equals(getName())) {
                c5233e2 = c5233e2.m9605a(getName());
                if (c5233e.m9606c(getName(), i2)) {
                    list.add(c5233e2.m9611i(this));
                }
            }
            if (c5233e.m9610h(getName(), i2)) {
                mo9728w(c5233e, i2 + c5233e.m9608e(getName(), i2), list, c5233e2);
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12811m.set(matrix);
        this.f12811m.preConcat(this.f12819u.m9577e());
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5179c.m9391a(this.f12810l);
        if (!this.f12820v) {
            C5179c.m9393c(this.f12810l);
            return;
        }
        m9714l();
        C5179c.m9391a("Layer#parentMatrix");
        this.f12800b.reset();
        this.f12800b.set(matrix);
        for (int size = this.f12817s.size() - 1; size >= 0; size--) {
            this.f12800b.preConcat(this.f12817s.get(size).f12819u.m9577e());
        }
        C5179c.m9393c("Layer#parentMatrix");
        int iIntValue = (int) ((((i2 / 255.0f) * this.f12819u.m9579g().mo9552h().intValue()) / 100.0f) * 255.0f);
        if (!m9727r() && !m9726q()) {
            this.f12800b.preConcat(this.f12819u.m9577e());
            C5179c.m9391a("Layer#drawLayer");
            mo9724n(canvas, this.f12800b, iIntValue);
            C5179c.m9393c("Layer#drawLayer");
            m9720v(C5179c.m9393c(this.f12810l));
            return;
        }
        C5179c.m9391a("Layer#computeBounds");
        this.f12806h.set(0.0f, 0.0f, 0.0f, 0.0f);
        mo9515d(this.f12806h, this.f12800b);
        m9718t(this.f12806h, this.f12800b);
        this.f12800b.preConcat(this.f12819u.m9577e());
        m9717s(this.f12806h, this.f12800b);
        this.f12806h.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        C5179c.m9393c("Layer#computeBounds");
        C5179c.m9391a("Layer#saveLayer");
        m9721x(canvas, this.f12806h, this.f12801c, true);
        C5179c.m9393c("Layer#saveLayer");
        m9715m(canvas);
        C5179c.m9391a("Layer#drawLayer");
        mo9724n(canvas, this.f12800b, iIntValue);
        C5179c.m9393c("Layer#drawLayer");
        if (m9726q()) {
            m9712j(canvas, this.f12800b);
        }
        if (m9727r()) {
            C5179c.m9391a("Layer#drawMatte");
            C5179c.m9391a("Layer#saveLayer");
            m9721x(canvas, this.f12806h, this.f12804f, false);
            C5179c.m9393c("Layer#saveLayer");
            m9715m(canvas);
            this.f12815q.mo9516f(canvas, matrix, iIntValue);
            C5179c.m9391a("Layer#restoreLayer");
            canvas.restore();
            C5179c.m9393c("Layer#restoreLayer");
            C5179c.m9393c("Layer#drawMatte");
        }
        C5179c.m9391a("Layer#restoreLayer");
        canvas.restore();
        C5179c.m9393c("Layer#restoreLayer");
        m9720v(C5179c.m9393c(this.f12810l));
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12813o.m9738g();
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        this.f12819u.m9575c(t, c5323c);
    }

    /* renamed from: i */
    public void m9723i(AbstractC5211a<?, ?> abstractC5211a) {
        this.f12818t.add(abstractC5211a);
    }

    /* renamed from: n */
    abstract void mo9724n(Canvas canvas, Matrix matrix, int i2);

    /* renamed from: p */
    C5271d m9725p() {
        return this.f12813o;
    }

    /* renamed from: q */
    boolean m9726q() {
        C5217g c5217g = this.f12814p;
        return (c5217g == null || c5217g.m9562a().isEmpty()) ? false : true;
    }

    /* renamed from: r */
    boolean m9727r() {
        return this.f12815q != null;
    }

    /* renamed from: w */
    void mo9728w(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
    }

    /* renamed from: y */
    void m9729y(AbstractC5268a abstractC5268a) {
        this.f12815q = abstractC5268a;
    }

    /* renamed from: z */
    void m9730z(AbstractC5268a abstractC5268a) {
        this.f12816r = abstractC5268a;
    }
}
