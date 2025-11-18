package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import com.airbnb.lottie.p112s.p114j.C5262l;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p119w.C5321a;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.l */
/* loaded from: classes.dex */
public class C5222l extends AbstractC5211a<C5262l, Path> {

    /* renamed from: g */
    private final C5262l f12623g;

    /* renamed from: h */
    private final Path f12624h;

    public C5222l(List<C5321a<C5262l>> list) {
        super(list);
        this.f12623g = new C5262l();
        this.f12624h = new Path();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Path mo9553i(C5321a<C5262l> c5321a, float f2) {
        this.f12623g.m9682c(c5321a.f12932b, c5321a.f12933c, f2);
        C5319e.m9878h(this.f12623g, this.f12624h);
        return this.f12624h;
    }
}
