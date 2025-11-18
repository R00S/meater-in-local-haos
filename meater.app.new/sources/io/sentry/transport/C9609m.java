package io.sentry.transport;

import io.sentry.C9244a1;
import io.sentry.C9449h4;
import io.sentry.C9517n1;
import io.sentry.C9533p3;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.InterfaceC9394r;
import io.sentry.clientreport.EnumC9401e;
import io.sentry.hints.InterfaceC9456f;
import io.sentry.hints.InterfaceC9457g;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.hints.InterfaceC9466p;
import io.sentry.util.C9642m;
import io.sentry.util.C9645p;
import io.sentry.util.C9646q;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncHttpTransport.java */
/* renamed from: io.sentry.transport.m */
/* loaded from: classes2.dex */
public final class C9609m implements InterfaceC9614r {

    /* renamed from: f */
    private final C9620x f36881f;

    /* renamed from: g */
    private final InterfaceC9394r f36882g;

    /* renamed from: h */
    private final C9680x4 f36883h;

    /* renamed from: i */
    private final C9621y f36884i;

    /* renamed from: j */
    private final InterfaceC9615s f36885j;

    /* renamed from: k */
    private final C9612p f36886k;

    /* compiled from: AsyncHttpTransport.java */
    /* renamed from: io.sentry.transport.m$b */
    private static final class b implements ThreadFactory {

        /* renamed from: f */
        private int f36887f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryAsyncConnection-");
            int i2 = this.f36887f;
            this.f36887f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncHttpTransport.java */
    /* renamed from: io.sentry.transport.m$c */
    final class c implements Runnable {

        /* renamed from: f */
        private final C9449h4 f36888f;

        /* renamed from: g */
        private final C9517n1 f36889g;

        /* renamed from: h */
        private final InterfaceC9394r f36890h;

        /* renamed from: i */
        private final AbstractC9597a0 f36891i = AbstractC9597a0.m31661a();

        c(C9449h4 c9449h4, C9517n1 c9517n1, InterfaceC9394r interfaceC9394r) {
            this.f36888f = (C9449h4) C9646q.m31802c(c9449h4, "Envelope is required.");
            this.f36889g = c9517n1;
            this.f36890h = (InterfaceC9394r) C9646q.m31802c(interfaceC9394r, "EnvelopeCache is required.");
        }

