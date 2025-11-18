package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, GmsClientEventManager.GmsClientEventState {

    /* renamed from: a */
    private final ClientSettings f17747a;

    /* renamed from: b */
    private final Set<Scope> f17748b;

    /* renamed from: c */
    private final Account f17749c;

    @KeepForSdk
    protected GmsClient(Context context, Looper looper, int i2, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.m14340b(context), GoogleApiAvailability.m13803q(), i2, clientSettings, (GoogleApiClient.ConnectionCallbacks) Preconditions.m14372k(connectionCallbacks), (GoogleApiClient.OnConnectionFailedListener) Preconditions.m14372k(onConnectionFailedListener));
    }

    /* renamed from: g */
    private static BaseGmsClient.BaseConnectionCallbacks m14326g(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new C6421d(connectionCallbacks);
    }

    /* renamed from: h */
    private static BaseGmsClient.BaseOnConnectionFailedListener m14327h(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new C6422e(onConnectionFailedListener);
    }

    /* renamed from: i */
    private final Set<Scope> m14328i(Set<Scope> set) {
        Set<Scope> setM14330f = m14330f(set);
        Iterator<Scope> it = setM14330f.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setM14330f;
    }

    @KeepForSdk
    /* renamed from: e */
    protected final ClientSettings m14329e() {
        return this.f17747a;
    }

    @KeepForSdk
    /* renamed from: f */
    protected Set<Scope> m14330f(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.f17749c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Set<Scope> getScopes() {
        return this.f17748b;
    }

    @VisibleForTesting
    protected GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i2, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i2, m14326g(connectionCallbacks), m14327h(onConnectionFailedListener), clientSettings.m14295i());
        this.f17747a = clientSettings;
        this.f17749c = clientSettings.m14288b();
        this.f17748b = m14328i(clientSettings.m14291e());
    }
}
