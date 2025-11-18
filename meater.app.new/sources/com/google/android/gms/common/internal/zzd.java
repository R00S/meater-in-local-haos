package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzd extends zzab {

    /* renamed from: f */
    private BaseGmsClient f17850f;

    /* renamed from: g */
    private final int f17851g;

    public zzd(BaseGmsClient baseGmsClient, int i2) {
        this.f17850f = baseGmsClient;
        this.f17851g = i2;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    /* renamed from: O3 */
    public final void mo14349O3(int i2, IBinder iBinder, Bundle bundle) {
        Preconditions.m14373l(this.f17850f, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f17850f.onPostInitHandler(i2, iBinder, bundle, this.f17851g);
        this.f17850f = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    /* renamed from: f4 */
    public final void mo14350f4(int i2, IBinder iBinder, zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.f17850f;
        Preconditions.m14373l(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.m14372k(zzjVar);
        BaseGmsClient.zzj(baseGmsClient, zzjVar);
        mo14349O3(i2, iBinder, zzjVar.f17857f);
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    /* renamed from: v2 */
    public final void mo14351v2(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
