package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.l5 */
/* loaded from: classes2.dex */
final class C7755l5 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final /* synthetic */ zzhc f28751f;

    private C7755l5(zzhc zzhcVar) {
        this.f28751f = zzhcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m22801b(boolean z, Uri uri, String str, String str2) {
        Bundle bundleM23553y;
        Bundle bundleM23553y2;
        try {
            if (this.f28751f.mo22841n().m23587r(zzap.f29096H0) || this.f28751f.mo22841n().m23587r(zzap.f29100J0) || this.f28751f.mo22841n().m23587r(zzap.f29098I0)) {
                zzkk zzkkVarMo22839l = this.f28751f.mo22839l();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                        bundleM23553y = zzkkVarMo22839l.m23553y(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")));
                        if (bundleM23553y != null) {
                            bundleM23553y.putString("_cis", "referrer");
                        }
                    } else {
                        zzkkVarMo22839l.mo22836h().m23144O().m23147a("Activity created with data 'referrer' without required params");
                    }
                }
                bundleM23553y = null;
            } else {
                bundleM23553y = null;
            }
            boolean z2 = false;
            if (z) {
                bundleM23553y2 = this.f28751f.mo22839l().m23553y(uri);
                if (bundleM23553y2 != null) {
                    bundleM23553y2.putString("_cis", "intent");
                    if (this.f28751f.mo22841n().m23587r(zzap.f29096H0) && !bundleM23553y2.containsKey("gclid") && bundleM23553y != null && bundleM23553y.containsKey("gclid")) {
                        bundleM23553y2.putString("_cer", String.format("gclid=%s", bundleM23553y.getString("gclid")));
                    }
                    this.f28751f.m23281S(str, "_cmp", bundleM23553y2);
                }
            } else {
                bundleM23553y2 = null;
            }
            if (this.f28751f.mo22841n().m23587r(zzap.f29100J0) && !this.f28751f.mo22841n().m23587r(zzap.f29098I0) && bundleM23553y != null && bundleM23553y.containsKey("gclid") && (bundleM23553y2 == null || !bundleM23553y2.containsKey("gclid"))) {
                this.f28751f.m23285W("auto", "_lgclid", bundleM23553y.getString("gclid"), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f28751f.mo22836h().m23144O().m23148b("Activity created with referrer", str2);
            if (this.f28751f.mo22841n().m23587r(zzap.f29098I0)) {
                if (bundleM23553y != null) {
                    this.f28751f.m23281S(str, "_cmp", bundleM23553y);
                } else {
                    this.f28751f.mo22836h().m23144O().m23148b("Referrer does not contain valid parameters", str2);
                }
                this.f28751f.m23285W("auto", "_ldl", null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z2 = true;
            }
            if (!z2) {
                this.f28751f.mo22836h().m23144O().m23147a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.f28751f.m23285W("auto", "_ldl", str2, true);
            }
        } catch (Exception e2) {
            this.f28751f.mo22836h().m23137H().m23148b("Throwable caught in handleReferrerForOnActivityCreated", e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f28751f.mo22836h().m23145P().m23147a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data != null && data.isHierarchical()) {
                this.f28751f.mo22839l();
                String str = zzkk.m23501V(intent) ? "gs" : "auto";
                String queryParameter = data.getQueryParameter("referrer");
                boolean z = bundle == null;
                if (zzle.m22484b() && zzap.f29102K0.m23095a(null).booleanValue()) {
                    this.f28751f.mo22835g().m23201z(new RunnableC7773n5(this, z, data, str, queryParameter));
                } else {
                    m22801b(z, data, str, queryParameter);
                }
            }
        } catch (Exception e2) {
            this.f28751f.mo22836h().m23137H().m23148b("Throwable caught in onActivityCreated", e2);
        } finally {
            this.f28751f.mo22797s().m23335D(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f28751f.mo22797s().m23342P(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        this.f28751f.mo22797s().m23340N(activity);
        zzjl zzjlVarMo22799u = this.f28751f.mo22799u();
        zzjlVarMo22799u.mo22835g().m23201z(new RunnableC7837u6(zzjlVarMo22799u, zzjlVarMo22799u.mo22837j().mo14609b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        if (zzkn.m22461b() && zzap.f29142f0.m23095a(null).booleanValue()) {
            this.f28751f.mo22799u().m23400F();
            this.f28751f.mo22797s().m23334C(activity);
        } else {
            this.f28751f.mo22797s().m23334C(activity);
            this.f28751f.mo22799u().m23400F();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f28751f.mo22797s().m23341O(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ C7755l5(zzhc zzhcVar, RunnableC7853w4 runnableC7853w4) {
        this(zzhcVar);
    }
}
