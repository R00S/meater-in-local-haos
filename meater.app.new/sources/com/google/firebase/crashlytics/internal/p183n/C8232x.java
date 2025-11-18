package com.google.firebase.crashlytics.internal.p183n;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.InterfaceC8175d;
import com.google.firebase.crashlytics.internal.InterfaceC8180i;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8183a;
import com.google.firebase.crashlytics.internal.p183n.C8197c0;
import com.google.firebase.crashlytics.internal.p184o.C8240f;
import com.google.firebase.crashlytics.internal.p184o.C8246l;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import com.google.firebase.crashlytics.internal.p190t.C8307d;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i;
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
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsController.java */
/* renamed from: com.google.firebase.crashlytics.h.n.x */
/* loaded from: classes2.dex */
class C8232x {

    /* renamed from: a */
    static final FilenameFilter f30993a = new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.n.c
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* renamed from: b */
    private final Context f30994b;

    /* renamed from: c */
    private final C8201e0 f30995c;

    /* renamed from: d */
    private final C8234z f30996d;

    /* renamed from: e */
    private final C8246l f30997e;

    /* renamed from: f */
    private final C8231w f30998f;

    /* renamed from: g */
    private final C8209i0 f30999g;

    /* renamed from: h */
    private final C8298f f31000h;

    /* renamed from: i */
    private final C8214l f31001i;

    /* renamed from: j */
    private final C8240f f31002j;

    /* renamed from: k */
    private final InterfaceC8175d f31003k;

    /* renamed from: l */
    private final InterfaceC8183a f31004l;

    /* renamed from: m */
    private final C8230v f31005m;

    /* renamed from: n */
    private final C8221o0 f31006n;

    /* renamed from: o */
    private C8197c0 f31007o;

    /* renamed from: p */
    private InterfaceC8312i f31008p = null;

    /* renamed from: q */
    final TaskCompletionSource<Boolean> f31009q = new TaskCompletionSource<>();

    /* renamed from: r */
    final TaskCompletionSource<Boolean> f31010r = new TaskCompletionSource<>();

    /* renamed from: s */
    final TaskCompletionSource<Void> f31011s = new TaskCompletionSource<>();

