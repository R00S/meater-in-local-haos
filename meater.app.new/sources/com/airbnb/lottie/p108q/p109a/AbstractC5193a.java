package com.airbnb.lottie.p108q.p109a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* renamed from: com.airbnb.lottie.q.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC5193a implements AbstractC5211a.a, InterfaceC5202j, InterfaceC5196d {

    /* renamed from: e */
    private final C5182f f12489e;

    /* renamed from: f */
    private final AbstractC5268a f12490f;

    /* renamed from: h */
    private final float[] f12492h;

    /* renamed from: i */
    final Paint f12493i;

    /* renamed from: j */
    private final AbstractC5211a<?, Float> f12494j;

    /* renamed from: k */
    private final AbstractC5211a<?, Integer> f12495k;

    /* renamed from: l */
    private final List<AbstractC5211a<?, Float>> f12496l;

    /* renamed from: m */
    private final AbstractC5211a<?, Float> f12497m;

    /* renamed from: n */
    private AbstractC5211a<ColorFilter, ColorFilter> f12498n;

    /* renamed from: a */
    private final PathMeasure f12485a = new PathMeasure();

    /* renamed from: b */
    private final Path f12486b = new Path();

    /* renamed from: c */
    private final Path f12487c = new Path();

    /* renamed from: d */
    private final RectF f12488d = new RectF();

    /* renamed from: g */
    private final List<b> f12491g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.airbnb.lottie.q.a.a$b */
    private static final class b {

        /* renamed from: a */
        private final List<InterfaceC5204l> f12499a;

        /* renamed from: b */
        private final C5210r f12500b;

        private b(C5210r c5210r) {
            this.f12499a = new ArrayList();
            this.f12500b = c5210r;
        }
    }

    AbstractC5193a(C5182f c5182f, AbstractC5268a abstractC5268a, Paint.Cap cap, Paint.Join join, float f2, C5240d c5240d, C5238b c5238b, List<C5238b> list, C5238b c5238b2) {
        Paint paint = new Paint(1);
        this.f12493i = paint;
        this.f12489e = c5182f;
        this.f12490f = abstractC5268a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        this.f12495k = c5240d.mo9617a();
        this.f12494j = c5238b.mo9617a();
        if (c5238b2 == null) {
            this.f12497m = null;
        } else {
            this.f12497m = c5238b2.mo9617a();
        }
        this.f12496l = new ArrayList(list.size());
        this.f12492h = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f12496l.add(list.get(i2).mo9617a());
        }
        abstractC5268a.m9723i(this.f12495k);
        abstractC5268a.m9723i(this.f12494j);
        for (int i3 = 0; i3 < this.f12496l.size(); i3++) {
            abstractC5268a.m9723i(this.f12496l.get(i3));
        }
        AbstractC5211a<?, Float> abstractC5211a = this.f12497m;
        if (abstractC5211a != null) {
            abstractC5268a.m9723i(abstractC5211a);
        }
        this.f12495k.m9548a(this);
        this.f12494j.m9548a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f12496l.get(i4).m9548a(this);
        }
        AbstractC5211a<?, Float> abstractC5211a2 = this.f12497m;
        if (abstractC5211a2 != null) {
            abstractC5211a2.m9548a(this);
        }
    }

    /* renamed from: e */
    private void m9510e(Matrix matrix) {
        C5179c.m9391a("StrokeContent#applyDashPattern");
        if (this.f12496l.isEmpty()) {
            C5179c.m9393c("StrokeContent#applyDashPattern");
            return;
        }
        float fM9888f = C5320f.m9888f(matrix);
        for (int i2 = 0; i2 < this.f12496l.size(); i2++) {
            this.f12492h[i2] = this.f12496l.get(i2).mo9552h().floatValue();
            if (i2 % 2 == 0) {
                float[] fArr = this.f12492h;
                if (fArr[i2] < 1.0f) {
                    fArr[i2] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f12492h;
                if (fArr2[i2] < 0.1f) {
                    fArr2[i2] = 0.1f;
                }
            }
            float[] fArr3 = this.f12492h;
            fArr3[i2] = fArr3[i2] * fM9888f;
        }
        AbstractC5211a<?, Float> abstractC5211a = this.f12497m;
        this.f12493i.setPathEffect(new DashPathEffect(this.f12492h, abstractC5211a == null ? 0.0f : abstractC5211a.mo9552h().floatValue()));
        C5179c.m9393c("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9511i(android.graphics.Canvas r13, com.airbnb.lottie.p108q.p109a.AbstractC5193a.b r14, android.graphics.Matrix r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p108q.p109a.AbstractC5193a.m9511i(android.graphics.Canvas, com.airbnb.lottie.q.a.a$b, android.graphics.Matrix):void");
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        this.f12489e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9513b(java.util.List<com.airbnb.lottie.p108q.p109a.InterfaceC5194b> r8, java.util.List<com.airbnb.lottie.p108q.p109a.InterfaceC5194b> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.airbnb.lottie.q.a.b r3 = (com.airbnb.lottie.p108q.p109a.InterfaceC5194b) r3
            boolean r4 = r3 instanceof com.airbnb.lottie.p108q.p109a.C5210r
            if (r4 == 0) goto L1f
            com.airbnb.lottie.q.a.r r3 = (com.airbnb.lottie.p108q.p109a.C5210r) r3
            com.airbnb.lottie.s.j.q$a r4 = r3.m9544j()
            com.airbnb.lottie.s.j.q$a r5 = com.airbnb.lottie.p112s.p114j.C5267q.a.Individually
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.m9540c(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.airbnb.lottie.q.a.b r3 = (com.airbnb.lottie.p108q.p109a.InterfaceC5194b) r3
            boolean r4 = r3 instanceof com.airbnb.lottie.p108q.p109a.C5210r
            if (r4 == 0) goto L55
            r4 = r3
            com.airbnb.lottie.q.a.r r4 = (com.airbnb.lottie.p108q.p109a.C5210r) r4
            com.airbnb.lottie.s.j.q$a r5 = r4.m9544j()
            com.airbnb.lottie.s.j.q$a r6 = com.airbnb.lottie.p112s.p114j.C5267q.a.Individually
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.airbnb.lottie.q.a.a$b> r3 = r7.f12491g
            r3.add(r0)
        L4c:
            com.airbnb.lottie.q.a.a$b r0 = new com.airbnb.lottie.q.a.a$b
            r0.<init>(r4)
            r4.m9540c(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.airbnb.lottie.p108q.p109a.InterfaceC5204l
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.airbnb.lottie.q.a.a$b r0 = new com.airbnb.lottie.q.a.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.airbnb.lottie.p108q.p109a.AbstractC5193a.b.m9518a(r0)
            com.airbnb.lottie.q.a.l r3 = (com.airbnb.lottie.p108q.p109a.InterfaceC5204l) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.airbnb.lottie.q.a.a$b> r8 = r7.f12491g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p108q.p109a.AbstractC5193a.mo9513b(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: c */
    public void mo9514c(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        C5319e.m9882l(c5233e, i2, list, c5233e2, this);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        C5179c.m9391a("StrokeContent#getBounds");
        this.f12486b.reset();
        for (int i2 = 0; i2 < this.f12491g.size(); i2++) {
            b bVar = this.f12491g.get(i2);
            for (int i3 = 0; i3 < bVar.f12499a.size(); i3++) {
                this.f12486b.addPath(((InterfaceC5204l) bVar.f12499a.get(i3)).mo9522g(), matrix);
            }
        }
        this.f12486b.computeBounds(this.f12488d, false);
        float fFloatValue = this.f12494j.mo9552h().floatValue();
        RectF rectF2 = this.f12488d;
        float f2 = fFloatValue / 2.0f;
        rectF2.set(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2);
        rectF.set(this.f12488d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5179c.m9393c("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: f */
    public void mo9516f(Canvas canvas, Matrix matrix, int i2) {
        C5179c.m9391a("StrokeContent#draw");
        this.f12493i.setAlpha(C5319e.m9873c((int) ((((i2 / 255.0f) * this.f12495k.mo9552h().intValue()) / 100.0f) * 255.0f), 0, 255));
        this.f12493i.setStrokeWidth(this.f12494j.mo9552h().floatValue() * C5320f.m9888f(matrix));
        if (this.f12493i.getStrokeWidth() <= 0.0f) {
            C5179c.m9393c("StrokeContent#draw");
            return;
        }
        m9510e(matrix);
        AbstractC5211a<ColorFilter, ColorFilter> abstractC5211a = this.f12498n;
        if (abstractC5211a != null) {
            this.f12493i.setColorFilter(abstractC5211a.mo9552h());
        }
        for (int i3 = 0; i3 < this.f12491g.size(); i3++) {
            b bVar = this.f12491g.get(i3);
            if (bVar.f12500b != null) {
                m9511i(canvas, bVar, matrix);
            } else {
                C5179c.m9391a("StrokeContent#buildPath");
                this.f12486b.reset();
                for (int size = bVar.f12499a.size() - 1; size >= 0; size--) {
                    this.f12486b.addPath(((InterfaceC5204l) bVar.f12499a.get(size)).mo9522g(), matrix);
                }
                C5179c.m9393c("StrokeContent#buildPath");
                C5179c.m9391a("StrokeContent#drawPath");
                canvas.drawPath(this.f12486b, this.f12493i);
                C5179c.m9393c("StrokeContent#drawPath");
            }
        }
        C5179c.m9393c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        if (t == InterfaceC5186j.f12398d) {
            this.f12495k.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12405k) {
            this.f12494j.m9557m(c5323c);
            return;
        }
        if (t == InterfaceC5186j.f12418x) {
            if (c5323c == null) {
                this.f12498n = null;
                return;
            }
            C5226p c5226p = new C5226p(c5323c);
            this.f12498n = c5226p;
            c5226p.m9548a(this);
            this.f12490f.m9723i(this.f12498n);
        }
    }
}
