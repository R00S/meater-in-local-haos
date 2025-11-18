package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C6349R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class GoogleServices {

    /* renamed from: a */
    private static final Object f17368a = new Object();

    /* renamed from: b */
    private static GoogleServices f17369b;

    /* renamed from: c */
    private final String f17370c;

    /* renamed from: d */
    private final Status f17371d;

    /* renamed from: e */
    private final boolean f17372e;

    /* renamed from: f */
    private final boolean f17373f;

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C6349R.string.f17225a));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            z = integer != 0;
            this.f17373f = z;
        } else {
            this.f17373f = false;
        }
        this.f17372e = z;
        String strM14501b = zzag.m14501b(context);
        strM14501b = strM14501b == null ? new StringResourceValueReader(context).m14401a("google_app_id") : strM14501b;
        if (TextUtils.isEmpty(strM14501b)) {
            this.f17371d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f17370c = null;
        } else {
            this.f17370c = strM14501b;
            this.f17371d = Status.f17291g;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    private static GoogleServices m14020a(String str) {
        GoogleServices googleServices;
        synchronized (f17368a) {
            googleServices = f17369b;
            if (googleServices == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return googleServices;
    }

    @KeepForSdk
    /* renamed from: b */
    public static String m14021b() {
        return m14020a("getGoogleAppId").f17370c;
    }

    @KeepForSdk
    /* renamed from: c */
    public static Status m14022c(Context context) {
        Status status;
        Preconditions.m14373l(context, "Context must not be null.");
        synchronized (f17368a) {
            if (f17369b == null) {
                f17369b = new GoogleServices(context);
            }
            status = f17369b.f17371d;
        }
        return status;
    }

    @KeepForSdk
    /* renamed from: d */
    public static boolean m14023d() {
        return m14020a("isMeasurementExplicitlyDisabled").f17373f;
    }
}
