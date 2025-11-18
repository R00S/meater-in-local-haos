package com.airbnb.lottie.p112s.p113i;

import android.graphics.PointF;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5223m;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: com.airbnb.lottie.s.i.i */
/* loaded from: classes.dex */
public class C5245i implements InterfaceC5249m<PointF, PointF> {

    /* renamed from: a */
    private final C5238b f12679a;

    /* renamed from: b */
    private final C5238b f12680b;

    public C5245i(C5238b c5238b, C5238b c5238b2) {
        this.f12679a = c5238b;
        this.f12680b = c5238b2;
    }

    @Override // com.airbnb.lottie.p112s.p113i.InterfaceC5249m
    /* renamed from: a */
    public AbstractC5211a<PointF, PointF> mo9617a() {
        return new C5223m(this.f12679a.mo9617a(), this.f12680b.mo9617a());
    }
}
