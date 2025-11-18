package p024c.p033b.p034a.p036b;

import java.util.HashMap;
import java.util.Map;
import p024c.p033b.p034a.p036b.C0854b;

/* compiled from: FastSafeIterableMap.java */
/* renamed from: c.b.a.b.a */
/* loaded from: classes.dex */
public class C0853a<K, V> extends C0854b<K, V> {

    /* renamed from: j */
    private HashMap<K, C0854b.c<K, V>> f5637j = new HashMap<>();

    public boolean contains(K k2) {
        return this.f5637j.containsKey(k2);
    }

    @Override // p024c.p033b.p034a.p036b.C0854b
    /* renamed from: g */
    protected C0854b.c<K, V> mo5377g(K k2) {
        return this.f5637j.get(k2);
    }

    @Override // p024c.p033b.p034a.p036b.C0854b
    /* renamed from: o */
    public V mo5378o(K k2, V v) {
        C0854b.c<K, V> cVarMo5377g = mo5377g(k2);
        if (cVarMo5377g != null) {
            return cVarMo5377g.f5643g;
        }
        this.f5637j.put(k2, m5385n(k2, v));
        return null;
    }

    @Override // p024c.p033b.p034a.p036b.C0854b
    /* renamed from: q */
    public V mo5379q(K k2) {
        V v = (V) super.mo5379q(k2);
        this.f5637j.remove(k2);
        return v;
    }

    /* renamed from: r */
    public Map.Entry<K, V> m5380r(K k2) {
        if (contains(k2)) {
            return this.f5637j.get(k2).f5645i;
        }
        return null;
    }
}
