package io.sentry;

import io.sentry.cache.C9393q;
import io.sentry.config.C9413h;
import io.sentry.internal.debugmeta.C9476b;
import io.sentry.internal.debugmeta.C9477c;
import io.sentry.internal.modules.C9480a;
import io.sentry.internal.modules.C9482c;
import io.sentry.internal.modules.C9484e;
import io.sentry.internal.modules.C9485f;
import io.sentry.internal.modules.InterfaceC9481b;
import io.sentry.protocol.C9558q;
import io.sentry.transport.C9616t;
import io.sentry.util.C9639j;
import io.sentry.util.C9641l;
import io.sentry.util.thread.C9652c;
import io.sentry.util.thread.C9653d;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Sentry.java */
/* renamed from: io.sentry.a4 */
/* loaded from: classes.dex */
public final class C9247a4 {

    /* renamed from: a */
    private static final ThreadLocal<InterfaceC9658v1> f35746a = new ThreadLocal<>();

    /* renamed from: b */
    private static volatile InterfaceC9658v1 f35747b = C9684y2.m31957a();

    /* renamed from: c */
    private static volatile boolean f35748c = false;

    /* compiled from: Sentry.java */
    /* renamed from: io.sentry.a4$a */
    public interface a<T extends C9680x4> {
        /* renamed from: a */
        void mo8271a(T t);
    }

    /* renamed from: a */
    public static void m30031a(C9657v0 c9657v0, C9517n1 c9517n1) {
        m30040j().mo31153n(c9657v0, c9517n1);
    }

