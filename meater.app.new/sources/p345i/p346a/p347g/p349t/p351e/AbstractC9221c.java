package p345i.p346a.p347g.p349t.p351e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.C9204q;
import p345i.p346a.p347g.InterfaceC9196i;
import p345i.p346a.p347g.p348s.EnumC9212g;
import p345i.p346a.p347g.p349t.AbstractC9213a;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSStateTask.java */
/* renamed from: i.a.g.t.e.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9221c extends AbstractC9213a {

    /* renamed from: g */
    static InterfaceC9732b f35609g = C9733c.m32189i(AbstractC9221c.class.getName());

    /* renamed from: h */
    private static int f35610h = 3600;

    /* renamed from: i */
    private final int f35611i;

    /* renamed from: j */
    private EnumC9212g f35612j;

    public AbstractC9221c(C9199l c9199l, int i2) {
        super(c9199l);
        this.f35612j = null;
        this.f35611i = i2;
    }

    /* renamed from: n */
    public static int m29788n() {
        return f35610h;
    }

    /* renamed from: g */
    protected void m29789g(List<InterfaceC9196i> list) {
        if (list != null) {
            for (InterfaceC9196i interfaceC9196i : list) {
                synchronized (interfaceC9196i) {
                    interfaceC9196i.mo29559d(this);
                }
            }
        }
    }

    /* renamed from: h */
    protected abstract void mo29779h();

    /* renamed from: i */
    protected void m29790i(EnumC9212g enumC9212g) {
        synchronized (m29771e()) {
            m29771e().m29651K(this, enumC9212g);
        }
        Iterator<AbstractC9185d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            ((C9204q) it.next()).m29723E(this, enumC9212g);
        }
    }

    /* renamed from: j */
    protected abstract C9193f mo29780j(C9193f c9193f) throws IOException;

    /* renamed from: k */
    protected abstract C9193f mo29781k(C9204q c9204q, C9193f c9193f) throws IOException;

    /* renamed from: l */
    protected abstract boolean mo29782l();

    /* renamed from: m */
    protected abstract C9193f mo29783m();

    /* renamed from: o */
    public int m29791o() {
        return this.f35611i;
    }

    /* renamed from: p */
    public abstract String mo29784p();

    /* renamed from: q */
    protected EnumC9212g m29792q() {
        return this.f35612j;
    }

    /* renamed from: r */
    protected abstract void mo29785r(Throwable th);

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        C9193f c9193fMo29783m = mo29783m();
        try {
        } catch (Throwable th) {
            f35609g.mo32177f(mo29772f() + ".run() exception ", th);
            mo29785r(th);
        }
        if (!mo29782l()) {
            cancel();
            return;
        }
        List<InterfaceC9196i> arrayList = new ArrayList<>();
        synchronized (m29771e()) {
            if (m29771e().m29659T0(this, m29792q())) {
                f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " " + m29771e().m29676p0());
                arrayList.add(m29771e());
                c9193fMo29783m = mo29780j(c9193fMo29783m);
            }
        }
        Iterator<AbstractC9185d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            C9204q c9204q = (C9204q) it.next();
            synchronized (c9204q) {
                if (c9204q.m29733S(this, m29792q())) {
                    f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " " + c9204q.mo29425o());
                    arrayList.add(c9204q);
                    c9193fMo29783m = mo29781k(c9204q, c9193fMo29783m);
                }
            }
        }
        if (c9193fMo29783m.m29497n()) {
            m29789g(arrayList);
            cancel();
            return;
        }
        f35609g.mo32174c(mo29772f() + ".run() JmDNS " + mo29784p() + " #" + m29792q());
        m29771e().m29686x1(c9193fMo29783m);
        m29789g(arrayList);
        mo29779h();
    }

    /* renamed from: s */
    protected void m29793s() {
        synchronized (m29771e()) {
            m29771e().m29677q1(this);
        }
        Iterator<AbstractC9185d> it = m29771e().m29687y0().values().iterator();
        while (it.hasNext()) {
            ((C9204q) it.next()).m29738Z(this);
        }
    }

    /* renamed from: t */
    protected void m29794t(EnumC9212g enumC9212g) {
        this.f35612j = enumC9212g;
    }
}
