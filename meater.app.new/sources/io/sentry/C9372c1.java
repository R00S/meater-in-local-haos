package io.sentry;

import io.sentry.util.C9646q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DefaultTransactionPerformanceCollector.java */
@ApiStatus.Internal
/* renamed from: io.sentry.c1 */
/* loaded from: classes2.dex */
public final class C9372c1 implements InterfaceC9629u5 {

    /* renamed from: d */
    private final List<InterfaceC9577r1> f36181d;

    /* renamed from: e */
    private final C9680x4 f36182e;

    /* renamed from: a */
    private final Object f36178a = new Object();

    /* renamed from: b */
    private volatile Timer f36179b = null;

    /* renamed from: c */
    private final Map<String, List<C9498k3>> f36180c = new ConcurrentHashMap();

    /* renamed from: f */
    private final AtomicBoolean f36183f = new AtomicBoolean(false);

    /* compiled from: DefaultTransactionPerformanceCollector.java */
    /* renamed from: io.sentry.c1$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = C9372c1.this.f36181d.iterator();
            while (it.hasNext()) {
                ((InterfaceC9577r1) it.next()).setup();
            }
        }
    }

    /* compiled from: DefaultTransactionPerformanceCollector.java */
    /* renamed from: io.sentry.c1$b */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C9498k3 c9498k3 = new C9498k3();
            Iterator it = C9372c1.this.f36181d.iterator();
            while (it.hasNext()) {
                ((InterfaceC9577r1) it.next()).mo30203a(c9498k3);
            }
            Iterator it2 = C9372c1.this.f36180c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(c9498k3);
            }
        }
    }

    public C9372c1(C9680x4 c9680x4) {
        this.f36182e = (C9680x4) C9646q.m31802c(c9680x4, "The options object is required.");
        this.f36181d = c9680x4.getCollectors();
    }

    @Override // io.sentry.InterfaceC9629u5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C9498k3> m30545f(InterfaceC9426e2 interfaceC9426e2) {
        List<C9498k3> listRemove = this.f36180c.remove(interfaceC9426e2.mo30525k().toString());
        this.f36182e.getLogger().mo30214c(EnumC9587s4.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC9426e2.getName(), interfaceC9426e2.mo30527m().m30803k().toString());
        if (this.f36180c.isEmpty() && this.f36183f.getAndSet(false)) {
            synchronized (this.f36178a) {
                if (this.f36179b != null) {
                    this.f36179b.cancel();
                    this.f36179b = null;
                }
            }
        }
        return listRemove;
    }

    @Override // io.sentry.InterfaceC9629u5
    /* renamed from: b */
    public void mo30544b(final InterfaceC9426e2 interfaceC9426e2) {
        if (this.f36181d.isEmpty()) {
            this.f36182e.getLogger().mo30214c(EnumC9587s4.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f36180c.containsKey(interfaceC9426e2.mo30525k().toString())) {
            this.f36180c.put(interfaceC9426e2.mo30525k().toString(), new ArrayList());
            try {
                this.f36182e.getExecutorService().mo30030b(new Runnable() { // from class: io.sentry.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35741f.m30545f(interfaceC9426e2);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e2) {
                this.f36182e.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e2);
            }
        }
        if (this.f36183f.getAndSet(true)) {
            return;
        }
        synchronized (this.f36178a) {
            if (this.f36179b == null) {
                this.f36179b = new Timer(true);
            }
            this.f36179b.schedule(new a(), 0L);
            this.f36179b.scheduleAtFixedRate(new b(), 100L, 100L);
        }
    }

    @Override // io.sentry.InterfaceC9629u5
    public void close() {
        this.f36180c.clear();
        this.f36182e.getLogger().mo30214c(EnumC9587s4.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        if (this.f36183f.getAndSet(false)) {
            synchronized (this.f36178a) {
                if (this.f36179b != null) {
                    this.f36179b.cancel();
                    this.f36179b = null;
                }
            }
        }
    }
}
