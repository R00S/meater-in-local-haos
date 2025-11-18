package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2542n6 implements InterfaceC2518k6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34221a;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f34221a = f3E.d("measurement.service.ad_impression.convert_value_to_double", true);
        f3E.d("measurement.client.ad_impression", true);
        f3E.d("measurement.service.separate_public_internal_event_blacklisting", true);
        f3E.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2518k6
    public final boolean a() {
        return f34221a.e().booleanValue();
    }
}
