package p;

import java.util.HashMap;
import java.util.Map;
import p.C4189b;

/* compiled from: FastSafeIterableMap.java */
/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4188a<K, V> extends C4189b<K, V> {

    /* renamed from: F, reason: collision with root package name */
    private final HashMap<K, C4189b.c<K, V>> f47315F = new HashMap<>();

    public boolean contains(K k10) {
        return this.f47315F.containsKey(k10);
    }

    @Override // p.C4189b
    protected C4189b.c<K, V> f(K k10) {
        return this.f47315F.get(k10);
    }

    @Override // p.C4189b
    public V r(K k10, V v10) {
        C4189b.c<K, V> cVarF = f(k10);
        if (cVarF != null) {
            return cVarF.f47321C;
        }
        this.f47315F.put(k10, j(k10, v10));
        return null;
    }

    @Override // p.C4189b
    public V v(K k10) {
        V v10 = (V) super.v(k10);
        this.f47315F.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> w(K k10) {
        if (contains(k10)) {
            return this.f47315F.get(k10).f47323E;
        }
        return null;
    }
}
