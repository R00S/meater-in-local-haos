package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.AbstractC9189b;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9188a;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9194g;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.C9204q;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;

/* compiled from: ServiceInfoResolver.java */
/* renamed from: i.a.g.t.d.b */
/* loaded from: classes2.dex */
public class C9217b extends AbstractC9216a {

    /* renamed from: i */
    private final C9204q f35605i;

    public C9217b(C9199l c9199l, C9204q c9204q) {
        super(c9199l);
        this.f35605i = c9204q;
        c9204q.m29740c0(m29771e());
        m29771e().m29649I(c9204q, C9194g.m29525C(c9204q.mo29425o(), EnumC9210e.TYPE_ANY, EnumC9209d.CLASS_IN, false));
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        boolean zCancel = super.cancel();
        if (!this.f35605i.mo29433w()) {
            m29771e().m29678r1(this.f35605i);
        }
        return zCancel;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: g */
    protected C9193f mo29775g(C9193f c9193f) throws IOException {
        if (!this.f35605i.mo29431u()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C9188a c9188aM29663Z = m29771e().m29663Z();
            String strMo29425o = this.f35605i.mo29425o();
            EnumC9210e enumC9210e = EnumC9210e.TYPE_SRV;
            EnumC9209d enumC9209d = EnumC9209d.CLASS_IN;
            c9193f = m29768b(m29768b(c9193f, (AbstractC9195h) c9188aM29663Z.m29439d(strMo29425o, enumC9210e, enumC9209d), jCurrentTimeMillis), (AbstractC9195h) m29771e().m29663Z().m29439d(this.f35605i.mo29425o(), EnumC9210e.TYPE_TXT, enumC9209d), jCurrentTimeMillis);
            if (this.f35605i.mo29426p().length() > 0) {
                Iterator<? extends AbstractC9189b> it = m29771e().m29663Z().m29442h(this.f35605i.mo29426p(), EnumC9210e.TYPE_A, enumC9209d).iterator();
                while (it.hasNext()) {
                    c9193f = m29768b(c9193f, (AbstractC9195h) it.next(), jCurrentTimeMillis);
                }
                Iterator<? extends AbstractC9189b> it2 = m29771e().m29663Z().m29442h(this.f35605i.mo29426p(), EnumC9210e.TYPE_AAAA, EnumC9209d.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c9193f = m29768b(c9193f, (AbstractC9195h) it2.next(), jCurrentTimeMillis);
                }
            }
        }
        return c9193f;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: h */
    protected C9193f mo29776h(C9193f c9193f) throws IOException {
        if (this.f35605i.mo29431u()) {
            return c9193f;
        }
        String strMo29425o = this.f35605i.mo29425o();
        EnumC9210e enumC9210e = EnumC9210e.TYPE_SRV;
        EnumC9209d enumC9209d = EnumC9209d.CLASS_IN;
        C9193f c9193fM29770d = m29770d(m29770d(c9193f, C9194g.m29525C(strMo29425o, enumC9210e, enumC9209d, false)), C9194g.m29525C(this.f35605i.mo29425o(), EnumC9210e.TYPE_TXT, enumC9209d, false));
        return this.f35605i.mo29426p().length() > 0 ? m29770d(m29770d(c9193fM29770d, C9194g.m29525C(this.f35605i.mo29426p(), EnumC9210e.TYPE_A, enumC9209d, false)), C9194g.m29525C(this.f35605i.mo29426p(), EnumC9210e.TYPE_AAAA, enumC9209d, false)) : c9193fM29770d;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: i */
    protected String mo29777i() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        C9204q c9204q = this.f35605i;
        sb.append(c9204q != null ? c9204q.mo29425o() : "null");
        return sb.toString();
    }
}
