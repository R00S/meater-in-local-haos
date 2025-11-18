package p345i.p346a.p347g.p349t;

import java.util.Timer;
import okhttp3.HttpUrl;
import p345i.p346a.p347g.C9199l;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: RecordReaper.java */
/* renamed from: i.a.g.t.b */
/* loaded from: classes2.dex */
public class C9214b extends AbstractC9213a {

    /* renamed from: g */
    static InterfaceC9732b f35597g = C9733c.m32189i(C9214b.class.getName());

    public C9214b(C9199l c9199l) {
        super(c9199l);
    }

    @Override // p345i.p346a.p347g.p349t.AbstractC9213a
    /* renamed from: f */
    public String mo29772f() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordReaper(");
        sb.append(m29771e() != null ? m29771e().m29676p0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: g */
    public void m29773g(Timer timer) {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        timer.schedule(this, 10000L, 10000L);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (m29771e().m29662X0() || m29771e().m29660V0()) {
            return;
        }
        if (f35597g.mo32175d()) {
            f35597g.mo32180i(mo29772f() + ".run() JmDNS reaping cache");
        }
        m29771e().m29656Q();
    }
}
