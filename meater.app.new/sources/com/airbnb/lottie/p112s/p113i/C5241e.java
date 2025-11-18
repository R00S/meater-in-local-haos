package com.airbnb.lottie.p112s.p113i;

import android.graphics.PointF;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5219i;
import com.airbnb.lottie.p108q.p110b.C5220j;
import com.airbnb.lottie.p119w.C5321a;
import java.util.Collections;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* renamed from: com.airbnb.lottie.s.i.e */
/* loaded from: classes.dex */
public class C5241e implements InterfaceC5249m<PointF, PointF> {

    /* renamed from: a */
    private final List<C5321a<PointF>> f12678a;

    public C5241e() {
        this.f12678a = Collections.singletonList(new C5321a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.airbnb.lottie.p112s.p113i.InterfaceC5249m
    /* renamed from: a */
    public AbstractC5211a<PointF, PointF> mo9617a() {
        return this.f12678a.get(0).m9894d() ? new C5220j(this.f12678a) : new C5219i(this.f12678a);
    }

    public C5241e(List<C5321a<PointF>> list) {
        this.f12678a = list;
    }
}
