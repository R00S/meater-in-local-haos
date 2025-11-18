package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class zabe implements zabs, zar {

    /* renamed from: f */
    private final Lock f17533f;

    /* renamed from: g */
    private final Condition f17534g;

    /* renamed from: h */
    private final Context f17535h;

    /* renamed from: i */
    private final GoogleApiAvailabilityLight f17536i;

    /* renamed from: j */
    private final HandlerC6402x f17537j;

    /* renamed from: k */
    final Map<Api.AnyClientKey<?>, Api.Client> f17538k;

    /* renamed from: m */
    private final ClientSettings f17540m;

    /* renamed from: n */
    private final Map<Api<?>, Boolean> f17541n;

    /* renamed from: o */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f17542o;

    /* renamed from: p */
    private volatile zabd f17543p;

    /* renamed from: r */
    int f17545r;

    /* renamed from: s */
    final zaaw f17546s;

    /* renamed from: t */
    final zabt f17547t;

    /* renamed from: l */
    final Map<Api.AnyClientKey<?>, ConnectionResult> f17539l = new HashMap();

    /* renamed from: q */
    private ConnectionResult f17544q = null;

    public zabe(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabt zabtVar) {
        this.f17535h = context;
        this.f17533f = lock;
        this.f17536i = googleApiAvailabilityLight;
        this.f17538k = map;
        this.f17540m = clientSettings;
        this.f17541n = map2;
        this.f17542o = abstractClientBuilder;
        this.f17546s = zaawVar;
        this.f17547t = zabtVar;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaqVar = arrayList.get(i2);
            i2++;
            zaqVar.m14220a(this);
        }
        this.f17537j = new HandlerC6402x(this, looper);
        this.f17534g = lock.newCondition();
        this.f17543p = new zaav(this);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: H */
    public final void mo13893H(int i2) {
        this.f17533f.lock();
        try {
            this.f17543p.mo14119H(i2);
        } finally {
            this.f17533f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    /* renamed from: P */
    public final void mo13894P(Bundle bundle) {
        this.f17533f.lock();
        try {
            this.f17543p.mo14120P(bundle);
        } finally {
            this.f17533f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: a */
    public final void mo14094a() {
        this.f17543p.mo14121a();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: b */
    public final boolean mo14095b(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: c */
    public final void mo14096c() {
        if (isConnected()) {
            ((zaah) this.f17543p).m14122c();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: d */
    public final void mo14097d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        if (this.f17543p.disconnect()) {
            this.f17539l.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f17543p);
        for (Api<?> api : this.f17541n.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.m13839b()).println(":");
            this.f17538k.get(api.m13838a()).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: e */
    public final ConnectionResult mo14098e() throws InterruptedException {
        mo14094a();
        while (m14176f()) {
            try {
                this.f17534g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f17198f;
        }
        ConnectionResult connectionResult = this.f17544q;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    /* renamed from: f */
    public final boolean m14176f() {
        return this.f17543p instanceof zaak;
    }

    /* renamed from: h */
    final void m14177h(AbstractC6400w abstractC6400w) {
        this.f17537j.sendMessage(this.f17537j.obtainMessage(1, abstractC6400w));
    }

    /* renamed from: i */
    final void m14178i() {
        this.f17533f.lock();
        try {
            this.f17543p = new zaak(this, this.f17540m, this.f17541n, this.f17536i, this.f17542o, this.f17533f, this.f17535h);
            this.f17543p.mo14123d();
            this.f17534g.signalAll();
        } finally {
            this.f17533f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnected() {
        return this.f17543p instanceof zaah;
    }

    /* renamed from: k */
    final void m14179k(RuntimeException runtimeException) {
        this.f17537j.sendMessage(this.f17537j.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.zar
    /* renamed from: k0 */
    public final void mo14012k0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        this.f17533f.lock();
        try {
            this.f17543p.mo14124k0(connectionResult, api, z);
        } finally {
            this.f17533f.unlock();
        }
    }

    /* renamed from: l */
    final void m14180l() {
        this.f17533f.lock();
        try {
            this.f17546s.m14168E();
            this.f17543p = new zaah(this);
            this.f17543p.mo14123d();
            this.f17534g.signalAll();
        } finally {
            this.f17533f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14100l0(T t) {
        t.m13944r();
        return (T) this.f17543p.mo14125l0(t);
    }

    /* renamed from: m */
    final void m14181m(ConnectionResult connectionResult) {
        this.f17533f.lock();
        try {
            this.f17544q = connectionResult;
            this.f17543p = new zaav(this);
            this.f17543p.mo14123d();
            this.f17534g.signalAll();
        } finally {
            this.f17533f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14101m0(T t) {
        t.m13944r();
        return (T) this.f17543p.mo14126m0(t);
    }
}
