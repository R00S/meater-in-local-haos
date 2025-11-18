package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.AbstractC0807n;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.p016n.C0775p;

/* compiled from: SystemAlarmScheduler.java */
/* renamed from: androidx.work.impl.background.systemalarm.f */
/* loaded from: classes.dex */
public class C0722f implements InterfaceC0727e {

    /* renamed from: f */
    private static final String f4582f = AbstractC0807n.m5223f("SystemAlarmScheduler");

    /* renamed from: g */
    private final Context f4583g;

    public C0722f(Context context) {
        this.f4583g = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m4912b(C0775p c0775p) {
        AbstractC0807n.m5221c().mo5224a(f4582f, String.format("Scheduling work with workSpecId %s", c0775p.f4799c), new Throwable[0]);
        this.f4583g.startService(C0718b.m4882f(this.f4583g, c0775p.f4799c));
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: a */
    public void mo4913a(C0775p... c0775pArr) {
        for (C0775p c0775p : c0775pArr) {
            m4912b(c0775p);
        }
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: c */
    public boolean mo4914c() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    public void cancel(String str) {
        this.f4583g.startService(C0718b.m4883g(this.f4583g, str));
    }
}
