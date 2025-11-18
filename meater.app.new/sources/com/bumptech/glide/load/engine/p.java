package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import m6.InterfaceC3970e;

/* compiled from: Jobs.java */
/* loaded from: classes2.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<InterfaceC3970e, k<?>> f33247a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<InterfaceC3970e, k<?>> f33248b = new HashMap();

    p() {
    }

    private Map<InterfaceC3970e, k<?>> b(boolean z10) {
        return z10 ? this.f33248b : this.f33247a;
    }

    k<?> a(InterfaceC3970e interfaceC3970e, boolean z10) {
        return b(z10).get(interfaceC3970e);
    }

    void c(InterfaceC3970e interfaceC3970e, k<?> kVar) {
        b(kVar.o()).put(interfaceC3970e, kVar);
    }

    void d(InterfaceC3970e interfaceC3970e, k<?> kVar) {
        Map<InterfaceC3970e, k<?>> mapB = b(kVar.o());
        if (kVar.equals(mapB.get(interfaceC3970e))) {
            mapB.remove(interfaceC3970e);
        }
    }
}
