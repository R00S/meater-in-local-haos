package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zaaw extends GoogleApiClient implements zabt {

    /* renamed from: b */
    private final Lock f17507b;

    /* renamed from: c */
    private boolean f17508c;

    /* renamed from: d */
    private final GmsClientEventManager f17509d;

    /* renamed from: f */
    private final int f17511f;

    /* renamed from: g */
    private final Context f17512g;

    /* renamed from: h */
    private final Looper f17513h;

    /* renamed from: j */
    private volatile boolean f17515j;

    /* renamed from: k */
    private long f17516k;

    /* renamed from: l */
    private long f17517l;

    /* renamed from: m */
    private final HandlerC6396u f17518m;

    /* renamed from: n */
    private final GoogleApiAvailability f17519n;

    /* renamed from: o */
    @VisibleForTesting
    private zabq f17520o;

    /* renamed from: p */
    final Map<Api.AnyClientKey<?>, Api.Client> f17521p;

    /* renamed from: q */
    Set<Scope> f17522q;

    /* renamed from: r */
    private final ClientSettings f17523r;

    /* renamed from: s */
    private final Map<Api<?>, Boolean> f17524s;

    /* renamed from: t */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f17525t;

    /* renamed from: u */
    private final ListenerHolders f17526u;

    /* renamed from: v */
    private final ArrayList<zaq> f17527v;

    /* renamed from: w */
    private Integer f17528w;

    /* renamed from: x */
    Set<zacm> f17529x;

    /* renamed from: y */
    final zacp f17530y;

    /* renamed from: z */
    private final GmsClientEventManager.GmsClientEventState f17531z;

    /* renamed from: e */
    private zabs f17510e = null;

    /* renamed from: i */
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f17514i = new LinkedList();

    public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i2, int i3, ArrayList<zaq> arrayList, boolean z) {
        this.f17516k = ClientLibraryUtils.m14607c() ? 10000L : LocalNotificationSyncManager.TWO_MINUTES;
        this.f17517l = 5000L;
        this.f17522q = new HashSet();
        this.f17526u = new ListenerHolders();
        this.f17528w = null;
        this.f17529x = null;
        C6388q c6388q = new C6388q(this);
        this.f17531z = c6388q;
        this.f17512g = context;
        this.f17507b = lock;
        this.f17508c = false;
        this.f17509d = new GmsClientEventManager(looper, c6388q);
        this.f17513h = looper;
        this.f17518m = new HandlerC6396u(this, looper);
        this.f17519n = googleApiAvailability;
        this.f17511f = i2;
        if (i2 >= 0) {
            this.f17528w = Integer.valueOf(i3);
        }
        this.f17524s = map;
        this.f17521p = map2;
        this.f17527v = arrayList;
        this.f17530y = new zacp(map2);
        Iterator<GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.f17509d.m14336f(it.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f17509d.m14337g(it2.next());
        }
        this.f17523r = clientSettings;
        this.f17525t = abstractClientBuilder;
    }

    /* renamed from: C */
    private final void m14159C() {
        this.f17509d.m14332b();
        this.f17510e.mo14094a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m14160D() {
        this.f17507b.lock();
        try {
            if (m14168E()) {
                m14159C();
            }
        } finally {
            this.f17507b.unlock();
        }
    }

    /* renamed from: J */
    private final void m14163J(int i2) {
        Integer num = this.f17528w;
        if (num == null) {
            this.f17528w = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String strM14164K = m14164K(i2);
            String strM14164K2 = m14164K(this.f17528w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(strM14164K).length() + 51 + String.valueOf(strM14164K2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(strM14164K);
            sb.append(". Mode was already set to ");
            sb.append(strM14164K2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f17510e != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Api.Client client : this.f17521p.values()) {
            if (client.requiresSignIn()) {
                z = true;
            }
            if (client.providesSignIn()) {
                z2 = true;
            }
        }
        int iIntValue = this.f17528w.intValue();
        if (iIntValue == 1) {
            if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && z) {
            if (this.f17508c) {
                this.f17510e = new zax(this.f17512g, this.f17507b, this.f17513h, this.f17519n, this.f17521p, this.f17523r, this.f17524s, this.f17525t, this.f17527v, this, true);
                return;
            } else {
                this.f17510e = C6391r0.m14075h(this.f17512g, this, this.f17507b, this.f17513h, this.f17519n, this.f17521p, this.f17523r, this.f17524s, this.f17525t, this.f17527v);
                return;
            }
        }
        if (!this.f17508c || z2) {
            this.f17510e = new zabe(this.f17512g, this, this.f17507b, this.f17513h, this.f17519n, this.f17521p, this.f17523r, this.f17524s, this.f17525t, this.f17527v, this);
        } else {
            this.f17510e = new zax(this.f17512g, this.f17507b, this.f17513h, this.f17519n, this.f17521p, this.f17523r, this.f17524s, this.f17525t, this.f17527v, this, false);
        }
    }

    /* renamed from: K */
    private static String m14164K(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m14165x() {
        this.f17507b.lock();
        try {
            if (this.f17515j) {
                m14159C();
            }
        } finally {
            this.f17507b.unlock();
        }
    }

    /* renamed from: y */
    public static int m14166y(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client client : iterable) {
            if (client.requiresSignIn()) {
                z2 = true;
            }
            if (client.providesSignIn()) {
                z3 = true;
            }
        }
        if (z2) {
            return (z3 && z) ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m14167z(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.f17840d.mo14493a(googleApiClient).mo13899f(new C6394t(this, statusPendingResult, z, googleApiClient));
    }

    /* renamed from: E */
    final boolean m14168E() {
        if (!this.f17515j) {
            return false;
        }
        this.f17515j = false;
        this.f17518m.removeMessages(2);
        this.f17518m.removeMessages(1);
        zabq zabqVar = this.f17520o;
        if (zabqVar != null) {
            zabqVar.m14183a();
            this.f17520o = null;
        }
        return true;
    }

    /* renamed from: F */
    final boolean m14169F() {
        this.f17507b.lock();
        try {
            if (this.f17529x != null) {
                return !r0.isEmpty();
            }
            this.f17507b.unlock();
            return false;
        } finally {
            this.f17507b.unlock();
        }
    }

    /* renamed from: G */
    final String m14170G() {
        StringWriter stringWriter = new StringWriter();
        mo13873i(HttpUrl.FRAGMENT_ENCODE_SET, null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: a */
    public final void mo14102a(ConnectionResult connectionResult) {
        if (!this.f17519n.m13828k(this.f17512g, connectionResult.m13797y())) {
            m14168E();
        }
        if (this.f17515j) {
            return;
        }
        this.f17509d.m14333c(connectionResult);
        this.f17509d.m14331a();
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: b */
    public final void mo14103b(Bundle bundle) {
        while (!this.f17514i.isEmpty()) {
            mo13875k(this.f17514i.remove());
        }
        this.f17509d.m14334d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    /* renamed from: c */
    public final void mo14104c(int i2, boolean z) {
        if (i2 == 1 && !z && !this.f17515j) {
            this.f17515j = true;
            if (this.f17520o == null && !ClientLibraryUtils.m14607c()) {
                this.f17520o = this.f17519n.m13820v(this.f17512g.getApplicationContext(), new C6398v(this));
            }
            HandlerC6396u handlerC6396u = this.f17518m;
            handlerC6396u.sendMessageDelayed(handlerC6396u.obtainMessage(1), this.f17516k);
            HandlerC6396u handlerC6396u2 = this.f17518m;
            handlerC6396u2.sendMessageDelayed(handlerC6396u2.obtainMessage(2), this.f17517l);
        }
        this.f17530y.m14205c();
        this.f17509d.m14335e(i2);
        this.f17509d.m14331a();
        if (i2 == 2) {
            m14159C();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: d */
    public final ConnectionResult mo13868d() {
        boolean z = true;
        Preconditions.m14376o(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f17507b.lock();
        try {
            if (this.f17511f >= 0) {
                if (this.f17528w == null) {
                    z = false;
                }
                Preconditions.m14376o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f17528w;
                if (num == null) {
                    this.f17528w = Integer.valueOf(m14166y(this.f17521p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            m14163J(this.f17528w.intValue());
            this.f17509d.m14332b();
            return this.f17510e.mo14098e();
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: e */
    public final PendingResult<Status> mo13869e() {
        Preconditions.m14376o(mo13879p(), "GoogleApiClient is not connected yet.");
        Preconditions.m14376o(this.f17528w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.f17521p.containsKey(Common.f17837a)) {
            m14167z(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient googleApiClientM13890e = new GoogleApiClient.Builder(this.f17512g).m13886a(Common.f17839c).m13888c(new C6390r(this, atomicReference, statusPendingResult)).m13889d(new C6392s(this, statusPendingResult)).m13892g(this.f17518m).m13890e();
            atomicReference.set(googleApiClientM13890e);
            googleApiClientM13890e.mo13870f();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: f */
    public final void mo13870f() {
        this.f17507b.lock();
        try {
            if (this.f17511f >= 0) {
                Preconditions.m14376o(this.f17528w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f17528w;
                if (num == null) {
                    this.f17528w = Integer.valueOf(m14166y(this.f17521p.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            mo13871g(this.f17528w.intValue());
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: g */
    public final void mo13871g(int i2) {
        this.f17507b.lock();
        boolean z = true;
        if (i2 != 3 && i2 != 1 && i2 != 2) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            Preconditions.m14363b(z, sb.toString());
            m14163J(i2);
            m14159C();
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: h */
    public final void mo13872h() {
        this.f17507b.lock();
        try {
            this.f17530y.m14203a();
            zabs zabsVar = this.f17510e;
            if (zabsVar != null) {
                zabsVar.disconnect();
            }
            this.f17526u.m14046a();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.f17514i) {
                apiMethodImpl.m13941n(null);
                apiMethodImpl.mo13846d();
            }
            this.f17514i.clear();
            if (this.f17510e == null) {
                return;
            }
            m14168E();
            this.f17509d.m14331a();
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: i */
    public final void mo13873i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f17512g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f17515j);
        printWriter.append(" mWorkQueue.size()=").print(this.f17514i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f17530y.f17576c.size());
        zabs zabsVar = this.f17510e;
        if (zabsVar != null) {
            zabsVar.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: j */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo13874j(T t) {
        Preconditions.m14363b(t.m13931u() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean zContainsKey = this.f17521p.containsKey(t.m13931u());
        String strM13839b = t.m13930t() != null ? t.m13930t().m13839b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strM13839b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strM13839b);
        sb.append(" required for this call.");
        Preconditions.m14363b(zContainsKey, sb.toString());
        this.f17507b.lock();
        try {
            zabs zabsVar = this.f17510e;
            if (zabsVar != null) {
                return (T) zabsVar.mo14101m0(t);
            }
            this.f17514i.add(t);
            return t;
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: k */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo13875k(T t) {
        Preconditions.m14363b(t.m13931u() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean zContainsKey = this.f17521p.containsKey(t.m13931u());
        String strM13839b = t.m13930t() != null ? t.m13930t().m13839b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strM13839b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strM13839b);
        sb.append(" required for this call.");
        Preconditions.m14363b(zContainsKey, sb.toString());
        this.f17507b.lock();
        try {
            if (this.f17510e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.f17515j) {
                return (T) this.f17510e.mo14100l0(t);
            }
            this.f17514i.add(t);
            while (!this.f17514i.isEmpty()) {
                BaseImplementation.ApiMethodImpl<?, ?> apiMethodImplRemove = this.f17514i.remove();
                this.f17530y.m14204b(apiMethodImplRemove);
                apiMethodImplRemove.m13934y(Status.f17293i);
            }
            return t;
        } finally {
            this.f17507b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: m */
    public final <C extends Api.Client> C mo13876m(Api.AnyClientKey<C> anyClientKey) {
        C c2 = (C) this.f17521p.get(anyClientKey);
        Preconditions.m14373l(c2, "Appropriate Api was not requested.");
        return c2;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: n */
    public final Context mo13877n() {
        return this.f17512g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: o */
    public final Looper mo13878o() {
        return this.f17513h;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: p */
    public final boolean mo13879p() {
        zabs zabsVar = this.f17510e;
        return zabsVar != null && zabsVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: q */
    public final boolean mo13880q(SignInConnectionListener signInConnectionListener) {
        zabs zabsVar = this.f17510e;
        return zabsVar != null && zabsVar.mo14095b(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: r */
    public final void mo13881r() {
        zabs zabsVar = this.f17510e;
        if (zabsVar != null) {
            zabsVar.mo14097d();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: s */
    public final void mo13882s() {
        mo13872h();
        mo13870f();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: t */
    public final void mo13883t(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f17509d.m14337g(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: u */
    public final void mo13884u(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f17509d.m14338h(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: v */
    public final void mo13885v(zacm zacmVar) {
        this.f17507b.lock();
        try {
            Set<zacm> set = this.f17529x;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(zacmVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m14169F()) {
                this.f17510e.mo14096c();
            }
        } finally {
            this.f17507b.unlock();
        }
    }
}
