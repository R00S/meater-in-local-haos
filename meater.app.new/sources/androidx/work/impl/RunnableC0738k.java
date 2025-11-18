package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.SQLException;
import androidx.work.AbstractC0804k;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import androidx.work.C0706e;
import androidx.work.C0817x;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.InterfaceC0732a;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.p016n.InterfaceC0761b;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.p016n.InterfaceC0779t;
import androidx.work.impl.utils.C0785d;
import androidx.work.impl.utils.C0793l;
import androidx.work.impl.utils.C0794m;
import androidx.work.impl.utils.RunnableC0792k;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: WorkerWrapper.java */
/* renamed from: androidx.work.impl.k */
/* loaded from: classes.dex */
public class RunnableC0738k implements Runnable {

    /* renamed from: f */
    static final String f4677f = AbstractC0807n.m5223f("WorkerWrapper");

    /* renamed from: g */
    Context f4678g;

    /* renamed from: h */
    private String f4679h;

    /* renamed from: i */
    private List<InterfaceC0727e> f4680i;

    /* renamed from: j */
    private WorkerParameters.C0700a f4681j;

    /* renamed from: k */
    C0775p f4682k;

    /* renamed from: l */
    ListenableWorker f4683l;

    /* renamed from: m */
    InterfaceC0799a f4684m;

    /* renamed from: o */
    private C0703b f4686o;

    /* renamed from: p */
    private InterfaceC0732a f4687p;

    /* renamed from: q */
    private WorkDatabase f4688q;

    /* renamed from: r */
    private InterfaceC0776q f4689r;

    /* renamed from: s */
    private InterfaceC0761b f4690s;

    /* renamed from: t */
    private InterfaceC0779t f4691t;

    /* renamed from: u */
    private List<String> f4692u;

    /* renamed from: v */
    private String f4693v;

    /* renamed from: y */
    private volatile boolean f4696y;

    /* renamed from: n */
    ListenableWorker.AbstractC0698a f4685n = ListenableWorker.AbstractC0698a.m4764a();

    /* renamed from: w */
    C0798c<Boolean> f4694w = C0798c.m5203u();

    /* renamed from: x */
    InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> f4695x = null;

    /* compiled from: WorkerWrapper.java */
    /* renamed from: androidx.work.impl.k$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceFutureC8955a f4697f;

        /* renamed from: g */
        final /* synthetic */ C0798c f4698g;

