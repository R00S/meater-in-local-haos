package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class D7 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private final X4 f33706D;

    /* renamed from: E, reason: collision with root package name */
    private final Map<String, AbstractC2535n> f33707E;

    public D7(X4 x42) {
        super("require");
        this.f33707E = new HashMap();
        this.f33706D = x42;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Y1.g("require", 1, list);
        String strI = z22.b(list.get(0)).i();
        if (this.f33707E.containsKey(strI)) {
            return this.f33707E.get(strI);
        }
        InterfaceC2574s interfaceC2574sA = this.f33706D.a(strI);
        if (interfaceC2574sA instanceof AbstractC2535n) {
            this.f33707E.put(strI, (AbstractC2535n) interfaceC2574sA);
        }
        return interfaceC2574sA;
    }
}