        /* renamed from: c */
        private AbstractC9597a0 m31679c() {
            AbstractC9597a0 abstractC9597a0 = this.f36891i;
            this.f36888f.m30831b().m30852d(null);
            this.f36890h.mo30163Z(this.f36888f, this.f36889g);
            C9642m.m31788k(this.f36889g, InterfaceC9457g.class, new C9642m.a() { // from class: io.sentry.transport.c
                @Override // io.sentry.util.C9642m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    this.f36869a.m31687e((InterfaceC9457g) obj);
                }
            });
            if (!C9609m.this.f36885j.isConnected()) {
                C9642m.m31789l(this.f36889g, InterfaceC9461k.class, new C9642m.a() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9461k) obj).mo30476d(true);
                    }
                }, new C9642m.b() { // from class: io.sentry.transport.d
                    @Override // io.sentry.util.C9642m.b
                    /* renamed from: a */
                    public final void mo31660a(Object obj, Class cls) {
                        this.f36870a.m31690m(obj, cls);
                    }
                });
                return abstractC9597a0;
            }
            final C9449h4 c9449h4Mo30692c = C9609m.this.f36883h.getClientReportRecorder().mo30692c(this.f36888f);
            try {
                c9449h4Mo30692c.m30831b().m30852d(C9244a1.m30015j(C9609m.this.f36883h.getDateProvider().mo30210a().mo30792x()));
                AbstractC9597a0 abstractC9597a0M31702h = C9609m.this.f36886k.m31702h(c9449h4Mo30692c);
                if (abstractC9597a0M31702h.mo31665d()) {
                    this.f36890h.mo30636p(this.f36888f);
                    return abstractC9597a0M31702h;
                }
                String str = "The transport failed to send the envelope with response code " + abstractC9597a0M31702h.mo31664c();
                C9609m.this.f36883h.getLogger().mo30214c(EnumC9587s4.ERROR, str, new Object[0]);
                if (abstractC9597a0M31702h.mo31664c() >= 400 && abstractC9597a0M31702h.mo31664c() != 429) {
                    C9642m.m31787j(this.f36889g, InterfaceC9461k.class, new C9642m.c() { // from class: io.sentry.transport.b
                        @Override // io.sentry.util.C9642m.c
                        /* renamed from: a */
                        public final void mo31666a(Object obj) {
                            this.f36867a.m31688g(c9449h4Mo30692c, obj);
                        }
                    });
                }
                throw new IllegalStateException(str);
            } catch (IOException e2) {
                C9642m.m31789l(this.f36889g, InterfaceC9461k.class, new C9642m.a() { // from class: io.sentry.transport.e
                    @Override // io.sentry.util.C9642m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9461k) obj).mo30476d(true);
                    }
                }, new C9642m.b() { // from class: io.sentry.transport.a
                    @Override // io.sentry.util.C9642m.b
                    /* renamed from: a */
                    public final void mo31660a(Object obj, Class cls) {
                        this.f36863a.m31689j(c9449h4Mo30692c, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31687e(InterfaceC9457g interfaceC9457g) {
            interfaceC9457g.mo30836b();
            C9609m.this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Disk flush envelope fired", new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31688g(C9449h4 c9449h4, Object obj) {
            C9609m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9401e.NETWORK_ERROR, c9449h4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31689j(C9449h4 c9449h4, Object obj, Class cls) {
            C9645p.m31799a(cls, obj, C9609m.this.f36883h.getLogger());
            C9609m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9401e.NETWORK_ERROR, c9449h4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31690m(Object obj, Class cls) {
            C9645p.m31799a(cls, obj, C9609m.this.f36883h.getLogger());
            C9609m.this.f36883h.getClientReportRecorder().mo30691b(EnumC9401e.NETWORK_ERROR, this.f36888f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m31691o(AbstractC9597a0 abstractC9597a0, InterfaceC9466p interfaceC9466p) {
            C9609m.this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC9597a0.mo31665d()));
            interfaceC9466p.mo30475c(abstractC9597a0.mo31665d());
        }

        @Override // java.lang.Runnable
        public void run() {
            final AbstractC9597a0 abstractC9597a0M31679c = this.f36891i;
            try {
                abstractC9597a0M31679c = m31679c();
                C9609m.this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public C9609m(C9680x4 c9680x4, C9621y c9621y, InterfaceC9615s interfaceC9615s, C9533p3 c9533p3) {
        this(m31670d(c9680x4.getMaxQueueSize(), c9680x4.getEnvelopeDiskCache(), c9680x4.getLogger()), c9680x4, c9621y, interfaceC9615s, new C9612p(c9680x4, c9533p3, c9621y));
    }

    /* renamed from: d */
    private static C9620x m31670d(int i2, final InterfaceC9394r interfaceC9394r, final InterfaceC9670w1 interfaceC9670w1) {
        return new C9620x(1, i2, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.h
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C9609m.m31671e(interfaceC9394r, interfaceC9670w1, runnable, threadPoolExecutor);
            }
        }, interfaceC9670w1);
    }

    /* renamed from: e */
    static /* synthetic */ void m31671e(InterfaceC9394r interfaceC9394r, InterfaceC9670w1 interfaceC9670w1, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!C9642m.m31781d(cVar.f36889g, InterfaceC9456f.class)) {
                interfaceC9394r.mo30163Z(cVar.f36888f, cVar.f36889g);
            }
            m31674k(cVar.f36889g, true);
            interfaceC9670w1.mo30214c(EnumC9587s4.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    /* renamed from: k */
    private static void m31674k(C9517n1 c9517n1, final boolean z) {
        C9642m.m31788k(c9517n1, InterfaceC9466p.class, new C9642m.a() { // from class: io.sentry.transport.i
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9466p) obj).mo30475c(false);
            }
        });
        C9642m.m31788k(c9517n1, InterfaceC9461k.class, new C9642m.a() { // from class: io.sentry.transport.j
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9461k) obj).mo30476d(z);
            }
        });
    }

    @Override // io.sentry.transport.InterfaceC9614r
    /* renamed from: V */
    public void mo31675V(C9449h4 c9449h4, C9517n1 c9517n1) throws IOException {
        InterfaceC9394r interfaceC9394rM31704c = this.f36882g;
        boolean z = false;
        if (C9642m.m31781d(c9517n1, InterfaceC9456f.class)) {
            interfaceC9394rM31704c = C9616t.m31704c();
            this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z = true;
        }
        C9449h4 c9449h4M31716b = this.f36884i.m31716b(c9449h4, c9517n1);
        if (c9449h4M31716b == null) {
            if (z) {
                this.f36882g.mo30636p(c9449h4);
                return;
            }
            return;
        }
        if (C9642m.m31781d(c9517n1, UncaughtExceptionHandlerIntegration.C9241a.class)) {
            c9449h4M31716b = this.f36883h.getClientReportRecorder().mo30692c(c9449h4M31716b);
        }
        Future<?> futureSubmit = this.f36881f.submit(new c(c9449h4M31716b, c9517n1, interfaceC9394rM31704c));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            return;
        }
        this.f36883h.getClientReportRecorder().mo30691b(EnumC9401e.QUEUE_OVERFLOW, c9449h4M31716b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36881f.shutdown();
        this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Shutting down", new Object[0]);
        try {
            if (this.f36881f.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            this.f36883h.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            this.f36881f.shutdownNow();
        } catch (InterruptedException unused) {
            this.f36883h.getLogger().mo30214c(EnumC9587s4.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.InterfaceC9614r
    /* renamed from: h */
    public void mo31676h(long j2) {
        this.f36881f.m31708b(j2);
    }

    public C9609m(C9620x c9620x, C9680x4 c9680x4, C9621y c9621y, InterfaceC9615s interfaceC9615s, C9612p c9612p) {
        this.f36881f = (C9620x) C9646q.m31802c(c9620x, "executor is required");
        this.f36882g = (InterfaceC9394r) C9646q.m31802c(c9680x4.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f36883h = (C9680x4) C9646q.m31802c(c9680x4, "options is required");
        this.f36884i = (C9621y) C9646q.m31802c(c9621y, "rateLimiter is required");
        this.f36885j = (InterfaceC9615s) C9646q.m31802c(interfaceC9615s, "transportGate is required");
        this.f36886k = (C9612p) C9646q.m31802c(c9612p, "httpConnection is required");
    }
}
