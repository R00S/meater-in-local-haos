package R3;

import java.util.Arrays;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<Y3.a<V>> f14794a;

    n(List<Y3.a<V>> list) {
        this.f14794a = list;
    }

    @Override // R3.m
    public boolean g() {
        if (this.f14794a.isEmpty()) {
            return true;
        }
        return this.f14794a.size() == 1 && this.f14794a.get(0).i();
    }

    @Override // R3.m
    public List<Y3.a<V>> i() {
        return this.f14794a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f14794a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f14794a.toArray()));
        }
        return sb2.toString();
    }
}
