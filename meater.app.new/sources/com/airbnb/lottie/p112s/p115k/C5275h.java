package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p109a.C5195c;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5224n;
import com.airbnb.lottie.p112s.C5230b;
import com.airbnb.lottie.p112s.C5231c;
import com.airbnb.lottie.p112s.C5232d;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5247k;
import com.airbnb.lottie.p112s.p114j.C5264n;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* renamed from: com.airbnb.lottie.s.k.h */
/* loaded from: classes.dex */
public class C5275h extends AbstractC5268a {

    /* renamed from: A */
    private final Paint f12875A;

    /* renamed from: B */
    private final Map<C5232d, List<C5195c>> f12876B;

    /* renamed from: C */
    private final C5224n f12877C;

    /* renamed from: D */
    private final C5182f f12878D;

    /* renamed from: E */
    private final C5180d f12879E;

    /* renamed from: F */
    private AbstractC5211a<Integer, Integer> f12880F;

    /* renamed from: G */
    private AbstractC5211a<Integer, Integer> f12881G;

    /* renamed from: H */
    private AbstractC5211a<Float, Float> f12882H;

    /* renamed from: I */
    private AbstractC5211a<Float, Float> f12883I;

    /* renamed from: w */
    private final char[] f12884w;

    /* renamed from: x */
    private final RectF f12885x;

    /* renamed from: y */
    private final Matrix f12886y;

    /* renamed from: z */
    private final Paint f12887z;

