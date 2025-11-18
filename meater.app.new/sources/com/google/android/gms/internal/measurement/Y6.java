package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class Y6 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2621x6 f33953D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y6(C2620x5 c2620x5, String str, InterfaceC2621x6 interfaceC2621x6) {
        super(str);
        this.f33953D = interfaceC2621x6;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Y1.g("getValue", 2, list);
        InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
        InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(1));
        String strC = this.f33953D.c(interfaceC2574sB.i());
        return strC != null ? new C2590u(strC) : interfaceC2574sB2;
    }
}
