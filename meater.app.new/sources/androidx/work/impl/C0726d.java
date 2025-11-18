package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0255a;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import androidx.work.C0709h;
import androidx.work.WorkerParameters;
import androidx.work.impl.RunnableC0738k;
import androidx.work.impl.foreground.C0733b;
import androidx.work.impl.foreground.InterfaceC0732a;
import androidx.work.impl.utils.C0791j;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: Processor.java */
/* renamed from: androidx.work.impl.d */
/* loaded from: classes.dex */
public class C0726d implements InterfaceC0715b, InterfaceC0732a {

    /* renamed from: f */
    private static final String f4597f = AbstractC0807n.m5223f("Processor");

    /* renamed from: h */
    private Context f4599h;

    /* renamed from: i */
    private C0703b f4600i;

    /* renamed from: j */
    private InterfaceC0799a f4601j;

    /* renamed from: k */
    private WorkDatabase f4602k;

    /* renamed from: n */
    private List<InterfaceC0727e> f4605n;

    /* renamed from: m */
    private Map<String, RunnableC0738k> f4604m = new HashMap();

    /* renamed from: l */
    private Map<String, RunnableC0738k> f4603l = new HashMap();

    /* renamed from: o */
    private Set<String> f4606o = new HashSet();

    /* renamed from: p */
    private final List<InterfaceC0715b> f4607p = new ArrayList();

    /* renamed from: g */
    private PowerManager.WakeLock f4598g = null;

    /* renamed from: q */
    private final Object f4608q = new Object();

    /* compiled from: Processor.java */
    /* renamed from: androidx.work.impl.d$a */
    private static class a implements Runnable {

        /* renamed from: f */
        private InterfaceC0715b f4609f;

        /* renamed from: g */
        private String f4610g;

        /* renamed from: h */
        private InterfaceFutureC8955a<Boolean> f4611h;

        a(InterfaceC0715b interfaceC0715b, String str, InterfaceFutureC8955a<Boolean> interfaceFutureC8955a) {
            this.f4609f = interfaceC0715b;
            this.f4610g = str;
            this.f4611h = interfaceFutureC8955a;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f4611h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f4609f.mo4869d(this.f4610g, zBooleanValue);
        }
    }

    public C0726d(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, WorkDatabase workDatabase, List<InterfaceC0727e> list) {
        this.f4599h = context;
        this.f4600i = c0703b;
        this.f4601j = interfaceC0799a;
        this.f4602k = workDatabase;
        this.f4605n = list;
    }

    /* renamed from: e */
    private static boolean m4928e(String str, RunnableC0738k runnableC0738k) {
        if (runnableC0738k == null) {
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC0738k.m5015d();
        AbstractC0807n.m5221c().mo5224a(f4597f, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* renamed from: m */
    private void m4929m() {
        synchronized (this.f4608q) {
            if (!(!this.f4603l.isEmpty())) {
                try {
                    this.f4599h.startService(C0733b.m4951f(this.f4599h));
                } catch (Throwable th) {
                    AbstractC0807n.m5221c().mo5225b(f4597f, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f4598g;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f4598g = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.InterfaceC0732a
    /* renamed from: a */
    public void mo4930a(String str, C0709h c0709h) {
        synchronized (this.f4608q) {
            AbstractC0807n.m5221c().mo5226d(f4597f, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC0738k runnableC0738kRemove = this.f4604m.remove(str);
            if (runnableC0738kRemove != null) {
                if (this.f4598g == null) {
                    PowerManager.WakeLock wakeLockM5171b = C0791j.m5171b(this.f4599h, "ProcessorForegroundLck");
                    this.f4598g = wakeLockM5171b;
                    wakeLockM5171b.acquire();
                }
                this.f4603l.put(str, runnableC0738kRemove);
                C0255a.m1683l(this.f4599h, C0733b.m4950c(this.f4599h, str, c0709h));
            }
        }
    }

    @Override // androidx.work.impl.foreground.InterfaceC0732a
    /* renamed from: b */
    public void mo4931b(String str) {
        synchronized (this.f4608q) {
            this.f4603l.remove(str);
            m4929m();
        }
    }

    /* renamed from: c */
    public void m4932c(InterfaceC0715b interfaceC0715b) {
        synchronized (this.f4608q) {
            this.f4607p.add(interfaceC0715b);
        }
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        synchronized (this.f4608q) {
            this.f4604m.remove(str);
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator<InterfaceC0715b> it = this.f4607p.iterator();
            while (it.hasNext()) {
                it.next().mo4869d(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean m4933f(String str) {
        boolean zContains;
        synchronized (this.f4608q) {
            zContains = this.f4606o.contains(str);
        }
        return zContains;
    }

    /* renamed from: g */
    public boolean m4934g(String str) {
        boolean z;
        synchronized (this.f4608q) {
            z = this.f4604m.containsKey(str) || this.f4603l.containsKey(str);
        }
        return z;
    }

    /* renamed from: h */
    public boolean m4935h(String str) {
        boolean zContainsKey;
        synchronized (this.f4608q) {
            zContainsKey = this.f4603l.containsKey(str);
        }
        return zContainsKey;
    }

    /* renamed from: i */
    public void m4936i(InterfaceC0715b interfaceC0715b) {
        synchronized (this.f4608q) {
            this.f4607p.remove(interfaceC0715b);
        }
    }

    /* renamed from: j */
    public boolean m4937j(String str) {
        return m4938k(str, null);
    }

    /* renamed from: k */
    public boolean m4938k(String str, WorkerParameters.C0700a c0700a) {
        synchronized (this.f4608q) {
            if (m4934g(str)) {
                AbstractC0807n.m5221c().mo5224a(f4597f, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC0738k runnableC0738kM5018a = new RunnableC0738k.c(this.f4599h, this.f4600i, this.f4601j, this, this.f4602k, str).m5020c(this.f4605n).m5019b(c0700a).m5018a();
            InterfaceFutureC8955a<Boolean> interfaceFutureC8955aM5014b = runnableC0738kM5018a.m5014b();
            interfaceFutureC8955aM5014b.mo5190g(new a(this, str, interfaceFutureC8955aM5014b), this.f4601j.mo5204a());
            this.f4604m.put(str, runnableC0738kM5018a);
            this.f4601j.mo5206c().execute(runnableC0738kM5018a);
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("%s: processing %s", C0726d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean m4939l(String str) {
        boolean zM4928e;
        synchronized (this.f4608q) {
            boolean z = true;
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f4606o.add(str);
            RunnableC0738k runnableC0738kRemove = this.f4603l.remove(str);
            if (runnableC0738kRemove == null) {
                z = false;
            }
            if (runnableC0738kRemove == null) {
                runnableC0738kRemove = this.f4604m.remove(str);
            }
            zM4928e = m4928e(str, runnableC0738kRemove);
            if (z) {
                m4929m();
            }
        }
        return zM4928e;
    }

    /* renamed from: n */
    public boolean m4940n(String str) {
        boolean zM4928e;
        synchronized (this.f4608q) {
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zM4928e = m4928e(str, this.f4603l.remove(str));
        }
        return zM4928e;
    }

    /* renamed from: o */
    public boolean m4941o(String str) {
        boolean zM4928e;
        synchronized (this.f4608q) {
            AbstractC0807n.m5221c().mo5224a(f4597f, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zM4928e = m4928e(str, this.f4604m.remove(str));
        }
        return zM4928e;
    }
}
