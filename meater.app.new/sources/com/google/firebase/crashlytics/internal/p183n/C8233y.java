package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.C8182k;
import com.google.firebase.crashlytics.internal.InterfaceC8175d;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8183a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8189a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8190b;
import com.google.firebase.crashlytics.internal.p184o.C8240f;
import com.google.firebase.crashlytics.internal.p184o.C8246l;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i;
import com.google.firebase.crashlytics.internal.p191u.C8316a;
import com.google.firebase.crashlytics.internal.p191u.C8318c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* renamed from: com.google.firebase.crashlytics.h.n.y */
/* loaded from: classes2.dex */
public class C8233y {

    /* renamed from: a */
    private final Context f31037a;

    /* renamed from: b */
    private final C8405j f31038b;

    /* renamed from: c */
    private final C8201e0 f31039c;

    /* renamed from: f */
    private C8234z f31042f;

    /* renamed from: g */
    private C8234z f31043g;

    /* renamed from: h */
    private boolean f31044h;

    /* renamed from: i */
    private C8232x f31045i;

    /* renamed from: j */
    private final C8209i0 f31046j;

    /* renamed from: k */
    private final C8298f f31047k;

    /* renamed from: l */
    public final InterfaceC8190b f31048l;

    /* renamed from: m */
    private final InterfaceC8183a f31049m;

    /* renamed from: n */
    private final ExecutorService f31050n;

    /* renamed from: o */
    private final C8231w f31051o;

    /* renamed from: p */
    private final C8230v f31052p;

    /* renamed from: q */
    private final InterfaceC8175d f31053q;

    /* renamed from: r */
    private final C8182k f31054r;

    /* renamed from: e */
    private final long f31041e = System.currentTimeMillis();

    /* renamed from: d */
    private final C8219n0 f31040d = new C8219n0();

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$a */
    class a implements Callable<Task<Void>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC8312i f31055f;

