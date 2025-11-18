package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.e */
/* loaded from: classes.dex */
public class C5215e extends AbstractC5216f<Integer> {
    public C5215e(List<C5321a<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer mo9553i(C5321a<Integer> c5321a, float f2) {
        Integer num;
        if (c5321a.f12932b == null || c5321a.f12933c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5323c<A> c5323c = this.f12611e;
        return (c5323c == 0 || (num = (Integer) c5323c.m9897b(c5321a.f12935e, c5321a.f12936f.floatValue(), c5321a.f12932b, c5321a.f12933c, f2, m9550e(), m9551f())) == null) ? Integer.valueOf(C5319e.m9881k(c5321a.f12932b.intValue(), c5321a.f12933c.intValue(), f2)) : num;
    }
}
