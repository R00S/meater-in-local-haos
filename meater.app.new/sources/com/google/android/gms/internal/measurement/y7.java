package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class y7 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private boolean f34455D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f34456E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ v7 f34457F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(v7 v7Var, boolean z10, boolean z11) {
        super("log");
        this.f34457F = v7Var;
        this.f34455D = z10;
        this.f34456E = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Y1.k("log", 1, list);
        if (list.size() == 1) {
            this.f34457F.f34411D.a(w7.INFO, z22.b(list.get(0)).i(), Collections.emptyList(), this.f34455D, this.f34456E);
            return InterfaceC2574s.f34292p;
        }
        w7 w7VarC = w7.c(Y1.i(z22.b(list.get(0)).h().doubleValue()));
        String strI = z22.b(list.get(1)).i();
        if (list.size() == 2) {
            this.f34457F.f34411D.a(w7VarC, strI, Collections.emptyList(), this.f34455D, this.f34456E);
            return InterfaceC2574s.f34292p;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
            arrayList.add(z22.b(list.get(i10)).i());
        }
        this.f34457F.f34411D.a(w7VarC, strI, arrayList, this.f34455D, this.f34456E);
        return InterfaceC2574s.f34292p;
    }
}
