package androidx.work.impl.utils;

import android.database.SQLException;
import androidx.work.AbstractC0807n;
import androidx.work.C0817x;
import androidx.work.impl.C0726d;
import androidx.work.impl.C0737j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p016n.InterfaceC0776q;

/* compiled from: StopWorkRunnable.java */
/* renamed from: androidx.work.impl.utils.i */
/* loaded from: classes.dex */
public class RunnableC0790i implements Runnable {

    /* renamed from: f */
    private static final String f4883f = AbstractC0807n.m5223f("StopWorkRunnable");

    /* renamed from: g */
    private final C0737j f4884g;

    /* renamed from: h */
    private final String f4885h;

    /* renamed from: i */
    private final boolean f4886i;

    public RunnableC0790i(C0737j c0737j, String str, boolean z) {
        this.f4884g = c0737j;
        this.f4885h = str;
        this.f4886i = z;
    }

    @Override // java.lang.Runnable
    public void run() throws SQLException {
        boolean zM4941o;
        WorkDatabase workDatabaseM4997t = this.f4884g.m4997t();
        C0726d c0726dM4995r = this.f4884g.m4995r();
        InterfaceC0776q interfaceC0776qMo4854j = workDatabaseM4997t.mo4854j();
        workDatabaseM4997t.beginTransaction();
        try {
            boolean zM4935h = c0726dM4995r.m4935h(this.f4885h);
            if (this.f4886i) {
                zM4941o = this.f4884g.m4995r().m4940n(this.f4885h);
            } else {
                if (!zM4935h && interfaceC0776qMo4854j.mo5109l(this.f4885h) == C0817x.a.RUNNING) {
                    interfaceC0776qMo4854j.mo5098a(C0817x.a.ENQUEUED, this.f4885h);
                }
                zM4941o = this.f4884g.m4995r().m4941o(this.f4885h);
            }
            AbstractC0807n.m5221c().mo5224a(f4883f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f4885h, Boolean.valueOf(zM4941o)), new Throwable[0]);
            workDatabaseM4997t.setTransactionSuccessful();
        } finally {
            workDatabaseM4997t.endTransaction();
        }
    }
}
