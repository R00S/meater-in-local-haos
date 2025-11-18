package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Z2 {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f34024a;

    /* renamed from: b, reason: collision with root package name */
    private E f34025b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, InterfaceC2574s> f34026c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f34027d = new HashMap();

    public Z2(Z2 z22, E e10) {
        this.f34024a = z22;
        this.f34025b = e10;
    }

    public final InterfaceC2574s a(C2479g c2479g) {
        InterfaceC2574s interfaceC2574sA = InterfaceC2574s.f34292p;
        Iterator<Integer> itH = c2479g.H();
        while (itH.hasNext()) {
            interfaceC2574sA = this.f34025b.a(this, c2479g.y(itH.next().intValue()));
            if (interfaceC2574sA instanceof C2519l) {
                break;
            }
        }
        return interfaceC2574sA;
    }

    public final InterfaceC2574s b(InterfaceC2574s interfaceC2574s) {
        return this.f34025b.a(this, interfaceC2574s);
    }

    public final InterfaceC2574s c(String str) {
        Z2 z22 = this;
        while (!z22.f34026c.containsKey(str)) {
            z22 = z22.f34024a;
            if (z22 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return z22.f34026c.get(str);
    }

    public final Z2 d() {
        return new Z2(this, this.f34025b);
    }

    public final void e(String str, InterfaceC2574s interfaceC2574s) {
        if (this.f34027d.containsKey(str)) {
            return;
        }
        if (interfaceC2574s == null) {
            this.f34026c.remove(str);
        } else {
            this.f34026c.put(str, interfaceC2574s);
        }
    }

    public final void f(String str, InterfaceC2574s interfaceC2574s) {
        e(str, interfaceC2574s);
        this.f34027d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        Z2 z22 = this;
        while (!z22.f34026c.containsKey(str)) {
            z22 = z22.f34024a;
            if (z22 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC2574s interfaceC2574s) {
        Z2 z22;
        Z2 z23 = this;
        while (!z23.f34026c.containsKey(str) && (z22 = z23.f34024a) != null && z22.g(str)) {
            z23 = z23.f34024a;
        }
        if (z23.f34027d.containsKey(str)) {
            return;
        }
        if (interfaceC2574s == null) {
            z23.f34026c.remove(str);
        } else {
            z23.f34026c.put(str, interfaceC2574s);
        }
    }
}
