package com.airbnb.lottie.p108q.p110b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p119w.C5323c;
import com.airbnb.lottie.p119w.C5324d;

/* compiled from: TransformKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.o */
/* loaded from: classes.dex */
public class C5225o {

    /* renamed from: a */
    private final Matrix f12628a = new Matrix();

    /* renamed from: b */
    private final AbstractC5211a<PointF, PointF> f12629b;

    /* renamed from: c */
    private final AbstractC5211a<?, PointF> f12630c;

    /* renamed from: d */
    private final AbstractC5211a<C5324d, C5324d> f12631d;

    /* renamed from: e */
    private final AbstractC5211a<Float, Float> f12632e;

    /* renamed from: f */
    private final AbstractC5211a<Integer, Integer> f12633f;

    /* renamed from: g */
    private final AbstractC5211a<?, Float> f12634g;

    /* renamed from: h */
    private final AbstractC5211a<?, Float> f12635h;

    public C5225o(C5248l c5248l) {
        this.f12629b = c5248l.m9621c().mo9617a();
        this.f12630c = c5248l.m9624f().mo9617a();
        this.f12631d = c5248l.m9626h().mo9617a();
        this.f12632e = c5248l.m9625g().mo9617a();
        this.f12633f = c5248l.m9623e().mo9617a();
        if (c5248l.m9627i() != null) {
            this.f12634g = c5248l.m9627i().mo9617a();
        } else {
            this.f12634g = null;
        }
        if (c5248l.m9622d() != null) {
            this.f12635h = c5248l.m9622d().mo9617a();
        } else {
            this.f12635h = null;
        }
    }

    /* renamed from: a */
    public void m9573a(AbstractC5268a abstractC5268a) {
        abstractC5268a.m9723i(this.f12629b);
        abstractC5268a.m9723i(this.f12630c);
        abstractC5268a.m9723i(this.f12631d);
        abstractC5268a.m9723i(this.f12632e);
        abstractC5268a.m9723i(this.f12633f);
        AbstractC5211a<?, Float> abstractC5211a = this.f12634g;
        if (abstractC5211a != null) {
            abstractC5268a.m9723i(abstractC5211a);
        }
        AbstractC5211a<?, Float> abstractC5211a2 = this.f12635h;
        if (abstractC5211a2 != null) {
            abstractC5268a.m9723i(abstractC5211a2);
        }
    }

    /* renamed from: b */
    public void m9574b(AbstractC5211a.a aVar) {
        this.f12629b.m9548a(aVar);
        this.f12630c.m9548a(aVar);
        this.f12631d.m9548a(aVar);
        this.f12632e.m9548a(aVar);
        this.f12633f.m9548a(aVar);
        AbstractC5211a<?, Float> abstractC5211a = this.f12634g;
        if (abstractC5211a != null) {
            abstractC5211a.m9548a(aVar);
        }
        AbstractC5211a<?, Float> abstractC5211a2 = this.f12635h;
        if (abstractC5211a2 != null) {
            abstractC5211a2.m9548a(aVar);
        }
    }

    /* renamed from: c */
    public <T> boolean m9575c(T t, C5323c<T> c5323c) {
        AbstractC5211a<?, Float> abstractC5211a;
        AbstractC5211a<?, Float> abstractC5211a2;
        if (t == InterfaceC5186j.f12399e) {
            this.f12629b.m9557m(c5323c);
            return true;
        }
        if (t == InterfaceC5186j.f12400f) {
            this.f12630c.m9557m(c5323c);
            return true;
        }
        if (t == InterfaceC5186j.f12403i) {
            this.f12631d.m9557m(c5323c);
            return true;
        }
        if (t == InterfaceC5186j.f12404j) {
            this.f12632e.m9557m(c5323c);
            return true;
        }
        if (t == InterfaceC5186j.f12397c) {
            this.f12633f.m9557m(c5323c);
            return true;
        }
        if (t == InterfaceC5186j.f12415u && (abstractC5211a2 = this.f12634g) != null) {
            abstractC5211a2.m9557m(c5323c);
            return true;
        }
        if (t != InterfaceC5186j.f12416v || (abstractC5211a = this.f12635h) == null) {
            return false;
        }
        abstractC5211a.m9557m(c5323c);
        return true;
    }

    /* renamed from: d */
    public AbstractC5211a<?, Float> m9576d() {
        return this.f12635h;
    }

    /* renamed from: e */
    public Matrix m9577e() {
        this.f12628a.reset();
        PointF pointFMo9552h = this.f12630c.mo9552h();
        float f2 = pointFMo9552h.x;
        if (f2 != 0.0f || pointFMo9552h.y != 0.0f) {
            this.f12628a.preTranslate(f2, pointFMo9552h.y);
        }
        float fFloatValue = this.f12632e.mo9552h().floatValue();
        if (fFloatValue != 0.0f) {
            this.f12628a.preRotate(fFloatValue);
        }
        C5324d c5324dMo9552h = this.f12631d.mo9552h();
        if (c5324dMo9552h.m9899a() != 1.0f || c5324dMo9552h.m9900b() != 1.0f) {
            this.f12628a.preScale(c5324dMo9552h.m9899a(), c5324dMo9552h.m9900b());
        }
        PointF pointFMo9552h2 = this.f12629b.mo9552h();
        float f3 = pointFMo9552h2.x;
        if (f3 != 0.0f || pointFMo9552h2.y != 0.0f) {
            this.f12628a.preTranslate(-f3, -pointFMo9552h2.y);
        }
        return this.f12628a;
    }

    /* renamed from: f */
    public Matrix m9578f(float f2) {
        PointF pointFMo9552h = this.f12630c.mo9552h();
        PointF pointFMo9552h2 = this.f12629b.mo9552h();
        C5324d c5324dMo9552h = this.f12631d.mo9552h();
        float fFloatValue = this.f12632e.mo9552h().floatValue();
        this.f12628a.reset();
        this.f12628a.preTranslate(pointFMo9552h.x * f2, pointFMo9552h.y * f2);
        double d2 = f2;
        this.f12628a.preScale((float) Math.pow(c5324dMo9552h.m9899a(), d2), (float) Math.pow(c5324dMo9552h.m9900b(), d2));
        this.f12628a.preRotate(fFloatValue * f2, pointFMo9552h2.x, pointFMo9552h2.y);
        return this.f12628a;
    }

    /* renamed from: g */
    public AbstractC5211a<?, Integer> m9579g() {
        return this.f12633f;
    }

    /* renamed from: h */
    public AbstractC5211a<?, Float> m9580h() {
        return this.f12634g;
    }

    /* renamed from: i */
    public void m9581i(float f2) {
        this.f12629b.mo9556l(f2);
        this.f12630c.mo9556l(f2);
        this.f12631d.mo9556l(f2);
        this.f12632e.mo9556l(f2);
        this.f12633f.mo9556l(f2);
        AbstractC5211a<?, Float> abstractC5211a = this.f12634g;
        if (abstractC5211a != null) {
            abstractC5211a.mo9556l(f2);
        }
        AbstractC5211a<?, Float> abstractC5211a2 = this.f12635h;
        if (abstractC5211a2 != null) {
            abstractC5211a2.mo9556l(f2);
        }
    }
}
