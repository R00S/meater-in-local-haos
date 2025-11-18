package S3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final List<Q3.a> f15410a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f15411b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15412c;

    public o(PointF pointF, boolean z10, List<Q3.a> list) {
        this.f15411b = pointF;
        this.f15412c = z10;
        this.f15410a = new ArrayList(list);
    }

    public List<Q3.a> a() {
        return this.f15410a;
    }

    public PointF b() {
        return this.f15411b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f15411b == null) {
            this.f15411b = new PointF();
        }
        this.f15412c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            X3.d.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f15410a.size() < iMin) {
            for (int size = this.f15410a.size(); size < iMin; size++) {
                this.f15410a.add(new Q3.a());
            }
        } else if (this.f15410a.size() > iMin) {
            for (int size2 = this.f15410a.size() - 1; size2 >= iMin; size2--) {
                List<Q3.a> list = this.f15410a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(X3.i.i(pointFB.x, pointFB2.x, f10), X3.i.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f15410a.size() - 1; size3 >= 0; size3--) {
            Q3.a aVar = oVar.a().get(size3);
            Q3.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f15410a.get(size3).d(X3.i.i(pointFA.x, pointFA2.x, f10), X3.i.i(pointFA.y, pointFA2.y, f10));
            this.f15410a.get(size3).e(X3.i.i(pointFB3.x, pointFB4.x, f10), X3.i.i(pointFB3.y, pointFB4.y, f10));
            this.f15410a.get(size3).f(X3.i.i(pointFC.x, pointFC2.x, f10), X3.i.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f15412c;
    }

    public void e(boolean z10) {
        this.f15412c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f15411b == null) {
            this.f15411b = new PointF();
        }
        this.f15411b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f15410a.size() + "closed=" + this.f15412c + '}';
    }

    public o() {
        this.f15410a = new ArrayList();
    }
}
