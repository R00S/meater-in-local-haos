package com.google.android.gms.internal.p475authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* loaded from: classes2.dex */
public final class zzr extends GmsClient<zzw> {

    /* renamed from: d */
    private final Auth.AuthCredentialsOptions f27493d;

    public zzr(Context context, Looper looper, ClientSettings clientSettings, Auth.AuthCredentialsOptions authCredentialsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f27493d = authCredentialsOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zzw ? (zzw) iInterfaceQueryLocalInterface : new zzx(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Auth.AuthCredentialsOptions authCredentialsOptions = this.f27493d;
        return authCredentialsOptions == null ? new Bundle() : authCredentialsOptions.m13605a();
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
