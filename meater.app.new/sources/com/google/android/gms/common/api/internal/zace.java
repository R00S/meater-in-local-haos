package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zace extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f */
    private static Api.AbstractClientBuilder<? extends zad, SignInOptions> f17559f = com.google.android.gms.signin.zaa.f29490c;

    /* renamed from: g */
    private final Context f17560g;

    /* renamed from: h */
    private final Handler f17561h;

    /* renamed from: i */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f17562i;

    /* renamed from: j */
    private Set<Scope> f17563j;

    /* renamed from: k */
    private ClientSettings f17564k;

    /* renamed from: l */
    private zad f17565l;

    /* renamed from: m */
    private zach f17566m;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, f17559f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A5 */
    public final void m14188A5(com.google.android.gms.signin.internal.zaj zajVar) {
        ConnectionResult connectionResultM23625y = zajVar.m23625y();
        if (connectionResultM23625y.m13795e0()) {
            ResolveAccountResponse resolveAccountResponseM23626z = zajVar.m23626z();
            ConnectionResult connectionResultM14383z = resolveAccountResponseM23626z.m14383z();
            if (!connectionResultM14383z.m13795e0()) {
                String strValueOf = String.valueOf(connectionResultM14383z);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f17566m.mo13982c(connectionResultM14383z);
                this.f17565l.disconnect();
                return;
            }
            this.f17566m.mo13981b(resolveAccountResponseM23626z.m14382y(), this.f17563j);
        } else {
            this.f17566m.mo13982c(connectionResultM23625y);
        }
        this.f17565l.disconnect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    /* renamed from: E0 */
    public final void mo13895E0(ConnectionResult connectionResult) {
        this.f17566m.mo13982c(connectionResult);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
        this.f17565l.disconnect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        this.f17565l.mo23617d(this);
    }

    /* renamed from: S4 */
    public final void m14191S4(zach zachVar) {
        zad zadVar = this.f17565l;
        if (zadVar != null) {
            zadVar.disconnect();
        }
        this.f17564k.m14300n(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f17562i;
        Context context = this.f17560g;
        Looper looper = this.f17561h.getLooper();
        ClientSettings clientSettings = this.f17564k;
        this.f17565l = (zad) abstractClientBuilder.mo13600c(context, looper, clientSettings, clientSettings.m14298l(), this, this);
        this.f17566m = zachVar;
        Set<Scope> set = this.f17563j;
        if (set == null || set.isEmpty()) {
            this.f17561h.post(new RunnableC6367f0(this));
        } else {
            this.f17565l.mo23614a();
        }
    }

    /* renamed from: Y4 */
    public final zad m14192Y4() {
        return this.f17565l;
    }

    /* renamed from: p5 */
    public final void m14193p5() {
        zad zadVar = this.f17565l;
        if (zadVar != null) {
            zadVar.disconnect();
        }
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad
    /* renamed from: w1 */
    public final void mo14065w1(com.google.android.gms.signin.internal.zaj zajVar) {
        this.f17561h.post(new RunnableC6369g0(this, zajVar));
    }

    public zace(Context context, Handler handler, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        this.f17560g = context;
        this.f17561h = handler;
        this.f17564k = (ClientSettings) Preconditions.m14373l(clientSettings, "ClientSettings must not be null");
        this.f17563j = clientSettings.m14297k();
        this.f17562i = abstractClientBuilder;
    }
}
