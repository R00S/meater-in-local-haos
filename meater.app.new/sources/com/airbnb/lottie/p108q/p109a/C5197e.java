package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5251a;
import com.airbnb.lottie.p112s.p114j.C5267q;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: EllipseContent.java */
/* renamed from: com.airbnb.lottie.q.a.e */
/* loaded from: classes.dex */
public class C5197e implements InterfaceC5204l, AbstractC5211a.a, InterfaceC5202j {

    /* renamed from: a */
    private final Path f12509a = new Path();

    /* renamed from: b */
    private final String f12510b;

    /* renamed from: c */
    private final C5182f f12511c;

    /* renamed from: d */
    private final AbstractC5211a<?, PointF> f12512d;

    /* renamed from: e */
    private final AbstractC5211a<?, PointF> f12513e;

    /* renamed from: f */
    private final C5251a f12514f;

    /* renamed from: g */
    private C5210r f12515g;

    /* renamed from: h */
    private boolean f12516h;

    public C5197e(C5182f c5182f, AbstractC5268a abstractC5268a, C5251a c5251a) {
        this.f12510b = c5251a.m9628b();
        this.f12511c = c5182f;
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a = c5251a.m9630d().mo9617a();
        this.f12512d = abstractC5211aMo9617a;
        AbstractC5211a<PointF, PointF> abstractC5211aMo9617a2 = c5251a.m9629c().mo9617a();
        this.f12513e = abstractC5211aMo9617a2;
        this.f12514f = c5251a;
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        abstractC5211aMo9617a.m9548a(this);
        abstractC5211aMo9617a2.m9548a(this);
    }

    /* renamed from: e */
    private void m9525e() {
        this.f12516h = false;
        this.f12511c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        m9525e();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list.get(i2);
            if (interfaceC5194b instanceof C5210r) {
                C5210r c5210r = (C5210r) interfaceC5194b;
                if (c5210r.m9544j() == C5267q.a.Simultaneously) {
                    this.f12515g = c5210r;
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
        if (this.f12516h) {
            return this.f12509a;
        }
        this.f12509a.reset();
        PointF pointFMo9552h = this.f12512d.mo9552h();
        float f2 = pointFMo9552h.x / 2.0f;
        float f3 = pointFMo9552h.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f12509a.reset();
        if (this.f12514f.m9631e()) {
            float f6 = -f3;
            this.f12509a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f12509a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f12509a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f12509a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f12509a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f12509a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f12509a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f12509a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f12509a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f12509a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF pointFMo9552h2 = this.f12513e.mo9552h();
        this.f12509a.offset(pointFMo9552h2.x, pointFMo9552h2.y);
        this.f12509a.close();
        C5320f.m9884b(this.f12509a, this.f12515g);
        this.f12516h = true;
        return this.f12509a;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12510b;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        if (t == InterfaceC5186j.f12401g) {
            this.f12512d.m9557m(c5323c);
        } else if (t == InterfaceC5186j.f12402h) {
            this.f12513e.m9557m(c5323c);
        }
    }
}
