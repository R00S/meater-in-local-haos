package p241e.p307h.p308a.p311g0;

import android.os.SystemClock;
import java.io.IOException;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p310f0.InterfaceC9005a;
import p241e.p307h.p308a.p314j0.InterfaceC9028a;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: FetchDataTask.java */
/* renamed from: e.h.a.g0.g */
/* loaded from: classes2.dex */
public class C9017g {

    /* renamed from: a */
    private final InterfaceC9018h f34758a;

    /* renamed from: b */
    private final int f34759b;

    /* renamed from: c */
    private final int f34760c;

    /* renamed from: d */
    private final RunnableC9015e f34761d;

    /* renamed from: e */
    private final InterfaceC9001b f34762e;

    /* renamed from: f */
    private final boolean f34763f;

    /* renamed from: g */
    private final long f34764g;

    /* renamed from: h */
    private final long f34765h;

    /* renamed from: i */
    private final long f34766i;

    /* renamed from: j */
    private final String f34767j;

    /* renamed from: k */
    long f34768k;

    /* renamed from: l */
    private InterfaceC9028a f34769l;

    /* renamed from: m */
    private volatile boolean f34770m;

    /* renamed from: n */
    private final InterfaceC9005a f34771n;

    /* renamed from: o */
    private volatile long f34772o;

    /* renamed from: p */
    private volatile long f34773p;

    /* compiled from: FetchDataTask.java */
    /* renamed from: e.h.a.g0.g$b */
    public static class b {

        /* renamed from: a */
        RunnableC9015e f34774a;

        /* renamed from: b */
        InterfaceC9001b f34775b;

        /* renamed from: c */
        C9012b f34776c;

        /* renamed from: d */
        InterfaceC9018h f34777d;

        /* renamed from: e */
        String f34778e;

        /* renamed from: f */
        Boolean f34779f;

        /* renamed from: g */
        Integer f34780g;

        /* renamed from: h */
        Integer f34781h;

        /* renamed from: a */
        public C9017g m28881a() throws IllegalArgumentException {
            InterfaceC9001b interfaceC9001b;
            C9012b c9012b;
            Integer num;
            if (this.f34779f == null || (interfaceC9001b = this.f34775b) == null || (c9012b = this.f34776c) == null || this.f34777d == null || this.f34778e == null || (num = this.f34781h) == null || this.f34780g == null) {
                throw new IllegalArgumentException();
            }
            return new C9017g(interfaceC9001b, c9012b, this.f34774a, num.intValue(), this.f34780g.intValue(), this.f34779f.booleanValue(), this.f34777d, this.f34778e);
        }

        /* renamed from: b */
        public b m28882b(InterfaceC9018h interfaceC9018h) {
            this.f34777d = interfaceC9018h;
            return this;
        }

        /* renamed from: c */
        public b m28883c(InterfaceC9001b interfaceC9001b) {
            this.f34775b = interfaceC9001b;
            return this;
        }

        /* renamed from: d */
        public b m28884d(int i2) {
            this.f34780g = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: e */
        public b m28885e(C9012b c9012b) {
            this.f34776c = c9012b;
            return this;
        }

        /* renamed from: f */
        public b m28886f(int i2) {
            this.f34781h = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: g */
        public b m28887g(RunnableC9015e runnableC9015e) {
            this.f34774a = runnableC9015e;
            return this;
        }

        /* renamed from: h */
        public b m28888h(String str) {
            this.f34778e = str;
            return this;
        }

        /* renamed from: i */
        public b m28889i(boolean z) {
            this.f34779f = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: a */
    private void m28877a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C9036f.m28985L(this.f34768k - this.f34772o, jElapsedRealtime - this.f34773p)) {
            m28878d();
            this.f34772o = this.f34768k;
            this.f34773p = jElapsedRealtime;
        }
    }

    /* renamed from: d */
    private void m28878d() {
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f34769l.mo28926b();
            z = true;
        } catch (IOException e2) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e2);
            }
            z = false;
        }
        if (z) {
            int i2 = this.f34760c;
            if (i2 >= 0) {
                this.f34771n.mo28731f(this.f34759b, i2, this.f34768k);
            } else {
                this.f34758a.mo28818f();
            }
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f34759b), Integer.valueOf(this.f34760c), Long.valueOf(this.f34768k), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    /* renamed from: b */
    public void m28879b() {
        this.f34770m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ea, code lost:
    
        throw new com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m28880c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p241e.p307h.p308a.p311g0.C9017g.m28880c():void");
    }

    private C9017g(InterfaceC9001b interfaceC9001b, C9012b c9012b, RunnableC9015e runnableC9015e, int i2, int i3, boolean z, InterfaceC9018h interfaceC9018h, String str) {
        this.f34772o = 0L;
        this.f34773p = 0L;
        this.f34758a = interfaceC9018h;
        this.f34767j = str;
        this.f34762e = interfaceC9001b;
        this.f34763f = z;
        this.f34761d = runnableC9015e;
        this.f34760c = i3;
        this.f34759b = i2;
        this.f34771n = C9013c.m28789j().m28795f();
        this.f34764g = c9012b.f34674a;
        this.f34765h = c9012b.f34676c;
        this.f34768k = c9012b.f34675b;
        this.f34766i = c9012b.f34677d;
    }
}
