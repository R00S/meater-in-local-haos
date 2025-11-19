package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class Z6 implements V6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34032a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34033b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34034c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34035d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34036e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34037f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34038g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34039h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34040i;

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC2610w3<Boolean> f34041j;

    static {
        F3 f3E = new F3(C2586t3.a("com.google.android.gms.measurement")).f().e();
        f34032a = f3E.d("measurement.rb.attribution.ad_campaign_info", true);
        f3E.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        f3E.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f34033b = f3E.d("measurement.rb.attribution.client2", true);
        f3E.d("measurement.rb.attribution.dma_fix", true);
        f34034c = f3E.d("measurement.rb.attribution.followup1.service", false);
        f34035d = f3E.d("measurement.rb.attribution.client.get_trigger_uris_async", false);
        f34036e = f3E.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        f3E.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f34037f = f3E.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f34038g = f3E.d("measurement.rb.attribution.retry_disposition", false);
        f34039h = f3E.d("measurement.rb.attribution.service", true);
        f34040i = f3E.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f34041j = f3E.d("measurement.rb.attribution.uuid_generation", true);
        f3E.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f3E.b("measurement.id.rb.attribution.client.get_trigger_uris_async", 0L);
        f3E.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean b() {
        return f34032a.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean d() {
        return f34033b.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean e() {
        return f34039h.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean f() {
        return f34034c.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean g() {
        return f34037f.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean h() {
        return f34035d.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean i() {
        return f34036e.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean j() {
        return f34038g.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean k() {
        return f34040i.e().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean p() {
        return f34041j.e().booleanValue();
    }
}
