package R3;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    private final List<Y3.a<PointF>> f14777a;

    public e(List<Y3.a<PointF>> list) {
        this.f14777a = list;
    }

    @Override // R3.m
    public boolean g() {
        return this.f14777a.size() == 1 && this.f14777a.get(0).i();
    }

    @Override // R3.m
    public O3.a<PointF, PointF> h() {
        return this.f14777a.get(0).i() ? new O3.k(this.f14777a) : new O3.j(this.f14777a);
    }

    @Override // R3.m
    public List<Y3.a<PointF>> i() {
        return this.f14777a;
    }
}
