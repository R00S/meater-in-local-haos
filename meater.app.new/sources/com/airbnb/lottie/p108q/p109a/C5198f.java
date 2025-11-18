package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5263m;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* renamed from: com.airbnb.lottie.q.a.f */
/* loaded from: classes.dex */
public class C5198f implements InterfaceC5196d, AbstractC5211a.a, InterfaceC5202j {

    /* renamed from: a */
    private final Path f12517a;

    /* renamed from: b */
    private final Paint f12518b;

    /* renamed from: c */
    private final AbstractC5268a f12519c;

    /* renamed from: d */
    private final String f12520d;

    /* renamed from: e */
    private final List<InterfaceC5204l> f12521e;

    /* renamed from: f */
    private final AbstractC5211a<Integer, Integer> f12522f;

    /* renamed from: g */
    private final AbstractC5211a<Integer, Integer> f12523g;

    /* renamed from: h */
    private AbstractC5211a<ColorFilter, ColorFilter> f12524h;

    /* renamed from: i */
    private final C5182f f12525i;

    public C5198f(C5182f c5182f, AbstractC5268a abstractC5268a, C5263m c5263m) {
        Path path = new Path();
        this.f12517a = path;
        this.f12518b = new Paint(1);
        this.f12521e = new ArrayList();
        this.f12519c = abstractC5268a;
        this.f12520d = c5263m.m9686d();
        this.f12525i = c5182f;
        if (c5263m.m9684b() == null || c5263m.m9687e() == null) {
            this.f12522f = null;
            this.f12523g = null;
            return;
        }
        path.setFillType(c5263m.m9685c());
        AbstractC5211a<Integer, Integer> abstractC5211aMo9617a = c5263m.m9684b().mo9617a();
        this.f12522f = abstractC5211aMo9617a;
        abstractC5211aMo9617a.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        AbstractC5211a<Integer, Integer> abstractC5211aMo9617a2 = c5263m.m9687e().mo9617a();
        this.f12523g = abstractC5211aMo9617a2;
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12525i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list2.get(i2);
            if (interfaceC5194b instanceof InterfaceC5204l) {
                this.f12521e.add((InterfaceC5204l) interfaceC5194b);
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
        this.f12517a.reset();
        for (int i2 = 0; i2 < this.f12521e.size(); i2++) {
            this.f12517a.addPath(this.f12521e.get(i2).mo9522g(), matrix);
        }
        this.f12517a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5179c.m9391a("FillContent#draw");
        this.f12518b.setColor(this.f12522f.mo9552h().intValue());
        this.f12518b.setAlpha(C5319e.m9873c((int) ((((i2 / 255.0f) * this.f12523g.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        AbstractC5211a<ColorFilter, ColorFilter> abstractC5211a = this.f12524h;
        if (abstractC5211a != null) {
            this.f12518b.setColorFilter(abstractC5211a.mo9552h());
        }
        this.f12517a.reset();
        for (int i3 = 0; i3 < this.f12521e.size(); i3++) {
            this.f12517a.addPath(this.f12521e.get(i3).mo9522g(), matrix);
        }
        canvas.drawPath(this.f12517a, this.f12518b);
        C5179c.m9393c("FillContent#draw");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12520d;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        if (t == InterfaceC5186j.f12395a) {
            this.f12522f.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12398d) {
            this.f12523g.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12418x) {
            if (c5323c == null) {
                this.f12524h = null;
                return;
            }
            C5226p c5226p = new C5226p(c5323c);
            this.f12524h = c5226p;
            c5226p.m9548a(this);
            this.f12519c.m9723i(this.f12524h);
        }
    }
}
