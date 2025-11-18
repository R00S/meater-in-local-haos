package N3;

import L3.y;
import O3.a;
import S3.t;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f12391b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.n f12392c;

    /* renamed from: d, reason: collision with root package name */
    private final O3.a<?, PointF> f12393d;

    /* renamed from: e, reason: collision with root package name */
    private final O3.a<?, PointF> f12394e;

    /* renamed from: f, reason: collision with root package name */
    private final S3.b f12395f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12397h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f12390a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f12396g = new b();

    public f(com.airbnb.lottie.n nVar, T3.b bVar, S3.b bVar2) {
        this.f12391b = bVar2.b();
        this.f12392c = nVar;
        O3.a<PointF, PointF> aVarH = bVar2.d().h();
        this.f12393d = aVarH;
        O3.a<PointF, PointF> aVarH2 = bVar2.c().h();
        this.f12394e = aVarH2;
        this.f12395f = bVar2;
        bVar.j(aVarH);
        bVar.j(aVarH2);
        aVarH.a(this);
        aVarH2.a(this);
    }

    private void f() {
        this.f12397h = false;
        this.f12392c.invalidateSelf();
    }

    @Override // O3.a.b
    public void a() {
        f();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f12396g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        if (t10 == y.f9232k) {
            this.f12393d.o(cVar);
        } else if (t10 == y.f9235n) {
            this.f12394e.o(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.c
    public String getName() {
        return this.f12391b;
    }

    @Override // N3.m
    public Path h() {
        if (this.f12397h) {
            return this.f12390a;
        }
        this.f12390a.reset();
        if (this.f12395f.e()) {
            this.f12397h = true;
            return this.f12390a;
        }
        PointF pointFH = this.f12393d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f12390a.reset();
        if (this.f12395f.f()) {
            float f14 = -f11;
            this.f12390a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f12390a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f12390a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f12390a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f12390a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f12390a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f12390a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f12390a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f12390a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f12390a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f12394e.h();
        this.f12390a.offset(pointFH2.x, pointFH2.y);
        this.f12390a.close();
        this.f12396g.b(this.f12390a);
        this.f12397h = true;
        return this.f12390a;
    }
}
