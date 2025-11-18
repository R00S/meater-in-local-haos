package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p024c.p041e.C0867a;
import p024c.p041e.C0868b;

@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiManager implements Handler.Callback {

    /* renamed from: f */
    public static final Status f17330f = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: g */
    private static final Status f17331g = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: h */
    private static final Object f17332h = new Object();

    /* renamed from: i */
    private static GoogleApiManager f17333i;

    /* renamed from: m */
    private final Context f17337m;

    /* renamed from: n */
    private final GoogleApiAvailability f17338n;

    /* renamed from: o */
    private final GoogleApiAvailabilityCache f17339o;

    /* renamed from: v */
    private final Handler f17346v;

    /* renamed from: j */
    private long f17334j = 5000;

    /* renamed from: k */
    private long f17335k = LocalNotificationSyncManager.TWO_MINUTES;

    /* renamed from: l */
    private long f17336l = 10000;

    /* renamed from: p */
    private final AtomicInteger f17340p = new AtomicInteger(1);

    /* renamed from: q */
    private final AtomicInteger f17341q = new AtomicInteger(0);

    /* renamed from: r */
    private final Map<zai<?>, zaa<?>> f17342r = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: s */
    private zaae f17343s = null;

    /* renamed from: t */
    private final Set<zai<?>> f17344t = new C0868b();

    /* renamed from: u */
    private final Set<zai<?>> f17345u = new C0868b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager$b */
    class C6355b implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {

        /* renamed from: a */
        private final Api.Client f17349a;

        /* renamed from: b */
        private final zai<?> f17350b;

        /* renamed from: c */
        private IAccountAccessor f17351c = null;

        /* renamed from: d */
        private Set<Scope> f17352d = null;

        /* renamed from: e */
        private boolean f17353e = false;

        public C6355b(Api.Client client, zai<?> zaiVar) {
            this.f17349a = client;
            this.f17350b = zaiVar;
        }

        /* renamed from: e */
        static /* synthetic */ boolean m13976e(C6355b c6355b, boolean z) {
            c6355b.f17353e = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public final void m13978g() {
            IAccountAccessor iAccountAccessor;
            if (!this.f17353e || (iAccountAccessor = this.f17351c) == null) {
                return;
            }
            this.f17349a.getRemoteService(iAccountAccessor, this.f17352d);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        /* renamed from: a */
        public final void mo13980a(ConnectionResult connectionResult) {
            GoogleApiManager.this.f17346v.post(new RunnableC6365e0(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.zach
        /* renamed from: b */
        public final void mo13981b(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo13982c(new ConnectionResult(4));
            } else {
                this.f17351c = iAccountAccessor;
                this.f17352d = set;
                m13978g();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zach
        /* renamed from: c */
        public final void mo13982c(ConnectionResult connectionResult) {
            ((zaa) GoogleApiManager.this.f17342r.get(this.f17350b)).m14004I(connectionResult);
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zar {

        /* renamed from: g */
        private final Api.Client f17356g;

        /* renamed from: h */
        private final Api.AnyClient f17357h;

        /* renamed from: i */
        private final zai<O> f17358i;

        /* renamed from: j */
        private final zaab f17359j;

        /* renamed from: m */
        private final int f17362m;

        /* renamed from: n */
        private final zace f17363n;

        /* renamed from: o */
        private boolean f17364o;

        /* renamed from: f */
        private final Queue<zab> f17355f = new LinkedList();

        /* renamed from: k */
        private final Set<zak> f17360k = new HashSet();

        /* renamed from: l */
        private final Map<ListenerHolder.ListenerKey<?>, zabw> f17361l = new HashMap();

        /* renamed from: p */
        private final List<C6354a> f17365p = new ArrayList();

        /* renamed from: q */
        private ConnectionResult f17366q = null;

        public zaa(GoogleApi<O> googleApi) {
            Api.Client clientMo13859i = googleApi.mo13859i(GoogleApiManager.this.f17346v.getLooper(), this);
            this.f17356g = clientMo13859i;
            if (clientMo13859i instanceof SimpleClientAdapter) {
                this.f17357h = ((SimpleClientAdapter) clientMo13859i).m14400j();
            } else {
                this.f17357h = clientMo13859i;
            }
            this.f17358i = googleApi.m13861l();
            this.f17359j = new zaab();
            this.f17362m = googleApi.m13857g();
            if (clientMo13859i.requiresSignIn()) {
                this.f17363n = googleApi.mo13860k(GoogleApiManager.this.f17337m, GoogleApiManager.this.f17346v);
            } else {
                this.f17363n = null;
            }
        }

        /* renamed from: C */
        private final void m13983C(zab zabVar) {
            zabVar.mo14173d(this.f17359j, m14008d());
            try {
                zabVar.mo14067c(this);
            } catch (DeadObjectException unused) {
                mo13893H(1);
                this.f17356g.disconnect();
            }
        }

        /* renamed from: D */
        private final boolean m13984D(boolean z) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            if (!this.f17356g.isConnected() || this.f17361l.size() != 0) {
                return false;
            }
            if (!this.f17359j.m14111e()) {
                this.f17356g.disconnect();
                return true;
            }
            if (z) {
                m14001y();
            }
            return false;
        }

        /* renamed from: J */
        private final boolean m13988J(ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.f17332h) {
                if (GoogleApiManager.this.f17343s == null || !GoogleApiManager.this.f17344t.contains(this.f17358i)) {
                    return false;
                }
                GoogleApiManager.this.f17343s.m14217m(connectionResult, this.f17362m);
                return true;
            }
        }

        /* renamed from: K */
        private final void m13989K(ConnectionResult connectionResult) {
            for (zak zakVar : this.f17360k) {
                String endpointPackageName = null;
                if (Objects.m14355a(connectionResult, ConnectionResult.f17198f)) {
                    endpointPackageName = this.f17356g.getEndpointPackageName();
                }
                zakVar.m14214b(this.f17358i, connectionResult, endpointPackageName);
            }
            this.f17360k.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        private final Feature m13990f(Feature[] featureArr) {
            if (featureArr != null && featureArr.length != 0) {
                Feature[] availableFeatures = this.f17356g.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                C0867a c0867a = new C0867a(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    c0867a.put(feature.m13800y(), Long.valueOf(feature.m13801z()));
                }
                for (Feature feature2 : featureArr) {
                    if (!c0867a.containsKey(feature2.m13800y()) || ((Long) c0867a.get(feature2.m13800y())).longValue() < feature2.m13801z()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final void m13992h(C6354a c6354a) {
            if (this.f17365p.contains(c6354a) && !this.f17364o) {
                if (this.f17356g.isConnected()) {
                    m13999s();
                } else {
                    m14005a();
                }
            }
        }

        /* renamed from: k */
        static /* synthetic */ boolean m13993k(zaa zaaVar, boolean z) {
            return zaaVar.m13984D(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m13995o(C6354a c6354a) {
            Feature[] featureArrMo14185g;
            if (this.f17365p.remove(c6354a)) {
                GoogleApiManager.this.f17346v.removeMessages(15, c6354a);
                GoogleApiManager.this.f17346v.removeMessages(16, c6354a);
                Feature feature = c6354a.f17348b;
                ArrayList arrayList = new ArrayList(this.f17355f.size());
                for (zab zabVar : this.f17355f) {
                    if ((zabVar instanceof zac) && (featureArrMo14185g = ((zac) zabVar).mo14185g(this)) != null && ArrayUtils.m14594b(featureArrMo14185g, feature)) {
                        arrayList.add(zabVar);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zab zabVar2 = (zab) obj;
                    this.f17355f.remove(zabVar2);
                    zabVar2.mo14068e(new UnsupportedApiCallException(feature));
                }
            }
        }

        /* renamed from: p */
        private final boolean m13996p(zab zabVar) {
            if (!(zabVar instanceof zac)) {
                m13983C(zabVar);
                return true;
            }
            zac zacVar = (zac) zabVar;
            Feature featureM13990f = m13990f(zacVar.mo14185g(this));
            if (featureM13990f == null) {
                m13983C(zabVar);
                return true;
            }
            if (!zacVar.mo14186h(this)) {
                zacVar.mo14068e(new UnsupportedApiCallException(featureM13990f));
                return false;
            }
            C6354a c6354a = new C6354a(this.f17358i, featureM13990f, null);
            int iIndexOf = this.f17365p.indexOf(c6354a);
            if (iIndexOf >= 0) {
                C6354a c6354a2 = this.f17365p.get(iIndexOf);
                GoogleApiManager.this.f17346v.removeMessages(15, c6354a2);
                GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 15, c6354a2), GoogleApiManager.this.f17334j);
                return false;
            }
            this.f17365p.add(c6354a);
            GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 15, c6354a), GoogleApiManager.this.f17334j);
            GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 16, c6354a), GoogleApiManager.this.f17335k);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m13988J(connectionResult)) {
                return false;
            }
            GoogleApiManager.this.m13972s(connectionResult, this.f17362m);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public final void m13997q() {
            m14017v();
            m13989K(ConnectionResult.f17198f);
            m14000x();
            Iterator<zabw> it = this.f17361l.values().iterator();
            while (it.hasNext()) {
                zabw next = it.next();
                if (m13990f(next.f17556a.m14049c()) != null) {
                    it.remove();
                } else {
                    try {
                        next.f17556a.m14050d(this.f17357h, new TaskCompletionSource<>());
                    } catch (DeadObjectException unused) {
                        mo13893H(1);
                        this.f17356g.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m13999s();
            m14001y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final void m13998r() {
            m14017v();
            this.f17364o = true;
            this.f17359j.m14113g();
            GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 9, this.f17358i), GoogleApiManager.this.f17334j);
            GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 11, this.f17358i), GoogleApiManager.this.f17335k);
            GoogleApiManager.this.f17339o.m14345a();
        }

        /* renamed from: s */
        private final void m13999s() {
            ArrayList arrayList = new ArrayList(this.f17355f);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zab zabVar = (zab) obj;
                if (!this.f17356g.isConnected()) {
                    return;
                }
                if (m13996p(zabVar)) {
                    this.f17355f.remove(zabVar);
                }
            }
        }

        /* renamed from: x */
        private final void m14000x() {
            if (this.f17364o) {
                GoogleApiManager.this.f17346v.removeMessages(11, this.f17358i);
                GoogleApiManager.this.f17346v.removeMessages(9, this.f17358i);
                this.f17364o = false;
            }
        }

        /* renamed from: y */
        private final void m14001y() {
            GoogleApiManager.this.f17346v.removeMessages(12, this.f17358i);
            GoogleApiManager.this.f17346v.sendMessageDelayed(GoogleApiManager.this.f17346v.obtainMessage(12, this.f17358i), GoogleApiManager.this.f17336l);
        }

        /* renamed from: A */
        final zad m14002A() {
            zace zaceVar = this.f17363n;
            if (zaceVar == null) {
                return null;
            }
            return zaceVar.m14192Y4();
        }

        /* renamed from: B */
        public final void m14003B(Status status) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            Iterator<zab> it = this.f17355f.iterator();
            while (it.hasNext()) {
                it.next().mo14066b(status);
            }
            this.f17355f.clear();
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
        /* renamed from: E0 */
        public final void mo13895E0(ConnectionResult connectionResult) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            zace zaceVar = this.f17363n;
            if (zaceVar != null) {
                zaceVar.m14193p5();
            }
            m14017v();
            GoogleApiManager.this.f17339o.m14345a();
            m13989K(connectionResult);
            if (connectionResult.m13797y() == 4) {
                m14003B(GoogleApiManager.f17331g);
                return;
            }
            if (this.f17355f.isEmpty()) {
                this.f17366q = connectionResult;
                return;
            }
            if (m13988J(connectionResult) || GoogleApiManager.this.m13972s(connectionResult, this.f17362m)) {
                return;
            }
            if (connectionResult.m13797y() == 18) {
                this.f17364o = true;
            }
            if (this.f17364o) {
                GoogleApiManager.this.f17346v.sendMessageDelayed(Message.obtain(GoogleApiManager.this.f17346v, 9, this.f17358i), GoogleApiManager.this.f17334j);
                return;
            }
            String strM14208c = this.f17358i.m14208c();
            StringBuilder sb = new StringBuilder(String.valueOf(strM14208c).length() + 38);
            sb.append("API: ");
            sb.append(strM14208c);
            sb.append(" is not available on this device.");
            m14003B(new Status(17, sb.toString()));
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
        /* renamed from: H */
        public final void mo13893H(int i2) {
            if (Looper.myLooper() == GoogleApiManager.this.f17346v.getLooper()) {
                m13998r();
            } else {
                GoogleApiManager.this.f17346v.post(new RunnableC6357a0(this));
            }
        }

        /* renamed from: I */
        public final void m14004I(ConnectionResult connectionResult) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            this.f17356g.disconnect();
            mo13895E0(connectionResult);
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
        /* renamed from: P */
        public final void mo13894P(Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.f17346v.getLooper()) {
                m13997q();
            } else {
                GoogleApiManager.this.f17346v.post(new RunnableC6406z(this));
            }
        }

        /* renamed from: a */
        public final void m14005a() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            if (this.f17356g.isConnected() || this.f17356g.isConnecting()) {
                return;
            }
            int iM14346b = GoogleApiManager.this.f17339o.m14346b(GoogleApiManager.this.f17337m, this.f17356g);
            if (iM14346b != 0) {
                mo13895E0(new ConnectionResult(iM14346b, null));
                return;
            }
            C6355b c6355b = GoogleApiManager.this.new C6355b(this.f17356g, this.f17358i);
            if (this.f17356g.requiresSignIn()) {
                this.f17363n.m14191S4(c6355b);
            }
            this.f17356g.connect(c6355b);
        }

        /* renamed from: b */
        public final int m14006b() {
            return this.f17362m;
        }

        /* renamed from: c */
        final boolean m14007c() {
            return this.f17356g.isConnected();
        }

        /* renamed from: d */
        public final boolean m14008d() {
            return this.f17356g.requiresSignIn();
        }

        /* renamed from: e */
        public final void m14009e() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            if (this.f17364o) {
                m14005a();
            }
        }

        /* renamed from: i */
        public final void m14010i(zab zabVar) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            if (this.f17356g.isConnected()) {
                if (m13996p(zabVar)) {
                    m14001y();
                    return;
                } else {
                    this.f17355f.add(zabVar);
                    return;
                }
            }
            this.f17355f.add(zabVar);
            ConnectionResult connectionResult = this.f17366q;
            if (connectionResult == null || !connectionResult.m13794Y()) {
                m14005a();
            } else {
                mo13895E0(this.f17366q);
            }
        }

        /* renamed from: j */
        public final void m14011j(zak zakVar) {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            this.f17360k.add(zakVar);
        }

        @Override // com.google.android.gms.common.api.internal.zar
        /* renamed from: k0 */
        public final void mo14012k0(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.f17346v.getLooper()) {
                mo13895E0(connectionResult);
            } else {
                GoogleApiManager.this.f17346v.post(new RunnableC6359b0(this, connectionResult));
            }
        }

        /* renamed from: l */
        public final Api.Client m14013l() {
            return this.f17356g;
        }

        /* renamed from: m */
        public final void m14014m() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            if (this.f17364o) {
                m14000x();
                m14003B(GoogleApiManager.this.f17338n.mo13812i(GoogleApiManager.this.f17337m) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f17356g.disconnect();
            }
        }

        /* renamed from: t */
        public final void m14015t() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            m14003B(GoogleApiManager.f17330f);
            this.f17359j.m14112f();
            for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f17361l.keySet().toArray(new ListenerHolder.ListenerKey[this.f17361l.size()])) {
                m14010i(new zah(listenerKey, new TaskCompletionSource()));
            }
            m13989K(new ConnectionResult(4));
            if (this.f17356g.isConnected()) {
                this.f17356g.onUserSignOut(new C6361c0(this));
            }
        }

        /* renamed from: u */
        public final Map<ListenerHolder.ListenerKey<?>, zabw> m14016u() {
            return this.f17361l;
        }

        /* renamed from: v */
        public final void m14017v() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            this.f17366q = null;
        }

        /* renamed from: w */
        public final ConnectionResult m14018w() {
            Preconditions.m14365d(GoogleApiManager.this.f17346v);
            return this.f17366q;
        }

        /* renamed from: z */
        public final boolean m14019z() {
            return m13984D(true);
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f17337m = context;
        zap zapVar = new zap(looper, this);
        this.f17346v = zapVar;
        this.f17338n = googleApiAvailability;
        this.f17339o = new GoogleApiAvailabilityCache(googleApiAvailability);
        zapVar.sendMessage(zapVar.obtainMessage(6));
    }

    @KeepForSdk
    /* renamed from: b */
    public static void m13946b() {
        synchronized (f17332h) {
            GoogleApiManager googleApiManager = f17333i;
            if (googleApiManager != null) {
                googleApiManager.f17341q.incrementAndGet();
                Handler handler = googleApiManager.f17346v;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: k */
    public static GoogleApiManager m13949k(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f17332h) {
            if (f17333i == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f17333i = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.m13803q());
            }
            googleApiManager = f17333i;
        }
        return googleApiManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    private final void m13950l(GoogleApi<?> googleApi) {
        Object objM13861l = googleApi.m13861l();
        zaa<?> zaaVar = this.f17342r.get(objM13861l);
        if (zaaVar == null) {
            zaaVar = new zaa<>(googleApi);
            this.f17342r.put(objM13861l, zaaVar);
        }
        if (zaaVar.m14008d()) {
            this.f17345u.add(objM13861l);
        }
        zaaVar.m14005a();
    }

    /* renamed from: n */
    public static GoogleApiManager m13951n() {
        GoogleApiManager googleApiManager;
        synchronized (f17332h) {
            Preconditions.m14373l(f17333i, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = f17333i;
        }
        return googleApiManager;
    }

    /* renamed from: A */
    public final void m13962A() {
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: a */
    final void m13963a() {
        this.f17341q.incrementAndGet();
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: c */
    final PendingIntent m13964c(zai<?> zaiVar, int i2) {
        zad zadVarM14002A;
        zaa<?> zaaVar = this.f17342r.get(zaiVar);
        if (zaaVar == null || (zadVarM14002A = zaaVar.m14002A()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f17337m, i2, zadVarM14002A.getSignInIntent(), 134217728);
    }

    /* renamed from: e */
    public final Task<Map<zai<?>, String>> m13965e(Iterable<? extends GoogleApi<?>> iterable) {
        zak zakVar = new zak(iterable);
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(2, zakVar));
        return zakVar.m14213a();
    }

    /* renamed from: f */
    public final void m13966f(ConnectionResult connectionResult, int i2) {
        if (m13972s(connectionResult, i2)) {
            return;
        }
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
    }

    /* renamed from: g */
    public final void m13967g(GoogleApi<?> googleApi) {
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* renamed from: h */
    public final <O extends Api.ApiOptions> void m13968h(GoogleApi<O> googleApi, int i2, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i2, apiMethodImpl);
        Handler handler = this.f17346v;
        handler.sendMessage(handler.obtainMessage(4, new zabv(zaeVar, this.f17341q.get(), googleApi)));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        long j2 = LocalNotificationSyncManager.FIVE_MINUTES;
        zaa<?> zaaVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f17336l = j2;
                this.f17346v.removeMessages(12);
                for (zai<?> zaiVar : this.f17342r.keySet()) {
                    Handler handler = this.f17346v;
                    handler.sendMessageDelayed(handler.obtainMessage(12, zaiVar), this.f17336l);
                }
                return true;
            case 2:
                zak zakVar = (zak) message.obj;
                Iterator<zai<?>> it = zakVar.m14215c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zai<?> next = it.next();
                        zaa<?> zaaVar2 = this.f17342r.get(next);
                        if (zaaVar2 == null) {
                            zakVar.m14214b(next, new ConnectionResult(13), null);
                        } else if (zaaVar2.m14007c()) {
                            zakVar.m14214b(next, ConnectionResult.f17198f, zaaVar2.m14013l().getEndpointPackageName());
                        } else if (zaaVar2.m14018w() != null) {
                            zakVar.m14214b(next, zaaVar2.m14018w(), null);
                        } else {
                            zaaVar2.m14011j(zakVar);
                            zaaVar2.m14005a();
                        }
                    }
                }
                return true;
            case 3:
                for (zaa<?> zaaVar3 : this.f17342r.values()) {
                    zaaVar3.m14017v();
                    zaaVar3.m14005a();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zabv zabvVar = (zabv) message.obj;
                zaa<?> zaaVar4 = this.f17342r.get(zabvVar.f17555c.m13861l());
                if (zaaVar4 == null) {
                    m13950l(zabvVar.f17555c);
                    zaaVar4 = this.f17342r.get(zabvVar.f17555c.m13861l());
                }
                if (!zaaVar4.m14008d() || this.f17341q.get() == zabvVar.f17554b) {
                    zaaVar4.m14010i(zabvVar.f17553a);
                } else {
                    zabvVar.f17553a.mo14066b(f17330f);
                    zaaVar4.m14015t();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.f17342r.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa<?> next2 = it2.next();
                        if (next2.m14006b() == i3) {
                            zaaVar = next2;
                        }
                    }
                }
                if (zaaVar != null) {
                    String strMo13811g = this.f17338n.mo13811g(connectionResult.m13797y());
                    String strM13798z = connectionResult.m13798z();
                    StringBuilder sb = new StringBuilder(String.valueOf(strMo13811g).length() + 69 + String.valueOf(strM13798z).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(strMo13811g);
                    sb.append(": ");
                    sb.append(strM13798z);
                    zaaVar.m14003B(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (PlatformVersion.m14637a() && (this.f17337m.getApplicationContext() instanceof Application)) {
                    BackgroundDetector.m13922c((Application) this.f17337m.getApplicationContext());
                    BackgroundDetector.m13921b().m13924a(new C6404y(this));
                    if (!BackgroundDetector.m13921b().m13926e(true)) {
                        this.f17336l = LocalNotificationSyncManager.FIVE_MINUTES;
                    }
                }
                return true;
            case 7:
                m13950l((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.f17342r.containsKey(message.obj)) {
                    this.f17342r.get(message.obj).m14009e();
                }
                return true;
            case 10:
                Iterator<zai<?>> it3 = this.f17345u.iterator();
                while (it3.hasNext()) {
                    this.f17342r.remove(it3.next()).m14015t();
                }
                this.f17345u.clear();
                return true;
            case 11:
                if (this.f17342r.containsKey(message.obj)) {
                    this.f17342r.get(message.obj).m14014m();
                }
                return true;
            case 12:
                if (this.f17342r.containsKey(message.obj)) {
                    this.f17342r.get(message.obj).m14019z();
                }
                return true;
            case 14:
                C6362d c6362d = (C6362d) message.obj;
                zai<?> zaiVarM14059b = c6362d.m14059b();
                if (this.f17342r.containsKey(zaiVarM14059b)) {
                    c6362d.m14058a().m23656c(Boolean.valueOf(zaa.m13993k(this.f17342r.get(zaiVarM14059b), false)));
                } else {
                    c6362d.m14058a().m23656c(Boolean.FALSE);
                }
                return true;
            case 15:
                C6354a c6354a = (C6354a) message.obj;
                if (this.f17342r.containsKey(c6354a.f17347a)) {
                    this.f17342r.get(c6354a.f17347a).m13992h(c6354a);
                }
                return true;
            case 16:
                C6354a c6354a2 = (C6354a) message.obj;
                if (this.f17342r.containsKey(c6354a2.f17347a)) {
                    this.f17342r.get(c6354a2.f17347a).m13995o(c6354a2);
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    /* renamed from: i */
    public final void m13969i(zaae zaaeVar) {
        synchronized (f17332h) {
            if (this.f17343s != zaaeVar) {
                this.f17343s = zaaeVar;
                this.f17344t.clear();
            }
            this.f17344t.addAll(zaaeVar.m14117p());
        }
    }

    /* renamed from: m */
    final void m13970m(zaae zaaeVar) {
        synchronized (f17332h) {
            if (this.f17343s == zaaeVar) {
                this.f17343s = null;
                this.f17344t.clear();
            }
        }
    }

    /* renamed from: o */
    public final int m13971o() {
        return this.f17340p.getAndIncrement();
    }

    /* renamed from: s */
    final boolean m13972s(ConnectionResult connectionResult, int i2) {
        return this.f17338n.m13808A(this.f17337m, connectionResult, i2);
    }

    /* renamed from: com.google.android.gms.common.api.internal.GoogleApiManager$a */
    private static class C6354a {

        /* renamed from: a */
        private final zai<?> f17347a;

        /* renamed from: b */
        private final Feature f17348b;

        private C6354a(zai<?> zaiVar, Feature feature) {
            this.f17347a = zaiVar;
            this.f17348b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C6354a)) {
                C6354a c6354a = (C6354a) obj;
                if (Objects.m14355a(this.f17347a, c6354a.f17347a) && Objects.m14355a(this.f17348b, c6354a.f17348b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.m14356b(this.f17347a, this.f17348b);
        }

        public final String toString() {
            return Objects.m14357c(this).m14358a(RoomNotification.KEY, this.f17347a).m14358a(DeepLinkIntentReceiver.DeepLinksTargets.FEATURE, this.f17348b).toString();
        }

        /* synthetic */ C6354a(zai zaiVar, Feature feature, C6404y c6404y) {
            this(zaiVar, feature);
        }
    }
}
