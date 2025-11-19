package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.t;
import j9.InterfaceC3755b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k9.InterfaceC3810e;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;
import z7.InterfaceC5207i;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: j, reason: collision with root package name */
    public static final long f38699j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    static final int[] f38700k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3810e f38701a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3755b<I8.a> f38702b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f38703c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f38704d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f38705e;

    /* renamed from: f, reason: collision with root package name */
    private final f f38706f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f38707g;

    /* renamed from: h, reason: collision with root package name */
    private final t f38708h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f38709i;

    /* compiled from: ConfigFetchHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f38710a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38711b;

        /* renamed from: c, reason: collision with root package name */
        private final g f38712c;

        /* renamed from: d, reason: collision with root package name */
        private final String f38713d;

        private a(Date date, int i10, g gVar, String str) {
            this.f38710a = date;
            this.f38711b = i10;
            this.f38712c = gVar;
            this.f38713d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f38712c;
        }

        String e() {
            return this.f38713d;
        }

        int f() {
            return this.f38711b;
        }
    }

    /* compiled from: ConfigFetchHandler.java */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* renamed from: B, reason: collision with root package name */
        private final String f38717B;

        b(String str) {
            this.f38717B = str;
        }

        String j() {
            return this.f38717B;
        }
    }

    public m(InterfaceC3810e interfaceC3810e, InterfaceC3755b<I8.a> interfaceC3755b, Executor executor, com.google.android.gms.common.util.e eVar, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map<String, String> map) {
        this.f38701a = interfaceC3810e;
        this.f38702b = interfaceC3755b;
        this.f38703c = executor;
        this.f38704d = eVar;
        this.f38705e = random;
        this.f38706f = fVar;
        this.f38707g = configFetchHttpClient;
        this.f38708h = tVar;
        this.f38709i = map;
    }

    private t.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f38708h.a();
    }

    private void B(Date date) {
        int iB = this.f38708h.a().b() + 1;
        this.f38708h.l(iB, new Date(date.getTime() + q(iB)));
    }

    private void C(AbstractC5208j<a> abstractC5208j, Date date) {
        if (abstractC5208j.o()) {
            this.f38708h.q(date);
            return;
        }
        Exception excJ = abstractC5208j.j();
        if (excJ == null) {
            return;
        }
        if (excJ instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f38708h.r();
        } else {
            this.f38708h.p();
        }
    }

    private boolean f(long j10, Date date) {
        Date dateF = this.f38708h.f();
        if (dateF.equals(t.f38763f)) {
            return false;
        }
        return date.before(new Date(dateF.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int iA = firebaseRemoteConfigServerException.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigServerException {
        try {
            a aVarFetch = this.f38707g.fetch(this.f38707g.d(), str, str2, s(), this.f38708h.e(), map, p(), date, this.f38708h.b());
            if (aVarFetch.d() != null) {
                this.f38708h.n(aVarFetch.d().k());
            }
            if (aVarFetch.e() != null) {
                this.f38708h.m(aVarFetch.e());
            }
            this.f38708h.j();
            return aVarFetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            t.a aVarA = A(e10.a(), date);
            if (z(aVarA, e10.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(aVarA.a().getTime());
            }
            throw g(e10);
        }
    }

    private AbstractC5208j<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? C5211m.e(aVarK) : this.f38706f.k(aVarK.d()).p(this.f38703c, new InterfaceC5207i() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // z7.InterfaceC5207i
                public final AbstractC5208j a(Object obj) {
                    return m.v(aVarK, (g) obj);
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return C5211m.d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC5208j<a> u(AbstractC5208j<g> abstractC5208j, long j10, final Map<String, String> map) {
        AbstractC5208j abstractC5208jI;
        final Date date = new Date(this.f38704d.a());
        if (abstractC5208j.o() && f(j10, date)) {
            return C5211m.e(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            abstractC5208jI = C5211m.d(new FirebaseRemoteConfigFetchThrottledException(h(dateO.getTime() - date.getTime()), dateO.getTime()));
        } else {
            final AbstractC5208j<String> abstractC5208jC = this.f38701a.c();
            final AbstractC5208j<com.google.firebase.installations.f> abstractC5208jA = this.f38701a.a(false);
            abstractC5208jI = C5211m.j(abstractC5208jC, abstractC5208jA).i(this.f38703c, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // z7.InterfaceC5201c
                public final Object a(AbstractC5208j abstractC5208j2) {
                    return this.f38689a.w(abstractC5208jC, abstractC5208jA, date, map, abstractC5208j2);
                }
            });
        }
        return abstractC5208jI.i(this.f38703c, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j2) {
                return this.f38694a.x(date, abstractC5208j2);
            }
        });
    }

    private Date o(Date date) {
        Date dateA = this.f38708h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private Long p() {
        I8.a aVar = this.f38702b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f38700k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f38705e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap map = new HashMap();
        I8.a aVar = this.f38702b.get();
        if (aVar == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC5208j v(a aVar, g gVar) {
        return C5211m.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j w(AbstractC5208j abstractC5208j, AbstractC5208j abstractC5208j2, Date date, Map map, AbstractC5208j abstractC5208j3) {
        return !abstractC5208j.o() ? C5211m.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", abstractC5208j.j())) : !abstractC5208j2.o() ? C5211m.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", abstractC5208j2.j())) : l((String) abstractC5208j.k(), ((com.google.firebase.installations.f) abstractC5208j2.k()).b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j x(Date date, AbstractC5208j abstractC5208j) {
        C(abstractC5208j, date);
        return abstractC5208j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j y(Map map, AbstractC5208j abstractC5208j) {
        return u(abstractC5208j, 0L, map);
    }

    private boolean z(t.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public AbstractC5208j<a> i() {
        return j(this.f38708h.h());
    }

    public AbstractC5208j<a> j(final long j10) {
        final HashMap map = new HashMap(this.f38709i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.j() + "/1");
        return this.f38706f.e().i(this.f38703c, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f38686a.u(j10, map, abstractC5208j);
            }
        });
    }

    public AbstractC5208j<a> n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f38709i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.j() + "/" + i10);
        return this.f38706f.e().i(this.f38703c, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f38696a.y(map, abstractC5208j);
            }
        });
    }

    public long r() {
        return this.f38708h.g();
    }
}
