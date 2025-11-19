package R3;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final b f14778a;

    /* renamed from: b, reason: collision with root package name */
    private final b f14779b;

    public i(b bVar, b bVar2) {
        this.f14778a = bVar;
        this.f14779b = bVar2;
    }

    @Override // R3.m
    public boolean g() {
        return this.f14778a.g() && this.f14779b.g();
    }

    @Override // R3.m
    public O3.a<PointF, PointF> h() {
        return new O3.n(this.f14778a.h(), this.f14779b.h());
    }

    @Override // R3.m
    public List<Y3.a<PointF>> i() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
