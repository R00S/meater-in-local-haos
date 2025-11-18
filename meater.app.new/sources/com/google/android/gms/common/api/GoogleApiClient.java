package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p024c.p041e.C0867a;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GoogleApiClient {

    /* renamed from: a */
    private static final Set<GoogleApiClient> f17263a = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a */
        private Account f17264a;

        /* renamed from: d */
        private int f17267d;

        /* renamed from: e */
        private View f17268e;

        /* renamed from: f */
        private String f17269f;

        /* renamed from: g */
        private String f17270g;

        /* renamed from: j */
        private final Context f17273j;

        /* renamed from: l */
        private LifecycleActivity f17275l;

        /* renamed from: n */
        private OnConnectionFailedListener f17277n;

        /* renamed from: o */
        private Looper f17278o;

        /* renamed from: b */
        private final Set<Scope> f17265b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f17266c = new HashSet();

        /* renamed from: h */
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> f17271h = new C0867a();

        /* renamed from: i */
        private boolean f17272i = false;

        /* renamed from: k */
        private final Map<Api<?>, Api.ApiOptions> f17274k = new C0867a();

        /* renamed from: m */
        private int f17276m = -1;

        /* renamed from: p */
        private GoogleApiAvailability f17279p = GoogleApiAvailability.m13803q();

        /* renamed from: q */
        private Api.AbstractClientBuilder<? extends zad, SignInOptions> f17280q = zaa.f29490c;

        /* renamed from: r */
        private final ArrayList<ConnectionCallbacks> f17281r = new ArrayList<>();

        /* renamed from: s */
        private final ArrayList<OnConnectionFailedListener> f17282s = new ArrayList<>();

        /* renamed from: t */
        private boolean f17283t = false;

        @KeepForSdk
        public Builder(Context context) {
            this.f17273j = context;
            this.f17278o = context.getMainLooper();
            this.f17269f = context.getPackageName();
            this.f17270g = context.getClass().getName();
        }

        /* renamed from: a */
        public final Builder m13886a(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.m14373l(api, "Api must not be null");
            this.f17274k.put(api, null);
            List<Scope> listMo13613a = api.m13840c().mo13613a(null);
            this.f17266c.addAll(listMo13613a);
            this.f17265b.addAll(listMo13613a);
            return this;
        }

        /* renamed from: b */
        public final <O extends Api.ApiOptions.HasOptions> Builder m13887b(Api<O> api, O o) {
            Preconditions.m14373l(api, "Api must not be null");
            Preconditions.m14373l(o, "Null options are not permitted for this Api");
            this.f17274k.put(api, o);
            List<Scope> listMo13613a = api.m13840c().mo13613a(o);
            this.f17266c.addAll(listMo13613a);
            this.f17265b.addAll(listMo13613a);
            return this;
        }

        /* renamed from: c */
        public final Builder m13888c(ConnectionCallbacks connectionCallbacks) {
            Preconditions.m14373l(connectionCallbacks, "Listener must not be null");
            this.f17281r.add(connectionCallbacks);
            return this;
        }

        /* renamed from: d */
        public final Builder m13889d(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.m14373l(onConnectionFailedListener, "Listener must not be null");
            this.f17282s.add(onConnectionFailedListener);
            return this;
        }

        /* renamed from: e */
        public final GoogleApiClient m13890e() {
            Preconditions.m14363b(!this.f17274k.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsM13891f = m13891f();
            Api<?> api = null;
            Map<Api<?>, ClientSettings.OptionalApiSettings> mapM14294h = clientSettingsM13891f.m14294h();
            C0867a c0867a = new C0867a();
            C0867a c0867a2 = new C0867a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Api<?> api2 : this.f17274k.keySet()) {
                Api.ApiOptions apiOptions = this.f17274k.get(api2);
                boolean z2 = mapM14294h.get(api2) != null;
                c0867a.put(api2, Boolean.valueOf(z2));
                zaq zaqVar = new zaq(api2, z2);
                arrayList.add(zaqVar);
                Api.AbstractClientBuilder<?, O> abstractClientBuilderM13841d = api2.m13841d();
                Api.Client clientMo13600c = abstractClientBuilderM13841d.mo13600c(this.f17273j, this.f17278o, clientSettingsM13891f, apiOptions, zaqVar, zaqVar);
                c0867a2.put(api2.m13838a(), clientMo13600c);
                if (abstractClientBuilderM13841d.m13843b() == 1) {
                    z = apiOptions != null;
                }
                if (clientMo13600c.providesSignIn()) {
                    if (api != null) {
                        String strM13839b = api2.m13839b();
                        String strM13839b2 = api.m13839b();
                        StringBuilder sb = new StringBuilder(String.valueOf(strM13839b).length() + 21 + String.valueOf(strM13839b2).length());
                        sb.append(strM13839b);
                        sb.append(" cannot be used with ");
                        sb.append(strM13839b2);
                        throw new IllegalStateException(sb.toString());
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    String strM13839b3 = api.m13839b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strM13839b3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(strM13839b3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                Preconditions.m14377p(this.f17264a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.m13839b());
                Preconditions.m14377p(this.f17265b.equals(this.f17266c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.m13839b());
            }
            zaaw zaawVar = new zaaw(this.f17273j, new ReentrantLock(), this.f17278o, clientSettingsM13891f, this.f17279p, this.f17280q, c0867a, this.f17281r, this.f17282s, c0867a2, this.f17276m, zaaw.m14166y(c0867a2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.f17263a) {
                GoogleApiClient.f17263a.add(zaawVar);
            }
            if (this.f17276m >= 0) {
                zaj.m14209p(this.f17275l).m14212r(this.f17276m, zaawVar, this.f17277n);
            }
            return zaawVar;
        }

        @VisibleForTesting
        @KeepForSdk
        /* renamed from: f */
        public final ClientSettings m13891f() {
            SignInOptions signInOptions = SignInOptions.f29467f;
            Map<Api<?>, Api.ApiOptions> map = this.f17274k;
            Api<SignInOptions> api = zaa.f29494g;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.f17274k.get(api);
            }
            return new ClientSettings(this.f17264a, this.f17265b, this.f17271h, this.f17267d, this.f17268e, this.f17269f, this.f17270g, signInOptions, false);
        }

        /* renamed from: g */
        public final Builder m13892g(Handler handler) {
            Preconditions.m14373l(handler, "Handler must not be null");
            this.f17278o = handler.getLooper();
            return this;
        }
    }

    public interface ConnectionCallbacks {
        /* renamed from: H */
        void mo13893H(int i2);

        /* renamed from: P */
        void mo13894P(Bundle bundle);
    }

    public interface OnConnectionFailedListener {
        /* renamed from: E0 */
        void mo13895E0(ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* renamed from: l */
    public static Set<GoogleApiClient> m13866l() {
        Set<GoogleApiClient> set = f17263a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: d */
    public abstract ConnectionResult mo13868d();

    /* renamed from: e */
    public abstract PendingResult<Status> mo13869e();

    /* renamed from: f */
    public abstract void mo13870f();

    /* renamed from: g */
    public void mo13871g(int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract void mo13872h();

    /* renamed from: i */
    public abstract void mo13873i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @KeepForSdk
    /* renamed from: j */
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo13874j(T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: k */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo13875k(T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: m */
    public <C extends Api.Client> C mo13876m(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: n */
    public Context mo13877n() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: o */
    public Looper mo13878o() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public abstract boolean mo13879p();

    @KeepForSdk
    /* renamed from: q */
    public boolean mo13880q(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: r */
    public void mo13881r() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public abstract void mo13882s();

    /* renamed from: t */
    public abstract void mo13883t(OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: u */
    public abstract void mo13884u(OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: v */
    public void mo13885v(zacm zacmVar) {
        throw new UnsupportedOperationException();
    }
}
