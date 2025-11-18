package p241e.p307h.p308a;

import android.content.Context;
import com.liulishuo.filedownloader.services.C8703c;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC8991a;
import p241e.p307h.p308a.p311g0.C9013c;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: FileDownloader.java */
/* renamed from: e.h.a.q */
/* loaded from: classes2.dex */
public class C9042q {

    /* renamed from: a */
    private static final Object f34848a = new Object();

    /* renamed from: b */
    private static final Object f34849b = new Object();

    /* renamed from: c */
    private InterfaceC9048w f34850c;

    /* renamed from: d */
    private InterfaceC9047v f34851d;

    /* compiled from: FileDownloader.java */
    /* renamed from: e.h.a.q$a */
    private static final class a {

        /* renamed from: a */
        private static final C9042q f34852a = new C9042q();
    }

    /* renamed from: e */
    public static C9042q m29052e() {
        return a.f34852a;
    }

    /* renamed from: h */
    public static void m29053h(Context context, C8703c.a aVar) {
        if (C9034d.f34819a) {
            C9034d.m28962a(C9042q.class, "init Downloader with params: %s %s", context, aVar);
        }
        if (context == null) {
            throw new IllegalArgumentException("the provided context must not be null!");
        }
        C9033c.m28957b(context.getApplicationContext());
        C9013c.m28789j().m28800o(aVar);
    }

    /* renamed from: a */
    public void m29054a(AbstractC8999e abstractC8999e) {
        C9004f.m28724e().m28905a("event.service.connect.changed", abstractC8999e);
    }

    /* renamed from: b */
    public void m29055b() {
        if (m29060i()) {
            return;
        }
        C9038m.m29029b().mo27610u0(C9033c.m28956a());
    }

    /* renamed from: c */
    public boolean m29056c(int i2, String str) {
        m29061j(i2);
        if (!C9038m.m29029b().mo29033o0(i2)) {
            return false;
        }
        File file = new File(C9036f.m28976C(str));
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    /* renamed from: d */
    public InterfaceC8991a m29057d(String str) {
        return new C8995c(str);
    }

    /* renamed from: f */
    InterfaceC9047v m29058f() {
        if (this.f34851d == null) {
            synchronized (f34849b) {
                if (this.f34851d == null) {
                    C9051z c9051z = new C9051z();
                    this.f34851d = c9051z;
                    m29054a(c9051z);
                }
            }
        }
        return this.f34851d;
    }

    /* renamed from: g */
    InterfaceC9048w m29059g() {
        if (this.f34850c == null) {
            synchronized (f34848a) {
                if (this.f34850c == null) {
                    this.f34850c = new C8996c0();
                }
            }
        }
        return this.f34850c;
    }

    /* renamed from: i */
    public boolean m29060i() {
        return C9038m.m29029b().isConnected();
    }

    /* renamed from: j */
    public int m29061j(int i2) {
        List<InterfaceC8991a.b> listM28898h = C9019h.m28890i().m28898h(i2);
        if (listM28898h == null || listM28898h.isEmpty()) {
            C9034d.m28970i(this, "request pause but not exist %d", Integer.valueOf(i2));
            return 0;
        }
        Iterator<InterfaceC8991a.b> it = listM28898h.iterator();
        while (it.hasNext()) {
            it.next().mo28649v().pause();
        }
        return listM28898h.size();
    }

    /* renamed from: k */
    public void m29062k(AbstractC9024i abstractC9024i) {
        C9041p.m29041c().m29042a(abstractC9024i);
        Iterator<InterfaceC8991a.b> it = C9019h.m28890i().m28894d(abstractC9024i).iterator();
        while (it.hasNext()) {
            it.next().mo28649v().pause();
        }
    }

    /* renamed from: l */
    public int m29063l(int i2, AbstractC9024i abstractC9024i) {
        InterfaceC8991a.b bVarM28897g = C9019h.m28890i().m28897g(i2);
        if (bVarM28897g == null) {
            return 0;
        }
        bVarM28897g.mo28649v().mo28619W(abstractC9024i);
        return bVarM28897g.mo28649v().getId();
    }

    /* renamed from: m */
    public boolean m29064m(AbstractC9024i abstractC9024i, boolean z) {
        if (abstractC9024i != null) {
            return z ? m29059g().mo28687e(abstractC9024i) : m29059g().mo28685c(abstractC9024i);
        }
        C9034d.m28970i(this, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z));
        return false;
    }

    /* renamed from: n */
    public void m29065n(boolean z) {
        C9038m.m29029b().mo29034t0(z);
    }
}