        a(InterfaceC8312i interfaceC8312i) {
            this.f31055f = interfaceC8312i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            return C8233y.this.m25440f(this.f31055f);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceC8312i f31057f;

        b(InterfaceC8312i interfaceC8312i) {
            this.f31057f = interfaceC8312i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8233y.this.m25440f(this.f31057f);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$c */
    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            try {
                boolean zM25456d = C8233y.this.f31042f.m25456d();
                if (!zM25456d) {
                    C8179h.m25176f().m25185k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(zM25456d);
            } catch (Exception e2) {
                C8179h.m25176f().m25180e("Problem encountered deleting Crashlytics initialization marker.", e2);
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.y$d */
    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C8233y.this.f31045i.m25423r());
        }
    }

    public C8233y(C8405j c8405j, C8209i0 c8209i0, InterfaceC8175d interfaceC8175d, C8201e0 c8201e0, InterfaceC8190b interfaceC8190b, InterfaceC8183a interfaceC8183a, C8298f c8298f, ExecutorService executorService, C8230v c8230v, C8182k c8182k) {
        this.f31038b = c8405j;
        this.f31039c = c8201e0;
        this.f31037a = c8405j.m26404i();
        this.f31046j = c8209i0;
        this.f31053q = interfaceC8175d;
        this.f31048l = interfaceC8190b;
        this.f31049m = interfaceC8183a;
        this.f31050n = executorService;
        this.f31047k = c8298f;
        this.f31051o = new C8231w(executorService);
        this.f31052p = c8230v;
        this.f31054r = c8182k;
    }

    /* renamed from: d */
    private void m25439d() {
        try {
            this.f31044h = Boolean.TRUE.equals((Boolean) C8225q0.m25312a(this.f31051o.m25375g(new d())));
        } catch (Exception unused) {
            this.f31044h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public Task<Void> m25440f(InterfaceC8312i interfaceC8312i) {
        m25448m();
        try {
            this.f31048l.mo25136a(new InterfaceC8189a() { // from class: com.google.firebase.crashlytics.h.n.d
                @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8189a
                /* renamed from: a */
                public final void mo25197a(String str) {
                    this.f30889a.m25446k(str);
                }
            });
            this.f31045i.m25419R();
            if (!interfaceC8312i.mo26060b().f31595b.f31602a) {
                C8179h.m25176f().m25177b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.m23662d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f31045i.m25426y(interfaceC8312i)) {
                C8179h.m25176f().m25185k("Previous sessions could not be finalized.");
            }
            return this.f31045i.m25421T(interfaceC8312i.mo26059a());
        } catch (Exception e2) {
            C8179h.m25176f().m25180e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return Tasks.m23662d(e2);
        } finally {
            m25447l();
        }
    }

    /* renamed from: h */
    private void m25441h(InterfaceC8312i interfaceC8312i) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f31050n.submit(new b(interfaceC8312i));
        C8179h.m25176f().m25177b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            C8179h.m25176f().m25180e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            C8179h.m25176f().m25180e("Crashlytics encountered a problem during initialization.", e3);
        } catch (TimeoutException e4) {
            C8179h.m25176f().m25180e("Crashlytics timed out during initialization.", e4);
        }
    }

    /* renamed from: i */
    public static String m25442i() {
        return "18.6.1";
    }

    /* renamed from: j */
    static boolean m25443j(String str, boolean z) {
        if (!z) {
            C8179h.m25176f().m25183i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* renamed from: e */
    boolean m25444e() {
        return this.f31042f.m25455c();
    }

    /* renamed from: g */
    public Task<Void> m25445g(InterfaceC8312i interfaceC8312i) {
        return C8225q0.m25314c(this.f31050n, new a(interfaceC8312i));
    }

    /* renamed from: k */
    public void m25446k(String str) {
        this.f31045i.m25422W(System.currentTimeMillis() - this.f31041e, str);
    }

    /* renamed from: l */
    void m25447l() {
        this.f31051o.m25375g(new c());
    }

    /* renamed from: m */
    void m25448m() {
        this.f31051o.m25373b();
        this.f31042f.m25454a();
        C8179h.m25176f().m25183i("Initialization marker file was created.");
    }

    /* renamed from: n */
    public boolean m25449n(C8214l c8214l, InterfaceC8312i interfaceC8312i) {
        if (!m25443j(c8214l.f30934b, C8228t.m25338i(this.f31037a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String string = new C8227s(this.f31046j).toString();
        try {
            this.f31043g = new C8234z("crash_marker", this.f31047k);
            this.f31042f = new C8234z("initialization_marker", this.f31047k);
            C8246l c8246l = new C8246l(string, this.f31047k, this.f31051o);
            C8240f c8240f = new C8240f(this.f31047k);
            C8316a c8316a = new C8316a(1024, new C8318c(10));
            this.f31054r.m25194b(c8246l);
            this.f31045i = new C8232x(this.f31037a, this.f31051o, this.f31046j, this.f31039c, this.f31047k, this.f31043g, c8214l, c8246l, c8240f, C8221o0.m25286f(this.f31037a, this.f31046j, this.f31047k, c8214l, c8240f, c8246l, c8316a, interfaceC8312i, this.f31040d, this.f31052p), this.f31053q, this.f31049m, this.f31052p);
            boolean zM25444e = m25444e();
            m25439d();
            this.f31045i.m25425w(string, Thread.getDefaultUncaughtExceptionHandler(), interfaceC8312i);
            if (!zM25444e || !C8228t.m25333d(this.f31037a)) {
                C8179h.m25176f().m25177b("Successfully configured exception handler.");
                return true;
            }
            C8179h.m25176f().m25177b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m25441h(interfaceC8312i);
            return false;
        } catch (Exception e2) {
            C8179h.m25176f().m25180e("Crashlytics was not started due to an exception during initialization", e2);
            this.f31045i = null;
            return false;
        }
    }
}
