package H6;

import s.C4391a;
import s.X;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes2.dex */
public final class b<K, V> extends C4391a<K, V> {

    /* renamed from: H, reason: collision with root package name */
    private int f5580H;

    @Override // s.X, java.util.Map
    public void clear() {
        this.f5580H = 0;
        super.clear();
    }

    @Override // s.X, java.util.Map
    public int hashCode() {
        if (this.f5580H == 0) {
            this.f5580H = super.hashCode();
        }
        return this.f5580H;
    }

    @Override // s.X
    public void i(X<? extends K, ? extends V> x10) {
        this.f5580H = 0;
        super.i(x10);
    }

    @Override // s.X
    public V j(int i10) {
        this.f5580H = 0;
        return (V) super.j(i10);
    }

    @Override // s.X
    public V k(int i10, V v10) {
        this.f5580H = 0;
        return (V) super.k(i10, v10);
    }

    @Override // s.X, java.util.Map
    public V put(K k10, V v10) {
        this.f5580H = 0;
        return (V) super.put(k10, v10);
    }
}
