package com.google.android.gms.internal.measurement;

import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.notification.PullingContentService;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzjk implements zzjh {

    /* renamed from: A */
    private static final zzcl<Long> f28229A;

    /* renamed from: B */
    private static final zzcl<Long> f28230B;

    /* renamed from: C */
    private static final zzcl<Long> f28231C;

    /* renamed from: D */
    private static final zzcl<Long> f28232D;

    /* renamed from: E */
    private static final zzcl<Long> f28233E;

    /* renamed from: F */
    private static final zzcl<Long> f28234F;

    /* renamed from: G */
    private static final zzcl<Long> f28235G;

    /* renamed from: H */
    private static final zzcl<Long> f28236H;

    /* renamed from: I */
    private static final zzcl<String> f28237I;

    /* renamed from: J */
    private static final zzcl<Long> f28238J;

    /* renamed from: a */
    private static final zzcl<Long> f28239a;

    /* renamed from: b */
    private static final zzcl<Long> f28240b;

    /* renamed from: c */
    private static final zzcl<String> f28241c;

    /* renamed from: d */
    private static final zzcl<String> f28242d;

    /* renamed from: e */
    private static final zzcl<String> f28243e;

    /* renamed from: f */
    private static final zzcl<Long> f28244f;

    /* renamed from: g */
    private static final zzcl<Long> f28245g;

    /* renamed from: h */
    private static final zzcl<Long> f28246h;

    /* renamed from: i */
    private static final zzcl<Long> f28247i;

    /* renamed from: j */
    private static final zzcl<Long> f28248j;

    /* renamed from: k */
    private static final zzcl<Long> f28249k;

    /* renamed from: l */
    private static final zzcl<Long> f28250l;

    /* renamed from: m */
    private static final zzcl<Long> f28251m;

    /* renamed from: n */
    private static final zzcl<Long> f28252n;

    /* renamed from: o */
    private static final zzcl<Long> f28253o;

    /* renamed from: p */
    private static final zzcl<Long> f28254p;

    /* renamed from: q */
    private static final zzcl<Long> f28255q;

    /* renamed from: r */
    private static final zzcl<String> f28256r;

    /* renamed from: s */
    private static final zzcl<Long> f28257s;

    /* renamed from: t */
    private static final zzcl<Long> f28258t;

    /* renamed from: u */
    private static final zzcl<Long> f28259u;

    /* renamed from: v */
    private static final zzcl<Long> f28260v;

    /* renamed from: w */
    private static final zzcl<Long> f28261w;

    /* renamed from: x */
    private static final zzcl<Long> f28262x;

    /* renamed from: y */
    private static final zzcl<Long> f28263y;

    /* renamed from: z */
    private static final zzcl<Long> f28264z;

    static {
        zzcr zzcrVar = new zzcr(zzcm.m22118a("com.google.android.gms.measurement"));
        f28239a = zzcrVar.m22120b("measurement.ad_id_cache_time", 10000L);
        f28240b = zzcrVar.m22120b("measurement.config.cache_time", PullingContentService.UPDATES_INTERVAL);
        f28241c = zzcrVar.m22121c("measurement.log_tag", "FA");
        f28242d = zzcrVar.m22121c("measurement.config.url_authority", "app-measurement.com");
        f28243e = zzcrVar.m22121c("measurement.config.url_scheme", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        f28244f = zzcrVar.m22120b("measurement.upload.debug_upload_interval", 1000L);
        f28245g = zzcrVar.m22120b("measurement.lifetimevalue.max_currency_tracked", 4L);
        f28246h = zzcrVar.m22120b("measurement.store.max_stored_events_per_app", 100000L);
        f28247i = zzcrVar.m22120b("measurement.experiment.max_ids", 50L);
        f28248j = zzcrVar.m22120b("measurement.audience.filter_result_max_count", 200L);
        f28249k = zzcrVar.m22120b("measurement.alarm_manager.minimum_interval", 60000L);
        f28250l = zzcrVar.m22120b("measurement.upload.minimum_delay", 500L);
        f28251m = zzcrVar.m22120b("measurement.monitoring.sample_period_millis", PullingContentService.UPDATES_INTERVAL);
        f28252n = zzcrVar.m22120b("measurement.upload.realtime_upload_interval", 10000L);
        f28253o = zzcrVar.m22120b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f28254p = zzcrVar.m22120b("measurement.config.cache_time.service", 3600000L);
        f28255q = zzcrVar.m22120b("measurement.service_client.idle_disconnect_millis", 5000L);
        f28256r = zzcrVar.m22121c("measurement.log_tag.service", "FA-SVC");
        f28257s = zzcrVar.m22120b("measurement.upload.stale_data_deletion_interval", PullingContentService.UPDATES_INTERVAL);
        f28258t = zzcrVar.m22120b("measurement.upload.backoff_period", 43200000L);
        f28259u = zzcrVar.m22120b("measurement.upload.initial_upload_delay_time", 15000L);
        f28260v = zzcrVar.m22120b("measurement.upload.interval", 3600000L);
        f28261w = zzcrVar.m22120b("measurement.upload.max_bundle_size", 65536L);
        f28262x = zzcrVar.m22120b("measurement.upload.max_bundles", 100L);
        f28263y = zzcrVar.m22120b("measurement.upload.max_conversions_per_day", 500L);
        f28264z = zzcrVar.m22120b("measurement.upload.max_error_events_per_day", 1000L);
        f28229A = zzcrVar.m22120b("measurement.upload.max_events_per_bundle", 1000L);
        f28230B = zzcrVar.m22120b("measurement.upload.max_events_per_day", 100000L);
        f28231C = zzcrVar.m22120b("measurement.upload.max_public_events_per_day", 50000L);
        f28232D = zzcrVar.m22120b("measurement.upload.max_queue_time", 2419200000L);
        f28233E = zzcrVar.m22120b("measurement.upload.max_realtime_events_per_day", 10L);
        f28234F = zzcrVar.m22120b("measurement.upload.max_batch_size", 65536L);
        f28235G = zzcrVar.m22120b("measurement.upload.retry_count", 6L);
        f28236H = zzcrVar.m22120b("measurement.upload.retry_time", cm.aptoide.p092pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
        f28237I = zzcrVar.m22121c("measurement.upload.url", "https://app-measurement.com/a");
        f28238J = zzcrVar.m22120b("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: A */
    public final long mo22353A() {
        return f28229A.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: A0 */
    public final long mo22354A0() {
        return f28260v.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: B */
    public final String mo22355B() {
        return f28237I.m22117n();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: C */
    public final long mo22356C() {
        return f28230B.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: G */
    public final long mo22357G() {
        return f28259u.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: O */
    public final long mo22358O() {
        return f28249k.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: U */
    public final long mo22359U() {
        return f28263y.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: X */
    public final long mo22360X() {
        return f28264z.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: a */
    public final long mo22361a() {
        return f28239a.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: b */
    public final long mo22362b() {
        return f28240b.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: c */
    public final String mo22363c() {
        return f28241c.m22117n();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: d */
    public final String mo22364d() {
        return f28242d.m22117n();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: e */
    public final String mo22365e() {
        return f28243e.m22117n();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: f */
    public final long mo22366f() {
        return f28252n.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: f0 */
    public final long mo22367f0() {
        return f28261w.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: g */
    public final long mo22368g() {
        return f28255q.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: h */
    public final String mo22369h() {
        return f28256r.m22117n();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: i */
    public final long mo22370i() {
        return f28231C.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: j */
    public final long mo22371j() {
        return f28251m.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: k */
    public final long mo22372k() {
        return f28254p.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: l */
    public final long mo22373l() {
        return f28247i.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: l0 */
    public final long mo22374l0() {
        return f28262x.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: m */
    public final long mo22375m() {
        return f28246h.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: n */
    public final long mo22376n() {
        return f28235G.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: o */
    public final long mo22377o() {
        return f28236H.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: p */
    public final long mo22378p() {
        return f28253o.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: q */
    public final long mo22379q() {
        return f28244f.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: r */
    public final long mo22380r() {
        return f28233E.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: s */
    public final long mo22381s() {
        return f28245g.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: t */
    public final long mo22382t() {
        return f28234F.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: u */
    public final long mo22383u() {
        return f28232D.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: v */
    public final long mo22384v() {
        return f28248j.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: w */
    public final long mo22385w() {
        return f28250l.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: x */
    public final long mo22386x() {
        return f28257s.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: y */
    public final long mo22387y() {
        return f28258t.m22117n().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjh
    /* renamed from: z */
    public final long mo22388z() {
        return f28238J.m22117n().longValue();
    }
}
