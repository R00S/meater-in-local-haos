package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class zaak implements zabd {

    /* renamed from: a */
    private final zabe f17485a;

    /* renamed from: b */
    private final Lock f17486b;

    /* renamed from: c */
    private final Context f17487c;

    /* renamed from: d */
    private final GoogleApiAvailabilityLight f17488d;

    /* renamed from: e */
    private ConnectionResult f17489e;

    /* renamed from: f */
    private int f17490f;

    /* renamed from: h */
    private int f17492h;

    /* renamed from: k */
    private zad f17495k;

    /* renamed from: l */
    private boolean f17496l;

    /* renamed from: m */
    private boolean f17497m;

    /* renamed from: n */
    private boolean f17498n;

    /* renamed from: o */
    private IAccountAccessor f17499o;

    /* renamed from: p */
    private boolean f17500p;

    /* renamed from: q */
    private boolean f17501q;

    /* renamed from: r */
    private final ClientSettings f17502r;

    /* renamed from: s */
    private final Map<Api<?>, Boolean> f17503s;

    /* renamed from: t */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f17504t;

    /* renamed from: g */
    private int f17491g = 0;

    /* renamed from: i */
    private final Bundle f17493i = new Bundle();

    /* renamed from: j */
    private final Set<Api.AnyClientKey> f17494j = new HashSet();

    /* renamed from: u */
    private ArrayList<Future<?>> f17505u = new ArrayList<>();

    public zaak(zabe zabeVar, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f17485a = zabeVar;
        this.f17502r = clientSettings;
        this.f17503s = map;
        this.f17488d = googleApiAvailabilityLight;
        this.f17504t = abstractClientBuilder;
        this.f17486b = lock;
        this.f17487c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m14137g(com.google.android.gms.signin.internal.zaj zajVar) {
        if (m14150t(0)) {
            ConnectionResult connectionResultM23625y = zajVar.m23625y();
            if (!connectionResultM23625y.m13795e0()) {
                if (!m14153w(connectionResultM23625y)) {
                    m14154x(connectionResultM23625y);
                    return;
                } else {
                    m14142l();
                    m14140j();
                    return;
                }
            }
            ResolveAccountResponse resolveAccountResponseM23626z = zajVar.m23626z();
            ConnectionResult connectionResultM14383z = resolveAccountResponseM23626z.m14383z();
            if (connectionResultM14383z.m13795e0()) {
                this.f17498n = true;
                this.f17499o = resolveAccountResponseM23626z.m14382y();
                this.f17500p = resolveAccountResponseM23626z.m14380W();
                this.f17501q = resolveAccountResponseM23626z.m14381Y();
                m14140j();
                return;
            }
            String strValueOf = String.valueOf(connectionResultM14383z);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(strValueOf);
            Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
            m14154x(connectionResultM14383z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final boolean m14139i() {
        int i2 = this.f17492h - 1;
        this.f17492h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GoogleApiClientConnecting", this.f17485a.f17546s.m14170G());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m14154x(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f17489e;
        if (connectionResult == null) {
            return true;
        }
        this.f17485a.f17545r = this.f17490f;
        m14154x(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m14140j() {
        if (this.f17492h != 0) {
            return;
        }
        if (!this.f17497m || this.f17498n) {
            ArrayList arrayList = new ArrayList();
            this.f17491g = 1;
            this.f17492h = this.f17485a.f17538k.size();
            for (Api.AnyClientKey<?> anyClientKey : this.f17485a.f17538k.keySet()) {
                if (!this.f17485a.f17539l.containsKey(anyClientKey)) {
                    arrayList.add(this.f17485a.f17538k.get(anyClientKey));
                } else if (m14139i()) {
                    m14141k();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f17505u.add(zabh.m14182a().submit(new C6378l(this, arrayList)));
        }
    }

    /* renamed from: k */
    private final void m14141k() {
        this.f17485a.m14180l();
        zabh.m14182a().execute(new RunnableC6368g(this));
        zad zadVar = this.f17495k;
        if (zadVar != null) {
            if (this.f17500p) {
                zadVar.mo23615b(this.f17499o, this.f17501q);
            }
            m14147q(false);
        }
        Iterator<Api.AnyClientKey<?>> it = this.f17485a.f17539l.keySet().iterator();
        while (it.hasNext()) {
            this.f17485a.f17538k.get(it.next()).disconnect();
        }
        this.f17485a.f17547t.mo14103b(this.f17493i.isEmpty() ? null : this.f17493i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m14142l() {
        this.f17497m = false;
        this.f17485a.f17546s.f17522q = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.f17494j) {
            if (!this.f17485a.f17539l.containsKey(anyClientKey)) {
                this.f17485a.f17539l.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: m */
    private final void m14143m() {
        ArrayList<Future<?>> arrayList = this.f17505u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.f17505u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final Set<Scope> m14144n() {
        if (this.f17502r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f17502r.m14297k());
        Map<Api<?>, ClientSettings.OptionalApiSettings> mapM14294h = this.f17502r.m14294h();
        for (Api<?> api : mapM14294h.keySet()) {
            if (!this.f17485a.f17539l.containsKey(api.m13838a())) {
                hashSet.addAll(mapM14294h.get(api).f17721a);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14146p(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.m13840c()
            int r0 = r0.m13843b()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L24
            boolean r7 = r5.m13794Y()
            if (r7 == 0) goto L14
        L12:
            r7 = 1
            goto L22
        L14:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.f17488d
            int r3 = r5.m13797y()
            android.content.Intent r7 = r7.m13826c(r3)
            if (r7 == 0) goto L21
            goto L12
        L21:
            r7 = 0
        L22:
            if (r7 == 0) goto L2d
        L24:
            com.google.android.gms.common.ConnectionResult r7 = r4.f17489e
            if (r7 == 0) goto L2c
            int r7 = r4.f17490f
            if (r0 >= r7) goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L33
            r4.f17489e = r5
            r4.f17490f = r0
        L33:
            com.google.android.gms.common.api.internal.zabe r7 = r4.f17485a
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f17539l
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.m13838a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaak.m14146p(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* renamed from: q */
    private final void m14147q(boolean z) {
        zad zadVar = this.f17495k;
        if (zadVar != null) {
            if (zadVar.isConnected() && z) {
                this.f17495k.mo23616c();
            }
            this.f17495k.disconnect();
            if (this.f17502r.m14299m()) {
                this.f17495k = null;
            }
            this.f17499o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final boolean m14150t(int i2) {
        if (this.f17491g == i2) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f17485a.f17546s.m14170G());
        String strValueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(strValueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i3 = this.f17492h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String strM14152v = m14152v(this.f17491g);
        String strM14152v2 = m14152v(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strM14152v).length() + 70 + String.valueOf(strM14152v2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(strM14152v);
        sb3.append(" but received callback for step ");
        sb3.append(strM14152v2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m14154x(new ConnectionResult(8, null));
        return false;
    }

    /* renamed from: v */
    private static String m14152v(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final boolean m14153w(ConnectionResult connectionResult) {
        return this.f17496l && !connectionResult.m13794Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m14154x(ConnectionResult connectionResult) {
        m14143m();
        m14147q(!connectionResult.m13794Y());
        this.f17485a.m14181m(connectionResult);
        this.f17485a.f17547t.mo14102a(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: H */
    public final void mo14119H(int i2) {
        m14154x(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: P */
    public final void mo14120P(Bundle bundle) {
        if (m14150t(1)) {
            if (bundle != null) {
                this.f17493i.putAll(bundle);
            }
            if (m14139i()) {
                m14141k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: a */
    public final void mo14121a() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: d */
    public final void mo14123d() {
        this.f17485a.f17539l.clear();
        this.f17497m = false;
        RunnableC6368g runnableC6368g = null;
        this.f17489e = null;
        this.f17491g = 0;
        this.f17496l = true;
        this.f17498n = false;
        this.f17500p = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (Api<?> api : this.f17503s.keySet()) {
            Api.Client client = this.f17485a.f17538k.get(api.m13838a());
            z |= api.m13840c().m13843b() == 1;
            boolean zBooleanValue = this.f17503s.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.f17497m = true;
                if (zBooleanValue) {
                    this.f17494j.add(api.m13838a());
                } else {
                    this.f17496l = false;
                }
            }
            map.put(client, new C6370h(this, api, zBooleanValue));
        }
        if (z) {
            this.f17497m = false;
        }
        if (this.f17497m) {
            this.f17502r.m14300n(Integer.valueOf(System.identityHashCode(this.f17485a.f17546s)));
            C6384o c6384o = new C6384o(this, runnableC6368g);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f17504t;
            Context context = this.f17487c;
            Looper looperMo13878o = this.f17485a.f17546s.mo13878o();
            ClientSettings clientSettings = this.f17502r;
            this.f17495k = (zad) abstractClientBuilder.mo13600c(context, looperMo13878o, clientSettings, clientSettings.m14298l(), c6384o, c6384o);
        }
        this.f17492h = this.f17485a.f17538k.size();
        this.f17505u.add(zabh.m14182a().submit(new C6372i(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        m14143m();
        m14147q(true);
        this.f17485a.m14181m(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: k0 */
    public final void mo14124k0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (m14150t(1)) {
            m14146p(connectionResult, api, z);
            if (m14139i()) {
                m14141k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14125l0(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14126m0(T t) {
        this.f17485a.f17546s.f17514i.add(t);
        return t;
    }
}
