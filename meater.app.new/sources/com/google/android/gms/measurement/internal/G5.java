package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class G5 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2880y5 f34862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G5(C2880y5 c2880y5, InterfaceC2809o3 interfaceC2809o3) {
        super(interfaceC2809o3);
        this.f34862e = c2880y5;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        this.f34862e.M0();
        String str = (String) this.f34862e.f35757q.pollFirst();
        if (str != null) {
            C2880y5 c2880y5 = this.f34862e;
            c2880y5.f35739I = c2880y5.b().c();
            this.f34862e.k().L().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            this.f34862e.a().sendBroadcast(intent);
        }
        this.f34862e.a0();
    }
}
