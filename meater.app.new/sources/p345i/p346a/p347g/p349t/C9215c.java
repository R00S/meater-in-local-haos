package p345i.p346a.p347g.p349t;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9190c;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9194g;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.p348s.C9206a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: Responder.java */
/* renamed from: i.a.g.t.c */
/* loaded from: classes2.dex */
public class C9215c extends AbstractC9213a {

    /* renamed from: g */
    static InterfaceC9732b f35598g = C9733c.m32189i(C9215c.class.getName());

    /* renamed from: h */
    private final C9190c f35599h;

    /* renamed from: i */
    private final InetAddress f35600i;

    /* renamed from: j */
    private final int f35601j;

    /* renamed from: k */
    private final boolean f35602k;

    public C9215c(C9199l c9199l, C9190c c9190c, InetAddress inetAddress, int i2) {
        super(c9199l);
        this.f35599h = c9190c;
        this.f35600i = inetAddress;
        this.f35601j = i2;
        this.f35602k = i2 != C9206a.f35467a;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Responder(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: g */
    public void m29774g(Timer timer) {
        boolean zMo29527B = true;
        for (C9194g c9194g : this.f35599h.m29495l()) {
            if (f35598g.mo32175d()) {
                f35598g.mo32180i(mo29772f() + "start() question=" + c9194g);
            }
            zMo29527B = c9194g.mo29527B(m29771e());
            if (!zMo29527B) {
                break;
            }
        }
        int iNextInt = (!zMo29527B || this.f35599h.m29501r()) ? (C9199l.m29641q0().nextInt(96) + 20) - this.f35599h.m29472A() : 0;
        int i2 = iNextInt >= 0 ? iNextInt : 0;
        if (f35598g.mo32175d()) {
            f35598g.mo32180i(mo29772f() + "start() Responder chosen delay=" + i2);
        }
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, i2);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() throws IOException {
        m29771e().m29683v1(this.f35599h);
        HashSet<C9194g> hashSet = new HashSet();
        Set<AbstractC9195h> hashSet2 = new HashSet<>();
        if (m29771e().m29658R0()) {
            try {
                for (C9194g c9194g : this.f35599h.m29495l()) {
                    if (f35598g.mo32173b()) {
                        f35598g.mo32174c(mo29772f() + "run() JmDNS responding to: " + c9194g);
                    }
                    if (this.f35602k) {
                        hashSet.add(c9194g);
                    }
                    c9194g.mo29528y(m29771e(), hashSet2);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (AbstractC9195h abstractC9195h : this.f35599h.m29486c()) {
                    if (abstractC9195h.m29539J(jCurrentTimeMillis)) {
                        hashSet2.remove(abstractC9195h);
                        if (f35598g.mo32173b()) {
                            f35598g.mo32174c(mo29772f() + "JmDNS Responder Known Answer Removed");
                        }
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                if (f35598g.mo32173b()) {
                    f35598g.mo32174c(mo29772f() + "run() JmDNS responding");
                }
                C9193f c9193f = new C9193f(33792, !this.f35602k, this.f35599h.m29473B());
                if (this.f35602k) {
                    c9193f.m29512F(new InetSocketAddress(this.f35600i, this.f35601j));
                }
                c9193f.m29506w(this.f35599h.m29489f());
                for (C9194g c9194g2 : hashSet) {
                    if (c9194g2 != null) {
                        c9193f = m29770d(c9193f, c9194g2);
                    }
                }
                for (AbstractC9195h abstractC9195h2 : hashSet2) {
                    if (abstractC9195h2 != null) {
                        c9193f = m29767a(c9193f, this.f35599h, abstractC9195h2);
                    }
                }
                if (c9193f.m29497n()) {
                    return;
                }
                m29771e().m29686x1(c9193f);
            } catch (Throwable th) {
                f35598g.mo32177f(mo29772f() + "run() exception ", th);
                m29771e().close();
            }
        }
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    public String toString() {
        return super.toString() + " incomming: " + this.f35599h;
    }
}