        a(InterfaceFutureC8955a interfaceFutureC8955a, C0798c c0798c) {
            this.f4697f = interfaceFutureC8955a;
            this.f4698g = c0798c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4697f.get();
                AbstractC0807n.m5221c().mo5224a(RunnableC0738k.f4677f, String.format("Starting work for %s", RunnableC0738k.this.f4682k.f4801e), new Throwable[0]);
                RunnableC0738k runnableC0738k = RunnableC0738k.this;
                runnableC0738k.f4695x = runnableC0738k.f4683l.startWork();
                this.f4698g.mo5195s(RunnableC0738k.this.f4695x);
            } catch (Throwable th) {
                this.f4698g.mo5194r(th);
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* renamed from: androidx.work.impl.k$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0798c f4700f;

        /* renamed from: g */
        final /* synthetic */ String f4701g;

        b(C0798c c0798c, String str) {
            this.f4700f = c0798c;
            this.f4701g = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() throws SQLException {
            try {
                try {
                    ListenableWorker.AbstractC0698a abstractC0698a = (ListenableWorker.AbstractC0698a) this.f4700f.get();
                    if (abstractC0698a == null) {
                        AbstractC0807n.m5221c().mo5225b(RunnableC0738k.f4677f, String.format("%s returned a null result. Treating it as a failure.", RunnableC0738k.this.f4682k.f4801e), new Throwable[0]);
                    } else {
                        AbstractC0807n.m5221c().mo5224a(RunnableC0738k.f4677f, String.format("%s returned a %s result.", RunnableC0738k.this.f4682k.f4801e, abstractC0698a), new Throwable[0]);
                        RunnableC0738k.this.f4685n = abstractC0698a;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    AbstractC0807n.m5221c().mo5225b(RunnableC0738k.f4677f, String.format("%s failed because it threw an exception/error", this.f4701g), e);
                } catch (CancellationException e3) {
                    AbstractC0807n.m5221c().mo5226d(RunnableC0738k.f4677f, String.format("%s was cancelled", this.f4701g), e3);
                } catch (ExecutionException e4) {
                    e = e4;
                    AbstractC0807n.m5221c().mo5225b(RunnableC0738k.f4677f, String.format("%s failed because it threw an exception/error", this.f4701g), e);
                }
            } finally {
                RunnableC0738k.this.m5016f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    /* renamed from: androidx.work.impl.k$c */
    public static class c {

        /* renamed from: a */
        Context f4703a;

        /* renamed from: b */
        ListenableWorker f4704b;

        /* renamed from: c */
        InterfaceC0732a f4705c;

        /* renamed from: d */
        InterfaceC0799a f4706d;

        /* renamed from: e */
        C0703b f4707e;

        /* renamed from: f */
        WorkDatabase f4708f;

        /* renamed from: g */
        String f4709g;

        /* renamed from: h */
        List<InterfaceC0727e> f4710h;

        /* renamed from: i */
        WorkerParameters.C0700a f4711i = new WorkerParameters.C0700a();

        public c(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, InterfaceC0732a interfaceC0732a, WorkDatabase workDatabase, String str) {
            this.f4703a = context.getApplicationContext();
            this.f4706d = interfaceC0799a;
            this.f4705c = interfaceC0732a;
            this.f4707e = c0703b;
            this.f4708f = workDatabase;
            this.f4709g = str;
        }

        /* renamed from: a */
        public RunnableC0738k m5018a() {
            return new RunnableC0738k(this);
        }

        /* renamed from: b */
        public c m5019b(WorkerParameters.C0700a c0700a) {
            if (c0700a != null) {
                this.f4711i = c0700a;
            }
            return this;
        }

        /* renamed from: c */
        public c m5020c(List<InterfaceC0727e> list) {
            this.f4710h = list;
            return this;
        }
    }

    RunnableC0738k(c cVar) {
        this.f4678g = cVar.f4703a;
        this.f4684m = cVar.f4706d;
        this.f4687p = cVar.f4705c;
        this.f4679h = cVar.f4709g;
        this.f4680i = cVar.f4710h;
        this.f4681j = cVar.f4711i;
        this.f4683l = cVar.f4704b;
        this.f4686o = cVar.f4707e;
        WorkDatabase workDatabase = cVar.f4708f;
        this.f4688q = workDatabase;
        this.f4689r = workDatabase.mo4854j();
        this.f4690s = this.f4688q.mo4849b();
        this.f4691t = this.f4688q.mo4855k();
    }

    /* renamed from: a */
    private String m5003a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f4679h);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m5004c(ListenableWorker.AbstractC0698a abstractC0698a) throws SQLException {
        if (abstractC0698a instanceof ListenableWorker.AbstractC0698a.c) {
            AbstractC0807n.m5221c().mo5226d(f4677f, String.format("Worker result SUCCESS for %s", this.f4693v), new Throwable[0]);
            if (this.f4682k.m5093d()) {
                m5007h();
                return;
            } else {
                m5011m();
                return;
            }
        }
        if (abstractC0698a instanceof ListenableWorker.AbstractC0698a.b) {
            AbstractC0807n.m5221c().mo5226d(f4677f, String.format("Worker result RETRY for %s", this.f4693v), new Throwable[0]);
            m5006g();
            return;
        }
        AbstractC0807n.m5221c().mo5226d(f4677f, String.format("Worker result FAILURE for %s", this.f4693v), new Throwable[0]);
        if (this.f4682k.m5093d()) {
            m5007h();
        } else {
            m5017l();
        }
    }

    /* renamed from: e */
    private void m5005e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4689r.mo5109l(str2) != C0817x.a.CANCELLED) {
                this.f4689r.mo5098a(C0817x.a.FAILED, str2);
            }
            linkedList.addAll(this.f4690s.mo5072b(str2));
        }
    }

    /* renamed from: g */
    private void m5006g() throws SQLException {
        this.f4688q.beginTransaction();
        try {
            this.f4689r.mo5098a(C0817x.a.ENQUEUED, this.f4679h);
            this.f4689r.mo5115r(this.f4679h, System.currentTimeMillis());
            this.f4689r.mo5099b(this.f4679h, -1L);
            this.f4688q.setTransactionSuccessful();
        } finally {
            this.f4688q.endTransaction();
            m5008i(true);
        }
    }

    /* renamed from: h */
    private void m5007h() throws SQLException {
        this.f4688q.beginTransaction();
        try {
            this.f4689r.mo5115r(this.f4679h, System.currentTimeMillis());
            this.f4689r.mo5098a(C0817x.a.ENQUEUED, this.f4679h);
            this.f4689r.mo5111n(this.f4679h);
            this.f4689r.mo5099b(this.f4679h, -1L);
            this.f4688q.setTransactionSuccessful();
        } finally {
            this.f4688q.endTransaction();
            m5008i(false);
        }
    }

    /* renamed from: i */
    private void m5008i(boolean z) throws SQLException {
        ListenableWorker listenableWorker;
        this.f4688q.beginTransaction();
        try {
            if (!this.f4688q.mo4854j().mo5107j()) {
                C0785d.m5162a(this.f4678g, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f4689r.mo5098a(C0817x.a.ENQUEUED, this.f4679h);
                this.f4689r.mo5099b(this.f4679h, -1L);
            }
            if (this.f4682k != null && (listenableWorker = this.f4683l) != null && listenableWorker.isRunInForeground()) {
                this.f4687p.mo4931b(this.f4679h);
            }
            this.f4688q.setTransactionSuccessful();
            this.f4688q.endTransaction();
            this.f4694w.mo5193q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f4688q.endTransaction();
            throw th;
        }
    }

    /* renamed from: j */
    private void m5009j() throws SQLException {
        C0817x.a aVarMo5109l = this.f4689r.mo5109l(this.f4679h);
        if (aVarMo5109l == C0817x.a.RUNNING) {
            AbstractC0807n.m5221c().mo5224a(f4677f, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f4679h), new Throwable[0]);
            m5008i(true);
        } else {
            AbstractC0807n.m5221c().mo5224a(f4677f, String.format("Status for %s is %s; not doing any work", this.f4679h, aVarMo5109l), new Throwable[0]);
            m5008i(false);
        }
    }

    /* renamed from: k */
    private void m5010k() throws SQLException {
        C0706e c0706eMo4757b;
        if (m5012n()) {
            return;
        }
        this.f4688q.beginTransaction();
        try {
            C0775p c0775pMo5110m = this.f4689r.mo5110m(this.f4679h);
            this.f4682k = c0775pMo5110m;
            if (c0775pMo5110m == null) {
                AbstractC0807n.m5221c().mo5225b(f4677f, String.format("Didn't find WorkSpec for id %s", this.f4679h), new Throwable[0]);
                m5008i(false);
                this.f4688q.setTransactionSuccessful();
                return;
            }
            if (c0775pMo5110m.f4800d != C0817x.a.ENQUEUED) {
                m5009j();
                this.f4688q.setTransactionSuccessful();
                AbstractC0807n.m5221c().mo5224a(f4677f, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f4682k.f4801e), new Throwable[0]);
                return;
            }
            if (c0775pMo5110m.m5093d() || this.f4682k.m5092c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0775p c0775p = this.f4682k;
                if (!(c0775p.f4812p == 0) && jCurrentTimeMillis < c0775p.m5090a()) {
                    AbstractC0807n.m5221c().mo5224a(f4677f, String.format("Delaying execution for %s because it is being executed before schedule.", this.f4682k.f4801e), new Throwable[0]);
                    m5008i(true);
                    this.f4688q.setTransactionSuccessful();
                    return;
                }
            }
            this.f4688q.setTransactionSuccessful();
            this.f4688q.endTransaction();
            if (this.f4682k.m5093d()) {
                c0706eMo4757b = this.f4682k.f4803g;
            } else {
                AbstractC0804k abstractC0804kM5218b = this.f4686o.m4787f().m5218b(this.f4682k.f4802f);
                if (abstractC0804kM5218b == null) {
                    AbstractC0807n.m5221c().mo5225b(f4677f, String.format("Could not create Input Merger %s", this.f4682k.f4802f), new Throwable[0]);
                    m5017l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f4682k.f4803g);
                    arrayList.addAll(this.f4689r.mo5113p(this.f4679h));
                    c0706eMo4757b = abstractC0804kM5218b.mo4757b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f4679h), c0706eMo4757b, this.f4692u, this.f4681j, this.f4682k.f4809m, this.f4686o.m4786e(), this.f4684m, this.f4686o.m4794m(), new C0794m(this.f4688q, this.f4684m), new C0793l(this.f4688q, this.f4687p, this.f4684m));
            if (this.f4683l == null) {
                this.f4683l = this.f4686o.m4794m().createWorkerWithDefaultFallback(this.f4678g, this.f4682k.f4801e, workerParameters);
            }
            ListenableWorker listenableWorker = this.f4683l;
            if (listenableWorker == null) {
                AbstractC0807n.m5221c().mo5225b(f4677f, String.format("Could not create Worker %s", this.f4682k.f4801e), new Throwable[0]);
                m5017l();
                return;
            }
            if (listenableWorker.isUsed()) {
                AbstractC0807n.m5221c().mo5225b(f4677f, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f4682k.f4801e), new Throwable[0]);
                m5017l();
                return;
            }
            this.f4683l.setUsed();
            if (!m5013o()) {
                m5009j();
                return;
            }
            if (m5012n()) {
                return;
            }
            C0798c c0798cM5203u = C0798c.m5203u();
            RunnableC0792k runnableC0792k = new RunnableC0792k(this.f4678g, this.f4682k, this.f4683l, workerParameters.m4771b(), this.f4684m);
            this.f4684m.mo5204a().execute(runnableC0792k);
            InterfaceFutureC8955a<Void> interfaceFutureC8955aM5172a = runnableC0792k.m5172a();
            interfaceFutureC8955aM5172a.mo5190g(new a(interfaceFutureC8955aM5172a, c0798cM5203u), this.f4684m.mo5204a());
            c0798cM5203u.mo5190g(new b(c0798cM5203u, this.f4693v), this.f4684m.mo5206c());
        } finally {
            this.f4688q.endTransaction();
        }
    }

    /* renamed from: m */
    private void m5011m() throws SQLException {
        this.f4688q.beginTransaction();
        try {
            this.f4689r.mo5098a(C0817x.a.SUCCEEDED, this.f4679h);
            this.f4689r.mo5105h(this.f4679h, ((ListenableWorker.AbstractC0698a.c) this.f4685n).m4769e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f4690s.mo5072b(this.f4679h)) {
                if (this.f4689r.mo5109l(str) == C0817x.a.BLOCKED && this.f4690s.mo5073c(str)) {
                    AbstractC0807n.m5221c().mo5226d(f4677f, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f4689r.mo5098a(C0817x.a.ENQUEUED, str);
                    this.f4689r.mo5115r(str, jCurrentTimeMillis);
                }
            }
            this.f4688q.setTransactionSuccessful();
        } finally {
            this.f4688q.endTransaction();
            m5008i(false);
        }
    }

    /* renamed from: n */
    private boolean m5012n() throws SQLException {
        if (!this.f4696y) {
            return false;
        }
        AbstractC0807n.m5221c().mo5224a(f4677f, String.format("Work interrupted for %s", this.f4693v), new Throwable[0]);
        if (this.f4689r.mo5109l(this.f4679h) == null) {
            m5008i(false);
        } else {
            m5008i(!r0.m5237g());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m5013o() throws SQLException {
        this.f4688q.beginTransaction();
        try {
            boolean z = true;
            if (this.f4689r.mo5109l(this.f4679h) == C0817x.a.ENQUEUED) {
                this.f4689r.mo5098a(C0817x.a.RUNNING, this.f4679h);
                this.f4689r.mo5114q(this.f4679h);
            } else {
                z = false;
            }
            this.f4688q.setTransactionSuccessful();
            return z;
        } finally {
            this.f4688q.endTransaction();
        }
    }

    /* renamed from: b */
    public InterfaceFutureC8955a<Boolean> m5014b() {
        return this.f4694w;
    }

    /* renamed from: d */
    public void m5015d() {
        boolean zIsDone;
        this.f4696y = true;
        m5012n();
        InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> interfaceFutureC8955a = this.f4695x;
        if (interfaceFutureC8955a != null) {
            zIsDone = interfaceFutureC8955a.isDone();
            this.f4695x.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f4683l;
        if (listenableWorker == null || zIsDone) {
            AbstractC0807n.m5221c().mo5224a(f4677f, String.format("WorkSpec %s is already done. Not interrupting.", this.f4682k), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    /* renamed from: f */
    void m5016f() throws SQLException {
        if (!m5012n()) {
            this.f4688q.beginTransaction();
            try {
                C0817x.a aVarMo5109l = this.f4689r.mo5109l(this.f4679h);
                this.f4688q.mo4853i().delete(this.f4679h);
                if (aVarMo5109l == null) {
                    m5008i(false);
                } else if (aVarMo5109l == C0817x.a.RUNNING) {
                    m5004c(this.f4685n);
                } else if (!aVarMo5109l.m5237g()) {
                    m5006g();
                }
                this.f4688q.setTransactionSuccessful();
            } finally {
                this.f4688q.endTransaction();
            }
        }
        List<InterfaceC0727e> list = this.f4680i;
        if (list != null) {
            Iterator<InterfaceC0727e> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(this.f4679h);
            }
            C0728f.m4943b(this.f4686o, this.f4688q, this.f4680i);
        }
    }

    /* renamed from: l */
    void m5017l() throws SQLException {
        this.f4688q.beginTransaction();
        try {
            m5005e(this.f4679h);
            this.f4689r.mo5105h(this.f4679h, ((ListenableWorker.AbstractC0698a.a) this.f4685n).m4768e());
            this.f4688q.setTransactionSuccessful();
        } finally {
            this.f4688q.endTransaction();
            m5008i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws SQLException {
        List<String> listMo5120b = this.f4691t.mo5120b(this.f4679h);
        this.f4692u = listMo5120b;
        this.f4693v = m5003a(listMo5120b);
        m5010k();
    }
}
