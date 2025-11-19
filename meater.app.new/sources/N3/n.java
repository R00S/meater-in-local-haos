package N3;

import L3.y;
import O3.a;
import S3.k;
import S3.t;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: e, reason: collision with root package name */
    private final String f12454e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.n f12455f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f12456g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12457h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12458i;

    /* renamed from: j, reason: collision with root package name */
    private final O3.a<?, Float> f12459j;

    /* renamed from: k, reason: collision with root package name */
    private final O3.a<?, PointF> f12460k;

    /* renamed from: l, reason: collision with root package name */
    private final O3.a<?, Float> f12461l;

    /* renamed from: m, reason: collision with root package name */
    private final O3.a<?, Float> f12462m;

    /* renamed from: n, reason: collision with root package name */
    private final O3.a<?, Float> f12463n;

    /* renamed from: o, reason: collision with root package name */
    private final O3.a<?, Float> f12464o;

    /* renamed from: p, reason: collision with root package name */
    private final O3.a<?, Float> f12465p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12467r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f12450a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f12451b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f12452c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f12453d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    private final b f12466q = new b();

    /* compiled from: PolystarContent.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12468a;

        static {
            int[] iArr = new int[k.a.values().length];
            f12468a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12468a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.n nVar, T3.b bVar, S3.k kVar) {
        this.f12455f = nVar;
        this.f12454e = kVar.d();
        k.a aVarJ = kVar.j();
        this.f12456g = aVarJ;
        this.f12457h = kVar.k();
        this.f12458i = kVar.l();
        O3.a<Float, Float> aVarH = kVar.g().h();
        this.f12459j = aVarH;
        O3.a<PointF, PointF> aVarH2 = kVar.h().h();
        this.f12460k = aVarH2;
        O3.a<Float, Float> aVarH3 = kVar.i().h();
        this.f12461l = aVarH3;
        O3.a<Float, Float> aVarH4 = kVar.e().h();
        this.f12463n = aVarH4;
        O3.a<Float, Float> aVarH5 = kVar.f().h();
        this.f12465p = aVarH5;
        k.a aVar = k.a.STAR;
        if (aVarJ == aVar) {
            this.f12462m = kVar.b().h();
            this.f12464o = kVar.c().h();
        } else {
            this.f12462m = null;
            this.f12464o = null;
        }
        bVar.j(aVarH);
        bVar.j(aVarH2);
        bVar.j(aVarH3);
        bVar.j(aVarH4);
        bVar.j(aVarH5);
        if (aVarJ == aVar) {
            bVar.j(this.f12462m);
            bVar.j(this.f12464o);
        }
        aVarH.a(this);
        aVarH2.a(this);
        aVarH3.a(this);
        aVarH4.a(this);
        aVarH5.a(this);
        if (aVarJ == aVar) {
            this.f12462m.a(this);
            this.f12464o.a(this);
        }
    }

    private void f() {
        double d10;
        float f10;
        n nVar;
        n nVar2 = this;
        int iFloor = (int) Math.floor(nVar2.f12459j.h().floatValue());
        double radians = Math.toRadians((nVar2.f12461l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = nVar2.f12465p.h().floatValue() / 100.0f;
        float fFloatValue2 = nVar2.f12463n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        nVar2.f12450a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                n nVar3 = nVar2;
                PointF pointFH = nVar3.f12460k.h();
                nVar3.f12450a.offset(pointFH.x, pointFH.y);
                nVar3.f12450a.close();
                return;
            }
            int i11 = i10;
            float fCos2 = (float) (d12 * Math.cos(d14));
            double d16 = d13;
            float fSin2 = (float) (d12 * Math.sin(d14));
            if (fFloatValue != 0.0f) {
                d10 = d12;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                f10 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f11 = fFloatValue2 * fFloatValue * 0.25f;
                float f12 = fCos3 * f11;
                float f13 = fSin3 * f11;
                float fCos4 = ((float) Math.cos(dAtan22)) * f11;
                float fSin4 = f11 * ((float) Math.sin(dAtan22));
                if (d15 == dCeil - 1.0d) {
                    nVar = this;
                    nVar.f12451b.reset();
                    nVar.f12451b.moveTo(fCos, fSin);
                    float f14 = fCos - f12;
                    float f15 = fSin - f13;
                    float f16 = fCos2 + fCos4;
                    float f17 = fSin4 + f10;
                    nVar.f12451b.cubicTo(f14, f15, f16, f17, fCos2, f10);
                    nVar.f12452c.setPath(nVar.f12451b, false);
                    PathMeasure pathMeasure = nVar.f12452c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, nVar.f12453d, null);
                    Path path = nVar.f12450a;
                    float[] fArr = nVar.f12453d;
                    path.cubicTo(f14, f15, f16, f17, fArr[0], fArr[1]);
                } else {
                    nVar = this;
                    nVar.f12450a.cubicTo(fCos - f12, fSin - f13, fCos2 + fCos4, f10 + fSin4, fCos2, f10);
                }
            } else {
                d10 = d12;
                f10 = fSin2;
                nVar = nVar2;
                if (d15 == dCeil - 1.0d) {
                    fSin = f10;
                    fCos = fCos2;
                    d13 = d16;
                    i10 = i11 + 1;
                    nVar2 = nVar;
                    d12 = d10;
                } else {
                    nVar.f12450a.lineTo(fCos2, f10);
                }
            }
            d14 += d16;
            fSin = f10;
            fCos = fCos2;
            d13 = d16;
            i10 = i11 + 1;
            nVar2 = nVar;
            d12 = d10;
        }
    }

    private void j() {
        int i10;
        float f10;
        float f11;
        double d10;
        float fSin;
        float f12;
        float f13;
        float f14;
        double d11;
        float f15;
        float f16;
        float f17;
        double d12;
        float fFloatValue = this.f12459j.h().floatValue();
        double radians = Math.toRadians((this.f12461l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f18 = (float) (6.283185307179586d / d13);
        if (this.f12458i) {
            f18 *= -1.0f;
        }
        float f19 = f18 / 2.0f;
        float f20 = fFloatValue - ((int) fFloatValue);
        int i11 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f20) * f19;
        }
        float fFloatValue2 = this.f12463n.h().floatValue();
        float fFloatValue3 = this.f12462m.h().floatValue();
        O3.a<?, Float> aVar = this.f12464o;
        float fFloatValue4 = aVar != null ? aVar.h().floatValue() / 100.0f : 0.0f;
        O3.a<?, Float> aVar2 = this.f12465p;
        float fFloatValue5 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f12 = ((fFloatValue2 - fFloatValue3) * f20) + fFloatValue3;
            i10 = i11;
            double d14 = f12;
            float fCos = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.f12450a.moveTo(fCos, fSin);
            d10 = radians + ((f18 * f20) / 2.0f);
            f10 = fCos;
            f11 = f19;
        } else {
            i10 = i11;
            double d15 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d15);
            float fSin2 = (float) (d15 * Math.sin(radians));
            this.f12450a.moveTo(fCos2, fSin2);
            f10 = fCos2;
            f11 = f19;
            d10 = radians + f11;
            fSin = fSin2;
            f12 = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i12 = 0;
        float f21 = f11;
        float f22 = f10;
        boolean z10 = false;
        while (true) {
            double d16 = i12;
            if (d16 >= dCeil) {
                PointF pointFH = this.f12460k.h();
                this.f12450a.offset(pointFH.x, pointFH.y);
                this.f12450a.close();
                return;
            }
            float f23 = z10 ? fFloatValue2 : fFloatValue3;
            if (f12 == 0.0f || d16 != dCeil - 2.0d) {
                f13 = f18;
                f14 = f21;
            } else {
                f13 = f18;
                f14 = (f18 * f20) / 2.0f;
            }
            if (f12 == 0.0f || d16 != dCeil - 1.0d) {
                d11 = d16;
                f15 = f12;
                f12 = f23;
            } else {
                d11 = d16;
                f15 = f12;
            }
            double d17 = f12;
            double d18 = dCeil;
            float fCos3 = (float) (d17 * Math.cos(d10));
            float fSin3 = (float) (d17 * Math.sin(d10));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f12450a.lineTo(fCos3, fSin3);
                d12 = d10;
                f16 = fFloatValue4;
                f17 = fFloatValue5;
            } else {
                f16 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f22) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f17 = fFloatValue5;
                d12 = d10;
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f24 = z10 ? f16 : f17;
                float f25 = z10 ? f17 : f16;
                float f26 = (z10 ? fFloatValue3 : fFloatValue2) * f24 * 0.47829f;
                float f27 = fCos4 * f26;
                float f28 = f26 * fSin4;
                float f29 = (z10 ? fFloatValue2 : fFloatValue3) * f25 * 0.47829f;
                float f30 = fCos5 * f29;
                float f31 = f29 * fSin5;
                if (i10 != 0) {
                    if (i12 == 0) {
                        f27 *= f20;
                        f28 *= f20;
                    } else if (d11 == d18 - 1.0d) {
                        f30 *= f20;
                        f31 *= f20;
                    }
                }
                this.f12450a.cubicTo(f22 - f27, fSin - f28, fCos3 + f30, fSin3 + f31, fCos3, fSin3);
            }
            d10 = d12 + f14;
            z10 = !z10;
            i12++;
            f22 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f17;
            fFloatValue4 = f16;
            f12 = f15;
            f18 = f13;
            dCeil = d18;
        }
    }

    private void k() {
        this.f12467r = false;
        this.f12455f.invalidateSelf();
    }

    @Override // O3.a.b
    public void a() {
        k();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f12466q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        O3.a<?, Float> aVar;
        O3.a<?, Float> aVar2;
        if (t10 == y.f9244w) {
            this.f12459j.o(cVar);
            return;
        }
        if (t10 == y.f9245x) {
            this.f12461l.o(cVar);
            return;
        }
        if (t10 == y.f9235n) {
            this.f12460k.o(cVar);
            return;
        }
        if (t10 == y.f9246y && (aVar2 = this.f12462m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t10 == y.f9247z) {
            this.f12463n.o(cVar);
            return;
        }
        if (t10 == y.f9206A && (aVar = this.f12464o) != null) {
            aVar.o(cVar);
        } else if (t10 == y.f9207B) {
            this.f12465p.o(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.c
    public String getName() {
        return this.f12454e;
    }

    @Override // N3.m
    public Path h() {
        if (this.f12467r) {
            return this.f12450a;
        }
        this.f12450a.reset();
        if (this.f12457h) {
            this.f12467r = true;
            return this.f12450a;
        }
        int i10 = a.f12468a[this.f12456g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            f();
        }
        this.f12450a.close();
        this.f12466q.b(this.f12450a);
        this.f12467r = true;
        return this.f12450a;
    }
}