    /* compiled from: TextLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.h$a */
    class a extends Paint {
        a(int i2) {
            super(i2);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.h$b */
    class b extends Paint {
        b(int i2) {
            super(i2);
            setStyle(Paint.Style.STROKE);
        }
    }

    C5275h(C5182f c5182f, C5271d c5271d) {
        C5238b c5238b;
        C5238b c5238b2;
        C5237a c5237a;
        C5237a c5237a2;
        super(c5182f, c5271d);
        this.f12884w = new char[1];
        this.f12885x = new RectF();
        this.f12886y = new Matrix();
        this.f12887z = new a(1);
        this.f12875A = new b(1);
        this.f12876B = new HashMap();
        this.f12878D = c5182f;
        this.f12879E = c5271d.m9732a();
        C5224n c5224nMo9617a = c5271d.m9748q().mo9617a();
        this.f12877C = c5224nMo9617a;
        c5224nMo9617a.m9548a(this);
        m9723i(c5224nMo9617a);
        C5247k c5247kM9749r = c5271d.m9749r();
        if (c5247kM9749r != null && (c5237a2 = c5247kM9749r.f12681a) != null) {
            AbstractC5211a<Integer, Integer> abstractC5211aMo9617a = c5237a2.mo9617a();
            this.f12880F = abstractC5211aMo9617a;
            abstractC5211aMo9617a.m9548a(this);
            m9723i(this.f12880F);
        }
        if (c5247kM9749r != null && (c5237a = c5247kM9749r.f12682b) != null) {
            AbstractC5211a<Integer, Integer> abstractC5211aMo9617a2 = c5237a.mo9617a();
            this.f12881G = abstractC5211aMo9617a2;
            abstractC5211aMo9617a2.m9548a(this);
            m9723i(this.f12881G);
        }
        if (c5247kM9749r != null && (c5238b2 = c5247kM9749r.f12683c) != null) {
            AbstractC5211a<Float, Float> abstractC5211aMo9617a3 = c5238b2.mo9617a();
            this.f12882H = abstractC5211aMo9617a3;
            abstractC5211aMo9617a3.m9548a(this);
            m9723i(this.f12882H);
        }
        if (c5247kM9749r == null || (c5238b = c5247kM9749r.f12684d) == null) {
            return;
        }
        AbstractC5211a<Float, Float> abstractC5211aMo9617a4 = c5238b.mo9617a();
        this.f12883I = abstractC5211aMo9617a4;
        abstractC5211aMo9617a4.m9548a(this);
        m9723i(this.f12883I);
    }

    /* renamed from: D */
    private void m9754D(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
    }

    /* renamed from: E */
    private void m9755E(C5232d c5232d, Matrix matrix, float f2, C5230b c5230b, Canvas canvas) {
        List<C5195c> listM9760J = m9760J(c5232d);
        for (int i2 = 0; i2 < listM9760J.size(); i2++) {
            Path pathMo9522g = listM9760J.get(i2).mo9522g();
            pathMo9522g.computeBounds(this.f12885x, false);
            this.f12886y.set(matrix);
            this.f12886y.preTranslate(0.0f, ((float) (-c5230b.f12657g)) * C5320f.m9887e());
            this.f12886y.preScale(f2, f2);
            pathMo9522g.transform(this.f12886y);
            if (c5230b.f12661k) {
                m9757G(pathMo9522g, this.f12887z, canvas);
                m9757G(pathMo9522g, this.f12875A, canvas);
            } else {
                m9757G(pathMo9522g, this.f12875A, canvas);
                m9757G(pathMo9522g, this.f12887z, canvas);
            }
        }
    }

    /* renamed from: F */
    private void m9756F(char c2, C5230b c5230b, Canvas canvas) {
        char[] cArr = this.f12884w;
        cArr[0] = c2;
        if (c5230b.f12661k) {
            m9754D(cArr, this.f12887z, canvas);
            m9754D(this.f12884w, this.f12875A, canvas);
        } else {
            m9754D(cArr, this.f12875A, canvas);
            m9754D(this.f12884w, this.f12887z, canvas);
        }
    }

    /* renamed from: G */
    private void m9757G(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: H */
    private void m9758H(C5230b c5230b, Matrix matrix, C5231c c5231c, Canvas canvas) {
        float f2 = ((float) c5230b.f12653c) / 100.0f;
        float fM9888f = C5320f.m9888f(matrix);
        String str = c5230b.f12651a;
        for (int i2 = 0; i2 < str.length(); i2++) {
            C5232d c5232dM5482g = this.f12879E.m9397c().m5482g(C5232d.m9600c(str.charAt(i2), c5231c.m9597a(), c5231c.m9599c()));
            if (c5232dM5482g != null) {
                m9755E(c5232dM5482g, matrix, f2, c5230b, canvas);
                float fM9602b = ((float) c5232dM5482g.m9602b()) * f2 * C5320f.m9887e() * fM9888f;
                float fFloatValue = c5230b.f12655e / 10.0f;
                AbstractC5211a<Float, Float> abstractC5211a = this.f12883I;
                if (abstractC5211a != null) {
                    fFloatValue += abstractC5211a.mo9552h().floatValue();
                }
                canvas.translate(fM9602b + (fFloatValue * fM9888f), 0.0f);
            }
        }
    }

    /* renamed from: I */
    private void m9759I(C5230b c5230b, C5231c c5231c, Matrix matrix, Canvas canvas) {
        float fM9888f = C5320f.m9888f(matrix);
        Typeface typefaceM9440A = this.f12878D.m9440A(c5231c.m9597a(), c5231c.m9599c());
        if (typefaceM9440A == null) {
            return;
        }
        String str = c5230b.f12651a;
        if (this.f12878D.m9480z() != null) {
            throw null;
        }
        this.f12887z.setTypeface(typefaceM9440A);
        Paint paint = this.f12887z;
        double d2 = c5230b.f12653c;
        double dM9887e = C5320f.m9887e();
        Double.isNaN(dM9887e);
        paint.setTextSize((float) (d2 * dM9887e));
        this.f12875A.setTypeface(this.f12887z.getTypeface());
        this.f12875A.setTextSize(this.f12887z.getTextSize());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            m9756F(cCharAt, c5230b, canvas);
            char[] cArr = this.f12884w;
            cArr[0] = cCharAt;
            float fMeasureText = this.f12887z.measureText(cArr, 0, 1);
            float fFloatValue = c5230b.f12655e / 10.0f;
            AbstractC5211a<Float, Float> abstractC5211a = this.f12883I;
            if (abstractC5211a != null) {
                fFloatValue += abstractC5211a.mo9552h().floatValue();
            }
            canvas.translate(fMeasureText + (fFloatValue * fM9888f), 0.0f);
        }
    }

    /* renamed from: J */
    private List<C5195c> m9760J(C5232d c5232d) {
        if (this.f12876B.containsKey(c5232d)) {
            return this.f12876B.get(c5232d);
        }
        List<C5264n> listM9601a = c5232d.m9601a();
        int size = listM9601a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C5195c(this.f12878D, this, listM9601a.get(i2)));
        }
        this.f12876B.put(c5232d, arrayList);
        return arrayList;
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        AbstractC5211a<Float, Float> abstractC5211a;
        AbstractC5211a<Float, Float> abstractC5211a2;
        AbstractC5211a<Integer, Integer> abstractC5211a3;
        AbstractC5211a<Integer, Integer> abstractC5211a4;
        super.mo9517h(t, c5323c);
        if (t == InterfaceC5186j.f12395a && (abstractC5211a4 = this.f12880F) != null) {
            abstractC5211a4.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12396b && (abstractC5211a3 = this.f12881G) != null) {
            abstractC5211a3.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12405k && (abstractC5211a2 = this.f12882H) != null) {
            abstractC5211a2.m9557m(c5323c);
        } else {
            if (t != InterfaceC5186j.f12406l || (abstractC5211a = this.f12883I) == null) {
                return;
            }
            abstractC5211a.m9557m(c5323c);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        canvas.save();
        if (!this.f12878D.m9461W()) {
            canvas.setMatrix(matrix);
        }
        C5230b c5230bMo9552h = this.f12877C.mo9552h();
        C5231c c5231c = this.f12879E.m9401g().get(c5230bMo9552h.f12652b);
        if (c5231c == null) {
            canvas.restore();
            return;
        }
        AbstractC5211a<Integer, Integer> abstractC5211a = this.f12880F;
        if (abstractC5211a != null) {
            this.f12887z.setColor(abstractC5211a.mo9552h().intValue());
        } else {
            this.f12887z.setColor(c5230bMo9552h.f12658h);
        }
        AbstractC5211a<Integer, Integer> abstractC5211a2 = this.f12881G;
        if (abstractC5211a2 != null) {
            this.f12875A.setColor(abstractC5211a2.mo9552h().intValue());
        } else {
            this.f12875A.setColor(c5230bMo9552h.f12659i);
        }
        int iIntValue = (this.f12819u.m9579g().mo9552h().intValue() * 255) / 100;
        this.f12887z.setAlpha(iIntValue);
        this.f12875A.setAlpha(iIntValue);
        AbstractC5211a<Float, Float> abstractC5211a3 = this.f12882H;
        if (abstractC5211a3 != null) {
            this.f12875A.setStrokeWidth(abstractC5211a3.mo9552h().floatValue());
        } else {
            float fM9888f = C5320f.m9888f(matrix);
            Paint paint = this.f12875A;
            double d2 = c5230bMo9552h.f12660j;
            double dM9887e = C5320f.m9887e();
            Double.isNaN(dM9887e);
            double d3 = d2 * dM9887e;
            double d4 = fM9888f;
            Double.isNaN(d4);
            paint.setStrokeWidth((float) (d3 * d4));
        }
        if (this.f12878D.m9461W()) {
            m9758H(c5230bMo9552h, matrix, c5231c, canvas);
        } else {
            m9759I(c5230bMo9552h, c5231c, matrix, canvas);
        }
        canvas.restore();
    }
}
