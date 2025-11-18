package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5260j;
import com.airbnb.lottie.p112s.p114j.C5267q;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: RectangleContent.java */
/* renamed from: com.airbnb.lottie.q.a.n */
/* loaded from: classes.dex */
public class C5206n implements AbstractC5211a.a, InterfaceC5202j, InterfaceC5204l {

    /* renamed from: a */
    private final Path f12573a = new Path();

    /* renamed from: b */
    private final RectF f12574b = new RectF();

    /* renamed from: c */
    private final String f12575c;

    /* renamed from: d */
    private final C5182f f12576d;

    /* renamed from: e */
    private final AbstractC5211a<?, PointF> f12577e;

    /* renamed from: f */
    private final AbstractC5211a<?, PointF> f12578f;

    /* renamed from: g */
    private final AbstractC5211a<?, Float> f12579g;

    /* renamed from: h */
    private C5210r f12580h;

    /* renamed from: i */
    private boolean f12581i;

    public C5206n(C5182f c5182f, AbstractC5268a abstractC5268a, C5260j c5260j) {
        this.f12575c = c5260j.m9672c();
        this.f12576d = c5182f;
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a = c5260j.m9673d().mo9617a();
        this.f12577e = abstractC5211aMo9617a;
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a2 = c5260j.m9674e().mo9617a();
        this.f12578f = abstractC5211aMo9617a2;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a3 = c5260j.m9671b().mo9617a();
        this.f12579g = abstractC5211aMo9617a3;
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        abstractC5268a.m9723i(abstractC5211aMo9617a3);
        abstractC5211aMo9617a.m9548a(this);
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5211aMo9617a3.m9548a(this);
    }

    /* renamed from: e */
    private void m9538e() {
        this.f12581i = false;
        this.f12576d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        m9538e();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list.get(i2);
            if (interfaceC5194b instanceof C5210r) {
                C5210r c5210r = (C5210r) interfaceC5194b;
                if (c5210r.m9544j() == C5267q.a.Simultaneously) {
                    this.f12580h = c5210r;
                    c5210r.m9540c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        C5319e.m9882l(c5233e, i2, list, c5233e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5204l
    /* renamed from: g */
    public Path mo9522g() {
        if (this.f12581i) {
            return this.f12573a;
        }
        this.f12573a.reset();
        PointF pointFMo9552h = this.f12578f.mo9552h();
        float f2 = pointFMo9552h.x / 2.0f;
        float f3 = pointFMo9552h.y / 2.0f;
        AbstractC5211a<?, Float> abstractC5211a = this.f12579g;
        float fFloatValue = abstractC5211a == null ? 0.0f : abstractC5211a.mo9552h().floatValue();
        float fMin = Math.min(f2, f3);
        if (fFloatValue > fMin) {
            fFloatValue = fMin;
        }
        PointF pointFMo9552h2 = this.f12577e.mo9552h();
        this.f12573a.moveTo(pointFMo9552h2.x + f2, (pointFMo9552h2.y - f3) + fFloatValue);
        this.f12573a.lineTo(pointFMo9552h2.x + f2, (pointFMo9552h2.y + f3) - fFloatValue);
        if (fFloatValue > 0.0f) {
            RectF rectF = this.f12574b;
            float f4 = pointFMo9552h2.x;
            float f5 = fFloatValue * 2.0f;
            float f6 = pointFMo9552h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f12573a.arcTo(this.f12574b, 0.0f, 90.0f, false);
        }
        this.f12573a.lineTo((pointFMo9552h2.x - f2) + fFloatValue, pointFMo9552h2.y + f3);
        if (fFloatValue > 0.0f) {
            RectF rectF2 = this.f12574b;
            float f7 = pointFMo9552h2.x;
            float f8 = pointFMo9552h2.y;
            float f9 = fFloatValue * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f12573a.arcTo(this.f12574b, 90.0f, 90.0f, false);
        }
        this.f12573a.lineTo(pointFMo9552h2.x - f2, (pointFMo9552h2.y - f3) + fFloatValue);
        if (fFloatValue > 0.0f) {
            RectF rectF3 = this.f12574b;
            float f10 = pointFMo9552h2.x;
            float f11 = pointFMo9552h2.y;
            float f12 = fFloatValue * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f12573a.arcTo(this.f12574b, 180.0f, 90.0f, false);
        }
        this.f12573a.lineTo((pointFMo9552h2.x + f2) - fFloatValue, pointFMo9552h2.y - f3);
        if (fFloatValue > 0.0f) {
            RectF rectF4 = this.f12574b;
            float f13 = pointFMo9552h2.x;
            float f14 = fFloatValue * 2.0f;
            float f15 = pointFMo9552h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f12573a.arcTo(this.f12574b, 270.0f, 90.0f, false);
        }
        this.f12573a.close();
        C5320f.m9884b(this.f12573a, this.f12580h);
        this.f12581i = true;
        return this.f12573a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12575c;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
    }
}
