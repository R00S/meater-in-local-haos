package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class m7 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34209a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34210b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34211c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34212d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34213e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34214f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34215g;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f34209a = f3E.d("measurement.sgtm.client.scion_upload_action.dev", false);
        f34210b = f3E.d("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        f34211c = f3E.d("measurement.sgtm.google_signal.enable", false);
        f34212d = f3E.d("measurement.sgtm.no_proxy.client.dev", false);
        f34213e = f3E.d("measurement.sgtm.no_proxy.service", false);
        f3E.d("measurement.sgtm.preview_mode_enabled", true);
        f3E.d("measurement.sgtm.rollout_percentage_fix", true);
        f3E.d("measurement.sgtm.service", true);
        f34214f = f3E.d("measurement.sgtm.service.batching_on_backgrounded", false);
        f34215g = f3E.d("measurement.sgtm.upload_queue", false);
        f3E.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean a() {
        return f34209a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean b() {
        return f34210b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean d() {
        return f34211c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean f() {
        return f34212d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean g() {
        return f34215g.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean h() {
        return f34213e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean i() {
        return f34214f.e().booleanValue();
    }
}
