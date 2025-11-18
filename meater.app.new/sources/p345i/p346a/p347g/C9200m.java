package p345i.p346a.p347g;

import androidx.recyclerview.widget.RecyclerView;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p345i.p346a.AbstractC9184c;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.InterfaceC9186e;
import p345i.p346a.InterfaceC9187f;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: ListenerStatus.java */
/* renamed from: i.a.g.m */
/* loaded from: classes2.dex */
public class C9200m<T extends EventListener> {

    /* renamed from: a */
    private final T f35428a;

    /* renamed from: b */
    private final boolean f35429b;

    /* compiled from: ListenerStatus.java */
    /* renamed from: i.a.g.m$a */
    public static class a extends C9200m<InterfaceC9186e> {

        /* renamed from: c */
        private static InterfaceC9732b f35430c = C9733c.m32189i(a.class.getName());

        /* renamed from: d */
        private final ConcurrentMap<String, AbstractC9185d> f35431d;

        public a(InterfaceC9186e interfaceC9186e, boolean z) {
            super(interfaceC9186e, z);
            this.f35431d = new ConcurrentHashMap(32);
        }

        /* renamed from: c */
        private static final boolean m29700c(AbstractC9185d abstractC9185d, AbstractC9185d abstractC9185d2) {
            if (abstractC9185d == null || abstractC9185d2 == null || !abstractC9185d.equals(abstractC9185d2)) {
                return false;
            }
            byte[] bArrMo29428r = abstractC9185d.mo29428r();
            byte[] bArrMo29428r2 = abstractC9185d2.mo29428r();
            if (bArrMo29428r.length != bArrMo29428r2.length) {
                return false;
            }
            for (int i2 = 0; i2 < bArrMo29428r.length; i2++) {
                if (bArrMo29428r[i2] != bArrMo29428r2[i2]) {
                    return false;
                }
            }
            return abstractC9185d.mo29432v(abstractC9185d2);
        }

        /* renamed from: d */
        void m29701d(AbstractC9184c abstractC9184c) {
            if (this.f35431d.putIfAbsent(abstractC9184c.mo29413f() + "." + abstractC9184c.mo29414g(), abstractC9184c.mo29412e().clone()) != null) {
                f35430c.mo32174c("Service Added called for a service already added: " + abstractC9184c);
                return;
            }
            m29698a().serviceAdded(abstractC9184c);
            AbstractC9185d abstractC9185dMo29412e = abstractC9184c.mo29412e();
            if (abstractC9185dMo29412e == null || !abstractC9185dMo29412e.mo29431u()) {
                return;
            }
            m29698a().serviceResolved(abstractC9184c);
        }

        /* renamed from: e */
        void m29702e(AbstractC9184c abstractC9184c) {
            String str = abstractC9184c.mo29413f() + "." + abstractC9184c.mo29414g();
            ConcurrentMap<String, AbstractC9185d> concurrentMap = this.f35431d;
            if (concurrentMap.remove(str, concurrentMap.get(str))) {
                m29698a().serviceRemoved(abstractC9184c);
                return;
            }
            f35430c.mo32174c("Service Removed called for a service already removed: " + abstractC9184c);
        }

        /* renamed from: f */
        synchronized void m29703f(AbstractC9184c abstractC9184c) {
            AbstractC9185d abstractC9185dMo29412e = abstractC9184c.mo29412e();
            if (abstractC9185dMo29412e == null || !abstractC9185dMo29412e.mo29431u()) {
                f35430c.mo32179h("Service Resolved called for an unresolved event: " + abstractC9184c);
            } else {
                String str = abstractC9184c.mo29413f() + "." + abstractC9184c.mo29414g();
                AbstractC9185d abstractC9185d = this.f35431d.get(str);
                if (m29700c(abstractC9185dMo29412e, abstractC9185d)) {
                    f35430c.mo32174c("Service Resolved called for a service already resolved: " + abstractC9184c);
                } else if (abstractC9185d == null) {
                    if (this.f35431d.putIfAbsent(str, abstractC9185dMo29412e.clone()) == null) {
                        m29698a().serviceResolved(abstractC9184c);
                    }
                } else if (this.f35431d.replace(str, abstractC9185d, abstractC9185dMo29412e.clone())) {
                    m29698a().serviceResolved(abstractC9184c);
                }
            }
        }

        @Override // p345i.p346a.p347g.C9200m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(m29698a().toString());
            if (this.f35431d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f35431d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: ListenerStatus.java */
    /* renamed from: i.a.g.m$b */
    public static class b extends C9200m<InterfaceC9187f> {

        /* renamed from: c */
        private static InterfaceC9732b f35432c = C9733c.m32189i(b.class.getName());

        /* renamed from: d */
        private final ConcurrentMap<String, String> f35433d;

        /* renamed from: c */
        void m29704c(AbstractC9184c abstractC9184c) {
            if (this.f35433d.putIfAbsent(abstractC9184c.mo29414g(), abstractC9184c.mo29414g()) == null) {
                m29698a().m29435b(abstractC9184c);
                return;
            }
            f35432c.mo32180i("Service Type Added called for a service type already added: " + abstractC9184c);
        }

        /* renamed from: d */
        void m29705d(AbstractC9184c abstractC9184c) {
            if (this.f35433d.putIfAbsent(abstractC9184c.mo29414g(), abstractC9184c.mo29414g()) == null) {
                m29698a().m29434a(abstractC9184c);
                return;
            }
            f35432c.mo32180i("Service Sub Type Added called for a service sub type already added: " + abstractC9184c);
        }

        @Override // p345i.p346a.p347g.C9200m
        public String toString() {
            StringBuilder sb = new StringBuilder(RecyclerView.AbstractC0599l.FLAG_MOVED);
            sb.append("[Status for ");
            sb.append(m29698a().toString());
            if (this.f35433d.isEmpty()) {
                sb.append(" no type event ");
            } else {
                sb.append(" (");
                Iterator<String> it = this.f35433d.keySet().iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ", ");
                }
                sb.append(") ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public C9200m(T t, boolean z) {
        this.f35428a = t;
        this.f35429b = z;
    }

    /* renamed from: a */
    public T m29698a() {
        return this.f35428a;
    }

    /* renamed from: b */
    public boolean m29699b() {
        return this.f35429b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9200m) && m29698a().equals(((C9200m) obj).m29698a());
    }

    public int hashCode() {
        return m29698a().hashCode();
    }

    public String toString() {
        return "[Status for " + m29698a().toString() + "]";
    }
}
