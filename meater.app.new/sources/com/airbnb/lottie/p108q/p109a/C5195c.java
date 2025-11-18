package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5225o;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.InterfaceC5234f;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p114j.C5264n;
import com.airbnb.lottie.p112s.p114j.InterfaceC5252b;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* renamed from: com.airbnb.lottie.q.a.c */
/* loaded from: classes.dex */
public class C5195c implements InterfaceC5196d, InterfaceC5204l, AbstractC5211a.a, InterfaceC5234f {

    /* renamed from: a */
    private final Matrix f12501a;

    /* renamed from: b */
    private final Path f12502b;

    /* renamed from: c */
    private final RectF f12503c;

    /* renamed from: d */
    private final String f12504d;

    /* renamed from: e */
    private final List<InterfaceC5194b> f12505e;

    /* renamed from: f */
    private final C5182f f12506f;

    /* renamed from: g */
    private List<InterfaceC5204l> f12507g;

    /* renamed from: h */
    private C5225o f12508h;

    public C5195c(C5182f c5182f, AbstractC5268a abstractC5268a, C5264n c5264n) {
        this(c5182f, abstractC5268a, c5264n.m9689c(), m9520e(c5182f, abstractC5268a, c5264n.m9688b()), m9521i(c5264n.m9688b()));
    }

    /* renamed from: e */
    private static List<InterfaceC5194b> m9520e(C5182f c5182f, AbstractC5268a abstractC5268a, List<InterfaceC5252b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5194b interfaceC5194bMo9619a = list.get(i2).mo9619a(c5182f, abstractC5268a);
            if (interfaceC5194bMo9619a != null) {
                arrayList.add(interfaceC5194bMo9619a);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    static C5248l m9521i(List<InterfaceC5252b> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5252b interfaceC5252b = list.get(i2);
            if (interfaceC5252b instanceof C5248l) {
                return (C5248l) interfaceC5252b;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12506f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f12505e.size());
        arrayList.addAll(list);
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5194b interfaceC5194b = this.f12505e.get(size);
            interfaceC5194b.mo9513b(arrayList, this.f12505e.subList(0, size));
            arrayList.add(interfaceC5194b);
        }
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        if (c5233e.m9609g(getName(), i2)) {
            if (!"__container".equals(getName())) {
                c5233e2 = c5233e2.m9605a(getName());
                if (c5233e.m9606c(getName(), i2)) {
                    list.add(c5233e2.m9611i(this));
                }
            }
            if (c5233e.m9610h(getName(), i2)) {
                int iM9608e = i2 + c5233e.m9608e(getName(), i2);
                for (int i3 = 0; i3 < this.f12505e.size(); i3++) {
                    InterfaceC5194b interfaceC5194b = this.f12505e.get(i3);
                    if (interfaceC5194b instanceof InterfaceC5234f) {
                        ((InterfaceC5234f) interfaceC5194b).mo9514c(c5233e, iM9608e, list, c5233e2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        this.f12501a.set(matrix);
        C5225o c5225o = this.f12508h;
        if (c5225o != null) {
            this.f12501a.preConcat(c5225o.m9577e());
        }
        this.f12503c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5194b interfaceC5194b = this.f12505e.get(size);
            if (interfaceC5194b instanceof InterfaceC5196d) {
                ((InterfaceC5196d) interfaceC5194b).mo9515d(this.f12503c, this.f12501a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f12503c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f12503c.left), Math.min(rectF.top, this.f12503c.top), Math.max(rectF.right, this.f12503c.right), Math.max(rectF.bottom, this.f12503c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        this.f12501a.set(matrix);
        C5225o c5225o = this.f12508h;
        if (c5225o != null) {
            this.f12501a.preConcat(c5225o.m9577e());
            i2 = (int) ((((this.f12508h.m9579g().mo9552h().intValue() / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5194b interfaceC5194b = this.f12505e.get(size);
            if (interfaceC5194b instanceof InterfaceC5196d) {
                ((InterfaceC5196d) interfaceC5194b).mo9516f(canvas, this.f12501a, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5204l
    /* renamed from: g */
    public Path mo9522g() {
        this.f12501a.reset();
        C5225o c5225o = this.f12508h;
        if (c5225o != null) {
            this.f12501a.set(c5225o.m9577e());
        }
        this.f12502b.reset();
        for (int size = this.f12505e.size() - 1; size >= 0; size--) {
            InterfaceC5194b interfaceC5194b = this.f12505e.get(size);
            if (interfaceC5194b instanceof InterfaceC5204l) {
                this.f12502b.addPath(((InterfaceC5204l) interfaceC5194b).mo9522g(), this.f12501a);
            }
        }
        return this.f12502b;
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    public String getName() {
        return this.f12504d;
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        C5225o c5225o = this.f12508h;
        if (c5225o != null) {
            c5225o.m9575c(t, c5323c);
        }
    }

    /* renamed from: j */
    List<InterfaceC5204l> m9523j() {
        if (this.f12507g == null) {
            this.f12507g = new ArrayList();
            for (int i2 = 0; i2 < this.f12505e.size(); i2++) {
                InterfaceC5194b interfaceC5194b = this.f12505e.get(i2);
                if (interfaceC5194b instanceof InterfaceC5204l) {
                    this.f12507g.add((InterfaceC5204l) interfaceC5194b);
                }
            }
        }
        return this.f12507g;
    }

    /* renamed from: k */
    Matrix m9524k() {
        C5225o c5225o = this.f12508h;
        if (c5225o != null) {
            return c5225o.m9577e();
        }
        this.f12501a.reset();
        return this.f12501a;
    }

    C5195c(C5182f c5182f, AbstractC5268a abstractC5268a, String str, List<InterfaceC5194b> list, C5248l c5248l) {
        this.f12501a = new Matrix();
        this.f12502b = new Path();
        this.f12503c = new RectF();
        this.f12504d = str;
        this.f12506f = c5182f;
        this.f12505e = list;
        if (c5248l != null) {
            C5225o c5225oM9620b = c5248l.m9620b();
            this.f12508h = c5225oM9620b;
            c5225oM9620b.m9573a(abstractC5268a);
            this.f12508h.m9574b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC5194b interfaceC5194b = list.get(size);
            if (interfaceC5194b instanceof InterfaceC5201i) {
                arrayList.add((InterfaceC5201i) interfaceC5194b);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC5201i) arrayList.get(size2)).mo9532e(list.listIterator(list.size()));
        }
    }
}
