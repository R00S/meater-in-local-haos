package androidx.work.impl.utils;

import android.content.Context;
import android.database.SQLException;
import androidx.work.AbstractC0807n;
import androidx.work.C0706e;
import androidx.work.C0817x;
import androidx.work.InterfaceC0813t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.C0772m;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.UUID;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: WorkProgressUpdater.java */
/* renamed from: androidx.work.impl.utils.m */
/* loaded from: classes.dex */
public class C0794m implements InterfaceC0813t {

    /* renamed from: a */
    static final String f4909a = AbstractC0807n.m5223f("WorkProgressUpdater");

    /* renamed from: b */
    final WorkDatabase f4910b;

    /* renamed from: c */
    final InterfaceC0799a f4911c;

    /* compiled from: WorkProgressUpdater.java */
    /* renamed from: androidx.work.impl.utils.m$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ UUID f4912f;

        /* renamed from: g */
        final /* synthetic */ C0706e f4913g;

        /* renamed from: h */
        final /* synthetic */ C0798c f4914h;

        a(UUID uuid, C0706e c0706e, C0798c c0798c) {
            this.f4912f = uuid;
            this.f4913g = c0706e;
            this.f4914h = c0798c;
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            C0775p c0775pMo5110m;
            String string = this.f4912f.toString();
            AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
            String str = C0794m.f4909a;
            abstractC0807nM5221c.mo5224a(str, String.format("Updating progress for %s (%s)", this.f4912f, this.f4913g), new Throwable[0]);
            C0794m.this.f4910b.beginTransaction();
            try {
                c0775pMo5110m = C0794m.this.f4910b.mo4854j().mo5110m(string);
            } finally {
                try {
                } finally {
                }
            }
            if (c0775pMo5110m == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (c0775pMo5110m.f4800d == C0817x.a.RUNNING) {
                C0794m.this.f4910b.mo4853i().mo5088b(new C0772m(string, this.f4913g));
            } else {
                AbstractC0807n.m5221c().mo5228h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f4914h.mo5193q(null);
            C0794m.this.f4910b.setTransactionSuccessful();
        }
    }

    public C0794m(WorkDatabase workDatabase, InterfaceC0799a interfaceC0799a) {
        this.f4910b = workDatabase;
        this.f4911c = interfaceC0799a;
    }

    @Override // androidx.work.InterfaceC0813t
    /* renamed from: a */
    public InterfaceFutureC8955a<Void> mo5173a(Context context, UUID uuid, C0706e c0706e) {
        C0798c c0798cM5203u = C0798c.m5203u();
        this.f4911c.mo5205b(new a(uuid, c0706e, c0798cM5203u));
        return c0798cM5203u;
    }
}
