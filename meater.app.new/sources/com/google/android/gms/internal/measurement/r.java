package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public class r implements InterfaceC2527m, InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    private final Map<String, InterfaceC2574s> f34280B = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.f34280B.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final InterfaceC2574s c(String str) {
        return this.f34280B.containsKey(str) ? this.f34280B.get(str) : InterfaceC2574s.f34292p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s d() {
        r rVar = new r();
        for (Map.Entry<String, InterfaceC2574s> entry : this.f34280B.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2527m) {
                rVar.f34280B.put(entry.getKey(), entry.getValue());
            } else {
                rVar.f34280B.put(entry.getKey(), entry.getValue().d());
            }
        }
        return rVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f34280B.equals(((r) obj).f34280B);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public int hashCode() {
        return this.f34280B.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return C2551p.b(this.f34280B);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final boolean r(String str) {
        return this.f34280B.containsKey(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f34280B.isEmpty()) {
            for (String str : this.f34280B.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f34280B.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        return "toString".equals(str) ? new C2590u(toString()) : C2551p.a(this, new C2590u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final void w(String str, InterfaceC2574s interfaceC2574s) {
        if (interfaceC2574s == null) {
            this.f34280B.remove(str);
        } else {
            this.f34280B.put(str, interfaceC2574s);
        }
    }
}
