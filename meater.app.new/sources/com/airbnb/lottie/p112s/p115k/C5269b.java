package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p115k.C5271d;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.List;
import p024c.p041e.C0870d;

/* compiled from: CompositionLayer.java */
/* renamed from: com.airbnb.lottie.s.k.b */
/* loaded from: classes.dex */
public class C5269b extends AbstractC5268a {

    /* renamed from: w */
    private AbstractC5211a<Float, Float> f12825w;

    /* renamed from: x */
    private final List<AbstractC5268a> f12826x;

    /* renamed from: y */
    private final RectF f12827y;

    /* renamed from: z */
    private final RectF f12828z;

    /* compiled from: CompositionLayer.java */
    /* renamed from: com.airbnb.lottie.s.k.b$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12829a;

        static {
            int[] iArr = new int[C5271d.b.values().length];
            f12829a = iArr;
            try {
                iArr[C5271d.b.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12829a[C5271d.b.Invert.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5269b(C5182f c5182f, C5271d c5271d, List<C5271d> list, C5180d c5180d) {
        int i2;
        AbstractC5268a abstractC5268a;
        super(c5182f, c5271d);
        this.f12826x = new ArrayList();
        this.f12827y = new RectF();
        this.f12828z = new RectF();
        C5238b c5238bM9750s = c5271d.m9750s();
        if (c5238bM9750s != null) {
            AbstractC5211a<Float, Float> abstractC5211aMo9617a = c5238bM9750s.mo9617a();
            this.f12825w = abstractC5211aMo9617a;
            m9723i(abstractC5211aMo9617a);
            this.f12825w.m9548a(this);
        } else {
            this.f12825w = null;
        }
        C0870d c0870d = new C0870d(c5180d.m9404j().size());
        int size = list.size() - 1;
        AbstractC5268a abstractC5268a2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C5271d c5271d2 = list.get(size);
            AbstractC5268a abstractC5268aM9716o = AbstractC5268a.m9716o(c5271d2, c5182f, c5180d);
            if (abstractC5268aM9716o != null) {
                c0870d.m5442k(abstractC5268aM9716o.m9725p().m9733b(), abstractC5268aM9716o);
                if (abstractC5268a2 != null) {
                    abstractC5268a2.m9729y(abstractC5268aM9716o);
                    abstractC5268a2 = null;
                } else {
                    this.f12826x.add(0, abstractC5268aM9716o);
                    int i3 = a.f12829a[c5271d2.m9737f().ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        abstractC5268a2 = abstractC5268aM9716o;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < c0870d.m5445n(); i2++) {
            AbstractC5268a abstractC5268a3 = (AbstractC5268a) c0870d.m5438g(c0870d.m5441j(i2));
            if (abstractC5268a3 != null && (abstractC5268a = (AbstractC5268a) c0870d.m5438g(abstractC5268a3.m9725p().m9739h())) != null) {
                abstractC5268a3.m9730z(abstractC5268a);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: A */
    public void mo9722A(float f2) {
        super.mo9722A(f2);
        if (this.f12825w != null) {
            f2 = ((long) (this.f12825w.mo9552h().floatValue() * 1000.0f)) / this.f12812n.m9468j().m9398d();
        }
        if (this.f12813o.m9751t() != 0.0f) {
            f2 /= this.f12813o.m9751t();
        }
        float fM9747p = f2 - this.f12813o.m9747p();
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            this.f12826x.get(size).mo9722A(fM9747p);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        this.f12827y.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            this.f12826x.get(size).mo9515d(this.f12827y, this.f12811m);
            if (rectF.isEmpty()) {
                rectF.set(this.f12827y);
            } else {
                rectF.set(Math.min(rectF.left, this.f12827y.left), Math.min(rectF.top, this.f12827y.top), Math.max(rectF.right, this.f12827y.right), Math.max(rectF.bottom, this.f12827y.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        super.mo9517h(t, c5323c);
        if (t == InterfaceC5186j.f12417w) {
            if (c5323c == null) {
                this.f12825w = null;
                return;
            }
            C5226p c5226p = new C5226p(c5323c);
            this.f12825w = c5226p;
            m9723i(c5226p);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        C5179c.m9391a("CompositionLayer#draw");
        canvas.save();
        this.f12828z.set(0.0f, 0.0f, this.f12813o.m9741j(), this.f12813o.m9740i());
        matrix.mapRect(this.f12828z);
        for (int size = this.f12826x.size() - 1; size >= 0; size--) {
            if (!this.f12828z.isEmpty() ? canvas.clipRect(this.f12828z) : true) {
                this.f12826x.get(size).mo9516f(canvas, matrix, i2);
            }
        }
        canvas.restore();
        C5179c.m9393c("CompositionLayer#draw");
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: w */
    protected void mo9728w(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        for (int i3 = 0; i3 < this.f12826x.size(); i3++) {
            this.f12826x.get(i3).mo9514c(c5233e, i2, list, c5233e2);
        }
    }
}
