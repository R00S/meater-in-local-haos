package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class G6 implements D6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33763a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f33764b;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f3E.d("measurement.collection.event_safelist", true);
        f33763a = f3E.d("measurement.service.store_null_safelist", true);
        f33764b = f3E.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean b() {
        return f33763a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean d() {
        return f33764b.e().booleanValue();
    }
}
