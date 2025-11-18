package com.airbnb.lottie.p112s.p115k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5195c;
import com.airbnb.lottie.p112s.C5233e;
import com.airbnb.lottie.p112s.p114j.C5264n;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* renamed from: com.airbnb.lottie.s.k.f */
/* loaded from: classes.dex */
public class C5273f extends AbstractC5268a {

    /* renamed from: w */
    private final C5195c f12868w;

    C5273f(C5182f c5182f, C5271d c5271d) {
        super(c5182f, c5271d);
        C5195c c5195c = new C5195c(c5182f, this, new C5264n("__container", c5271d.m9743l()));
        this.f12868w = c5195c;
        c5195c.mo9513b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        this.f12868w.mo9515d(rectF, this.f12811m);
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: n */
    void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        this.f12868w.mo9516f(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: w */
    protected void mo9728w(C5233e c5233e, int i2, List<C5233e> list, C5233e c5233e2) {
        this.f12868w.mo9514c(c5233e, i2, list, c5233e2);
    }
}
