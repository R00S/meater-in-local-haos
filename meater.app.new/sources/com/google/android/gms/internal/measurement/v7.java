package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class v7 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private final z7 f34411D;

    public v7(z7 z7Var) {
        super("internal.logger");
        this.f34411D = z7Var;
        this.f34217C.put("log", new y7(this, false, true));
        this.f34217C.put("silent", new u7(this, "silent"));
        ((AbstractC2535n) this.f34217C.get("silent")).w("log", new y7(this, true, true));
        this.f34217C.put("unmonitored", new x7(this, "unmonitored"));
        ((AbstractC2535n) this.f34217C.get("unmonitored")).w("log", new y7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        return InterfaceC2574s.f34292p;
    }
}
