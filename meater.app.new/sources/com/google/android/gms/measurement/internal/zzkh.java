package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzkh {

    /* renamed from: a */
    final Context f29386a;

    @VisibleForTesting
    public zzkh(Context context) {
        Preconditions.m14372k(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m14372k(applicationContext);
        this.f29386a = applicationContext;
    }
}
