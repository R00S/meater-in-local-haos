package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.internal.measurement.C2497i1;
import com.google.firebase.installations.c;
import g7.C3445p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v7.W;
import z7.C5211m;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f38076b;

    /* renamed from: a, reason: collision with root package name */
    private final C2497i1 f38077a;

    private FirebaseAnalytics(C2497i1 c2497i1) {
        C3445p.k(c2497i1);
        this.f38077a = c2497i1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f38076b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f38076b == null) {
                        f38076b = new FirebaseAnalytics(C2497i1.e(context));
                    }
                } finally {
                }
            }
        }
        return f38076b;
    }

    @Keep
    public static W getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2497i1 c2497i1F = C2497i1.f(context, null, null, null, bundle);
        if (c2497i1F == null) {
            return null;
        }
        return new a(c2497i1F);
    }

    public final void a(String str, Bundle bundle) {
        this.f38077a.s(str, bundle);
    }

    public final void b(boolean z10) {
        this.f38077a.p(Boolean.valueOf(z10));
    }

    public final void c(String str, String str2) {
        this.f38077a.C(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) C5211m.b(c.q().c(), Config.MC_STATS_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f38077a.j(activity, str, str2);
    }
}
