package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Api<O extends ApiOptions> {

    /* renamed from: a */
    private final AbstractClientBuilder<?, O> f17236a;

    /* renamed from: b */
    private final zaa<?, O> f17237b;

    /* renamed from: c */
    private final ClientKey<?> f17238c;

    /* renamed from: d */
    private final zab<?> f17239d;

    /* renamed from: e */
    private final String f17240e;

    @VisibleForTesting
    @KeepForSdk
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @KeepForSdk
        /* renamed from: c */
        public abstract T mo13600c(Context context, Looper looper, ClientSettings clientSettings, O o, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener);
    }

    @KeepForSdk
    public interface AnyClient {
    }

    @KeepForSdk
    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            /* renamed from: x */
            GoogleSignInAccount m13842x();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @KeepForSdk
        /* renamed from: a */
        public List<Scope> mo13613a(O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        /* renamed from: b */
        public int m13843b() {
            return Integer.MAX_VALUE;
        }
    }

    @KeepForSdk
    public interface Client extends AnyClient {
        @KeepForSdk
        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        void disconnect();

        @KeepForSdk
        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        @KeepForSdk
        Feature[] getAvailableFeatures();

        @KeepForSdk
        String getEndpointPackageName();

        @KeepForSdk
        int getMinApkVersion();

        @KeepForSdk
        void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set);

        @KeepForSdk
        IBinder getServiceBrokerBinder();

        @KeepForSdk
        Intent getSignInIntent();

        @KeepForSdk
        boolean isConnected();

        @KeepForSdk
        boolean isConnecting();

        @KeepForSdk
        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        boolean providesSignIn();

        @KeepForSdk
        boolean requiresGooglePlayServices();

        @KeepForSdk
        boolean requiresSignIn();
    }

    @VisibleForTesting
    @KeepForSdk
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public interface SimpleClient<T extends IInterface> extends AnyClient {
        T createServiceInterface(IBinder iBinder);

        String getServiceDescriptor();

        String getStartServiceAction();
    }

    @VisibleForTesting
    public static abstract class zaa<T extends SimpleClient, O> extends BaseClientBuilder<T, O> {
    }

    @VisibleForTesting
    public static final class zab<C extends SimpleClient> extends AnyClientKey<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends Client> Api(String str, AbstractClientBuilder<C, O> abstractClientBuilder, ClientKey<C> clientKey) {
        Preconditions.m14373l(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.m14373l(clientKey, "Cannot construct an Api with a null ClientKey");
        this.f17240e = str;
        this.f17236a = abstractClientBuilder;
        this.f17237b = null;
        this.f17238c = clientKey;
        this.f17239d = null;
    }

    /* renamed from: a */
    public final AnyClientKey<?> m13838a() {
        ClientKey<?> clientKey = this.f17238c;
        if (clientKey != null) {
            return clientKey;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String m13839b() {
        return this.f17240e;
    }

    /* renamed from: c */
    public final BaseClientBuilder<?, O> m13840c() {
        return this.f17236a;
    }

    /* renamed from: d */
    public final AbstractClientBuilder<?, O> m13841d() {
        Preconditions.m14376o(this.f17236a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f17236a;
    }
}
