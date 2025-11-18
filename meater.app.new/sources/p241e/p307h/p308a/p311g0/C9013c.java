package p241e.p307h.p308a.p311g0;

import com.liulishuo.filedownloader.services.C8703c;
import com.liulishuo.filedownloader.services.C8709i;
import java.io.File;
import java.io.IOException;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p314j0.InterfaceC9028a;
import p241e.p307h.p308a.p315k0.C9033c;

/* compiled from: CustomComponentHolder.java */
/* renamed from: e.h.a.g0.c */
/* loaded from: classes2.dex */
public class C9013c {

    /* renamed from: a */
    private C8703c f34680a;

    /* renamed from: b */
    private C9033c.a f34681b;

    /* renamed from: c */
    private C9033c.b f34682c;

    /* renamed from: d */
    private C9033c.e f34683d;

    /* renamed from: e */
    private InterfaceC9005a f34684e;

    /* renamed from: f */
    private C9033c.d f34685f;

    /* renamed from: g */
    private C8709i f34686g;

    /* compiled from: CustomComponentHolder.java */
    /* renamed from: e.h.a.g0.c$a */
    private static final class a {

        /* renamed from: a */
        private static final C9013c f34687a = new C9013c();
    }

    /* renamed from: d */
    private C9033c.a m28786d() {
        C9033c.a aVar = this.f34681b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.f34681b == null) {
                this.f34681b = m28788g().m27621a();
            }
        }
        return this.f34681b;
    }

    /* renamed from: e */
    private C9033c.b m28787e() {
        C9033c.b bVar = this.f34682c;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.f34682c == null) {
                this.f34682c = m28788g().m27622b();
            }
        }
        return this.f34682c;
    }

    /* renamed from: g */
    private C8703c m28788g() {
        C8703c c8703c = this.f34680a;
        if (c8703c != null) {
            return c8703c;
        }
        synchronized (this) {
            if (this.f34680a == null) {
                this.f34680a = new C8703c();
            }
        }
        return this.f34680a;
    }

    /* renamed from: j */
    public static C9013c m28789j() {
        return a.f34687a;
    }

    /* renamed from: l */
    private C9033c.e m28790l() {
        C9033c.e eVar = this.f34683d;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.f34683d == null) {
                this.f34683d = m28788g().m27626l();
            }
        }
        return this.f34683d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:9:0x0034, B:11:0x003b, B:13:0x0042, B:15:0x0049, B:18:0x0056, B:21:0x0065, B:23:0x0070, B:17:0x0053), top: B:83:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m28791n(p241e.p307h.p308a.p310f0.InterfaceC9005a.a r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.C9013c.m28791n(e.h.a.f0.a$a):void");
    }

    /* renamed from: a */
    public InterfaceC9001b m28792a(String str) throws IOException {
        return m28787e().mo27919a(str);
    }

    /* renamed from: b */
    public InterfaceC9028a m28793b(File file) throws IOException {
        return m28790l().mo28928a(file);
    }

    /* renamed from: c */
    public int m28794c(int i2, String str, String str2, long j2) {
        return m28786d().mo28717a(i2, str, str2, j2);
    }

    /* renamed from: f */
    public InterfaceC9005a m28795f() {
        InterfaceC9005a interfaceC9005a = this.f34684e;
        if (interfaceC9005a != null) {
            return interfaceC9005a;
        }
        synchronized (this) {
            if (this.f34684e == null) {
                InterfaceC9005a interfaceC9005aM27623c = m28788g().m27623c();
                this.f34684e = interfaceC9005aM27623c;
                m28791n(interfaceC9005aM27623c.mo28727b());
            }
        }
        return this.f34684e;
    }

    /* renamed from: h */
    public C8709i m28796h() {
        C8709i c8709i = this.f34686g;
        if (c8709i != null) {
            return c8709i;
        }
        synchronized (this) {
            if (this.f34686g == null) {
                this.f34686g = m28788g().m27624j();
            }
        }
        return this.f34686g;
    }

    /* renamed from: i */
    public C9033c.d m28797i() {
        C9033c.d dVar = this.f34685f;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.f34685f == null) {
                this.f34685f = m28788g().m27625k();
            }
        }
        return this.f34685f;
    }

    /* renamed from: k */
    public int m28798k() {
        return m28788g().m27627n();
    }

    /* renamed from: m */
    public boolean m28799m() {
        return m28790l().mo28929b();
    }

    /* renamed from: o */
    public void m28800o(C8703c.a aVar) {
        synchronized (this) {
            this.f34680a = new C8703c(aVar);
            this.f34682c = null;
            this.f34683d = null;
            this.f34684e = null;
            this.f34685f = null;
        }
    }
}
