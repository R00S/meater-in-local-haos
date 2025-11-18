package p345i.p346a.p347g.p349t.p351e;

import java.io.IOException;
import java.util.Iterator;
import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9194g;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.C9204q;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;
import p345i.p346a.p347g.p348s.EnumC9212g;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: Prober.java */
/* renamed from: i.a.g.t.e.d */
/* loaded from: classes2.dex */
public class C9222d extends AbstractC9221c {

    /* renamed from: k */
    static InterfaceC9732b f35613k = C9733c.m32189i(C9222d.class.getName());

    public C9222d(C9199l c9199l) {
        super(c9199l, AbstractC9221c.m29788n());
        EnumC9212g enumC9212g = EnumC9212g.f35572f;
        m29794t(enumC9212g);
        m29790i(enumC9212g);
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        m29793s();
        return super.cancel();
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: h */
    protected void mo29779h() {
        m29794t(m29792q().m29760g());
        if (m29792q().m29758A()) {
            return;
        }
        cancel();
        m29771e().mo29591l();
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: j */
    protected C9193f mo29780j(C9193f c9193f) throws IOException {
        c9193f.m29507A(C9194g.m29525C(m29771e().m29674n0().m29624q(), EnumC9210e.TYPE_ANY, EnumC9209d.CLASS_IN, false));
        Iterator<AbstractC9195h> it = m29771e().m29674n0().m29613a(EnumC9209d.CLASS_ANY, false, m29791o()).iterator();
        while (it.hasNext()) {
            c9193f = m29769c(c9193f, it.next());
        }
        return c9193f;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: k */
    protected C9193f mo29781k(C9204q c9204q, C9193f c9193f) throws IOException {
        String strMo29425o = c9204q.mo29425o();
        EnumC9210e enumC9210e = EnumC9210e.TYPE_ANY;
        EnumC9209d enumC9209d = EnumC9209d.CLASS_IN;
        return m29769c(m29770d(c9193f, C9194g.m29525C(strMo29425o, enumC9210e, enumC9209d, false)), new AbstractC9195h.f(c9204q.mo29425o(), enumC9209d, false, m29791o(), c9204q.mo29423m(), c9204q.mo29430t(), c9204q.mo29422l(), m29771e().m29674n0().m29624q()));
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: l */
    protected boolean mo29782l() {
        return (m29771e().m29662X0() || m29771e().m29660V0()) ? false : true;
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: m */
    protected C9193f mo29783m() {
        return new C9193f(0);
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: p */
    public String mo29784p() {
        return "probing";
    }

    @Override // p345i.p346a.p347g.p349t.p351e.AbstractC9221c
    /* renamed from: r */
    protected void mo29785r(Throwable th) {
        m29771e().m29669h1();
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    public String toString() {
        return super.toString() + " state: " + m29792q();
    }

    /* renamed from: u */
    public void m29795u(Timer timer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - m29771e().m29673m0() < 5000) {
            m29771e().m29689z1(m29771e().m29647F0() + 1);
        } else {
            m29771e().m29689z1(1);
        }
        m29771e().m29688y1(jCurrentTimeMillis);
        if (m29771e().m29658R0() && m29771e().m29647F0() < 10) {
            timer.schedule(this, C9199l.m29641q0().nextInt(251), 250L);
        } else {
            if (m29771e().m29662X0() || m29771e().m29660V0()) {
                return;
            }
            timer.schedule(this, 1000L, 1000L);
        }
    }
}
