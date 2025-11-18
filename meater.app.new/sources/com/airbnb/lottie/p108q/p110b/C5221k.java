package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import com.airbnb.lottie.p119w.C5324d;
import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.k */
/* loaded from: classes.dex */
public class C5221k extends AbstractC5216f<C5324d> {
    public C5221k(List<C5321a<C5324d>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5324d mo9553i(C5321a<C5324d> c5321a, float f2) {
        C5324d c5324d;
        C5324d c5324d2;
        C5324d c5324d3 = c5321a.f12932b;
        if (c5324d3 == null || (c5324d = c5321a.f12933c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5324d c5324d4 = c5324d3;
        C5324d c5324d5 = c5324d;
        C5323c<A> c5323c = this.f12611e;
        return (c5323c == 0 || (c5324d2 = (C5324d) c5323c.m9897b(c5321a.f12935e, c5321a.f12936f.floatValue(), c5324d4, c5324d5, f2, m9550e(), m9551f())) == null) ? new C5324d(C5319e.m9880j(c5324d4.m9899a(), c5324d5.m9899a(), f2), C5319e.m9880j(c5324d4.m9900b(), c5324d5.m9900b(), f2)) : c5324d2;
    }
}
