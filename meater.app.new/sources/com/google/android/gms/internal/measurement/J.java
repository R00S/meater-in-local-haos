package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class J extends A {
    protected J() {
        this.f33564a.add(Z.AND);
        this.f33564a.add(Z.NOT);
        this.f33564a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        int i10 = M.f33813a[Y1.c(str).ordinal()];
        if (i10 == 1) {
            Y1.f(Z.AND, 2, list);
            InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
            return !interfaceC2574sB.f().booleanValue() ? interfaceC2574sB : z22.b(list.get(1));
        }
        if (i10 == 2) {
            Y1.f(Z.NOT, 1, list);
            return new C2487h(Boolean.valueOf(!z22.b(list.get(0)).f().booleanValue()));
        }
        if (i10 != 3) {
            return super.a(str);
        }
        Y1.f(Z.OR, 2, list);
        InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(0));
        return interfaceC2574sB2.f().booleanValue() ? interfaceC2574sB2 : z22.b(list.get(1));
    }
}
