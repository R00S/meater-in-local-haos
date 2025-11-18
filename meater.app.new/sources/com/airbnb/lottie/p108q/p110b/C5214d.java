package com.airbnb.lottie.p108q.p110b;

import com.airbnb.lottie.p112s.p114j.C5253c;
import com.airbnb.lottie.p119w.C5321a;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.d */
/* loaded from: classes.dex */
public class C5214d extends AbstractC5216f<C5253c> {

    /* renamed from: g */
    private final C5253c f12613g;

    public C5214d(List<C5321a<C5253c>> list) {
        super(list);
        C5253c c5253c = list.get(0).f12932b;
        int iM9634c = c5253c != null ? c5253c.m9634c() : 0;
        this.f12613g = new C5253c(new float[iM9634c], new int[iM9634c]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5253c mo9553i(C5321a<C5253c> c5321a, float f2) {
        this.f12613g.m9635d(c5321a.f12932b, c5321a.f12933c, f2);
        return this.f12613g;
    }
}
