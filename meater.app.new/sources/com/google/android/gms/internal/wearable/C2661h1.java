package com.google.android.gms.internal.wearable;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2661h1 extends AbstractMap {

    /* renamed from: B, reason: collision with root package name */
    private Object[] f34628B;

    /* renamed from: C, reason: collision with root package name */
    private int f34629C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f34631E;

    /* renamed from: F, reason: collision with root package name */
    private volatile C2655f1 f34632F;

    /* renamed from: D, reason: collision with root package name */
    private Map f34630D = Collections.emptyMap();

    /* renamed from: G, reason: collision with root package name */
    private Map f34633G = Collections.emptyMap();

    private C2661h1() {
    }

    private final int n(Comparable comparable) {
        int i10 = this.f34629C;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C2649d1) this.f34628B[i11]).c());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C2649d1) this.f34628B[i13]).c());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(int i10) {
        q();
        Object value = ((C2649d1) this.f34628B[i10]).getValue();
        Object[] objArr = this.f34628B;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f34629C - i10) - 1);
        this.f34629C--;
        if (!this.f34630D.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f34628B;
            int i11 = this.f34629C;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C2649d1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f34629C++;
            it.remove();
        }
        return value;
    }

    private final SortedMap p() {
        q();
        if (this.f34630D.isEmpty() && !(this.f34630D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34630D = treeMap;
            this.f34633G = treeMap.descendingMap();
        }
        return (SortedMap) this.f34630D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.f34631E) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f34631E) {
            return;
        }
        this.f34630D = this.f34630D.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34630D);
        this.f34633G = this.f34633G.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34633G);
        this.f34631E = true;
    }

    public final int c() {
        return this.f34629C;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        q();
        if (this.f34629C != 0) {
            this.f34628B = null;
            this.f34629C = 0;
        }
        if (this.f34630D.isEmpty()) {
            return;
        }
        this.f34630D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f34630D.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f34630D.isEmpty() ? Collections.emptySet() : this.f34630D.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f34632F == null) {
            this.f34632F = new C2655f1(this, null);
        }
        return this.f34632F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2661h1)) {
            return super.equals(obj);
        }
        C2661h1 c2661h1 = (C2661h1) obj;
        int size = size();
        if (size != c2661h1.size()) {
            return false;
        }
        int i10 = this.f34629C;
        if (i10 != c2661h1.f34629C) {
            return entrySet().equals(c2661h1.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!i(i11).equals(c2661h1.i(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f34630D.equals(c2661h1.f34630D);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((C2649d1) this.f34628B[iN]).getValue() : this.f34630D.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        q();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((C2649d1) this.f34628B[iN]).setValue(obj);
        }
        q();
        if (this.f34628B == null) {
            this.f34628B = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.f34629C == 16) {
            C2649d1 c2649d1 = (C2649d1) this.f34628B[15];
            this.f34629C = 15;
            p().put(c2649d1.c(), c2649d1.getValue());
        }
        Object[] objArr = this.f34628B;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f34628B[i10] = new C2649d1(this, comparable, obj);
        this.f34629C++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f34629C;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f34628B[i11].hashCode();
        }
        return this.f34630D.size() > 0 ? iHashCode + this.f34630D.hashCode() : iHashCode;
    }

    public final Map.Entry i(int i10) {
        if (i10 < this.f34629C) {
            return (C2649d1) this.f34628B[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final boolean l() {
        return this.f34631E;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return o(iN);
        }
        if (this.f34630D.isEmpty()) {
            return null;
        }
        return this.f34630D.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34629C + this.f34630D.size();
    }

    /* synthetic */ C2661h1(C2658g1 c2658g1) {
    }
}
