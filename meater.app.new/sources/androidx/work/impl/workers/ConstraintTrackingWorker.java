package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0737j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p013m.C0744d;
import androidx.work.impl.p013m.InterfaceC0743c;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.Collections;
import java.util.List;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC0743c {

    /* renamed from: f */
    private static final String f4959f = AbstractC0807n.m5223f("ConstraintTrkngWrkr");

    /* renamed from: g */
    private WorkerParameters f4960g;

    /* renamed from: h */
    final Object f4961h;

    /* renamed from: i */
    volatile boolean f4962i;

    /* renamed from: j */
    C0798c<ListenableWorker.AbstractC0698a> f4963j;

    /* renamed from: k */
    private ListenableWorker f4964k;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class RunnableC0801a implements Runnable {
        RunnableC0801a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.m5211f();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class RunnableC0802b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceFutureC8955a f4966f;

        RunnableC0802b(InterfaceFutureC8955a interfaceFutureC8955a) {
            this.f4966f = interfaceFutureC8955a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4961h) {
                if (ConstraintTrackingWorker.this.f4962i) {
                    ConstraintTrackingWorker.this.m5210d();
                } else {
                    ConstraintTrackingWorker.this.f4963j.mo5195s(this.f4966f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4960g = workerParameters;
        this.f4961h = new Object();
        this.f4962i = false;
        this.f4963j = C0798c.m5203u();
    }

    /* renamed from: a */
    public WorkDatabase m5208a() {
        return C0737j.m4979p(getApplicationContext()).m4997t();
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: b */
    public void mo4897b(List<String> list) {
        AbstractC0807n.m5221c().mo5224a(f4959f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f4961h) {
            this.f4962i = true;
        }
    }

    /* renamed from: c */
    void m5209c() {
        this.f4963j.mo5193q(ListenableWorker.AbstractC0698a.m4764a());
    }

    /* renamed from: d */
    void m5210d() {
        this.f4963j.mo5193q(ListenableWorker.AbstractC0698a.m4765b());
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: e */
    public void mo4898e(List<String> list) {
    }

    /* renamed from: f */
    void m5211f() {
        String strM4833j = getInputData().m4833j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strM4833j)) {
            AbstractC0807n.m5221c().mo5225b(f4959f, "No worker to delegate to.", new Throwable[0]);
            m5209c();
            return;
        }
        ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), strM4833j, this.f4960g);
        this.f4964k = listenableWorkerCreateWorkerWithDefaultFallback;
        if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
            AbstractC0807n.m5221c().mo5224a(f4959f, "No worker to delegate to.", new Throwable[0]);
            m5209c();
            return;
        }
        C0775p c0775pMo5110m = m5208a().mo4854j().mo5110m(getId().toString());
        if (c0775pMo5110m == null) {
            m5209c();
            return;
        }
        C0744d c0744d = new C0744d(getApplicationContext(), getTaskExecutor(), this);
        c0744d.m5034d(Collections.singletonList(c0775pMo5110m));
        if (!c0744d.m5033c(getId().toString())) {
            AbstractC0807n.m5221c().mo5224a(f4959f, String.format("Constraints not met for delegate %s. Requesting retry.", strM4833j), new Throwable[0]);
            m5210d();
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4959f, String.format("Constraints met for delegate %s", strM4833j), new Throwable[0]);
        try {
            InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> interfaceFutureC8955aStartWork = this.f4964k.startWork();
            interfaceFutureC8955aStartWork.mo5190g(new RunnableC0802b(interfaceFutureC8955aStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
            String str = f4959f;
            abstractC0807nM5221c.mo5224a(str, String.format("Delegated worker %s threw exception in startWork.", strM4833j), th);
            synchronized (this.f4961h) {
                if (this.f4962i) {
                    AbstractC0807n.m5221c().mo5224a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                    m5210d();
                } else {
                    m5209c();
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC0799a getTaskExecutor() {
        return C0737j.m4979p(getApplicationContext()).m4998u();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4964k;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4964k;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f4964k.stop();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> startWork() {
        getBackgroundExecutor().execute(new RunnableC0801a());
        return this.f4963j;
    }
}
