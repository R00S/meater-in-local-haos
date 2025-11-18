package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.AbstractC0807n;
import androidx.work.impl.InterfaceC0715b;
import androidx.work.impl.background.systemalarm.C0721e;
import androidx.work.impl.p013m.C0744d;
import androidx.work.impl.p013m.InterfaceC0743c;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.C0791j;
import androidx.work.impl.utils.C0795n;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public class C0720d implements InterfaceC0743c, InterfaceC0715b, C0795n.b {

    /* renamed from: f */
    private static final String f4556f = AbstractC0807n.m5223f("DelayMetCommandHandler");

    /* renamed from: g */
    private final Context f4557g;

    /* renamed from: h */
    private final int f4558h;

    /* renamed from: i */
    private final String f4559i;

    /* renamed from: j */
    private final C0721e f4560j;

    /* renamed from: k */
    private final C0744d f4561k;

    /* renamed from: n */
    private PowerManager.WakeLock f4564n;

    /* renamed from: o */
    private boolean f4565o = false;

    /* renamed from: m */
    private int f4563m = 0;

    /* renamed from: l */
    private final Object f4562l = new Object();

    C0720d(Context context, int i2, String str, C0721e c0721e) {
        this.f4557g = context;
        this.f4558h = i2;
        this.f4560j = c0721e;
        this.f4559i = str;
        this.f4561k = new C0744d(context, c0721e.m4906f(), this);
    }

    /* renamed from: c */
    private void m4894c() {
        synchronized (this.f4562l) {
            this.f4561k.m5035e();
            this.f4560j.m4908h().m5176c(this.f4559i);
            PowerManager.WakeLock wakeLock = this.f4564n;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC0807n.m5221c().mo5224a(f4556f, String.format("Releasing wakelock %s for WorkSpec %s", this.f4564n, this.f4559i), new Throwable[0]);
                this.f4564n.release();
            }
        }
    }

    /* renamed from: g */
    private void m4895g() {
        synchronized (this.f4562l) {
            if (this.f4563m < 2) {
                this.f4563m = 2;
                AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
                String str = f4556f;
                abstractC0807nM5221c.mo5224a(str, String.format("Stopping work for WorkSpec %s", this.f4559i), new Throwable[0]);
                Intent intentM4883g = C0718b.m4883g(this.f4557g, this.f4559i);
                C0721e c0721e = this.f4560j;
                c0721e.m4910k(new C0721e.b(c0721e, intentM4883g, this.f4558h));
                if (this.f4560j.m4905e().m4934g(this.f4559i)) {
                    AbstractC0807n.m5221c().mo5224a(str, String.format("WorkSpec %s needs to be rescheduled", this.f4559i), new Throwable[0]);
                    Intent intentM4882f = C0718b.m4882f(this.f4557g, this.f4559i);
                    C0721e c0721e2 = this.f4560j;
                    c0721e2.m4910k(new C0721e.b(c0721e2, intentM4882f, this.f4558h));
                } else {
                    AbstractC0807n.m5221c().mo5224a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f4559i), new Throwable[0]);
                }
            } else {
                AbstractC0807n.m5221c().mo5224a(f4556f, String.format("Already stopped work for %s", this.f4559i), new Throwable[0]);
            }
        }
    }

    @Override // androidx.work.impl.utils.C0795n.b
    /* renamed from: a */
    public void mo4896a(String str) {
        AbstractC0807n.m5221c().mo5224a(f4556f, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m4895g();
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: b */
    public void mo4897b(List<String> list) {
        m4895g();
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        AbstractC0807n.m5221c().mo5224a(f4556f, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        m4894c();
        if (z) {
            Intent intentM4882f = C0718b.m4882f(this.f4557g, this.f4559i);
            C0721e c0721e = this.f4560j;
            c0721e.m4910k(new C0721e.b(c0721e, intentM4882f, this.f4558h));
        }
        if (this.f4565o) {
            Intent intentM4878a = C0718b.m4878a(this.f4557g);
            C0721e c0721e2 = this.f4560j;
            c0721e2.m4910k(new C0721e.b(c0721e2, intentM4878a, this.f4558h));
        }
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: e */
    public void mo4898e(List<String> list) {
        if (list.contains(this.f4559i)) {
            synchronized (this.f4562l) {
                if (this.f4563m == 0) {
                    this.f4563m = 1;
                    AbstractC0807n.m5221c().mo5224a(f4556f, String.format("onAllConstraintsMet for %s", this.f4559i), new Throwable[0]);
                    if (this.f4560j.m4905e().m4937j(this.f4559i)) {
                        this.f4560j.m4908h().m5175b(this.f4559i, 600000L, this);
                    } else {
                        m4894c();
                    }
                } else {
                    AbstractC0807n.m5221c().mo5224a(f4556f, String.format("Already started work for %s", this.f4559i), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    void m4899f() {
        this.f4564n = C0791j.m5171b(this.f4557g, String.format("%s (%s)", this.f4559i, Integer.valueOf(this.f4558h)));
        AbstractC0807n abstractC0807nM5221c = AbstractC0807n.m5221c();
        String str = f4556f;
        abstractC0807nM5221c.mo5224a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f4564n, this.f4559i), new Throwable[0]);
        this.f4564n.acquire();
        C0775p c0775pMo5110m = this.f4560j.m4907g().m4997t().mo4854j().mo5110m(this.f4559i);
        if (c0775pMo5110m == null) {
            m4895g();
            return;
        }
        boolean zM5091b = c0775pMo5110m.m5091b();
        this.f4565o = zM5091b;
        if (zM5091b) {
            this.f4561k.m5034d(Collections.singletonList(c0775pMo5110m));
        } else {
            AbstractC0807n.m5221c().mo5224a(str, String.format("No constraints for %s", this.f4559i), new Throwable[0]);
            mo4898e(Collections.singletonList(this.f4559i));
        }
    }
}
