package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8350h;
import com.google.firebase.C8405j;
import com.google.firebase.iid.p195w.InterfaceC8375a;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.messaging.C8442k0;
import com.google.firebase.messaging.C8450o0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.p203q.C8479a;
import com.google.firebase.p203q.InterfaceC8480b;
import com.google.firebase.p203q.InterfaceC8482d;
import com.google.firebase.p204r.InterfaceC8492j;
import com.google.firebase.p205s.InterfaceC8496b;
import com.google.firebase.p209u.InterfaceC8556i;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.InterfaceC8790g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: a */
    private static final long f31905a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static C8450o0 f31906b;

    /* renamed from: c */
    @SuppressLint({"FirebaseUnknownNullness"})
    static InterfaceC8790g f31907c;

    /* renamed from: d */
    static ScheduledExecutorService f31908d;

    /* renamed from: e */
    private final C8405j f31909e;

    /* renamed from: f */
    private final InterfaceC8375a f31910f;

    /* renamed from: g */
    private final InterfaceC8385i f31911g;

    /* renamed from: h */
    private final Context f31912h;

    /* renamed from: i */
    private final C8423b0 f31913i;

    /* renamed from: j */
    private final C8442k0 f31914j;

    /* renamed from: k */
    private final C8413a f31915k;

    /* renamed from: l */
    private final Executor f31916l;

    /* renamed from: m */
    private final Executor f31917m;

    /* renamed from: n */
    private final Task<C8460t0> f31918n;

    /* renamed from: o */
    private final C8434g0 f31919o;

    /* renamed from: p */
    private boolean f31920p;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    class C8413a {

        /* renamed from: a */
        private final InterfaceC8482d f31921a;

        /* renamed from: b */
        private boolean f31922b;

        /* renamed from: c */
        private InterfaceC8480b<C8350h> f31923c;

        /* renamed from: d */
        private Boolean f31924d;

        C8413a(InterfaceC8482d interfaceC8482d) {
            this.f31921a = interfaceC8482d;
        }

        /* renamed from: d */
        private Boolean m26448d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM26404i = FirebaseMessaging.this.f31909e.m26404i();
            SharedPreferences sharedPreferences = contextM26404i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM26404i.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM26404i.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        synchronized void m26449a() {
            if (this.f31922b) {
                return;
            }
            Boolean boolM26448d = m26448d();
            this.f31924d = boolM26448d;
            if (boolM26448d == null) {
                InterfaceC8480b<C8350h> interfaceC8480b = new InterfaceC8480b(this) { // from class: com.google.firebase.messaging.v

                    /* renamed from: a */
                    private final FirebaseMessaging.C8413a f32079a;

                    {
                        this.f32079a = this;
                    }

                    @Override // com.google.firebase.p203q.InterfaceC8480b
                    /* renamed from: a */
                    public void mo24957a(C8479a c8479a) {
                        this.f32079a.m26451c(c8479a);
                    }
                };
                this.f31923c = interfaceC8480b;
                this.f31921a.mo25071a(C8350h.class, interfaceC8480b);
            }
            this.f31922b = true;
        }

        /* renamed from: b */
        synchronized boolean m26450b() {
            Boolean bool;
            m26449a();
            bool = this.f31924d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f31909e.m26408r();
        }

        /* renamed from: c */
        final /* synthetic */ void m26451c(C8479a c8479a) {
            if (m26450b()) {
                FirebaseMessaging.this.m26433s();
            }
        }
    }

    FirebaseMessaging(C8405j c8405j, InterfaceC8375a interfaceC8375a, InterfaceC8496b<InterfaceC8556i> interfaceC8496b, InterfaceC8496b<InterfaceC8492j> interfaceC8496b2, InterfaceC8385i interfaceC8385i, InterfaceC8790g interfaceC8790g, InterfaceC8482d interfaceC8482d) {
        this(c8405j, interfaceC8375a, interfaceC8496b, interfaceC8496b2, interfaceC8385i, interfaceC8790g, interfaceC8482d, new C8434g0(c8405j.m26404i()));
    }

    /* renamed from: g */
    private String m26429g() {
        return "[DEFAULT]".equals(this.f31909e.m26405k()) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f31909e.m26407m();
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C8405j c8405j) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c8405j.m26403h(FirebaseMessaging.class);
        Preconditions.m14373l(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* renamed from: i */
    public static InterfaceC8790g m26430i() {
        return f31907c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m26435d(String str) {
        if ("[DEFAULT]".equals(this.f31909e.m26405k())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(this.f31909e.m26405k());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C8449o(this.f31912h).m26601g(intent);
        }
    }

    /* renamed from: r */
    private synchronized void m26432r() {
        if (this.f31920p) {
            return;
        }
        m26446t(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m26433s() {
        InterfaceC8375a interfaceC8375a = this.f31910f;
        if (interfaceC8375a != null) {
            interfaceC8375a.mo26197a();
        } else if (m26447u(m26438h())) {
            m26432r();
        }
    }

    /* renamed from: c */
    String m26434c() throws IOException {
        InterfaceC8375a interfaceC8375a = this.f31910f;
        if (interfaceC8375a != null) {
            try {
                return (String) Tasks.m23659a(interfaceC8375a.mo26198b());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
        C8450o0.a aVarM26438h = m26438h();
        if (!m26447u(aVarM26438h)) {
            return aVarM26438h.f32030b;
        }
        final String strM26540c = C8434g0.m26540c(this.f31909e);
        try {
            String str = (String) Tasks.m23659a(this.f31911g.getId().mo23645h(C8451p.m26615d(), new Continuation(this, strM26540c) { // from class: com.google.firebase.messaging.t

                /* renamed from: a */
                private final FirebaseMessaging f32055a;

                /* renamed from: b */
                private final String f32056b;

                {
                    this.f32055a = this;
                    this.f32056b = strM26540c;
                }

                @Override // com.google.android.gms.tasks.Continuation
                /* renamed from: a */
                public Object mo13777a(Task task) {
                    return this.f32055a.m26442n(this.f32056b, task);
                }
            }));
            f31906b.m26608f(m26429g(), strM26540c, str, this.f31919o.m26543a());
            if (aVarM26438h == null || !str.equals(aVarM26438h.f32030b)) {
                m26435d(str);
            }
            return str;
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    /* renamed from: e */
    void m26436e(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (f31908d == null) {
                f31908d = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f31908d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* renamed from: f */
    Context m26437f() {
        return this.f31912h;
    }

    /* renamed from: h */
    C8450o0.a m26438h() {
        return f31906b.m26606d(m26429g(), C8434g0.m26540c(this.f31909e));
    }

    /* renamed from: k */
    public boolean m26439k() {
        return this.f31915k.m26450b();
    }

    /* renamed from: l */
    boolean m26440l() {
        return this.f31919o.m26547g();
    }

    /* renamed from: m */
    final /* synthetic */ Task m26441m(Task task) {
        return this.f31913i.m26488d((String) task.mo23647j());
    }

    /* renamed from: n */
    final /* synthetic */ Task m26442n(String str, final Task task) throws Exception {
        return this.f31914j.m26577a(str, new C8442k0.a(this, task) { // from class: com.google.firebase.messaging.u

            /* renamed from: a */
            private final FirebaseMessaging f32067a;

            /* renamed from: b */
            private final Task f32068b;

            {
                this.f32067a = this;
                this.f32068b = task;
            }

            @Override // com.google.firebase.messaging.C8442k0.a
            public Task start() {
                return this.f32067a.m26441m(this.f32068b);
            }
        });
    }

    /* renamed from: o */
    final /* synthetic */ void m26443o() {
        if (m26439k()) {
            m26433s();
        }
    }

    /* renamed from: p */
    final /* synthetic */ void m26444p(C8460t0 c8460t0) {
        if (m26439k()) {
            c8460t0.m26647n();
        }
    }

    /* renamed from: q */
    synchronized void m26445q(boolean z) {
        this.f31920p = z;
    }

    /* renamed from: t */
    synchronized void m26446t(long j2) {
        m26436e(new RunnableC8452p0(this, Math.min(Math.max(30L, j2 + j2), f31905a)), j2);
        this.f31920p = true;
    }

    /* renamed from: u */
    boolean m26447u(C8450o0.a aVar) {
        return aVar == null || aVar.m26611b(this.f31919o.m26543a());
    }

    FirebaseMessaging(C8405j c8405j, InterfaceC8375a interfaceC8375a, InterfaceC8496b<InterfaceC8556i> interfaceC8496b, InterfaceC8496b<InterfaceC8492j> interfaceC8496b2, InterfaceC8385i interfaceC8385i, InterfaceC8790g interfaceC8790g, InterfaceC8482d interfaceC8482d, C8434g0 c8434g0) {
        this(c8405j, interfaceC8375a, interfaceC8385i, interfaceC8790g, interfaceC8482d, c8434g0, new C8423b0(c8405j, c8434g0, interfaceC8496b, interfaceC8496b2, interfaceC8385i), C8451p.m26616e(), C8451p.m26613b());
    }

    FirebaseMessaging(C8405j c8405j, InterfaceC8375a interfaceC8375a, InterfaceC8385i interfaceC8385i, InterfaceC8790g interfaceC8790g, InterfaceC8482d interfaceC8482d, C8434g0 c8434g0, C8423b0 c8423b0, Executor executor, Executor executor2) {
        this.f31920p = false;
        f31907c = interfaceC8790g;
        this.f31909e = c8405j;
        this.f31910f = interfaceC8375a;
        this.f31911g = interfaceC8385i;
        this.f31915k = new C8413a(interfaceC8482d);
        Context contextM26404i = c8405j.m26404i();
        this.f31912h = contextM26404i;
        this.f31919o = c8434g0;
        this.f31917m = executor;
        this.f31913i = c8423b0;
        this.f31914j = new C8442k0(executor);
        this.f31916l = executor2;
        if (interfaceC8375a != null) {
            interfaceC8375a.mo26199c(new InterfaceC8375a.a(this) { // from class: com.google.firebase.messaging.q

                /* renamed from: a */
                private final FirebaseMessaging f32038a;

                {
                    this.f32038a = this;
                }

                @Override // com.google.firebase.iid.p195w.InterfaceC8375a.a
                /* renamed from: a */
                public void mo26244a(String str) {
                    this.f32038a.m26435d(str);
                }
            });
        }
        synchronized (FirebaseMessaging.class) {
            if (f31906b == null) {
                f31906b = new C8450o0(contextM26404i);
            }
        }
        executor2.execute(new Runnable(this) { // from class: com.google.firebase.messaging.r

            /* renamed from: f */
            private final FirebaseMessaging f32043f;

            {
                this.f32043f = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32043f.m26443o();
            }
        });
        Task<C8460t0> taskM26637d = C8460t0.m26637d(this, interfaceC8385i, c8434g0, c8423b0, contextM26404i, C8451p.m26617f());
        this.f31918n = taskM26637d;
        taskM26637d.mo23642e(C8451p.m26618g(), new OnSuccessListener(this) { // from class: com.google.firebase.messaging.s

            /* renamed from: a */
            private final FirebaseMessaging f32048a;

            {
                this.f32048a = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f32048a.m26444p((C8460t0) obj);
            }
        });
    }
}
