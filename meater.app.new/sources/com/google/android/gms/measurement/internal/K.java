package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.android.gms.internal.measurement.AbstractC2610w3;
import com.google.android.gms.internal.measurement.C2462d7;
import com.google.android.gms.internal.measurement.C2491h3;
import com.google.android.gms.internal.measurement.C2526l6;
import com.google.android.gms.internal.measurement.C2534m6;
import com.google.android.gms.internal.measurement.C2573r6;
import com.google.android.gms.internal.measurement.C2581s6;
import com.google.android.gms.internal.measurement.C2586t3;
import com.google.android.gms.internal.measurement.C2629y6;
import com.google.android.gms.internal.measurement.C2637z6;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.F6;
import com.google.android.gms.internal.measurement.K6;
import com.google.android.gms.internal.measurement.L6;
import com.google.android.gms.internal.measurement.Q6;
import com.google.android.gms.internal.measurement.R6;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.X6;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.j7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class K {

    /* renamed from: A, reason: collision with root package name */
    public static final Y1<Long> f34907A;

    /* renamed from: A0, reason: collision with root package name */
    public static final Y1<Boolean> f34908A0;

    /* renamed from: B, reason: collision with root package name */
    public static final Y1<Long> f34909B;

    /* renamed from: B0, reason: collision with root package name */
    public static final Y1<Boolean> f34910B0;

    /* renamed from: C, reason: collision with root package name */
    public static final Y1<Long> f34911C;

    /* renamed from: C0, reason: collision with root package name */
    public static final Y1<Boolean> f34912C0;

    /* renamed from: D, reason: collision with root package name */
    public static final Y1<Long> f34913D;

    /* renamed from: D0, reason: collision with root package name */
    public static final Y1<Boolean> f34914D0;

    /* renamed from: E, reason: collision with root package name */
    public static final Y1<Long> f34915E;

    /* renamed from: E0, reason: collision with root package name */
    public static final Y1<Integer> f34916E0;

    /* renamed from: F, reason: collision with root package name */
    public static final Y1<Long> f34917F;

    /* renamed from: F0, reason: collision with root package name */
    public static final Y1<Boolean> f34918F0;

    /* renamed from: G, reason: collision with root package name */
    public static final Y1<Long> f34919G;

    /* renamed from: G0, reason: collision with root package name */
    public static final Y1<Boolean> f34920G0;

    /* renamed from: H, reason: collision with root package name */
    public static final Y1<Long> f34921H;

    /* renamed from: H0, reason: collision with root package name */
    public static final Y1<Boolean> f34922H0;

    /* renamed from: I, reason: collision with root package name */
    public static final Y1<Long> f34923I;

    /* renamed from: I0, reason: collision with root package name */
    public static final Y1<Boolean> f34924I0;

    /* renamed from: J, reason: collision with root package name */
    public static final Y1<Long> f34925J;

    /* renamed from: J0, reason: collision with root package name */
    public static final Y1<Boolean> f34926J0;

    /* renamed from: K, reason: collision with root package name */
    public static final Y1<Long> f34927K;

    /* renamed from: K0, reason: collision with root package name */
    public static final Y1<Boolean> f34928K0;

    /* renamed from: L, reason: collision with root package name */
    public static final Y1<Long> f34929L;

    /* renamed from: L0, reason: collision with root package name */
    public static final Y1<Boolean> f34930L0;

    /* renamed from: M, reason: collision with root package name */
    public static final Y1<Integer> f34931M;

    /* renamed from: M0, reason: collision with root package name */
    public static final Y1<Boolean> f34932M0;

    /* renamed from: N, reason: collision with root package name */
    public static final Y1<Long> f34933N;

    /* renamed from: N0, reason: collision with root package name */
    public static final Y1<Boolean> f34934N0;

    /* renamed from: O, reason: collision with root package name */
    public static final Y1<Long> f34935O;

    /* renamed from: O0, reason: collision with root package name */
    public static final Y1<Boolean> f34936O0;

    /* renamed from: P, reason: collision with root package name */
    public static final Y1<Integer> f34937P;

    /* renamed from: P0, reason: collision with root package name */
    public static final Y1<Boolean> f34938P0;

    /* renamed from: Q, reason: collision with root package name */
    public static final Y1<Integer> f34939Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final Y1<Boolean> f34940Q0;

    /* renamed from: R, reason: collision with root package name */
    public static final Y1<Integer> f34941R;

    /* renamed from: R0, reason: collision with root package name */
    public static final Y1<Boolean> f34942R0;

    /* renamed from: S, reason: collision with root package name */
    public static final Y1<Integer> f34943S;

    /* renamed from: S0, reason: collision with root package name */
    public static final Y1<Boolean> f34944S0;

    /* renamed from: T, reason: collision with root package name */
    public static final Y1<Integer> f34945T;

    /* renamed from: T0, reason: collision with root package name */
    public static final Y1<Boolean> f34946T0;

    /* renamed from: U, reason: collision with root package name */
    public static final Y1<Long> f34947U;

    /* renamed from: U0, reason: collision with root package name */
    public static final Y1<Boolean> f34948U0;

    /* renamed from: V, reason: collision with root package name */
    public static final Y1<Boolean> f34949V;

    /* renamed from: V0, reason: collision with root package name */
    public static final Y1<Boolean> f34950V0;

    /* renamed from: W, reason: collision with root package name */
    public static final Y1<String> f34951W;

    /* renamed from: W0, reason: collision with root package name */
    public static final Y1<Boolean> f34952W0;

    /* renamed from: X, reason: collision with root package name */
    public static final Y1<Long> f34953X;

    /* renamed from: X0, reason: collision with root package name */
    public static final Y1<Boolean> f34954X0;

    /* renamed from: Y, reason: collision with root package name */
    public static final Y1<Integer> f34955Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final Y1<Boolean> f34956Y0;

    /* renamed from: Z, reason: collision with root package name */
    public static final Y1<Double> f34957Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final Y1<Boolean> f34958Z0;

    /* renamed from: a, reason: collision with root package name */
    private static final List<Y1<?>> f34959a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0, reason: collision with root package name */
    public static final Y1<Integer> f34960a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final Y1<Boolean> f34961a1;

    /* renamed from: b, reason: collision with root package name */
    public static final Y1<Long> f34962b;

    /* renamed from: b0, reason: collision with root package name */
    public static final Y1<Integer> f34963b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final Y1<Boolean> f34964b1;

    /* renamed from: c, reason: collision with root package name */
    public static final Y1<Long> f34965c;

    /* renamed from: c0, reason: collision with root package name */
    public static final Y1<Integer> f34966c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final Y1<Boolean> f34967c1;

    /* renamed from: d, reason: collision with root package name */
    public static final Y1<Long> f34968d;

    /* renamed from: d0, reason: collision with root package name */
    public static final Y1<Integer> f34969d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final Y1<Boolean> f34970d1;

    /* renamed from: e, reason: collision with root package name */
    public static final Y1<Long> f34971e;

    /* renamed from: e0, reason: collision with root package name */
    public static final Y1<Long> f34972e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final Y1<Boolean> f34973e1;

    /* renamed from: f, reason: collision with root package name */
    public static final Y1<String> f34974f;

    /* renamed from: f0, reason: collision with root package name */
    public static final Y1<Long> f34975f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final Y1<Boolean> f34976f1;

    /* renamed from: g, reason: collision with root package name */
    public static final Y1<String> f34977g;

    /* renamed from: g0, reason: collision with root package name */
    public static final Y1<Integer> f34978g0;

    /* renamed from: h, reason: collision with root package name */
    public static final Y1<Integer> f34979h;

    /* renamed from: h0, reason: collision with root package name */
    public static final Y1<Integer> f34980h0;

    /* renamed from: i, reason: collision with root package name */
    public static final Y1<Integer> f34981i;

    /* renamed from: i0, reason: collision with root package name */
    public static final Y1<String> f34982i0;

    /* renamed from: j, reason: collision with root package name */
    public static final Y1<Integer> f34983j;

    /* renamed from: j0, reason: collision with root package name */
    public static final Y1<String> f34984j0;

    /* renamed from: k, reason: collision with root package name */
    public static final Y1<Integer> f34985k;

    /* renamed from: k0, reason: collision with root package name */
    public static final Y1<String> f34986k0;

    /* renamed from: l, reason: collision with root package name */
    public static final Y1<Integer> f34987l;

    /* renamed from: l0, reason: collision with root package name */
    public static final Y1<Long> f34988l0;

    /* renamed from: m, reason: collision with root package name */
    public static final Y1<Integer> f34989m;

    /* renamed from: m0, reason: collision with root package name */
    public static final Y1<String> f34990m0;

    /* renamed from: n, reason: collision with root package name */
    public static final Y1<Integer> f34991n;

    /* renamed from: n0, reason: collision with root package name */
    public static final Y1<String> f34992n0;

    /* renamed from: o, reason: collision with root package name */
    public static final Y1<Integer> f34993o;

    /* renamed from: o0, reason: collision with root package name */
    public static final Y1<String> f34994o0;

    /* renamed from: p, reason: collision with root package name */
    public static final Y1<Integer> f34995p;

    /* renamed from: p0, reason: collision with root package name */
    public static final Y1<String> f34996p0;

    /* renamed from: q, reason: collision with root package name */
    public static final Y1<Integer> f34997q;

    /* renamed from: q0, reason: collision with root package name */
    public static final Y1<Long> f34998q0;

    /* renamed from: r, reason: collision with root package name */
    public static final Y1<String> f34999r;

    /* renamed from: r0, reason: collision with root package name */
    public static final Y1<Integer> f35000r0;

    /* renamed from: s, reason: collision with root package name */
    public static final Y1<String> f35001s;

    /* renamed from: s0, reason: collision with root package name */
    public static final Y1<Integer> f35002s0;

    /* renamed from: t, reason: collision with root package name */
    public static final Y1<String> f35003t;

    /* renamed from: t0, reason: collision with root package name */
    public static final Y1<Integer> f35004t0;

    /* renamed from: u, reason: collision with root package name */
    public static final Y1<Long> f35005u;

    /* renamed from: u0, reason: collision with root package name */
    public static final Y1<Boolean> f35006u0;

    /* renamed from: v, reason: collision with root package name */
    public static final Y1<Long> f35007v;

    /* renamed from: v0, reason: collision with root package name */
    public static final Y1<Boolean> f35008v0;

    /* renamed from: w, reason: collision with root package name */
    public static final Y1<Integer> f35009w;

    /* renamed from: w0, reason: collision with root package name */
    public static final Y1<Integer> f35010w0;

    /* renamed from: x, reason: collision with root package name */
    public static final Y1<Integer> f35011x;

    /* renamed from: x0, reason: collision with root package name */
    public static final Y1<Boolean> f35012x0;

    /* renamed from: y, reason: collision with root package name */
    public static final Y1<Long> f35013y;

    /* renamed from: y0, reason: collision with root package name */
    public static final Y1<Boolean> f35014y0;

    /* renamed from: z, reason: collision with root package name */
    public static final Y1<Long> f35015z;

    /* renamed from: z0, reason: collision with root package name */
    public static final Y1<Boolean> f35016z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f34962b = F("measurement.ad_id_cache_time", 10000L, new X1() { // from class: com.google.android.gms.measurement.internal.M
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.a());
            }
        });
        f34965c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new X1() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.B());
            }
        });
        f34968d = F("measurement.monitoring.sample_period_millis", 86400000L, new X1() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.i0());
            }
        });
        f34971e = c("measurement.config.cache_time", 86400000L, 3600000L, new X1() { // from class: com.google.android.gms.measurement.internal.K0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.S());
            }
        }, false);
        f34974f = F("measurement.config.url_scheme", "https", new X1() { // from class: com.google.android.gms.measurement.internal.W0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.E();
            }
        });
        f34977g = F("measurement.config.url_authority", "app-measurement.com", new X1() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.D();
            }
        });
        f34979h = F("measurement.upload.max_bundles", 100, new X1() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.q());
            }
        });
        f34981i = F("measurement.upload.max_batch_size", 65536, new X1() { // from class: com.google.android.gms.measurement.internal.I1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.y());
            }
        });
        f34983j = F("measurement.upload.max_bundle_size", 65536, new X1() { // from class: com.google.android.gms.measurement.internal.U1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.p());
            }
        });
        f34985k = F("measurement.upload.max_events_per_bundle", 1000, new X1() { // from class: com.google.android.gms.measurement.internal.Z
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.t());
            }
        });
        f34987l = F("measurement.upload.max_events_per_day", 100000, new X1() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.u());
            }
        });
        f34989m = F("measurement.upload.max_error_events_per_day", 1000, new X1() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.s());
            }
        });
        f34991n = F("measurement.upload.max_public_events_per_day", 50000, new X1() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.v());
            }
        });
        f34993o = F("measurement.upload.max_conversions_per_day", 10000, new X1() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.r());
            }
        });
        f34995p = F("measurement.upload.max_realtime_events_per_day", 10, new X1() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.x());
            }
        });
        f34997q = F("measurement.store.max_stored_events_per_app", 100000, new X1() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.Z());
            }
        });
        f34999r = F("measurement.upload.url", "https://app-measurement.com/a", new X1() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.N();
            }
        });
        f35001s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new X1() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.G();
            }
        });
        f35003t = F("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile", new X1() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.I();
            }
        });
        f35005u = F("measurement.sgtm.upload.retry_interval", 1800000L, new X1() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.e());
            }
        });
        f35007v = F("measurement.sgtm.upload.retry_max_wait", 21600000L, new X1() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.f());
            }
        });
        f35009w = F("measurement.sgtm.upload.max_queued_batches", 5000, new X1() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.o0());
            }
        });
        f35011x = F("measurement.sgtm.upload.batches_retrieval_limit", 10, new X1() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.n0());
            }
        });
        Long lValueOf = Long.valueOf(Config.MC_BROADCAST_INTERVAL_WIFI);
        f35013y = F("measurement.sgtm.upload.min_delay_after_startup", lValueOf, new X1() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.d());
            }
        });
        f35015z = F("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new X1() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.c());
            }
        });
        f34907A = F("measurement.sgtm.upload.min_delay_after_background", Long.valueOf(Config.SERVER_POLL_CHECK_INTERVAL), new X1() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.b());
            }
        });
        f34909B = F("measurement.upload.backoff_period", 43200000L, new X1() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.m());
            }
        });
        f34911C = F("measurement.upload.window_interval", 3600000L, new X1() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.C());
            }
        });
        f34913D = F("measurement.upload.interval", 3600000L, new X1() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.o());
            }
        });
        f34915E = F("measurement.upload.realtime_upload_interval", 10000L, new X1() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.k0());
            }
        });
        f34917F = F("measurement.upload.debug_upload_interval", 1000L, new X1() { // from class: com.google.android.gms.measurement.internal.B0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.T());
            }
        });
        f34919G = F("measurement.upload.minimum_delay", 500L, new X1() { // from class: com.google.android.gms.measurement.internal.A0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.h0());
            }
        });
        f34921H = F("measurement.alarm_manager.minimum_interval", Long.valueOf(Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX), new X1() { // from class: com.google.android.gms.measurement.internal.D0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.g0());
            }
        });
        f34923I = F("measurement.upload.stale_data_deletion_interval", 86400000L, new X1() { // from class: com.google.android.gms.measurement.internal.C0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.g());
            }
        });
        f34925J = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new X1() { // from class: com.google.android.gms.measurement.internal.F0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.l0());
            }
        });
        f34927K = F("measurement.upload.initial_upload_delay_time", 15000L, new X1() { // from class: com.google.android.gms.measurement.internal.E0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.n());
            }
        });
        f34929L = F("measurement.upload.retry_time", 1800000L, new X1() { // from class: com.google.android.gms.measurement.internal.G0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.A());
            }
        });
        f34931M = F("measurement.upload.retry_count", 6, new X1() { // from class: com.google.android.gms.measurement.internal.J0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.z());
            }
        });
        f34933N = F("measurement.upload.max_queue_time", 518400000L, new X1() { // from class: com.google.android.gms.measurement.internal.I0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.w());
            }
        });
        f34935O = F("measurement.upload.google_signal_max_queue_time", 300000L, new X1() { // from class: com.google.android.gms.measurement.internal.L0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.V());
            }
        });
        f34937P = F("measurement.lifetimevalue.max_currency_tracked", 4, new X1() { // from class: com.google.android.gms.measurement.internal.N0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.W());
            }
        });
        f34939Q = F("measurement.audience.filter_result_max_count", 200, new X1() { // from class: com.google.android.gms.measurement.internal.M0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.b0());
            }
        });
        f34941R = a("measurement.upload.max_public_user_properties", 100);
        f34943S = a("measurement.upload.max_event_name_cardinality", 2000);
        f34945T = a("measurement.upload.max_public_event_params", 100);
        f34947U = F("measurement.service_client.idle_disconnect_millis", lValueOf, new X1() { // from class: com.google.android.gms.measurement.internal.P0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.m0());
            }
        });
        Boolean bool = Boolean.FALSE;
        f34949V = F("measurement.test.boolean_flag", bool, new X1() { // from class: com.google.android.gms.measurement.internal.O0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(R6.f());
            }
        });
        f34951W = F("measurement.test.string_flag", "---", new X1() { // from class: com.google.android.gms.measurement.internal.R0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return R6.e();
            }
        });
        f34953X = F("measurement.test.long_flag", -1L, new X1() { // from class: com.google.android.gms.measurement.internal.T0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(R6.d());
            }
        });
        b("measurement.test.cached_long_flag", -1L, new X1() { // from class: com.google.android.gms.measurement.internal.S0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(R6.b());
            }
        });
        f34955Y = F("measurement.test.int_flag", -2, new X1() { // from class: com.google.android.gms.measurement.internal.V0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) R6.c());
            }
        });
        f34957Z = F("measurement.test.double_flag", Double.valueOf(-3.0d), new X1() { // from class: com.google.android.gms.measurement.internal.U0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Double.valueOf(R6.a());
            }
        });
        f34960a0 = F("measurement.experiment.max_ids", 50, new X1() { // from class: com.google.android.gms.measurement.internal.X0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.a0());
            }
        });
        f34963b0 = F("measurement.upload.max_item_scoped_custom_parameters", 27, new X1() { // from class: com.google.android.gms.measurement.internal.Z0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.c0());
            }
        });
        f34966c0 = b("measurement.upload.max_event_parameter_value_length", Integer.valueOf(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE), new X1() { // from class: com.google.android.gms.measurement.internal.Y0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.Y());
            }
        });
        f34969d0 = F("measurement.max_bundles_per_iteration", 100, new X1() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.R());
            }
        });
        f34972e0 = F("measurement.sdk.attribution.cache.ttl", 604800000L, new X1() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.k());
            }
        });
        f34975f0 = F("measurement.redaction.app_instance_id.ttl", 7200000L, new X1() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.l());
            }
        });
        f34978g0 = F("measurement.rb.attribution.client.min_ad_services_version", 7, new X1() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.f0());
            }
        });
        f34980h0 = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new X1() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.X());
            }
        });
        f34982i0 = F("measurement.rb.attribution.uri_scheme", "https", new X1() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.M();
            }
        });
        f34984j0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new X1() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.J();
            }
        });
        f34986k0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new X1() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.K();
            }
        });
        f34988l0 = F("measurement.session.engagement_interval", 3600000L, new X1() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.U());
            }
        });
        f34990m0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new X1() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.H();
            }
        });
        f34992n0 = F("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new X1() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.O();
            }
        });
        f34994o0 = F("measurement.rb.attribution.event_params", "value|currency", new X1() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.F();
            }
        });
        f34996p0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new X1() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return C2573r6.L();
            }
        });
        f34998q0 = F("measurement.rb.attribution.max_queue_time", 864000000L, new X1() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Long.valueOf(C2573r6.j());
            }
        });
        f35000r0 = F("measurement.rb.attribution.max_retry_delay_seconds", 16, new X1() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.h());
            }
        });
        f35002s0 = F("measurement.rb.attribution.client.min_time_after_boot_seconds", 0, new X1() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.i());
            }
        });
        F("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new X1() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.e0());
            }
        });
        f35004t0 = F("measurement.rb.max_trigger_registrations_per_day", 1000, new X1() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.d0());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f35006u0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2573r6.P());
            }
        });
        f35008v0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2573r6.Q());
            }
        });
        f35010w0 = F("measurement.rb.attribution.notify_app_delay_millis", 0, new X1() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2573r6.j0());
            }
        });
        f35012x0 = a("measurement.quality.checksum", bool);
        f35014y0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new X1() { // from class: com.google.android.gms.measurement.internal.D1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(F6.c());
            }
        });
        f35016z0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new X1() { // from class: com.google.android.gms.measurement.internal.C1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(F6.b());
            }
        });
        f34908A0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new X1() { // from class: com.google.android.gms.measurement.internal.F1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(F6.d());
            }
        });
        f34910B0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new X1() { // from class: com.google.android.gms.measurement.internal.E1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(Q6.a());
            }
        });
        f34912C0 = F("measurement.integration.disable_firebase_instance_id", bool, new X1() { // from class: com.google.android.gms.measurement.internal.H1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(p7.b());
            }
        });
        f34914D0 = F("measurement.collection.service.update_with_analytics_fix", bool, new X1() { // from class: com.google.android.gms.measurement.internal.G1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(q7.a());
            }
        });
        f34916E0 = F("measurement.service.storage_consent_support_version", 203600, new X1() { // from class: com.google.android.gms.measurement.internal.J1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Integer.valueOf((int) C2581s6.a());
            }
        });
        f34918F0 = F("measurement.service.store_null_safelist", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.L1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(E6.b());
            }
        });
        f34920G0 = F("measurement.service.store_safelist", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.N1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(E6.c());
            }
        });
        f34922H0 = F("measurement.session_stitching_token_enabled", bool, new X1() { // from class: com.google.android.gms.measurement.internal.M1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(e7.b());
            }
        });
        f34924I0 = F("measurement.sgtm.upload_queue", bool, new X1() { // from class: com.google.android.gms.measurement.internal.P1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.g());
            }
        });
        f34926J0 = F("measurement.sgtm.google_signal.enable", bool, new X1() { // from class: com.google.android.gms.measurement.internal.O1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.c());
            }
        });
        f34928K0 = F("measurement.sgtm.no_proxy.service", bool, new X1() { // from class: com.google.android.gms.measurement.internal.R1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.e());
            }
        });
        f34930L0 = F("measurement.sgtm.service.batching_on_backgrounded", bool, new X1() { // from class: com.google.android.gms.measurement.internal.Q1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.f());
            }
        });
        f34932M0 = b("measurement.sgtm.no_proxy.client.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.T1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.d());
            }
        });
        f34934N0 = b("measurement.sgtm.client.upload_on_backgrounded.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.S1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.b());
            }
        });
        f34936O0 = b("measurement.sgtm.client.scion_upload_action.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.V1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(k7.a());
            }
        });
        f34938P0 = F("measurement.gmscore_client_telemetry", bool, new X1() { // from class: com.google.android.gms.measurement.internal.O
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(L6.a());
            }
        });
        f34940Q0 = b("measurement.rb.attribution.service", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.N
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.i());
            }
        });
        f34942R0 = b("measurement.rb.attribution.client2", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.Q
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.c());
            }
        });
        f34944S0 = F("measurement.rb.attribution.uuid_generation", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.P
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.k());
            }
        });
        f34946T0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.T
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.j());
            }
        });
        F("measurement.rb.attribution.followup1.service", bool, new X1() { // from class: com.google.android.gms.measurement.internal.S
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.d());
            }
        });
        f34948U0 = F("measurement.rb.attribution.retry_disposition", bool, new X1() { // from class: com.google.android.gms.measurement.internal.V
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.h());
            }
        });
        f34950V0 = F("measurement.rb.attribution.ad_campaign_info", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.U
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.b());
            }
        });
        f34952W0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new X1() { // from class: com.google.android.gms.measurement.internal.X
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(j7.a());
            }
        });
        f34954X0 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.W
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(K6.a());
            }
        });
        f34956Y0 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2637z6.b());
            }
        });
        f34958Z0 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2637z6.a());
            }
        });
        f34961a1 = F("measurement.set_default_event_parameters.fix_deferred_analytics_collection", bool, new X1() { // from class: com.google.android.gms.measurement.internal.H0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2629y6.a());
            }
        });
        f34964b1 = F("measurement.chimera.parameter.service", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.Q0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2534m6.b());
            }
        });
        f34967c1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2526l6.a());
            }
        });
        F("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.g());
            }
        });
        F("measurement.remove_conflicting_first_party_apis.dev", bool, new X1() { // from class: com.google.android.gms.measurement.internal.A1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(X6.a());
            }
        });
        f34970d1 = F("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, new X1() { // from class: com.google.android.gms.measurement.internal.K1
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.f());
            }
        });
        f34973e1 = F("measurement.rb.attribution.client.get_trigger_uris_async", bool, new X1() { // from class: com.google.android.gms.measurement.internal.L
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(W6.e());
            }
        });
        f34976f1 = F("measurement.backfill_session_ids.service", bool, new X1() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.X1
            public final Object a() {
                return Boolean.valueOf(C2462d7.b());
            }
        });
    }

    private static <V> Y1<V> F(String str, V v10, X1<V> x12) {
        return c(str, v10, v10, x12, false);
    }

    private static <V> Y1<V> a(String str, V v10) {
        return c(str, v10, v10, null, false);
    }

    private static <V> Y1<V> b(String str, V v10, X1<V> x12) {
        return c(str, v10, v10, x12, true);
    }

    private static <V> Y1<V> c(String str, V v10, V v11, X1<V> x12, boolean z10) {
        Y1<V> y12 = new Y1<>(str, v10, v11, x12);
        if (z10) {
            f34959a.add(y12);
        }
        return y12;
    }

    public static Map<String, String> e(Context context) {
        C2491h3 c2491h3A = C2491h3.a(context.getContentResolver(), C2586t3.a("com.google.android.gms.measurement"), new Runnable() { // from class: v7.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2610w3.m();
            }
        });
        return c2491h3A == null ? Collections.emptyMap() : c2491h3A.b();
    }
}
