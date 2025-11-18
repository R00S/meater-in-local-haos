package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.measurement.internal.zzw;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f30639a;

    /* renamed from: b */
    private final zzfx f30640b;

    /* renamed from: c */
    private final zzx f30641c;

    /* renamed from: d */
    private final boolean f30642d;

    /* renamed from: e */
    private final Object f30643e;

    private FirebaseAnalytics(zzfx zzfxVar) {
        Preconditions.m14372k(zzfxVar);
        this.f30640b = zzfxVar;
        this.f30641c = null;
        this.f30642d = false;
        this.f30643e = new Object();
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f30639a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f30639a == null) {
                    if (zzx.m22563E(context)) {
                        f30639a = new FirebaseAnalytics(zzx.m22577d(context));
                    } else {
                        f30639a = new FirebaseAnalytics(zzfx.m23203a(context, null));
                    }
                }
            }
        }
        return f30639a;
    }

    @Keep
    public static zzhx getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzx zzxVarM22578e;
        if (zzx.m22563E(context) && (zzxVarM22578e = zzx.m22578e(context, null, null, null, bundle)) != null) {
            return new C8099b(zzxVarM22578e);
        }
        return null;
    }

    /* renamed from: a */
    public final void m24948a(String str, Bundle bundle) throws IllegalStateException {
        if (this.f30642d) {
            this.f30641c.m22610q(str, bundle);
        } else {
            this.f30640b.m23216H().m23282T("app", str, bundle, true);
        }
    }

    /* renamed from: b */
    public final void m24949b(String str, String str2) {
        if (this.f30642d) {
            this.f30641c.m22611r(str, str2);
        } else {
            this.f30640b.m23216H().m23285W("app", str, str2, false);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m26166j().m26184h();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) throws IllegalStateException {
        if (this.f30642d) {
            this.f30641c.m22607j(activity, str, str2);
        } else if (zzw.m23556a()) {
            this.f30640b.m23225Q().m23336F(activity, str, str2);
        } else {
            this.f30640b.mo22836h().m23140K().m23147a("setCurrentScreen must be called from the main thread");
        }
    }

    private FirebaseAnalytics(zzx zzxVar) {
        Preconditions.m14372k(zzxVar);
        this.f30640b = null;
        this.f30641c = zzxVar;
        this.f30642d = true;
        this.f30643e = new Object();
    }
}
