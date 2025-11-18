package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p024c.p041e.C0867a;

/* loaded from: classes2.dex */
public final class zax implements zabs {

    /* renamed from: h */
    private final Map<Api<?>, Boolean> f17613h;

    /* renamed from: i */
    private final GoogleApiManager f17614i;

    /* renamed from: j */
    private final zaaw f17615j;

    /* renamed from: k */
    private final Lock f17616k;

    /* renamed from: l */
    private final Looper f17617l;

    /* renamed from: m */
    private final GoogleApiAvailabilityLight f17618m;

    /* renamed from: n */
    private final Condition f17619n;

    /* renamed from: o */
    private final ClientSettings f17620o;

    /* renamed from: p */
    private final boolean f17621p;

    /* renamed from: q */
    private final boolean f17622q;

    /* renamed from: s */
    private boolean f17624s;

    /* renamed from: t */
    private Map<zai<?>, ConnectionResult> f17625t;

    /* renamed from: u */
    private Map<zai<?>, ConnectionResult> f17626u;

    /* renamed from: v */
    private C6356a f17627v;

    /* renamed from: w */
    private ConnectionResult f17628w;

    /* renamed from: f */
    private final Map<Api.AnyClientKey<?>, zaw<?>> f17611f = new HashMap();

    /* renamed from: g */
    private final Map<Api.AnyClientKey<?>, zaw<?>> f17612g = new HashMap();

    /* renamed from: r */
    private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f17623r = new LinkedList();

