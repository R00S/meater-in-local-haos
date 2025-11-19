package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
class G5<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: B, reason: collision with root package name */
    private Object[] f33757B;

    /* renamed from: C, reason: collision with root package name */
    private int f33758C;

    /* renamed from: D, reason: collision with root package name */
    private Map<K, V> f33759D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f33760E;

    /* renamed from: F, reason: collision with root package name */
    private volatile M5 f33761F;

    /* renamed from: G, reason: collision with root package name */
    private Map<K, V> f33762G;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(K r5) {
        /*
            r4 = this;
            int r0 = r4.f33758C
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1f
            java.lang.Object[] r2 = r4.f33757B
            r2 = r2[r1]
            com.google.android.gms.internal.measurement.K5 r2 = (com.google.android.gms.internal.measurement.K5) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1c
            int r0 = r0 + 1
        L1a:
            int r5 = -r0
            return r5
        L1c:
            if (r2 != 0) goto L1f
            return r1
        L1f:
            r0 = 0
        L20:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.f33757B
            r3 = r3[r2]
            com.google.android.gms.internal.measurement.K5 r3 = (com.google.android.gms.internal.measurement.K5) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L20
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L20
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.G5.b(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V j(int i10) {
        u();
        V v10 = (V) ((K5) this.f33757B[i10]).getValue();
        Object[] objArr = this.f33757B;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f33758C - i10) - 1);
        this.f33758C--;
        if (!this.f33759D.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f33757B[this.f33758C] = new K5(this, it.next());
            this.f33758C++;
            it.remove();
        }
        return v10;
    }

    private final SortedMap<K, V> s() {
        u();
        if (this.f33759D.isEmpty() && !(this.f33759D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f33759D = treeMap;
            this.f33762G = treeMap.descendingMap();
        }
        return (SortedMap) this.f33759D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (this.f33760E) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        u();
        if (this.f33758C != 0) {
            this.f33757B = null;
            this.f33758C = 0;
        }
        if (this.f33759D.isEmpty()) {
            return;
        }
        this.f33759D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f33759D.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        u();
        int iB = b(k10);
        if (iB >= 0) {
            return (V) ((K5) this.f33757B[iB]).setValue(v10);
        }
        u();
        if (this.f33757B == null) {
            this.f33757B = new Object[16];
        }
        int i10 = -(iB + 1);
        if (i10 >= 16) {
            return s().put(k10, v10);
        }
        int i11 = this.f33758C;
        if (i11 == 16) {
            K5 k52 = (K5) this.f33757B[15];
            this.f33758C = i11 - 1;
            s().put((Comparable) k52.getKey(), k52.getValue());
        }
        Object[] objArr = this.f33757B;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.f33757B[i10] = new K5(this, k10, v10);
        this.f33758C++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f33761F == null) {
            this.f33761F = new M5(this);
        }
        return this.f33761F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return super.equals(obj);
        }
        G5 g52 = (G5) obj;
        int size = size();
        if (size != g52.size()) {
            return false;
        }
        int i10 = this.f33758C;
        if (i10 != g52.f33758C) {
            return entrySet().equals(g52.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(g52.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f33759D.equals(g52.f33759D);
        }
        return true;
    }

    public final Map.Entry<K, V> g(int i10) {
        if (i10 < this.f33758C) {
            return (K5) this.f33757B[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? (V) ((K5) this.f33757B[iB]).getValue() : this.f33759D.get(comparable);
    }

    public void h() {
        if (this.f33760E) {
            return;
        }
        this.f33759D = this.f33759D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f33759D);
        this.f33762G = this.f33762G.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f33762G);
        this.f33760E = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = this.f33758C;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f33757B[i11].hashCode();
        }
        return this.f33759D.size() > 0 ? iHashCode + this.f33759D.hashCode() : iHashCode;
    }

    public final int i() {
        return this.f33758C;
    }

    public final Iterable<Map.Entry<K, V>> l() {
        return this.f33759D.isEmpty() ? Collections.emptySet() : this.f33759D.entrySet();
    }

    final Set<Map.Entry<K, V>> n() {
        return new H5(this);
    }

    public final boolean p() {
        return this.f33760E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        u();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return j(iB);
        }
        if (this.f33759D.isEmpty()) {
            return null;
        }
        return this.f33759D.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f33758C + this.f33759D.size();
    }

    private G5() {
        this.f33759D = Collections.emptyMap();
        this.f33762G = Collections.emptyMap();
    }
}
