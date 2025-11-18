package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p241e.p307h.p308a.p311g0.RunnableC9014d;
import p241e.p307h.p308a.p315k0.C9032b;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;

/* compiled from: FileDownloadThreadPool.java */
/* renamed from: com.liulishuo.filedownloader.services.h */
/* loaded from: classes2.dex */
class C8708h {

    /* renamed from: b */
    private ThreadPoolExecutor f33057b;

    /* renamed from: d */
    private int f33059d;

    /* renamed from: a */
    private SparseArray<RunnableC9014d> f33056a = new SparseArray<>();

    /* renamed from: c */
    private final String f33058c = "Network";

    /* renamed from: e */
    private int f33060e = 0;

    C8708h(int i2) {
        this.f33057b = C9032b.m28953a(i2, "Network");
        this.f33059d = i2;
    }

    /* renamed from: d */
    private synchronized void m27663d() {
        SparseArray<RunnableC9014d> sparseArray = new SparseArray<>();
        int size = this.f33056a.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = this.f33056a.keyAt(i2);
            RunnableC9014d runnableC9014d = this.f33056a.get(iKeyAt);
            if (runnableC9014d != null && runnableC9014d.m28822p()) {
                sparseArray.put(iKeyAt, runnableC9014d);
            }
        }
        this.f33056a = sparseArray;
    }

    /* renamed from: a */
    public void m27664a(int i2) {
        m27663d();
        synchronized (this) {
            RunnableC9014d runnableC9014d = this.f33056a.get(i2);
            if (runnableC9014d != null) {
                runnableC9014d.m28823r();
                boolean zRemove = this.f33057b.remove(runnableC9014d);
                if (C9034d.f34819a) {
                    C9034d.m28962a(this, "successful cancel %d %B", Integer.valueOf(i2), Boolean.valueOf(zRemove));
                }
            }
            this.f33056a.remove(i2);
        }
    }

    /* renamed from: b */
    public synchronized int m27665b() {
        m27663d();
        return this.f33056a.size();
    }

    /* renamed from: c */
    public void m27666c(RunnableC9014d runnableC9014d) {
        runnableC9014d.m28824s();
        synchronized (this) {
            this.f33056a.put(runnableC9014d.m28819k(), runnableC9014d);
        }
        this.f33057b.execute(runnableC9014d);
        int i2 = this.f33060e;
        if (i2 < 600) {
            this.f33060e = i2 + 1;
        } else {
            m27663d();
            this.f33060e = 0;
        }
    }

    /* renamed from: e */
    public synchronized int m27667e(String str, int i2) {
        if (str == null) {
            return 0;
        }
        int size = this.f33056a.size();
        for (int i3 = 0; i3 < size; i3++) {
            RunnableC9014d runnableC9014dValueAt = this.f33056a.valueAt(i3);
            if (runnableC9014dValueAt != null && runnableC9014dValueAt.m28822p() && runnableC9014dValueAt.m28819k() != i2 && str.equals(runnableC9014dValueAt.m28820l())) {
                return runnableC9014dValueAt.m28819k();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public synchronized List<Integer> m27668f() {
        ArrayList arrayList;
        m27663d();
        arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f33056a.size(); i2++) {
            SparseArray<RunnableC9014d> sparseArray = this.f33056a;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i2)).m28819k()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m27669g(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<e.h.a.g0.d> r0 = r1.f33056a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            e.h.a.g0.d r2 = (p241e.p307h.p308a.p311g0.RunnableC9014d) r2     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            boolean r2 = r2.m28822p()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8708h.m27669g(int):boolean");
    }

    /* renamed from: h */
    public synchronized boolean m27670h(int i2) {
        if (m27665b() > 0) {
            C9034d.m28970i(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int iM28972b = C9035e.m28972b(i2);
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f33059d), Integer.valueOf(iM28972b));
        }
        List<Runnable> listShutdownNow = this.f33057b.shutdownNow();
        this.f33057b = C9032b.m28953a(iM28972b, "Network");
        if (listShutdownNow.size() > 0) {
            C9034d.m28970i(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(listShutdownNow.size()));
        }
        this.f33059d = iM28972b;
        return true;
    }
}
