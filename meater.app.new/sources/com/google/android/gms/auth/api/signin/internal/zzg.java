package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzg extends GmsClient<zzu> {

    /* renamed from: d */
    private final GoogleSignInOptions f17097d;

    public zzg(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.Builder().m13685a() : googleSignInOptions;
        if (!clientSettings.m14291e().isEmpty()) {
            GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(googleSignInOptions);
            Iterator<Scope> it = clientSettings.m14291e().iterator();
            while (it.hasNext()) {
                builder.m13689e(it.next(), new Scope[0]);
            }
            googleSignInOptions = builder.m13685a();
        }
        this.f17097d = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zzu ? (zzu) iInterfaceQueryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        return zzh.m13729b(getContext(), this.f17097d);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: j */
    public final GoogleSignInOptions m13727j() {
        return this.f17097d;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }
}
