package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
/* loaded from: classes2.dex */
public abstract class LegacyInternalGmsClient<T extends IInterface> extends GmsClient<T> {

    /* renamed from: d */
    private final GmsClientEventManager f17768d;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void checkAvailabilityAndConnect() {
        this.f17768d.m14332b();
        super.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public void disconnect() {
        this.f17768d.m14331a();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectedLocked(T t) {
        super.onConnectedLocked(t);
        this.f17768d.m14334d(getConnectionHint());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f17768d.m14333c(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectionSuspended(int i2) {
        super.onConnectionSuspended(i2);
        this.f17768d.m14335e(i2);
    }
}
