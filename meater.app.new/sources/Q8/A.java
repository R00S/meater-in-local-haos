package Q8;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z7.AbstractC5208j;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14351a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f14352b;

    /* renamed from: c, reason: collision with root package name */
    private final G f14353c;

    /* renamed from: f, reason: collision with root package name */
    private B f14356f;

    /* renamed from: g, reason: collision with root package name */
    private B f14357g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14358h;

    /* renamed from: i, reason: collision with root package name */
    private r f14359i;

    /* renamed from: j, reason: collision with root package name */
    private final L f14360j;

    /* renamed from: k, reason: collision with root package name */
    private final W8.g f14361k;

    /* renamed from: l, reason: collision with root package name */
    public final P8.b f14362l;

    /* renamed from: m, reason: collision with root package name */
    private final O8.a f14363m;

    /* renamed from: n, reason: collision with root package name */
    private final C1626n f14364n;

    /* renamed from: o, reason: collision with root package name */
    private final N8.a f14365o;

    /* renamed from: p, reason: collision with root package name */
    private final N8.l f14366p;

    /* renamed from: q, reason: collision with root package name */
    private final R8.f f14367q;

    /* renamed from: e, reason: collision with root package name */
    private final long f14355e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final Q f14354d = new Q();

    public A(com.google.firebase.f fVar, L l10, N8.a aVar, G g10, P8.b bVar, O8.a aVar2, W8.g gVar, C1626n c1626n, N8.l lVar, R8.f fVar2) {
        this.f14352b = fVar;
        this.f14353c = g10;
        this.f14351a = fVar.k();
        this.f14360j = l10;
        this.f14365o = aVar;
        this.f14362l = bVar;
        this.f14363m = aVar2;
        this.f14361k = gVar;
        this.f14364n = c1626n;
        this.f14366p = lVar;
        this.f14367q = fVar2;
    }

    private void h() {
        try {
            this.f14358h = Boolean.TRUE.equals((Boolean) this.f14367q.common.d().submit(new Callable() { // from class: Q8.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f14524a.o();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f14358h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void q(Y8.j jVar) {
        R8.f.c();
        y();
        try {
            try {
                this.f14362l.a(new P8.a() { // from class: Q8.x
                    @Override // P8.a
                    public final void a(String str) {
                        this.f14527a.v(str);
                    }
                });
                this.f14359i.S();
            } catch (Exception e10) {
                N8.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            }
            if (!jVar.b().f19463b.f19470a) {
                N8.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f14359i.y(jVar)) {
                N8.g.f().k("Previous sessions could not be finalized.");
            }
            this.f14359i.V(jVar.a());
            x();
        } catch (Throwable th) {
            x();
            throw th;
        }
    }

    private void l(final Y8.j jVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f14367q.common.d().submit(new Runnable() { // from class: Q8.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f14525B.q(jVar);
            }
        });
        N8.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            N8.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            N8.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            N8.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String m() {
        return "19.4.0";
    }

    static boolean n(String str, boolean z10) {
        if (!z10) {
            N8.g.f().i("Configured not to require a build ID.");
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean o() {
        return Boolean.valueOf(this.f14359i.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(long j10, String str) {
        this.f14359i.Z(j10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(final long j10, final String str) {
        this.f14367q.diskWrite.g(new Runnable() { // from class: Q8.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f14531B.r(j10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Throwable th, Map map) {
        this.f14359i.Y(Thread.currentThread(), th, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str) {
        this.f14359i.U(str);
    }

    public void A(Boolean bool) {
        this.f14353c.h(bool);
    }

    public void B(final String str) {
        this.f14367q.common.g(new Runnable() { // from class: Q8.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f14519B.u(str);
            }
        });
    }

    boolean i() {
        return this.f14356f.c();
    }

    public AbstractC5208j<Void> k(final Y8.j jVar) {
        return this.f14367q.common.g(new Runnable() { // from class: Q8.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f14517B.p(jVar);
            }
        });
    }

    public void v(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f14355e;
        this.f14367q.common.g(new Runnable() { // from class: Q8.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f14528B.s(jCurrentTimeMillis, str);
            }
        });
    }

    public void w(final Throwable th, final Map<String, String> map) {
        this.f14367q.common.g(new Runnable() { // from class: Q8.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f14521B.t(th, map);
            }
        });
    }

    void x() {
        R8.f.c();
        try {
            if (this.f14356f.d()) {
                return;
            }
            N8.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            N8.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void y() {
        R8.f.c();
        this.f14356f.a();
        N8.g.f().i("Initialization marker file was created.");
    }

    public boolean z(C1614b c1614b, Y8.j jVar) {
        if (!n(c1614b.f14422b, C1622j.i(this.f14351a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C1621i().c();
        try {
            this.f14357g = new B("crash_marker", this.f14361k);
            this.f14356f = new B("initialization_marker", this.f14361k);
            S8.p pVar = new S8.p(strC, this.f14361k, this.f14367q);
            S8.f fVar = new S8.f(this.f14361k);
            Z8.a aVar = new Z8.a(1024, new Z8.c(10));
            this.f14366p.c(pVar);
            this.f14359i = new r(this.f14351a, this.f14360j, this.f14353c, this.f14361k, this.f14357g, c1614b, pVar, fVar, f0.j(this.f14351a, this.f14360j, this.f14361k, c1614b, fVar, pVar, aVar, jVar, this.f14354d, this.f14364n, this.f14367q), this.f14365o, this.f14363m, this.f14364n, this.f14367q);
            boolean zI = i();
            h();
            this.f14359i.w(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zI || !C1622j.d(this.f14351a)) {
                N8.g.f().b("Successfully configured exception handler.");
                return true;
            }
            N8.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            l(jVar);
            return false;
        } catch (Exception e10) {
            N8.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f14359i = null;
            return false;
        }
    }
}
