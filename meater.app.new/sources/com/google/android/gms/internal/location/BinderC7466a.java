package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

/* renamed from: com.google.android.gms.internal.location.a */
/* loaded from: classes2.dex */
final class BinderC7466a extends zzv {

    /* renamed from: f */
    private final ListenerHolder<LocationCallback> f27625f;

    @Override // com.google.android.gms.location.zzu
    /* renamed from: P3 */
    public final void mo20943P3(LocationAvailability locationAvailability) {
        this.f27625f.m14045c(new C7468c(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzu
    /* renamed from: W4 */
    public final void mo20944W4(LocationResult locationResult) {
        this.f27625f.m14045c(new C7467b(this, locationResult));
    }
}
