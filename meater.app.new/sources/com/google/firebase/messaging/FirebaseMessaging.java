package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import b7.C2251a;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.X;
import g7.C3445p;
import g9.C3456a;
import i9.InterfaceC3635a;
import j9.InterfaceC3755b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.ThreadFactoryC3803a;
import k9.InterfaceC3810e;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5205g;
import z7.InterfaceC5207i;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: n, reason: collision with root package name */
    private static X f38233n;

    /* renamed from: p, reason: collision with root package name */
    static ScheduledExecutorService f38235p;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f38236a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3635a f38237b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f38238c;

    /* renamed from: d, reason: collision with root package name */
    private final B f38239d;

    /* renamed from: e, reason: collision with root package name */
    private final T f38240e;

    /* renamed from: f, reason: collision with root package name */
    private final a f38241f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f38242g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f38243h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5208j<c0> f38244i;

    /* renamed from: j, reason: collision with root package name */
    private final G f38245j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38246k;

    /* renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f38247l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f38232m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o, reason: collision with root package name */
    static InterfaceC3755b<K6.j> f38234o = new InterfaceC3755b() { // from class: com.google.firebase.messaging.p
        @Override // j9.InterfaceC3755b
        public final Object get() {
            return FirebaseMessaging.F();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final g9.d f38248a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f38249b;

        /* renamed from: c, reason: collision with root package name */
        private g9.b<com.google.firebase.b> f38250c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f38251d;

        a(g9.d dVar) {
            this.f38248a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(C3456a c3456a) {
            if (c()) {
                FirebaseMessaging.this.J();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextK = FirebaseMessaging.this.f38236a.k();
            SharedPreferences sharedPreferences = contextK.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextK.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextK.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f38249b) {
                    return;
                }
                Boolean boolE = e();
                this.f38251d = boolE;
                if (boolE == null) {
                    g9.b<com.google.firebase.b> bVar = new g9.b() { // from class: com.google.firebase.messaging.y
                        @Override // g9.b
                        public final void a(C3456a c3456a) {
                            this.f38436a.d(c3456a);
                        }
                    };
                    this.f38250c = bVar;
                    this.f38248a.a(com.google.firebase.b.class, bVar);
                }
                this.f38249b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f38251d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f38236a.t();
        }
    }

    FirebaseMessaging(com.google.firebase.f fVar, InterfaceC3635a interfaceC3635a, InterfaceC3755b<D9.i> interfaceC3755b, InterfaceC3755b<h9.j> interfaceC3755b2, InterfaceC3810e interfaceC3810e, InterfaceC3755b<K6.j> interfaceC3755b3, g9.d dVar) {
        this(fVar, interfaceC3635a, interfaceC3755b, interfaceC3755b2, interfaceC3810e, interfaceC3755b3, dVar, new G(fVar.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(C5209k c5209k) {
        try {
            c5209k.c(k());
        } catch (Exception e10) {
            c5209k.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(C2251a c2251a) {
        if (c2251a != null) {
            F.y(c2251a.f0());
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (w()) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(c0 c0Var) {
        if (w()) {
            c0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ K6.j F() {
        return null;
    }

    private boolean H() {
        M.c(this.f38238c);
        if (!M.d(this.f38238c)) {
            return false;
        }
        if (this.f38236a.j(I8.a.class) != null) {
            return true;
        }
        return F.a() && f38234o != null;
    }

    private synchronized void I() {
        if (!this.f38246k) {
            K(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        InterfaceC3635a interfaceC3635a = this.f38237b;
        if (interfaceC3635a != null) {
            interfaceC3635a.c();
        } else if (L(r())) {
            I();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.f fVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
        C3445p.l(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging n() {
        return getInstance(com.google.firebase.f.l());
    }

    private static synchronized X o(Context context) {
        try {
            if (f38233n == null) {
                f38233n = new X(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38233n;
    }

    private String p() {
        return "[DEFAULT]".equals(this.f38236a.m()) ? "" : this.f38236a.o();
    }

    public static K6.j s() {
        return f38234o.get();
    }

    private void t() {
        this.f38239d.e().f(this.f38242g, new InterfaceC5205g() { // from class: com.google.firebase.messaging.v
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) {
                this.f38429a.B((C2251a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void E() {
        M.c(this.f38238c);
        O.g(this.f38238c, this.f38239d, H());
        if (H()) {
            t();
        }
    }

    private void v(String str) {
        if ("[DEFAULT]".equals(this.f38236a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f38236a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2928m(this.f38238c).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j y(String str, X.a aVar, String str2) {
        o(this.f38238c).f(p(), str, str2, this.f38245j.a());
        if (aVar == null || !str2.equals(aVar.f38315a)) {
            v(str2);
        }
        return C5211m.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j z(final String str, final X.a aVar) {
        return this.f38239d.f().p(this.f38243h, new InterfaceC5207i() { // from class: com.google.firebase.messaging.x
            @Override // z7.InterfaceC5207i
            public final AbstractC5208j a(Object obj) {
                return this.f38433a.y(str, aVar, (String) obj);
            }
        });
    }

    synchronized void G(boolean z10) {
        this.f38246k = z10;
    }

    synchronized void K(long j10) {
        l(new Y(this, Math.min(Math.max(30L, 2 * j10), f38232m)), j10);
        this.f38246k = true;
    }

    boolean L(X.a aVar) {
        return aVar == null || aVar.b(this.f38245j.a());
    }

    String k() throws IOException {
        InterfaceC3635a interfaceC3635a = this.f38237b;
        if (interfaceC3635a != null) {
            try {
                return (String) C5211m.a(interfaceC3635a.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final X.a aVarR = r();
        if (!L(aVarR)) {
            return aVarR.f38315a;
        }
        final String strC = G.c(this.f38236a);
        try {
            return (String) C5211m.a(this.f38240e.b(strC, new T.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.T.a
                public final AbstractC5208j start() {
                    return this.f38430a.z(strC, aVarR);
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    void l(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f38235p == null) {
                    f38235p = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3803a("TAG"));
                }
                f38235p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context m() {
        return this.f38238c;
    }

    public AbstractC5208j<String> q() {
        InterfaceC3635a interfaceC3635a = this.f38237b;
        if (interfaceC3635a != null) {
            return interfaceC3635a.b();
        }
        final C5209k c5209k = new C5209k();
        this.f38242g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f38427B.A(c5209k);
            }
        });
        return c5209k.a();
    }

    X.a r() {
        return o(this.f38238c).d(p(), G.c(this.f38236a));
    }

    public boolean w() {
        return this.f38241f.c();
    }

    boolean x() {
        return this.f38245j.g();
    }

    FirebaseMessaging(com.google.firebase.f fVar, InterfaceC3635a interfaceC3635a, InterfaceC3755b<D9.i> interfaceC3755b, InterfaceC3755b<h9.j> interfaceC3755b2, InterfaceC3810e interfaceC3810e, InterfaceC3755b<K6.j> interfaceC3755b3, g9.d dVar, G g10) {
        this(fVar, interfaceC3635a, interfaceC3755b3, dVar, g10, new B(fVar, g10, interfaceC3755b, interfaceC3755b2, interfaceC3810e), C2929n.f(), C2929n.c(), C2929n.b());
    }

    FirebaseMessaging(com.google.firebase.f fVar, InterfaceC3635a interfaceC3635a, InterfaceC3755b<K6.j> interfaceC3755b, g9.d dVar, G g10, B b10, Executor executor, Executor executor2, Executor executor3) {
        this.f38246k = false;
        f38234o = interfaceC3755b;
        this.f38236a = fVar;
        this.f38237b = interfaceC3635a;
        this.f38241f = new a(dVar);
        Context contextK = fVar.k();
        this.f38238c = contextK;
        C2930o c2930o = new C2930o();
        this.f38247l = c2930o;
        this.f38245j = g10;
        this.f38239d = b10;
        this.f38240e = new T(executor);
        this.f38242g = executor2;
        this.f38243h = executor3;
        Context contextK2 = fVar.k();
        if (contextK2 instanceof Application) {
            ((Application) contextK2).registerActivityLifecycleCallbacks(c2930o);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextK2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC3635a != null) {
            interfaceC3635a.a(new InterfaceC3635a.InterfaceC0549a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f38424B.C();
            }
        });
        AbstractC5208j<c0> abstractC5208jE = c0.e(this, g10, b10, contextK, C2929n.g());
        this.f38244i = abstractC5208jE;
        abstractC5208jE.f(executor2, new InterfaceC5205g() { // from class: com.google.firebase.messaging.s
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) {
                this.f38425a.D((c0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f38426B.E();
            }
        });
    }
}
