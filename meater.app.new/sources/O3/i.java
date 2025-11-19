package O3;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class i extends Y3.a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    private Path f13192q;

    /* renamed from: r, reason: collision with root package name */
    private final Y3.a<PointF> f13193r;

    public i(L3.i iVar, Y3.a<PointF> aVar) {
        super(iVar, aVar.f19387b, aVar.f19388c, aVar.f19389d, aVar.f19390e, aVar.f19391f, aVar.f19392g, aVar.f19393h);
        this.f13193r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t10;
        T t11;
        T t12 = this.f19388c;
        boolean z10 = (t12 == 0 || (t11 = this.f19387b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f19387b;
        if (t13 == 0 || (t10 = this.f19388c) == 0 || z10) {
            return;
        }
        Y3.a<PointF> aVar = this.f13193r;
        this.f13192q = X3.j.d((PointF) t13, (PointF) t10, aVar.f19400o, aVar.f19401p);
    }

    Path k() {
        return this.f13192q;
    }
}
