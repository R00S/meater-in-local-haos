package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5259i;
import com.airbnb.lottie.p112s.p114j.C5267q;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: PolystarContent.java */
/* renamed from: com.airbnb.lottie.q.a.m */
/* loaded from: classes.dex */
public class C5205m implements InterfaceC5204l, AbstractC5211a.a, InterfaceC5202j {

    /* renamed from: a */
    private final Path f12559a = new Path();

    /* renamed from: b */
    private final String f12560b;

    /* renamed from: c */
    private final C5182f f12561c;

    /* renamed from: d */
    private final C5259i.a f12562d;

    /* renamed from: e */
    private final AbstractC5211a<?, Float> f12563e;

    /* renamed from: f */
    private final AbstractC5211a<?, PointF> f12564f;

    /* renamed from: g */
    private final AbstractC5211a<?, Float> f12565g;

    /* renamed from: h */
    private final AbstractC5211a<?, Float> f12566h;

    /* renamed from: i */
    private final AbstractC5211a<?, Float> f12567i;

    /* renamed from: j */
    private final AbstractC5211a<?, Float> f12568j;

    /* renamed from: k */
    private final AbstractC5211a<?, Float> f12569k;

    /* renamed from: l */
    private C5210r f12570l;

    /* renamed from: m */
    private boolean f12571m;

    /* compiled from: PolystarContent.java */
    /* renamed from: com.airbnb.lottie.q.a.m$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12572a;

        static {
            int[] iArr = new int[C5259i.a.values().length];
            f12572a = iArr;
            try {
                iArr[C5259i.a.Star.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12572a[C5259i.a.Polygon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5205m(C5182f c5182f, AbstractC5268a abstractC5268a, C5259i c5259i) {
        this.f12561c = c5182f;
        this.f12560b = c5259i.m9663d();
        C5259i.a aVarM9669j = c5259i.m9669j();
        this.f12562d = aVarM9669j;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a = c5259i.m9666g().mo9617a();
        this.f12563e = abstractC5211aMo9617a;
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a2 = c5259i.m9667h().mo9617a();
        this.f12564f = abstractC5211aMo9617a2;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a3 = c5259i.m9668i().mo9617a();
        this.f12565g = abstractC5211aMo9617a3;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a4 = c5259i.m9664e().mo9617a();
        this.f12567i = abstractC5211aMo9617a4;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a5 = c5259i.m9665f().mo9617a();
        this.f12569k = abstractC5211aMo9617a5;
        C5259i.a aVar = C5259i.a.Star;
        if (aVarM9669j == aVar) {
            this.f12566h = c5259i.m9661b().mo9617a();
            this.f12568j = c5259i.m9662c().mo9617a();
        } else {
            this.f12566h = null;
            this.f12568j = null;
        }
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        abstractC5268a.m9723i(abstractC5211aMo9617a3);
        abstractC5268a.m9723i(abstractC5211aMo9617a4);
        abstractC5268a.m9723i(abstractC5211aMo9617a5);
        if (aVarM9669j == aVar) {
            abstractC5268a.m9723i(this.f12566h);
            abstractC5268a.m9723i(this.f12568j);
        }
        abstractC5211aMo9617a.m9548a(this);
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5211aMo9617a3.m9548a(this);
        abstractC5211aMo9617a4.m9548a(this);
        abstractC5211aMo9617a5.m9548a(this);
        if (aVarM9669j == aVar) {
            this.f12566h.m9548a(this);
            this.f12568j.m9548a(this);
        }
    }

    /* renamed from: e */
    private void m9535e() {
        double d2;
        double d3;
        double d4;
        int i2;
        int iFloor = (int) Math.floor(this.f12563e.mo9552h().floatValue());
        double radians = Math.toRadians((this.f12565g == null ? 0.0d : r2.mo9552h().floatValue()) - 90.0d);
        double d5 = iFloor;
        Double.isNaN(d5);
        float fFloatValue = this.f12569k.mo9552h().floatValue() / 100.0f;
        float fFloatValue2 = this.f12567i.mo9552h().floatValue();
        double d6 = fFloatValue2;
        double dCos = Math.cos(radians);
        Double.isNaN(d6);
        float f2 = (float) (dCos * d6);
        double dSin = Math.sin(radians);
        Double.isNaN(d6);
        float f3 = (float) (dSin * d6);
        this.f12559a.moveTo(f2, f3);
        double d7 = (float) (6.283185307179586d / d5);
        Double.isNaN(d7);
        double d8 = radians + d7;
        double dCeil = Math.ceil(d5);
        int i3 = 0;
        while (i3 < dCeil) {
            double dCos2 = Math.cos(d8);
            Double.isNaN(d6);
            float f4 = (float) (dCos2 * d6);
            double dSin2 = Math.sin(d8);
            Double.isNaN(d6);
            double d9 = dCeil;
            float f5 = (float) (d6 * dSin2);
            if (fFloatValue != 0.0f) {
                d3 = d6;
                i2 = i3;
                d2 = d8;
                double dAtan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                float fCos = (float) Math.cos(dAtan2);
                float fSin = (float) Math.sin(dAtan2);
                d4 = d7;
                double dAtan22 = (float) (Math.atan2(f5, f4) - 1.5707963267948966d);
                float f6 = fFloatValue2 * fFloatValue * 0.25f;
                this.f12559a.cubicTo(f2 - (fCos * f6), f3 - (fSin * f6), f4 + (((float) Math.cos(dAtan22)) * f6), f5 + (f6 * ((float) Math.sin(dAtan22))), f4, f5);
            } else {
                d2 = d8;
                d3 = d6;
                d4 = d7;
                i2 = i3;
                this.f12559a.lineTo(f4, f5);
            }
            Double.isNaN(d4);
            d8 = d2 + d4;
            i3 = i2 + 1;
            f3 = f5;
            f2 = f4;
            dCeil = d9;
            d6 = d3;
            d7 = d4;
        }
        PointF pointFMo9552h = this.f12564f.mo9552h();
        this.f12559a.offset(pointFMo9552h.x, pointFMo9552h.y);
        this.f12559a.close();
    }

