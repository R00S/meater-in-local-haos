package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcgb {

    /* renamed from: e */
    private final Context f24266e;

    /* renamed from: f */
    private final zzclc f24267f;

    /* renamed from: g */
    private final Executor f24268g;

    /* renamed from: h */
    private final Executor f24269h;

    /* renamed from: i */
    private final ScheduledExecutorService f24270i;

    /* renamed from: a */
    private boolean f24262a = false;

    /* renamed from: b */
    private boolean f24263b = false;

    /* renamed from: d */
    private final zzbbr<Boolean> f24265d = new zzbbr<>();

    /* renamed from: j */
    private Map<String, zzaio> f24271j = new ConcurrentHashMap();

    /* renamed from: c */
    private final long f24264c = zzk.zzln().mo14609b();

    public zzcgb(Executor executor, Context context, Executor executor2, zzclc zzclcVar, ScheduledExecutorService scheduledExecutorService) {
        this.f24267f = zzclcVar;
        this.f24266e = context;
        this.f24268g = executor2;
        this.f24270i = scheduledExecutorService;
        this.f24269h = executor;
        m18760d("com.google.android.gms.ads.MobileAds", false, HttpUrl.FRAGMENT_ENCODE_SET, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m18760d(String str, boolean z, String str2, int i2) {
        this.f24271j.put(str, new zzaio(str, z, i2, str2));
    }

    /* renamed from: g */
    private final synchronized void m18761g() {
        if (!this.f24263b) {
            zzk.zzlk().m17061r().mo17107u(new Runnable(this) { // from class: com.google.android.gms.internal.ads.li

                /* renamed from: f */
                private final zzcgb f19843f;

                {
                    this.f19843f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19843f.m18768j();
                }
            });
            this.f24263b = true;
            this.f24270i.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.mi

                /* renamed from: f */
                private final zzcgb f19926f;

                {
                    this.f19926f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19926f.m18767i();
                }
            }, ((Long) zzyt.m20848e().m16421c(zzacu.f21799h2)).longValue(), TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18762a(zzams zzamsVar, zzaiq zzaiqVar, List list) {
        try {
            try {
                zzamsVar.mo16698G4(ObjectWrapper.m14708E0(this.f24266e), zzaiqVar, list);
            } catch (RemoteException unused) {
                zzaiqVar.onInitializationFailed("Failed to create Adapter.");
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    /* renamed from: c */
    final /* synthetic */ void m18763c(Object obj, zzbbr zzbbrVar, String str, long j2) {
        synchronized (obj) {
            if (!zzbbrVar.isDone()) {
                m18760d(str, false, "timeout", (int) (zzk.zzln().mo14609b() - j2));
                zzbbrVar.m17385a(Boolean.FALSE);
            }
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void m18769k() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21786f2)).booleanValue() && !this.f24262a) {
            synchronized (this) {
                if (this.f24262a) {
                    return;
                }
                final String strM17040c = zzk.zzlk().m17061r().mo17103q().m17040c();
                if (TextUtils.isEmpty(strM17040c)) {
                    m18761g();
                    return;
                }
                this.f24262a = true;
                m18760d("com.google.android.gms.ads.MobileAds", true, HttpUrl.FRAGMENT_ENCODE_SET, (int) (zzk.zzln().mo14609b() - this.f24264c));
                this.f24268g.execute(new Runnable(this, strM17040c) { // from class: com.google.android.gms.internal.ads.ki

                    /* renamed from: f */
                    private final zzcgb f19705f;

                    /* renamed from: g */
                    private final String f19706g;

                    {
                        this.f19705f = this;
                        this.f19706g = strM17040c;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        this.f19705f.m18772n(this.f19706g);
                    }
                });
            }
        }
    }

    /* renamed from: f */
    public final List<zzaio> m18765f() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f24271j.keySet()) {
            zzaio zzaioVar = this.f24271j.get(str);
            arrayList.add(new zzaio(str, zzaioVar.f22062g, zzaioVar.f22063h, zzaioVar.f22064i));
        }
        return arrayList;
    }

    /* renamed from: h */
    final /* synthetic */ Object m18766h() throws Exception {
        this.f24265d.m17385a(Boolean.TRUE);
        return null;
    }

    /* renamed from: i */
    final /* synthetic */ void m18767i() {
        synchronized (this) {
            if (this.f24262a) {
                return;
            }
            m18760d("com.google.android.gms.ads.MobileAds", false, "timeout", (int) (zzk.zzln().mo14609b() - this.f24264c));
            this.f24265d.m17385a(Boolean.TRUE);
        }
    }

    /* renamed from: j */
    final /* synthetic */ void m18768j() {
        this.f24268g.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qi

            /* renamed from: f */
            private final zzcgb f20394f;

            {
                this.f20394f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20394f.m18769k();
            }
        });
    }

    /* renamed from: l */
    public final void m18770l(final zzait zzaitVar) {
        this.f24265d.mo14748k(new Runnable(this, zzaitVar) { // from class: com.google.android.gms.internal.ads.ji

            /* renamed from: f */
            private final zzcgb f19483f;

            /* renamed from: g */
            private final zzait f19484g;

            {
                this.f19483f = this;
                this.f19484g = zzaitVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19483f.m18771m(this.f19484g);
            }
        }, this.f24269h);
    }

    /* renamed from: m */
    final /* synthetic */ void m18771m(zzait zzaitVar) {
        try {
            zzaitVar.mo16591u0(m18765f());
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    /* renamed from: n */
    final /* synthetic */ void m18772n(String str) throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final Object obj = new Object();
                final zzbbr zzbbrVar = new zzbbr();
                zzbbh zzbbhVarM17365b = zzbar.m17365b(zzbbrVar, ((Long) zzyt.m20848e().m16421c(zzacu.f21793g2)).longValue(), TimeUnit.SECONDS, this.f24270i);
                final long jMo14609b = zzk.zzln().mo14609b();
                Iterator<String> it = itKeys;
                zzbbhVarM17365b.mo14748k(new Runnable(this, obj, zzbbrVar, next, jMo14609b) { // from class: com.google.android.gms.internal.ads.ni

                    /* renamed from: f */
                    private final zzcgb f20090f;

                    /* renamed from: g */
                    private final Object f20091g;

                    /* renamed from: h */
                    private final zzbbr f20092h;

                    /* renamed from: i */
                    private final String f20093i;

                    /* renamed from: j */
                    private final long f20094j;

                    {
                        this.f20090f = this;
                        this.f20091g = obj;
                        this.f20092h = zzbbrVar;
                        this.f20093i = next;
                        this.f20094j = jMo14609b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20090f.m18763c(this.f20091g, this.f20092h, this.f20093i, this.f20094j);
                    }
                }, this.f24268g);
                arrayList.add(zzbbhVarM17365b);
                final BinderC7118ri binderC7118ri = new BinderC7118ri(this, obj, next, jMo14609b, zzbbrVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", HttpUrl.FRAGMENT_ENCODE_SET);
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, HttpUrl.FRAGMENT_ENCODE_SET));
                                }
                            }
                            arrayList2.add(new zzaiw(strOptString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                m18760d(next, false, HttpUrl.FRAGMENT_ENCODE_SET, 0);
                try {
                    try {
                        final zzams zzamsVarM18869e = this.f24267f.m18869e(next, new JSONObject());
                        this.f24269h.execute(new Runnable(this, zzamsVarM18869e, binderC7118ri, arrayList2) { // from class: com.google.android.gms.internal.ads.pi

                            /* renamed from: f */
                            private final zzcgb f20303f;

                            /* renamed from: g */
                            private final zzams f20304g;

                            /* renamed from: h */
                            private final zzaiq f20305h;

                            /* renamed from: i */
                            private final List f20306i;

                            {
                                this.f20303f = this;
                                this.f20304g = zzamsVarM18869e;
                                this.f20305h = binderC7118ri;
                                this.f20306i = arrayList2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f20303f.m18762a(this.f20304g, this.f20305h, this.f20306i);
                            }
                        });
                    } catch (RemoteException unused2) {
                        binderC7118ri.onInitializationFailed("Failed to create Adapter.");
                    }
                } catch (RemoteException e2) {
                    zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
                itKeys = it;
            }
            zzbar.m17377n(arrayList).m17379a(new Callable(this) { // from class: com.google.android.gms.internal.ads.oi

                /* renamed from: f */
                private final zzcgb f20195f;

                {
                    this.f20195f = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20195f.m18766h();
                }
            }, this.f24268g);
        } catch (JSONException e3) {
            zzawz.m17081l("Malformed CLD response", e3);
        }
    }
}
