package com.airbnb.lottie.p108q.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.j */
/* loaded from: classes.dex */
public class C5220j extends AbstractC5216f<PointF> {

    /* renamed from: g */
    private final PointF f12622g;

    public C5220j(List<C5321a<PointF>> list) {
        super(list);
        this.f12622g = new PointF();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF mo9553i(C5321a<PointF> c5321a, float f2) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c5321a.f12932b;
        if (pointF3 == null || (pointF = c5321a.f12933c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        C5323c<A> c5323c = this.f12611e;
        if (c5323c != 0 && (pointF2 = (PointF) c5323c.m9897b(c5321a.f12935e, c5321a.f12936f.floatValue(), pointF4, pointF5, f2, m9550e(), m9551f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f12622g;
        float f3 = pointF4.x;
        float f4 = f3 + ((pointF5.x - f3) * f2);
        float f5 = pointF4.y;
        pointF6.set(f4, f5 + (f2 * (pointF5.y - f5)));
        return this.f12622g;
    }
}
