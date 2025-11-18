package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.impl.C0726d;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0715b;
import androidx.work.impl.utils.C0791j;
import androidx.work.impl.utils.C0795n;
import androidx.work.impl.utils.ExecutorC0788g;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemAlarmDispatcher.java */
/* renamed from: androidx.work.impl.background.systemalarm.e */
/* loaded from: classes.dex */
public class C0721e implements InterfaceC0715b {

    /* renamed from: f */
    static final String f4566f = AbstractC0807n.m5223f("SystemAlarmDispatcher");

    /* renamed from: g */
    final Context f4567g;

    /* renamed from: h */
    private final InterfaceC0799a f4568h;

    /* renamed from: i */
    private final C0795n f4569i;

    /* renamed from: j */
    private final C0726d f4570j;

    /* renamed from: k */
    private final C0737j f4571k;

    /* renamed from: l */
    final C0718b f4572l;

    /* renamed from: m */
    private final Handler f4573m;

    /* renamed from: n */
    final List<Intent> f4574n;

    /* renamed from: o */
    Intent f4575o;

    /* renamed from: p */
    private c f4576p;

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0721e c0721e;
            d dVar;
            synchronized (C0721e.this.f4574n) {
                C0721e c0721e2 = C0721e.this;
                c0721e2.f4575o = c0721e2.f4574n.get(0);
            }
            Intent intent = C0721e.this.f4575o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0721e.this.f4575o.getIntExtra("KEY_START_ID", 0);
                AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
                String str = C0721e.f4566f;
                abstractC0807nM5221c.mo5224a(str, String.format("Processing command %s, %s", C0721e.this.f4575o, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockM5171b = C0791j.m5171b(C0721e.this.f4567g, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC0807n.m5221c().mo5224a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockM5171b), new Throwable[0]);
                    wakeLockM5171b.acquire();
                    C0721e c0721e3 = C0721e.this;
                    c0721e3.f4572l.m4892p(c0721e3.f4575o, intExtra, c0721e3);
                    AbstractC0807n.m5221c().mo5224a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM5171b), new Throwable[0]);
                    wakeLockM5171b.release();
                    c0721e = C0721e.this;
                    dVar = new d(c0721e);
                } catch (Throwable th) {
                    try {
                        AbstractC0807n abstractC0807nM5221c2 = AbstractC0807n.m5221c();
                        String str2 = C0721e.f4566f;
                        abstractC0807nM5221c2.mo5225b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC0807n.m5221c().mo5224a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM5171b), new Throwable[0]);
                        wakeLockM5171b.release();
                        c0721e = C0721e.this;
                        dVar = new d(c0721e);
                    } catch (Throwable th2) {
                        AbstractC0807n.m5221c().mo5224a(C0721e.f4566f, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM5171b), new Throwable[0]);
                        wakeLockM5171b.release();
                        C0721e c0721e4 = C0721e.this;
                        c0721e4.m4910k(new d(c0721e4));
                        throw th2;
                    }
                }
                c0721e.m4910k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    static class b implements Runnable {

        /* renamed from: f */
        private final C0721e f4578f;

        /* renamed from: g */
        private final Intent f4579g;

        /* renamed from: h */
        private final int f4580h;

        b(C0721e c0721e, Intent intent, int i2) {
            this.f4578f = c0721e;
            this.f4579g = intent;
            this.f4580h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4578f.m4903a(this.f4579g, this.f4580h);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    interface c {
        /* renamed from: a */
        void mo4873a();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    static class d implements Runnable {

        /* renamed from: f */
        private final C0721e f4581f;

        d(C0721e c0721e) {
            this.f4581f = c0721e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4581f.m4904c();
        }
    }

    C0721e(Context context) {
        this(context, null, null);
    }

    /* renamed from: b */
    private void m4900b() {
        if (this.f4573m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m4901i(String str) {
        m4900b();
        synchronized (this.f4574n) {
            Iterator<Intent> it = this.f4574n.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m4902l() {
        m4900b();
        PowerManager.WakeLock wakeLockM5171b = C0791j.m5171b(this.f4567g, "ProcessCommand");
        try {
            wakeLockM5171b.acquire();
            this.f4571k.m4998u().mo5205b(new a());
        } finally {
            wakeLockM5171b.release();
        }
    }

    /* renamed from: a */
    public boolean m4903a(Intent intent, int i2) {
        AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
        String str = f4566f;
        abstractC0807nM5221c.mo5224a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        m4900b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC0807n.m5221c().mo5228h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4901i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f4574n) {
            boolean z = this.f4574n.isEmpty() ? false : true;
            this.f4574n.add(intent);
            if (!z) {
                m4902l();
            }
        }
        return true;
    }

    /* renamed from: c */
    void m4904c() {
        AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
        String str = f4566f;
        abstractC0807nM5221c.mo5224a(str, "Checking if commands are complete.", new Throwable[0]);
        m4900b();
        synchronized (this.f4574n) {
            if (this.f4575o != null) {
                AbstractC0807n.m5221c().mo5224a(str, String.format("Removing command %s", this.f4575o), new Throwable[0]);
                if (!this.f4574n.remove(0).equals(this.f4575o)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f4575o = null;
            }
            ExecutorC0788g executorC0788gMo5206c = this.f4568h.mo5206c();
            if (!this.f4572l.m4891o() && this.f4574n.isEmpty() && !executorC0788gMo5206c.m5168a()) {
                AbstractC0807n.m5221c().mo5224a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f4576p;
                if (cVar != null) {
                    cVar.mo4873a();
                }
            } else if (!this.f4574n.isEmpty()) {
                m4902l();
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        m4910k(new b(this, C0718b.m4880c(this.f4567g, str, z), 0));
    }

    /* renamed from: e */
    C0726d m4905e() {
        return this.f4570j;
    }

    /* renamed from: f */
    InterfaceC0799a m4906f() {
        return this.f4568h;
    }

    /* renamed from: g */
    C0737j m4907g() {
        return this.f4571k;
    }

    /* renamed from: h */
    C0795n m4908h() {
        return this.f4569i;
    }

    /* renamed from: j */
    void m4909j() {
        AbstractC0807n.m5221c().mo5224a(f4566f, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4570j.m4936i(this);
        this.f4569i.m5174a();
        this.f4576p = null;
    }

    /* renamed from: k */
    void m4910k(Runnable runnable) {
        this.f4573m.post(runnable);
    }

    /* renamed from: m */
    void m4911m(c cVar) {
        if (this.f4576p != null) {
            AbstractC0807n.m5221c().mo5225b(f4566f, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4576p = cVar;
        }
    }

    C0721e(Context context, C0726d c0726d, C0737j c0737j) {
        Context applicationContext = context.getApplicationContext();
        this.f4567g = applicationContext;
        this.f4572l = new C0718b(applicationContext);
        this.f4569i = new C0795n();
        c0737j = c0737j == null ? C0737j.m4979p(context) : c0737j;
        this.f4571k = c0737j;
        c0726d = c0726d == null ? c0737j.m4995r() : c0726d;
        this.f4570j = c0726d;
        this.f4568h = c0737j.m4998u();
        c0726d.m4932c(this);
        this.f4574n = new ArrayList();
        this.f4575o = null;
        this.f4573m = new Handler(Looper.getMainLooper());
    }
}
