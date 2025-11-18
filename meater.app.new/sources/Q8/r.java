package Q8;

import Q8.E;
import S8.EventMetadata;
import T8.F;
import T8.G;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5207i;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
class r {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f14482t = new FilenameFilter() { // from class: Q8.q
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return r.K(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f14483a;

    /* renamed from: b, reason: collision with root package name */
    private final G f14484b;

    /* renamed from: c, reason: collision with root package name */
    private final B f14485c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.p f14486d;

    /* renamed from: e, reason: collision with root package name */
    private final R8.f f14487e;

    /* renamed from: f, reason: collision with root package name */
    private final L f14488f;

    /* renamed from: g, reason: collision with root package name */
    private final W8.g f14489g;

    /* renamed from: h, reason: collision with root package name */
    private final C1614b f14490h;

    /* renamed from: i, reason: collision with root package name */
    private final S8.f f14491i;

    /* renamed from: j, reason: collision with root package name */
    private final N8.a f14492j;

    /* renamed from: k, reason: collision with root package name */
    private final O8.a f14493k;

    /* renamed from: l, reason: collision with root package name */
    private final C1626n f14494l;

    /* renamed from: m, reason: collision with root package name */
    private final f0 f14495m;

    /* renamed from: n, reason: collision with root package name */
    private E f14496n;

    /* renamed from: o, reason: collision with root package name */
    private Y8.j f14497o = null;

    /* renamed from: p, reason: collision with root package name */
    final C5209k<Boolean> f14498p = new C5209k<>();

    /* renamed from: q, reason: collision with root package name */
    final C5209k<Boolean> f14499q = new C5209k<>();

    /* renamed from: r, reason: collision with root package name */
    final C5209k<Void> f14500r = new C5209k<>();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f14501s = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    class a implements E.a {
        a() {
        }

        @Override // Q8.E.a
        public void a(Y8.j jVar, Thread thread, Throwable th) {
            r.this.G(jVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class b implements Callable<AbstractC5208j<Void>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14503a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f14504b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f14505c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y8.j f14506d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14507e;

        /* compiled from: CrashlyticsController.java */
        class a implements InterfaceC5207i<Y8.d, Void> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f14509a;

            a(String str) {
                this.f14509a = str;
            }

            @Override // z7.InterfaceC5207i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC5208j<Void> a(Y8.d dVar) {
                if (dVar != null) {
                    return C5211m.g(r.this.N(), r.this.f14495m.B(r.this.f14487e.common, b.this.f14507e ? this.f14509a : null));
                }
                N8.g.f().k("Received null app settings, cannot send reports at crash time.");
                return C5211m.e(null);
            }
        }

        b(long j10, Throwable th, Thread thread, Y8.j jVar, boolean z10) {
            this.f14503a = j10;
            this.f14504b = th;
            this.f14505c = thread;
            this.f14506d = jVar;
            this.f14507e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5208j<Void> call() throws IOException {
            long jE = r.E(this.f14503a);
            String strA = r.this.A();
            if (strA == null) {
                N8.g.f().d("Tried to write a fatal exception while no session was open.");
                return C5211m.e(null);
            }
            r.this.f14485c.a();
            r.this.f14495m.w(this.f14504b, this.f14505c, strA, jE);
            r.this.v(this.f14503a);
            r.this.s(this.f14506d);
            r.this.u(new C1621i().c(), Boolean.valueOf(this.f14507e));
            return !r.this.f14484b.d() ? C5211m.e(null) : this.f14506d.a().p(r.this.f14487e.common, new a(strA));
        }
    }

    /* compiled from: CrashlyticsController.java */
    class c implements InterfaceC5207i<Void, Boolean> {
        c() {
        }

        @Override // z7.InterfaceC5207i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5208j<Boolean> a(Void r12) {
            return C5211m.e(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class d implements InterfaceC5207i<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5208j f14512a;

        /* compiled from: CrashlyticsController.java */
        class a implements InterfaceC5207i<Y8.d, Void> {
            a() {
            }

            @Override // z7.InterfaceC5207i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC5208j<Void> a(Y8.d dVar) {
                if (dVar == null) {
                    N8.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return C5211m.e(null);
                }
                r.this.N();
                r.this.f14495m.A(r.this.f14487e.common);
                r.this.f14500r.e(null);
                return C5211m.e(null);
            }
        }

        d(AbstractC5208j abstractC5208j) {
            this.f14512a = abstractC5208j;
        }

        @Override // z7.InterfaceC5207i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5208j<Void> a(Boolean bool) {
            if (bool.booleanValue()) {
                N8.g.f().b("Sending cached crash reports...");
                r.this.f14484b.c(bool.booleanValue());
                return this.f14512a.p(r.this.f14487e.common, new a());
            }
            N8.g.f().i("Deleting cached crash reports...");
            r.q(r.this.L());
            r.this.f14495m.z();
            r.this.f14500r.e(null);
            return C5211m.e(null);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14515a;

        e(long j10) {
            this.f14515a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f14515a);
            r.this.f14493k.a("_ae", bundle);
            return null;
        }
    }

    r(Context context, L l10, G g10, W8.g gVar, B b10, C1614b c1614b, S8.p pVar, S8.f fVar, f0 f0Var, N8.a aVar, O8.a aVar2, C1626n c1626n, R8.f fVar2) {
        this.f14483a = context;
        this.f14488f = l10;
        this.f14484b = g10;
        this.f14489g = gVar;
        this.f14485c = b10;
        this.f14490h = c1614b;
        this.f14486d = pVar;
        this.f14491i = fVar;
        this.f14492j = aVar;
        this.f14493k = aVar2;
        this.f14494l = c1626n;
        this.f14495m = f0Var;
        this.f14487e = fVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet<String> sortedSetS = this.f14495m.s();
        if (sortedSetS.isEmpty()) {
            return null;
        }
        return sortedSetS.first();
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    static List<O> C(N8.h hVar, String str, W8.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1620h("logs_file", "logs", bArr));
        arrayList.add(new J("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new J("session_meta_file", "session", hVar.f()));
        arrayList.add(new J("app_meta_file", "app", hVar.a()));
        arrayList.add(new J("device_meta_file", "device", hVar.c()));
        arrayList.add(new J("os_meta_file", "os", hVar.b()));
        arrayList.add(P(hVar));
        arrayList.add(new J("user_meta_file", "user", fileQ));
        arrayList.add(new J("keys_file", "keys", fileQ2));
        arrayList.add(new J("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            N8.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        N8.g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        u(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private AbstractC5208j<Void> M(long j10) {
        if (z()) {
            N8.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C5211m.e(null);
        }
        N8.g.f().b("Logging app exception event to Firebase Analytics");
        return C5211m.c(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC5208j<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                N8.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C5211m.f(arrayList);
    }

    private static boolean O(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            N8.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            N8.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static O P(N8.h hVar) {
        File fileE = hVar.e();
        return (fileE == null || !fileE.exists()) ? new C1620h("minidump_file", "minidump", new byte[]{0}) : new J("minidump_file", "minidump", fileE);
    }

    private static byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private AbstractC5208j<Boolean> W() {
        if (this.f14484b.d()) {
            N8.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f14498p.e(Boolean.FALSE);
            return C5211m.e(Boolean.TRUE);
        }
        N8.g.f().b("Automatic data collection is disabled.");
        N8.g.f().i("Notifying that unsent reports are available.");
        this.f14498p.e(Boolean.TRUE);
        AbstractC5208j<TContinuationResult> abstractC5208jQ = this.f14484b.j().q(new c());
        N8.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return R8.b.c(abstractC5208jQ, this.f14499q.a());
    }

    private void X(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            N8.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f14483a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f14495m.y(str, historicalProcessExitReasons, new S8.f(this.f14489g, str), S8.p.m(str, this.f14489g, this.f14487e));
        } else {
            N8.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static G.a n(L l10, C1614b c1614b) {
        return G.a.b(l10.f(), c1614b.f14426f, c1614b.f14427g, l10.a().c(), H.j(c1614b.f14424d).n(), c1614b.f14428h);
    }

    private static G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(C1622j.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C1622j.b(context), statFs.getBlockCount() * statFs.getBlockSize(), C1622j.w(), C1622j.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c p() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C1622j.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z10, Y8.j jVar, boolean z11) throws IOException {
        String str;
        R8.f.c();
        ArrayList arrayList = new ArrayList(this.f14495m.s());
        if (arrayList.size() <= z10) {
            N8.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f19463b.f19471b) {
            X(str2);
        } else {
            N8.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f14492j.c(str2)) {
            x(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f14494l.e(null);
            str = null;
        }
        this.f14495m.m(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long jB = B();
        N8.g.f().b("Opening a new session with ID " + str);
        this.f14492j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", A.m()), jB, T8.G.b(n(this.f14488f, this.f14490h), p(), o(this.f14483a)));
        if (bool.booleanValue() && str != null) {
            this.f14486d.q(str);
        }
        this.f14491i.e(str);
        this.f14494l.e(str);
        this.f14495m.t(str, jB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j10) throws IOException {
        try {
            if (this.f14489g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            N8.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void x(String str) throws IOException {
        N8.g.f().i("Finalizing native report for session " + str);
        N8.h hVarA = this.f14492j.a(str);
        File fileE = hVarA.e();
        F.a aVarD = hVarA.d();
        if (O(str, fileE, aVarD)) {
            N8.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        S8.f fVar = new S8.f(this.f14489g, str);
        File fileK = this.f14489g.k(str);
        if (!fileK.isDirectory()) {
            N8.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        List<O> listC = C(hVarA, str, this.f14489g, fVar.b());
        P.b(fileK, listC);
        N8.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f14495m.l(str, listC, aVarD);
        fVar.a();
    }

    private static boolean z() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() {
        InputStream inputStreamD = D("META-INF/version-control-info.textproto");
        if (inputStreamD == null) {
            return null;
        }
        N8.g.f().b("Read version control info");
        return Base64.encodeToString(R(inputStreamD), 0);
    }

    void G(Y8.j jVar, Thread thread, Throwable th) {
        H(jVar, thread, th, false);
    }

    synchronized void H(Y8.j jVar, Thread thread, Throwable th, boolean z10) {
        N8.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        AbstractC5208j abstractC5208jH = this.f14487e.common.h(new b(System.currentTimeMillis(), th, thread, jVar, z10));
        if (!z10) {
            try {
                try {
                    i0.b(abstractC5208jH);
                } catch (Exception e10) {
                    N8.g.f().e("Error handling uncaught exception", e10);
                }
            } catch (TimeoutException unused) {
                N8.g.f().d("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    boolean I() {
        E e10 = this.f14496n;
        return e10 != null && e10.a();
    }

    List<File> L() {
        return this.f14489g.h(f14482t);
    }

    void Q(final String str) {
        this.f14487e.common.g(new Runnable() { // from class: Q8.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f14480B.J(str);
            }
        });
    }

    void S() {
        try {
            String strF = F();
            if (strF != null) {
                T("com.crashlytics.version-control-info", strF);
                N8.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            N8.g.f().l("Unable to save version control info", e10);
        }
    }

    void T(String str, String str2) {
        try {
            this.f14486d.p(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f14483a;
            if (context != null && C1622j.u(context)) {
                throw e10;
            }
            N8.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(String str) {
        this.f14486d.r(str);
    }

    void V(AbstractC5208j<Y8.d> abstractC5208j) {
        if (this.f14495m.p()) {
            N8.g.f().i("Crash reports are available to be sent.");
            W().p(this.f14487e.common, new d(abstractC5208j));
        } else {
            N8.g.f().i("No crash reports are available to be sent.");
            this.f14498p.e(Boolean.FALSE);
        }
    }

    void Y(Thread thread, Throwable th, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (I()) {
            return;
        }
        long jE = E(jCurrentTimeMillis);
        String strA = A();
        if (strA == null) {
            N8.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f14495m.x(th, thread, new EventMetadata(strA, jE, map));
        }
    }

    void Z(long j10, String str) {
        if (I()) {
            return;
        }
        this.f14491i.g(j10, str);
    }

    boolean r() {
        R8.f.c();
        if (!this.f14485c.c()) {
            String strA = A();
            return strA != null && this.f14492j.c(strA);
        }
        N8.g.f().i("Found previous crash marker.");
        this.f14485c.d();
        return true;
    }

    void s(Y8.j jVar) throws IOException {
        t(false, jVar, false);
    }

    void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Y8.j jVar) {
        this.f14497o = jVar;
        Q(str);
        E e10 = new E(new a(), jVar, uncaughtExceptionHandler, this.f14492j);
        this.f14496n = e10;
        Thread.setDefaultUncaughtExceptionHandler(e10);
    }

    boolean y(Y8.j jVar) {
        R8.f.c();
        if (I()) {
            N8.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        N8.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            N8.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            N8.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
