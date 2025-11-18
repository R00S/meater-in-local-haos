package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzmf implements zzmg {

    /* renamed from: a */
    private static final zzcl<Boolean> f28357a;

    /* renamed from: b */
    private static final zzcl<Boolean> f28358b;

    /* renamed from: c */
    private static final zzcl<Boolean> f28359c;

    /* renamed from: d */
    private static final zzcl<Boolean> f28360d;

    /* renamed from: e */
    private static final zzcl<Boolean> f28361e;

    /* renamed from: f */
    private static final zzcl<Boolean> f28362f;

    /* renamed from: g */
    private static final zzcl<Long> f28363g;

    /* renamed from: h */
    private static final zzcl<Boolean> f28364h;

    /* renamed from: i */
    private static final zzcl<Boolean> f28365i;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28357a = zzcrVar.m22122d("measurement.service.audience.scoped_filters_v27", false);
        f28358b = zzcrVar.m22122d("measurement.service.audience.session_scoped_user_engagement", false);
        f28359c = zzcrVar.m22122d("measurement.client.audience.scoped_engagement_removal_when_session_expired", true);
        f28360d = zzcrVar.m22122d("measurement.service.audience.scoped_engagement_removal_when_session_expired", true);
        f28361e = zzcrVar.m22122d("measurement.service.audience.session_scoped_event_aggregates", false);
        f28362f = zzcrVar.m22122d("measurement.service.audience.use_bundle_timestamp_for_property_filters", false);
        f28363g = zzcrVar.m22120b("measurement.id.scoped_audience_filters", 0L);
        f28364h = zzcrVar.m22122d("measurement.service.audience.not_prepend_timestamps_for_sequence_session_scoped_filters", false);
        f28365i = zzcrVar.m22122d("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: a */
    public final boolean mo22528a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: b */
    public final boolean mo22529b() {
        return f28357a.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: c */
    public final boolean mo22530c() {
        return f28358b.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: d */
    public final boolean mo22531d() {
        return f28359c.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: e */
    public final boolean mo22532e() {
        return f28360d.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: l */
    public final boolean mo22533l() {
        return f28365i.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: m */
    public final boolean mo22534m() {
        return f28364h.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: q */
    public final boolean mo22535q() {
        return f28361e.m22117n().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    /* renamed from: s */
    public final boolean mo22536s() {
        return f28362f.m22117n().booleanValue();
    }
}
