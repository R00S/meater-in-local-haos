package p345i.p346a.p347g;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p345i.p346a.p347g.p348s.EnumC9212g;
import p345i.p346a.p347g.p349t.AbstractC9213a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSStatefulObject.java */
/* renamed from: i.a.g.i */
/* loaded from: classes2.dex */
public interface InterfaceC9196i {

    /* compiled from: DNSStatefulObject.java */
    /* renamed from: i.a.g.i$a */
    public static final class a {

        /* renamed from: a */
        private static InterfaceC9732b f35353a = C9733c.m32189i(a.class.getName());

        /* renamed from: b */
        private final String f35354b;

        /* renamed from: c */
        private final ConcurrentMap<Thread, Semaphore> f35355c = new ConcurrentHashMap(50);

        public a(String str) {
            this.f35354b = str;
        }

        /* renamed from: a */
        public void m29560a() {
            Collection<Semaphore> collectionValues = this.f35355c.values();
            for (Semaphore semaphore : collectionValues) {
                semaphore.release();
                collectionValues.remove(semaphore);
            }
        }

        /* renamed from: b */
        public void m29561b(long j2) throws InterruptedException {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.f35355c.get(threadCurrentThread) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f35355c.putIfAbsent(threadCurrentThread, semaphore);
            }
            try {
                this.f35355c.get(threadCurrentThread).tryAcquire(j2, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                f35353a.mo32178g("Exception ", e2);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("Semaphore: ");
            sb.append(this.f35354b);
            if (this.f35355c.size() == 0) {
                sb.append(" no semaphores.");
            } else {
                sb.append(" semaphores:\n");
                for (Thread thread : this.f35355c.keySet()) {
                    sb.append("\tThread: ");
                    sb.append(thread.getName());
                    sb.append(' ');
                    sb.append(this.f35355c.get(thread));
                    sb.append('\n');
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: DNSStatefulObject.java */
    /* renamed from: i.a.g.i$b */
    public static class b extends ReentrantLock implements InterfaceC9196i {

        /* renamed from: f */
        private static InterfaceC9732b f35356f = C9733c.m32189i(b.class.getName());

        /* renamed from: g */
        private volatile C9199l f35357g = null;

        /* renamed from: h */
        protected volatile AbstractC9213a f35358h = null;

        /* renamed from: i */
        protected volatile EnumC9212g f35359i = EnumC9212g.f35572f;

        /* renamed from: j */
        private final a f35360j = new a("Announce");

        /* renamed from: k */
        private final a f35361k = new a("Cancel");

        /* renamed from: v */
        private boolean m29562v() {
            return this.f35359i.m29763u() || this.f35359i.m29764v();
        }

        /* renamed from: w */
        private boolean m29563w() {
            return this.f35359i.m29765x() || this.f35359i.m29766y();
        }

        /* renamed from: a */
        public void m29564a(AbstractC9213a abstractC9213a, EnumC9212g enumC9212g) {
            if (this.f35358h == null && this.f35359i == enumC9212g) {
                lock();
                try {
                    if (this.f35358h == null && this.f35359i == enumC9212g) {
                        mo29581s(abstractC9213a);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        public boolean m29565b() {
            boolean z = false;
            if (!m29562v()) {
                lock();
                try {
                    if (!m29562v()) {
                        m29580r(EnumC9212g.f35578l);
                        mo29581s(null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        /* renamed from: c */
        public boolean m29566c() {
            boolean z = false;
            if (!m29563w()) {
                lock();
                try {
                    if (!m29563w()) {
                        m29580r(EnumC9212g.f35582p);
                        mo29581s(null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        @Override // p345i.p346a.p347g.InterfaceC9196i
        /* renamed from: d */
        public boolean mo29559d(AbstractC9213a abstractC9213a) {
            if (this.f35358h != abstractC9213a) {
                return true;
            }
            lock();
            try {
                if (this.f35358h == abstractC9213a) {
                    m29580r(this.f35359i.m29760g());
                } else {
                    f35356f.mo32179h("Trying to advance state whhen not the owner. owner: " + this.f35358h + " perpetrator: " + abstractC9213a);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* renamed from: e */
        public C9199l m29567e() {
            return this.f35357g;
        }

        /* renamed from: f */
        public boolean m29568f() {
            return this.f35359i.m29761k();
        }

        /* renamed from: g */
        public boolean m29569g() {
            return this.f35359i.m29762q();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m29570h(p345i.p346a.p347g.p349t.AbstractC9213a r2, p345i.p346a.p347g.p348s.EnumC9212g r3) {
            /*
                r1 = this;
                r1.lock()
                i.a.g.t.a r0 = r1.f35358h     // Catch: java.lang.Throwable -> L12
                if (r0 != r2) goto Ld
                i.a.g.s.g r2 = r1.f35359i     // Catch: java.lang.Throwable -> L12
                if (r2 != r3) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = 0
            Le:
                r1.unlock()
                return r2
            L12:
                r2 = move-exception
                r1.unlock()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.InterfaceC9196i.b.m29570h(i.a.g.t.a, i.a.g.s.g):boolean");
        }

        /* renamed from: i */
        public boolean m29571i() {
            return this.f35359i.m29763u();
        }

        /* renamed from: j */
        public boolean m29572j() {
            return this.f35359i.m29764v();
        }

        /* renamed from: k */
        public boolean m29573k() {
            return this.f35359i.m29765x();
        }

        /* renamed from: l */
        public boolean m29574l() {
            return this.f35359i.m29766y();
        }

        /* renamed from: m */
        public boolean m29575m() {
            return this.f35359i.m29758A();
        }

        /* renamed from: n */
        public boolean m29576n() {
            lock();
            try {
                m29580r(EnumC9212g.f35572f);
                mo29581s(null);
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* renamed from: o */
        public void m29577o(AbstractC9213a abstractC9213a) {
            if (this.f35358h == abstractC9213a) {
                lock();
                try {
                    if (this.f35358h == abstractC9213a) {
                        mo29581s(null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: p */
        public boolean m29578p() {
            if (m29562v()) {
                return true;
            }
            lock();
            try {
                if (!m29562v()) {
                    m29580r(this.f35359i.m29759D());
                    mo29581s(null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* renamed from: q */
        protected void mo29579q(C9199l c9199l) {
            this.f35357g = c9199l;
        }

        /* renamed from: r */
        protected void m29580r(EnumC9212g enumC9212g) {
            lock();
            try {
                this.f35359i = enumC9212g;
                if (m29568f()) {
                    this.f35360j.m29560a();
                }
                if (m29571i()) {
                    this.f35361k.m29560a();
                    this.f35360j.m29560a();
                }
            } finally {
                unlock();
            }
        }

        /* renamed from: s */
        protected void mo29581s(AbstractC9213a abstractC9213a) {
            this.f35358h = abstractC9213a;
        }

        /* renamed from: t */
        public boolean m29582t(long j2) throws InterruptedException {
            if (!m29568f() && !m29562v()) {
                this.f35360j.m29561b(j2 + 10);
            }
            if (!m29568f()) {
                this.f35360j.m29561b(10L);
                if (!m29568f()) {
                    if (m29562v() || m29563w()) {
                        f35356f.mo32174c("Wait for announced cancelled: " + this);
                    } else {
                        f35356f.mo32179h("Wait for announced timed out: " + this);
                    }
                }
            }
            return m29568f();
        }

        @Override // java.util.concurrent.locks.ReentrantLock
        public String toString() {
            String str;
            String str2 = "NO DNS";
            try {
                StringBuilder sb = new StringBuilder();
                if (this.f35357g != null) {
                    str = "DNS: " + this.f35357g.m29676p0() + " [" + this.f35357g.m29670i0() + "]";
                } else {
                    str = "NO DNS";
                }
                sb.append(str);
                sb.append(" state: ");
                sb.append(this.f35359i);
                sb.append(" task: ");
                sb.append(this.f35358h);
                return sb.toString();
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                if (this.f35357g != null) {
                    str2 = "DNS: " + this.f35357g.m29676p0();
                }
                sb2.append(str2);
                sb2.append(" state: ");
                sb2.append(this.f35359i);
                sb2.append(" task: ");
                sb2.append(this.f35358h);
                return sb2.toString();
            }
        }

        /* renamed from: u */
        public boolean m29583u(long j2) throws InterruptedException {
            if (!m29571i()) {
                this.f35361k.m29561b(j2);
            }
            if (!m29571i()) {
                this.f35361k.m29561b(10L);
                if (!m29571i() && !m29563w()) {
                    f35356f.mo32179h("Wait for canceled timed out: " + this);
                }
            }
            return m29571i();
        }
    }

    /* renamed from: d */
    boolean mo29559d(AbstractC9213a abstractC9213a);
}
