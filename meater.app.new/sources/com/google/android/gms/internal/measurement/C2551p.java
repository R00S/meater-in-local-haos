package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2551p {
    public static InterfaceC2574s a(InterfaceC2527m interfaceC2527m, InterfaceC2574s interfaceC2574s, Z2 z22, List<InterfaceC2574s> list) {
        if (interfaceC2527m.r(interfaceC2574s.i())) {
            InterfaceC2574s interfaceC2574sC = interfaceC2527m.c(interfaceC2574s.i());
            if (interfaceC2574sC instanceof AbstractC2535n) {
                return ((AbstractC2535n) interfaceC2574sC).a(z22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2574s.i()));
        }
        if (!"hasOwnProperty".equals(interfaceC2574s.i())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2574s.i()));
        }
        Y1.g("hasOwnProperty", 1, list);
        return interfaceC2527m.r(z22.b(list.get(0)).i()) ? InterfaceC2574s.f34297u : InterfaceC2574s.f34298v;
    }

    public static Iterator<InterfaceC2574s> b(Map<String, InterfaceC2574s> map) {
        return new C2543o(map.keySet().iterator());
    }
}
