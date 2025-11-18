package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p112s.p114j.C5266p;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p119w.C5323c;

/* compiled from: StrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.q */
/* loaded from: classes.dex */
public class C5209q extends AbstractC5193a {

    /* renamed from: o */
    private final AbstractC5268a f12597o;

    /* renamed from: p */
    private final String f12598p;

    /* renamed from: q */
    private final AbstractC5211a<Integer, Integer> f12599q;

    /* renamed from: r */
    private AbstractC5211a<ColorFilter, ColorFilter> f12600r;

    public C5209q(C5182f c5182f, AbstractC5268a abstractC5268a, C5266p c5266p) {
        super(c5182f, abstractC5268a, c5266p.m9692b().m9701g(), c5266p.m9695e().m9702g(), c5266p.m9697g(), c5266p.m9699i(), c5266p.m9700j(), c5266p.m9696f(), c5266p.m9694d());
        this.f12597o = abstractC5268a;
        this.f12598p = c5266p.m9698h();
        AbstractC5211a<Integer, Integer> abstractC5211aMo9617a = c5266p.m9693c().mo9617a();
        this.f12599q = abstractC5211aMo9617a;
        abstractC5211aMo9617a.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a);
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5193a, com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        this.f12493i.setColor(this.f12599q.mo9552h().intValue());
        AbstractC5211a<ColorFilter, ColorFilter> abstractC5211a = this.f12600r;
        if (abstractC5211a != null) {
            this.f12493i.setColorFilter(abstractC5211a.mo9552h());
        }
        super.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12598p;
    }

    @Override // com.airbnb.lottie.p108q.p109a.AbstractC5193a, com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        super.mo9517h(t, c5323c);
        if (t == InterfaceC5186j.f12396b) {
            this.f12599q.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12418x) {
            if (c5323c == null) {
                this.f12600r = null;
                return;
            }
            C5226p c5226p = new C5226p(c5323c);
            this.f12600r = c5226p;
            c5226p.m9548a(this);
            this.f12597o.m9723i(this.f12599q);
        }
    }
}
