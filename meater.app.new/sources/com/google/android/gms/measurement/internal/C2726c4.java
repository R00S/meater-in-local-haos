package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2481g1;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2726c4 implements Application.ActivityLifecycleCallbacks, v7.V {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C2843t3 f35310B;

    C2726c4(C2843t3 c2843t3) {
        this.f35310B = c2843t3;
    }

    static /* synthetic */ void f(C2726c4 c2726c4, boolean z10, Uri uri, String str, String str2) {
        Bundle bundleD;
        Bundle bundleD2;
        c2726c4.f35310B.n();
        try {
            Q5 q5J = c2726c4.f35310B.j();
            if (TextUtils.isEmpty(str2)) {
                bundleD = null;
            } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                bundleD = q5J.D(Uri.parse("https://google.com/search?" + str2));
                if (bundleD != null) {
                    bundleD.putString("_cis", "referrer");
                }
            } else {
                q5J.k().G().a("Activity created with data 'referrer' without required params");
                bundleD = null;
            }
            if (z10 && (bundleD2 = c2726c4.f35310B.j().D(uri)) != null) {
                bundleD2.putString("_cis", "intent");
                if (!bundleD2.containsKey("gclid") && bundleD != null && bundleD.containsKey("gclid")) {
                    bundleD2.putString("_cer", String.format("gclid=%s", bundleD.getString("gclid")));
                }
                c2726c4.f35310B.h1(str, "_cmp", bundleD2);
                c2726c4.f35310B.f35659r.b(str, bundleD2);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c2726c4.f35310B.k().G().b("Activity created with referrer", str2);
            if (c2726c4.f35310B.c().u(K.f34910B0)) {
                if (bundleD != null) {
                    c2726c4.f35310B.h1(str, "_cmp", bundleD);
                    c2726c4.f35310B.f35659r.b(str, bundleD);
                } else {
                    c2726c4.f35310B.k().G().b("Referrer does not contain valid parameters", str2);
                }
                c2726c4.f35310B.p0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c2726c4.f35310B.k().G().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c2726c4.f35310B.p0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e10) {
            c2726c4.f35310B.k().H().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }

    @Override // v7.V
    public final void a(C2481g1 c2481g1) {
        this.f35310B.u().G(c2481g1);
    }

    @Override // v7.V
    public final void b(C2481g1 c2481g1) {
        C2727c5 c2727c5W = this.f35310B.w();
        c2727c5W.o().E(new RunnableC2720b5(c2727c5W, c2727c5W.b().c()));
        this.f35310B.u().T(c2481g1);
    }

    @Override // v7.V
    public final void c(C2481g1 c2481g1) {
        this.f35310B.u().R(c2481g1);
        C2727c5 c2727c5W = this.f35310B.w();
        c2727c5W.o().E(new RunnableC2741e5(c2727c5W, c2727c5W.b().c()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // v7.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.measurement.C2481g1 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.h2 r0 = r0.k()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.i2 r0 = r0.L()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r1 = "onActivityCreated"
            r0.a(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            android.content.Intent r0 = r9.f34119D     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B
            com.google.android.gms.measurement.internal.m4 r0 = r0.u()
            r0.H(r9, r10)
            return
        L1d:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 == 0) goto L31
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r2 == 0) goto L31
        L29:
            r5 = r1
            goto L4a
        L2b:
            r0 = move-exception
            goto Laf
        L2e:
            r0 = move-exception
            goto L96
        L31:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 == 0) goto L48
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r2 != 0) goto L48
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            goto L29
        L48:
            r1 = 0
            goto L29
        L4a:
            if (r5 == 0) goto L8c
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 != 0) goto L53
            goto L8c
        L53:
            com.google.android.gms.measurement.internal.t3 r1 = r8.f35310B     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r1.j()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            boolean r0 = com.google.android.gms.measurement.internal.Q5.g0(r0)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r0 == 0) goto L62
            java.lang.String r0 = "gs"
        L60:
            r6 = r0
            goto L65
        L62:
            java.lang.String r0 = "auto"
            goto L60
        L65:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r10 != 0) goto L70
            r0 = 1
        L6e:
            r4 = r0
            goto L72
        L70:
            r0 = 0
            goto L6e
        L72:
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.J2 r0 = r0.o()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.d4 r1 = new com.google.android.gms.measurement.internal.d4     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r0.E(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B
            com.google.android.gms.measurement.internal.m4 r0 = r0.u()
            r0.H(r9, r10)
            return
        L8c:
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B
            com.google.android.gms.measurement.internal.m4 r0 = r0.u()
            r0.H(r9, r10)
            return
        L96:
            com.google.android.gms.measurement.internal.t3 r1 = r8.f35310B     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.h2 r1 = r1.k()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.i2 r1 = r1.H()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.b(r2, r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.t3 r0 = r8.f35310B
            com.google.android.gms.measurement.internal.m4 r0 = r0.u()
            r0.H(r9, r10)
            return
        Laf:
            com.google.android.gms.measurement.internal.t3 r1 = r8.f35310B
            com.google.android.gms.measurement.internal.m4 r1 = r1.u()
            r1.H(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2726c4.d(com.google.android.gms.internal.measurement.g1, android.os.Bundle):void");
    }

    @Override // v7.V
    public final void e(C2481g1 c2481g1, Bundle bundle) {
        this.f35310B.u().S(c2481g1, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d(C2481g1.f0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(C2481g1.f0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(C2481g1.f0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(C2481g1.f0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(C2481g1.f0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
