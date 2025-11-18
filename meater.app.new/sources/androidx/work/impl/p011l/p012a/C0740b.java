package androidx.work.impl.p011l.p012a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC0807n;
import androidx.work.C0703b;
import androidx.work.C0817x;
import androidx.work.impl.C0737j;
import androidx.work.impl.InterfaceC0715b;
import androidx.work.impl.InterfaceC0727e;
import androidx.work.impl.p013m.C0744d;
import androidx.work.impl.p013m.InterfaceC0743c;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.C0787f;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler.java */
/* renamed from: androidx.work.impl.l.a.b */
/* loaded from: classes.dex */
public class C0740b implements InterfaceC0727e, InterfaceC0743c, InterfaceC0715b {

    /* renamed from: f */
    private static final String f4718f = AbstractC0807n.m5223f("GreedyScheduler");

    /* renamed from: g */
    private final Context f4719g;

    /* renamed from: h */
    private final C0737j f4720h;

    /* renamed from: i */
    private final C0744d f4721i;

    /* renamed from: k */
    private C0739a f4723k;

    /* renamed from: l */
    private boolean f4724l;

    /* renamed from: n */
    Boolean f4726n;

    /* renamed from: j */
    private final Set<C0775p> f4722j = new HashSet();

    /* renamed from: m */
    private final Object f4725m = new Object();

    public C0740b(Context context, C0703b c0703b, InterfaceC0799a interfaceC0799a, C0737j c0737j) {
        this.f4719g = context;
        this.f4720h = c0737j;
        this.f4721i = new C0744d(context, interfaceC0799a, this);
        this.f4723k = new C0739a(this, c0703b.m4792k());
    }

    /* renamed from: f */
    private void m5023f() {
        this.f4726n = Boolean.valueOf(C0787f.m5167b(this.f4719g, this.f4720h.m4993n()));
    }

    /* renamed from: g */
    private void m5024g() {
        if (this.f4724l) {
            return;
        }
        this.f4720h.m4995r().m4932c(this);
        this.f4724l = true;
    }

    /* renamed from: h */
    private void m5025h(String str) {
        synchronized (this.f4725m) {
            Iterator<C0775p> it = this.f4722j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0775p next = it.next();
                if (next.f4799c.equals(str)) {
                    AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f4722j.remove(next);
                    this.f4721i.m5034d(this.f4722j);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: a */
    public void mo4913a(C0775p... c0775pArr) {
        if (this.f4726n == null) {
            m5023f();
        }
        if (!this.f4726n.booleanValue()) {
            AbstractC0807n.m5221c().mo5226d(f4718f, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m5024g();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C0775p c0775p : c0775pArr) {
            long jM5090a = c0775p.m5090a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0775p.f4800d == C0817x.a.ENQUEUED) {
                if (jCurrentTimeMillis < jM5090a) {
                    C0739a c0739a = this.f4723k;
                    if (c0739a != null) {
                        c0739a.m5021a(c0775p);
                    }
                } else if (c0775p.m5091b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && c0775p.f4808l.m4806h()) {
                        AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Ignoring WorkSpec %s, Requires device idle.", c0775p), new Throwable[0]);
                    } else if (i2 < 24 || !c0775p.f4808l.m4803e()) {
                        hashSet.add(c0775p);
                        hashSet2.add(c0775p.f4799c);
                    } else {
                        AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c0775p), new Throwable[0]);
                    }
                } else {
                    AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Starting work for %s", c0775p.f4799c), new Throwable[0]);
                    this.f4720h.m5002z(c0775p.f4799c);
                }
            }
        }
        synchronized (this.f4725m) {
            if (!hashSet.isEmpty()) {
                AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f4722j.addAll(hashSet);
                this.f4721i.m5034d(this.f4722j);
            }
        }
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: b */
    public void mo4897b(List<String> list) {
        for (String str : list) {
            AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f4720h.m4983C(str);
        }
    }

    @Override // androidx.work.impl.InterfaceC0727e
    /* renamed from: c */
    public boolean mo4914c() {
        return false;
    }

    @Override // androidx.work.impl.InterfaceC0727e
    public void cancel(String str) {
        if (this.f4726n == null) {
            m5023f();
        }
        if (!this.f4726n.booleanValue()) {
            AbstractC0807n.m5221c().mo5226d(f4718f, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m5024g();
        AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C0739a c0739a = this.f4723k;
        if (c0739a != null) {
            c0739a.m5022b(str);
        }
        this.f4720h.m4983C(str);
    }

    @Override // androidx.work.impl.InterfaceC0715b
    /* renamed from: d */
    public void mo4869d(String str, boolean z) {
        m5025h(str);
    }

    @Override // androidx.work.impl.p013m.InterfaceC0743c
    /* renamed from: e */
    public void mo4898e(List<String> list) {
        for (String str : list) {
            AbstractC0807n.m5221c().mo5224a(f4718f, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f4720h.m5002z(str);
        }
    }
}
