package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzy;

/* renamed from: com.google.android.gms.internal.location.e */
/* loaded from: classes2.dex */
final class BinderC7470e extends zzy {

    /* renamed from: f */
    private final ListenerHolder<LocationListener> f27628f;

    @Override // com.google.android.gms.location.zzx
    /* renamed from: v6 */
    public final synchronized void mo20945v6(Location location) {
        this.f27628f.m14045c(new C7471f(this, location));
    }
}
