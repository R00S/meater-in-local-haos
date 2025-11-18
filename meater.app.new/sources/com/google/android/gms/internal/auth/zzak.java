package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* loaded from: classes2.dex */
public final class zzak extends GmsClient<zzan> {

    /* renamed from: d */
    private final Bundle f27509d;

    public zzak(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (authProxyOptions != null) {
            throw new NoSuchMethodError();
        }
        this.f27509d = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzan ? (zzan) iInterfaceQueryLocalInterface : new zzao(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f27509d;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        ClientSettings clientSettingsM14329e = m14329e();
        return (TextUtils.isEmpty(clientSettingsM14329e.m14289c()) || clientSettingsM14329e.m14292f(AuthProxy.f16913c).isEmpty()) ? false : true;
    }
}
