package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import java.util.Timer;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.p349t.AbstractC9213a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSResolverTask.java */
/* renamed from: i.a.g.t.d.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9216a extends AbstractC9213a {

    /* renamed from: g */
    private static InterfaceC9732b f35603g = C9733c.m32189i(AbstractC9216a.class.getName());

    /* renamed from: h */
    protected int f35604h;

    public AbstractC9216a(C9199l c9199l) {
        super(c9199l);
        this.f35604h = 0;
    }

    /* renamed from: g */
    protected abstract C9193f mo29775g(C9193f c9193f) throws IOException;

    /* renamed from: h */
    protected abstract C9193f mo29776h(C9193f c9193f) throws IOException;

    /* renamed from: i */
    protected abstract String mo29777i();

    /* renamed from: j */
    public void m29778j(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, 225L, 225L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            if (!m29771e().m29662X0() && !m29771e().m29660V0()) {
                int i2 = this.f35604h;
                this.f35604h = i2 + 1;
                if (i2 >= 3) {
                    cancel();
                    return;
                }
                if (f35603g.mo32173b()) {
                    f35603g.mo32174c(mo29772f() + ".run() JmDNS " + mo29777i());
                }
                C9193f c9193fMo29776h = mo29776h(new C9193f(0));
                if (m29771e().m29658R0()) {
                    c9193fMo29776h = mo29775g(c9193fMo29776h);
                }
                if (c9193fMo29776h.m29497n()) {
                    return;
                }
                m29771e().m29686x1(c9193fMo29776h);
                return;
            }
            cancel();
        } catch (Throwable th) {
            f35603g.mo32177f(mo29772f() + ".run() exception ", th);
            m29771e().m29669h1();
        }
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    public String toString() {
        return super.toString() + " count: " + this.f35604h;
    }
}
