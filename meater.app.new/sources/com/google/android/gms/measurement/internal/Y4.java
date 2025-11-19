package com.google.android.gms.measurement.internal;

import Y6.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class Y4 extends AbstractC2873x5 {

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, X4> f35227d;

    /* renamed from: e, reason: collision with root package name */
    public final C2870x2 f35228e;

    /* renamed from: f, reason: collision with root package name */
    public final C2870x2 f35229f;

    /* renamed from: g, reason: collision with root package name */
    public final C2870x2 f35230g;

    /* renamed from: h, reason: collision with root package name */
    public final C2870x2 f35231h;

    /* renamed from: i, reason: collision with root package name */
    public final C2870x2 f35232i;

    /* renamed from: j, reason: collision with root package name */
    public final C2870x2 f35233j;

    Y4(C2880y5 c2880y5) {
        super(c2880y5);
        this.f35227d = new HashMap();
        C2835s2 c2835s2H = h();
        Objects.requireNonNull(c2835s2H);
        this.f35228e = new C2870x2(c2835s2H, "last_delete_stale", 0L);
        C2835s2 c2835s2H2 = h();
        Objects.requireNonNull(c2835s2H2);
        this.f35229f = new C2870x2(c2835s2H2, "last_delete_stale_batch", 0L);
        C2835s2 c2835s2H3 = h();
        Objects.requireNonNull(c2835s2H3);
        this.f35230g = new C2870x2(c2835s2H3, "backoff", 0L);
        C2835s2 c2835s2H4 = h();
        Objects.requireNonNull(c2835s2H4);
        this.f35231h = new C2870x2(c2835s2H4, "last_upload", 0L);
        C2835s2 c2835s2H5 = h();
        Objects.requireNonNull(c2835s2H5);
        this.f35232i = new C2870x2(c2835s2H5, "last_upload_attempt", 0L);
        C2835s2 c2835s2H6 = h();
        Objects.requireNonNull(c2835s2H6);
        this.f35233j = new C2870x2(c2835s2H6, "midnight_offset", 0L);
    }

    @Deprecated
    private final Pair<String, Boolean> z(String str) {
        X4 x42;
        a.C0284a c0284aA;
        n();
        long jC = b().c();
        X4 x43 = this.f35227d.get(str);
        if (x43 != null && jC < x43.f35210c) {
            return new Pair<>(x43.f35208a, Boolean.valueOf(x43.f35209b));
        }
        Y6.a.b(true);
        long jF = c().F(str) + jC;
        try {
            try {
                c0284aA = Y6.a.a(a());
            } catch (PackageManager.NameNotFoundException unused) {
                if (x43 != null && jC < x43.f35210c + c().D(str, K.f34965c)) {
                    return new Pair<>(x43.f35208a, Boolean.valueOf(x43.f35209b));
                }
                c0284aA = null;
            }
        } catch (Exception e10) {
            k().G().b("Unable to get advertising id", e10);
            x42 = new X4("", false, jF);
        }
        if (c0284aA == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0284aA.a();
        x42 = strA != null ? new X4(strA, c0284aA.b(), jF) : new X4("", c0284aA.b(), jF);
        this.f35227d.put(str, x42);
        Y6.a.b(false);
        return new Pair<>(x42.f35208a, Boolean.valueOf(x42.f35209b));
    }

    final Pair<String, Boolean> A(String str, C2823q3 c2823q3) {
        return c2823q3.w() ? z(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    final String B(String str, boolean z10) throws NoSuchAlgorithmException {
        n();
        String str2 = z10 ? (String) z(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestT0 = Q5.T0();
        if (messageDigestT0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT0.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ N5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2812p r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2866w5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }
}
