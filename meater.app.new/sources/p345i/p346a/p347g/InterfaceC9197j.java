package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p345i.p346a.p347g.p349t.C9214b;
import p345i.p346a.p347g.p349t.C9215c;
import p345i.p346a.p347g.p349t.p350d.C9217b;
import p345i.p346a.p347g.p349t.p350d.C9218c;
import p345i.p346a.p347g.p349t.p351e.C9219a;
import p345i.p346a.p347g.p349t.p351e.C9220b;
import p345i.p346a.p347g.p349t.p351e.C9222d;
import p345i.p346a.p347g.p349t.p351e.C9223e;

/* compiled from: DNSTaskStarter.java */
/* renamed from: i.a.g.j */
/* loaded from: classes2.dex */
public interface InterfaceC9197j {

    /* compiled from: DNSTaskStarter.java */
    /* renamed from: i.a.g.j$b */
    public static final class b {

        /* renamed from: a */
        private static volatile b f35366a;

        /* renamed from: b */
        private static final AtomicReference<a> f35367b = new AtomicReference<>();

        /* renamed from: c */
        private final ConcurrentMap<C9199l, InterfaceC9197j> f35368c = new ConcurrentHashMap(20);

        /* compiled from: DNSTaskStarter.java */
        /* renamed from: i.a.g.j$b$a */
        public interface a {
            /* renamed from: a */
            InterfaceC9197j m29600a(C9199l c9199l);
        }

        private b() {
        }

        /* renamed from: b */
        public static b m29596b() {
            if (f35366a == null) {
                synchronized (b.class) {
                    if (f35366a == null) {
                        f35366a = new b();
                    }
                }
            }
            return f35366a;
        }

        /* renamed from: d */
        protected static InterfaceC9197j m29597d(C9199l c9199l) {
            a aVar = f35367b.get();
            InterfaceC9197j interfaceC9197jM29600a = aVar != null ? aVar.m29600a(c9199l) : null;
            return interfaceC9197jM29600a != null ? interfaceC9197jM29600a : new a(c9199l);
        }

        /* renamed from: a */
        public void m29598a(C9199l c9199l) {
            this.f35368c.remove(c9199l);
        }

        /* renamed from: c */
        public InterfaceC9197j m29599c(C9199l c9199l) {
            InterfaceC9197j interfaceC9197j = this.f35368c.get(c9199l);
            if (interfaceC9197j != null) {
                return interfaceC9197j;
            }
            this.f35368c.putIfAbsent(c9199l, m29597d(c9199l));
            return this.f35368c.get(c9199l);
        }
    }

    /* renamed from: a */
    void mo29584a();

    /* renamed from: b */
    void mo29585b();

    /* renamed from: c */
    void mo29586c(String str);

    /* renamed from: e */
    void mo29587e();

    /* renamed from: f */
    void mo29588f();

    /* renamed from: j */
    void mo29589j();

    /* renamed from: k */
    void mo29590k();

    /* renamed from: l */
    void mo29591l();

    /* renamed from: m */
    void mo29592m(C9190c c9190c, InetAddress inetAddress, int i2);

    /* renamed from: p */
    void mo29593p();

    /* renamed from: x */
    void mo29594x();

    /* renamed from: y */
    void mo29595y(C9204q c9204q);

    /* compiled from: DNSTaskStarter.java */
    /* renamed from: i.a.g.j$a */
    public static final class a implements InterfaceC9197j {

        /* renamed from: f */
        private final C9199l f35362f;

        /* renamed from: g */
        private final Timer f35363g;

        /* renamed from: h */
        private final Timer f35364h;

        public a(C9199l c9199l) {
            this.f35362f = c9199l;
            this.f35363g = new C11534a("JmDNS(" + c9199l.m29676p0() + ").Timer", true);
            this.f35364h = new C11534a("JmDNS(" + c9199l.m29676p0() + ").State.Timer", true);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: a */
        public void mo29584a() {
            this.f35363g.purge();
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: b */
        public void mo29585b() {
            this.f35364h.cancel();
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: c */
        public void mo29586c(String str) {
            new C9218c(this.f35362f, str).m29778j(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: e */
        public void mo29587e() {
            this.f35363g.cancel();
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: f */
        public void mo29588f() {
            new C9220b(this.f35362f).m29787u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: j */
        public void mo29589j() {
            new C9214b(this.f35362f).m29773g(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: k */
        public void mo29590k() {
            new C9222d(this.f35362f).m29795u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: l */
        public void mo29591l() {
            new C9219a(this.f35362f).m29786u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: m */
        public void mo29592m(C9190c c9190c, InetAddress inetAddress, int i2) {
            new C9215c(this.f35362f, c9190c, inetAddress, i2).m29774g(this.f35363g);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: p */
        public void mo29593p() {
            this.f35364h.purge();
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: x */
        public void mo29594x() {
            new C9223e(this.f35362f).m29796u(this.f35364h);
        }

        @Override // p345i.p346a.p347g.InterfaceC9197j
        /* renamed from: y */
        public void mo29595y(C9204q c9204q) {
            new C9217b(this.f35362f, c9204q).m29778j(this.f35363g);
        }

        /* compiled from: DNSTaskStarter.java */
        /* renamed from: i.a.g.j$a$a, reason: collision with other inner class name */
        public static class C11534a extends Timer {

            /* renamed from: a */
            private volatile boolean f35365a;

            public C11534a(String str, boolean z) {
                super(str, z);
                this.f35365a = false;
            }

            @Override // java.util.Timer
            public synchronized void cancel() {
                if (this.f35365a) {
                    return;
                }
                this.f35365a = true;
                super.cancel();
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, j2);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j2, long j3) {
                if (this.f35365a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, date);
            }

            @Override // java.util.Timer
            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.scheduleAtFixedRate(timerTask, date, j2);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, long j2, long j3) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, j2, j3);
            }

            @Override // java.util.Timer
            public synchronized void schedule(TimerTask timerTask, Date date, long j2) {
                if (this.f35365a) {
                    return;
                }
                super.schedule(timerTask, date, j2);
            }
        }
    }
}
