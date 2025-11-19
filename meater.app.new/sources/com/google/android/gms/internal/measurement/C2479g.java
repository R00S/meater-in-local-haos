package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2479g implements InterfaceC2527m, InterfaceC2574s, Iterable<InterfaceC2574s> {

    /* renamed from: B, reason: collision with root package name */
    private final SortedMap<Integer, InterfaceC2574s> f34115B;

    /* renamed from: C, reason: collision with root package name */
    private final Map<String, InterfaceC2574s> f34116C;

    public C2479g() {
        this.f34115B = new TreeMap();
        this.f34116C = new TreeMap();
    }

    public final void A(InterfaceC2574s interfaceC2574s) {
        F(B(), interfaceC2574s);
    }

    public final int B() {
        if (this.f34115B.isEmpty()) {
            return 0;
        }
        return this.f34115B.lastKey().intValue() + 1;
    }

    public final String D(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f34115B.isEmpty()) {
            for (int i10 = 0; i10 < B(); i10++) {
                InterfaceC2574s interfaceC2574sY = y(i10);
                sb2.append(str);
                if (!(interfaceC2574sY instanceof C2630z) && !(interfaceC2574sY instanceof C2559q)) {
                    sb2.append(interfaceC2574sY.i());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final void E(int i10) {
        int iIntValue = this.f34115B.lastKey().intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        this.f34115B.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            if (this.f34115B.containsKey(Integer.valueOf(i11)) || i11 < 0) {
                return;
            }
            this.f34115B.put(Integer.valueOf(i11), InterfaceC2574s.f34292p);
            return;
        }
        while (true) {
            i10++;
            if (i10 > this.f34115B.lastKey().intValue()) {
                return;
            }
            InterfaceC2574s interfaceC2574s = this.f34115B.get(Integer.valueOf(i10));
            if (interfaceC2574s != null) {
                this.f34115B.put(Integer.valueOf(i10 - 1), interfaceC2574s);
                this.f34115B.remove(Integer.valueOf(i10));
            }
        }
    }

    public final void F(int i10, InterfaceC2574s interfaceC2574s) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        }
        if (interfaceC2574s == null) {
            this.f34115B.remove(Integer.valueOf(i10));
        } else {
            this.f34115B.put(Integer.valueOf(i10), interfaceC2574s);
        }
    }

    public final boolean G(int i10) {
        if (i10 >= 0 && i10 <= this.f34115B.lastKey().intValue()) {
            return this.f34115B.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }

    public final Iterator<Integer> H() {
        return this.f34115B.keySet().iterator();
    }

    public final List<InterfaceC2574s> I() {
        ArrayList arrayList = new ArrayList(B());
        for (int i10 = 0; i10 < B(); i10++) {
            arrayList.add(y(i10));
        }
        return arrayList;
    }

    public final void J() {
        this.f34115B.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final InterfaceC2574s c(String str) {
        InterfaceC2574s interfaceC2574s;
        return "length".equals(str) ? new C2511k(Double.valueOf(B())) : (!r(str) || (interfaceC2574s = this.f34116C.get(str)) == null) ? InterfaceC2574s.f34292p : interfaceC2574s;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        C2479g c2479g = new C2479g();
        for (Map.Entry<Integer, InterfaceC2574s> entry : this.f34115B.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2527m) {
                c2479g.f34115B.put(entry.getKey(), entry.getValue());
            } else {
                c2479g.f34115B.put(entry.getKey(), entry.getValue().d());
            }
        }
        return c2479g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2479g)) {
            return false;
        }
        C2479g c2479g = (C2479g) obj;
        if (B() != c2479g.B()) {
            return false;
        }
        if (this.f34115B.isEmpty()) {
            return c2479g.f34115B.isEmpty();
        }
        for (int iIntValue = this.f34115B.firstKey().intValue(); iIntValue <= this.f34115B.lastKey().intValue(); iIntValue++) {
            if (!y(iIntValue).equals(c2479g.y(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        return this.f34115B.size() == 1 ? y(0).h() : this.f34115B.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f34115B.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        return toString();
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2574s> iterator() {
        return new C2495i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return new C2471f(this, this.f34115B.keySet().iterator(), this.f34116C.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final boolean r(String str) {
        return "length".equals(str) || this.f34116C.containsKey(str);
    }

    public final String toString() {
        return D(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, z22, list) : C2551p.a(this, new C2590u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final void w(String str, InterfaceC2574s interfaceC2574s) {
        if (interfaceC2574s == null) {
            this.f34116C.remove(str);
        } else {
            this.f34116C.put(str, interfaceC2574s);
        }
    }

    public final int x() {
        return this.f34115B.size();
    }

    public final InterfaceC2574s y(int i10) {
        InterfaceC2574s interfaceC2574s;
        if (i10 < B()) {
            return (!G(i10) || (interfaceC2574s = this.f34115B.get(Integer.valueOf(i10))) == null) ? InterfaceC2574s.f34292p : interfaceC2574s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void z(int i10, InterfaceC2574s interfaceC2574s) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        }
        if (i10 >= B()) {
            F(i10, interfaceC2574s);
            return;
        }
        for (int iIntValue = this.f34115B.lastKey().intValue(); iIntValue >= i10; iIntValue--) {
            InterfaceC2574s interfaceC2574s2 = this.f34115B.get(Integer.valueOf(iIntValue));
            if (interfaceC2574s2 != null) {
                F(iIntValue + 1, interfaceC2574s2);
                this.f34115B.remove(Integer.valueOf(iIntValue));
            }
        }
        F(i10, interfaceC2574s);
    }

    public C2479g(List<InterfaceC2574s> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                F(i10, list.get(i10));
            }
        }
    }

    public C2479g(InterfaceC2574s... interfaceC2574sArr) {
        this((List<InterfaceC2574s>) Arrays.asList(interfaceC2574sArr));
    }
}
