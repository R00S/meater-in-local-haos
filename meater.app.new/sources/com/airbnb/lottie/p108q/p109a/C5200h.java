package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.p114j.C5253c;
import com.airbnb.lottie.p112s.p114j.C5255e;
import com.airbnb.lottie.p112s.p114j.EnumC5256f;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import p024c.p041e.C0870d;

/* compiled from: GradientStrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.h */
/* loaded from: classes.dex */
public class C5200h extends AbstractC5193a {

    /* renamed from: o */
    private final String f12543o;

    /* renamed from: p */
    private final C0870d<LinearGradient> f12544p;

    /* renamed from: q */
    private final C0870d<RadialGradient> f12545q;

    /* renamed from: r */
    private final RectF f12546r;

    /* renamed from: s */
    private final EnumC5256f f12547s;

    /* renamed from: t */
    private final int f12548t;

    /* renamed from: u */
    private final AbstractC5211a<C5253c, C5253c> f12549u;

    /* renamed from: v */
    private final AbstractC5211a<PointF, PointF> f12550v;

    /* renamed from: w */
    private final AbstractC5211a<PointF, PointF> f12551w;

    public C5200h(C5182f c5182f, AbstractC5268a abstractC5268a, C5255e c5255e) {
        super(c5182f, abstractC5268a, c5255e.m9643b().m9701g(), c5255e.m9648g().m9702g(), c5255e.m9650i(), c5255e.m9652k(), c5255e.m9654m(), c5255e.m9649h(), c5255e.m9644c());
        this.f12544p = new C0870d<>();
        this.f12545q = new C0870d<>();
        this.f12546r = new RectF();
        this.f12543o = c5255e.m9651j();
        this.f12547s = c5255e.m9647f();
        this.f12548t = (int) (c5182f.m9468j().m9398d() / 32.0f);
        AbstractC5211a<C5253c, C5253c> abstractC5211aMo9617a = c5255e.m9646e().mo9617a();
        this.f12549u = abstractC5211aMo9617a;
        abstractC5211aMo9617a.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a2 = c5255e.m9653l().mo9617a();
        this.f12550v = abstractC5211aMo9617a2;
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a3 = c5255e.m9645d().mo9617a();
        this.f12551w = abstractC5211aMo9617a3;
        abstractC5211aMo9617a3.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a3);
    }

    /* renamed from: j */
    private int m9529j() {
        int iRound = Math.round(this.f12550v.m9551f() * this.f12548t);
        int iRound2 = Math.round(this.f12551w.m9551f() * this.f12548t);
        int iRound3 = Math.round(this.f12549u.m9551f() * this.f12548t);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    /* renamed from: k */
    private LinearGradient m9530k() {
        long jM9529j = m9529j();
        LinearGradient linearGradientM5438g = this.f12544p.m5438g(jM9529j);
        if (linearGradientM5438g != null) {
            return linearGradientM5438g;
        }
        PointF pointFMo9552h = this.f12550v.mo9552h();
        PointF pointFMo9552h2 = this.f12551w.mo9552h();
        C5253c c5253cMo9552h = this.f12549u.mo9552h();
        int[] iArrM9632a = c5253cMo9552h.m9632a();
        float[] fArrM9633b = c5253cMo9552h.m9633b();
        RectF rectF = this.f12546r;
        int iWidth = (int) (rectF.left + (rectF.width() / 2.0f) + pointFMo9552h.x);
        RectF rectF2 = this.f12546r;
        int iHeight = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointFMo9552h.y);
        RectF rectF3 = this.f12546r;
        int iWidth2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointFMo9552h2.x);
        RectF rectF4 = this.f12546r;
        LinearGradient linearGradient = new LinearGradient(iWidth, iHeight, iWidth2, (int) (rectF4.top + (rectF4.height() / 2.0f) + pointFMo9552h2.y), iArrM9632a, fArrM9633b, Shader.TileMode.CLAMP);
        this.f12544p.m5442k(jM9529j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m9531l() {
        long jM9529j = m9529j();
        RadialGradient radialGradientM5438g = this.f12545q.m5438g(jM9529j);
        if (radialGradientM5438g != null) {
            return radialGradientM5438g;
        }
        PointF pointFMo9552h = this.f12550v.mo9552h();
        PointF pointFMo9552h2 = this.f12551w.mo9552h();
        C5253c c5253cMo9552h = this.f12549u.mo9552h();
        int[] iArrM9632a = c5253cMo9552h.m9632a();
        float[] fArrM9633b = c5253cMo9552h.m9633b();
        RectF rectF = this.f12546r;
        int iWidth = (int) (rectF.left + (rectF.width() / 2.0f) + pointFMo9552h.x);
        RectF rectF2 = this.f12546r;
        int iHeight = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointFMo9552h.y);
        RectF rectF3 = this.f12546r;
        int iWidth2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointFMo9552h2.x);
        RectF rectF4 = this.f12546r;
        RadialGradient radialGradient = new RadialGradient(iWidth, iHeight, (float) Math.hypot(iWidth2 - iWidth, ((int) ((rectF4.top + (rectF4.height() / 2.0f)) + pointFMo9552h2.y)) - iHeight), iArrM9632a, fArrM9633b, Shader.TileMode.CLAMP);
        this.f12545q.m5442k(jM9529j, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5193a, com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        mo9515d(this.f12546r, matrix);
        if (this.f12547s == EnumC5256f.Linear) {
            this.f12493i.setShader(m9530k());
        } else {
            this.f12493i.setShader(m9531l());
        }
        super.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12543o;
    }
}
