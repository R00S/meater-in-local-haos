package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5253c;
import com.airbnb.lottie.p112s.p114j.C5254d;
import com.airbnb.lottie.p112s.p114j.EnumC5256f;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: GradientFillContent.java */
/* renamed from: com.airbnb.lottie.q.a.g */
/* loaded from: classes.dex */
public class C5199g implements InterfaceC5196d, AbstractC5211a.a, InterfaceC5202j {

    /* renamed from: a */
    private final String f12526a;

    /* renamed from: b */
    private final AbstractC5268a f12527b;

    /* renamed from: c */
    private final C0870d<LinearGradient> f12528c = new C0870d<>();

    /* renamed from: d */
    private final C0870d<RadialGradient> f12529d = new C0870d<>();

    /* renamed from: e */
    private final Matrix f12530e = new Matrix();

    /* renamed from: f */
    private final Path f12531f;

    /* renamed from: g */
    private final Paint f12532g;

    /* renamed from: h */
    private final RectF f12533h;

    /* renamed from: i */
    private final List<InterfaceC5204l> f12534i;

    /* renamed from: j */
    private final EnumC5256f f12535j;

    /* renamed from: k */
    private final AbstractC5211a<C5253c, C5253c> f12536k;

    /* renamed from: l */
    private final AbstractC5211a<Integer, Integer> f12537l;

    /* renamed from: m */
    private final AbstractC5211a<PointF, PointF> f12538m;

    /* renamed from: n */
    private final AbstractC5211a<PointF, PointF> f12539n;

    /* renamed from: o */
    private AbstractC5211a<ColorFilter, ColorFilter> f12540o;

    /* renamed from: p */
    private final C5182f f12541p;

    /* renamed from: q */
    private final int f12542q;

    public C5199g(C5182f c5182f, AbstractC5268a abstractC5268a, C5254d c5254d) {
        Path path = new Path();
        this.f12531f = path;
        this.f12532g = new Paint(1);
        this.f12533h = new RectF();
        this.f12534i = new ArrayList();
        this.f12527b = abstractC5268a;
        this.f12526a = c5254d.m9640f();
        this.f12541p = c5182f;
        this.f12535j = c5254d.m9639e();
        path.setFillType(c5254d.m9637c());
        this.f12542q = (int) (c5182f.m9468j().m9398d() / 32.0f);
        AbstractC5211a<C5253c, C5253c> abstractC5211aMo9617a = c5254d.m9638d().mo9617a();
        this.f12536k = abstractC5211aMo9617a;
        abstractC5211aMo9617a.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        AbstractC5211a<Integer, Integer> abstractC5211aMo9617a2 = c5254d.m9641g().mo9617a();
        this.f12537l = abstractC5211aMo9617a2;
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a3 = c5254d.m9642h().mo9617a();
        this.f12538m = abstractC5211aMo9617a3;
        abstractC5211aMo9617a3.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a3);
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a4 = c5254d.m9636b().mo9617a();
        this.f12539n = abstractC5211aMo9617a4;
        abstractC5211aMo9617a4.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a4);
    }

    /* renamed from: e */
    private int m9526e() {
        int iRound = Math.round(this.f12538m.m9551f() * this.f12542q);
        int iRound2 = Math.round(this.f12539n.m9551f() * this.f12542q);
        int iRound3 = Math.round(this.f12536k.m9551f() * this.f12542q);
        int i2 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    /* renamed from: i */
    private LinearGradient m9527i() {
        long jM9526e = m9526e();
        LinearGradient linearGradientM5438g = this.f12528c.m5438g(jM9526e);
        if (linearGradientM5438g != null) {
            return linearGradientM5438g;
        }
        PointF pointFMo9552h = this.f12538m.mo9552h();
        PointF pointFMo9552h2 = this.f12539n.mo9552h();
        C5253c c5253cMo9552h = this.f12536k.mo9552h();
        LinearGradient linearGradient = new LinearGradient(pointFMo9552h.x, pointFMo9552h.y, pointFMo9552h2.x, pointFMo9552h2.y, c5253cMo9552h.m9632a(), c5253cMo9552h.m9633b(), Shader.TileMode.CLAMP);
        this.f12528c.m5442k(jM9526e, linearGradient);
        return linearGradient;
    }

    /* renamed from: j */
    private RadialGradient m9528j() {
        long jM9526e = m9526e();
        RadialGradient radialGradientM5438g = this.f12529d.m5438g(jM9526e);
        if (radialGradientM5438g != null) {
            return radialGradientM5438g;
        }
        PointF pointFMo9552h = this.f12538m.mo9552h();
        PointF pointFMo9552h2 = this.f12539n.mo9552h();
        C5253c c5253cMo9552h = this.f12536k.mo9552h();
        int[] iArrM9632a = c5253cMo9552h.m9632a();
        float[] fArrM9633b = c5253cMo9552h.m9633b();
        RadialGradient radialGradient = new RadialGradient(pointFMo9552h.x, pointFMo9552h.y, (float) Math.hypot(pointFMo9552h2.x - r6, pointFMo9552h2.y - r7), iArrM9632a, fArrM9633b, Shader.TileMode.CLAMP);
        this.f12529d.m5442k(jM9526e, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12541p.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list2.get(i2);
            if (interfaceC5194b instanceof InterfaceC5204l) {
                this.f12534i.add((InterfaceC5204l) interfaceC5194b);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        C5319e.m9882l(c5233e, i2, list, c5233e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12531f.reset();
        for (int i2 = 0; i2 < this.f12534i.size(); i2++) {
            this.f12531f.addPath(this.f12534i.get(i2).mo9522g(), matrix);
        }
        this.f12531f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5179c.m9391a("GradientFillContent#draw");
        this.f12531f.reset();
        for (int i3 = 0; i3 < this.f12534i.size(); i3++) {
            this.f12531f.addPath(this.f12534i.get(i3).mo9522g(), matrix);
        }
        this.f12531f.computeBounds(this.f12533h, false);
        Shader shaderM9527i = this.f12535j == EnumC5256f.Linear ? m9527i() : m9528j();
        this.f12530e.set(matrix);
        shaderM9527i.setLocalMatrix(this.f12530e);
        this.f12532g.setShader(shaderM9527i);
        AbstractC5211a<ColorFilter, ColorFilter> abstractC5211a = this.f12540o;
        if (abstractC5211a != null) {
            this.f12532g.setColorFilter(abstractC5211a.mo9552h());
        }
        this.f12532g.setAlpha(C5319e.m9873c((int) ((((i2 / 255.0f) * this.f12537l.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f12531f, this.f12532g);
        C5179c.m9393c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12526a;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        if (t == InterfaceC5186j.f12418x) {
            if (c5323c == null) {
                this.f12540o = null;
                return;
            }
            C5226p c5226p = new C5226p(c5323c);
            this.f12540o = c5226p;
            c5226p.m9548a(this);
            this.f12527b.m9723i(this.f12540o);
        }
    }
}
