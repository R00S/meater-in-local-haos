package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.p112s.C5229a;
import com.airbnb.lottie.p118v.C5319e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* renamed from: com.airbnb.lottie.s.j.l */
/* loaded from: classes.dex */
public class C5262l {

    /* renamed from: a */
    private final List<C5229a> f12759a;

    /* renamed from: b */
    private PointF f12760b;

    /* renamed from: c */
    private boolean f12761c;

    public C5262l(PointF pointF, boolean z, List<C5229a> list) {
        ArrayList arrayList = new ArrayList();
        this.f12759a = arrayList;
        this.f12760b = pointF;
        this.f12761c = z;
        arrayList.addAll(list);
    }

    /* renamed from: e */
    private void m9679e(float f2, float f3) {
        if (this.f12760b == null) {
            this.f12760b = new PointF();
        }
        this.f12760b.set(f2, f3);
    }

    /* renamed from: a */
    public List<C5229a> m9680a() {
        return this.f12759a;
    }

    /* renamed from: b */
    public PointF m9681b() {
        return this.f12760b;
    }

    /* renamed from: c */
    public void m9682c(C5262l c5262l, C5262l c5262l2, float f2) {
        if (this.f12760b == null) {
            this.f12760b = new PointF();
        }
        this.f12761c = c5262l.m9683d() || c5262l2.m9683d();
        if (c5262l.m9680a().size() != c5262l2.m9680a().size()) {
            C5179c.m9394d("Curves must have the same number of control points. Shape 1: " + c5262l.m9680a().size() + "\tShape 2: " + c5262l2.m9680a().size());
        }
        if (this.f12759a.isEmpty()) {
            int iMin = Math.min(c5262l.m9680a().size(), c5262l2.m9680a().size());
            for (int i2 = 0; i2 < iMin; i2++) {
                this.f12759a.add(new C5229a());
            }
        }
        PointF pointFM9681b = c5262l.m9681b();
        PointF pointFM9681b2 = c5262l2.m9681b();
        m9679e(C5319e.m9880j(pointFM9681b.x, pointFM9681b2.x, f2), C5319e.m9880j(pointFM9681b.y, pointFM9681b2.y, f2));
        for (int size = this.f12759a.size() - 1; size >= 0; size--) {
            C5229a c5229a = c5262l.m9680a().get(size);
            C5229a c5229a2 = c5262l2.m9680a().get(size);
            PointF pointFM9591a = c5229a.m9591a();
            PointF pointFM9592b = c5229a.m9592b();
            PointF pointFM9593c = c5229a.m9593c();
            PointF pointFM9591a2 = c5229a2.m9591a();
            PointF pointFM9592b2 = c5229a2.m9592b();
            PointF pointFM9593c2 = c5229a2.m9593c();
            this.f12759a.get(size).m9594d(C5319e.m9880j(pointFM9591a.x, pointFM9591a2.x, f2), C5319e.m9880j(pointFM9591a.y, pointFM9591a2.y, f2));
            this.f12759a.get(size).m9595e(C5319e.m9880j(pointFM9592b.x, pointFM9592b2.x, f2), C5319e.m9880j(pointFM9592b.y, pointFM9592b2.y, f2));
            this.f12759a.get(size).m9596f(C5319e.m9880j(pointFM9593c.x, pointFM9593c2.x, f2), C5319e.m9880j(pointFM9593c.y, pointFM9593c2.y, f2));
        }
    }

    /* renamed from: d */
    public boolean m9683d() {
        return this.f12761c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f12759a.size() + "closed=" + this.f12761c + '}';
    }

    public C5262l() {
        this.f12759a = new ArrayList();
    }
}
