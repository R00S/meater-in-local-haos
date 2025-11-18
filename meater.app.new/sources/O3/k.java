package O3;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f13199i;

    public k(List<Y3.a<PointF>> list) {
        super(list);
        this.f13199i = new PointF();
    }

    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(Y3.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(Y3.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f19387b;
        if (pointF3 == null || (pointF = aVar.f19388c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        Y3.c<A> cVar = this.f13169e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.f19392g, aVar.f19393h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f13199i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f13199i;
    }
}
