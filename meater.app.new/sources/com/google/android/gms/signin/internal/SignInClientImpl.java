package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.SignInOptions;

@KeepForSdk
/* loaded from: classes2.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zad {

    /* renamed from: d */
    private final boolean f29476d;

    /* renamed from: e */
    private final ClientSettings f29477e;

    /* renamed from: f */
    private final Bundle f29478f;

    /* renamed from: g */
    private Integer f29479g;

    private SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f29476d = true;
        this.f29477e = clientSettings;
        this.f29478f = bundle;
        this.f29479g = clientSettings.m14293g();
    }

    @KeepForSdk
    /* renamed from: j */
    public static Bundle m23613j(ClientSettings clientSettings) {
        SignInOptions signInOptionsM14298l = clientSettings.m14298l();
        Integer numM14293g = clientSettings.m14293g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.m14288b());
        if (numM14293g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numM14293g.intValue());
        }
        if (signInOptionsM14298l != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptionsM14298l.m23611g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptionsM14298l.m23610f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptionsM14298l.m23608d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptionsM14298l.m23609e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptionsM14298l.m23606b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptionsM14298l.m23612h());
            if (signInOptionsM14298l.m23605a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptionsM14298l.m23605a().longValue());
            }
            if (signInOptionsM14298l.m23607c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptionsM14298l.m23607c().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.signin.zad
    /* renamed from: a */
    public final void mo23614a() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @Override // com.google.android.gms.signin.zad
    /* renamed from: b */
    public final void mo23615b(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) getService()).mo23623V2(iAccountAccessor, this.f29479g.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.signin.zad
    /* renamed from: c */
    public final void mo23616c() {
        try {
            ((zaf) getService()).mo23622B1(this.f29479g.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zaf ? (zaf) iInterfaceQueryLocalInterface : new zag(iBinder);
    }

    @Override // com.google.android.gms.signin.zad
    /* renamed from: d */
    public final void mo23617d(zad zadVar) {
        Preconditions.m14373l(zadVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountM14290d = this.f29477e.m14290d();
            ((zaf) getService()).mo23624n3(new zah(new ResolveAccountRequest(accountM14290d, this.f29479g.intValue(), BaseGmsClient.DEFAULT_ACCOUNT.equals(accountM14290d.name) ? Storage.m13705b(getContext()).m13713c() : null)), zadVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zadVar.mo14065w1(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f29477e.m14296j())) {
            this.f29478f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f29477e.m14296j());
        }
        return this.f29478f;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresSignIn() {
        return this.f29476d;
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, m23613j(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
