package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, A> f33708a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private U f33709b = new U();

    public E() {
        b(new C2622y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a10) {
        Iterator<Z> it = a10.f33564a.iterator();
        while (it.hasNext()) {
            this.f33708a.put(it.next().toString(), a10);
        }
    }

    public final InterfaceC2574s a(Z2 z22, InterfaceC2574s interfaceC2574s) {
        Y1.b(z22);
        if (!(interfaceC2574s instanceof C2598v)) {
            return interfaceC2574s;
        }
        C2598v c2598v = (C2598v) interfaceC2574s;
        ArrayList<InterfaceC2574s> arrayListB = c2598v.b();
        String strA = c2598v.a();
        return (this.f33708a.containsKey(strA) ? this.f33708a.get(strA) : this.f33709b).b(strA, z22, arrayListB);
    }
}
