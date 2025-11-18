package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.transport.InterfaceC9613q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ANRWatchDog.java */
/* renamed from: io.sentry.android.core.e0 */
/* loaded from: classes2.dex */
final class C9275e0 extends Thread {

    /* renamed from: f */
    private final boolean f35880f;

    /* renamed from: g */
    private final a f35881g;

    /* renamed from: h */
    private final C9268c1 f35882h;

    /* renamed from: i */
    private final InterfaceC9613q f35883i;

    /* renamed from: j */
    private long f35884j;

    /* renamed from: k */
    private final long f35885k;

    /* renamed from: l */
    private final InterfaceC9670w1 f35886l;

    /* renamed from: m */
    private volatile long f35887m;

    /* renamed from: n */
    private final AtomicBoolean f35888n;

    /* renamed from: o */
    private final Context f35889o;

    /* renamed from: p */
    private final Runnable f35890p;

    /* compiled from: ANRWatchDog.java */
    /* renamed from: io.sentry.android.core.e0$a */
    public interface a {
        /* renamed from: a */
        void mo30178a(ApplicationNotResponding applicationNotResponding);
    }

    C9275e0(long j2, boolean z, a aVar, InterfaceC9670w1 interfaceC9670w1, Context context) {
        this(new InterfaceC9613q() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.InterfaceC9613q
            /* renamed from: a */
            public final long mo30147a() {
                return SystemClock.uptimeMillis();
            }
        }, j2, 500L, z, aVar, interfaceC9670w1, new C9268c1(), context);
    }

    /* renamed from: a */
    private boolean m30174a() {
        ActivityManager activityManager = (ActivityManager) this.f35889o.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = null;
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.f35886l.mo30213b(EnumC9587s4.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30177d(InterfaceC9613q interfaceC9613q) {
        this.f35887m = interfaceC9613q.mo30147a();
        this.f35888n.set(false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        this.f35890p.run();
        while (!isInterrupted()) {
            this.f35882h.m30155b(this.f35890p);
            try {
                Thread.sleep(this.f35884j);
                if (this.f35883i.mo30147a() - this.f35887m > this.f35885k) {
                    if (!this.f35880f && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f35886l.mo30214c(EnumC9587s4.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f35888n.set(true);
                    } else if (m30174a() && this.f35888n.compareAndSet(false, true)) {
                        this.f35881g.mo30178a(new ApplicationNotResponding("Application Not Responding for at least " + this.f35885k + " ms.", this.f35882h.m30154a()));
                    }
                }
            } catch (InterruptedException e2) {
                try {
                    Thread.currentThread().interrupt();
                    this.f35886l.mo30214c(EnumC9587s4.WARNING, "Interrupted: %s", e2.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f35886l.mo30214c(EnumC9587s4.WARNING, "Failed to interrupt due to SecurityException: %s", e2.getMessage());
                    return;
                }
            }
        }
    }

    C9275e0(final InterfaceC9613q interfaceC9613q, long j2, long j3, boolean z, a aVar, InterfaceC9670w1 interfaceC9670w1, C9268c1 c9268c1, Context context) {
        super("|ANR-WatchDog|");
        this.f35887m = 0L;
        this.f35888n = new AtomicBoolean(false);
        this.f35883i = interfaceC9613q;
        this.f35885k = j2;
        this.f35884j = j3;
        this.f35880f = z;
        this.f35881g = aVar;
        this.f35886l = interfaceC9670w1;
        this.f35882h = c9268c1;
        this.f35889o = context;
        this.f35890p = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f35859f.m30177d(interfaceC9613q);
            }
        };
        if (j2 < j3 * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f35884j * 2)));
        }
    }
}
