package p241e.p307h.p308a.p311g0;

import android.os.Process;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.C8699a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.IOException;
import java.net.SocketException;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p311g0.C9011a;
import p241e.p307h.p308a.p311g0.C9017g;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: DownloadRunnable.java */
/* renamed from: e.h.a.g0.e */
/* loaded from: classes2.dex */
public class RunnableC9015e implements Runnable {

    /* renamed from: f */
    private final C9011a f34726f;

    /* renamed from: g */
    private final InterfaceC9018h f34727g;

    /* renamed from: h */
    private final String f34728h;

    /* renamed from: i */
    private final boolean f34729i;

    /* renamed from: j */
    private C9017g f34730j;

    /* renamed from: k */
    private volatile boolean f34731k;

    /* renamed from: l */
    private final int f34732l;

    /* renamed from: m */
    final int f34733m;

    /* compiled from: DownloadRunnable.java */
    /* renamed from: e.h.a.g0.e$b */
    public static class b {

        /* renamed from: a */
        private final C9011a.b f34734a = new C9011a.b();

        /* renamed from: b */
        private InterfaceC9018h f34735b;

        /* renamed from: c */
        private String f34736c;

        /* renamed from: d */
        private Boolean f34737d;

        /* renamed from: e */
        private Integer f34738e;

        /* renamed from: a */
        public RunnableC9015e m28837a() {
            if (this.f34735b == null || this.f34736c == null || this.f34737d == null || this.f34738e == null) {
                throw new IllegalArgumentException(C9036f.m29009o("%s %s %B", this.f34735b, this.f34736c, this.f34737d));
            }
            C9011a c9011aM28774a = this.f34734a.m28774a();
            return new RunnableC9015e(c9011aM28774a.f34662a, this.f34738e.intValue(), c9011aM28774a, this.f34735b, this.f34737d.booleanValue(), this.f34736c);
        }

        /* renamed from: b */
        public b m28838b(InterfaceC9018h interfaceC9018h) {
            this.f34735b = interfaceC9018h;
            return this;
        }

        /* renamed from: c */
        public b m28839c(Integer num) {
            this.f34738e = num;
            return this;
        }

        /* renamed from: d */
        public b m28840d(C9012b c9012b) {
            this.f34734a.m28775b(c9012b);
            return this;
        }

        /* renamed from: e */
        public b m28841e(String str) {
            this.f34734a.m28777d(str);
            return this;
        }

        /* renamed from: f */
        public b m28842f(FileDownloadHeader fileDownloadHeader) {
            this.f34734a.m28778e(fileDownloadHeader);
            return this;
        }

        /* renamed from: g */
        public b m28843g(int i2) {
            this.f34734a.m28776c(i2);
            return this;
        }

        /* renamed from: h */
        public b m28844h(String str) {
            this.f34736c = str;
            return this;
        }

        /* renamed from: i */
        public b m28845i(String str) {
            this.f34734a.m28779f(str);
            return this;
        }

        /* renamed from: j */
        public b m28846j(boolean z) {
            this.f34737d = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: b */
    private long m28834b() {
        InterfaceC9005a interfaceC9005aM28795f = C9013c.m28789j().m28795f();
        if (this.f34733m < 0) {
            FileDownloadModel fileDownloadModelMo28740o = interfaceC9005aM28795f.mo28740o(this.f34732l);
            if (fileDownloadModelMo28740o != null) {
                return fileDownloadModelMo28740o.m27563g();
            }
            return 0L;
        }
        for (C8699a c8699a : interfaceC9005aM28795f.mo28739n(this.f34732l)) {
            if (c8699a.m27589d() == this.f34733m) {
                return c8699a.m27586a();
            }
        }
        return 0L;
    }

    /* renamed from: a */
    public void m28835a() {
        m28836c();
    }

    /* renamed from: c */
    public void m28836c() {
        this.f34731k = true;
        C9017g c9017g = this.f34730j;
        if (c9017g != null) {
            c9017g.m28879b();
        }
    }

    @Override // java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        boolean z;
        Exception e2;
        C9017g.b bVar;
        Process.setThreadPriority(10);
        long j2 = this.f34726f.m28770f().f34675b;
        InterfaceC9001b interfaceC9001bM28768c = null;
        boolean z2 = false;
        while (!this.f34731k) {
            try {
                try {
                    interfaceC9001bM28768c = this.f34726f.m28768c();
                    int iMo27913d = interfaceC9001bM28768c.mo27913d();
                    if (C9034d.f34819a) {
                        C9034d.m28962a(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.f34733m), Integer.valueOf(this.f34732l), this.f34726f.m28770f(), Integer.valueOf(iMo27913d));
                    }
                    if (iMo27913d != 206 && iMo27913d != 200) {
                        throw new SocketException(C9036f.m29009o("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.f34726f.m28771g(), interfaceC9001bM28768c.mo27911b(), Integer.valueOf(iMo27913d), Integer.valueOf(this.f34732l), Integer.valueOf(this.f34733m)));
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e3) {
                    e2 = e3;
                    z = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e4) {
                z = z2;
                e2 = e4;
            }
            try {
                bVar = new C9017g.b();
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e5) {
                e2 = e5;
                z = true;
                try {
                    if (!this.f34727g.mo28817e(e2)) {
                        this.f34727g.mo28814b(e2);
                        if (interfaceC9001bM28768c == null) {
                            return;
                        }
                    } else if (z && this.f34730j == null) {
                        C9034d.m28970i(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e2);
                        this.f34727g.mo28814b(e2);
                        if (interfaceC9001bM28768c == null) {
                            return;
                        }
                    } else {
                        if (this.f34730j != null) {
                            long jM28834b = m28834b();
                            if (jM28834b > 0) {
                                this.f34726f.m28773i(jM28834b);
                            }
                        }
                        this.f34727g.mo28815c(e2);
                        if (interfaceC9001bM28768c != null) {
                            interfaceC9001bM28768c.mo27916g();
                        }
                        z2 = z;
                    }
                    return;
                } finally {
                    if (interfaceC9001bM28768c != null) {
                        interfaceC9001bM28768c.mo27916g();
                    }
                }
            }
            if (this.f34731k) {
                interfaceC9001bM28768c.mo27916g();
                return;
            }
            C9017g c9017gM28881a = bVar.m28886f(this.f34732l).m28884d(this.f34733m).m28882b(this.f34727g).m28887g(this).m28889i(this.f34729i).m28883c(interfaceC9001bM28768c).m28885e(this.f34726f.m28770f()).m28888h(this.f34728h).m28881a();
            this.f34730j = c9017gM28881a;
            c9017gM28881a.m28880c();
            if (this.f34731k) {
                this.f34730j.m28879b();
            }
            return;
        }
        if (interfaceC9001bM28768c != null) {
            interfaceC9001bM28768c.mo27916g();
        }
    }

    private RunnableC9015e(int i2, int i3, C9011a c9011a, InterfaceC9018h interfaceC9018h, boolean z, String str) {
        this.f34732l = i2;
        this.f34733m = i3;
        this.f34731k = false;
        this.f34727g = interfaceC9018h;
        this.f34728h = str;
        this.f34726f = c9011a;
        this.f34729i = z;
    }
}
