package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzgz {

    /* renamed from: a */
    final Context f29313a;

    /* renamed from: b */
    String f29314b;

    /* renamed from: c */
    String f29315c;

    /* renamed from: d */
    String f29316d;

    /* renamed from: e */
    Boolean f29317e;

    /* renamed from: f */
    long f29318f;

    /* renamed from: g */
    com.google.android.gms.internal.measurement.zzv f29319g;

    /* renamed from: h */
    boolean f29320h;

    @VisibleForTesting
    public zzgz(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        this.f29320h = true;
        Preconditions.m14372k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m14372k(applicationContext);
        this.f29313a = applicationContext;
        if (zzvVar != null) {
            this.f29319g = zzvVar;
            this.f29314b = zzvVar.f28394k;
            this.f29315c = zzvVar.f28393j;
            this.f29316d = zzvVar.f28392i;
            this.f29320h = zzvVar.f28391h;
            this.f29318f = zzvVar.f28390g;
            Bundle bundle = zzvVar.f28395l;
            if (bundle != null) {
                this.f29317e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
