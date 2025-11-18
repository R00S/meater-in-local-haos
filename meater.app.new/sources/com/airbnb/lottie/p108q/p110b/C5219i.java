package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.i */
/* loaded from: classes.dex */
public class C5219i extends AbstractC5216f<PointF> {

    /* renamed from: g */
    private final PointF f12618g;

    /* renamed from: h */
    private final float[] f12619h;

    /* renamed from: i */
    private C5218h f12620i;

    /* renamed from: j */
    private PathMeasure f12621j;

    public C5219i(List<? extends C5321a<PointF>> list) {
        super(list);
        this.f12618g = new PointF();
        this.f12619h = new float[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PointF mo9553i(C5321a<PointF> c5321a, float f2) {
        PointF pointF;
        C5218h c5218h = (C5218h) c5321a;
        Path pathM9565e = c5218h.m9565e();
        if (pathM9565e == null) {
            return c5321a.f12932b;
        }
        C5323c<A> c5323c = this.f12611e;
        if (c5323c != 0 && (pointF = (PointF) c5323c.m9897b(c5218h.f12935e, c5218h.f12936f.floatValue(), c5218h.f12932b, c5218h.f12933c, m9550e(), f2, m9551f())) != null) {
            return pointF;
        }
        if (this.f12620i != c5218h) {
            this.f12621j = new PathMeasure(pathM9565e, false);
            this.f12620i = c5218h;
        }
        PathMeasure pathMeasure = this.f12621j;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f12619h, null);
        PointF pointF2 = this.f12618g;
        float[] fArr = this.f12619h;
        pointF2.set(fArr[0], fArr[1]);
        return this.f12618g;
    }
}
