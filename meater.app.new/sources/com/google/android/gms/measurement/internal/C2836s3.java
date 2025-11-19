package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2456d1;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2836s3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f35621a;

    /* renamed from: b, reason: collision with root package name */
    String f35622b;

    /* renamed from: c, reason: collision with root package name */
    String f35623c;

    /* renamed from: d, reason: collision with root package name */
    String f35624d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f35625e;

    /* renamed from: f, reason: collision with root package name */
    long f35626f;

    /* renamed from: g, reason: collision with root package name */
    C2456d1 f35627g;

    /* renamed from: h, reason: collision with root package name */
    boolean f35628h;

    /* renamed from: i, reason: collision with root package name */
    Long f35629i;

    /* renamed from: j, reason: collision with root package name */
    String f35630j;

    public C2836s3(Context context, C2456d1 c2456d1, Long l10) {
        this.f35628h = true;
        C3445p.k(context);
        Context applicationContext = context.getApplicationContext();
        C3445p.k(applicationContext);
        this.f35621a = applicationContext;
        this.f35629i = l10;
        if (c2456d1 != null) {
            this.f35627g = c2456d1;
            this.f35622b = c2456d1.f34069G;
            this.f35623c = c2456d1.f34068F;
            this.f35624d = c2456d1.f34067E;
            this.f35628h = c2456d1.f34066D;
            this.f35626f = c2456d1.f34065C;
            this.f35630j = c2456d1.f34071I;
            Bundle bundle = c2456d1.f34070H;
            if (bundle != null) {
                this.f35625e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