    /* renamed from: i */
    private void m9536i() {
        double d2;
        float f2;
        float f3;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        double d4;
        float f12;
        float f13;
        float fFloatValue = this.f12563e.mo9552h().floatValue();
        double radians = Math.toRadians((this.f12565g == null ? 0.0d : r2.mo9552h().floatValue()) - 90.0d);
        double d5 = fFloatValue;
        Double.isNaN(d5);
        float f14 = (float) (6.283185307179586d / d5);
        float f15 = f14 / 2.0f;
        float f16 = fFloatValue - ((int) fFloatValue);
        if (f16 != 0.0f) {
            double d6 = (1.0f - f16) * f15;
            Double.isNaN(d6);
            radians += d6;
        }
        float fFloatValue2 = this.f12567i.mo9552h().floatValue();
        float fFloatValue3 = this.f12566h.mo9552h().floatValue();
        AbstractC5211a<?, Float> abstractC5211a = this.f12568j;
        float fFloatValue4 = abstractC5211a != null ? abstractC5211a.mo9552h().floatValue() / 100.0f : 0.0f;
        AbstractC5211a<?, Float> abstractC5211a2 = this.f12569k;
        float fFloatValue5 = abstractC5211a2 != null ? abstractC5211a2.mo9552h().floatValue() / 100.0f : 0.0f;
        if (f16 != 0.0f) {
            float f17 = ((fFloatValue2 - fFloatValue3) * f16) + fFloatValue3;
            double d7 = f17;
            double dCos = Math.cos(radians);
            Double.isNaN(d7);
            d2 = d5;
            float f18 = (float) (d7 * dCos);
            double dSin = Math.sin(radians);
            Double.isNaN(d7);
            float f19 = (float) (d7 * dSin);
            this.f12559a.moveTo(f18, f19);
            double d8 = (f14 * f16) / 2.0f;
            Double.isNaN(d8);
            d3 = radians + d8;
            f4 = f18;
            f6 = f17;
            f2 = fFloatValue2;
            f5 = f19;
            f3 = f15;
        } else {
            d2 = d5;
            f2 = fFloatValue2;
            double d9 = f2;
            double dCos2 = Math.cos(radians);
            Double.isNaN(d9);
            f3 = f15;
            f4 = (float) (d9 * dCos2);
            double dSin2 = Math.sin(radians);
            Double.isNaN(d9);
            f5 = (float) (d9 * dSin2);
            this.f12559a.moveTo(f4, f5);
            double d10 = f3;
            Double.isNaN(d10);
            d3 = radians + d10;
            f6 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i2 = 0;
        float f20 = fFloatValue5;
        boolean z = false;
        while (true) {
            double d11 = i2;
            if (d11 >= dCeil) {
                PointF pointFMo9552h = this.f12564f.mo9552h();
                this.f12559a.offset(pointFMo9552h.x, pointFMo9552h.y);
                this.f12559a.close();
                return;
            }
            float f21 = z ? f2 : fFloatValue3;
            float f22 = (f6 == 0.0f || d11 != dCeil - 2.0d) ? f3 : (f14 * f16) / 2.0f;
            if (f6 == 0.0f || d11 != dCeil - 1.0d) {
                f7 = f14;
                f8 = f21;
                f9 = f2;
            } else {
                f7 = f14;
                f9 = f2;
                f8 = f6;
            }
            double d12 = f8;
            double dCos3 = Math.cos(d3);
            Double.isNaN(d12);
            float f23 = (float) (d12 * dCos3);
            double dSin3 = Math.sin(d3);
            Double.isNaN(d12);
            float f24 = (float) (d12 * dSin3);
            if (fFloatValue4 == 0.0f && f20 == 0.0f) {
                this.f12559a.lineTo(f23, f24);
                d4 = d3;
                f10 = fFloatValue3;
                f11 = fFloatValue4;
                f12 = f3;
                f13 = f22;
            } else {
                f10 = fFloatValue3;
                f11 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(f5, f4) - 1.5707963267948966d);
                float fCos = (float) Math.cos(dAtan2);
                float fSin = (float) Math.sin(dAtan2);
                d4 = d3;
                f12 = f3;
                f13 = f22;
                double dAtan22 = (float) (Math.atan2(f24, f23) - 1.5707963267948966d);
                float fCos2 = (float) Math.cos(dAtan22);
                float fSin2 = (float) Math.sin(dAtan22);
                float f25 = z ? f11 : f20;
                float f26 = z ? f20 : f11;
                float f27 = (z ? f10 : f9) * f25 * 0.47829f;
                float f28 = fCos * f27;
                float f29 = f27 * fSin;
                float f30 = (z ? f9 : f10) * f26 * 0.47829f;
                float f31 = fCos2 * f30;
                float f32 = f30 * fSin2;
                if (f16 != 0.0f) {
                    if (i2 == 0) {
                        f28 *= f16;
                        f29 *= f16;
                    } else if (d11 == dCeil - 1.0d) {
                        f31 *= f16;
                        f32 *= f16;
                    }
                }
                this.f12559a.cubicTo(f4 - f28, f5 - f29, f23 + f31, f24 + f32, f23, f24);
            }
            double d13 = f13;
            Double.isNaN(d13);
            z = !z;
            i2++;
            f5 = f24;
            d3 = d4 + d13;
            f3 = f12;
            f4 = f23;
            f2 = f9;
            f14 = f7;
            fFloatValue3 = f10;
            fFloatValue4 = f11;
        }
    }

