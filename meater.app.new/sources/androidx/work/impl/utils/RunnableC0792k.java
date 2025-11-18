package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.os.C0272a;
import androidx.work.AbstractC0807n;
import androidx.work.C0709h;
import androidx.work.InterfaceC0710i;
import androidx.work.ListenableWorker;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: WorkForegroundRunnable.java */
/* renamed from: androidx.work.impl.utils.k */
/* loaded from: classes.dex */
public class RunnableC0792k implements Runnable {

    /* renamed from: f */
    static final String f4889f = AbstractC0807n.m5223f("WorkForegroundRunnable");

    /* renamed from: g */
    final C0798c<Void> f4890g = C0798c.m5203u();

    /* renamed from: h */
    final Context f4891h;

    /* renamed from: i */
    final C0775p f4892i;

    /* renamed from: j */
    final ListenableWorker f4893j;

    /* renamed from: k */
    final InterfaceC0710i f4894k;

    /* renamed from: l */
    final InterfaceC0799a f4895l;

    /* compiled from: WorkForegroundRunnable.java */
    /* renamed from: androidx.work.impl.utils.k$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0798c f4896f;

        a(C0798c c0798c) {
            this.f4896f = c0798c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4896f.mo5195s(RunnableC0792k.this.f4893j.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* renamed from: androidx.work.impl.utils.k$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0798c f4898f;

        b(C0798c c0798c) {
            this.f4898f = c0798c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C0709h c0709h = (C0709h) this.f4898f.get();
                if (c0709h == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC0792k.this.f4892i.f4801e));
                }
                AbstractC0807n.m5221c().mo5224a(RunnableC0792k.f4889f, String.format("Updating notification for %s", RunnableC0792k.this.f4892i.f4801e), new Throwable[0]);
                RunnableC0792k.this.f4893j.setRunInForeground(true);
                RunnableC0792k runnableC0792k = RunnableC0792k.this;
                runnableC0792k.f4890g.mo5195s(runnableC0792k.f4894k.mo4844a(runnableC0792k.f4891h, runnableC0792k.f4893j.getId(), c0709h));
            } catch (Throwable th) {
                RunnableC0792k.this.f4890g.mo5194r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC0792k(Context context, C0775p c0775p, ListenableWorker listenableWorker, InterfaceC0710i interfaceC0710i, InterfaceC0799a interfaceC0799a) {
        this.f4891h = context;
        this.f4892i = c0775p;
        this.f4893j = listenableWorker;
        this.f4894k = interfaceC0710i;
        this.f4895l = interfaceC0799a;
    }

    /* renamed from: a */
    public InterfaceFutureC8955a<Void> m5172a() {
        return this.f4890g;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f4892i.f4815s || C0272a.m1833c()) {
            this.f4890g.mo5193q(null);
            return;
        }
        C0798c c0798cM5203u = C0798c.m5203u();
        this.f4895l.mo5204a().execute(new a(c0798cM5203u));
        c0798cM5203u.mo5190g(new b(c0798cM5203u), this.f4895l.mo5204a());
    }
}
