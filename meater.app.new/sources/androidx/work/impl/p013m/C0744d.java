package androidx.work.impl.p013m;

import android.content.Context;
import androidx.work.AbstractC0807n;
import androidx.work.impl.p013m.p014e.AbstractC0747c;
import androidx.work.impl.p013m.p014e.C0745a;
import androidx.work.impl.p013m.p014e.C0746b;
import androidx.work.impl.p013m.p014e.C0748d;
import androidx.work.impl.p013m.p014e.C0749e;
import androidx.work.impl.p013m.p014e.C0750f;
import androidx.work.impl.p013m.p014e.C0751g;
import androidx.work.impl.p013m.p014e.C0752h;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker.java */
/* renamed from: androidx.work.impl.m.d */
/* loaded from: classes.dex */
public class C0744d implements AbstractC0747c.a {

    /* renamed from: a */
    private static final String f4731a = AbstractC0807n.m5223f("WorkConstraintsTracker");

    /* renamed from: b */
    private final InterfaceC0743c f4732b;

    /* renamed from: c */
    private final AbstractC0747c<?>[] f4733c;

    /* renamed from: d */
    private final Object f4734d;

    public C0744d(Context context, InterfaceC0799a interfaceC0799a, InterfaceC0743c interfaceC0743c) {
        Context applicationContext = context.getApplicationContext();
        this.f4732b = interfaceC0743c;
        this.f4733c = new AbstractC0747c[]{new C0745a(applicationContext, interfaceC0799a), new C0746b(applicationContext, interfaceC0799a), new C0752h(applicationContext, interfaceC0799a), new C0748d(applicationContext, interfaceC0799a), new C0751g(applicationContext, interfaceC0799a), new C0750f(applicationContext, interfaceC0799a), new C0749e(applicationContext, interfaceC0799a)};
        this.f4734d = new Object();
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c.a
    /* renamed from: a */
    public void mo5031a(List<String> list) {
        synchronized (this.f4734d) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m5033c(str)) {
                    AbstractC0807n.m5221c().mo5224a(f4731a, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            InterfaceC0743c interfaceC0743c = this.f4732b;
            if (interfaceC0743c != null) {
                interfaceC0743c.mo4898e(arrayList);
            }
        }
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c.a
    /* renamed from: b */
    public void mo5032b(List<String> list) {
        synchronized (this.f4734d) {
            InterfaceC0743c interfaceC0743c = this.f4732b;
            if (interfaceC0743c != null) {
                interfaceC0743c.mo4897b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean m5033c(String str) {
        synchronized (this.f4734d) {
            for (AbstractC0747c<?> abstractC0747c : this.f4733c) {
                if (abstractC0747c.m5041d(str)) {
                    AbstractC0807n.m5221c().mo5224a(f4731a, String.format("Work %s constrained by %s", str, abstractC0747c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m5034d(Iterable<C0775p> iterable) {
        synchronized (this.f4734d) {
            for (AbstractC0747c<?> abstractC0747c : this.f4733c) {
                abstractC0747c.m5044g(null);
            }
            for (AbstractC0747c<?> abstractC0747c2 : this.f4733c) {
                abstractC0747c2.m5042e(iterable);
            }
            for (AbstractC0747c<?> abstractC0747c3 : this.f4733c) {
                abstractC0747c3.m5044g(this);
            }
        }
    }

    /* renamed from: e */
    public void m5035e() {
        synchronized (this.f4734d) {
            for (AbstractC0747c<?> abstractC0747c : this.f4733c) {
                abstractC0747c.m5043f();
            }
        }
    }
}
