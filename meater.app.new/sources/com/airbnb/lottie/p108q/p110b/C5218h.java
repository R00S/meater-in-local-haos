package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5321a;

/* compiled from: PathKeyframe.java */
/* renamed from: com.airbnb.lottie.q.b.h */
/* loaded from: classes.dex */
public class C5218h extends C5321a<PointF> {

    /* renamed from: k */
    private Path f12617k;

    /* JADX WARN: Multi-variable type inference failed */
    public C5218h(C5180d c5180d, C5321a<PointF> c5321a) {
        T t;
        super(c5180d, c5321a.f12932b, c5321a.f12933c, c5321a.f12934d, c5321a.f12935e, c5321a.f12936f);
        T t2 = this.f12933c;
        boolean z = (t2 == 0 || (t = this.f12932b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f12933c;
        if (t3 == 0 || z) {
            return;
        }
        this.f12617k = C5320f.m9886d((PointF) this.f12932b, (PointF) t3, c5321a.f12939i, c5321a.f12940j);
    }

    /* renamed from: e */
    Path m9565e() {
        return this.f12617k;
    }
}
