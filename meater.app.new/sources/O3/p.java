package O3;

import L3.y;
import O3.a;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f13216a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f13217b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f13218c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f13219d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f13220e;

    /* renamed from: f, reason: collision with root package name */
    private a<PointF, PointF> f13221f;

    /* renamed from: g, reason: collision with root package name */
    private a<?, PointF> f13222g;

    /* renamed from: h, reason: collision with root package name */
    private a<Y3.d, Y3.d> f13223h;

    /* renamed from: i, reason: collision with root package name */
    private a<Float, Float> f13224i;

    /* renamed from: j, reason: collision with root package name */
    private a<Integer, Integer> f13225j;

    /* renamed from: k, reason: collision with root package name */
    private d f13226k;

    /* renamed from: l, reason: collision with root package name */
    private d f13227l;

    /* renamed from: m, reason: collision with root package name */
    private a<?, Float> f13228m;

    /* renamed from: n, reason: collision with root package name */
    private a<?, Float> f13229n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f13230o;

    public p(R3.l lVar) {
        this.f13221f = lVar.c() == null ? null : lVar.c().h();
        this.f13222g = lVar.f() == null ? null : lVar.f().h();
        this.f13223h = lVar.h() == null ? null : lVar.h().h();
        this.f13224i = lVar.g() == null ? null : lVar.g().h();
        this.f13226k = lVar.i() == null ? null : (d) lVar.i().h();
        this.f13230o = lVar.l();
        if (this.f13226k != null) {
            this.f13217b = new Matrix();
            this.f13218c = new Matrix();
            this.f13219d = new Matrix();
            this.f13220e = new float[9];
        } else {
            this.f13217b = null;
            this.f13218c = null;
            this.f13219d = null;
            this.f13220e = null;
        }
        this.f13227l = lVar.j() == null ? null : (d) lVar.j().h();
        if (lVar.e() != null) {
            this.f13225j = lVar.e().h();
        }
        if (lVar.k() != null) {
            this.f13228m = lVar.k().h();
        } else {
            this.f13228m = null;
        }
        if (lVar.d() != null) {
            this.f13229n = lVar.d().h();
        } else {
            this.f13229n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f13220e[i10] = 0.0f;
        }
    }

    public void a(T3.b bVar) {
        bVar.j(this.f13225j);
        bVar.j(this.f13228m);
        bVar.j(this.f13229n);
        bVar.j(this.f13221f);
        bVar.j(this.f13222g);
        bVar.j(this.f13223h);
        bVar.j(this.f13224i);
        bVar.j(this.f13226k);
        bVar.j(this.f13227l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f13225j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f13228m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f13229n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f13221f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f13222g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<Y3.d, Y3.d> aVar6 = this.f13223h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f13224i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f13226k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f13227l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, Y3.c<T> cVar) {
        if (t10 == y.f9227f) {
            a<PointF, PointF> aVar = this.f13221f;
            if (aVar == null) {
                this.f13221f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (t10 == y.f9228g) {
            a<?, PointF> aVar2 = this.f13222g;
            if (aVar2 == null) {
                this.f13222g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (t10 == y.f9229h) {
            a<?, PointF> aVar3 = this.f13222g;
            if (aVar3 instanceof n) {
                ((n) aVar3).s(cVar);
                return true;
            }
        }
        if (t10 == y.f9230i) {
            a<?, PointF> aVar4 = this.f13222g;
            if (aVar4 instanceof n) {
                ((n) aVar4).t(cVar);
                return true;
            }
        }
        if (t10 == y.f9236o) {
            a<Y3.d, Y3.d> aVar5 = this.f13223h;
            if (aVar5 == null) {
                this.f13223h = new q(cVar, new Y3.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (t10 == y.f9237p) {
            a<Float, Float> aVar6 = this.f13224i;
            if (aVar6 == null) {
                this.f13224i = new q(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (t10 == y.f9224c) {
            a<Integer, Integer> aVar7 = this.f13225j;
            if (aVar7 == null) {
                this.f13225j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (t10 == y.f9208C) {
            a<?, Float> aVar8 = this.f13228m;
            if (aVar8 == null) {
                this.f13228m = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (t10 == y.f9209D) {
            a<?, Float> aVar9 = this.f13229n;
            if (aVar9 == null) {
                this.f13229n = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (t10 == y.f9238q) {
            if (this.f13226k == null) {
                this.f13226k = new d(Collections.singletonList(new Y3.a(Float.valueOf(0.0f))));
            }
            this.f13226k.o(cVar);
            return true;
        }
        if (t10 != y.f9239r) {
            return false;
        }
        if (this.f13227l == null) {
            this.f13227l = new d(Collections.singletonList(new Y3.a(Float.valueOf(0.0f))));
        }
        this.f13227l.o(cVar);
        return true;
    }

    public a<?, Float> e() {
        return this.f13229n;
    }

    public Matrix f() {
        PointF pointFH;
        Y3.d dVarH;
        PointF pointFH2;
        this.f13216a.reset();
        a<?, PointF> aVar = this.f13222g;
        if (aVar != null && (pointFH2 = aVar.h()) != null) {
            float f10 = pointFH2.x;
            if (f10 != 0.0f || pointFH2.y != 0.0f) {
                this.f13216a.preTranslate(f10, pointFH2.y);
            }
        }
        if (!this.f13230o) {
            a<Float, Float> aVar2 = this.f13224i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).q();
                if (fFloatValue != 0.0f) {
                    this.f13216a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF pointFH3 = aVar.h();
            float f12 = pointFH3.x;
            float f13 = pointFH3.y;
            aVar.n(1.0E-4f + f11);
            PointF pointFH4 = aVar.h();
            aVar.n(f11);
            this.f13216a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f13, pointFH4.x - f12)));
        }
        if (this.f13226k != null) {
            float fCos = this.f13227l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.q()) + 90.0f));
            float fSin = this.f13227l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.q()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.q()));
            d();
            float[] fArr = this.f13220e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f13217b.setValues(fArr);
            d();
            float[] fArr2 = this.f13220e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f13218c.setValues(fArr2);
            d();
            float[] fArr3 = this.f13220e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f13219d.setValues(fArr3);
            this.f13218c.preConcat(this.f13217b);
            this.f13219d.preConcat(this.f13218c);
            this.f13216a.preConcat(this.f13219d);
        }
        a<Y3.d, Y3.d> aVar3 = this.f13223h;
        if (aVar3 != null && (dVarH = aVar3.h()) != null && (dVarH.b() != 1.0f || dVarH.c() != 1.0f)) {
            this.f13216a.preScale(dVarH.b(), dVarH.c());
        }
        a<PointF, PointF> aVar4 = this.f13221f;
        if (aVar4 != null && (pointFH = aVar4.h()) != null) {
            float f15 = pointFH.x;
            if (f15 != 0.0f || pointFH.y != 0.0f) {
                this.f13216a.preTranslate(-f15, -pointFH.y);
            }
        }
        return this.f13216a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f13222g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<Y3.d, Y3.d> aVar2 = this.f13223h;
        Y3.d dVarH = aVar2 == null ? null : aVar2.h();
        this.f13216a.reset();
        if (pointFH != null) {
            this.f13216a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (dVarH != null) {
            double d10 = f10;
            this.f13216a.preScale((float) Math.pow(dVarH.b(), d10), (float) Math.pow(dVarH.c(), d10));
        }
        a<Float, Float> aVar3 = this.f13224i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f13221f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            this.f13216a.preRotate(fFloatValue * f10, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f13216a;
    }

    public a<?, Integer> h() {
        return this.f13225j;
    }

    public a<?, Float> i() {
        return this.f13228m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f13225j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a<?, Float> aVar2 = this.f13228m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a<?, Float> aVar3 = this.f13229n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a<PointF, PointF> aVar4 = this.f13221f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a<?, PointF> aVar5 = this.f13222g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a<Y3.d, Y3.d> aVar6 = this.f13223h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a<Float, Float> aVar7 = this.f13224i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f13226k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f13227l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