    public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zaaw zaawVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f17616k = lock;
        this.f17617l = looper;
        this.f17619n = lock.newCondition();
        this.f17618m = googleApiAvailabilityLight;
        this.f17615j = zaawVar;
        this.f17613h = map2;
        this.f17620o = clientSettings;
        this.f17621p = z;
        HashMap map3 = new HashMap();
        for (Api<?> api : map2.keySet()) {
            map3.put(api.m13838a(), api);
        }
        HashMap map4 = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaqVar = arrayList.get(i2);
            i2++;
            zaq zaqVar2 = zaqVar;
            map4.put(zaqVar2.f17604f, zaqVar2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api api2 = (Api) map3.get(entry.getKey());
            Api.Client value = entry.getValue();
            if (value.requiresGooglePlayServices()) {
                z4 = z6;
                if (this.f17613h.get(api2).booleanValue()) {
                    z3 = z7;
                    z2 = true;
                } else {
                    z2 = true;
                    z3 = true;
                }
            } else {
                z2 = z5;
                z3 = z7;
                z4 = false;
            }
            zaw<?> zawVar = new zaw<>(context, api2, looper, value, (zaq) map4.get(api2), clientSettings, abstractClientBuilder);
            this.f17611f.put(entry.getKey(), zawVar);
            if (value.requiresSignIn()) {
                this.f17612g.put(entry.getKey(), zawVar);
            }
            z5 = z2;
            z6 = z4;
            z7 = z3;
        }
        this.f17622q = (!z5 || z6 || z7) ? false : true;
        this.f17614i = GoogleApiManager.m13951n();
    }

    /* renamed from: h */
    private final ConnectionResult m14228h(Api.AnyClientKey<?> anyClientKey) {
        this.f17616k.lock();
        try {
            zaw<?> zawVar = this.f17611f.get(anyClientKey);
            Map<zai<?>, ConnectionResult> map = this.f17625t;
            if (map != null && zawVar != null) {
                return map.get(zawVar.m13861l());
            }
            this.f17616k.unlock();
            return null;
        } finally {
            this.f17616k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m14232l(zaw<?> zawVar, ConnectionResult connectionResult) {
        return !connectionResult.m13795e0() && !connectionResult.m13794Y() && this.f17613h.get(zawVar.m13855e()).booleanValue() && zawVar.m14221m().requiresGooglePlayServices() && this.f17618m.mo13814m(connectionResult.m13797y());
    }

    /* renamed from: n */
    static /* synthetic */ boolean m14234n(zax zaxVar, boolean z) {
        zaxVar.f17624s = false;
        return false;
    }

    /* renamed from: o */
    private final boolean m14235o() {
        this.f17616k.lock();
        try {
            if (this.f17624s && this.f17621p) {
                Iterator<Api.AnyClientKey<?>> it = this.f17612g.keySet().iterator();
                while (it.hasNext()) {
                    ConnectionResult connectionResultM14228h = m14228h(it.next());
                    if (connectionResultM14228h == null || !connectionResultM14228h.m13795e0()) {
                        return false;
                    }
                }
                this.f17616k.unlock();
                return true;
            }
            return false;
        } finally {
            this.f17616k.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m14236p() {
        if (this.f17620o == null) {
            this.f17615j.f17522q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f17620o.m14297k());
        Map<Api<?>, ClientSettings.OptionalApiSettings> mapM14294h = this.f17620o.m14294h();
        for (Api<?> api : mapM14294h.keySet()) {
            ConnectionResult connectionResultM14247f = m14247f(api);
            if (connectionResultM14247f != null && connectionResultM14247f.m13795e0()) {
                hashSet.addAll(mapM14294h.get(api).f17721a);
            }
        }
        this.f17615j.f17522q = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m14237q() {
        while (!this.f17623r.isEmpty()) {
            mo14100l0(this.f17623r.remove());
        }
        this.f17615j.mo14103b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final ConnectionResult m14238r() {
        int i2 = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i3 = 0;
        for (zaw<?> zawVar : this.f17611f.values()) {
            Api<?> apiM13855e = zawVar.m13855e();
            ConnectionResult connectionResult3 = this.f17625t.get(zawVar.m13861l());
            if (!connectionResult3.m13795e0() && (!this.f17613h.get(apiM13855e).booleanValue() || connectionResult3.m13794Y() || this.f17618m.mo13814m(connectionResult3.m13797y()))) {
                if (connectionResult3.m13797y() == 4 && this.f17621p) {
                    int iM13843b = apiM13855e.m13840c().m13843b();
                    if (connectionResult2 == null || i3 > iM13843b) {
                        connectionResult2 = connectionResult3;
                        i3 = iM13843b;
                    }
                } else {
                    int iM13843b2 = apiM13855e.m13840c().m13843b();
                    if (connectionResult == null || i2 > iM13843b2) {
                        connectionResult = connectionResult3;
                        i2 = iM13843b2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i2 <= i3) ? connectionResult : connectionResult2;
    }

    /* renamed from: t */
    private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean m14240t(T t) {
        Api.AnyClientKey<?> anyClientKeyM13931u = t.m13931u();
        ConnectionResult connectionResultM14228h = m14228h(anyClientKeyM13931u);
        if (connectionResultM14228h == null || connectionResultM14228h.m13797y() != 4) {
            return false;
        }
        t.m13934y(new Status(4, null, this.f17614i.m13964c(this.f17611f.get(anyClientKeyM13931u).m13861l(), System.identityHashCode(this.f17615j))));
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: a */
    public final void mo14094a() {
        this.f17616k.lock();
        try {
            if (this.f17624s) {
                return;
            }
            this.f17624s = true;
            this.f17625t = null;
            this.f17626u = null;
            this.f17627v = null;
            this.f17628w = null;
            this.f17614i.m13962A();
            this.f17614i.m13965e(this.f17611f.values()).mo23640c(new HandlerExecutor(this.f17617l), new C6401w0(this));
        } finally {
            this.f17616k.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: b */
    public final boolean mo14095b(SignInConnectionListener signInConnectionListener) {
        this.f17616k.lock();
        try {
            if (!this.f17624s || m14235o()) {
                this.f17616k.unlock();
                return false;
            }
            this.f17614i.m13962A();
            this.f17627v = new C6356a(this, signInConnectionListener);
            this.f17614i.m13965e(this.f17612g.values()).mo23640c(new HandlerExecutor(this.f17617l), this.f17627v);
            this.f17616k.unlock();
            return true;
        } catch (Throwable th) {
            this.f17616k.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: c */
    public final void mo14096c() {
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: d */
    public final void mo14097d() {
        this.f17616k.lock();
        try {
            this.f17614i.m13963a();
            C6356a c6356a = this.f17627v;
            if (c6356a != null) {
                c6356a.m14056b();
                this.f17627v = null;
            }
            if (this.f17626u == null) {
                this.f17626u = new C0867a(this.f17612g.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            Iterator<zaw<?>> it = this.f17612g.values().iterator();
            while (it.hasNext()) {
                this.f17626u.put(it.next().m13861l(), connectionResult);
            }
            Map<zai<?>, ConnectionResult> map = this.f17625t;
            if (map != null) {
                map.putAll(this.f17626u);
            }
        } finally {
            this.f17616k.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        this.f17616k.lock();
        try {
            this.f17624s = false;
            this.f17625t = null;
            this.f17626u = null;
            C6356a c6356a = this.f17627v;
            if (c6356a != null) {
                c6356a.m14056b();
                this.f17627v = null;
            }
            this.f17628w = null;
            while (!this.f17623r.isEmpty()) {
                BaseImplementation.ApiMethodImpl<?, ?> apiMethodImplRemove = this.f17623r.remove();
                apiMethodImplRemove.m13941n(null);
                apiMethodImplRemove.mo13846d();
            }
            this.f17619n.signalAll();
        } finally {
            this.f17616k.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: e */
    public final ConnectionResult mo14098e() throws InterruptedException {
        mo14094a();
        while (m14248g()) {
            try {
                this.f17619n.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f17198f;
        }
        ConnectionResult connectionResult = this.f17628w;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    /* renamed from: f */
    public final ConnectionResult m14247f(Api<?> api) {
        return m14228h(api.m13838a());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m14248g() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f17616k
            r0.lock()
            java.util.Map<com.google.android.gms.common.api.internal.zai<?>, com.google.android.gms.common.ConnectionResult> r0 = r2.f17625t     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lf
            boolean r0 = r2.f17624s     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.util.concurrent.locks.Lock r1 = r2.f17616k
            r1.unlock()
            return r0
        L16:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f17616k
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zax.m14248g():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // com.google.android.gms.common.api.internal.zabs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isConnected() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f17616k
            r0.lock()
            java.util.Map<com.google.android.gms.common.api.internal.zai<?>, com.google.android.gms.common.ConnectionResult> r0 = r2.f17625t     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lf
            com.google.android.gms.common.ConnectionResult r0 = r2.f17628w     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.util.concurrent.locks.Lock r1 = r2.f17616k
            r1.unlock()
            return r0
        L16:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f17616k
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zax.isConnected():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14100l0(T t) {
        Api.AnyClientKey<A> anyClientKeyM13931u = t.m13931u();
        if (this.f17621p && m14240t(t)) {
            return t;
        }
        this.f17615j.f17530y.m14204b(t);
        return (T) this.f17611f.get(anyClientKeyM13931u).m13854d(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14101m0(T t) {
        if (this.f17621p && m14240t(t)) {
            return t;
        }
        if (isConnected()) {
            this.f17615j.f17530y.m14204b(t);
            return (T) this.f17611f.get(t.m13931u()).m13853c(t);
        }
        this.f17623r.add(t);
        return t;
    }
}
