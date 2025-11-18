package p241e.p307h.p308a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.p312h0.C9021b;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: LostServiceConnectedHandler.java */
/* renamed from: e.h.a.z */
/* loaded from: classes2.dex */
public class C9051z extends AbstractC8999e implements InterfaceC9047v {

    /* renamed from: b */
    private final ArrayList<InterfaceC8991a.b> f34853b = new ArrayList<>();

    @Override // p241e.p307h.p308a.InterfaceC9047v
    /* renamed from: a */
    public boolean mo29067a(InterfaceC8991a.b bVar) {
        return !this.f34853b.isEmpty() && this.f34853b.contains(bVar);
    }

    @Override // p241e.p307h.p308a.InterfaceC9047v
    /* renamed from: b */
    public boolean mo29068b(InterfaceC8991a.b bVar) {
        if (!C9042q.m29052e().m29060i()) {
            synchronized (this.f34853b) {
                if (!C9042q.m29052e().m29060i()) {
                    if (C9034d.f34819a) {
                        C9034d.m28962a(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(bVar.mo28649v().getId()));
                    }
                    C9038m.m29029b().mo27610u0(C9033c.m28956a());
                    if (!this.f34853b.contains(bVar)) {
                        bVar.mo28648b();
                        this.f34853b.add(bVar);
                    }
                    return true;
                }
            }
        }
        mo29069c(bVar);
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9047v
    /* renamed from: c */
    public void mo29069c(InterfaceC8991a.b bVar) {
        if (this.f34853b.isEmpty()) {
            return;
        }
        synchronized (this.f34853b) {
            this.f34853b.remove(bVar);
        }
    }

    @Override // p241e.p307h.p308a.AbstractC8999e
    /* renamed from: e */
    public void mo28714e() {
        InterfaceC9048w interfaceC9048wM29059g = C9042q.m29052e().m29059g();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.f34853b) {
            List<InterfaceC8991a.b> list = (List) this.f34853b.clone();
            this.f34853b.clear();
            ArrayList arrayList = new ArrayList(interfaceC9048wM29059g.mo28683a());
            for (InterfaceC8991a.b bVar : list) {
                int iMo28651x = bVar.mo28651x();
                if (interfaceC9048wM29059g.mo28688f(iMo28651x)) {
                    bVar.mo28649v().mo28630m().mo28654a();
                    if (!arrayList.contains(Integer.valueOf(iMo28651x))) {
                        arrayList.add(Integer.valueOf(iMo28651x));
                    }
                } else {
                    bVar.mo28650w();
                }
            }
            interfaceC9048wM29059g.mo28686d(arrayList);
        }
    }

    @Override // p241e.p307h.p308a.AbstractC8999e
    /* renamed from: f */
    public void mo28715f() {
        if (m28716g() != C9021b.a.lost) {
            if (C9019h.m28890i().m28902m() > 0) {
                C9034d.m28970i(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(C9019h.m28890i().m28902m()));
                return;
            }
            return;
        }
        InterfaceC9048w interfaceC9048wM29059g = C9042q.m29052e().m29059g();
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(C9019h.m28890i().m28902m()));
        }
        if (C9019h.m28890i().m28902m() > 0) {
            synchronized (this.f34853b) {
                C9019h.m28890i().m28896f(this.f34853b);
                Iterator<InterfaceC8991a.b> it = this.f34853b.iterator();
                while (it.hasNext()) {
                    it.next().mo28648b();
                }
                interfaceC9048wM29059g.mo28684b();
            }
            try {
                C9042q.m29052e().m29055b();
            } catch (IllegalStateException unused) {
                C9034d.m28970i(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }
}
