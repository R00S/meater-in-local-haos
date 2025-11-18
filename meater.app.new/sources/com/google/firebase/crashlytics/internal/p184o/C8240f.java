package com.google.firebase.crashlytics.internal.p184o;

import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.io.File;

/* compiled from: LogFileManager.java */
/* renamed from: com.google.firebase.crashlytics.h.o.f */
/* loaded from: classes2.dex */
public class C8240f {

    /* renamed from: a */
    private static final b f31079a = new b();

    /* renamed from: b */
    private final C8298f f31080b;

    /* renamed from: c */
    private InterfaceC8238d f31081c;

    /* compiled from: LogFileManager.java */
    /* renamed from: com.google.firebase.crashlytics.h.o.f$b */
    private static final class b implements InterfaceC8238d {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
        /* renamed from: a */
        public void mo25463a() {
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
        /* renamed from: b */
        public String mo25464b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
        /* renamed from: c */
        public byte[] mo25465c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
        /* renamed from: d */
        public void mo25466d() {
        }

        @Override // com.google.firebase.crashlytics.internal.p184o.InterfaceC8238d
        /* renamed from: e */
        public void mo25467e(long j2, String str) {
        }
    }

    public C8240f(C8298f c8298f) {
        this.f31080b = c8298f;
        this.f31081c = f31079a;
    }

    /* renamed from: d */
    private File m25473d(String str) {
        return this.f31080b.m26007o(str, "userlog");
    }

    /* renamed from: a */
    public void m25474a() {
        this.f31081c.mo25466d();
    }

    /* renamed from: b */
    public byte[] m25475b() {
        return this.f31081c.mo25465c();
    }

    /* renamed from: c */
    public String m25476c() {
        return this.f31081c.mo25464b();
    }

    /* renamed from: e */
    public final void m25477e(String str) {
        this.f31081c.mo25463a();
        this.f31081c = f31079a;
        if (str == null) {
            return;
        }
        m25478f(m25473d(str), 65536);
    }

    /* renamed from: f */
    void m25478f(File file, int i2) {
        this.f31081c = new C8243i(file, i2);
    }

    /* renamed from: g */
    public void m25479g(long j2, String str) {
        this.f31081c.mo25467e(j2, str);
    }

    public C8240f(C8298f c8298f, String str) {
        this(c8298f);
        m25477e(str);
    }
}
