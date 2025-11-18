package O3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f13194i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f13195j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f13196k;

    /* renamed from: l, reason: collision with root package name */
    private final PathMeasure f13197l;

    /* renamed from: m, reason: collision with root package name */
    private i f13198m;

    public j(List<? extends Y3.a<PointF>> list) {
        super(list);
        this.f13194i = new PointF();
        this.f13195j = new float[2];
        this.f13196k = new float[2];
        this.f13197l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(Y3.a<PointF> aVar, float f10) {
        PointF pointF;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        if (pathK == null) {
            return aVar.f19387b;
        }
        Y3.c<A> cVar = this.f13169e;
        if (cVar != 0 && (pointF = (PointF) cVar.b(iVar.f19392g, iVar.f19393h.floatValue(), (PointF) iVar.f19387b, (PointF) iVar.f19388c, e(), f10, f())) != null) {
            return pointF;
        }
        if (this.f13198m != iVar) {
            this.f13197l.setPath(pathK, false);
            this.f13198m = iVar;
        }
        float length = this.f13197l.getLength();
        float f11 = f10 * length;
        this.f13197l.getPosTan(f11, this.f13195j, this.f13196k);
        PointF pointF2 = this.f13194i;
        float[] fArr = this.f13195j;
        pointF2.set(fArr[0], fArr[1]);
        if (f11 < 0.0f) {
            PointF pointF3 = this.f13194i;
            float[] fArr2 = this.f13196k;
            pointF3.offset(fArr2[0] * f11, fArr2[1] * f11);
        } else if (f11 > length) {
            PointF pointF4 = this.f13194i;
            float[] fArr3 = this.f13196k;
            float f12 = f11 - length;
            pointF4.offset(fArr3[0] * f12, fArr3[1] * f12);
        }
        return this.f13194i;
    }
}
