package com.google.android.gms.measurement.internal;

import android.content.Context;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.notification.PullingContentService;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzap {

    /* renamed from: A */
    public static zzem<Long> f29081A;

    /* renamed from: A0 */
    public static zzem<Boolean> f29082A0;

    /* renamed from: B */
    public static zzem<Long> f29083B;

    /* renamed from: B0 */
    public static zzem<Boolean> f29084B0;

    /* renamed from: C */
    public static zzem<Long> f29085C;

    /* renamed from: C0 */
    public static zzem<Boolean> f29086C0;

    /* renamed from: D */
    public static zzem<Long> f29087D;

    /* renamed from: D0 */
    public static zzem<Boolean> f29088D0;

    /* renamed from: E */
    public static zzem<Long> f29089E;

    /* renamed from: E0 */
    private static zzem<Boolean> f29090E0;

    /* renamed from: F */
    public static zzem<Long> f29091F;

    /* renamed from: F0 */
    public static zzem<Boolean> f29092F0;

    /* renamed from: G */
    public static zzem<Long> f29093G;

    /* renamed from: G0 */
    public static zzem<Boolean> f29094G0;

    /* renamed from: H */
    public static zzem<Long> f29095H;

    /* renamed from: H0 */
    public static zzem<Boolean> f29096H0;

    /* renamed from: I */
    public static zzem<Long> f29097I;

    /* renamed from: I0 */
    public static zzem<Boolean> f29098I0;

    /* renamed from: J */
    public static zzem<Integer> f29099J;

    /* renamed from: J0 */
    public static zzem<Boolean> f29100J0;

    /* renamed from: K */
    public static zzem<Long> f29101K;

    /* renamed from: K0 */
    public static zzem<Boolean> f29102K0;

    /* renamed from: L */
    public static zzem<Integer> f29103L;

    /* renamed from: L0 */
    public static zzem<Boolean> f29104L0;

    /* renamed from: M */
    public static zzem<Integer> f29105M;

    /* renamed from: M0 */
    public static zzem<Boolean> f29106M0;

    /* renamed from: N */
    public static zzem<Long> f29107N;

    /* renamed from: N0 */
    public static zzem<Boolean> f29108N0;

    /* renamed from: O */
    public static zzem<Boolean> f29109O;

    /* renamed from: O0 */
    public static zzem<Boolean> f29110O0;

    /* renamed from: P */
    public static zzem<String> f29111P;

    /* renamed from: P0 */
    public static zzem<Boolean> f29112P0;

    /* renamed from: Q */
    public static zzem<Long> f29113Q;

    /* renamed from: Q0 */
    public static zzem<Boolean> f29114Q0;

    /* renamed from: R */
    public static zzem<Integer> f29115R;

    /* renamed from: R0 */
    public static zzem<Boolean> f29116R0;

    /* renamed from: S */
    public static zzem<Double> f29117S;

    /* renamed from: S0 */
    public static zzem<Boolean> f29118S0;

    /* renamed from: T */
    public static zzem<Integer> f29119T;

    /* renamed from: T0 */
    public static zzem<Boolean> f29120T0;

    /* renamed from: U */
    public static zzem<Boolean> f29121U;

    /* renamed from: U0 */
    public static zzem<Boolean> f29122U0;

    /* renamed from: V */
    public static zzem<Boolean> f29123V;

    /* renamed from: V0 */
    public static zzem<Boolean> f29124V0;

    /* renamed from: W */
    public static zzem<Boolean> f29125W;

    /* renamed from: W0 */
    private static zzem<Boolean> f29126W0;

    /* renamed from: X */
    public static zzem<Boolean> f29127X;

    /* renamed from: X0 */
    public static zzem<Boolean> f29128X0;

    /* renamed from: Y */
    public static zzem<Boolean> f29129Y;

    /* renamed from: Z */
    public static zzem<Boolean> f29130Z;

    /* renamed from: a */
    static zzw f29131a;

    /* renamed from: a0 */
    public static zzem<Boolean> f29132a0;

    /* renamed from: b0 */
    public static zzem<Boolean> f29134b0;

    /* renamed from: c0 */
    public static zzem<Boolean> f29136c0;

    /* renamed from: d */
    private static volatile zzfx f29137d;

    /* renamed from: d0 */
    public static zzem<Boolean> f29138d0;

    /* renamed from: e */
    @VisibleForTesting
    private static Boolean f29139e;

    /* renamed from: e0 */
    public static zzem<Boolean> f29140e0;

    /* renamed from: f */
    public static zzem<Boolean> f29141f;

    /* renamed from: f0 */
    public static zzem<Boolean> f29142f0;

    /* renamed from: g */
    public static zzem<Boolean> f29143g;

    /* renamed from: g0 */
    public static zzem<Boolean> f29144g0;

    /* renamed from: h */
    public static zzem<String> f29145h;

    /* renamed from: h0 */
    public static zzem<Boolean> f29146h0;

    /* renamed from: i */
    public static zzem<Long> f29147i;

    /* renamed from: i0 */
    public static zzem<Boolean> f29148i0;

    /* renamed from: j */
    public static zzem<Long> f29149j;

    /* renamed from: j0 */
    public static zzem<Boolean> f29150j0;

    /* renamed from: k */
    public static zzem<Long> f29151k;

    /* renamed from: k0 */
    public static zzem<Boolean> f29152k0;

    /* renamed from: l */
    public static zzem<String> f29153l;

    /* renamed from: l0 */
    public static zzem<Boolean> f29154l0;

    /* renamed from: m */
    public static zzem<String> f29155m;

    /* renamed from: m0 */
    public static zzem<Boolean> f29156m0;

    /* renamed from: n */
    public static zzem<Integer> f29157n;

    /* renamed from: n0 */
    public static zzem<Boolean> f29158n0;

    /* renamed from: o */
    public static zzem<Integer> f29159o;

    /* renamed from: o0 */
    public static zzem<Boolean> f29160o0;

    /* renamed from: p */
    public static zzem<Integer> f29161p;

    /* renamed from: p0 */
    public static zzem<Boolean> f29162p0;

    /* renamed from: q */
    public static zzem<Integer> f29163q;

    /* renamed from: q0 */
    public static zzem<Boolean> f29164q0;

    /* renamed from: r */
    public static zzem<Integer> f29165r;

    /* renamed from: r0 */
    public static zzem<Boolean> f29166r0;

    /* renamed from: s */
    public static zzem<Integer> f29167s;

    /* renamed from: s0 */
    public static zzem<Boolean> f29168s0;

    /* renamed from: t */
    public static zzem<Integer> f29169t;

    /* renamed from: t0 */
    public static zzem<Boolean> f29170t0;

    /* renamed from: u */
    public static zzem<Integer> f29171u;

    /* renamed from: u0 */
    public static zzem<Boolean> f29172u0;

    /* renamed from: v */
    public static zzem<Integer> f29173v;

    /* renamed from: v0 */
    public static zzem<Boolean> f29174v0;

    /* renamed from: w */
    public static zzem<Integer> f29175w;

    /* renamed from: w0 */
    public static zzem<Boolean> f29176w0;

    /* renamed from: x */
    public static zzem<String> f29177x;

    /* renamed from: x0 */
    public static zzem<Boolean> f29178x0;

    /* renamed from: y */
    public static zzem<Long> f29179y;

    /* renamed from: y0 */
    public static zzem<Boolean> f29180y0;

    /* renamed from: z */
    public static zzem<Long> f29181z;

    /* renamed from: z0 */
    public static zzem<Boolean> f29182z0;

    /* renamed from: b */
    private static List<zzem<?>> f29133b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    private static Set<zzem<?>> f29135c = Collections.synchronizedSet(new HashSet());

    static {
        Boolean bool = Boolean.FALSE;
        f29141f = m23016a("measurement.log_androidId_enabled", bool, bool, C7740k.f28729a);
        f29143g = m23016a("measurement.upload_dsid_enabled", bool, bool, C7731j.f28713a);
        f29145h = m23016a("measurement.log_tag", "FA", "FA-SVC", C7848w.f28966a);
        f29147i = m23016a("measurement.ad_id_cache_time", 10000L, 10000L, C7696f0.f28625a);
        Long lValueOf = Long.valueOf(PullingContentService.UPDATES_INTERVAL);
        f29149j = m23016a("measurement.monitoring.sample_period_millis", lValueOf, lValueOf, C7822t0.f28905a);
        f29151k = m23016a("measurement.config.cache_time", lValueOf, 3600000L, C7670c1.f28580a);
        f29153l = m23016a("measurement.config.url_scheme", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, C7787p1.f28816a);
        f29155m = m23016a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C7876z1.f29018a);
        f29157n = m23016a("measurement.upload.max_bundles", 100, 100, C7761m2.f28764a);
        f29159o = m23016a("measurement.upload.max_batch_size", 65536, 65536, C7851w2.f28969a);
        f29161p = m23016a("measurement.upload.max_bundle_size", 65536, 65536, C7758m.f28761a);
        f29163q = m23016a("measurement.upload.max_events_per_bundle", 1000, 1000, C7749l.f28744a);
        f29165r = m23016a("measurement.upload.max_events_per_day", 100000, 100000, C7776o.f28802a);
        f29167s = m23016a("measurement.upload.max_error_events_per_day", 1000, 1000, C7767n.f28782a);
        f29169t = m23016a("measurement.upload.max_public_events_per_day", 50000, 50000, C7794q.f28832a);
        f29171u = m23016a("measurement.upload.max_conversions_per_day", 500, 500, C7785p.f28814a);
        f29173v = m23016a("measurement.upload.max_realtime_events_per_day", 10, 10, C7812s.f28892a);
        f29175w = m23016a("measurement.store.max_stored_events_per_app", 100000, 100000, C7803r.f28843a);
        f29177x = m23016a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C7830u.f28927a);
        f29179y = m23016a("measurement.upload.backoff_period", 43200000L, 43200000L, C7821t.f28904a);
        f29181z = m23016a("measurement.upload.window_interval", 3600000L, 3600000L, C7839v.f28944a);
        f29081A = m23016a("measurement.upload.interval", 3600000L, 3600000L, C7866y.f29002a);
        f29083B = m23016a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C7857x.f28985a);
        f29085C = m23016a("measurement.upload.debug_upload_interval", 1000L, 1000L, C7651a0.f28540a);
        f29087D = m23016a("measurement.upload.minimum_delay", 500L, 500L, C7874z.f29016a);
        f29089E = m23016a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C7669c0.f28579a);
        f29091F = m23016a("measurement.upload.stale_data_deletion_interval", lValueOf, lValueOf, C7660b0.f28553a);
        f29093G = m23016a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C7687e0.f28609a);
        f29095H = m23016a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C7678d0.f28594a);
        Long lValueOf2 = Long.valueOf(cm.aptoide.p092pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS);
        f29097I = m23016a("measurement.upload.retry_time", lValueOf2, lValueOf2, C7705g0.f28643a);
        f29099J = m23016a("measurement.upload.retry_count", 6, 6, C7723i0.f28696a);
        f29101K = m23016a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C7714h0.f28673a);
        f29103L = m23016a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C7741k0.f28730a);
        f29105M = m23016a("measurement.audience.filter_result_max_count", 200, 200, C7732j0.f28714a);
        f29107N = m23016a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C7759m0.f28762a);
        f29109O = m23016a("measurement.test.boolean_flag", bool, bool, C7750l0.f28745a);
        f29111P = m23016a("measurement.test.string_flag", "---", "---", C7777o0.f28803a);
        f29113Q = m23016a("measurement.test.long_flag", -1L, -1L, C7768n0.f28783a);
        f29115R = m23016a("measurement.test.int_flag", -2, -2, C7795q0.f28833a);
        Double dValueOf = Double.valueOf(-3.0d);
        f29117S = m23016a("measurement.test.double_flag", dValueOf, dValueOf, C7786p0.f28815a);
        f29119T = m23016a("measurement.experiment.max_ids", 50, 50, C7804r0.f28844a);
        f29121U = m23016a("measurement.validation.internal_limits_internal_event_params", bool, bool, C7840v0.f28945a);
        Boolean bool2 = Boolean.TRUE;
        f29123V = m23016a("measurement.reset_analytics.persist_time", bool2, bool2, C7831u0.f28928a);
        f29125W = m23016a("measurement.sampling.time_zone_offset_enabled", bool, bool, C7858x0.f28986a);
        f29127X = m23016a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool, bool, C7849w0.f28967a);
        f29129Y = m23016a("measurement.client.sessions.session_id_enabled", bool2, bool2, C7875z0.f29017a);
        f29130Z = m23016a("measurement.service.sessions.session_number_enabled", bool2, bool2, C7867y0.f29003a);
        f29132a0 = m23016a("measurement.client.sessions.immediate_start_enabled_foreground", bool2, bool2, C7661b1.f28554a);
        f29134b0 = m23016a("measurement.client.sessions.background_sessions_enabled", bool2, bool2, C7652a1.f28541a);
        f29136c0 = m23016a("measurement.client.sessions.remove_expired_session_properties_enabled", bool2, bool2, C7679d1.f28595a);
        f29138d0 = m23016a("measurement.service.sessions.session_number_backfill_enabled", bool2, bool2, C7697f1.f28626a);
        f29140e0 = m23016a("measurement.service.sessions.remove_disabled_session_number", bool2, bool2, C7688e1.f28610a);
        f29142f0 = m23016a("measurement.client.sessions.start_session_before_view_screen", bool2, bool2, C7715h1.f28674a);
        f29144g0 = m23016a("measurement.client.sessions.check_on_startup", bool2, bool2, C7706g1.f28644a);
        f29146h0 = m23016a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C7733j1.f28715a);
        Boolean bool3 = Boolean.FALSE;
        f29148i0 = m23016a("measurement.collection.efficient_engagement_reporting_enabled", bool3, bool3, C7724i1.f28697a);
        f29150j0 = m23016a("measurement.collection.redundant_engagement_removal_enabled", bool3, bool3, C7751l1.f28746a);
        f29152k0 = m23016a("measurement.personalized_ads_signals_collection_enabled", bool2, bool2, C7742k1.f28731a);
        f29154l0 = m23016a("measurement.personalized_ads_property_translation_enabled", bool2, bool2, C7769n1.f28784a);
        f29156m0 = m23016a("measurement.collection.init_params_control_enabled", bool2, bool2, C7760m1.f28763a);
        f29158n0 = m23016a("measurement.upload.disable_is_uploader", bool2, bool2, C7778o1.f28804a);
        f29160o0 = m23016a("measurement.experiment.enable_experiment_reporting", bool2, bool2, C7805r1.f28845a);
        f29162p0 = m23016a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C7796q1.f28834a);
        f29164q0 = m23016a("measurement.quality.checksum", bool3, bool3, null);
        f29166r0 = m23016a("measurement.module.collection.conditionally_omit_admob_app_id", bool2, bool2, C7832u1.f28929a);
        f29168s0 = m23016a("measurement.sdk.dynamite.use_dynamite2", bool3, bool3, C7814s1.f28895a);
        f29170t0 = m23016a("measurement.sdk.dynamite.allow_remote_dynamite", bool3, bool3, C7850w1.f28968a);
        f29172u0 = m23016a("measurement.sdk.collection.validate_param_names_alphabetical", bool3, bool3, C7841v1.f28946a);
        f29174v0 = m23016a("measurement.collection.event_safelist", bool2, bool2, C7868y1.f29004a);
        f29176w0 = m23016a("measurement.service.audience.scoped_filters_v27", bool3, bool3, C7859x1.f28987a);
        f29178x0 = m23016a("measurement.service.audience.session_scoped_event_aggregates", bool3, bool3, C7653a2.f28542a);
        f29180y0 = m23016a("measurement.service.audience.session_scoped_user_engagement", bool3, bool3, C7671c2.f28581a);
        f29182z0 = m23016a("measurement.service.audience.scoped_engagement_removal_when_session_expired", bool2, bool2, C7662b2.f28555a);
        f29082A0 = m23016a("measurement.client.audience.scoped_engagement_removal_when_session_expired", bool2, bool2, C7689e2.f28611a);
        f29084B0 = m23016a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", bool3, bool3, C7680d2.f28596a);
        f29086C0 = m23016a("measurement.service.audience.use_bundle_timestamp_for_property_filters", bool3, bool3, C7707g2.f28645a);
        f29088D0 = m23016a("measurement.service.audience.not_prepend_timestamps_for_sequence_session_scoped_filters", bool3, bool3, C7698f2.f28627a);
        f29090E0 = m23016a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", bool3, bool3, C7725i2.f28698a);
        f29092F0 = m23016a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C7716h2.f28675a);
        f29094G0 = m23016a("measurement.app_launch.event_ordering_fix", bool3, bool3, C7743k2.f28732a);
        f29096H0 = m23016a("measurement.sdk.collection.last_deep_link_referrer", bool3, bool3, C7734j2.f28716a);
        f29098I0 = m23016a("measurement.sdk.collection.last_deep_link_referrer_campaign", bool3, bool3, C7752l2.f28747a);
        f29100J0 = m23016a("measurement.sdk.collection.last_gclid_from_referrer", bool3, bool3, C7779o2.f28805a);
        f29102K0 = m23016a("measurement.sdk.collection.worker_thread_referrer", bool2, bool2, C7770n2.f28785a);
        f29104L0 = m23016a("measurement.upload.file_lock_state_check", bool3, bool3, C7797q2.f28835a);
        f29106M0 = m23016a("measurement.sampling.calculate_bundle_timestamp_before_sampling", bool2, bool2, C7788p2.f28817a);
        f29108N0 = m23016a("measurement.ga.ga_app_id", bool3, Boolean.valueOf(zzky.m22475b()), C7815s2.f28896a);
        f29110O0 = m23016a("measurement.lifecycle.app_backgrounded_tracking", bool3, bool3, C7806r2.f28846a);
        f29112P0 = m23016a("measurement.lifecycle.app_in_background_parameter", bool3, bool3, C7842v2.f28947a);
        f29114Q0 = m23016a("measurement.integration.disable_firebase_instance_id", bool3, bool3, C7824t2.f28909a);
        f29116R0 = m23016a("measurement.lifecycle.app_backgrounded_engagement", bool3, bool3, C7860x2.f28988a);
        f29118S0 = m23016a("measurement.service.fix_gmp_version", bool3, bool3, C7877z2.f29019a);
        f29120T0 = m23016a("measurement.collection.service.update_with_analytics_fix", bool3, bool3, C7869y2.f29005a);
        f29122U0 = m23016a("measurement.service.disable_install_state_reporting", bool3, bool3, C7663b3.f28556a);
        f29124V0 = m23016a("measurement.service.use_appinfo_modified", bool3, bool3, C7654a3.f28543a);
        Boolean bool4 = Boolean.TRUE;
        f29126W0 = m23016a("measurement.upload.dsid_reflection_failure_logging", bool4, bool4, C7681d3.f28597a);
        f29128X0 = m23016a("measurement.client.firebase_feature_rollout.v1.enable", bool4, bool4, C7672c3.f28582a);
    }

    /* renamed from: B0 */
    private static boolean m22968B0() {
        if (f29131a != null) {
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static <V> zzem<V> m23016a(String str, V v, V v2, InterfaceC7690e3<V> interfaceC7690e3) {
        zzem<V> zzemVar = new zzem<>(str, v, v2, interfaceC7690e3);
        f29133b.add(zzemVar);
        return zzemVar;
    }

    /* renamed from: c */
    public static Map<String, String> m23020c(Context context) {
        zzbx zzbxVarM22089a = zzbx.m22089a(context.getContentResolver(), zzcm.m22118a("com.google.android.gms.measurement"));
        return zzbxVarM22089a == null ? Collections.emptyMap() : zzbxVarM22089a.m22092b();
    }

    /* renamed from: d */
    static void m23022d(zzfx zzfxVar) {
        f29137d = zzfxVar;
    }

    /* renamed from: e */
    static void m23024e(zzw zzwVar) {
        f29131a = zzwVar;
    }

    @VisibleForTesting
    /* renamed from: f */
    static void m23026f(Exception exc) {
        if (f29137d == null) {
            return;
        }
        Context contextMo22834f = f29137d.mo22834f();
        if (f29139e == null) {
            f29139e = Boolean.valueOf(GoogleApiAvailabilityLight.m13823h().mo13813j(contextMo22834f, 12451000) == 0);
        }
        if (f29139e.booleanValue()) {
            f29137d.mo22836h().m23137H().m23148b("Got Exception on PhenotypeFlag.get on Play device", exc);
        }
    }

    /* renamed from: x0 */
    static final /* synthetic */ String m23063x0() {
        return m22968B0() ? com.google.android.gms.internal.measurement.zzji.m22392D() : com.google.android.gms.internal.measurement.zzji.m22413o();
    }
}
