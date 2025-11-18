package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5225o;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5261k;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* renamed from: com.airbnb.lottie.q.a.o */
/* loaded from: classes.dex */
public class C5207o implements InterfaceC5196d, InterfaceC5204l, InterfaceC5201i, AbstractC5211a.a, InterfaceC5202j {

    /* renamed from: a */
    private final Matrix f12582a = new Matrix();

    /* renamed from: b */
    private final Path f12583b = new Path();

    /* renamed from: c */
    private final C5182f f12584c;

    /* renamed from: d */
    private final AbstractC5268a f12585d;

    /* renamed from: e */
    private final String f12586e;

    /* renamed from: f */
    private final AbstractC5211a<Float, Float> f12587f;

    /* renamed from: g */
    private final AbstractC5211a<Float, Float> f12588g;

    /* renamed from: h */
    private final C5225o f12589h;

    /* renamed from: i */
    private C5195c f12590i;

    public C5207o(C5182f c5182f, AbstractC5268a abstractC5268a, C5261k c5261k) {
        this.f12584c = c5182f;
        this.f12585d = abstractC5268a;
        this.f12586e = c5261k.m9676c();
        AbstractC5211a<Float, Float> abstractC5211aMo9617a = c5261k.m9675b().mo9617a();
        this.f12587f = abstractC5211aMo9617a;
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5211aMo9617a.m9548a(this);
        AbstractC5211a<Float, Float> abstractC5211aMo9617a2 = c5261k.m9677d().mo9617a();
        this.f12588g = abstractC5211aMo9617a2;
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        abstractC5211aMo9617a2.m9548a(this);
        C5225o c5225oM9620b = c5261k.m9678e().m9620b();
        this.f12589h = c5225oM9620b;
        c5225oM9620b.m9573a(abstractC5268a);
        c5225oM9620b.m9574b(this);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12584c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        this.f12590i.mo9513b(list, list2);
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        C5319e.m9882l(c5233e, i2, list, c5233e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12590i.mo9515d(rectF, matrix);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5201i
    /* renamed from: e */
    public void mo9532e(ListIterator<InterfaceC5194b> listIterator) {
        if (this.f12590i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f12590i = new C5195c(this.f12584c, this.f12585d, "Repeater", arrayList, null);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = this.f12587f.mo9552h().floatValue();
        float fFloatValue2 = this.f12588g.mo9552h().floatValue();
        float fFloatValue3 = this.f12589h.m9580h().mo9552h().floatValue() / 100.0f;
        float fFloatValue4 = this.f12589h.m9576d().mo9552h().floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            this.f12582a.set(matrix);
            float f2 = i3;
            this.f12582a.preConcat(this.f12589h.m9578f(f2 + fFloatValue2));
            this.f12590i.mo9516f(canvas, this.f12582a, (int) (i2 * C5319e.m9880j(fFloatValue3, fFloatValue4, f2 / fFloatValue)));
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5204l
    /* renamed from: g */
    public Path mo9522g() {
        Path pathMo9522g = this.f12590i.mo9522g();
        this.f12583b.reset();
        float fFloatValue = this.f12587f.mo9552h().floatValue();
        float fFloatValue2 = this.f12588g.mo9552h().floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f12582a.set(this.f12589h.m9578f(i2 + fFloatValue2));
            this.f12583b.addPath(pathMo9522g, this.f12582a);
        }
        return this.f12583b;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12586e;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        if (this.f12589h.m9575c(t, c5323c)) {
            return;
        }
        if (t == InterfaceC5186j.f12407m) {
            this.f12587f.m9557m(c5323c);
        } else if (t == InterfaceC5186j.f12408n) {
            this.f12588g.m9557m(c5323c);
        }
    }
}
