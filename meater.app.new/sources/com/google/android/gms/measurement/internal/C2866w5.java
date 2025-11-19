package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C2466e2;
import g7.C3445p;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2866w5 extends C2825q5 {
    C2866w5(C2880y5 c2880y5) {
        super(c2880y5);
    }

    private final boolean x(String str, String str2) {
        C2828r2 c2828r2V0;
        C2466e2 c2466e2N = s().N(str);
        if (c2466e2N == null || (c2828r2V0 = r().V0(str)) == null) {
            return false;
        }
        if ((c2466e2N.d0() && c2466e2N.T().n() == 100) || j().F0(str, c2828r2V0.v())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < c2466e2N.T().n();
    }

    private final String y(String str) {
        String strT = s().T(str);
        if (TextUtils.isEmpty(strT)) {
            return K.f34999r.a(null);
        }
        Uri uri = Uri.parse(K.f34999r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strT + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    private static boolean z(String str) {
        String strA = K.f35003t.a(null);
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        for (String str2 : strA.split(",")) {
            if (str.equalsIgnoreCase(str2.trim())) {
                return true;
            }
        }
        return false;
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

    public final C2887z5 v(String str) {
        C2763i c2763iC = c();
        Y1<Boolean> y12 = K.f34928K0;
        C2887z5 c2887z5 = null;
        if (!c2763iC.u(y12)) {
            C2828r2 c2828r2V0 = r().V0(str);
            if (c2828r2V0 == null) {
                return new C2887z5(y(str), v7.X.GOOGLE_ANALYTICS);
            }
            if (!x(str, c2828r2V0.m())) {
                return new C2887z5(y(str), v7.X.GOOGLE_ANALYTICS);
            }
            if (c2828r2V0.C()) {
                k().L().a("sgtm upload enabled in manifest.");
                C2466e2 c2466e2N = s().N(c2828r2V0.l());
                if (c2466e2N != null && c2466e2N.d0()) {
                    String strO = c2466e2N.T().O();
                    if (!TextUtils.isEmpty(strO)) {
                        String strM = c2466e2N.T().M();
                        k().L().c("sgtm configured with upload_url, server_info", strO, TextUtils.isEmpty(strM) ? "Y" : "N");
                        if (TextUtils.isEmpty(strM)) {
                            c2887z5 = new C2887z5(strO, v7.X.SGTM);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-sgtm-server-info", strM);
                            if (!TextUtils.isEmpty(c2828r2V0.v())) {
                                map.put("x-gtm-server-preview", c2828r2V0.v());
                            }
                            c2887z5 = new C2887z5(strO, map, v7.X.SGTM);
                        }
                    }
                }
            }
            return c2887z5 != null ? c2887z5 : new C2887z5(y(str), v7.X.GOOGLE_ANALYTICS);
        }
        C2828r2 c2828r2V02 = r().V0(str);
        if (c2828r2V02 == null || !c2828r2V02.C()) {
            return new C2887z5(y(str), v7.X.GOOGLE_ANALYTICS);
        }
        A2.b bVarK = com.google.android.gms.internal.measurement.A2.K();
        A2.d dVar = A2.d.GA_UPLOAD;
        A2.b bVarV = bVarK.A(dVar).v((A2.a) C3445p.k(A2.a.c(c2828r2V02.F())));
        if (!x(str, c2828r2V02.m())) {
            bVarV.w(A2.c.NOT_IN_ROLLOUT);
            return new C2887z5(y(str), Collections.emptyMap(), v7.X.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.A2) ((com.google.android.gms.internal.measurement.F4) bVarV.x()));
        }
        String strL = c2828r2V02.l();
        bVarV.A(dVar);
        C2466e2 c2466e2N2 = s().N(c2828r2V02.l());
        if (c2466e2N2 == null || !c2466e2N2.d0()) {
            k().L().b("[sgtm] Missing sgtm_setting in remote config. appId", strL);
            bVarV.w(A2.c.MISSING_SGTM_SETTINGS);
        } else {
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(c2828r2V02.v())) {
                map2.put("x-gtm-server-preview", c2828r2V02.v());
            }
            String strN = c2466e2N2.T().N();
            A2.a aVarC = A2.a.c(c2828r2V02.F());
            if (aVarC != null && aVarC != A2.a.CLIENT_UPLOAD_ELIGIBLE) {
                bVarV.v(aVarC);
            } else if (!c().u(y12)) {
                bVarV.v(A2.a.SERVICE_FLAG_OFF);
            } else if (z(c2828r2V02.l())) {
                bVarV.v(A2.a.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strN)) {
                bVarV.v(A2.a.MISSING_SGTM_SERVER_URL);
            } else {
                k().L().b("[sgtm] Eligible for client side upload. appId", strL);
                bVarV.A(A2.d.SDK_CLIENT_UPLOAD).v(A2.a.CLIENT_UPLOAD_ELIGIBLE);
                c2887z5 = new C2887z5(strN, map2, v7.X.SGTM_CLIENT, (com.google.android.gms.internal.measurement.A2) ((com.google.android.gms.internal.measurement.F4) bVarV.x()));
            }
            c2466e2N2.T().O();
            c2466e2N2.T().M();
            if (TextUtils.isEmpty(strN)) {
                bVarV.w(A2.c.NON_PLAY_MISSING_SGTM_SERVER_URL);
                k().L().b("[sgtm] Local service, missing sgtm_server_url", c2828r2V02.l());
            } else {
                k().L().b("[sgtm] Eligible for local service direct upload. appId", strL);
                bVarV.A(A2.d.SDK_SERVICE_UPLOAD).w(A2.c.SERVICE_UPLOAD_ELIGIBLE);
                c2887z5 = new C2887z5(strN, map2, v7.X.SGTM, (com.google.android.gms.internal.measurement.A2) ((com.google.android.gms.internal.measurement.F4) bVarV.x()));
            }
        }
        return c2887z5 != null ? c2887z5 : new C2887z5(y(str), Collections.emptyMap(), v7.X.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.A2) ((com.google.android.gms.internal.measurement.F4) bVarV.x()));
    }

    final boolean w(String str, A2.a aVar) {
        C2466e2 c2466e2N;
        n();
        return c().u(K.f34928K0) && aVar == A2.a.CLIENT_UPLOAD_ELIGIBLE && !z(str) && (c2466e2N = s().N(str)) != null && c2466e2N.d0() && !c2466e2N.T().N().isEmpty();
    }
}
