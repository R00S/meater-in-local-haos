package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u3 */
/* loaded from: classes2.dex */
class C7597u3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f27903f;

    /* renamed from: g */
    private List<C7627z3> f27904g;

    /* renamed from: h */
    private Map<K, V> f27905h;

    /* renamed from: i */
    private boolean f27906i;

    /* renamed from: j */
    private volatile C7484b4 f27907j;

    /* renamed from: k */
    private Map<K, V> f27908k;

    /* renamed from: l */
    private volatile C7603v3 f27909l;

    private C7597u3(int i2) {
        this.f27903f = i2;
        this.f27904g = Collections.emptyList();
        this.f27905h = Collections.emptyMap();
        this.f27908k = Collections.emptyMap();
    }

    /* renamed from: a */
    private final int m21418a(K k2) {
        int size = this.f27904g.size() - 1;
        if (size >= 0) {
            int iCompareTo = k2.compareTo((Comparable) this.f27904g.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo((Comparable) this.f27904g.get(i3).getKey());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    static <FieldDescriptorType extends zzey<FieldDescriptorType>> C7597u3<FieldDescriptorType, Object> m21419b(int i2) {
        return new C7591t3(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final V m21423l(int i2) {
        m21426q();
        V v = (V) this.f27904g.remove(i2).getValue();
        if (!this.f27905h.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m21427r().entrySet().iterator();
            this.f27904g.add(new C7627z3(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m21426q() {
        if (this.f27906i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: r */
    private final SortedMap<K, V> m21427r() {
        m21426q();
        if (this.f27905h.isEmpty() && !(this.f27905h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f27905h = treeMap;
            this.f27908k = treeMap.descendingMap();
        }
        return (SortedMap) this.f27905h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m21426q();
        if (!this.f27904g.isEmpty()) {
            this.f27904g.clear();
        }
        if (this.f27905h.isEmpty()) {
            return;
        }
        this.f27905h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m21418a(comparable) >= 0 || this.f27905h.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        m21426q();
        int iM21418a = m21418a(k2);
        if (iM21418a >= 0) {
            return (V) this.f27904g.get(iM21418a).setValue(v);
        }
        m21426q();
        if (this.f27904g.isEmpty() && !(this.f27904g instanceof ArrayList)) {
            this.f27904g = new ArrayList(this.f27903f);
        }
        int i2 = -(iM21418a + 1);
        if (i2 >= this.f27903f) {
            return m21427r().put(k2, v);
        }
        int size = this.f27904g.size();
        int i3 = this.f27903f;
        if (size == i3) {
            C7627z3 c7627z3Remove = this.f27904g.remove(i3 - 1);
            m21427r().put((Comparable) c7627z3Remove.getKey(), c7627z3Remove.getValue());
        }
        this.f27904g.add(i2, new C7627z3(this, k2, v));
        return null;
    }

    /* renamed from: e */
    public void mo21407e() {
        if (this.f27906i) {
            return;
        }
        this.f27905h = this.f27905h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27905h);
        this.f27908k = this.f27908k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27908k);
        this.f27906i = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f27907j == null) {
            this.f27907j = new C7484b4(this, null);
        }
        return this.f27907j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7597u3)) {
            return super.equals(obj);
        }
        C7597u3 c7597u3 = (C7597u3) obj;
        int size = size();
        if (size != c7597u3.size()) {
            return false;
        }
        int iM21431k = m21431k();
        if (iM21431k != c7597u3.m21431k()) {
            return entrySet().equals(c7597u3.entrySet());
        }
        for (int i2 = 0; i2 < iM21431k; i2++) {
            if (!m21429i(i2).equals(c7597u3.m21429i(i2))) {
                return false;
            }
        }
        if (iM21431k != size) {
            return this.f27905h.equals(c7597u3.f27905h);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM21418a = m21418a(comparable);
        return iM21418a >= 0 ? (V) this.f27904g.get(iM21418a).getValue() : this.f27905h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM21431k = m21431k();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iM21431k; i2++) {
            iHashCode += this.f27904g.get(i2).hashCode();
        }
        return this.f27905h.size() > 0 ? iHashCode + this.f27905h.hashCode() : iHashCode;
    }

    /* renamed from: i */
    public final Map.Entry<K, V> m21429i(int i2) {
        return this.f27904g.get(i2);
    }

    /* renamed from: j */
    public final boolean m21430j() {
        return this.f27906i;
    }

    /* renamed from: k */
    public final int m21431k() {
        return this.f27904g.size();
    }

    /* renamed from: n */
    public final Iterable<Map.Entry<K, V>> m21432n() {
        return this.f27905h.isEmpty() ? C7621y3.m21477a() : this.f27905h.entrySet();
    }

    /* renamed from: p */
    final Set<Map.Entry<K, V>> m21433p() {
        if (this.f27909l == null) {
            this.f27909l = new C7603v3(this, null);
        }
        return this.f27909l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m21426q();
        Comparable comparable = (Comparable) obj;
        int iM21418a = m21418a(comparable);
        if (iM21418a >= 0) {
            return m21423l(iM21418a);
        }
        if (this.f27905h.isEmpty()) {
            return null;
        }
        return this.f27905h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f27904g.size() + this.f27905h.size();
    }

    /* synthetic */ C7597u3(int i2, C7591t3 c7591t3) {
        this(i2);
    }
}
