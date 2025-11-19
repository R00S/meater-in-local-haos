package com.google.firebase.perf.metrics;

import A9.k;
import B9.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import v9.C4925a;
import x9.e;
import z9.C5219a;

/* loaded from: classes2.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, z9.b {

    /* renamed from: B, reason: collision with root package name */
    private final WeakReference<z9.b> f38535B;

    /* renamed from: C, reason: collision with root package name */
    private final Trace f38536C;

    /* renamed from: D, reason: collision with root package name */
    private final GaugeManager f38537D;

    /* renamed from: E, reason: collision with root package name */
    private final String f38538E;

    /* renamed from: F, reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f38539F;

    /* renamed from: G, reason: collision with root package name */
    private final Map<String, String> f38540G;

    /* renamed from: H, reason: collision with root package name */
    private final List<C5219a> f38541H;

    /* renamed from: I, reason: collision with root package name */
    private final List<Trace> f38542I;

    /* renamed from: J, reason: collision with root package name */
    private final k f38543J;

    /* renamed from: K, reason: collision with root package name */
    private final B9.a f38544K;

    /* renamed from: L, reason: collision with root package name */
    private l f38545L;

    /* renamed from: M, reason: collision with root package name */
    private l f38546M;

    /* renamed from: N, reason: collision with root package name */
    private static final C4925a f38532N = C4925a.e();

    /* renamed from: O, reason: collision with root package name */
    private static final Map<String, Trace> f38533O = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: P, reason: collision with root package name */
    static final Parcelable.Creator<Trace> f38534P = new b();

    class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private void b(String str, String str2) {
        if (k()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f38538E));
        }
        if (!this.f38540G.containsKey(str) && this.f38540G.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    private com.google.firebase.perf.metrics.a l(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f38539F.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f38539F.put(str, aVar2);
        return aVar2;
    }

    private void m(l lVar) {
        if (this.f38542I.isEmpty()) {
            return;
        }
        Trace trace = this.f38542I.get(this.f38542I.size() - 1);
        if (trace.f38546M == null) {
            trace.f38546M = lVar;
        }
    }

    @Override // z9.b
    public void a(C5219a c5219a) {
        if (c5219a == null) {
            f38532N.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!i() || k()) {
                return;
            }
            this.f38541H.add(c5219a);
        }
    }

    Map<String, com.google.firebase.perf.metrics.a> c() {
        return this.f38539F;
    }

    l d() {
        return this.f38546M;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f38538E;
    }

    List<C5219a> f() {
        List<C5219a> listUnmodifiableList;
        synchronized (this.f38541H) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5219a c5219a : this.f38541H) {
                    if (c5219a != null) {
                        arrayList.add(c5219a);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    protected void finalize() throws Throwable {
        try {
            if (j()) {
                f38532N.k("Trace '%s' is started but not stopped when it is destructed!", this.f38538E);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    l g() {
        return this.f38545L;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f38540G.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f38540G);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f38539F.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    List<Trace> h() {
        return this.f38542I;
    }

    boolean i() {
        return this.f38545L != null;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f38532N.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f38532N.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f38538E);
        } else {
            if (k()) {
                f38532N.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f38538E);
                return;
            }
            com.google.firebase.perf.metrics.a aVarL = l(str.trim());
            aVarL.c(j10);
            f38532N.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(aVarL.a()), this.f38538E);
        }
    }

    boolean j() {
        return i() && !k();
    }

    boolean k() {
        return this.f38546M != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f38532N.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f38538E);
            z10 = true;
        } catch (Exception e10) {
            f38532N.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f38540G.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f38532N.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f38532N.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f38538E);
        } else if (k()) {
            f38532N.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f38538E);
        } else {
            l(str.trim()).d(j10);
            f38532N.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f38538E);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f38532N.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f38540G.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f38532N.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f38538E);
        if (strF != null) {
            f38532N.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f38538E, strF);
            return;
        }
        if (this.f38545L != null) {
            f38532N.d("Trace '%s' has already started, should not start again!", this.f38538E);
            return;
        }
        this.f38545L = this.f38544K.a();
        registerForAppState();
        C5219a c5219aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f38535B);
        a(c5219aPerfSession);
        if (c5219aPerfSession.e()) {
            this.f38537D.collectGaugeMetricOnce(c5219aPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f38532N.d("Trace '%s' has not been started so unable to stop!", this.f38538E);
            return;
        }
        if (k()) {
            f38532N.d("Trace '%s' has already stopped, should not stop again!", this.f38538E);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f38535B);
        unregisterForAppState();
        l lVarA = this.f38544K.a();
        this.f38546M = lVarA;
        if (this.f38536C == null) {
            m(lVarA);
            if (this.f38538E.isEmpty()) {
                f38532N.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f38543J.C(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f38537D.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f38536C, 0);
        parcel.writeString(this.f38538E);
        parcel.writeList(this.f38542I);
        parcel.writeMap(this.f38539F);
        parcel.writeParcelable(this.f38545L, 0);
        parcel.writeParcelable(this.f38546M, 0);
        synchronized (this.f38541H) {
            parcel.writeList(this.f38541H);
        }
    }

    public Trace(String str, k kVar, B9.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, B9.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f38535B = new WeakReference<>(this);
        this.f38536C = null;
        this.f38538E = str.trim();
        this.f38542I = new ArrayList();
        this.f38539F = new ConcurrentHashMap();
        this.f38540G = new ConcurrentHashMap();
        this.f38544K = aVar;
        this.f38543J = kVar;
        this.f38541H = Collections.synchronizedList(new ArrayList());
        this.f38537D = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f38535B = new WeakReference<>(this);
        this.f38536C = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f38538E = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f38542I = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f38539F = concurrentHashMap;
        this.f38540G = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f38545L = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f38546M = (l) parcel.readParcelable(l.class.getClassLoader());
        List<C5219a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f38541H = listSynchronizedList;
        parcel.readList(listSynchronizedList, C5219a.class.getClassLoader());
        if (z10) {
            this.f38543J = null;
            this.f38544K = null;
            this.f38537D = null;
        } else {
            this.f38543J = k.k();
            this.f38544K = new B9.a();
            this.f38537D = GaugeManager.getInstance();
        }
    }
}