    /* renamed from: b */
    private static <T extends C9680x4> void m30032b(a<T> aVar, T t) {
        try {
            aVar.mo8271a(t);
        } catch (Throwable th) {
            t.getLogger().mo30213b(EnumC9587s4.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    /* renamed from: c */
    public static C9558q m30033c(C9506l4 c9506l4) {
        return m30040j().mo31150k(c9506l4);
    }

    /* renamed from: d */
    public static C9558q m30034d(C9506l4 c9506l4, C9517n1 c9517n1) {
        return m30040j().mo31159t(c9506l4, c9517n1);
    }

    /* renamed from: e */
    public static synchronized void m30035e() {
        InterfaceC9658v1 interfaceC9658v1M30040j = m30040j();
        f35747b = C9684y2.m31957a();
        f35746a.remove();
        interfaceC9658v1M30040j.close();
    }

    /* renamed from: f */
    public static void m30036f(InterfaceC9593t3 interfaceC9593t3) {
        m30040j().mo31154o(interfaceC9593t3);
    }

    /* renamed from: g */
    public static void m30037g() {
        m30040j().endSession();
    }

    /* renamed from: h */
    private static void m30038h(C9680x4 c9680x4, InterfaceC9658v1 interfaceC9658v1) {
        try {
            c9680x4.getExecutorService().submit(new RunnableC9505l3(c9680x4, interfaceC9658v1));
        } catch (Throwable th) {
            c9680x4.getLogger().mo30213b(EnumC9587s4.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    /* renamed from: i */
    public static void m30039i(long j2) {
        m30040j().mo31147h(j2);
    }

    @ApiStatus.Internal
    /* renamed from: j */
    public static InterfaceC9658v1 m30040j() {
        if (f35748c) {
            return f35747b;
        }
        ThreadLocal<InterfaceC9658v1> threadLocal = f35746a;
        InterfaceC9658v1 interfaceC9658v1 = threadLocal.get();
        if (interfaceC9658v1 != null && !(interfaceC9658v1 instanceof C9684y2)) {
            return interfaceC9658v1;
        }
        InterfaceC9658v1 interfaceC9658v1Clone = f35747b.m41050clone();
        threadLocal.set(interfaceC9658v1Clone);
        return interfaceC9658v1Clone;
    }

    /* renamed from: k */
    public static <T extends C9680x4> void m30041k(C9472i3<T> c9472i3, a<T> aVar, boolean z) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        T tM30848b = c9472i3.m30848b();
        m30032b(aVar, tM30848b);
        m30044n(tM30848b, z);
    }

    /* renamed from: l */
    public static void m30042l(a<C9680x4> aVar) {
        m30043m(aVar, false);
    }

    /* renamed from: m */
    public static void m30043m(a<C9680x4> aVar, boolean z) {
        C9680x4 c9680x4 = new C9680x4();
        m30032b(aVar, c9680x4);
        m30044n(c9680x4, z);
    }

    /* renamed from: n */
    private static synchronized void m30044n(C9680x4 c9680x4, boolean z) {
        if (m30046p()) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
        }
        if (m30045o(c9680x4)) {
            c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
            f35748c = z;
            InterfaceC9658v1 interfaceC9658v1M30040j = m30040j();
            f35747b = new C9531p1(c9680x4);
            f35746a.set(f35747b);
            interfaceC9658v1M30040j.close();
            if (c9680x4.getExecutorService().isClosed()) {
                c9680x4.setExecutorService(new C9520n4());
            }
            Iterator<Integration> it = c9680x4.getIntegrations().iterator();
            while (it.hasNext()) {
                it.next().mo30001c(C9570q1.m31548a(), c9680x4);
            }
            m30049s(c9680x4);
            m30038h(c9680x4, C9570q1.m31548a());
        }
    }

    /* renamed from: o */
    private static boolean m30045o(C9680x4 c9680x4) {
        if (c9680x4.isEnableExternalConfiguration()) {
            c9680x4.merge(C9503l1.m30928g(C9413h.m30716a(), c9680x4.getLogger()));
        }
        String dsn = c9680x4.getDsn();
        if (!c9680x4.isEnabled() || (dsn != null && dsn.isEmpty())) {
            m30035e();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        new C9432f1(dsn);
        InterfaceC9670w1 logger = c9680x4.getLogger();
        if (c9680x4.isDebug() && (logger instanceof C9690z2)) {
            c9680x4.setLogger(new C9521n5());
            logger = c9680x4.getLogger();
        }
        EnumC9587s4 enumC9587s4 = EnumC9587s4.INFO;
        logger.mo30214c(enumC9587s4, "Initializing SDK with DSN: '%s'", c9680x4.getDsn());
        String outboxPath = c9680x4.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.mo30214c(enumC9587s4, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = c9680x4.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (c9680x4.getEnvelopeDiskCache() instanceof C9616t) {
                c9680x4.setEnvelopeDiskCache(C9393q.m30633x(c9680x4));
            }
        }
        String profilingTracesDirPath = c9680x4.getProfilingTracesDirPath();
        if (c9680x4.isProfilingEnabled() && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            final File[] fileArrListFiles = file.listFiles();
            try {
                c9680x4.getExecutorService().submit(new Runnable() { // from class: io.sentry.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9247a4.m30047q(fileArrListFiles);
                    }
                });
            } catch (RejectedExecutionException e2) {
                c9680x4.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        InterfaceC9481b modulesLoader = c9680x4.getModulesLoader();
        if (!c9680x4.isSendModules()) {
            c9680x4.setModulesLoader(C9484e.m30873b());
        } else if (modulesLoader instanceof C9484e) {
            c9680x4.setModulesLoader(new C9480a(Arrays.asList(new C9482c(c9680x4.getLogger()), new C9485f(c9680x4.getLogger())), c9680x4.getLogger()));
        }
        if (c9680x4.getDebugMetaLoader() instanceof C9476b) {
            c9680x4.setDebugMetaLoader(new C9477c(c9680x4.getLogger()));
        }
        C9639j.m31772c(c9680x4, c9680x4.getDebugMetaLoader().mo30216a());
        if (c9680x4.getMainThreadChecker() instanceof C9653d) {
            c9680x4.setMainThreadChecker(C9652c.m31815e());
        }
        if (c9680x4.getCollectors().isEmpty()) {
            c9680x4.addCollector(new C9497k2());
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m30046p() {
        return m30040j().isEnabled();
    }

    /* renamed from: q */
    static /* synthetic */ void m30047q(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            C9641l.m31775a(file);
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m30048r(C9680x4 c9680x4) {
        for (InterfaceC9677x1 interfaceC9677x1 : c9680x4.getOptionsObservers()) {
            interfaceC9677x1.mo30655f(c9680x4.getRelease());
            interfaceC9677x1.mo30654e(c9680x4.getProguardUuid());
            interfaceC9677x1.mo30651b(c9680x4.getSdkVersion());
            interfaceC9677x1.mo30652c(c9680x4.getDist());
            interfaceC9677x1.mo30653d(c9680x4.getEnvironment());
            interfaceC9677x1.mo30650a(c9680x4.getTags());
        }
    }

    /* renamed from: s */
    private static void m30049s(final C9680x4 c9680x4) {
        try {
            c9680x4.getExecutorService().submit(new Runnable() { // from class: io.sentry.u
                @Override // java.lang.Runnable
                public final void run() {
                    C9247a4.m30048r(c9680x4);
                }
            });
        } catch (Throwable th) {
            c9680x4.getLogger().mo30213b(EnumC9587s4.DEBUG, "Failed to notify options observers.", th);
        }
    }

    /* renamed from: t */
    public static void m30050t() {
        m30040j().startSession();
    }

    /* renamed from: u */
    public static InterfaceC9426e2 m30051u(C9581r5 c9581r5, C9595t5 c9595t5) {
        return m30040j().mo31151l(c9581r5, c9595t5);
    }
}
