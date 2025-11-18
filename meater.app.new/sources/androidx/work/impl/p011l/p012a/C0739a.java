package androidx.work.impl.p011l.p012a;

import androidx.work.AbstractC0807n;
import androidx.work.InterfaceC0815v;
import androidx.work.impl.p016n.C0775p;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DelayedWorkTracker.java */
/* renamed from: androidx.work.impl.l.a.a */
/* loaded from: classes.dex */
public class C0739a {

    /* renamed from: a */
    static final String f4712a = AbstractC0807n.m5223f("DelayedWorkTracker");

    /* renamed from: b */
    final C0740b f4713b;

    /* renamed from: c */
    private final InterfaceC0815v f4714c;

    /* renamed from: d */
    private final Map<String, Runnable> f4715d = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: androidx.work.impl.l.a.a$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0775p f4716f;

        a(C0775p c0775p) {
            this.f4716f = c0775p;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0807n.m5221c().mo5224a(C0739a.f4712a, String.format("Scheduling work %s", this.f4716f.f4799c), new Throwable[0]);
            C0739a.this.f4713b.mo4913a(this.f4716f);
        }
    }

    public C0739a(C0740b c0740b, InterfaceC0815v interfaceC0815v) {
        this.f4713b = c0740b;
        this.f4714c = interfaceC0815v;
    }

    /* renamed from: a */
    public void m5021a(C0775p c0775p) {
        Runnable runnableRemove = this.f4715d.remove(c0775p.f4799c);
        if (runnableRemove != null) {
            this.f4714c.mo4868b(runnableRemove);
        }
        a aVar = new a(c0775p);
        this.f4715d.put(c0775p.f4799c, aVar);
        this.f4714c.mo4867a(c0775p.m5090a() - System.currentTimeMillis(), aVar);
    }

    /* renamed from: b */
    public void m5022b(String str) {
        Runnable runnableRemove = this.f4715d.remove(str);
        if (runnableRemove != null) {
            this.f4714c.mo4868b(runnableRemove);
        }
    }
}
