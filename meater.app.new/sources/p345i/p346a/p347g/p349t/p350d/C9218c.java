package p345i.p346a.p347g.p349t.p350d;

import java.io.IOException;
import okhttp3.HttpUrl;
import p345i.p346a.AbstractC9185d;
import p345i.p346a.p347g.AbstractC9195h;
import p345i.p346a.p347g.C9193f;
import p345i.p346a.p347g.C9194g;
import p345i.p346a.p347g.C9199l;
import p345i.p346a.p347g.p348s.EnumC9209d;
import p345i.p346a.p347g.p348s.EnumC9210e;

/* compiled from: ServiceResolver.java */
/* renamed from: i.a.g.t.d.c */
/* loaded from: classes2.dex */
public class C9218c extends AbstractC9216a {

    /* renamed from: i */
    private final String f35606i;

    public C9218c(C9199l c9199l, String str) {
        super(c9199l);
        this.f35606i = str;
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: g */
    protected C9193f mo29775g(C9193f c9193f) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AbstractC9185d abstractC9185d : m29771e().m29687y0().values()) {
            c9193f = m29768b(c9193f, new AbstractC9195h.e(abstractC9185d.mo29429s(), EnumC9209d.CLASS_IN, false, 3600, abstractC9185d.mo29425o()), jCurrentTimeMillis);
        }
        return c9193f;
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: h */
    protected C9193f mo29776h(C9193f c9193f) throws IOException {
        return m29770d(c9193f, C9194g.m29525C(this.f35606i, EnumC9210e.TYPE_PTR, EnumC9209d.CLASS_IN, false));
    }

    @Override // p345i.p346a.p347g.p349t.p350d.AbstractC9216a
    /* renamed from: i */
    protected String mo29777i() {
        return "querying service";
    }
}