    /* renamed from: t */
    final AtomicBoolean f31012t = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$a */
    class a implements C8197c0.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.p183n.C8197c0.a
        /* renamed from: a */
        public void mo25231a(InterfaceC8312i interfaceC8312i, Thread thread, Throwable th) {
            C8232x.this.m25414G(interfaceC8312i, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$b */
    class b implements Callable<Task<Void>> {

        /* renamed from: f */
        final /* synthetic */ long f31014f;

        /* renamed from: g */
        final /* synthetic */ Throwable f31015g;

        /* renamed from: h */
        final /* synthetic */ Thread f31016h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC8312i f31017i;

        /* renamed from: j */
        final /* synthetic */ boolean f31018j;

        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.n.x$b$a */
        class a implements SuccessContinuation<C8307d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f31020a;

            /* renamed from: b */
            final /* synthetic */ String f31021b;

            a(Executor executor, String str) {
                this.f31020a = executor;
                this.f31021b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task<Void> mo13778a(C8307d c8307d) throws Exception {
                if (c8307d == null) {
                    C8179h.m25176f().m25185k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.m23663e(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = C8232x.this.m25385M();
                taskArr[1] = C8232x.this.f31006n.m25303w(this.f31020a, b.this.f31018j ? this.f31021b : null);
                return Tasks.m23665g(taskArr);
            }
        }

        b(long j2, Throwable th, Thread thread, InterfaceC8312i interfaceC8312i, boolean z) {
            this.f31014f = j2;
            this.f31015g = th;
            this.f31016h = thread;
            this.f31017i = interfaceC8312i;
            this.f31018j = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task<Void> call() throws Exception {
            long jM25382E = C8232x.m25382E(this.f31014f);
            String strM25378A = C8232x.this.m25378A();
            if (strM25378A == null) {
                C8179h.m25176f().m25179d("Tried to write a fatal exception while no session was open.");
                return Tasks.m23663e(null);
            }
            C8232x.this.f30996d.m25454a();
            C8232x.this.f31006n.m25299s(this.f31015g, this.f31016h, strM25378A, jM25382E);
            C8232x.this.m25410v(this.f31014f);
            C8232x.this.m25424s(this.f31017i);
            C8232x.this.m25409u(new C8227s(C8232x.this.f30999g).toString(), Boolean.valueOf(this.f31018j));
            if (!C8232x.this.f30995c.m25239d()) {
                return Tasks.m23663e(null);
            }
            Executor executorM25374c = C8232x.this.f30998f.m25374c();
            return this.f31017i.mo26059a().mo23653p(executorM25374c, new a(executorM25374c, strM25378A));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$c */
    class c implements SuccessContinuation<Void, Boolean> {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Boolean> mo13778a(Void r1) throws Exception {
            return Tasks.m23663e(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$d */
    class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f31024a;

        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.h.n.x$d$a */
        class a implements Callable<Task<Void>> {

            /* renamed from: f */
            final /* synthetic */ Boolean f31026f;

            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.h.n.x$d$a$a, reason: collision with other inner class name */
            class C11497a implements SuccessContinuation<C8307d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f31028a;

                C11497a(Executor executor) {
                    this.f31028a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Task<Void> mo13778a(C8307d c8307d) throws Exception {
                    if (c8307d == null) {
                        C8179h.m25176f().m25185k("Received null app settings at app startup. Cannot send cached reports");
                        return Tasks.m23663e(null);
                    }
                    C8232x.this.m25385M();
                    C8232x.this.f31006n.m25302v(this.f31028a);
                    C8232x.this.f31011s.m23658e(null);
                    return Tasks.m23663e(null);
                }
            }

            a(Boolean bool) {
                this.f31026f = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task<Void> call() throws Exception {
                if (this.f31026f.booleanValue()) {
                    C8179h.m25176f().m25177b("Sending cached crash reports...");
                    C8232x.this.f30995c.m25238c(this.f31026f.booleanValue());
                    Executor executorM25374c = C8232x.this.f30998f.m25374c();
                    return d.this.f31024a.mo23653p(executorM25374c, new C11497a(executorM25374c));
                }
                C8179h.m25176f().m25183i("Deleting cached crash reports...");
                C8232x.m25407q(C8232x.this.m25417K());
                C8232x.this.f31006n.m25301u();
                C8232x.this.f31011s.m23658e(null);
                return Tasks.m23663e(null);
            }
        }

        d(Task task) {
            this.f31024a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> mo13778a(Boolean bool) throws Exception {
            return C8232x.this.f30998f.m25376h(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$e */
    class e implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ long f31030f;

        /* renamed from: g */
        final /* synthetic */ String f31031g;

        e(long j2, String str) {
            this.f31030f = j2;
            this.f31031g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (C8232x.this.m25416I()) {
                return null;
            }
            C8232x.this.f31002j.m25479g(this.f31030f, this.f31031g);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$f */
    class f implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ String f31033f;

        f(String str) {
            this.f31033f = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            C8232x.this.m25409u(this.f31033f, Boolean.FALSE);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.n.x$g */
    class g implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ long f31035f;

        g(long j2) {
            this.f31035f = j2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f31035f);
            C8232x.this.f31004l.mo25135a("_ae", bundle);
            return null;
        }
    }

    C8232x(Context context, C8231w c8231w, C8209i0 c8209i0, C8201e0 c8201e0, C8298f c8298f, C8234z c8234z, C8214l c8214l, C8246l c8246l, C8240f c8240f, C8221o0 c8221o0, InterfaceC8175d interfaceC8175d, InterfaceC8183a interfaceC8183a, C8230v c8230v) {
        this.f30994b = context;
        this.f30998f = c8231w;
        this.f30999g = c8209i0;
        this.f30995c = c8201e0;
        this.f31000h = c8298f;
        this.f30996d = c8234z;
        this.f31001i = c8214l;
        this.f30997e = c8246l;
        this.f31002j = c8240f;
        this.f31003k = interfaceC8175d;
        this.f31004l = interfaceC8183a;
        this.f31005m = c8230v;
        this.f31006n = c8221o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public String m25378A() {
        SortedSet<String> sortedSetM25297o = this.f31006n.m25297o();
        if (sortedSetM25297o.isEmpty()) {
            return null;
        }
        return sortedSetM25297o.first();
    }

    /* renamed from: B */
    private static long m25379B() {
        return m25382E(System.currentTimeMillis());
    }

    /* renamed from: C */
    static List<InterfaceC8215l0> m25380C(InterfaceC8180i interfaceC8180i, String str, C8298f c8298f, byte[] bArr) {
        File fileM26007o = c8298f.m26007o(str, "user-data");
        File fileM26007o2 = c8298f.m26007o(str, "keys");
        File fileM26007o3 = c8298f.m26007o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8226r("logs_file", "logs", bArr));
        arrayList.add(new C8207h0("crash_meta_file", "metadata", interfaceC8180i.mo25166g()));
        arrayList.add(new C8207h0("session_meta_file", "session", interfaceC8180i.mo25165f()));
        arrayList.add(new C8207h0("app_meta_file", "app", interfaceC8180i.mo25160a()));
        arrayList.add(new C8207h0("device_meta_file", "device", interfaceC8180i.mo25162c()));
        arrayList.add(new C8207h0("os_meta_file", "os", interfaceC8180i.mo25161b()));
        arrayList.add(m25387O(interfaceC8180i));
        arrayList.add(new C8207h0("user_meta_file", "user", fileM26007o));
        arrayList.add(new C8207h0("keys_file", "keys", fileM26007o2));
        arrayList.add(new C8207h0("rollouts_file", "rollouts", fileM26007o3));
        return arrayList;
    }

    /* renamed from: D */
    private InputStream m25381D(String str) {
        ClassLoader classLoader = C8232x.class.getClassLoader();
        if (classLoader == null) {
            C8179h.m25176f().m25185k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C8179h.m25176f().m25181g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static long m25382E(long j2) {
        return j2 / 1000;
    }

    /* renamed from: L */
    private Task<Void> m25384L(long j2) {
        if (m25412z()) {
            C8179h.m25176f().m25185k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.m23663e(null);
        }
        C8179h.m25176f().m25177b("Logging app exception event to Firebase Analytics");
        return Tasks.m23661c(new ScheduledThreadPoolExecutor(1), new g(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public Task<Void> m25385M() {
        ArrayList arrayList = new ArrayList();
        for (File file : m25417K()) {
            try {
                arrayList.add(m25384L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C8179h.m25176f().m25185k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.m23664f(arrayList);
    }

    /* renamed from: N */
    private static boolean m25386N(String str, File file, AbstractC8258f0.a aVar) {
        if (file == null || !file.exists()) {
            C8179h.m25176f().m25185k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C8179h.m25176f().m25181g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* renamed from: O */
    private static InterfaceC8215l0 m25387O(InterfaceC8180i interfaceC8180i) {
        File fileMo25164e = interfaceC8180i.mo25164e();
        return (fileMo25164e == null || !fileMo25164e.exists()) ? new C8226r("minidump_file", "minidump", new byte[]{0}) : new C8207h0("minidump_file", "minidump", fileMo25164e);
    }

    /* renamed from: Q */
    private static byte[] m25388Q(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: U */
    private Task<Boolean> m25389U() {
        if (this.f30995c.m25239d()) {
            C8179h.m25176f().m25177b("Automatic data collection is enabled. Allowing upload.");
            this.f31009q.m23658e(Boolean.FALSE);
            return Tasks.m23663e(Boolean.TRUE);
        }
        C8179h.m25176f().m25177b("Automatic data collection is disabled.");
        C8179h.m25176f().m25183i("Notifying that unsent reports are available.");
        this.f31009q.m23658e(Boolean.TRUE);
        Task<TContinuationResult> taskMo23652o = this.f30995c.m25240h().mo23652o(new c());
        C8179h.m25176f().m25177b("Waiting for send/deleteUnsentReports to be called.");
        return C8225q0.m25320i(taskMo23652o, this.f31010r.m23654a());
    }

    /* renamed from: V */
    private void m25390V(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            C8179h.m25176f().m25183i("ANR feature enabled, but device is API " + i2);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f30994b.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f31006n.m25300t(str, historicalProcessExitReasons, new C8240f(this.f31000h, str), C8246l.m25539h(str, this.f31000h, this.f30998f));
        } else {
            C8179h.m25176f().m25183i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* renamed from: n */
    private static AbstractC8260g0.a m25404n(C8209i0 c8209i0, C8214l c8214l) {
        return AbstractC8260g0.a.m25905b(c8209i0.m25263f(), c8214l.f30938f, c8214l.f30939g, c8209i0.mo25261a().mo25270c(), EnumC8203f0.m25242g(c8214l.f30936d).m25243k(), c8214l.f30940h);
    }

    /* renamed from: o */
    private static AbstractC8260g0.b m25405o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC8260g0.b.m25906c(C8228t.m25340k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C8228t.m25331b(context), statFs.getBlockCount() * statFs.getBlockSize(), C8228t.m25352w(), C8228t.m25341l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: p */
    private static AbstractC8260g0.c m25406p() {
        return AbstractC8260g0.c.m25907a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C8228t.m25353x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m25407q(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    private void m25408t(boolean z, InterfaceC8312i interfaceC8312i) throws IOException {
        ArrayList arrayList = new ArrayList(this.f31006n.m25297o());
        if (arrayList.size() <= z) {
            C8179h.m25176f().m25183i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (interfaceC8312i.mo26060b().f31595b.f31603b) {
            m25390V(str);
        } else {
            C8179h.m25176f().m25183i("ANR feature disabled.");
        }
        if (this.f31003k.mo25156d(str)) {
            m25411x(str);
        }
        String str2 = null;
        if (z != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.f31005m.m25368e(null);
        }
        this.f31006n.m25295i(m25379B(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m25409u(String str, Boolean bool) {
        long jM25379B = m25379B();
        C8179h.m25176f().m25177b("Opening a new session with ID " + str);
        this.f31003k.mo25155c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C8233y.m25442i()), jM25379B, AbstractC8260g0.m25904b(m25404n(this.f30999g, this.f31001i), m25406p(), m25405o(this.f30994b)));
        if (bool.booleanValue() && str != null) {
            this.f30997e.m25546k(str);
        }
        this.f31002j.m25477e(str);
        this.f31005m.m25368e(str);
        this.f31006n.m25298p(str, jM25379B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m25410v(long j2) throws IOException {
        try {
            if (this.f31000h.m25998e(".ae" + j2).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            C8179h.m25176f().m25186l("Could not create app exception marker file.", e2);
        }
    }

    /* renamed from: x */
    private void m25411x(String str) throws IOException {
        C8179h.m25176f().m25183i("Finalizing native report for session " + str);
        InterfaceC8180i interfaceC8180iMo25153a = this.f31003k.mo25153a(str);
        File fileMo25164e = interfaceC8180iMo25153a.mo25164e();
        AbstractC8258f0.a aVarMo25163d = interfaceC8180iMo25153a.mo25163d();
        if (m25386N(str, fileMo25164e, aVarMo25163d)) {
            C8179h.m25176f().m25185k("No native core present");
            return;
        }
        long jLastModified = fileMo25164e.lastModified();
        C8240f c8240f = new C8240f(this.f31000h, str);
        File fileM26002i = this.f31000h.m26002i(str);
        if (!fileM26002i.isDirectory()) {
            C8179h.m25176f().m25185k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m25410v(jLastModified);
        List<InterfaceC8215l0> listM25380C = m25380C(interfaceC8180iMo25153a, str, this.f31000h, c8240f.m25475b());
        C8217m0.m25277b(fileM26002i, listM25380C);
        C8179h.m25176f().m25177b("CrashlyticsController#finalizePreviousNativeSession");
        this.f31006n.m25294h(str, listM25380C, aVarMo25163d);
        c8240f.m25474a();
    }

    /* renamed from: z */
    private static boolean m25412z() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: F */
    String m25413F() throws IOException {
        InputStream inputStreamM25381D = m25381D("META-INF/version-control-info.textproto");
        if (inputStreamM25381D == null) {
            return null;
        }
        C8179h.m25176f().m25177b("Read version control info");
        return Base64.encodeToString(m25388Q(inputStreamM25381D), 0);
    }

    /* renamed from: G */
    void m25414G(InterfaceC8312i interfaceC8312i, Thread thread, Throwable th) {
        m25415H(interfaceC8312i, thread, th, false);
    }

    /* renamed from: H */
    synchronized void m25415H(InterfaceC8312i interfaceC8312i, Thread thread, Throwable th, boolean z) {
        C8179h.m25176f().m25177b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C8225q0.m25312a(this.f30998f.m25376h(new b(System.currentTimeMillis(), th, thread, interfaceC8312i, z)));
        } catch (TimeoutException unused) {
            C8179h.m25176f().m25179d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            C8179h.m25176f().m25180e("Error handling uncaught exception", e2);
        }
    }

    /* renamed from: I */
    boolean m25416I() {
        C8197c0 c8197c0 = this.f31007o;
        return c8197c0 != null && c8197c0.m25230a();
    }

    /* renamed from: K */
    List<File> m25417K() {
        return this.f31000h.m25999f(f30993a);
    }

    /* renamed from: P */
    void m25418P(String str) {
        this.f30998f.m25375g(new f(str));
    }

    /* renamed from: R */
    void m25419R() {
        try {
            String strM25413F = m25413F();
            if (strM25413F != null) {
                m25420S("com.crashlytics.version-control-info", strM25413F);
                C8179h.m25176f().m25181g("Saved version control info");
            }
        } catch (IOException e2) {
            C8179h.m25176f().m25186l("Unable to save version control info", e2);
        }
    }

    /* renamed from: S */
    void m25420S(String str, String str2) {
        try {
            this.f30997e.m25545j(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.f30994b;
            if (context != null && C8228t.m25350u(context)) {
                throw e2;
            }
            C8179h.m25176f().m25179d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: T */
    Task<Void> m25421T(Task<C8307d> task) {
        if (this.f31006n.m25296l()) {
            C8179h.m25176f().m25183i("Crash reports are available to be sent.");
            return m25389U().mo23652o(new d(task));
        }
        C8179h.m25176f().m25183i("No crash reports are available to be sent.");
        this.f31009q.m23658e(Boolean.FALSE);
        return Tasks.m23663e(null);
    }

    /* renamed from: W */
    void m25422W(long j2, String str) {
        this.f30998f.m25375g(new e(j2, str));
    }

    /* renamed from: r */
    boolean m25423r() {
        if (!this.f30996d.m25455c()) {
            String strM25378A = m25378A();
            return strM25378A != null && this.f31003k.mo25156d(strM25378A);
        }
        C8179h.m25176f().m25183i("Found previous crash marker.");
        this.f30996d.m25456d();
        return true;
    }

    /* renamed from: s */
    void m25424s(InterfaceC8312i interfaceC8312i) throws IOException {
        m25408t(false, interfaceC8312i);
    }

    /* renamed from: w */
    void m25425w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC8312i interfaceC8312i) {
        this.f31008p = interfaceC8312i;
        m25418P(str);
        C8197c0 c8197c0 = new C8197c0(new a(), interfaceC8312i, uncaughtExceptionHandler, this.f31003k);
        this.f31007o = c8197c0;
        Thread.setDefaultUncaughtExceptionHandler(c8197c0);
    }

    /* renamed from: y */
    boolean m25426y(InterfaceC8312i interfaceC8312i) {
        this.f30998f.m25373b();
        if (m25416I()) {
            C8179h.m25176f().m25185k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C8179h.m25176f().m25183i("Finalizing previously open sessions.");
        try {
            m25408t(true, interfaceC8312i);
            C8179h.m25176f().m25183i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            C8179h.m25176f().m25180e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
