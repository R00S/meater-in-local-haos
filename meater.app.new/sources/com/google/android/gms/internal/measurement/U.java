package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        if (str == null || str.isEmpty() || !z22.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC2574s interfaceC2574sC = z22.c(str);
        if (interfaceC2574sC instanceof AbstractC2535n) {
            return ((AbstractC2535n) interfaceC2574sC).a(z22, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
