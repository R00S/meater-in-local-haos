package com.google.firebase.crashlytics.internal.p189s;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.AbstractC8195b0;
import com.google.firebase.crashlytics.internal.p183n.C8219n0;
import com.google.firebase.crashlytics.internal.p183n.C8225q0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p190t.C8307d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.EnumC8787d;
import p241e.p254e.p256b.p257a.InterfaceC8789f;
import p241e.p254e.p256b.p257a.InterfaceC8791h;
import p241e.p254e.p256b.p257a.p258i.C8870m;

/* compiled from: ReportQueue.java */
/* renamed from: com.google.firebase.crashlytics.h.s.e */
/* loaded from: classes2.dex */
final class C8303e {

    /* renamed from: a */
    private final double f31576a;

    /* renamed from: b */
    private final double f31577b;

    /* renamed from: c */
    private final long f31578c;

    /* renamed from: d */
    private final long f31579d;

    /* renamed from: e */
    private final int f31580e;

    /* renamed from: f */
    private final BlockingQueue<Runnable> f31581f;

    /* renamed from: g */
    private final ThreadPoolExecutor f31582g;

    /* renamed from: h */
    private final InterfaceC8789f<AbstractC8258f0> f31583h;

    /* renamed from: i */
    private final C8219n0 f31584i;

    /* renamed from: j */
    private int f31585j;

    /* renamed from: k */
    private long f31586k;

    /* compiled from: ReportQueue.java */
    /* renamed from: com.google.firebase.crashlytics.h.s.e$b */
    private final class b implements Runnable {

        /* renamed from: f */
        private final AbstractC8195b0 f31587f;

        /* renamed from: g */
        private final TaskCompletionSource<AbstractC8195b0> f31588g;

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            C8303e.this.m26026p(this.f31587f, this.f31588g);
            C8303e.this.f31584i.m25280c();
            double dM26019e = C8303e.this.m26019e();
            C8179h.m25176f().m25177b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dM26019e / 1000.0d)) + " s for report: " + this.f31587f.mo25228d());
            C8303e.m26027q(dM26019e);
        }

        private b(AbstractC8195b0 abstractC8195b0, TaskCompletionSource<AbstractC8195b0> taskCompletionSource) {
            this.f31587f = abstractC8195b0;
            this.f31588g = taskCompletionSource;
        }
    }

    C8303e(InterfaceC8789f<AbstractC8258f0> interfaceC8789f, C8307d c8307d, C8219n0 c8219n0) {
        this(c8307d.f31599f, c8307d.f31600g, c8307d.f31601h * 1000, interfaceC8789f, c8219n0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public double m26019e() {
        return Math.min(3600000.0d, (60000.0d / this.f31576a) * Math.pow(this.f31577b, m26020f()));
    }

    /* renamed from: f */
    private int m26020f() {
        if (this.f31586k == 0) {
            this.f31586k = m26025o();
        }
        int iM26025o = (int) ((m26025o() - this.f31586k) / this.f31578c);
        int iMin = m26022j() ? Math.min(100, this.f31585j + iM26025o) : Math.max(0, this.f31585j - iM26025o);
        if (this.f31585j != iMin) {
            this.f31585j = iMin;
            this.f31586k = m26025o();
        }
        return iMin;
    }

    /* renamed from: i */
    private boolean m26021i() {
        return this.f31581f.size() < this.f31580e;
    }

    /* renamed from: j */
    private boolean m26022j() {
        return this.f31581f.size() == this.f31580e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m26030l(CountDownLatch countDownLatch) {
        try {
            C8870m.m28164a(this.f31583h, EnumC8787d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m26031n(TaskCompletionSource taskCompletionSource, boolean z, AbstractC8195b0 abstractC8195b0, Exception exc) {
        if (exc != null) {
            taskCompletionSource.m23657d(exc);
            return;
        }
        if (z) {
            m26029h();
        }
        taskCompletionSource.m23658e(abstractC8195b0);
    }

    /* renamed from: o */
    private long m26025o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m26026p(final AbstractC8195b0 abstractC8195b0, final TaskCompletionSource<AbstractC8195b0> taskCompletionSource) {
        C8179h.m25176f().m25177b("Sending report through Google DataTransport: " + abstractC8195b0.mo25228d());
        final boolean z = SystemClock.elapsedRealtime() - this.f31579d < 2000;
        this.f31583h.mo26453b(AbstractC8786c.m27949f(abstractC8195b0.mo25226b()), new InterfaceC8791h() { // from class: com.google.firebase.crashlytics.h.s.b
            @Override // p241e.p254e.p256b.p257a.InterfaceC8791h
            /* renamed from: a */
            public final void mo26010a(Exception exc) {
                this.f31564a.m26031n(taskCompletionSource, z, abstractC8195b0, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m26027q(double d2) throws InterruptedException {
        try {
            Thread.sleep((long) d2);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    TaskCompletionSource<AbstractC8195b0> m26028g(AbstractC8195b0 abstractC8195b0, boolean z) {
        synchronized (this.f31581f) {
            TaskCompletionSource<AbstractC8195b0> taskCompletionSource = new TaskCompletionSource<>();
            if (!z) {
                m26026p(abstractC8195b0, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f31584i.m25279b();
            if (!m26021i()) {
                m26020f();
                C8179h.m25176f().m25177b("Dropping report due to queue being full: " + abstractC8195b0.mo25228d());
                this.f31584i.m25278a();
                taskCompletionSource.m23658e(abstractC8195b0);
                return taskCompletionSource;
            }
            C8179h.m25176f().m25177b("Enqueueing report: " + abstractC8195b0.mo25228d());
            C8179h.m25176f().m25177b("Queue size: " + this.f31581f.size());
            this.f31582g.execute(new b(abstractC8195b0, taskCompletionSource));
            C8179h.m25176f().m25177b("Closing task for report: " + abstractC8195b0.mo25228d());
            taskCompletionSource.m23658e(abstractC8195b0);
            return taskCompletionSource;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    /* renamed from: h */
    public void m26029h() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.h.s.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f31568f.m26030l(countDownLatch);
            }
        }).start();
        C8225q0.m25313b(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    C8303e(double d2, double d3, long j2, InterfaceC8789f<AbstractC8258f0> interfaceC8789f, C8219n0 c8219n0) {
        this.f31576a = d2;
        this.f31577b = d3;
        this.f31578c = j2;
        this.f31583h = interfaceC8789f;
        this.f31584i = c8219n0;
        this.f31579d = SystemClock.elapsedRealtime();
        int i2 = (int) d2;
        this.f31580e = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f31581f = arrayBlockingQueue;
        this.f31582g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f31585j = 0;
        this.f31586k = 0L;
    }
}
