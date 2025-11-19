package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class B3 extends A {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f34755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B3(C2843t3 c2843t3, InterfaceC2809o3 interfaceC2809o3) {
        super(interfaceC2809o3);
        this.f34755e = c2843t3;
    }

    @Override // com.google.android.gms.measurement.internal.A
    public final void d() {
        final C2843t3 c2843t3S = this.f34755e.s();
        Objects.requireNonNull(c2843t3S);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.A3
            @Override // java.lang.Runnable
            public final void run() {
                c2843t3S.K0();
            }
        }).start();
    }
}
