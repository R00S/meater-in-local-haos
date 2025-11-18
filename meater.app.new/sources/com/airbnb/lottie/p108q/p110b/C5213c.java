package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.c */
/* loaded from: classes.dex */
public class C5213c extends AbstractC5216f<Float> {
    public C5213c(List<C5321a<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float mo9553i(C5321a<Float> c5321a, float f2) {
        Float f3;
        if (c5321a.f12932b == null || c5321a.f12933c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5323c<A> c5323c = this.f12611e;
        return (c5323c == 0 || (f3 = (Float) c5323c.m9897b(c5321a.f12935e, c5321a.f12936f.floatValue(), c5321a.f12932b, c5321a.f12933c, f2, m9550e(), m9551f())) == null) ? Float.valueOf(C5319e.m9880j(c5321a.f12932b.floatValue(), c5321a.f12933c.floatValue(), f2)) : f3;
    }
}
