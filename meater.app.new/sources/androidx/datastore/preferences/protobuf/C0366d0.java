package androidx.datastore.preferences.protobuf;

/* compiled from: LazyFieldLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.d0 */
/* loaded from: classes.dex */
public class C0366d0 {

    /* renamed from: a */
    private static final C0401p f2708a = C0401p.m3078b();

    /* renamed from: b */
    private AbstractC0377h f2709b;

    /* renamed from: c */
    private C0401p f2710c;

    /* renamed from: d */
    protected volatile InterfaceC0405q0 f2711d;

    /* renamed from: e */
    private volatile AbstractC0377h f2712e;

    /* renamed from: a */
    protected void m2595a(InterfaceC0405q0 interfaceC0405q0) {
        if (this.f2711d != null) {
            return;
        }
        synchronized (this) {
            if (this.f2711d != null) {
                return;
            }
            try {
                if (this.f2709b != null) {
                    this.f2711d = interfaceC0405q0.mo3155g().mo2574a(this.f2709b, this.f2710c);
                    this.f2712e = this.f2709b;
                } else {
                    this.f2711d = interfaceC0405q0;
                    this.f2712e = AbstractC0377h.f2734f;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f2711d = interfaceC0405q0;
                this.f2712e = AbstractC0377h.f2734f;
            }
        }
    }

    /* renamed from: b */
    public int m2596b() {
        if (this.f2712e != null) {
            return this.f2712e.size();
        }
        AbstractC0377h abstractC0377h = this.f2709b;
        if (abstractC0377h != null) {
            return abstractC0377h.size();
        }
        if (this.f2711d != null) {
            return this.f2711d.mo3153e();
        }
        return 0;
    }

    /* renamed from: c */
    public InterfaceC0405q0 m2597c(InterfaceC0405q0 interfaceC0405q0) {
        m2595a(interfaceC0405q0);
        return this.f2711d;
    }

    /* renamed from: d */
    public InterfaceC0405q0 m2598d(InterfaceC0405q0 interfaceC0405q0) {
        InterfaceC0405q0 interfaceC0405q02 = this.f2711d;
        this.f2709b = null;
        this.f2712e = null;
        this.f2711d = interfaceC0405q0;
        return interfaceC0405q02;
    }

    /* renamed from: e */
    public AbstractC0377h m2599e() {
        if (this.f2712e != null) {
            return this.f2712e;
        }
        AbstractC0377h abstractC0377h = this.f2709b;
        if (abstractC0377h != null) {
            return abstractC0377h;
        }
        synchronized (this) {
            if (this.f2712e != null) {
                return this.f2712e;
            }
            if (this.f2711d == null) {
                this.f2712e = AbstractC0377h.f2734f;
            } else {
                this.f2712e = this.f2711d.mo2544h();
            }
            return this.f2712e;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0366d0)) {
            return false;
        }
        C0366d0 c0366d0 = (C0366d0) obj;
        InterfaceC0405q0 interfaceC0405q0 = this.f2711d;
        InterfaceC0405q0 interfaceC0405q02 = c0366d0.f2711d;
        return (interfaceC0405q0 == null && interfaceC0405q02 == null) ? m2599e().equals(c0366d0.m2599e()) : (interfaceC0405q0 == null || interfaceC0405q02 == null) ? interfaceC0405q0 != null ? interfaceC0405q0.equals(c0366d0.m2597c(interfaceC0405q0.mo3201b())) : m2597c(interfaceC0405q02.mo3201b()).equals(interfaceC0405q02) : interfaceC0405q0.equals(interfaceC0405q02);
    }

    public int hashCode() {
        return 1;
    }
}
