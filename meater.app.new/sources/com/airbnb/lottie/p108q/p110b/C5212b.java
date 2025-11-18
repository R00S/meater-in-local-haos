package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p118v.C5316b;
import com.airbnb.lottie.p119w.C5321a;
import com.airbnb.lottie.p119w.C5323c;
import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.b */
/* loaded from: classes.dex */
public class C5212b extends AbstractC5216f<Integer> {
    public C5212b(List<C5321a<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer mo9553i(C5321a<Integer> c5321a, float f2) {
        Integer num;
        Integer num2 = c5321a.f12932b;
        if (num2 == null || c5321a.f12933c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = num2.intValue();
        int iIntValue2 = c5321a.f12933c.intValue();
        C5323c<A> c5323c = this.f12611e;
        return (c5323c == 0 || (num = (Integer) c5323c.m9897b(c5321a.f12935e, c5321a.f12936f.floatValue(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), f2, m9550e(), m9551f())) == null) ? Integer.valueOf(C5316b.m9848c(f2, iIntValue, iIntValue2)) : num;
    }
}
