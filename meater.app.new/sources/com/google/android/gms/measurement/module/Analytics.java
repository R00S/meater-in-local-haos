package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public class Analytics {

    /* renamed from: a */
    private static volatile Analytics f29437a;

    /* renamed from: b */
    private final zzfx f29438b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static final class Event extends zzgw {
        private Event() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static final class Param extends zzgv {
        private Param() {
        }
    }

    private Analytics(zzfx zzfxVar) {
        Preconditions.m14372k(zzfxVar);
        this.f29438b = zzfxVar;
    }

    @ShowFirstParty
    @Keep
    public static Analytics getInstance(Context context) {
        if (f29437a == null) {
            synchronized (Analytics.class) {
                if (f29437a == null) {
                    f29437a = new Analytics(zzfx.m23203a(context, null));
                }
            }
        }
        return f29437a;
    }
}
