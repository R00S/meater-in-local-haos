package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p024c.p041e.C0867a;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* loaded from: classes2.dex */
final class C6391r0 implements zabs {

    /* renamed from: f */
    private final Context f17443f;

    /* renamed from: g */
    private final zaaw f17444g;

    /* renamed from: h */
    private final Looper f17445h;

    /* renamed from: i */
    private final zabe f17446i;

    /* renamed from: j */
    private final zabe f17447j;

    /* renamed from: k */
    private final Map<Api.AnyClientKey<?>, zabe> f17448k;

    /* renamed from: m */
    private final Api.Client f17450m;

    /* renamed from: n */
    private Bundle f17451n;

    /* renamed from: r */
    private final Lock f17455r;

    /* renamed from: l */
    private final Set<SignInConnectionListener> f17449l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: o */
    private ConnectionResult f17452o = null;

    /* renamed from: p */
    private ConnectionResult f17453p = null;

    /* renamed from: q */
    private boolean f17454q = false;

    /* renamed from: s */
    private int f17456s = 0;

    private C6391r0(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f17443f = context;
        this.f17444g = zaawVar;
        this.f17455r = lock;
        this.f17445h = looper;
        this.f17450m = client;
        this.f17446i = new zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new C6395t0(this, null));
        this.f17447j = new zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new C6397u0(this, null));
        C0867a c0867a = new C0867a();
        Iterator<Api.AnyClientKey<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            c0867a.put(it.next(), this.f17446i);
        }
        Iterator<Api.AnyClientKey<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c0867a.put(it2.next(), this.f17447j);
        }
        this.f17448k = Collections.unmodifiableMap(c0867a);
    }

    /* renamed from: A */
    private final boolean m14073A() {
        ConnectionResult connectionResult = this.f17453p;
        return connectionResult != null && connectionResult.m13797y() == 4;
    }

    /* renamed from: h */
    public static C6391r0 m14075h(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        C0867a c0867a = new C0867a();
        C0867a c0867a2 = new C0867a();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                c0867a.put(entry.getKey(), value);
            } else {
                c0867a2.put(entry.getKey(), value);
            }
        }
        Preconditions.m14376o(!c0867a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0867a c0867a3 = new C0867a();
        C0867a c0867a4 = new C0867a();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> anyClientKeyM13838a = api.m13838a();
            if (c0867a.containsKey(anyClientKeyM13838a)) {
                c0867a3.put(api, map2.get(api));
            } else {
                if (!c0867a2.containsKey(anyClientKeyM13838a)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c0867a4.put(api, map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaqVar = arrayList.get(i2);
            i2++;
            zaq zaqVar2 = zaqVar;
            if (c0867a3.containsKey(zaqVar2.f17604f)) {
                arrayList2.add(zaqVar2);
            } else {
                if (!c0867a4.containsKey(zaqVar2.f17604f)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zaqVar2);
            }
        }
        return new C6391r0(context, zaawVar, lock, looper, googleApiAvailabilityLight, c0867a, c0867a2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, c0867a3, c0867a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m14077j(int i2, boolean z) {
        this.f17444g.mo14104c(i2, z);
        this.f17453p = null;
        this.f17452o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m14078k(Bundle bundle) {
        Bundle bundle2 = this.f17451n;
        if (bundle2 == null) {
            this.f17451n = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: l */
    private final void m14079l(ConnectionResult connectionResult) {
        int i2 = this.f17456s;
        if (i2 == 1) {
            m14093z();
        } else if (i2 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f17444g.mo14102a(connectionResult);
            m14093z();
        }
        this.f17456s = 0;
    }

    /* renamed from: o */
    private final boolean m14082o(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Object objM13931u = apiMethodImpl.m13931u();
        Preconditions.m14363b(this.f17448k.containsKey(objM13931u), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f17448k.get(objM13931u).equals(this.f17447j);
    }

    /* renamed from: q */
    private final PendingIntent m14084q() {
        if (this.f17450m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f17443f, System.identityHashCode(this.f17444g), this.f17450m.getSignInIntent(), 134217728);
    }

    /* renamed from: t */
    private static boolean m14087t(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m13795e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m14092y() {
        ConnectionResult connectionResult;
        if (!m14087t(this.f17452o)) {
            if (this.f17452o != null && m14087t(this.f17453p)) {
                this.f17447j.disconnect();
                m14079l(this.f17452o);
                return;
            }
            ConnectionResult connectionResult2 = this.f17452o;
            if (connectionResult2 == null || (connectionResult = this.f17453p) == null) {
                return;
            }
            if (this.f17447j.f17545r < this.f17446i.f17545r) {
                connectionResult2 = connectionResult;
            }
            m14079l(connectionResult2);
            return;
        }
        if (m14087t(this.f17453p) || m14073A()) {
            int i2 = this.f17456s;
            if (i2 == 1) {
                m14093z();
            } else if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                this.f17444g.mo14103b(this.f17451n);
                m14093z();
            }
            this.f17456s = 0;
            return;
        }
        ConnectionResult connectionResult3 = this.f17453p;
        if (connectionResult3 != null) {
            if (this.f17456s == 1) {
                m14093z();
            } else {
                m14079l(connectionResult3);
                this.f17446i.disconnect();
            }
        }
    }

    /* renamed from: z */
    private final void m14093z() {
        Iterator<SignInConnectionListener> it = this.f17449l.iterator();
        while (it.hasNext()) {
            it.next().mo13725a();
        }
        this.f17449l.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: a */
    public final void mo14094a() {
        this.f17456s = 2;
        this.f17454q = false;
        this.f17453p = null;
        this.f17452o = null;
        this.f17446i.mo14094a();
        this.f17447j.mo14094a();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: b */
    public final boolean mo14095b(SignInConnectionListener signInConnectionListener) {
        this.f17455r.lock();
        try {
            if ((!m14099f() && !isConnected()) || this.f17447j.isConnected()) {
                this.f17455r.unlock();
                return false;
            }
            this.f17449l.add(signInConnectionListener);
            if (this.f17456s == 0) {
                this.f17456s = 1;
            }
            this.f17453p = null;
            this.f17447j.mo14094a();
            return true;
        } finally {
            this.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: c */
    public final void mo14096c() {
        this.f17446i.mo14096c();
        this.f17447j.mo14096c();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: d */
    public final void mo14097d() {
        this.f17455r.lock();
        try {
            boolean zM14099f = m14099f();
            this.f17447j.disconnect();
            this.f17453p = new ConnectionResult(4);
            if (zM14099f) {
                new zap(this.f17445h).post(new RunnableC6393s0(this));
            } else {
                m14093z();
            }
        } finally {
            this.f17455r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        this.f17453p = null;
        this.f17452o = null;
        this.f17456s = 0;
        this.f17446i.disconnect();
        this.f17447j.disconnect();
        m14093z();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f17447j.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f17446i.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: e */
    public final ConnectionResult mo14098e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final boolean m14099f() {
        this.f17455r.lock();
        try {
            return this.f17456s == 2;
        } finally {
            this.f17455r.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // com.google.android.gms.common.api.internal.zabs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isConnected() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f17455r
            r0.lock()
            com.google.android.gms.common.api.internal.zabe r0 = r2.f17446i     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.zabe r0 = r2.f17447j     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            boolean r0 = r2.m14073A()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.f17456s     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.f17455r
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.f17455r
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C6391r0.isConnected():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14100l0(T t) {
        if (!m14082o(t)) {
            return (T) this.f17446i.mo14100l0(t);
        }
        if (!m14073A()) {
            return (T) this.f17447j.mo14100l0(t);
        }
        t.m13934y(new Status(4, null, m14084q()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14101m0(T t) {
        if (!m14082o(t)) {
            return (T) this.f17446i.mo14101m0(t);
        }
        if (!m14073A()) {
            return (T) this.f17447j.mo14101m0(t);
        }
        t.m13934y(new Status(4, null, m14084q()));
        return t;
    }
}
