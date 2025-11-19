package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2627y4 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private final C2454d f34449D;

    public C2627y4(C2454d c2454d) {
        super("internal.eventLogger");
        this.f34449D = c2454d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Y1.g(this.f34216B, 3, list);
        String strI = z22.b(list.get(0)).i();
        long jA = (long) Y1.a(z22.b(list.get(1)).h().doubleValue());
        InterfaceC2574s interfaceC2574sB = z22.b(list.get(2));
        this.f34449D.c(strI, jA, interfaceC2574sB instanceof r ? Y1.e((r) interfaceC2574sB) : new HashMap<>());
        return InterfaceC2574s.f34292p;
    }
}
