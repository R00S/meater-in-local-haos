package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2535n implements InterfaceC2527m, InterfaceC2574s {

    /* renamed from: B, reason: collision with root package name */
    protected final String f34216B;

    /* renamed from: C, reason: collision with root package name */
    protected final Map<String, InterfaceC2574s> f34217C = new HashMap();

    public AbstractC2535n(String str) {
        this.f34216B = str;
    }

    public abstract InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list);

    public final String b() {
        return this.f34216B;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final InterfaceC2574s c(String str) {
        return this.f34217C.containsKey(str) ? this.f34217C.get(str) : InterfaceC2574s.f34292p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2535n)) {
            return false;
        }
        AbstractC2535n abstractC2535n = (AbstractC2535n) obj;
        String str = this.f34216B;
        if (str != null) {
            return str.equals(abstractC2535n.f34216B);
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
        String str = this.f34216B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final String i() {
        return this.f34216B;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final Iterator<InterfaceC2574s> j() {
        return C2551p.b(this.f34217C);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final boolean r(String str) {
        return this.f34217C.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public final InterfaceC2574s v(String str, Z2 z22, List<InterfaceC2574s> list) {
        return "toString".equals(str) ? new C2590u(this.f34216B) : C2551p.a(this, new C2590u(str), z22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2527m
    public final void w(String str, InterfaceC2574s interfaceC2574s) {
        if (interfaceC2574s == null) {
            this.f34217C.remove(str);
        } else {
            this.f34217C.put(str, interfaceC2574s);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2574s
    public InterfaceC2574s d() {
        return this;
    }
}
