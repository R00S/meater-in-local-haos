package O3;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f13206i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f13207j;

    /* renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f13208k;

    /* renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f13209l;

    /* renamed from: m, reason: collision with root package name */
    protected Y3.c<Float> f13210m;

    /* renamed from: n, reason: collision with root package name */
    protected Y3.c<Float> f13211n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f13206i = new PointF();
        this.f13207j = new PointF();
        this.f13208k = aVar;
        this.f13209l = aVar2;
        n(f());
    }

    @Override // O3.a
    public void n(float f10) {
        this.f13208k.n(f10);
        this.f13209l.n(f10);
        this.f13206i.set(this.f13208k.h().floatValue(), this.f13209l.h().floatValue());
        for (int i10 = 0; i10 < this.f13165a.size(); i10++) {
            this.f13165a.get(i10).a();
        }
    }

    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(Y3.a<PointF> aVar, float f10) {
        Float fB;
        Y3.a<Float> aVarB;
        Y3.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f13210m == null || (aVarB2 = this.f13208k.b()) == null) {
            fB = null;
        } else {
            float fD = this.f13208k.d();
            Float f11 = aVarB2.f19393h;
            Y3.c<Float> cVar = this.f13210m;
            float f12 = aVarB2.f19392g;
            fB = cVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.f19387b, aVarB2.f19388c, f10, f10, fD);
        }
        if (this.f13211n != null && (aVarB = this.f13209l.b()) != null) {
            float fD2 = this.f13209l.d();
            Float f13 = aVarB.f19393h;
            Y3.c<Float> cVar2 = this.f13211n;
            float f14 = aVarB.f19392g;
            fB2 = cVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.f19387b, aVarB.f19388c, f10, f10, fD2);
        }
        if (fB == null) {
            this.f13207j.set(this.f13206i.x, 0.0f);
        } else {
            this.f13207j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f13207j;
            pointF.set(pointF.x, this.f13206i.y);
        } else {
            PointF pointF2 = this.f13207j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f13207j;
    }

    public void s(Y3.c<Float> cVar) {
        Y3.c<Float> cVar2 = this.f13210m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13210m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void t(Y3.c<Float> cVar) {
        Y3.c<Float> cVar2 = this.f13211n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13211n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