    /* renamed from: j */
    private void m9537j() {
        this.f12571m = false;
        this.f12561c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        m9537j();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list.get(i2);
            if (interfaceC5194b instanceof C5210r) {
                C5210r c5210r = (C5210r) interfaceC5194b;
                if (c5210r.m9544j() == C5267q.a.Simultaneously) {
                    this.f12570l = c5210r;
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
        if (this.f12571m) {
            return this.f12559a;
        }
        this.f12559a.reset();
        int i2 = a.f12572a[this.f12562d.ordinal()];
        if (i2 == 1) {
            m9536i();
        } else if (i2 == 2) {
            m9535e();
        }
        this.f12559a.close();
        C5320f.m9884b(this.f12559a, this.f12570l);
        this.f12571m = true;
        return this.f12559a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12560b;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        AbstractC5211a<?, Float> abstractC5211a;
        AbstractC5211a<?, Float> abstractC5211a2;
        if (t == InterfaceC5186j.f12409o) {
            this.f12563e.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12410p) {
            this.f12565g.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12402h) {
            this.f12564f.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12411q && (abstractC5211a2 = this.f12566h) != null) {
            abstractC5211a2.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12412r) {
            this.f12567i.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12413s && (abstractC5211a = this.f12568j) != null) {
            abstractC5211a.m9557m(c5323c);
        } else if (t == InterfaceC5186j.f12414t) {
            this.f12569k.m9557m(c5323c);
        }
    }
}
