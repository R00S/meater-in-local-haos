package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2597u6 implements InterfaceC2605v6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Long> f34400a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.client.consent_state_v1", true);
        f3E.d("measurement.client.3p_consent_state_v1", true);
        f3E.d("measurement.service.consent_state_v1_W36", true);
        f34400a = f3E.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2605v6
    public final long a() {
        return f34400a.e().longValue();
    }
}
