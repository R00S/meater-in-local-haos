package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.services.C8709i;
import p241e.p307h.p308a.p309e0.C9000a;
import p241e.p307h.p308a.p309e0.C9002c;
import p241e.p307h.p308a.p310f0.C9007c;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p314j0.C9029b;
import p241e.p307h.p308a.p315k0.C9033c;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadMgrInitialParams.java */
/* renamed from: com.liulishuo.filedownloader.services.c */
/* loaded from: classes2.dex */
public class C8703c {

    /* renamed from: a */
    private final a f33041a;

    /* compiled from: DownloadMgrInitialParams.java */
    /* renamed from: com.liulishuo.filedownloader.services.c$a */
    public static class a {

        /* renamed from: a */
        C9033c.c f33042a;

        /* renamed from: b */
        Integer f33043b;

        /* renamed from: c */
        C9033c.e f33044c;

        /* renamed from: d */
        C9033c.b f33045d;

        /* renamed from: e */
        C9033c.a f33046e;

        /* renamed from: f */
        C9033c.d f33047f;

        /* renamed from: g */
        C8709i f33048g;

        /* renamed from: a */
        public a m27628a(C9033c.b bVar) {
            this.f33045d = bVar;
            return this;
        }

        public String toString() {
            return C9036f.m29009o("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.f33042a, this.f33043b, this.f33044c, this.f33045d, this.f33046e);
        }
    }

    public C8703c() {
        this.f33041a = null;
    }

    /* renamed from: d */
    private C9033c.a m27614d() {
        return new C9000a();
    }

    /* renamed from: e */
    private C9033c.b m27615e() {
        return new C9002c.b();
    }

    /* renamed from: f */
    private InterfaceC9005a m27616f() {
        return new C9007c();
    }

    /* renamed from: g */
    private C8709i m27617g() {
        return new C8709i.b().m27683b(true).m27682a();
    }

    /* renamed from: h */
    private C9033c.d m27618h() {
        return new C8702b();
    }

    /* renamed from: i */
    private C9033c.e m27619i() {
        return new C9029b.a();
    }

    /* renamed from: m */
    private int m27620m() {
        return C9035e.m28971a().f34824e;
    }

    /* renamed from: a */
    public C9033c.a m27621a() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27614d();
        }
        C9033c.a aVar2 = aVar.f33046e;
        if (aVar2 == null) {
            return m27614d();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize connection count adapter: %s", aVar2);
        }
        return aVar2;
    }

    /* renamed from: b */
    public C9033c.b m27622b() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27615e();
        }
        C9033c.b bVar = aVar.f33045d;
        if (bVar == null) {
            return m27615e();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize connection creator: %s", bVar);
        }
        return bVar;
    }

    /* renamed from: c */
    public InterfaceC9005a m27623c() {
        C9033c.c cVar;
        a aVar = this.f33041a;
        if (aVar == null || (cVar = aVar.f33042a) == null) {
            return m27616f();
        }
        InterfaceC9005a interfaceC9005aM28961a = cVar.m28961a();
        if (interfaceC9005aM28961a == null) {
            return m27616f();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize database: %s", interfaceC9005aM28961a);
        }
        return interfaceC9005aM28961a;
    }

    /* renamed from: j */
    public C8709i m27624j() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27617g();
        }
        C8709i c8709i = aVar.f33048g;
        if (c8709i == null) {
            return m27617g();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize foreground service config: %s", c8709i);
        }
        return c8709i;
    }

    /* renamed from: k */
    public C9033c.d m27625k() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27618h();
        }
        C9033c.d dVar = aVar.f33047f;
        if (dVar == null) {
            return m27618h();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize id generator: %s", dVar);
        }
        return dVar;
    }

    /* renamed from: l */
    public C9033c.e m27626l() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27619i();
        }
        C9033c.e eVar = aVar.f33044c;
        if (eVar == null) {
            return m27619i();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize output stream: %s", eVar);
        }
        return eVar;
    }

    /* renamed from: n */
    public int m27627n() {
        a aVar = this.f33041a;
        if (aVar == null) {
            return m27620m();
        }
        Integer num = aVar.f33043b;
        if (num == null) {
            return m27620m();
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
        }
        return C9035e.m28972b(num.intValue());
    }

    public C8703c(a aVar) {
        this.f33041a = aVar;
    }
}
